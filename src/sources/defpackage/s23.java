package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.http.DateFormattingKt;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s23 {
    static {
        kb0 kb0Var = kb0.f0;
        ra.g("\"\\");
        ra.g("\t ,=");
    }

    public static final boolean a(zf6 zf6Var) {
        if (dh3.f((String) zf6Var.X.Z, "HEAD")) {
            return false;
        }
        int i = zf6Var.f0;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && ks8.i(zf6Var) == -1 && !"chunked".equalsIgnoreCase(zf6.g(zf6Var, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x020b  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    public static final void b(d61 d61Var, u23 u23Var, nz2 nz2Var) {
        List list;
        List listUnmodifiableList;
        d02 d02Var;
        c61 c61Var;
        int i;
        long j;
        c61 c61Var2;
        String strSubstring;
        u23Var.getClass();
        nz2Var.getClass();
        if (d61Var == d61.l) {
            return;
        }
        Pattern pattern = c61.j;
        int size = nz2Var.size();
        int i2 = 0;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < size; i3++) {
            if ("Set-Cookie".equalsIgnoreCase(nz2Var.b(i3))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(nz2Var.e(i3));
            }
        }
        d02 d02Var2 = d02.X;
        if (arrayList != null) {
            List listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
            listUnmodifiableList2.getClass();
            list = listUnmodifiableList2;
        } else {
            list = d02Var2;
        }
        int size2 = list.size();
        int i4 = 0;
        ArrayList arrayList2 = null;
        while (i4 < size2) {
            String str = (String) list.get(i4);
            str.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = ks8.a;
            char c = ';';
            int iE = ks8.e(str, ';', i2, str.length());
            char c2 = '=';
            int iE2 = ks8.e(str, '=', i2, iE);
            if (iE2 == iE) {
                d02Var = d02Var2;
                c61Var = null;
                i = 0;
            } else {
                int iL = ks8.l(str, i2, iE2);
                String strSubstring2 = str.substring(iL, ks8.m(str, iL, iE2));
                if (strSubstring2.length() != 0 && ks8.k(strSubstring2) == -1) {
                    int iL2 = ks8.l(str, iE2 + 1, iE);
                    String strSubstring3 = str.substring(iL2, ks8.m(str, iL2, iE));
                    if (ks8.k(strSubstring3) == -1) {
                        int i5 = iE + 1;
                        int length = str.length();
                        long j2 = -1;
                        long jQ = 253402300799999L;
                        String strSubstring4 = null;
                        String str2 = null;
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = true;
                        boolean z4 = false;
                        while (true) {
                            if (i5 >= length) {
                                d02Var = d02Var2;
                                if (j2 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    long j3 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
                                    j = (j3 < jCurrentTimeMillis || j3 > DateFormattingKt.MAX_DATE) ? 253402300799999L : j3;
                                } else {
                                    j = jQ;
                                }
                                String str3 = u23Var.d;
                                if (str2 != null) {
                                    if (!dh3.f(str3, str2) && (!mm7.R(str3, false, str2) || str3.charAt((str3.length() - str2.length()) - 1) != '.' || ks8.e.d(str3))) {
                                        i = 0;
                                        c61Var2 = null;
                                    }
                                    c61Var = c61Var2;
                                    break;
                                }
                                str2 = str3;
                                if (str3.length() == str2.length() || u16.g.a(str2) != null) {
                                    i = 0;
                                    if (strSubstring4 == null || !mm7.Z(strSubstring4, false, "/")) {
                                        String strB = u23Var.b();
                                        int iQ0 = fm7.q0(strB, '/', 0, 6);
                                        strSubstring4 = iQ0 != 0 ? strB.substring(0, iQ0) : "/";
                                    }
                                    c61Var2 = new c61(strSubstring2, strSubstring3, j, str2, strSubstring4, z4, z, z2, z3);
                                } else {
                                    i = 0;
                                    c61Var2 = null;
                                }
                                c61Var = c61Var2;
                                break;
                            }
                            d02 d02Var3 = d02Var2;
                            int iE3 = ks8.e(str, c, i5, length);
                            int iE4 = ks8.e(str, c2, i5, iE3);
                            int iL3 = ks8.l(str, i5, iE4);
                            String strSubstring5 = str.substring(iL3, ks8.m(str, iL3, iE4));
                            if (iE4 < iE3) {
                                int iL4 = ks8.l(str, iE4 + 1, iE3);
                                strSubstring = str.substring(iL4, ks8.m(str, iL4, iE3));
                            } else {
                                strSubstring = _UrlKt.FRAGMENT_ENCODE_SET;
                            }
                            if (strSubstring5.equalsIgnoreCase("expires")) {
                                try {
                                    jQ = i21.Q(strSubstring.length(), strSubstring);
                                    z2 = true;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (strSubstring5.equalsIgnoreCase("max-age")) {
                                try {
                                    long j4 = Long.parseLong(strSubstring);
                                    j2 = j4 <= 0 ? Long.MIN_VALUE : j4;
                                } catch (NumberFormatException e) {
                                    Pattern patternCompile = Pattern.compile("-?\\d+");
                                    patternCompile.getClass();
                                    if (!patternCompile.matcher(strSubstring).matches()) {
                                        throw e;
                                    }
                                    j2 = mm7.Z(strSubstring, false, "-") ? Long.MIN_VALUE : Long.MAX_VALUE;
                                }
                                z2 = true;
                            } else if (strSubstring5.equalsIgnoreCase("domain")) {
                                if (mm7.R(strSubstring, false, ".")) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                String strU = nr4.U(fm7.x0(".", strSubstring));
                                if (strU == null) {
                                    throw new IllegalArgumentException();
                                }
                                str2 = strU;
                                z3 = false;
                            } else if (strSubstring5.equalsIgnoreCase("path")) {
                                strSubstring4 = strSubstring;
                            } else if (strSubstring5.equalsIgnoreCase("secure")) {
                                z4 = true;
                            } else if (strSubstring5.equalsIgnoreCase("httponly")) {
                                z = true;
                            }
                            i5 = iE3 + 1;
                            d02Var2 = d02Var3;
                            c = ';';
                            c2 = '=';
                        }
                    } else {
                        d02Var = d02Var2;
                        c61Var = null;
                        i = 0;
                    }
                } else {
                    d02Var = d02Var2;
                    c61Var = null;
                    i = 0;
                }
            }
            if (c61Var != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(c61Var);
            }
            i4++;
            i2 = i;
            d02Var2 = d02Var;
        }
        d02 d02Var4 = d02Var2;
        if (arrayList2 != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            listUnmodifiableList.getClass();
        } else {
            listUnmodifiableList = d02Var4;
        }
        if (listUnmodifiableList.isEmpty()) {
            return;
        }
        d61Var.i(u23Var, listUnmodifiableList);
    }
}
