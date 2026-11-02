package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d24 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public d24(int i, String str, String str2, String str3) {
        int iCharAt;
        int iCharAt2;
        this.a = str;
        this.b = str2;
        this.c = str3;
        if (str3.length() == 2) {
            int iCharAt3 = str3.charAt(0) - 'A';
            if (iCharAt3 >= 0 && 25 >= iCharAt3) {
                int iCharAt4 = str3.charAt(1) - 'A';
            }
        } else if (str3.length() == 3 && (iCharAt = str3.charAt(0) - '0') >= 0 && 9 >= iCharAt && (iCharAt2 = str3.charAt(1) - '0') >= 0 && 9 >= iCharAt2) {
            int iCharAt5 = str3.charAt(2) - '0';
        }
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != d24.class) {
            return false;
        }
        d24 d24Var = (d24) obj;
        return this.a.equals(d24Var.a) && this.b.equals(d24Var.b) && this.c.equals(d24Var.c) && this.d == d24Var.d;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Integer.valueOf(this.d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a);
        String str = this.b;
        if (!str.isEmpty()) {
            sb.append('-');
            sb.append(str);
        }
        String str2 = this.c;
        if (!str2.isEmpty()) {
            sb.append('-');
            sb.append(str2);
        }
        return sb.toString();
    }
}
