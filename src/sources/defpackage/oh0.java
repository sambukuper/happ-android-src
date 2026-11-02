package defpackage;

import android.hardware.camera2.CameraCharacteristics;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oh0 implements qh0 {
    public final qj0 b;
    public final pd2 c;
    public final uc8 d;
    public final dj4 e;
    public final t79 f;
    public final xe0 g;

    public oh0(qj0 qj0Var, x32 x32Var, pd2 pd2Var, dh2 dh2Var, tj7 tj7Var, uc8 uc8Var, dj4 dj4Var, r79 r79Var, t79 t79Var, xe0 xe0Var, lr8 lr8Var, pr8 pr8Var, nv8 nv8Var) {
        qj0Var.getClass();
        x32Var.getClass();
        pd2Var.getClass();
        dh2Var.getClass();
        tj7Var.getClass();
        uc8Var.getClass();
        dj4Var.getClass();
        r79Var.getClass();
        t79Var.getClass();
        xe0Var.getClass();
        lr8Var.getClass();
        pr8Var.getClass();
        nv8Var.getClass();
        this.b = qj0Var;
        this.c = pd2Var;
        this.d = uc8Var;
        this.e = dj4Var;
        this.f = t79Var;
        this.g = xe0Var;
    }

    @Override // defpackage.qh0
    public final void a() {
        this.f.a();
    }

    @Override // defpackage.qh0
    public final void b(b57 b57Var) {
        this.f.b(b57Var);
    }

    @Override // defpackage.qh0
    public final void c(l11 l11Var) {
        l11Var.getClass();
        xe0 xe0Var = this.g;
        fg0 fg0Var = new fg0((byte) 2);
        l11Var.g(new jn0(fg0Var, l11Var, (byte) 0));
        qd5 qd5VarC = qd5.c(fg0Var.Y);
        xe0Var.getClass();
        ye0 ye0Var = xe0Var.a;
        synchronized (ye0Var.X) {
            for (zx zxVar : qd5VarC.b()) {
                zxVar.getClass();
                ye0Var.Z.Y.l(zxVar, k11.X, qd5VarC.d(zxVar));
            }
        }
        ux0 ux0VarA = xe0Var.a.a(xe0Var.d, true);
        qd0 qd0Var = new qd0();
        qd0Var.c = new if6();
        ud0 ud0Var = new ud0(qd0Var);
        qd0Var.b = ud0Var;
        qd0Var.a = p61.class;
        try {
            ux0VarA.D(new p0(qd0Var, ux0VarA, (byte) 12));
            qd0Var.a = "addCaptureRequestOptions";
        } catch (Exception e) {
            ud0Var.b(e);
        }
        vr3.P(ud0Var);
    }

    @Override // defpackage.qh0
    public final void d(int i) {
        boolean z = true;
        this.c.c(i, true);
        if (i != 1 && i != 0) {
            z = false;
        }
        this.f.c(z);
    }

    @Override // defpackage.qh0
    public final void e(v53 v53Var) {
        this.c.getClass();
    }

    @Override // defpackage.qh0
    public final xb4 f(boolean z) {
        Integer num;
        ij0 ij0Var = jj0.h;
        jj0 jj0Var = this.b.b;
        ij0Var.getClass();
        jj0Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        key.getClass();
        int[] iArr = (int[]) ((lf0) jj0Var).c(key);
        if ((iArr == null ? false : eu.a0(iArr, 6)) && ((num = (Integer) this.e.f.d()) == null || num.intValue() != -1)) {
            hi5.i0("CXCP");
            return new u73(new IllegalStateException("Torch can not be enabled/disable when low-light boost is on!"), (byte) 1);
        }
        ux0 ux0VarA = uc8.a(this.d, z, 6);
        qd0 qd0Var = new qd0();
        qd0Var.c = new if6();
        ud0 ud0Var = new ud0(qd0Var);
        qd0Var.b = ud0Var;
        qd0Var.a = p61.class;
        try {
            ux0VarA.D(new p0(qd0Var, ux0VarA, (byte) 12));
            qd0Var.a = "Deferred.asListenableFuture";
        } catch (Exception e) {
            ud0Var.b(e);
        }
        return vr3.P(vr3.g0(yo2.b(ud0Var), new vk1(new b61((byte) 1), (byte) 13), dp1.a()));
    }

    @Override // defpackage.qh0
    public final l11 g() {
        wl6 wl6Var;
        ye0 ye0Var = this.g.a;
        synchronized (ye0Var.X) {
            gg0 gg0VarA = ye0Var.Z.a();
            fg0 fg0Var = new fg0((byte) 2);
            gg0VarA.g(new jn0(fg0Var, gg0VarA, (byte) 0));
            wl6Var = new wl6(qd5.c(fg0Var.Y), (byte) 18);
        }
        return wl6Var;
    }

    @Override // defpackage.qh0
    public final void h() {
        xe0 xe0Var = this.g;
        ye0 ye0Var = xe0Var.a;
        synchronized (ye0Var.X) {
            ye0Var.Z = new fg0((byte) 0);
        }
        ux0 ux0VarA = xe0Var.a.a(xe0Var.d, true);
        qd0 qd0Var = new qd0();
        qd0Var.c = new if6();
        ud0 ud0Var = new ud0(qd0Var);
        qd0Var.b = ud0Var;
        qd0Var.a = p61.class;
        try {
            ux0VarA.D(new p0(qd0Var, ux0VarA, (byte) 12));
            qd0Var.a = "clearCaptureRequestOptions";
        } catch (Exception e) {
            ud0Var.b(e);
        }
        vr3.P(ud0Var);
    }
}
