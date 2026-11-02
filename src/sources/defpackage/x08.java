package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x08 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final byte f;
    public final int g;

    /* JADX WARN: Multi-variable type inference failed */
    public x08(String str, String str2, boolean z, int i, String str3, int i2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.g = fm7.d0(upperCase, "INT", false) ? 3 : (fm7.d0(upperCase, "CHAR", false) || fm7.d0(upperCase, "CLOB", false) || fm7.d0(upperCase, "TEXT", false)) ? 2 : fm7.d0(upperCase, "BLOB", false) ? 5 : (fm7.d0(upperCase, "REAL", false) || fm7.d0(upperCase, "FLOA", false) || fm7.d0(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x08) {
                boolean z = this.d > 0;
                x08 x08Var = (x08) obj;
                byte b = x08Var.f;
                if (z == (x08Var.d > 0) && dh3.f(this.a, x08Var.a) && this.c == x08Var.c) {
                    String str = x08Var.e;
                    byte b2 = this.f;
                    String str2 = this.e;
                    if ((b2 != 1 || b != 2 || str2 == null || c18.c(str2, str)) && ((b2 != 2 || b != 1 || str == null || c18.c(str, str2)) && ((b2 == 0 || b2 != b || (str2 == null ? str == null : c18.c(str2, str))) && this.g == x08Var.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return gm7.M(gm7.O(sb.toString()));
    }
}
