package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bq4 extends oy1 {
    public final float I0;

    public bq4(float f) {
        super((byte) 0);
        this.I0 = f - 0.001f;
    }

    @Override // defpackage.oy1
    public final void x(float f, float f2, float f3, l77 l77Var) {
        double d = this.I0;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(fSqrt, 2.0d));
        l77Var.d(f2 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2, 270.0f, 0.0f);
        l77Var.c(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        l77Var.c(f2 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2);
    }
}
