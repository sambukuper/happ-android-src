package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import io.sentry.ILogger;
import io.sentry.a4;
import io.sentry.b7;
import io.sentry.s5;
import io.sentry.s6;
import io.sentry.v4;
import io.sentry.z3;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements io.sentry.t1 {
    public final Context X;
    public final ILogger Y;
    public final String Z;
    public final boolean f0;
    public final int g0;
    public final io.sentry.util.f h0;
    public final n0 i0;
    public final io.sentry.android.core.internal.util.t l0;
    public volatile a4 m0;
    public long o0;
    public long p0;
    public Date q0;
    public boolean j0 = false;
    public final AtomicBoolean k0 = new AtomicBoolean(false);
    public volatile u n0 = null;
    public final io.sentry.util.a r0 = new io.sentry.util.a();

    public w(Context context, n0 n0Var, io.sentry.android.core.internal.util.t tVar, ILogger iLogger, String str, boolean z, int i, io.sentry.util.f fVar) {
        Context applicationContext = context.getApplicationContext();
        this.X = applicationContext != null ? applicationContext : context;
        io.sentry.util.b.s(iLogger, "ILogger is required");
        this.Y = iLogger;
        this.l0 = tVar;
        io.sentry.util.b.s(n0Var, "The BuildInfoProvider is required.");
        this.i0 = n0Var;
        this.Z = str;
        this.f0 = z;
        this.g0 = i;
        this.h0 = fVar;
        this.q0 = new Date();
    }

    @Override // io.sentry.t1
    public final void a(io.sentry.s1 s1Var) {
        if (this.k0.get() && this.m0 == null) {
            io.sentry.util.a aVar = this.r0;
            aVar.g();
            try {
                if (this.k0.get() && this.m0 == null) {
                    this.m0 = new a4(s1Var, Long.valueOf(this.o0), Long.valueOf(this.p0));
                }
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // io.sentry.t1
    public final z3 b(b7 b7Var, List list, s6 s6Var) {
        return c(b7Var.e, b7Var.a.a(), b7Var.b.c.X.a(), false, list, s6Var);
    }

    public final z3 c(String str, String str2, String str3, boolean z, List list, s6 s6Var) {
        Long l;
        this.i0.getClass();
        int i = Build.VERSION.SDK_INT;
        if (this.n0 != null) {
            io.sentry.util.a aVar = this.r0;
            aVar.g();
            try {
                a4 a4Var = this.m0;
                if (a4Var == null || !a4Var.X.equals(str2)) {
                    this.Y.h(s5.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
                    aVar.close();
                    return null;
                }
                this.m0 = null;
                aVar.close();
                this.Y.h(s5.DEBUG, "Transaction %s (%s) finished.", str, str3);
                s sVarA = this.n0.a(list, false);
                this.k0.set(false);
                if (sVarA != null) {
                    long j = sVarA.a - this.o0;
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(a4Var);
                    long j2 = sVarA.a;
                    long j3 = this.o0;
                    long j4 = sVarA.b;
                    long j5 = this.p0;
                    if (a4Var.g0 == null) {
                        a4Var.g0 = Long.valueOf(j2 - j3);
                        a4Var.f0 = Long.valueOf(a4Var.f0.longValue() - j3);
                        a4Var.i0 = Long.valueOf(j4 - j5);
                        a4Var.h0 = Long.valueOf(a4Var.h0.longValue() - j5);
                    }
                    if (s6Var instanceof SentryAndroidOptions) {
                        l = ((SentryAndroidOptions) s6Var).getOrCreateDeviceInfoUtil(this.X).h;
                    } else {
                        l = null;
                    }
                    String string = l != null ? Long.toString(l.longValue()) : "0";
                    String[] strArr = Build.SUPPORTED_ABIS;
                    File file = sVarA.c;
                    Date date = this.q0;
                    String string2 = Long.toString(j);
                    this.i0.getClass();
                    String str4 = (strArr == null || strArr.length <= 0) ? _UrlKt.FRAGMENT_ENCODE_SET : strArr[0];
                    io.sentry.o0 o0Var = new io.sentry.o0((byte) 2);
                    this.i0.getClass();
                    String str5 = Build.MANUFACTURER;
                    this.i0.getClass();
                    String str6 = Build.MODEL;
                    this.i0.getClass();
                    return new z3(file, date, arrayList, str, str2, str3, string2, i, str4, o0Var, str5, str6, Build.VERSION.RELEASE, this.i0.b(), string, s6Var.getProguardUuid(), s6Var.getRelease(), s6Var.getEnvironment(), (sVarA.e || z) ? "timeout" : "normal", sVarA.d);
                }
            } catch (Throwable th) {
                try {
                    aVar.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        return null;
    }

    @Override // io.sentry.t1
    public final void close() {
        w wVar;
        a4 a4Var = this.m0;
        if (a4Var != null) {
            wVar = this;
            wVar.c(a4Var.Z, a4Var.X, a4Var.Y, true, null, v4.b().i());
        } else {
            wVar = this;
        }
        wVar.k0.set(false);
        if (wVar.n0 != null) {
            u uVar = wVar.n0;
            io.sentry.util.a aVar = uVar.o;
            aVar.g();
            try {
                Future future = uVar.d;
                if (future != null) {
                    future.cancel(true);
                    uVar.d = null;
                }
                if (uVar.n) {
                    uVar.a(null, true);
                }
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
    }

    @Override // io.sentry.t1
    public final boolean isRunning() {
        return this.k0.get();
    }

    @Override // io.sentry.t1
    public final void start() {
        t tVarC;
        this.i0.getClass();
        if (this.k0.getAndSet(true)) {
            return;
        }
        if (!this.j0) {
            this.j0 = true;
            if (this.f0) {
                String str = this.Z;
                if (str == null) {
                    this.Y.h(s5.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
                } else {
                    int i = this.g0;
                    if (i <= 0) {
                        this.Y.h(s5.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
                    } else {
                        this.n0 = new u(str, 1000000 / i, this.l0, this.h0, this.Y);
                    }
                }
            } else {
                this.Y.h(s5.INFO, "Profiling is disabled in options.", new Object[0]);
            }
        }
        if (this.n0 != null && (tVarC = this.n0.c()) != null) {
            this.o0 = tVarC.a;
            this.p0 = tVarC.b;
            this.q0 = (Date) tVarC.c;
            this.Y.h(s5.DEBUG, "Profiler started.", new Object[0]);
            return;
        }
        if (this.n0 != null && this.n0.n) {
            this.Y.h(s5.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
            return;
        }
        io.sentry.util.a aVar = this.r0;
        aVar.g();
        try {
            this.m0 = null;
            aVar.close();
            this.k0.set(false);
        } catch (Throwable th) {
            try {
                aVar.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
