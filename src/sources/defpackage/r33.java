package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r33 extends al8 {
    public static final ClassLoader f;
    public static final yc0 g;
    public static final boolean h;
    public fu6 b;
    public final m33 c;
    public final String d;
    public int e;

    static {
        ClassLoader classLoader = g33.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ys0.v();
        }
        f = classLoader;
        g = new yc0((byte) 1);
        h = h33.a("localedata");
        new ConcurrentHashMap();
    }

    public r33(m33 m33Var, String str, int i) {
        this.d = str;
        this.b = m33Var.b;
        this.c = m33Var;
        ((ResourceBundle) this).parent = ((ResourceBundle) m33Var).parent;
        this.e = i;
    }

    public static final r33 A(String str, r33 r33Var) {
        if (str.length() != 0) {
            int iE = r33Var.E();
            int iX = x(str);
            String[] strArr = new String[iE + iX];
            F(iX, iE, str, strArr);
            r33 r33Var2 = r33Var;
            while (true) {
                int i = iE + 1;
                r33 r33Var3 = (r33) r33Var2.s(strArr[iE], null, r33Var);
                if (r33Var3 == null) {
                    r33Var3 = (r33) ((ResourceBundle) r33Var2).parent;
                    if (r33Var3 == null) {
                        break;
                    }
                    int iE2 = r33Var2.E();
                    if (iE != iE2) {
                        String[] strArr2 = new String[(strArr.length - iE) + iE2];
                        System.arraycopy(strArr, iE, strArr2, iE2, strArr.length - iE);
                        strArr = strArr2;
                    }
                    while (iE2 > 0) {
                        iE2--;
                        strArr[iE2] = r33Var2.d;
                        r33Var2 = r33Var2.c;
                    }
                    iE = 0;
                } else {
                    if (i == strArr.length) {
                        return r33Var3;
                    }
                    iE = i;
                }
                r33Var2 = r33Var3;
            }
        }
        return null;
    }

    public static r33 C(String str, String str2, ClassLoader classLoader, int i) {
        String str3;
        r33 r33VarG;
        String strC = sk8.c(str2);
        if (i == 1) {
            str3 = str;
            r33VarG = G(str3, strC, null, sk8.c(sk8.d().Y), classLoader, i);
        } else {
            str3 = str;
            r33VarG = G(str3, strC, null, null, classLoader, i);
        }
        if (r33VarG != null) {
            return r33VarG;
        }
        throw new MissingResourceException(pc6.q("Could not find the bundle ", str3, "/", strC, ".res"), _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET);
    }

    public static String D(String str, String str2) {
        Map map = ee4.a;
        String str3 = (String) map.get(str + "_" + str2);
        if (str3 == null) {
            str3 = (String) map.get(str);
        }
        return str3 == null ? "Latn" : str3;
    }

    public static void F(int i, int i2, String str, String[] strArr) {
        if (i == 0) {
            return;
        }
        if (i == 1) {
            strArr[i2] = str;
            return;
        }
        int i3 = 0;
        while (true) {
            int iIndexOf = str.indexOf(47, i3);
            int i4 = i2 + 1;
            strArr[i2] = str.substring(i3, iIndexOf);
            if (i == 2) {
                strArr[i4] = str.substring(iIndexOf + 1);
                return;
            } else {
                i3 = iIndexOf + 1;
                i--;
                i2 = i4;
            }
        }
    }

    public static r33 G(String str, String str2, String str3, String str4, ClassLoader classLoader, int i) {
        StringBuilder sb;
        String strB = z33.b(str, str2);
        char cB = (char) (p61.B(i) + 48);
        if (i != 1) {
            sb = new StringBuilder();
            sb.append(strB);
            sb.append('#');
            sb.append(cB);
        } else {
            sb = new StringBuilder();
            sb.append(strB);
            sb.append('#');
            sb.append(cB);
            sb.append('#');
            sb.append(str4);
        }
        return (r33) g.v0(sb.toString(), new j33(strB, str, str2, classLoader, i, str4, str3));
    }

    public static int x(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        int i = 1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '/') {
                i++;
            }
        }
        return i;
    }

    public static r33 y(String str, String str2, ClassLoader classLoader) {
        z33 z33VarF = z33.f(str, str2, classLoader);
        if (z33VarF == null) {
            return null;
        }
        int i = z33VarF.e;
        int i2 = i >>> 28;
        if (i2 != 2 && i2 != 5 && i2 != 4) {
            bt.i("Invalid format error");
            return null;
        }
        fu6 fu6Var = new fu6((byte) 12);
        fu6Var.Y = str;
        fu6Var.Z = str2;
        fu6Var.f0 = new sk8(str2);
        fu6Var.g0 = classLoader;
        fu6Var.h0 = z33VarF;
        q33 q33Var = new q33();
        q33Var.b = fu6Var;
        q33Var.e = z33VarF.e;
        y33 y33VarI = z33VarF.i(i);
        q33Var.i = y33VarI;
        int iL = y33VarI.l(z33VarF, "%%ALIAS");
        String strG = iL >= 0 ? z33VarF.g(q33Var.i.h(z33VarF, iL)) : null;
        return strG != null ? (r33) al8.v(str, strG, f) : q33Var;
    }

    public final r33 B(String str, HashMap map, al8 al8Var) {
        r33 r33Var = (r33) s(str, map, al8Var);
        if (r33Var != null) {
            return r33Var;
        }
        r33 r33VarB = (r33) ((ResourceBundle) this).parent;
        if (r33VarB != null) {
            r33VarB = r33VarB.B(str, map, al8Var);
        }
        if (r33VarB != null) {
            return r33VarB;
        }
        fu6 fu6Var = this.b;
        throw new MissingResourceException(oi0.m("Can't find resource for bundle ", z33.b((String) fu6Var.Y, (String) fu6Var.Z), ", key ", str), getClass().getName(), str);
    }

    public final int E() {
        m33 m33Var = this.c;
        if (m33Var == null) {
            return 0;
        }
        return m33Var.E() + 1;
    }

    @Override // defpackage.al8
    public final al8 a(String str) {
        return (r33) super.a(str);
    }

    @Override // defpackage.al8
    public final String d() {
        return (String) this.b.Y;
    }

    public final boolean equals(Object obj) {
        fu6 fu6Var = this.b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r33)) {
            return false;
        }
        fu6 fu6Var2 = ((r33) obj).b;
        return ((String) fu6Var.Y).equals((String) fu6Var2.Y) && ((String) fu6Var.Z).equals((String) fu6Var2.Z);
    }

    @Override // defpackage.al8, java.util.ResourceBundle
    public final Locale getLocale() {
        return ((sk8) this.b.f0).n();
    }

    public final int hashCode() {
        return 42;
    }

    @Override // defpackage.al8
    public final String i() {
        return this.d;
    }

    @Override // defpackage.al8
    public final String j() {
        return (String) this.b.Z;
    }

    @Override // defpackage.al8
    public final sk8 q() {
        return (sk8) this.b.f0;
    }

    @Override // java.util.ResourceBundle
    public final void setParent(ResourceBundle resourceBundle) {
        ((ResourceBundle) this).parent = resourceBundle;
    }

    @Override // defpackage.al8
    public final boolean w() {
        return this.c == null;
    }

    public final r33 z(String str, int i, HashMap map, al8 al8Var) {
        String str2;
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        String[] strArr;
        int iIndexOf;
        r33 r33Var = this;
        k32 k32Var = z33.n;
        int i2 = i >>> 28;
        if (i2 == 14) {
            return new o33((m33) r33Var, str, i);
        }
        r33 r33VarB = null;
        switch (i2) {
            case 0:
            case 6:
                p33 p33Var = new p33((m33) r33Var, str, i);
                String strG = ((z33) p33Var.b.h0).g(i);
                if (strG.length() >= 12) {
                    return p33Var;
                }
                p33Var.i = strG;
                return p33Var;
            case 1:
                return new l33((m33) r33Var, str, i);
            case 2:
            case 4:
            case 5:
                q33 q33Var = new q33((m33) r33Var, str, i);
                q33Var.i = ((z33) q33Var.b.h0).i(i);
                return q33Var;
            case 3:
                fu6 fu6Var = r33Var.b;
                ClassLoader classLoader = (ClassLoader) fu6Var.g0;
                z33 z33Var = (z33) fu6Var.h0;
                z33Var.getClass();
                int i3 = 268435455 & i;
                if (i2 != 3) {
                    str2 = null;
                } else if (i3 == 0) {
                    str2 = _UrlKt.FRAGMENT_ENCODE_SET;
                } else {
                    Object objA = z33Var.m.a(i);
                    if (objA != null) {
                        str2 = (String) objA;
                    } else {
                        int i4 = i3 << 2;
                        int i5 = z33Var.a.getInt(i4);
                        str2 = (String) z33Var.m.c(i, i5 * 2, z33Var.k(i4 + 4, i5));
                    }
                }
                String str3 = (String) fu6Var.Y;
                int iE = r33Var.E();
                int iX = iE + 1;
                String[] strArr2 = new String[iX];
                int i6 = iE;
                while (i6 > 0) {
                    i6--;
                    strArr2[i6] = r33Var.d;
                    r33Var = r33Var.c;
                }
                strArr2[iE] = str;
                HashMap map2 = map == null ? new HashMap() : map;
                if (map2.get(str2) != null) {
                    bt.q("Circular references in the resource bundles");
                    return null;
                }
                map2.put(str2, _UrlKt.FRAGMENT_ENCODE_SET);
                if (str2.indexOf(47) == 0) {
                    int iIndexOf2 = str2.indexOf(47, 1);
                    int i7 = iIndexOf2 + 1;
                    int iIndexOf3 = str2.indexOf(47, i7);
                    strSubstring3 = str2.substring(1, iIndexOf2);
                    if (iIndexOf3 < 0) {
                        strSubstring = str2.substring(i7);
                        strSubstring2 = null;
                    } else {
                        String strSubstring4 = str2.substring(i7, iIndexOf3);
                        strSubstring2 = str2.substring(iIndexOf3 + 1, str2.length());
                        strSubstring = strSubstring4;
                    }
                    boolean zEquals = strSubstring3.equals("ICUDATA");
                    ClassLoader classLoader2 = f;
                    if (!zEquals) {
                        strSubstring3 = (strSubstring3.indexOf("ICUDATA") > -1 && (iIndexOf = strSubstring3.indexOf(45)) > -1) ? "com/ibm/icu/impl/data/icudata/".concat(strSubstring3.substring(iIndexOf + 1, strSubstring3.length())) : "com/ibm/icu/impl/data/icudata";
                    }
                    classLoader = classLoader2;
                } else {
                    int iIndexOf4 = str2.indexOf(47);
                    if (iIndexOf4 != -1) {
                        String strSubstring5 = str2.substring(0, iIndexOf4);
                        strSubstring2 = str2.substring(iIndexOf4 + 1);
                        strSubstring = strSubstring5;
                    } else {
                        strSubstring = str2;
                        strSubstring2 = null;
                    }
                    strSubstring3 = str3;
                }
                if (strSubstring3.equals("LOCALE")) {
                    String strSubstring6 = str2.substring(8, str2.length());
                    r33 r33Var2 = (r33) al8Var;
                    while (true) {
                        m33 m33Var = r33Var2.c;
                        if (m33Var != null) {
                            r33Var2 = m33Var;
                        } else {
                            r33VarB = A(strSubstring6, r33Var2);
                        }
                    }
                } else {
                    r33 r33VarC = C(strSubstring3, strSubstring, classLoader, 1);
                    if (strSubstring2 != null) {
                        iX = x(strSubstring2);
                        if (iX > 0) {
                            strArr = new String[iX];
                            F(iX, 0, strSubstring2, strArr);
                        } else {
                            strArr = null;
                        }
                    } else {
                        strArr = strArr2;
                    }
                    if (iX > 0) {
                        r33VarB = r33VarC;
                        for (int i8 = 0; i8 < iX; i8++) {
                            r33VarB = r33VarB.B(strArr[i8], map2, al8Var);
                        }
                    }
                }
                if (r33VarB != null) {
                    return r33VarB;
                }
                throw new MissingResourceException(strSubstring, str3, strArr2[iE]);
            case 7:
                return new n33((m33) r33Var, str, i);
            case 8:
            case 9:
                k33 k33Var = new k33((m33) r33Var, str, i);
                k33Var.i = ((z33) k33Var.b.h0).a(i);
                return k33Var;
            default:
                bt.i("The resource type is unknown");
                return null;
        }
    }
}
