package defpackage;

import su.happ.proxyutility.domain.sub.SubId;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class nv5 {
    public final String a;
    public final j2 b;
    public final c83 c;
    public final boolean d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nv5(String str, j2 j2Var, c83 c83Var, boolean z) {
        str.getClass();
        j2Var.getClass();
        c83Var.getClass();
        this.a = str;
        this.b = j2Var;
        this.c = c83Var;
        this.d = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static nv5 a(nv5 nv5Var, String str, j2 j2Var, km5 km5Var, int i) {
        if ((i & 1) != 0) {
            str = nv5Var.a;
        }
        if ((i & 4) != 0) {
            km5Var = nv5Var.c;
        }
        boolean z = (i & 8) != 0 ? nv5Var.d : false;
        nv5Var.getClass();
        str.getClass();
        j2Var.getClass();
        km5Var.getClass();
        return new nv5(str, j2Var, km5Var, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv5)) {
            return false;
        }
        nv5 nv5Var = (nv5) obj;
        return dh3.f(this.a, nv5Var.a) && dh3.f(this.b, nv5Var.b) && dh3.f(this.c, nv5Var.c) && this.d == nv5Var.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ProfileCopyState(subId=" + this.a + ", profiles=" + this.b + ", selectedProfiles=" + this.c + ", isLoading=" + this.d + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nv5() {
        this(SubId.c(), ec7.Y, km5.f0, true);
        SubId.Companion.getClass();
    }
}
