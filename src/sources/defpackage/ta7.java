package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ta7 {
    public static final ta7 c;
    public final yo1 a;
    public final yo1 b;

    static {
        xo1 xo1Var = xo1.a;
        c = new ta7(xo1Var, xo1Var);
    }

    public ta7(yo1 yo1Var, yo1 yo1Var2) {
        this.a = yo1Var;
        this.b = yo1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta7)) {
            return false;
        }
        ta7 ta7Var = (ta7) obj;
        return this.a.equals(ta7Var.a) && this.b.equals(ta7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
