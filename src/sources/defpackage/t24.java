package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t24 implements vc6, v61 {
    public final s61 X;
    public final rn2 Y;
    public final m51 Z;
    public og7 f0;

    public t24(s61 s61Var, rn2 rn2Var) {
        this.X = s61Var;
        this.Y = rn2Var;
        this.Z = gv3.c(s61Var.B0(this));
    }

    @Override // defpackage.s61
    public final s61 B0(s61 s61Var) {
        return g33.K(this, s61Var);
    }

    @Override // defpackage.s61
    public final q61 H0(r61 r61Var) {
        return g33.t(this, r61Var);
    }

    @Override // defpackage.v61
    public final void J(s61 s61Var, Throwable th) throws Throwable {
        p01 p01Var = (p01) s61Var.H0(p01.Y);
        if (p01Var != null) {
            os4.U(th, new p5(p01Var, this, (byte) 18));
        }
        v61 v61Var = (v61) this.X.H0(oy1.p0);
        if (v61Var == null) {
            throw th;
        }
        v61Var.J(s61Var, th);
    }

    @Override // defpackage.s61
    public final Object U(rn2 rn2Var, Object obj) {
        return rn2Var.K(obj, this);
    }

    @Override // defpackage.vc6
    public final void a() {
        og7 og7Var = this.f0;
        if (og7Var != null) {
            og7Var.l(new a84());
        }
        this.f0 = null;
    }

    @Override // defpackage.s61
    public final s61 a0(r61 r61Var) {
        return g33.I(this, r61Var);
    }

    @Override // defpackage.vc6
    public final void b() {
        og7 og7Var = this.f0;
        if (og7Var != null) {
            og7Var.l(new a84());
        }
        this.f0 = null;
    }

    @Override // defpackage.vc6
    public final void c() {
        og7 og7Var = this.f0;
        if (og7Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            og7Var.m(cancellationException);
        }
        this.f0 = w51.G(this.Z, null, null, this.Y, 3);
    }

    @Override // defpackage.q61
    public final r61 getKey() {
        return oy1.p0;
    }
}
