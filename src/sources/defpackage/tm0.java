package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tm0 {
    public fi1 a;
    public z24 b;
    public sm0 c;
    public long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm0)) {
            return false;
        }
        tm0 tm0Var = (tm0) obj;
        return dh3.f(this.a, tm0Var.a) && this.b == tm0Var.b && dh3.f(this.c, tm0Var.c) && ua7.a(this.d, tm0Var.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ua7.f(this.d) + ")";
    }
}
