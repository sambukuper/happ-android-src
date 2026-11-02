package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class si5 extends jj5 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public si5(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si5)) {
            return false;
        }
        si5 si5Var = (si5) obj;
        return Float.compare(this.c, si5Var.c) == 0 && Float.compare(this.d, si5Var.d) == 0 && Float.compare(this.e, si5Var.e) == 0 && Float.compare(this.f, si5Var.f) == 0 && Float.compare(this.g, si5Var.g) == 0 && Float.compare(this.h, si5Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + pc6.d(pc6.d(pc6.d(pc6.d(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sbK = ie2.k("CurveTo(x1=", this.c, ", y1=", this.d, ", x2=");
        sbK.append(this.e);
        sbK.append(", y2=");
        sbK.append(this.f);
        sbK.append(", x3=");
        sbK.append(this.g);
        sbK.append(", y3=");
        sbK.append(this.h);
        sbK.append(")");
        return sbK.toString();
    }
}
