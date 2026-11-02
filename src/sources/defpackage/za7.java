package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class za7 extends jx4 implements g34 {
    public float q0;
    public float r0;
    public float s0;
    public float t0;
    public boolean u0;

    @Override // defpackage.g34
    public final int J0(ug3 ug3Var, tr4 tr4Var, int i) {
        long jY0 = Y0((zr4) ug3Var);
        if (q31.e(jY0)) {
            return q31.g(jY0);
        }
        if (!this.u0) {
            i = s31.g(i, jY0);
        }
        return s31.f(tr4Var.a(i), jY0);
    }

    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        long jA;
        long jY0 = Y0(zr4Var);
        if (this.u0) {
            jA = s31.e(j, jY0);
        } else {
            if (Float.isNaN(this.q0)) {
                iJ = q31.j(j);
                int iH2 = q31.h(jY0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = q31.j(jY0);
            }
            if (Float.isNaN(this.s0)) {
                iH = q31.h(j);
                int iJ2 = q31.j(jY0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = q31.h(jY0);
            }
            if (Float.isNaN(this.r0)) {
                i = q31.i(j);
                int iG2 = q31.g(jY0);
                if (i > iG2) {
                    i = iG2;
                }
            } else {
                i = q31.i(jY0);
            }
            if (Float.isNaN(this.t0)) {
                iG = q31.g(j);
                int i2 = q31.i(jY0);
                if (iG < i2) {
                    iG = i2;
                }
            } else {
                iG = q31.g(jY0);
            }
            jA = s31.a(iJ, iH, i, iG);
        }
        eo5 eo5VarO = tr4Var.o(jA);
        return zr4Var.g0(eo5VarO.X, eo5VarO.Y, e02.X, new d1(eo5VarO, (byte) 11));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    public final long Y0(zr4 zr4Var) {
        int iX0;
        int iX1;
        int iX2;
        int i = 0;
        if (Float.isNaN(this.s0)) {
            iX0 = Integer.MAX_VALUE;
        } else {
            iX0 = zr4Var.x0(this.s0);
            if (iX0 < 0) {
                iX0 = 0;
            }
        }
        if (Float.isNaN(this.t0)) {
            iX1 = Integer.MAX_VALUE;
        } else {
            iX1 = zr4Var.x0(this.t0);
            if (iX1 < 0) {
                iX1 = 0;
            }
        }
        if (Float.isNaN(this.q0)) {
            iX2 = 0;
        } else {
            iX2 = zr4Var.x0(this.q0);
            if (iX2 < 0) {
                iX2 = 0;
            }
            if (iX2 > iX0) {
                iX2 = iX0;
            }
            if (iX2 == Integer.MAX_VALUE) {
                iX2 = 0;
            }
        }
        if (!Float.isNaN(this.r0)) {
            int iX3 = zr4Var.x0(this.r0);
            if (iX3 < 0) {
                iX3 = 0;
            }
            if (iX3 > iX1) {
                iX3 = iX1;
            }
            if (iX3 != Integer.MAX_VALUE) {
                i = iX3;
            }
        }
        return s31.a(iX2, iX0, i, iX1);
    }

    @Override // defpackage.g34
    public final int i0(ug3 ug3Var, tr4 tr4Var, int i) {
        long jY0 = Y0((zr4) ug3Var);
        if (q31.f(jY0)) {
            return q31.h(jY0);
        }
        if (!this.u0) {
            i = s31.f(i, jY0);
        }
        return s31.g(tr4Var.m(i), jY0);
    }

    @Override // defpackage.g34
    public final int m0(ug3 ug3Var, tr4 tr4Var, int i) {
        long jY0 = Y0((zr4) ug3Var);
        if (q31.f(jY0)) {
            return q31.h(jY0);
        }
        if (!this.u0) {
            i = s31.f(i, jY0);
        }
        return s31.g(tr4Var.k(i), jY0);
    }

    @Override // defpackage.g34
    public final int y0(ug3 ug3Var, tr4 tr4Var, int i) {
        long jY0 = Y0((zr4) ug3Var);
        if (q31.e(jY0)) {
            return q31.g(jY0);
        }
        if (!this.u0) {
            i = s31.g(i, jY0);
        }
        return s31.f(tr4Var.K(i), jY0);
    }
}
