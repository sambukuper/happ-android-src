package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i12 {
    public final d53 a;
    public final boolean b;
    public final ma1 c;
    public final String d;

    public i12(d53 d53Var, boolean z, ma1 ma1Var, String str) {
        this.a = d53Var;
        this.b = z;
        this.c = ma1Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i12)) {
            return false;
        }
        i12 i12Var = (i12) obj;
        return dh3.f(this.a, i12Var.a) && this.b == i12Var.b && this.c == i12Var.c && dh3.f(this.d, i12Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + pc6.f(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ExecuteResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ", diskCacheKey=" + this.d + ")";
    }
}
