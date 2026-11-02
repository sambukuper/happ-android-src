package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pe3 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public pe3(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe3)) {
            return false;
        }
        pe3 pe3Var = (pe3) obj;
        return this.a == pe3Var.a && this.b == pe3Var.b && this.c == pe3Var.c && this.d == pe3Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sbR = oi0.r(this.a, "InsetsValues(left=", this.b, ", top=", ", right=");
        sbR.append(this.c);
        sbR.append(", bottom=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
