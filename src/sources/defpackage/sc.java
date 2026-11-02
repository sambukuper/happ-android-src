package defpackage;

import android.app.job.JobParameters;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Process;
import android.os.StrictMode;
import android.util.LongSparseArray;
import android.util.Size;
import android.view.Surface;
import androidx.activity.ComponentActivity;
import androidx.work.impl.WorkDatabase;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sc implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ sc(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    private final void a() {
        zl0 zl0Var = (zl0) this.Y;
        qd0 qd0Var = (qd0) this.Z;
        t6 t6Var = zl0Var.g;
        if (!((AtomicBoolean) t6Var.m0).getAndSet(true)) {
            vh0 vh0Var = (vh0) t6Var.h0;
            vh0Var.getClass();
            vh0Var.f = false;
            synchronized (vh0Var.b) {
                vh0Var.c = null;
                vh0Var.e = false;
                vh0Var.d.clear();
            }
            bo5 bo5Var = (bo5) t6Var.i0;
            if (bo5Var.j0.compareAndSet(true, false)) {
                og7 og7Var = bo5Var.k0;
                if (og7Var != null) {
                    og7Var.m(null);
                }
                bo5Var.k0 = null;
            }
            if (((vz7) t6Var.Y).d()) {
                rj0 rj0Var = (rj0) ((vz7) t6Var.Y).getValue();
                synchronized (rj0Var.c) {
                    if (rj0Var.d) {
                        throw new IllegalStateException("Check failed.");
                    }
                    ((wj0) rj0Var.a.e.get()).b();
                    rj0Var.d = true;
                }
            }
        }
        if (zl0Var.f != null) {
            Executor executor = zl0Var.d;
            if (executor instanceof di0) {
                di0 di0Var = (di0) executor;
                synchronized (di0Var.X) {
                    try {
                        if (!di0Var.Y.isShutdown()) {
                            di0Var.Y.shutdown();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            zl0Var.f.quit();
        }
        qd0Var.b(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        xw3 xw3Var;
        byte b = 2;
        byte b2 = 0;
        byte b3 = 1;
        switch (this.X) {
            case 0:
                tc.d((vc) this.Y, (LongSparseArray) this.Z);
                return;
            case 1:
                ((p63) this.Z).k((o8) this.Y);
                return;
            case 2:
                lp lpVar = (lp) this.Y;
                try {
                    ((Runnable) this.Z).run();
                    return;
                } finally {
                    lpVar.a();
                }
            case 3:
                ((ol0) this.Y).a.onCaptureSequenceAborted((CameraCaptureSession) this.Z, -1);
                return;
            case 4:
                ck0 ck0Var = (ck0) this.Y;
                Set<wi0> set = (Set) this.Z;
                d6 d6Var = ck0Var.a;
                s08.b();
                synchronized (d6Var.Y) {
                    try {
                        for (wi0 wi0Var : set) {
                            Set setKeySet = ((HashMap) d6Var.k0).keySet();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : setKeySet) {
                                if (((wi0) obj).a.equals(wi0Var.a)) {
                                    arrayList.add(obj);
                                }
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((HashMap) d6Var.k0).remove((wi0) it.next());
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 5:
                ((cj0) this.Y).s().b().i((v85) this.Z);
                return;
            case 6:
                ((aj0) this.Y).b().f((bk0) this.Z);
                return;
            case 7:
                jk0 jk0Var = (jk0) this.Y;
                cj0 cj0Var = (cj0) this.Z;
                synchronized (jk0Var.a) {
                    try {
                        jk0Var.c.remove(cj0Var);
                        if (jk0Var.c.isEmpty()) {
                            jk0Var.e.getClass();
                            jk0Var.e.b(null);
                            jk0Var.e = null;
                            jk0Var.d = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 8:
                ((d41) this.Y).accept((ux) this.Z);
                return;
            case 9:
                a();
                return;
            case 10:
                x39 x39Var = (x39) this.Y;
                String string = ((UUID) this.Z).toString();
                string.getClass();
                pu.j(x39Var, string);
                return;
            case 11:
                WorkDatabase workDatabase = (WorkDatabase) this.Y;
                x39 x39Var2 = (x39) this.Z;
                Iterator it2 = ((List) u15.G(workDatabase.x().a, true, false, new ut8((byte) 17))).iterator();
                while (it2.hasNext()) {
                    pu.j(x39Var2, (String) it2.next());
                }
                Object obj2 = x39Var2.j0.g0;
                workDatabase.s().b(new fs5("last_cancel_all_time_ms", Long.valueOf(System.currentTimeMillis())));
                return;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                ((me6) this.Y).a0((ne6) this.Z);
                return;
            case 13:
                ComponentActivity componentActivity = (ComponentActivity) this.Y;
                z95 z95Var = (z95) this.Z;
                int i = ComponentActivity.x0;
                componentActivity.X.a(new fy0(z95Var, componentActivity, b2));
                return;
            case 14:
                nd5 nd5Var = (nd5) this.Y;
                w06 w06Var = (w06) this.Z;
                if (nd5Var.b != nd5.d) {
                    bt.i("provide() can be called only once.");
                    return;
                }
                synchronized (nd5Var) {
                    xw3Var = nd5Var.a;
                    nd5Var.a = null;
                    nd5Var.b = w06Var;
                    break;
                }
                xw3Var.getClass();
                return;
            case 15:
                q74 q74Var = (q74) this.Y;
                w06 w06Var2 = (w06) this.Z;
                synchronized (q74Var) {
                    try {
                        if (q74Var.b == null) {
                            q74Var.a.add(w06Var2);
                        } else {
                            q74Var.b.add(w06Var2.get());
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                List<p10> list = (List) this.Y;
                e31 e31Var = (e31) this.Z;
                for (p10 p10Var : list) {
                    Object obj3 = e31Var.e;
                    q10 q10Var = p10Var.a;
                    Object w31Var = q10Var.e(obj3) ? new w31(q10Var.d()) : v31.a;
                    kv5 kv5Var = p10Var.b;
                    kv5Var.getClass();
                    kv5Var.b(w31Var);
                }
                return;
            case 17:
                o81 o81Var = (o81) this.Y;
                Runnable runnable = (Runnable) this.Z;
                Process.setThreadPriority(o81Var.c);
                StrictMode.ThreadPolicy threadPolicy = o81Var.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 18:
                jg1 jg1Var = (jg1) this.Y;
                by7 by7Var = (by7) this.Z;
                Surface surfaceK = by7Var.k(jg1Var.c, new ml0(jg1Var, by7Var, b3));
                jg1Var.a.g(surfaceK);
                jg1Var.h.put(by7Var, surfaceK);
                return;
            case 19:
                final jg1 jg1Var2 = (jg1) this.Y;
                final hy7 hy7Var = (hy7) this.Z;
                jg1Var2.i++;
                ib5 ib5Var = jg1Var2.a;
                fp2.d(ib5Var.a, true);
                fp2.c(ib5Var.c);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(ib5Var.m);
                Size size = hy7Var.b;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                lv2 lv2Var = jg1Var2.c;
                hy7Var.b(lv2Var, new jn0(jg1Var2, hy7Var, b));
                hy7Var.a(surface, lv2Var, new d41() { // from class: hg1
                    @Override // defpackage.d41
                    public final void accept(Object obj4) {
                        jg1 jg1Var3 = jg1Var2;
                        hy7 hy7Var2 = hy7Var;
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        Surface surface2 = surface;
                        synchronized (hy7Var2.a) {
                            hy7Var2.m = null;
                            hy7Var2.n = null;
                        }
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface2.release();
                        jg1Var3.i--;
                        jg1Var3.d();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(jg1Var2, jg1Var2.d);
                return;
            case 20:
                Callable callable = (Callable) this.Y;
                xh1 xh1Var = (xh1) ((wl6) this.Z).Y;
                try {
                    xh1Var.j(callable.call());
                    return;
                } catch (Exception e) {
                    xh1Var.k(e);
                    return;
                }
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                final cx1 cx1Var = (cx1) this.Y;
                hy7 hy7Var2 = (hy7) this.Z;
                cx1Var.e++;
                ax1 ax1Var = cx1Var.a;
                boolean z = hy7Var2.e;
                Size size2 = hy7Var2.b;
                fp2.d(ax1Var.a, true);
                fp2.c(ax1Var.c);
                final SurfaceTexture surfaceTexture2 = new SurfaceTexture(z ? ax1Var.n : ax1Var.o);
                surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                final Surface surface2 = new Surface(surfaceTexture2);
                hy7Var2.a(surface2, cx1Var.c, new d41() { // from class: bx1
                    @Override // defpackage.d41
                    public final void accept(Object obj4) {
                        SurfaceTexture surfaceTexture3 = surfaceTexture2;
                        surfaceTexture3.setOnFrameAvailableListener(null);
                        surfaceTexture3.release();
                        surface2.release();
                        cx1 cx1Var2 = cx1Var;
                        cx1Var2.e--;
                        cx1Var2.d();
                    }
                });
                if (z) {
                    cx1Var.i = surfaceTexture2;
                    return;
                } else {
                    cx1Var.j = surfaceTexture2;
                    surfaceTexture2.setOnFrameAvailableListener(cx1Var, cx1Var.d);
                    return;
                }
            case 22:
                cx1 cx1Var2 = (cx1) this.Y;
                by7 by7Var2 = (by7) this.Z;
                Surface surfaceK2 = by7Var2.k(cx1Var2.c, new ml0(cx1Var2, by7Var2, b));
                cx1Var2.a.g(surfaceK2);
                cx1Var2.h.put(by7Var2, surfaceK2);
                return;
            case 23:
                ((u5) this.Y).a((Intent) this.Z);
                return;
            case 24:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.Y;
                z18 z18Var = (z18) this.Z;
                try {
                    z18Var.a(firebaseMessaging.a());
                    return;
                } catch (Exception e2) {
                    z18Var.a.k(e2);
                    return;
                }
            case 25:
                ((mm0) this.Y).F((hv2) this.Z);
                return;
            case 26:
                z76 z76Var = (z76) this.Y;
                z76 z76Var2 = (z76) this.Z;
                z76Var.f();
                if (z76Var2 != null) {
                    z76Var2.f();
                    return;
                }
                return;
            case 27:
                a63 a63Var = (a63) this.Y;
                z18 z18Var2 = (z18) this.Z;
                try {
                    z18Var2.a(a63Var.g());
                    return;
                } catch (Exception e3) {
                    z18Var2.a.k(e3);
                    return;
                }
            case _DnsMessageKt.TYPE_AAAA /* 28 */:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.Y;
                JobParameters jobParameters = (JobParameters) this.Z;
                int i2 = JobInfoSchedulerService.X;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            default:
                jf6 jf6Var = (jf6) this.Y;
                xy0 xy0Var = (xy0) this.Z;
                HashSet hashSet = new HashSet();
                if (jf6Var != null) {
                    hashSet.addAll(jf6Var.b);
                }
                ((bn0) xy0Var.i0).getClass();
                return;
        }
    }
}
