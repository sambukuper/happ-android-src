package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ig5 implements gg5 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ig5(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            uc3.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.gg5
    public final float a() {
        return this.d;
    }

    @Override // defpackage.gg5
    public final float b(z24 z24Var) {
        return z24Var == z24.X ? this.a : this.c;
    }

    @Override // defpackage.gg5
    public final float c(z24 z24Var) {
        return z24Var == z24.X ? this.c : this.a;
    }

    @Override // defpackage.gg5
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ig5)) {
            return false;
        }
        ig5 ig5Var = (ig5) obj;
        return kt1.b(this.a, ig5Var.a) && kt1.b(this.b, ig5Var.b) && kt1.b(this.c, ig5Var.c) && kt1.b(this.d, ig5Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + pc6.d(pc6.d(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        String strC = kt1.c(this.a);
        String strC2 = kt1.c(this.b);
        return oi0.q(oi0.t("PaddingValues(start=", strC, ", top=", strC2, ", end="), kt1.c(this.c), ", bottom=", kt1.c(this.d), ")");
    }
}
