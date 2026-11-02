package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w35 {
    public final int a;
    public final long b;
    public final long c;
    public final q35 d;
    public final pe7 e;
    public final Object f;

    public w35(int i, long j, long j2, q35 q35Var, pe7 pe7Var, Object obj) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = q35Var;
        this.e = pe7Var;
        this.f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w35)) {
            return false;
        }
        w35 w35Var = (w35) obj;
        return this.a == w35Var.a && this.b == w35Var.b && this.c == w35Var.c && dh3.f(this.d, w35Var.d) && dh3.f(this.e, w35Var.e) && dh3.f(this.f, w35Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.a.hashCode() + p61.g(p61.g(this.a * 31, this.b, 31), this.c, 31)) * 31;
        pe7 pe7Var = this.e;
        int iHashCode2 = (iHashCode + (pe7Var == null ? 0 : pe7Var.X.hashCode())) * 31;
        Object obj = this.f;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkResponse(code=" + this.a + ", requestMillis=" + this.b + ", responseMillis=" + this.c + ", headers=" + this.d + ", body=" + this.e + ", delegate=" + this.f + ")";
    }
}
