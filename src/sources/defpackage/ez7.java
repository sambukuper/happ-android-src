package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ez7 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ez7(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez7)) {
            return false;
        }
        ez7 ez7Var = (ez7) obj;
        return Float.compare(this.a, ez7Var.a) == 0 && Float.compare(this.b, ez7Var.b) == 0 && Float.compare(this.c, ez7Var.c) == 0 && Float.compare(this.d, ez7Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + pc6.d(pc6.d(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbK = ie2.k("ViewBox(left=", this.a, ", top=", this.b, ", right=");
        sbK.append(this.c);
        sbK.append(", bottom=");
        sbK.append(this.d);
        sbK.append(")");
        return sbK.toString();
    }
}
