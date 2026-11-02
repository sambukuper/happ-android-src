package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ql3 {
    public static final ql3 f = new ql3(null, false);
    public final h75 a;
    public final mz4 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ql3(h75 h75Var, mz4 mz4Var, boolean z, boolean z2, boolean z3) {
        this.a = h75Var;
        this.b = mz4Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql3)) {
            return false;
        }
        ql3 ql3Var = (ql3) obj;
        return this.a == ql3Var.a && this.b == ql3Var.b && this.c == ql3Var.c && this.d == ql3Var.d && this.e == ql3Var.e;
    }

    public final int hashCode() {
        h75 h75Var = this.a;
        int iHashCode = (h75Var == null ? 0 : h75Var.hashCode()) * 31;
        mz4 mz4Var = this.b;
        return Boolean.hashCode(this.e) + pc6.f(pc6.f((iHashCode + (mz4Var != null ? mz4Var.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "JavaTypeQualifiers(nullability=" + this.a + ", mutability=" + this.b + ", definitelyNotNull=" + this.c + ", isNullabilityQualifierForWarning=" + this.d + ", isMutabilityQualifierForWarning=" + this.e + ')';
    }

    public /* synthetic */ ql3(h75 h75Var, boolean z) {
        this(h75Var, null, z, false, false);
    }
}
