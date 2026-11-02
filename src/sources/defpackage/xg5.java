package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xg5 implements ml {
    public final int a;
    public final int b;
    public final long c;
    public final i78 d;
    public final fp5 e;
    public final aa4 f;
    public final int g;
    public final int h;
    public final e88 i;

    public xg5(int i, int i2, long j, i78 i78Var, fp5 fp5Var, aa4 aa4Var, int i3, int i4, e88 e88Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = i78Var;
        this.e = fp5Var;
        this.f = aa4Var;
        this.g = i3;
        this.h = i4;
        this.i = e88Var;
        w88[] w88VarArr = v88.b;
        if (v88.a(j, v88.c)) {
            return;
        }
        if (v88.c(j) >= 0.0f) {
            return;
        }
        xc3.b("lineHeight can't be negative (" + v88.c(j) + ")");
    }

    public final xg5 a(xg5 xg5Var) {
        return xg5Var == null ? this : yg5.a(this, xg5Var.a, xg5Var.b, xg5Var.c, xg5Var.d, xg5Var.e, xg5Var.f, xg5Var.g, xg5Var.h, xg5Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg5)) {
            return false;
        }
        xg5 xg5Var = (xg5) obj;
        return this.a == xg5Var.a && this.b == xg5Var.b && v88.a(this.c, xg5Var.c) && dh3.f(this.d, xg5Var.d) && dh3.f(this.e, xg5Var.e) && dh3.f(this.f, xg5Var.f) && this.g == xg5Var.g && this.h == xg5Var.h && dh3.f(this.i, xg5Var.i);
    }

    public final int hashCode() {
        int iE = oi0.e(this.b, Integer.hashCode(this.a) * 31, 31);
        w88[] w88VarArr = v88.b;
        int iG = p61.g(iE, this.c, 31);
        i78 i78Var = this.d;
        int iHashCode = (iG + (i78Var != null ? i78Var.hashCode() : 0)) * 31;
        fp5 fp5Var = this.e;
        int iHashCode2 = (iHashCode + (fp5Var != null ? fp5Var.hashCode() : 0)) * 31;
        aa4 aa4Var = this.f;
        int iE2 = oi0.e(this.h, oi0.e(this.g, (iHashCode2 + (aa4Var != null ? aa4Var.hashCode() : 0)) * 31, 31), 31);
        e88 e88Var = this.i;
        return iE2 + (e88Var != null ? e88Var.hashCode() : 0);
    }

    public final String toString() {
        String strA = o28.a(this.a);
        String strA2 = b48.a(this.b);
        String strE = v88.e(this.c);
        String strA3 = v94.a(this.g);
        String strA4 = w23.a(this.h);
        StringBuilder sbT = oi0.t("ParagraphStyle(textAlign=", strA, ", textDirection=", strA2, ", lineHeight=");
        sbT.append(strE);
        sbT.append(", textIndent=");
        sbT.append(this.d);
        sbT.append(", platformStyle=");
        sbT.append(this.e);
        sbT.append(", lineHeightStyle=");
        sbT.append(this.f);
        sbT.append(", lineBreak=");
        oi0.y(sbT, strA3, ", hyphens=", strA4, ", textMotion=");
        sbT.append(this.i);
        sbT.append(")");
        return sbT.toString();
    }
}
