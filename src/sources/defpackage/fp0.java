package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fp0 {
    public final q8 a;
    public final gn2 b;
    public final ta2 c;
    public final boolean d;

    public fp0(q8 q8Var, gn2 gn2Var, ta2 ta2Var, boolean z) {
        this.a = q8Var;
        this.b = gn2Var;
        this.c = ta2Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp0)) {
            return false;
        }
        fp0 fp0Var = (fp0) obj;
        return dh3.f(this.a, fp0Var.a) && dh3.f(this.b, fp0Var.b) && dh3.f(this.c, fp0Var.c) && this.d == fp0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=" + this.d + ")";
    }
}
