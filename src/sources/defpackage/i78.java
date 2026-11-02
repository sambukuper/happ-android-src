package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i78 {
    public static final i78 c = new i78(eu7.g(0), eu7.g(0));
    public final long a;
    public final long b;

    public i78(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i78)) {
            return false;
        }
        i78 i78Var = (i78) obj;
        return v88.a(this.a, i78Var.a) && v88.a(this.b, i78Var.b);
    }

    public final int hashCode() {
        w88[] w88VarArr = v88.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return pc6.q("TextIndent(firstLine=", v88.e(this.a), ", restLine=", v88.e(this.b), ")");
    }
}
