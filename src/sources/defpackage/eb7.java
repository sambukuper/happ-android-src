package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eb7 {
    public final gn2 a;
    public final ta2 b;

    public eb7(gn2 gn2Var, ta2 ta2Var) {
        this.a = gn2Var;
        this.b = ta2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb7)) {
            return false;
        }
        eb7 eb7Var = (eb7) obj;
        return dh3.f(this.a, eb7Var.a) && dh3.f(this.b, eb7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
