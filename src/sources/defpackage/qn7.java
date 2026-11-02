package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class qn7 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final b83 f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final aw5 o;
    public final boolean p;
    public final boolean q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qn7(String str, String str2, boolean z, boolean z2, boolean z3, b83 b83Var, String str3, boolean z4, boolean z5, String str4, String str5, boolean z6, boolean z7, boolean z8, aw5 aw5Var) {
        str.getClass();
        aw5Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = b83Var;
        this.g = str3;
        this.h = z4;
        this.i = z5;
        this.j = str4;
        this.k = str5;
        this.l = z6;
        this.m = z7;
        this.n = z8;
        this.o = aw5Var;
        this.p = dh3.f(str, "");
        this.q = str3 != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static qn7 a(qn7 qn7Var, String str, String str2, boolean z, boolean z2, boolean z3, b83 b83Var, String str3, boolean z4, String str4, String str5, boolean z5, boolean z6, boolean z7, aw5 aw5Var, int i) {
        String str6 = (i & 1) != 0 ? qn7Var.a : str;
        String str7 = (i & 2) != 0 ? qn7Var.b : str2;
        boolean z8 = (i & 4) != 0 ? qn7Var.c : z;
        boolean z9 = (i & 8) != 0 ? qn7Var.d : z2;
        boolean z10 = (i & 16) != 0 ? qn7Var.e : z3;
        b83 b83Var2 = (i & 32) != 0 ? qn7Var.f : b83Var;
        String str8 = (i & 64) != 0 ? qn7Var.g : str3;
        boolean z11 = (i & 128) != 0 ? qn7Var.h : z4;
        boolean z12 = (i & 256) != 0 ? qn7Var.i : false;
        String str9 = (i & 512) != 0 ? qn7Var.j : str4;
        String str10 = (i & 1024) != 0 ? qn7Var.k : str5;
        boolean z13 = (i & 2048) != 0 ? qn7Var.l : z5;
        boolean z14 = (i & 4096) != 0 ? qn7Var.m : z6;
        boolean z15 = (i & 8192) != 0 ? qn7Var.n : z7;
        aw5 aw5Var2 = (i & 16384) != 0 ? qn7Var.o : aw5Var;
        qn7Var.getClass();
        str6.getClass();
        aw5Var2.getClass();
        return new qn7(str6, str7, z8, z9, z10, b83Var2, str8, z11, z12, str9, str10, z13, z14, z15, aw5Var2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0070  */
    /* JADX WARN: Code duplicated, block: B:56:0x0086  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        boolean zEquals3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn7)) {
            return false;
        }
        qn7 qn7Var = (qn7) obj;
        if (!dh3.f(this.a, qn7Var.a) || !dh3.f(this.b, qn7Var.b) || this.c != qn7Var.c || this.d != qn7Var.d || this.e != qn7Var.e || !dh3.f(this.f, qn7Var.f)) {
            return false;
        }
        String str = qn7Var.g;
        String str2 = this.g;
        if (str2 == null) {
            if (str == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (str == null) {
            zEquals = false;
        } else {
            zEquals = str2.equals(str);
        }
        if (!zEquals || this.h != qn7Var.h || this.i != qn7Var.i) {
            return false;
        }
        String str3 = qn7Var.j;
        String str4 = this.j;
        if (str4 == null) {
            if (str3 == null) {
                zEquals2 = true;
            } else {
                zEquals2 = false;
            }
        } else if (str3 == null) {
            zEquals2 = false;
        } else {
            zEquals2 = str4.equals(str3);
        }
        if (!zEquals2) {
            return false;
        }
        String str5 = qn7Var.k;
        String str6 = this.k;
        if (str6 == null) {
            if (str5 == null) {
                zEquals3 = true;
            } else {
                zEquals3 = false;
            }
        } else if (str5 == null) {
            zEquals3 = false;
        } else {
            zEquals3 = str6.equals(str5);
        }
        return zEquals3 && this.l == qn7Var.l && this.m == qn7Var.m && this.n == qn7Var.n && dh3.f(this.o, qn7Var.o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iF = pc6.f(pc6.f(pc6.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        b83 b83Var = this.f;
        int iHashCode2 = (iF + (b83Var == null ? 0 : b83Var.hashCode())) * 31;
        String str2 = this.g;
        int iF2 = pc6.f(pc6.f((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.h), 31, this.i);
        String str3 = this.j;
        int iHashCode3 = (iF2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        return this.o.hashCode() + pc6.f(pc6.f(pc6.f((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.l), 31, this.m), 31, this.n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.g;
        if (str == null) {
            str = "null";
        }
        String str2 = this.j;
        if (str2 == null) {
            str2 = "null";
        }
        String str3 = this.k;
        String str4 = str3 != null ? str3 : "null";
        StringBuilder sbT = oi0.t("SubRoutingState(subId=", this.a, ", subName=", this.b, ", isJson=");
        sbT.append(this.c);
        sbT.append(", isRoutingEnabled=");
        sbT.append(this.d);
        sbT.append(", isRoutingImportIgnored=");
        sbT.append(this.e);
        sbT.append(", profiles=");
        sbT.append(this.f);
        sbT.append(", selectedProfileId=");
        sbT.append(str);
        sbT.append(", canCopyFromOtherSubs=");
        sbT.append(this.h);
        sbT.append(", isLoading=");
        sbT.append(this.i);
        sbT.append(", currentlyDraggedProfile=");
        sbT.append(str2);
        sbT.append(", profileIdWithForcedFocus=");
        sbT.append(str4);
        sbT.append(", isProfileNameInputDialogVisible=");
        sbT.append(this.l);
        sbT.append(", isProfileCopyBottomSheetVisible=");
        sbT.append(this.m);
        sbT.append(", isDuplicatedNameDialogVisible=");
        sbT.append(this.n);
        sbT.append(", profileDeleteDialogState=");
        sbT.append(this.o);
        sbT.append(")");
        return sbT.toString();
    }
}
