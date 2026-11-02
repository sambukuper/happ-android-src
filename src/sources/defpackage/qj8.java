package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qj8 {
    public final gi2 a;
    public final dj2 b;
    public final int c;
    public final int d;
    public final Object e;

    public qj8(gi2 gi2Var, dj2 dj2Var, int i, int i2, Object obj) {
        this.a = gi2Var;
        this.b = dj2Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj8)) {
            return false;
        }
        qj8 qj8Var = (qj8) obj;
        return dh3.f(this.a, qj8Var.a) && dh3.f(this.b, qj8Var.b) && this.c == qj8Var.c && this.d == qj8Var.d && dh3.f(this.e, qj8Var.e);
    }

    public final int hashCode() {
        gi2 gi2Var = this.a;
        int iE = oi0.e(this.d, oi0.e(this.c, (((gi2Var == null ? 0 : gi2Var.hashCode()) * 31) + this.b.X) * 31, 31), 31);
        Object obj = this.e;
        return iE + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2 = "Invalid";
        int i = this.c;
        if (i == 0) {
            str = "Normal";
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        oi0.y(sb, str, ", fontSynthesis=", str2, ", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
