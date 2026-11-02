package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u63 {
    public final s61 a;
    public final s61 b;
    public final s61 c;
    public final ab7 d;
    public final pw6 e;
    public final tr5 f;

    public u63(s61 s61Var, s61 s61Var2, s61 s61Var3, ab7 ab7Var, pw6 pw6Var, tr5 tr5Var) {
        this.a = s61Var;
        this.b = s61Var2;
        this.c = s61Var3;
        this.d = ab7Var;
        this.e = pw6Var;
        this.f = tr5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u63)) {
            return false;
        }
        u63 u63Var = (u63) obj;
        return dh3.f(this.a, u63Var.a) && dh3.f(this.b, u63Var.b) && dh3.f(this.c, u63Var.c) && dh3.f(this.d, u63Var.d) && this.e == u63Var.e && this.f == u63Var.f;
    }

    public final int hashCode() {
        s61 s61Var = this.a;
        int iHashCode = (s61Var == null ? 0 : s61Var.hashCode()) * 31;
        s61 s61Var2 = this.b;
        int iHashCode2 = (iHashCode + (s61Var2 == null ? 0 : s61Var2.hashCode())) * 31;
        s61 s61Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (s61Var3 == null ? 0 : s61Var3.hashCode())) * 923521;
        ve7 ve7Var = ve7.o0;
        int iHashCode4 = (ve7Var.hashCode() + ((ve7Var.hashCode() + ((ve7Var.hashCode() + iHashCode3) * 31)) * 31)) * 31;
        ab7 ab7Var = this.d;
        int iHashCode5 = (iHashCode4 + (ab7Var == null ? 0 : ab7Var.hashCode())) * 31;
        pw6 pw6Var = this.e;
        int iHashCode6 = (iHashCode5 + (pw6Var == null ? 0 : pw6Var.hashCode())) * 31;
        tr5 tr5Var = this.f;
        return iHashCode6 + (tr5Var != null ? tr5Var.hashCode() : 0);
    }

    public final String toString() {
        ve7 ve7Var = ve7.o0;
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.a + ", fetcherCoroutineContext=" + this.b + ", decoderCoroutineContext=" + this.c + ", memoryCachePolicy=null, diskCachePolicy=null, networkCachePolicy=null, placeholderFactory=" + ve7Var + ", errorFactory=" + ve7Var + ", fallbackFactory=" + ve7Var + ", sizeResolver=" + this.d + ", scale=" + this.e + ", precision=" + this.f + ")";
    }
}
