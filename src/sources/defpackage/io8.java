package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class io8 extends jx4 implements g34 {
    public float q0;
    public float r0;

    @Override // defpackage.g34
    public final int J0(ug3 ug3Var, tr4 tr4Var, int i) {
        int iA = tr4Var.a(i);
        int iX0 = !Float.isNaN(this.r0) ? ug3Var.x0(this.r0) : 0;
        return iA < iX0 ? iX0 : iA;
    }

    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        int iJ;
        int i;
        if (Float.isNaN(this.q0) || q31.j(j) != 0) {
            iJ = q31.j(j);
        } else {
            int iX0 = zr4Var.x0(this.q0);
            iJ = q31.h(j);
            if (iX0 < 0) {
                iX0 = 0;
            }
            if (iX0 <= iJ) {
                iJ = iX0;
            }
        }
        int iH = q31.h(j);
        if (Float.isNaN(this.r0) || q31.i(j) != 0) {
            i = q31.i(j);
        } else {
            int iX1 = zr4Var.x0(this.r0);
            i = q31.g(j);
            int i2 = iX1 >= 0 ? iX1 : 0;
            if (i2 <= i) {
                i = i2;
            }
        }
        eo5 eo5VarO = tr4Var.o(s31.a(iJ, iH, i, q31.g(j)));
        return zr4Var.g0(eo5VarO.X, eo5VarO.Y, e02.X, new d1(eo5VarO, (byte) 19));
    }

    @Override // defpackage.g34
    public final int i0(ug3 ug3Var, tr4 tr4Var, int i) {
        int iM = tr4Var.m(i);
        int iX0 = !Float.isNaN(this.q0) ? ug3Var.x0(this.q0) : 0;
        return iM < iX0 ? iX0 : iM;
    }

    @Override // defpackage.g34
    public final int m0(ug3 ug3Var, tr4 tr4Var, int i) {
        int iK = tr4Var.k(i);
        int iX0 = !Float.isNaN(this.q0) ? ug3Var.x0(this.q0) : 0;
        return iK < iX0 ? iX0 : iK;
    }

    @Override // defpackage.g34
    public final int y0(ug3 ug3Var, tr4 tr4Var, int i) {
        int iK = tr4Var.K(i);
        int iX0 = !Float.isNaN(this.r0) ? ug3Var.x0(this.r0) : 0;
        return iK < iX0 ? iX0 : iK;
    }
}
