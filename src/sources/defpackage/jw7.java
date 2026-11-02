package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jw7 implements c73 {
    public final d53 a;
    public final v63 b;
    public final ma1 c;
    public final ht4 d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public jw7(d53 d53Var, v63 v63Var, ma1 ma1Var, ht4 ht4Var, String str, boolean z, boolean z2) {
        this.a = d53Var;
        this.b = v63Var;
        this.c = ma1Var;
        this.d = ht4Var;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.c73
    public final d53 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw7)) {
            return false;
        }
        jw7 jw7Var = (jw7) obj;
        return dh3.f(this.a, jw7Var.a) && dh3.f(this.b, jw7Var.b) && this.c == jw7Var.c && dh3.f(this.d, jw7Var.d) && dh3.f(this.e, jw7Var.e) && this.f == jw7Var.f && this.g == jw7Var.g;
    }

    @Override // defpackage.c73
    public final v63 getRequest() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        ht4 ht4Var = this.d;
        int iHashCode2 = (iHashCode + (ht4Var == null ? 0 : ht4Var.hashCode())) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + pc6.f((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.a);
        sb.append(", request=");
        sb.append(this.b);
        sb.append(", dataSource=");
        sb.append(this.c);
        sb.append(", memoryCacheKey=");
        sb.append(this.d);
        sb.append(", diskCacheKey=");
        sb.append(this.e);
        sb.append(", isSampled=");
        sb.append(this.f);
        sb.append(", isPlaceholderCached=");
        return p61.o(sb, this.g, ")");
    }
}
