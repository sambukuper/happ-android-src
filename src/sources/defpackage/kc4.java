package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kc4 implements me6, dt2 {
    public final CopyOnWriteArrayList X = new CopyOnWriteArrayList();

    @Override // defpackage.me6
    public final void J(te6 te6Var, long j, de deVar) {
        d(te6Var.u0(), (ee) deVar.Z);
    }

    @Override // defpackage.me6
    public final void U(te6 te6Var, long j, ee eeVar) {
        te6Var.getClass();
        d(te6Var.u0(), eeVar);
    }

    @Override // defpackage.dt2
    public final void a() {
        Iterator it = this.X.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((uj6) it.next()).c();
        }
    }

    @Override // defpackage.dt2
    public final void b() {
        Iterator it = this.X.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((uj6) it.next()).c();
        }
    }

    @Override // defpackage.dt2
    public final void c() {
        Iterator it = this.X.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((uj6) it.next()).c();
        }
    }

    public final void d(long j, ee eeVar) {
        Integer num;
        Iterator it = this.X.iterator();
        it.getClass();
        while (it.hasNext()) {
            uj6 uj6Var = (uj6) it.next();
            uj6Var.getClass();
            eeVar.getClass();
            if (!uj6Var.f0.S() && !uj6Var.f0.isCancelled()) {
                synchronized (uj6Var) {
                    ue6 ue6Var = uj6Var.i0;
                    if (ue6Var != null && j >= ue6Var.a) {
                        CaptureResult.Key key = CaptureResult.SENSOR_TIMESTAMP;
                        key.getClass();
                        Long l = (Long) eeVar.X.get(key);
                        long frameNumber = eeVar.X.getFrameNumber();
                        if (l != null && uj6Var.h0 == null) {
                            uj6Var.h0 = l;
                        }
                        Long l2 = uj6Var.h0;
                        if (uj6Var.Z == null || l2 == null || l == null || l.longValue() - l2.longValue() <= uj6Var.Z.longValue()) {
                            if (uj6Var.g0 == null) {
                                uj6Var.g0 = new mm2(frameNumber);
                            }
                            mm2 mm2Var = uj6Var.g0;
                            if (mm2Var != null && (num = uj6Var.Y) != null && frameNumber - mm2Var.a > num.intValue()) {
                                uj6Var.f0.V(new tj6(1, eeVar));
                            } else if (((Boolean) uj6Var.X.B(eeVar)).booleanValue()) {
                                uj6Var.f0.V(new tj6(0, eeVar));
                            }
                        } else {
                            uj6Var.f0.V(new tj6(2, eeVar));
                        }
                    }
                }
            }
            this.X.remove(uj6Var);
        }
    }

    @Override // defpackage.me6
    public final void m(te6 te6Var) {
        te6Var.getClass();
        Iterator it = this.X.iterator();
        it.getClass();
        while (it.hasNext()) {
            uj6 uj6Var = (uj6) it.next();
            long jU0 = te6Var.u0();
            synchronized (uj6Var) {
                if (uj6Var.i0 == null) {
                    uj6Var.i0 = new ue6(jU0);
                }
            }
        }
    }
}
