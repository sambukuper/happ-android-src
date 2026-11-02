package defpackage;

import java.util.List;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q21 implements s55 {
    public final String a;

    public q21(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.qj2
    public final rj2 a() {
        return new c11(this.a);
    }

    @Override // defpackage.qj2
    public final li5 b() {
        List listJ;
        String strSubstring;
        String strSubstring2 = this.a;
        int length = strSubstring2.length();
        d02 d02Var = d02.X;
        if (length == 0) {
            listJ = d02Var;
        } else {
            gb4 gb4VarR = i21.r();
            boolean zD = du7.d(strSubstring2.charAt(0));
            String strSubstring3 = _UrlKt.FRAGMENT_ENCODE_SET;
            if (zD) {
                int length2 = strSubstring2.length();
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        strSubstring = strSubstring2;
                        break;
                    }
                    if (!du7.d(strSubstring2.charAt(i))) {
                        strSubstring = strSubstring2.substring(0, i);
                        break;
                    }
                    i++;
                }
                gb4VarR.add(new w75(i21.K(new r21(strSubstring))));
                int length3 = strSubstring2.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length3) {
                        strSubstring2 = _UrlKt.FRAGMENT_ENCODE_SET;
                        break;
                    }
                    if (!du7.d(strSubstring2.charAt(i2))) {
                        strSubstring2 = strSubstring2.substring(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (strSubstring2.length() > 0) {
                if (du7.d(strSubstring2.charAt(strSubstring2.length() - 1))) {
                    int length4 = strSubstring2.length();
                    while (true) {
                        length4--;
                        if (-1 >= length4) {
                            break;
                        }
                        if (!du7.d(strSubstring2.charAt(length4))) {
                            strSubstring3 = strSubstring2.substring(0, length4 + 1);
                            break;
                        }
                    }
                    gb4VarR.add(new ko5(strSubstring3));
                    for (int length5 = strSubstring2.length() - 1; -1 < length5; length5--) {
                        if (!du7.d(strSubstring2.charAt(length5))) {
                            strSubstring2 = strSubstring2.substring(length5 + 1);
                            break;
                        }
                    }
                    gb4VarR.add(new w75(i21.K(new r21(strSubstring2))));
                } else {
                    gb4VarR.add(new ko5(strSubstring2));
                }
            }
            listJ = i21.j(gb4VarR);
        }
        return new li5(listJ, d02Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q21) {
            return dh3.f(this.a, ((q21) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oi0.o(new StringBuilder("ConstantFormatStructure("), this.a, ')');
    }
}
