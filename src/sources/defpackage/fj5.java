package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fj5 extends jj5 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public fj5(float f, float f2, float f3, float f4) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj5)) {
            return false;
        }
        fj5 fj5Var = (fj5) obj;
        return Float.compare(this.c, fj5Var.c) == 0 && Float.compare(this.d, fj5Var.d) == 0 && Float.compare(this.e, fj5Var.e) == 0 && Float.compare(this.f, fj5Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + pc6.d(pc6.d(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sbK = ie2.k("RelativeReflectiveCurveTo(dx1=", this.c, ", dy1=", this.d, ", dx2=");
        sbK.append(this.e);
        sbK.append(", dy2=");
        sbK.append(this.f);
        sbK.append(")");
        return sbK.toString();
    }
}
