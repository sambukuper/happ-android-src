package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xz7 {
    public final lb8 a;
    public int b;
    public int c;

    public xz7(lb8 lb8Var, int i, int i2) {
        this.a = lb8Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz7)) {
            return false;
        }
        xz7 xz7Var = (xz7) obj;
        return this.a == xz7Var.a && this.b == xz7Var.b && this.c == xz7Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oi0.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        StringBuilder sb = new StringBuilder("SyntaxHighlightResult(tokenType=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(i);
        sb.append(", end=");
        return oi0.n(sb, i2, ")");
    }
}
