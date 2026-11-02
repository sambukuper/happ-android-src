package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yx3 {
    public final Float a;
    public xx1 b;

    public yx3(Float f, xx1 xx1Var) {
        this.a = f;
        this.b = xx1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yx3)) {
            return false;
        }
        yx3 yx3Var = (yx3) obj;
        return yx3Var.a.equals(this.a) && dh3.f(yx3Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + oi0.e(0, this.a.hashCode() * 31, 31);
    }
}
