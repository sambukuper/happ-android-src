package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import androidx.work.multiprocess.RemoteWorkManagerClient;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.messaging.EnhancedIntentService;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.c2;
import io.sentry.android.core.e;
import io.sentry.android.core.internal.gestures.g;
import io.sentry.android.core.w1;
import io.sentry.b4;
import io.sentry.b7;
import io.sentry.c;
import io.sentry.g1;
import io.sentry.g4;
import io.sentry.i4;
import io.sentry.l4;
import io.sentry.protocol.w;
import io.sentry.s1;
import io.sentry.s6;
import io.sentry.v4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.dns.DnsQuery;
import okhttp3.internal.dns.Question;
import okhttp3.internal.dns.RealDnsCache;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jn0 implements ry0, gy7, fa5, p63, u87, DnsQuery.Factory, bd6, r51, ur6, sd0, uz7, i4, l4, w1, g4 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ jn0(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    @Override // defpackage.bd6
    public void K(Object obj, ed6 ed6Var) {
        fl5 fl5Var = (fl5) this.Y;
        String str = (String) this.Z;
        kp5 kp5Var = RemoteWorkManagerClient.j;
        ((p43) obj).k(str, w79.K(new yh5(fl5Var)), ed6Var);
    }

    @Override // io.sentry.g4
    public void a(b4 b4Var) {
        g1 g1Var = (g1) this.Y;
        s6 s6Var = (s6) this.Z;
        c cVar = (c) b4Var.e;
        if (cVar.f) {
            b4 b4VarS = g1Var.s();
            w wVarG = g1Var.g();
            cVar.d("sentry-trace_id", ((w) b4VarS.b).a());
            cVar.d("sentry-public_key", s6Var.retrieveParsedDsn().b);
            cVar.d("sentry-release", s6Var.getRelease());
            cVar.d("sentry-environment", s6Var.getEnvironment());
            if (!w.Y.equals(wVarG)) {
                cVar.d("sentry-replay_id", wVarG.a());
            }
            cVar.d("sentry-org_id", s6Var.getEffectiveOrgId());
            cVar.d("sentry-transaction", null);
            if (cVar.f) {
                cVar.c = null;
            }
            cVar.d("sentry-sampled", null);
            cVar.f = false;
        }
    }

    @Override // defpackage.ur6
    public Object apply(Object obj) {
        wr6 wr6Var = (wr6) this.Y;
        qz qzVar = (qz) this.Z;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ky kyVar = wr6Var.f0;
        ArrayList arrayListP = wr6Var.p(sQLiteDatabase, qzVar, kyVar.b);
        for (fu5 fu5Var : fu5.values()) {
            if (fu5Var != qzVar.c) {
                int size = kyVar.b - arrayListP.size();
                if (size <= 0) {
                    break;
                }
                lr lrVarA = qz.a();
                lrVarA.z(qzVar.a);
                if (fu5Var == null) {
                    b61.i("Null priority");
                    return null;
                }
                lrVarA.f0 = fu5Var;
                lrVarA.Z = qzVar.b;
                arrayListP.addAll(wr6Var.p(sQLiteDatabase, lrVarA.e(), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListP.size(); i++) {
            sb.append(((zy) arrayListP.get(i)).a);
            if (i < arrayListP.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new vr6(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListP.listIterator();
        while (listIterator.hasNext()) {
            zy zyVar = (zy) listIterator.next();
            long j2 = zyVar.a;
            if (map.containsKey(Long.valueOf(j2))) {
                fu6 fu6VarC = zyVar.c.c();
                for (vr6 vr6Var : (Set) map.get(Long.valueOf(j2))) {
                    fu6VarC.s(vr6Var.a, vr6Var.b);
                }
                listIterator.set(new zy(j2, zyVar.b, fu6VarC.v()));
            }
        }
        return arrayListP;
    }

    @Override // io.sentry.android.core.w1
    public void b() {
        Activity activity;
        c2 c2Var = (c2) this.Y;
        WeakReference weakReference = (WeakReference) this.Z;
        if (v4.b().i().getFeedbackOptions().i.p() || (activity = (Activity) weakReference.get()) == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        activity.runOnUiThread(new sc4((Object) c2Var, (Object) activity, (byte) 29));
    }

    @Override // defpackage.u87
    public boolean c() {
        vs5 vs5Var = (vs5) this.Y;
        yz yzVar = (yz) this.Z;
        boolean z = vs5Var.s0;
        if (z) {
            return z;
        }
        vs5Var.h();
        long jA = yz.a(vs5Var.q0, yzVar.a);
        yzVar.a = jA;
        boolean z2 = !vs5Var.f(vs5Var.p0, jA + yzVar.b);
        vs5Var.s0 = z2;
        return z2;
    }

    @Override // defpackage.ry0
    public Object d(y5 y5Var) {
        byte b = this.X;
        Object obj = this.Z;
        String str = (String) this.Y;
        switch (b) {
            case 1:
                cy0 cy0Var = (cy0) obj;
                try {
                    Trace.beginSection(str);
                    return cy0Var.f.d(y5Var);
                } finally {
                    Trace.endSection();
                }
            default:
                Context context = (Context) y5Var.a(Context.class);
                byte b2 = ((u52) obj).X;
                String strValueOf = _UrlKt.FRAGMENT_ENCODE_SET;
                switch (b2) {
                    case 5:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        }
                        break;
                    case 6:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                        }
                        break;
                    case 7:
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = "auto";
                        } else if (Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            strValueOf = "embedded";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            strValueOf = FirebaseCommonRegistrar.a(installerPackageName);
                        }
                        break;
                }
                return new ry(str, strValueOf);
        }
    }

    @Override // defpackage.gy7
    public void e(mz mzVar) {
        jg1 jg1Var = (jg1) this.Y;
        cp2 cp2Var = (((hy7) this.Z).c.a() && mzVar.d) ? cp2.Z : cp2.Y;
        ib5 ib5Var = jg1Var.a;
        fp2.d(ib5Var.a, true);
        fp2.c(ib5Var.c);
        if (ib5Var.l != cp2Var) {
            ib5Var.l = cp2Var;
            ib5Var.l(ib5Var.m);
        }
    }

    @Override // defpackage.uz7
    public Object execute() {
        byte b = this.X;
        Object obj = this.Z;
        jl1 jl1Var = (jl1) this.Y;
        switch (b) {
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                Iterable iterable = (Iterable) obj;
                wr6 wr6Var = (wr6) jl1Var.Z;
                wr6Var.getClass();
                if (iterable.iterator().hasNext()) {
                    wr6Var.g().compileStatement("DELETE FROM events WHERE _id in ".concat(wr6.D(iterable))).execute();
                }
                break;
            default:
                for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                    ((wr6) jl1Var.k0).u(((Integer) entry.getValue()).intValue(), bf4.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // io.sentry.i4
    public void f(s1 s1Var) {
        byte b = this.X;
        Object obj = this.Z;
        Object obj2 = this.Y;
        switch (b) {
            case 19:
                g1 g1Var = (g1) obj;
                if (s1Var == ((b7) obj2)) {
                    g1Var.m();
                }
                break;
            case 20:
                g1 g1Var2 = (g1) obj;
                if (s1Var == ((s1) obj2)) {
                    g1Var2.m();
                }
                break;
            default:
                g1 g1Var3 = (g1) obj;
                if (s1Var == ((g) obj2).e) {
                    g1Var3.m();
                }
                break;
        }
    }

    @Override // defpackage.r51
    public Object g(fb9 fb9Var) {
        xd6 xd6Var = (xd6) this.Y;
        String str = (String) this.Z;
        synchronized (xd6Var) {
            ((vt) xd6Var.Z).remove(str);
        }
        return fb9Var;
    }

    @Override // io.sentry.l4
    public void h(g1 g1Var) {
        byte b = this.X;
        Object obj = this.Z;
        Object obj2 = this.Y;
        switch (b) {
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                g1Var.D(new e((ActivityLifecycleIntegration) obj2, g1Var, (s1) obj));
                break;
            default:
                g1Var.D(new mf1(obj2, (Object) g1Var, obj, (byte) 11));
                break;
        }
    }

    @Override // defpackage.fa5
    public void i(fb9 fb9Var) {
        EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.Y;
        Intent intent = (Intent) this.Z;
        int i = EnhancedIntentService.h0;
        enhancedIntentService.a(intent);
    }

    @Override // defpackage.p63
    public void k(q63 q63Var) {
        byte b = this.X;
        Object obj = this.Z;
        Object obj2 = this.Y;
        switch (b) {
            case 6:
                ((p63) obj).k((y45) obj2);
                break;
            default:
                ((p63) obj).k((z76) obj2);
                break;
        }
    }

    @Override // okhttp3.internal.dns.DnsQuery.Factory
    public DnsQuery newQuery(Question question) {
        return RealDnsCache.wrap$lambda$0((RealDnsCache) this.Y, (DnsQuery.Factory) this.Z, question);
    }

    @Override // defpackage.sd0
    public Object t(qd0 qd0Var) {
        byte b = this.X;
        Object obj = this.Z;
        Object obj2 = this.Y;
        switch (b) {
            case 13:
                ((AtomicReference) obj).set(qd0Var);
                return "SurfaceRequest-surface-recreation(" + ((hy7) obj2).hashCode() + ")";
            case 14:
            default:
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                qd0Var.a(new yb4(atomicBoolean, (byte) 1), cp1.X);
                ((Executor) obj2).execute(new zb4(atomicBoolean, qd0Var, (dn2) obj, (byte) 1));
                return dn8.a;
            case 15:
                b98 b98Var = (b98) obj2;
                Surface surface = (Surface) obj;
                hi5.z0("TextureViewImpl");
                b98Var.h.a(surface, dp1.a(), new hp(qd0Var, (byte) 5));
                return "provideSurface[request=" + b98Var.h + " surface=" + surface + "]";
        }
    }
}
