package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lf3 {
    public static final lf3 e = new lf3(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public lf3(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final long a() {
        return (((long) ((b() / 2) + this.b)) & 4294967295L) | (((long) ((d() / 2) + this.a)) << 32);
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        return (((long) this.a) << 32) | (((long) this.b) & 4294967295L);
    }

    public final int d() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf3)) {
            return false;
        }
        lf3 lf3Var = (lf3) obj;
        return this.a == lf3Var.a && this.b == lf3Var.b && this.c == lf3Var.c && this.d == lf3Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oi0.e(this.c, oi0.e(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = oi0.r(this.a, "IntRect.fromLTRB(", this.b, ", ", ", ");
        sbR.append(this.c);
        sbR.append(", ");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
