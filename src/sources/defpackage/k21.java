package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k21 extends l21 {
    public final wk6 e;
    public final wk6 f;
    public final float[] g;

    public k21(wk6 wk6Var, wk6 wk6Var2) {
        float[] fArrB0;
        super(wk6Var2, wk6Var, wk6Var2, null);
        this.e = wk6Var;
        this.f = wk6Var2;
        float[] fArr = (float[]) wl6.g0.Y;
        h09 h09Var = wk6Var.d;
        float[] fArr2 = wk6Var.i;
        h09 h09Var2 = wk6Var2.d;
        float[] fArr3 = wk6Var2.j;
        if (zc1.s(h09Var, h09Var2)) {
            fArrB0 = zc1.b0(fArr3, fArr2);
        } else {
            float[] fArrA = h09Var.a();
            float[] fArrA2 = h09Var2.a();
            h09 h09Var3 = w45.f;
            fArrB0 = zc1.b0(zc1.s(h09Var2, h09Var3) ? fArr3 : zc1.S(zc1.b0(zc1.p(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), wk6Var2.i)), zc1.s(h09Var, h09Var3) ? fArr2 : zc1.b0(zc1.p(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrB0;
    }

    @Override // defpackage.l21
    public final long a(long j) {
        float fG = dw0.g(j);
        float f = dw0.f(j);
        float fD = dw0.d(j);
        float fC = dw0.c(j);
        sk6 sk6Var = this.e.p;
        float fA = (float) sk6Var.a(fG);
        float fA2 = (float) sk6Var.a(f);
        float fA3 = (float) sk6Var.a(fD);
        float[] fArr = this.g;
        float f2 = (fArr[6] * fA3) + (fArr[3] * fA2) + (fArr[0] * fA);
        float f3 = (fArr[7] * fA3) + (fArr[4] * fA2) + (fArr[1] * fA);
        float f4 = (fArr[8] * fA3) + (fArr[5] * fA2) + (fArr[2] * fA);
        wk6 wk6Var = this.f;
        sk6 sk6Var2 = wk6Var.m;
        return z51.c((float) sk6Var2.a(f2), (float) sk6Var2.a(f3), (float) sk6Var2.a(f4), fC, wk6Var);
    }
}
