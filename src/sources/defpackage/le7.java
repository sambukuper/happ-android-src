package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class le7 implements u82 {
    public final d73 a;
    public final String b;
    public final ma1 c;

    public le7(d73 d73Var, String str, ma1 ma1Var) {
        this.a = d73Var;
        this.b = str;
        this.c = ma1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le7)) {
            return false;
        }
        le7 le7Var = (le7) obj;
        return dh3.f(this.a, le7Var.a) && dh3.f(this.b, le7Var.b) && this.c == le7Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.a + ", mimeType=" + this.b + ", dataSource=" + this.c + ")";
    }
}
