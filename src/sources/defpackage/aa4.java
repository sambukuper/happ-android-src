package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class aa4 {
    public static final aa4 d = new aa4(17, x94.c, 0);
    public final float a;
    public final int b;
    public final int c;

    public aa4(int i, float f, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa4)) {
            return false;
        }
        aa4 aa4Var = (aa4) obj;
        float f = aa4Var.a;
        float f2 = x94.b;
        return Float.compare(this.a, f) == 0 && this.b == aa4Var.b && this.c == aa4Var.c;
    }

    public final int hashCode() {
        float f = x94.b;
        return Integer.hashCode(this.c) + oi0.e(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String str;
        String strB = x94.b(this.a);
        String str2 = "Invalid";
        int i = this.b;
        if (i == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else {
            str = i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str2 = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str2 = "LineHeightStyle.Mode.Tight";
        }
        return oi0.p(oi0.t("LineHeightStyle(alignment=", strB, ", trim=", str, ",mode="), str2, ")");
    }
}
