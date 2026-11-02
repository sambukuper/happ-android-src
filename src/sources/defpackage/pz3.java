package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pz3 {
    public static final pz3 c = new pz3(null, null);
    public final rz3 a;
    public final mz3 b;

    public pz3(rz3 rz3Var, mz3 mz3Var) {
        this.a = rz3Var;
        this.b = mz3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz3)) {
            return false;
        }
        pz3 pz3Var = (pz3) obj;
        return this.a == pz3Var.a && dh3.f(this.b, pz3Var.b);
    }

    public final int hashCode() {
        rz3 rz3Var = this.a;
        int iHashCode = (rz3Var == null ? 0 : rz3Var.hashCode()) * 31;
        mz3 mz3Var = this.b;
        return iHashCode + (mz3Var != null ? mz3Var.hashCode() : 0);
    }

    public final String toString() {
        return "KmTypeProjection(variance=" + this.a + ", type=" + this.b + ')';
    }
}
