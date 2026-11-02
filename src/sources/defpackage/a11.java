package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a11 implements jt8 {
    public final gn2 a;

    public a11(gn2 gn2Var) {
        this.a = gn2Var;
    }

    @Override // defpackage.jt8
    public final Object a(kl5 kl5Var) {
        return this.a.B(kl5Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a11) && dh3.f(this.a, ((a11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ")";
    }
}
