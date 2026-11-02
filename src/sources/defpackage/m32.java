package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m32 implements c73 {
    public final d53 a;
    public final v63 b;
    public final Throwable c;

    public m32(d53 d53Var, v63 v63Var, Throwable th) {
        this.a = d53Var;
        this.b = v63Var;
        this.c = th;
    }

    @Override // defpackage.c73
    public final d53 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m32)) {
            return false;
        }
        m32 m32Var = (m32) obj;
        return dh3.f(this.a, m32Var.a) && dh3.f(this.b, m32Var.b) && this.c.equals(m32Var.c);
    }

    @Override // defpackage.c73
    public final v63 getRequest() {
        return this.b;
    }

    public final int hashCode() {
        d53 d53Var = this.a;
        int iHashCode = d53Var == null ? 0 : d53Var.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.a + ", request=" + this.b + ", throwable=" + this.c + ")";
    }
}
