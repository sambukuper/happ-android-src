package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vo8 {
    public static final uo8 Companion = new uo8();
    public final String a;
    public final String b;
    public final String c;
    public final yp8 d;
    public final String e;

    public /* synthetic */ vo8(int i, yp8 yp8Var, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            ch3.S(i, 15, to8.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = yp8Var;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo8)) {
            return false;
        }
        vo8 vo8Var = (vo8) obj;
        return dh3.f(this.a, vo8Var.a) && dh3.f(this.b, vo8Var.b) && dh3.f(this.c, vo8Var.c) && dh3.f(this.d, vo8Var.d) && dh3.f(this.e, vo8Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + pc6.e(pc6.e(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbT = oi0.t("UpdateInfo(version=", this.a, ", details=", this.b, ", link=");
        sbT.append(this.c);
        sbT.append(", versions=");
        sbT.append(this.d);
        sbT.append(", size=");
        return oi0.p(sbT, this.e, ")");
    }
}
