package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bk3 {
    public final g39 a;
    public final Collection b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public bk3(g39 g39Var, Collection collection, int i) {
        this(g39Var, collection, g39Var.a == h75.Z, (i & 8) == 0, (i & 16) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk3)) {
            return false;
        }
        bk3 bk3Var = (bk3) obj;
        return dh3.f(this.a, bk3Var.a) && dh3.f(this.b, bk3Var.b) && this.c == bk3Var.c && this.d == bk3Var.d && this.e == bk3Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + pc6.f(pc6.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.a + ", qualifierApplicabilityTypes=" + this.b + ", definitelyNotNull=" + this.c + ", preferQualifierOverBound=" + this.d + ", preferQualifierOverSupertype=" + this.e + ')';
    }

    public bk3(g39 g39Var, Collection collection, boolean z, boolean z2, boolean z3) {
        collection.getClass();
        this.a = g39Var;
        this.b = collection;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }
}
