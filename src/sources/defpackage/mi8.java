package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mi8 {
    public final hi8 a;
    public final nl3 b;

    public mi8(hi8 hi8Var, nl3 nl3Var) {
        hi8Var.getClass();
        nl3Var.getClass();
        this.a = hi8Var;
        this.b = nl3Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mi8)) {
            return false;
        }
        mi8 mi8Var = (mi8) obj;
        return dh3.f(mi8Var.a, this.a) && dh3.f(mi8Var.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        return this.b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.a + ", typeAttr=" + this.b + ')';
    }
}
