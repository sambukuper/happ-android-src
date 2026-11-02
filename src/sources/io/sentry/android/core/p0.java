package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Looper;
import defpackage.h70;
import defpackage.i82;
import defpackage.oi0;
import defpackage.rl6;
import io.sentry.ILogger;
import io.sentry.j5;
import io.sentry.s5;
import io.sentry.u6;
import io.sentry.x5;
import io.sentry.y4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements io.sentry.i0 {
    public final Context a;
    public final n0 b;
    public final SentryAndroidOptions c;
    public final Future d;

    public p0(Context context, n0 n0Var, SentryAndroidOptions sentryAndroidOptions) {
        Future futureSubmit;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = n0Var;
        this.c = sentryAndroidOptions;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new o0());
        try {
            futureSubmit = executorServiceNewSingleThreadExecutor.submit(new i82(this, sentryAndroidOptions, (byte) 6));
        } catch (RejectedExecutionException e) {
            sentryAndroidOptions.getLogger().e(s5.WARNING, "Device info caching task rejected.", e);
            futureSubmit = null;
        }
        this.d = futureSubmit;
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    @Override // io.sentry.i0
    public final u6 a(u6 u6Var, io.sentry.n0 n0Var) {
        boolean zF = f(u6Var, n0Var);
        if (zF) {
            d(u6Var, n0Var);
        }
        e(u6Var, false, zF);
        return u6Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    @Override // io.sentry.i0
    public final j5 b(j5 j5Var, io.sentry.n0 n0Var) {
        io.sentry.protocol.c0 c0Var;
        List list;
        boolean z;
        boolean zF = f(j5Var, n0Var);
        if (zF) {
            d(j5Var, n0Var);
            if (j5Var.e() != null) {
                boolean zL = io.sentry.util.b.l(n0Var);
                for (io.sentry.protocol.e0 e0Var : j5Var.e()) {
                    io.sentry.android.core.internal.util.f.a.getClass();
                    Long l = e0Var.X;
                    if (l == null) {
                        z = false;
                    } else if (io.sentry.android.core.internal.util.f.d(Looper.getMainLooper().getThread()) == l.longValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (e0Var.h0 == null) {
                        e0Var.h0 = Boolean.valueOf(z);
                    }
                    if (!zL && e0Var.j0 == null) {
                        e0Var.j0 = Boolean.valueOf(z);
                    }
                }
            }
        }
        e(j5Var, true, zF);
        ArrayList arrayListD = j5Var.d();
        if (arrayListD != null && arrayListD.size() > 1) {
            io.sentry.protocol.v vVar = (io.sentry.protocol.v) oi0.h(1, arrayListD);
            if ("java.lang".equals(vVar.Z) && (c0Var = vVar.g0) != null && (list = c0Var.X) != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(((io.sentry.protocol.a0) it.next()).h0)) {
                        Collections.reverse(arrayListD);
                        break;
                    }
                }
            }
        }
        return j5Var;
    }

    @Override // io.sentry.i0
    public final io.sentry.protocol.f0 c(io.sentry.protocol.f0 f0Var, io.sentry.n0 n0Var) {
        boolean zF = f(f0Var, n0Var);
        if (zF) {
            d(f0Var, n0Var);
        }
        e(f0Var, false, zF);
        return f0Var;
    }

    public final void d(y4 y4Var, io.sentry.n0 n0Var) {
        Boolean bool;
        io.sentry.protocol.a aVarE = y4Var.Y.e();
        if (aVarE == null) {
            aVarE = new io.sentry.protocol.a();
        }
        aVarE.g0 = (String) m0.c.a(this.a);
        io.sentry.android.core.performance.h hVarB = io.sentry.android.core.performance.g.c().b(this.c);
        r0 r0Var = null;
        if (hVarB.c()) {
            x5 x5VarB = hVarB.b();
            aVarE.Y = x5VarB == null ? null : new Date((long) (x5VarB.X / 1000000.0d));
        }
        if (!io.sentry.util.b.l(n0Var) && aVarE.m0 == null && (bool = g0.g0.f0) != null) {
            aVarE.m0 = Boolean.valueOf(!bool.booleanValue());
        }
        Context context = this.a;
        SentryAndroidOptions sentryAndroidOptions = this.c;
        ILogger logger = sentryAndroidOptions.getLogger();
        n0 n0Var2 = this.b;
        PackageInfo packageInfoC = m0.c(context, logger, n0Var2);
        if (packageInfoC != null) {
            String strE = m0.e(packageInfoC, n0Var2);
            if (y4Var.n0 == null) {
                y4Var.n0 = strE;
            }
            Future future = this.d;
            if (future != null) {
                try {
                    r0Var = (r0) future.get();
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().e(s5.ERROR, "Failed to retrieve device info", th);
                }
            } else {
                sentryAndroidOptions.getLogger().h(s5.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            aVarE.X = packageInfoC.packageName;
            aVarE.h0 = packageInfoC.versionName;
            aVarE.i0 = m0.e(packageInfoC, n0Var2);
            HashMap map = new HashMap();
            String[] strArr = packageInfoC.requestedPermissions;
            int[] iArr = packageInfoC.requestedPermissionsFlags;
            if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
                for (int i = 0; i < strArr.length; i++) {
                    String str = strArr[i];
                    map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i] & 2) == 2 ? "granted" : "not_granted");
                }
            }
            aVarE.j0 = map;
            if (r0Var != null) {
                try {
                    h70 h70Var = r0Var.f;
                    if (h70Var != null) {
                        aVarE.n0 = Boolean.valueOf(h70Var.Y);
                        String[] strArr2 = (String[]) h70Var.Z;
                        if (strArr2 != null) {
                            aVarE.o0 = Arrays.asList(strArr2);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        y4Var.Y.o(aVarE);
    }

    public final void e(y4 y4Var, boolean z, boolean z2) {
        io.sentry.protocol.i0 i0Var = y4Var.k0;
        if (i0Var == null) {
            i0Var = new io.sentry.protocol.i0();
            y4Var.k0 = i0Var;
        }
        if (i0Var.Y == null) {
            i0Var.Y = x0.a(this.a);
        }
        String str = i0Var.f0;
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (str == null && sentryAndroidOptions.getDataCollectionResolver().a()) {
            i0Var.f0 = "{{auto}}";
        }
        io.sentry.protocol.e eVar = y4Var.Y;
        io.sentry.protocol.h hVarF = eVar.f();
        Future future = this.d;
        if (hVarF == null) {
            if (future != null) {
                try {
                    eVar.q(((r0) future.get()).a(z, z2));
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().e(s5.ERROR, "Failed to retrieve device info", th);
                }
            } else {
                sentryAndroidOptions.getLogger().h(s5.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            io.sentry.protocol.q qVarH = eVar.h();
            if (future != null) {
                try {
                    eVar.t(((r0) future.get()).g);
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().e(s5.ERROR, "Failed to retrieve os system", th2);
                }
            } else {
                sentryAndroidOptions.getLogger().h(s5.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            if (qVarH != null) {
                String str2 = qVarH.X;
                eVar.l(qVarH, (str2 == null || str2.isEmpty()) ? "os_1" : "os_" + str2.trim().toLowerCase(Locale.ROOT));
            }
        }
        if (future == null) {
            sentryAndroidOptions.getLogger().h(s5.ERROR, "Failed to retrieve device info", new Object[0]);
            return;
        }
        try {
            rl6 rl6Var = ((r0) future.get()).e;
            if (rl6Var != null) {
                HashMap map = new HashMap();
                map.put("isSideLoaded", String.valueOf(rl6Var.a));
                String str3 = rl6Var.b;
                if (str3 != null) {
                    map.put("installerStore", str3);
                }
                for (Map.Entry entry : map.entrySet()) {
                    y4Var.b((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().e(s5.ERROR, "Error getting side loaded info.", th3);
        }
    }

    public final boolean f(y4 y4Var, io.sentry.n0 n0Var) {
        if (io.sentry.util.b.u(n0Var)) {
            return true;
        }
        this.c.getLogger().h(s5.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", y4Var.X);
        return false;
    }
}
