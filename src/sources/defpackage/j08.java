package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j08 {
    public final String a;
    public final int b;
    public final int c;

    public j08(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j08)) {
            return false;
        }
        j08 j08Var = (j08) obj;
        return dh3.f(this.a, j08Var.a) && this.b == j08Var.b && this.c == j08Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oi0.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return oi0.n(sb, this.c, ")");
    }
}
