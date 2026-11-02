package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zi5 extends jj5 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public zi5(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi5)) {
            return false;
        }
        zi5 zi5Var = (zi5) obj;
        return Float.compare(this.c, zi5Var.c) == 0 && Float.compare(this.d, zi5Var.d) == 0 && Float.compare(this.e, zi5Var.e) == 0 && this.f == zi5Var.f && this.g == zi5Var.g && Float.compare(this.h, zi5Var.h) == 0 && Float.compare(this.i, zi5Var.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + pc6.d(pc6.f(pc6.f(pc6.d(pc6.d(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31), 31, this.f), 31, this.g), this.h, 31);
    }

    public final String toString() {
        StringBuilder sbK = ie2.k("RelativeArcTo(horizontalEllipseRadius=", this.c, ", verticalEllipseRadius=", this.d, ", theta=");
        sbK.append(this.e);
        sbK.append(", isMoreThanHalf=");
        sbK.append(this.f);
        sbK.append(", isPositiveArc=");
        sbK.append(this.g);
        sbK.append(", arcStartDx=");
        sbK.append(this.h);
        sbK.append(", arcStartDy=");
        sbK.append(this.i);
        sbK.append(")");
        return sbK.toString();
    }
}
