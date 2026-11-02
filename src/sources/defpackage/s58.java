package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s58 {
    public static final s18 g = new s18((byte) 1);
    public final zr4 a;
    public final z24 b;
    public final fi2 c;
    public final long d;
    public final float e;
    public final float f;

    public s58(zr4 zr4Var, z24 z24Var, fi2 fi2Var, long j) {
        this.a = zr4Var;
        this.b = z24Var;
        this.c = fi2Var;
        this.d = j;
        this.e = zr4Var.getDensity();
        this.f = zr4Var.b0();
    }

    public final String toString() {
        return "MeasureInputs(density=" + this.a + ", densityValue=" + this.e + ", fontScale=" + this.f + ", layoutDirection=" + this.b + ", fontFamilyResolver=" + this.c + ", constraints=" + q31.l(this.d) + ")";
    }
}
