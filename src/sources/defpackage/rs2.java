package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rs2 implements Handler.Callback {
    public static final Status o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status p = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object q = new Object();
    public static rs2 r;
    public long a;
    public boolean b;
    public i28 c;
    public h99 d;
    public final Context e;
    public final ns2 f;
    public final rb8 g;
    public final AtomicInteger h;
    public final AtomicInteger i;
    public final ConcurrentHashMap j;
    public final bu k;
    public final bu l;
    public final f99 m;
    public volatile boolean n;

    public rs2(Context context, Looper looper) {
        ns2 ns2Var = ns2.d;
        this.a = 10000L;
        this.b = false;
        this.h = new AtomicInteger(1);
        this.i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.k = new bu(0);
        this.l = new bu(0);
        this.n = true;
        this.e = context;
        f99 f99Var = new f99(looper, this);
        Looper.getMainLooper();
        this.m = f99Var;
        this.f = ns2Var;
        this.g = new rb8((byte) 10);
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = jm4.l0;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(zc1.T() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
            jm4.l0 = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            this.n = false;
        }
        f99Var.sendMessage(f99Var.obtainMessage(6));
    }

    public static Status b(qn qnVar, x11 x11Var) {
        String str = (String) qnVar.b.Z;
        String strValueOf = String.valueOf(x11Var);
        return new Status(17, oi0.q(new StringBuilder(str.length() + 63 + strValueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", strValueOf), x11Var.Z, x11Var);
    }

    public static rs2 c(Context context) {
        rs2 rs2Var;
        HandlerThread handlerThread;
        synchronized (q) {
            rs2Var = r;
            if (rs2Var == null) {
                synchronized (ya9.g) {
                    try {
                        handlerThread = ya9.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            ya9.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = ya9.i;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = ns2.c;
                rs2 rs2Var2 = new rs2(applicationContext, looper);
                r = rs2Var2;
                rs2Var = rs2Var2;
            }
        }
        return rs2Var;
    }

    public final i89 a(ms2 ms2Var) {
        qn qnVar = ms2Var.f;
        ConcurrentHashMap concurrentHashMap = this.j;
        i89 i89Var = (i89) concurrentHashMap.get(qnVar);
        if (i89Var == null) {
            i89Var = new i89(this, ms2Var);
            concurrentHashMap.put(qnVar, i89Var);
        }
        if (i89Var.h.n()) {
            this.l.add(qnVar);
        }
        i89Var.q();
        return i89Var;
    }

    public final boolean d() {
        int i;
        if (this.b) {
            return false;
        }
        xl6 xl6Var = (xl6) wl6.P().Y;
        if (xl6Var != null && !xl6Var.Y) {
            return false;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.g.Y;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(203400000, -1);
        }
        return i == -1 || i == 0;
    }

    public final boolean e(x11 x11Var, int i) {
        ns2 ns2Var = this.f;
        ns2Var.getClass();
        Context context = this.e;
        if (!ue3.A(context)) {
            int i2 = x11Var.Y;
            PendingIntent activity = x11Var.Z;
            if (!((i2 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentA = ns2Var.a(i2, context, null);
                if (intentA != null) {
                    activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
                }
            }
            if (activity != null) {
                int i3 = GoogleApiActivity.Y;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                ns2Var.f(context, i2, PendingIntent.getActivity(context, 0, intent, d99.a | 134217728));
                Integer num = x11Var.g0;
                e89 e89Var = new e89(num == null ? -1 : num.intValue(), context.getPackageName(), System.currentTimeMillis(), x11Var.Y, false);
                h99 h99Var = ns2Var.b;
                if (h99Var == null) {
                    h99Var = new h99(context, h99.j, bn.a, ls2.b);
                    ns2Var.b = h99Var;
                }
                y18 y18Var = new y18();
                y18Var.c = (char) 0;
                y18Var.a = new k82[]{ch3.g};
                y18Var.b = false;
                y18Var.d = new q09(e89Var);
                h99Var.b(2, y18Var.a());
                return true;
            }
        }
        return false;
    }

    public final void f(x11 x11Var, int i) {
        if (e(x11Var, i)) {
            return;
        }
        f99 f99Var = this.m;
        f99Var.sendMessage(f99Var.obtainMessage(5, i, 0, x11Var));
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0371  */
    /* JADX WARN: Code duplicated, block: B:158:0x0374  */
    /* JADX WARN: Code duplicated, block: B:171:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:173:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:175:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:177:0x03e9  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v11 i89, still in use, count: 2, list:
          (r4v11 i89) from 0x0399: IGET (r4v11 i89) A[WRAPPED] (LINE:922) i89.m int
          (r4v11 i89) from 0x039f: PHI (r4 I:??) = (r4v8 i89), (r4v11 i89) binds: [B:169:0x039e, B:225:0x039f] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r18) {
        /*
            Method dump skipped, instruction units count: 1238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs2.handleMessage(android.os.Message):boolean");
    }
}
