package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nl3 {
    public final zi8 a;
    public final ol3 b;
    public final boolean c;
    public final boolean d;
    public final Set e;
    public final aa7 f;

    public /* synthetic */ nl3(zi8 zi8Var, boolean z, boolean z2, Set set, int i) {
        this(zi8Var, ol3.X, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, null);
    }

    public static nl3 a(nl3 nl3Var, ol3 ol3Var, boolean z, Set set, aa7 aa7Var, int i) {
        zi8 zi8Var = nl3Var.a;
        if ((i & 2) != 0) {
            ol3Var = nl3Var.b;
        }
        ol3 ol3Var2 = ol3Var;
        if ((i & 4) != 0) {
            z = nl3Var.c;
        }
        boolean z2 = z;
        boolean z3 = nl3Var.d;
        if ((i & 16) != 0) {
            set = nl3Var.e;
        }
        Set set2 = set;
        if ((i & 32) != 0) {
            aa7Var = nl3Var.f;
        }
        nl3Var.getClass();
        zi8Var.getClass();
        ol3Var2.getClass();
        return new nl3(zi8Var, ol3Var2, z2, z3, set2, aa7Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nl3)) {
            return false;
        }
        nl3 nl3Var = (nl3) obj;
        return dh3.f(nl3Var.f, this.f) && nl3Var.a == this.a && nl3Var.b == this.b && nl3Var.c == this.c && nl3Var.d == this.d;
    }

    public final int hashCode() {
        aa7 aa7Var = this.f;
        int iHashCode = aa7Var != null ? aa7Var.hashCode() : 0;
        int iHashCode2 = this.a.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.b.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i = (iHashCode3 * 31) + (this.c ? 1 : 0) + iHashCode3;
        return (i * 31) + (this.d ? 1 : 0) + i;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.a + ", flexibility=" + this.b + ", isRaw=" + this.c + ", isForAnnotationParameter=" + this.d + ", visitedTypeParameters=" + this.e + ", defaultType=" + this.f + ')';
    }

    public nl3(zi8 zi8Var, ol3 ol3Var, boolean z, boolean z2, Set set, aa7 aa7Var) {
        this.a = zi8Var;
        this.b = ol3Var;
        this.c = z;
        this.d = z2;
        this.e = set;
        this.f = aa7Var;
    }
}
