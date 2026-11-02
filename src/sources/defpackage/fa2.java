package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fa2 extends jx4 implements g34 {
    public fp1 q0;
    public float r0;

    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        int iJ;
        int iH;
        int iG;
        int i;
        if (!q31.d(j) || this.q0 == fp1.X) {
            iJ = q31.j(j);
            iH = q31.h(j);
        } else {
            int iRound = Math.round(q31.h(j) * this.r0);
            int iJ2 = q31.j(j);
            iJ = q31.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!q31.c(j) || this.q0 == fp1.Y) {
            int i2 = q31.i(j);
            int iG2 = q31.g(j);
            iG = i2;
            i = iG2;
        } else {
            int iRound2 = Math.round(q31.g(j) * this.r0);
            int i3 = q31.i(j);
            iG = q31.g(j);
            if (iRound2 < i3) {
                iRound2 = i3;
            }
            if (iRound2 <= iG) {
                iG = iRound2;
            }
            i = iG;
        }
        eo5 eo5VarO = tr4Var.o(s31.a(iJ, iH, iG, i));
        return zr4Var.g0(eo5VarO.X, eo5VarO.Y, e02.X, new d1(eo5VarO, (byte) 4));
    }
}
