package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b63 implements u82 {
    public final d53 a;
    public final boolean b;
    public final ma1 c;

    public b63(d53 d53Var, boolean z, ma1 ma1Var) {
        this.a = d53Var;
        this.b = z;
        this.c = ma1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b63)) {
            return false;
        }
        b63 b63Var = (b63) obj;
        return this.a.equals(b63Var.a) && this.b == b63Var.b && this.c == b63Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + pc6.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ")";
    }
}
