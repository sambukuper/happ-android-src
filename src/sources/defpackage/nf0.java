package defpackage;

import android.hardware.camera2.CameraManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nf0 implements AutoCloseable {
    public final s98 X;
    public final String Y;
    public final CameraManager Z;
    public final m51 f0;
    public final pv g0;
    public final oh7 h0;
    public final h76 i0;
    public final u77 j0;
    public final f76 k0;
    public final pd0 l0;
    public final og7 m0;

    public nf0(v06 v06Var, s98 s98Var, String str, bm3 bm3Var) {
        v06Var.getClass();
        str.getClass();
        this.X = s98Var;
        this.Y = str;
        this.Z = (CameraManager) v06Var.get();
        m51 m51VarC = gv3.c(g33.K(new ow7(bm3Var), g33.K(s98Var.h, new x61("CXCP-CameraStatusMonitor"))));
        this.f0 = m51VarC;
        this.g0 = nr4.e(false);
        oh7 oh7VarA = ph7.a(cl0.a);
        this.h0 = oh7VarA;
        this.i0 = jm4.n(oh7VarA);
        q51 q51Var = null;
        u77 u77VarB = v77.b(0, 7, null);
        this.j0 = u77VarB;
        this.k0 = jm4.m(u77VarB);
        this.l0 = w51.n(new q0((Object) this, q51Var, (byte) 10));
        this.m0 = w51.G(m51VarC, null, null, new r5((Object) this, q51Var, (byte) 3), 3);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.g0.a()) {
            this.m0.m(null);
            gv3.i(this.f0, null);
        }
    }
}
