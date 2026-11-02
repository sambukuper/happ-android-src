package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qw6 {
    public final float a;
    public final long b;
    public final ta2 c;

    public qw6(float f, long j, ta2 ta2Var) {
        this.a = f;
        this.b = j;
        this.c = ta2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw6)) {
            return false;
        }
        qw6 qw6Var = (qw6) obj;
        return Float.compare(this.a, qw6Var.a) == 0 && gd8.a(this.b, qw6Var.b) && dh3.f(this.c, qw6Var.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        int i = gd8.c;
        return this.c.hashCode() + p61.g(iHashCode, this.b, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + gd8.b(this.b) + ", animationSpec=" + this.c + ")";
    }
}
