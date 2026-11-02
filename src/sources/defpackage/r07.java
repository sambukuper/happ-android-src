package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r07 {
    public final f09 a;
    public final f09 b;

    public r07(f09 f09Var, f09 f09Var2) {
        this.a = f09Var;
        this.b = f09Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r07)) {
            return false;
        }
        r07 r07Var = (r07) obj;
        return this.a == r07Var.a && this.b == r07Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.a + ", endAffinity=" + this.b + ")";
    }
}
