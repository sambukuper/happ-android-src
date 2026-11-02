package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ha2 implements de3 {
    public final rr4 X;

    public ha2(rr4 rr4Var) {
        this.X = rr4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ha2.class == obj.getClass() && this.X.equals(((ha2) obj).X);
    }

    @Override // defpackage.de3
    public final void h(f17 f17Var) {
        this.X.h(f17Var);
    }

    public final int hashCode() {
        return oi0.e(this.X.X, oy1.C0.hashCode() * 31, 32);
    }

    @Override // defpackage.de3
    public final void i(g48 g48Var) {
        this.X.i(g48Var);
    }

    @Override // defpackage.de3
    public final wx3 n() {
        return null;
    }

    public final String toString() {
        return oy1.C0 + ".then(" + this.X + ")";
    }
}
