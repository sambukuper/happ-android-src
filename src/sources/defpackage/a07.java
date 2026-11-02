package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a07 {
    public final lf6 a;
    public final int b;
    public final long c;

    public a07(lf6 lf6Var, int i, long j) {
        this.a = lf6Var;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a07)) {
            return false;
        }
        a07 a07Var = (a07) obj;
        return this.a == a07Var.a && this.b == a07Var.b && this.c == a07Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + oi0.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
        sb.append(this.a);
        sb.append(", offset=");
        sb.append(this.b);
        sb.append(", selectableId=");
        return ie2.g(this.c, ")", sb);
    }
}
