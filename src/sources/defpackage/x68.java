package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x68 extends jx4 implements s01, g34 {
    public final o88 q0;
    public rj8 r0;
    public v68 s0;

    public x68(o88 o88Var) {
        this.q0 = o88Var;
    }

    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) throws IOException {
        v68 v68Var = this.s0;
        if (v68Var == null) {
            throw ie2.d("Min size state is not set.");
        }
        rh5 rh5Var = v68Var.f;
        rj8 rj8Var = this.r0;
        if (rj8Var == null) {
            throw ie2.d("Font resolution state is not set.");
        }
        Object obj = rj8Var.X;
        if (!dh3.f(obj, v68Var.e)) {
            v68Var.e = obj;
            rh5Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) rh5Var.getValue()).booleanValue()) {
            ff ffVarA = c58.a(v68Var.d, v68Var.b, v68Var.c, 1, false);
            v68Var.g = (((long) z38.a(ffVarA.a.h())) << 32) | (((long) z38.a(ffVarA.f)) & 4294967295L);
            rh5Var.setValue(Boolean.FALSE);
        }
        long j2 = v68Var.g;
        eo5 eo5VarO = tr4Var.o(s31.e(j, s31.b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return zr4Var.g0(eo5VarO.X, eo5VarO.Y, e02.X, new d1(eo5VarO, (byte) 15));
    }

    @Override // defpackage.jx4
    public final boolean N0() {
        return false;
    }

    @Override // defpackage.jx4
    public final void Q0() {
        o88 o88VarD = xt7.d(this.q0, yn0.Z(this).B0);
        fi2 fi2Var = (fi2) hi5.W(this, y01.k);
        Y0(o88VarD, fi2Var);
        z24 z24Var = yn0.Z(this).B0;
        fi1 fi1Var = yn0.Z(this).A0;
        rj8 rj8Var = this.r0;
        if (rj8Var == null) {
            throw ie2.d("Font resolution state is not set.");
        }
        this.s0 = new v68(z24Var, fi1Var, fi2Var, o88VarD, rj8Var.X);
    }

    @Override // defpackage.jx4
    public final void R0() {
        this.r0 = null;
        this.s0 = null;
    }

    @Override // defpackage.nh1
    public final void V() {
        v68 v68Var = this.s0;
        if (v68Var != null) {
            v68.a(v68Var, yn0.Z(this).B0, null, null, 30);
        }
        nr4.E(this);
    }

    public final void Y0(o88 o88Var, fi2 fi2Var) {
        qe7 qe7Var = o88Var.a;
        gi2 gi2Var = qe7Var.f;
        dj2 dj2Var = qe7Var.c;
        if (dj2Var == null) {
            dj2Var = dj2.g0;
        }
        bj2 bj2Var = qe7Var.d;
        int i = bj2Var != null ? bj2Var.a : 0;
        cj2 cj2Var = qe7Var.e;
        this.r0 = ((hi2) fi2Var).b(gi2Var, dj2Var, i, cj2Var != null ? cj2Var.a : 65535);
        nr4.E(this);
    }

    @Override // defpackage.nh1, defpackage.kq5
    public final void c() {
        v68 v68Var = this.s0;
        if (v68Var != null) {
            v68.a(v68Var, null, yn0.Z(this).A0, null, 29);
        }
        nr4.E(this);
    }
}
