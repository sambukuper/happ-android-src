package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class l21 {
    public final lw0 a;
    public final lw0 b;
    public final lw0 c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public l21(lw0 lw0Var, lw0 lw0Var2, int i) {
        lw0 lw0VarJ = z91.B(lw0Var.b, 12884901888L) ? zc1.j(lw0Var) : lw0Var;
        lw0 lw0VarJ2 = z91.B(lw0Var2.b, 12884901888L) ? zc1.j(lw0Var2) : lw0Var2;
        float[] fArrA = w45.i;
        float[] fArr = null;
        if (i == 3) {
            boolean zB = z91.B(lw0Var.b, 12884901888L);
            boolean zB2 = z91.B(lw0Var2.b, 12884901888L);
            if ((!zB || !zB2) && (zB || zB2)) {
                h09 h09Var = ((wk6) (zB ? lw0Var : lw0Var2)).d;
                float[] fArrA2 = zB ? h09Var.a() : fArrA;
                fArrA = zB2 ? h09Var.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            }
        }
        this(lw0Var2, lw0VarJ, lw0VarJ2, fArr);
    }

    public long a(long j) {
        float fG = dw0.g(j);
        float f = dw0.f(j);
        float fD = dw0.d(j);
        float fC = dw0.c(j);
        lw0 lw0Var = this.b;
        long jD = lw0Var.d(fG, f, fD);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE = lw0Var.e(fG, f, fD);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE *= fArr[2];
        }
        float f2 = fIntBitsToFloat;
        float f3 = fIntBitsToFloat2;
        return this.c.f(f2, f3, fE, fC, this.a);
    }

    public l21(lw0 lw0Var, lw0 lw0Var2, lw0 lw0Var3, float[] fArr) {
        this.a = lw0Var;
        this.b = lw0Var2;
        this.c = lw0Var3;
        this.d = fArr;
    }
}
