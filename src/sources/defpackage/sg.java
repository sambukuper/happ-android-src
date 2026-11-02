package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sg {
    public x67 a;
    public long b;
    public z24 c;
    public float d;
    public s67 e;

    public sg(x67 x67Var, long j, z24 z24Var, float f, s67 s67Var) {
        this.a = x67Var;
        this.b = j;
        this.c = z24Var;
        this.d = f;
        this.e = s67Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg)) {
            return false;
        }
        sg sgVar = (sg) obj;
        return dh3.f(this.a, sgVar.a) && ua7.a(this.b, sgVar.b) && this.c == sgVar.c && Float.compare(this.d, sgVar.d) == 0 && dh3.f(this.e, sgVar.e);
    }

    public final int hashCode() {
        int iD = pc6.d((this.c.hashCode() + p61.g(this.a.hashCode() * 31, this.b, 31)) * 31, this.d, 31);
        s67 s67Var = this.e;
        return iD + (s67Var == null ? 0 : s67Var.hashCode());
    }

    public final String toString() {
        return "ShadowKey(shape=" + this.a + ", size=" + ua7.f(this.b) + ", layoutDirection=" + this.c + ", density=" + this.d + ", shadow=" + this.e + ")";
    }
}
