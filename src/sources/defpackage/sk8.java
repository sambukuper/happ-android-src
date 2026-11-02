package defpackage;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sk8 implements Serializable, Comparable {
    public static final yc0 g0 = new yc0(4);
    public static final sk8 h0;
    public static final yc0 i0;
    public static volatile sk8 j0;
    public static final Locale[] k0;
    public static final sk8[] l0;
    public volatile transient Locale X;
    public String Y;
    public volatile transient e20 Z;
    public volatile transient de4 f0;

    /* JADX WARN: Code duplicated, block: B:22:0x00b5  */
    static {
        Locale locale;
        Object obj;
        Locale locale2 = Locale.ENGLISH;
        Locale locale3 = Locale.FRENCH;
        Locale locale4 = Locale.GERMAN;
        Locale locale5 = Locale.ITALIAN;
        Locale locale6 = Locale.JAPANESE;
        Locale locale7 = Locale.KOREAN;
        Locale locale8 = Locale.CHINESE;
        new sk8("zh_Hans");
        new sk8("zh_Hant");
        Locale locale9 = Locale.FRANCE;
        Locale locale10 = Locale.GERMANY;
        Locale locale11 = Locale.ITALY;
        Locale locale12 = Locale.JAPAN;
        Locale locale13 = Locale.KOREA;
        new sk8("zh_Hans_CN");
        new sk8("zh_Hant_TW");
        Locale locale14 = Locale.UK;
        Locale locale15 = Locale.US;
        Locale locale16 = Locale.CANADA;
        Locale locale17 = Locale.CANADA_FRENCH;
        h0 = new sk8(_UrlKt.FRAGMENT_ENCODE_SET, new Locale(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET));
        yc0 yc0Var = new yc0((byte) 5);
        i0 = yc0Var;
        k0 = new Locale[p61.G(2).length];
        l0 = new sk8[p61.G(2).length];
        Locale locale18 = Locale.getDefault();
        j0 = locale18 == null ? null : (sk8) yc0Var.v0(locale18, null);
        int i = 0;
        if (!qk8.a) {
            int[] iArrG = p61.G(2);
            int length = iArrG.length;
            while (i < length) {
                int iB = p61.B(iArrG[i]);
                k0[iB] = locale18;
                l0[iB] = j0;
                i++;
            }
            return;
        }
        int[] iArrG2 = p61.G(2);
        int length2 = iArrG2.length;
        while (i < length2) {
            int i2 = iArrG2[i];
            int iB2 = p61.B(i2);
            Locale[] localeArr = k0;
            if (qk8.a) {
                int iB3 = p61.B(i2);
                if (iB3 != 0) {
                    obj = iB3 != 1 ? null : qk8.d;
                } else {
                    obj = qk8.c;
                }
                if (obj != null) {
                    try {
                        locale = (Locale) qk8.b.invoke(null, obj);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                        locale = Locale.getDefault();
                    }
                } else {
                    locale = Locale.getDefault();
                }
            } else {
                locale = Locale.getDefault();
            }
            localeArr[iB2] = locale;
            sk8[] sk8VarArr = l0;
            Locale locale19 = k0[iB2];
            sk8VarArr[iB2] = locale19 == null ? null : (sk8) i0.v0(locale19, null);
            i++;
        }
    }

    public sk8(String str) {
        this.Y = g(str);
    }

    public static void a(StringBuilder sb, String str) {
        if (sb.length() != 0) {
            sb.append('_');
        }
        sb.append(str);
    }

    public static String c(String str) {
        if (str.indexOf(64) == -1) {
            return str;
        }
        fe4 fe4Var = new fe4(str);
        fe4Var.h();
        return fe4Var.c.substring(0);
    }

    public static sk8 d() {
        sk8 sk8Var = j0;
        if (sk8Var == null) {
            return h0;
        }
        if (sk8Var.X.equals(Locale.getDefault())) {
            return sk8Var;
        }
        synchronized (sk8.class) {
            try {
                Locale locale = Locale.getDefault();
                sk8 sk8Var2 = j0;
                if (sk8Var2.X.equals(locale)) {
                    return sk8Var2;
                }
                sk8 sk8Var3 = null;
                if (locale != null) {
                    sk8Var3 = (sk8) i0.v0(locale, null);
                }
                if (!qk8.a) {
                    for (int i : p61.G(2)) {
                        int iB = p61.B(i);
                        k0[iB] = locale;
                        l0[iB] = sk8Var3;
                    }
                }
                j0 = sk8Var3;
                return sk8Var3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x021d  */
    /* JADX WARN: Code duplicated, block: B:257:0x0509  */
    /* JADX WARN: Code duplicated, block: B:259:0x0511  */
    /* JADX WARN: Code duplicated, block: B:260:0x0513  */
    /* JADX WARN: Code duplicated, block: B:268:0x052a  */
    /* JADX WARN: Code duplicated, block: B:271:0x0534  */
    public static String g(String str) {
        int length;
        char cCharAt;
        us5 us5Var;
        boolean z;
        int i;
        int i2;
        boolean z2;
        String str2;
        int i3;
        String strSubstring = str;
        if (strSubstring != null && !strSubstring.contains("@")) {
            int length2 = strSubstring.length();
            boolean z3 = false;
            int i4 = 1;
            int i5 = length2;
            int i6 = 0;
            boolean z4 = true;
            for (int i7 = 0; i7 < length2; i7++) {
                if (strSubstring.charAt(i7) == '_' || strSubstring.charAt(i7) == '-') {
                    if (i6 != 0 && i6 < i5) {
                        i5 = i6;
                    }
                    z4 = true;
                } else {
                    if (z4) {
                        i6 = 0;
                        z4 = false;
                    }
                    i6++;
                }
            }
            if (i5 == 1) {
                String strReplace = (strSubstring.indexOf(95) < 0 || strSubstring.charAt(1) == '_' || strSubstring.charAt(1) == '-') ? strSubstring : strSubstring.replace('_', '-');
                HashMap map = q24.h;
                String[] strArr = (String[]) map.get(new ou(strReplace));
                int i8 = 2;
                int iIndexOf = 2;
                while (strArr == null && (iIndexOf = strReplace.indexOf(45, iIndexOf + 1)) != -1) {
                    strArr = (String[]) map.get(new ou(strReplace.substring(0, iIndexOf)));
                }
                if (strArr != null) {
                    us5Var = strArr[0].length() == strReplace.length() ? new us5(strArr[1], "-") : new us5(strArr[1] + strReplace.substring(iIndexOf), "-");
                    z = true;
                } else {
                    us5Var = new us5(strReplace, "-");
                    z = false;
                }
                q24 q24Var = new q24();
                if (!us5Var.c) {
                    String str3 = (String) us5Var.f;
                    if (q24.a(str3)) {
                        q24Var.a = str3;
                        i = us5Var.b;
                        us5Var.a();
                        if (q24Var.a.length() <= 3 && !us5Var.c) {
                            while (!us5Var.c) {
                                String str4 = (String) us5Var.f;
                                if (str4.length() != 3 || !gv3.I(str4)) {
                                    break;
                                }
                                if (q24Var.e.isEmpty()) {
                                    q24Var.e = new ArrayList(3);
                                }
                                q24Var.e.add(str4);
                                i = us5Var.b;
                                us5Var.a();
                                if (q24Var.e.size() == 3) {
                                    break;
                                }
                            }
                        }
                        if (!us5Var.c) {
                            String str5 = (String) us5Var.f;
                            if (str5.length() == 4 && gv3.I(str5)) {
                                q24Var.b = str5;
                                i = us5Var.b;
                                us5Var.a();
                            }
                        }
                        if (!us5Var.c) {
                            String str6 = (String) us5Var.f;
                            if (q24.c(str6)) {
                                q24Var.c = str6;
                                i = us5Var.b;
                                us5Var.a();
                            }
                        }
                        if (!us5Var.c) {
                            while (!us5Var.c) {
                                String str7 = (String) us5Var.f;
                                if (!q24.d(str7)) {
                                    break;
                                }
                                if (q24Var.f.isEmpty()) {
                                    q24Var.f = new ArrayList(3);
                                }
                                String upperCase = str7.toUpperCase();
                                if (!q24Var.f.contains(upperCase)) {
                                    q24Var.f.add(upperCase);
                                }
                                i = us5Var.b;
                                us5Var.a();
                            }
                        }
                        if (!us5Var.c) {
                            while (true) {
                                if (!us5Var.c) {
                                    String str8 = (String) us5Var.f;
                                    if (str8.length() == i4 && gv3.H(str8) && !gv3.k("x", str8)) {
                                        i2 = us5Var.a;
                                        StringBuilder sb = new StringBuilder(str8.toLowerCase());
                                        us5Var.a();
                                        while (!us5Var.c) {
                                            String str9 = (String) us5Var.f;
                                            if (str9.length() < i8 || str9.length() > 8 || !gv3.H(str9)) {
                                                break;
                                            }
                                            sb.append("-");
                                            sb.append(str9);
                                            i = us5Var.b;
                                            us5Var.a();
                                            i8 = 2;
                                        }
                                        if (i <= i2) {
                                            break;
                                        }
                                        if (q24Var.g.size() == 0) {
                                            q24Var.g = new ArrayList(4);
                                        }
                                        Iterator it = q24Var.g.iterator();
                                        boolean z5 = false;
                                        while (it.hasNext()) {
                                            z5 |= ((String) it.next()).charAt(0) == sb.charAt(0);
                                        }
                                        if (!z5) {
                                            q24Var.g.add(sb.toString());
                                        }
                                        i4 = 1;
                                        i8 = 2;
                                    }
                                }
                            }
                        }
                    } else {
                        i = 0;
                    }
                    i2 = -1;
                    break;
                }
                i = 0;
                i2 = -1;
                break;
                if (!us5Var.c && i2 < 0) {
                    String str10 = (String) us5Var.f;
                    if (str10.length() == 1 && gv3.k("x", str10)) {
                        int i9 = us5Var.a;
                        StringBuilder sb2 = new StringBuilder(str10);
                        us5Var.a();
                        while (!us5Var.c) {
                            String str11 = (String) us5Var.f;
                            if (!q24.b(str11)) {
                                break;
                            }
                            sb2.append("-");
                            sb2.append(str11);
                            i = us5Var.b;
                            us5Var.a();
                        }
                        if (i <= i9) {
                            i2 = i9;
                        } else {
                            q24Var.d = sb2.toString();
                        }
                    }
                }
                if (!z && !us5Var.c && i2 < 0) {
                    ((String) us5Var.f).getClass();
                }
                ig3 ig3Var = new ig3();
                ig3Var.a = _UrlKt.FRAGMENT_ENCODE_SET;
                ig3Var.b = _UrlKt.FRAGMENT_ENCODE_SET;
                ig3Var.c = _UrlKt.FRAGMENT_ENCODE_SET;
                ig3Var.d = _UrlKt.FRAGMENT_ENCODE_SET;
                ig3Var.b();
                if (Collections.unmodifiableList(q24Var.e).size() > 0) {
                    ig3Var.a = (String) Collections.unmodifiableList(q24Var.e).get(0);
                } else {
                    String str12 = q24Var.a;
                    HashMap map2 = q24.h;
                    if (!str12.equals("und")) {
                        ig3Var.a = str12;
                    }
                }
                ig3Var.b = q24Var.b;
                ig3Var.c = q24Var.c;
                ArrayList arrayList = new ArrayList(Collections.unmodifiableList(q24Var.f));
                Collections.sort(arrayList);
                if (arrayList.size() > 0) {
                    StringBuilder sb3 = new StringBuilder((String) arrayList.get(0));
                    for (int i10 = 1; i10 < arrayList.size(); i10++) {
                        sb3.append("_");
                        sb3.append((String) arrayList.get(i10));
                    }
                    ig3Var.d = sb3.toString();
                }
                List<String> listUnmodifiableList = Collections.unmodifiableList(q24Var.g);
                String str13 = q24Var.d;
                ig3Var.b();
                if (listUnmodifiableList != null && listUnmodifiableList.size() > 0) {
                    HashSet hashSet = new HashSet(listUnmodifiableList.size());
                    for (String str14 : listUnmodifiableList) {
                        char cCharAt2 = str14.charAt(0);
                        gg3 gg3Var = new gg3(cCharAt2);
                        if (!hashSet.contains(gg3Var)) {
                            TreeSet treeSet = wm8.e;
                            if ('u' == gv3.Y(cCharAt2)) {
                                ig3Var.f(str14.substring(2));
                            } else {
                                HashMap map3 = ig3Var.e;
                                if (map3 == null) {
                                    map3 = new HashMap(4);
                                    ig3Var.e = map3;
                                }
                                map3.put(gg3Var, str14.substring(2));
                            }
                        }
                    }
                }
                if (str13.length() > 0) {
                    HashMap map4 = ig3Var.e;
                    if (map4 == null) {
                        z2 = true;
                        map4 = new HashMap(1);
                        ig3Var.e = map4;
                    } else {
                        z2 = true;
                    }
                    map4.put(new gg3(str13.charAt(0)), str13.substring(2));
                } else {
                    z2 = true;
                }
                String str15 = ig3Var.a;
                String str16 = ig3Var.b;
                String str17 = ig3Var.c;
                String string = ig3Var.d;
                HashMap map5 = ig3Var.e;
                if (map5 != null && (str2 = (String) map5.get(ig3.h)) != null) {
                    us5 us5Var2 = new us5(str2, "-");
                    boolean z6 = false;
                    while (true) {
                        if (us5Var2.c) {
                            i3 = -1;
                            break;
                        }
                        if (z6) {
                            i3 = us5Var2.a;
                            break;
                        }
                        if (gv3.k((String) us5Var2.f, "lvariant")) {
                            z6 = z2;
                        }
                        us5Var2.a();
                    }
                    if (i3 != -1) {
                        StringBuilder sb4 = new StringBuilder(string);
                        if (sb4.length() != 0) {
                            sb4.append("_");
                        }
                        sb4.append(str2.substring(i3).replaceAll("-", "_"));
                        string = sb4.toString();
                    }
                }
                e20 e20VarA = e20.a(str15, str16, str17, string);
                de4 de4VarC = ig3Var.c();
                String str18 = e20VarA.a;
                String str19 = e20VarA.b;
                String str20 = e20VarA.c;
                String str21 = e20VarA.d;
                String strJ = j(str18, str19, str20, str21);
                Set<Character> setUnmodifiableSet = Collections.unmodifiableSet(de4VarC.a.keySet());
                if (!setUnmodifiableSet.isEmpty()) {
                    TreeMap treeMap = new TreeMap();
                    for (Character ch : setUnmodifiableSet) {
                        m62 m62VarA = de4VarC.a(ch);
                        if (m62VarA instanceof wm8) {
                            wm8 wm8Var = (wm8) m62VarA;
                            for (String str22 : Collections.unmodifiableSet(wm8Var.d.keySet())) {
                                String str23 = (String) wm8Var.d.get(str22);
                                String strL = l(str22);
                                if (str23.length() == 0) {
                                    str23 = "yes";
                                }
                                String strM = m(str22, str23);
                                if (strL.equals("va") && strM.equals("posix") && str21.length() == 0) {
                                    strJ = strJ.concat("_POSIX");
                                } else {
                                    treeMap.put(strL, strM);
                                }
                            }
                            Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(wm8Var.c);
                            if (setUnmodifiableSet2.size() > 0) {
                                StringBuilder sb5 = new StringBuilder();
                                for (String str24 : setUnmodifiableSet2) {
                                    if (sb5.length() > 0) {
                                        sb5.append('-');
                                    }
                                    sb5.append(str24);
                                }
                                treeMap.put("attribute", sb5.toString());
                            }
                        } else {
                            treeMap.put(String.valueOf(ch), m62VarA.b);
                        }
                    }
                    if (!treeMap.isEmpty()) {
                        StringBuilder sb6 = new StringBuilder(strJ);
                        sb6.append("@");
                        for (Map.Entry entry : treeMap.entrySet()) {
                            if (z3) {
                                sb6.append(";");
                            } else {
                                z3 = z2;
                            }
                            sb6.append((String) entry.getKey());
                            sb6.append("=");
                            sb6.append((String) entry.getValue());
                        }
                        strJ = sb6.toString();
                    }
                }
                String str25 = new sk8(strJ).Y;
                if (str25.length() != 0) {
                    strSubstring = str25;
                }
            } else if ("root".equalsIgnoreCase(strSubstring)) {
                strSubstring = _UrlKt.FRAGMENT_ENCODE_SET;
            } else {
                length = strSubstring.length();
                if (length >= 3) {
                    if (length == 3) {
                        strSubstring = _UrlKt.FRAGMENT_ENCODE_SET;
                    } else {
                        cCharAt = strSubstring.charAt(3);
                        if (cCharAt != '-') {
                            strSubstring = strSubstring.substring(3);
                        } else {
                            strSubstring = strSubstring.substring(3);
                        }
                    }
                }
            }
        } else if ("root".equalsIgnoreCase(strSubstring)) {
            length = strSubstring.length();
            if (length >= 3 && strSubstring.regionMatches(true, 0, "und", 0, 3)) {
                if (length == 3) {
                    strSubstring = _UrlKt.FRAGMENT_ENCODE_SET;
                } else {
                    cCharAt = strSubstring.charAt(3);
                    if (cCharAt != '-' || cCharAt == '_') {
                        strSubstring = strSubstring.substring(3);
                    }
                }
            }
        } else {
            strSubstring = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return (String) g0.v0(strSubstring, null);
    }

    public static String h(sk8 sk8Var, String str) {
        int iCodePointAt;
        String strE = sk8Var.e(str);
        if (strE == null || strE.length() < 3 || strE.length() > 6) {
            return null;
        }
        String upperCase = strE.substring(0, 2).toUpperCase();
        rk8 rk8Var = rk8.b;
        rk8Var.getClass();
        if (upperCase.matches("[a-zA-Z][a-zA-Z]")) {
            String lowerCase = upperCase.toLowerCase();
            int iCodePointAt2 = "a".codePointAt(0);
            iCodePointAt = (lowerCase.codePointAt(1) + ((lowerCase.codePointAt(0) - iCodePointAt2) * 26)) - iCodePointAt2;
        } else {
            iCodePointAt = -1;
        }
        if (iCodePointAt >= 0 && (rk8Var.a[iCodePointAt / 32] & (1 << (iCodePointAt % 32))) != 0) {
            return upperCase;
        }
        return null;
    }

    public static boolean i(String str) {
        return str == null || str.length() == 0;
    }

    public static String j(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (str != null && str.length() > 0) {
            sb.append(str);
        }
        if (str2 != null && str2.length() > 0) {
            sb.append('_');
            sb.append(str2);
        }
        if (str3 != null && str3.length() > 0) {
            sb.append('_');
            sb.append(str3);
        }
        if (str4 != null && str4.length() > 0) {
            if (str3 == null || str3.length() == 0) {
                sb.append('_');
            }
            sb.append('_');
            sb.append(str4);
        }
        return sb.toString();
    }

    public static String l(String str) {
        Object[][] objArr = ux3.a;
        lx3 lx3Var = (lx3) ux3.b.get(gv3.Z(str));
        String str2 = lx3Var != null ? lx3Var.a : null;
        return (str2 == null && str.matches("[0-9a-zA-Z]+")) ? gv3.Z(str) : str2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0042 A[EDGE_INSN: B:15:0x0042->B:16:0x0043 BREAK  A[LOOP:0: B:10:0x0029->B:23:?]] */
    public static String m(String str, String str2) {
        String strZ;
        Object[][] objArr = ux3.a;
        String strZ2 = gv3.Z(str);
        String strZ3 = gv3.Z(str2);
        lx3 lx3Var = (lx3) ux3.b.get(strZ2);
        if (lx3Var != null) {
            sx3 sx3Var = (sx3) lx3Var.c.get(strZ3);
            if (sx3Var == null) {
                EnumSet enumSet = lx3Var.d;
                if (enumSet == null) {
                    strZ = null;
                    break;
                }
                Iterator it = enumSet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        strZ = null;
                        break;
                    }
                    if (((qx3) it.next()).X.v(strZ3)) {
                        strZ = gv3.Z(strZ3);
                        break;
                    }
                }
            } else {
                strZ = sx3Var.a;
            }
        } else {
            strZ = null;
            break;
        }
        return (strZ == null && str2.matches("[0-9a-zA-Z]+([_/\\-][0-9a-zA-Z]+)*")) ? gv3.Z(str2) : strZ;
    }

    public final e20 b() {
        String strSubstring;
        String strD;
        String strSubstring2;
        String strSubstring3;
        if (this.Z == null) {
            if (equals(h0)) {
                strSubstring = _UrlKt.FRAGMENT_ENCODE_SET;
                strD = _UrlKt.FRAGMENT_ENCODE_SET;
                strSubstring2 = strD;
                strSubstring3 = strSubstring2;
            } else {
                fe4 fe4Var = new fe4(this.Y);
                fe4Var.m();
                fe4Var.j();
                strSubstring = fe4Var.c.substring(0);
                fe4Var.m();
                if (fe4Var.e()) {
                    fe4Var.b = 2;
                }
                while (!fe4.f(fe4Var.g())) {
                }
                fe4Var.b--;
                strSubstring2 = fe4Var.c.substring(fe4Var.k());
                fe4Var.m();
                if (fe4Var.e()) {
                    fe4Var.b = 2;
                }
                while (!fe4.f(fe4Var.g())) {
                }
                fe4Var.b--;
                fe4Var.n();
                strSubstring3 = fe4Var.c.substring(fe4Var.i());
                strD = fe4Var.d();
            }
            this.Z = e20.a(strSubstring, strSubstring2, strSubstring3, strD);
        }
        return this.Z;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        sk8 sk8Var = (sk8) obj;
        if (this != sk8Var) {
            int iCompareTo = b().a.compareTo(sk8Var.b().a);
            if (iCompareTo == 0 && (iCompareTo = b().b.compareTo(sk8Var.b().b)) == 0 && (iCompareTo = b().c.compareTo(sk8Var.b().c)) == 0 && (iCompareTo = b().d.compareTo(sk8Var.b().d)) == 0) {
                Iterator itF = f();
                Iterator itF2 = sk8Var.f();
                if (itF == null) {
                    if (itF2 == null) {
                        iCompareTo = 0;
                    } else {
                        iCompareTo = -1;
                    }
                } else if (itF2 == null) {
                    iCompareTo = 1;
                } else {
                    while (iCompareTo == 0 && itF.hasNext()) {
                        if (!itF2.hasNext()) {
                            iCompareTo = 1;
                            break;
                        }
                        String str = (String) itF.next();
                        String str2 = (String) itF2.next();
                        int iCompareTo2 = str.compareTo(str2);
                        if (iCompareTo2 == 0) {
                            String strE = e(str);
                            String strE2 = sk8Var.e(str2);
                            if (strE == null) {
                                iCompareTo = strE2 == null ? 0 : -1;
                            } else {
                                iCompareTo = strE2 == null ? 1 : strE.compareTo(strE2);
                            }
                        } else {
                            iCompareTo = iCompareTo2;
                        }
                    }
                    if (iCompareTo == 0 && itF2.hasNext()) {
                        iCompareTo = -1;
                    }
                }
            }
            if (iCompareTo < 0) {
                return -1;
            }
            if (iCompareTo > 0) {
                return 1;
            }
        }
        return 0;
    }

    public final String e(String str) {
        Map mapC = new fe4(this.Y).c();
        if (mapC.isEmpty()) {
            return null;
        }
        return (String) mapC.get(gv3.Z(str.trim()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sk8) {
            return this.Y.equals(((sk8) obj).Y);
        }
        return false;
    }

    public final Iterator f() {
        Map mapC = new fe4(this.Y).c();
        if (mapC.isEmpty()) {
            return null;
        }
        return mapC.keySet().iterator();
    }

    public final int hashCode() {
        return this.Y.hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0254 A[PHI: r4
  0x0254: PHI (r4v6 boolean) = (r4v5 boolean), (r4v32 boolean), (r4v32 boolean) binds: [B:114:0x01ee, B:127:0x021f, B:139:0x024d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9 A[EDGE_INSN: B:42:0x00b9->B:43:0x00ba BREAK  A[LOOP:2: B:37:0x00a0->B:234:?]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    public final String k() {
        String str;
        boolean z;
        String string;
        String strZ;
        e20 e20VarB = b();
        boolean z2 = true;
        if (this.f0 != null) {
            str = null;
        } else {
            Iterator itF = f();
            if (itF == null) {
                this.f0 = de4.d;
                str = null;
            } else {
                ig3 ig3Var = new ig3();
                while (itF.hasNext()) {
                    String str2 = (String) itF.next();
                    if (str2.equals("attribute")) {
                        for (String str3 : e(str2).split("[-_]")) {
                            try {
                                ig3Var.a(str3);
                            } catch (ke4 unused) {
                            }
                        }
                    } else if (str2.length() >= 2) {
                        Object[][] objArr = ux3.a;
                        String strZ2 = gv3.Z(str2);
                        HashMap map = ux3.b;
                        lx3 lx3Var = (lx3) map.get(strZ2);
                        String strZ3 = lx3Var != null ? lx3Var.b : null;
                        if (strZ3 == null && wm8.a(str2)) {
                            strZ3 = gv3.Z(str2);
                        }
                        String strE = e(str2);
                        String strZ4 = gv3.Z(str2);
                        String strZ5 = gv3.Z(strE);
                        lx3 lx3Var2 = (lx3) map.get(strZ4);
                        if (lx3Var2 == null) {
                            strZ = null;
                            break;
                        }
                        sx3 sx3Var = (sx3) lx3Var2.c.get(strZ5);
                        if (sx3Var == null) {
                            EnumSet enumSet = lx3Var2.d;
                            if (enumSet == null) {
                                strZ = null;
                                break;
                            }
                            Iterator it = enumSet.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    strZ = null;
                                    break;
                                }
                                if (((qx3) it.next()).X.v(strZ5)) {
                                    strZ = gv3.Z(strZ5);
                                    break;
                                }
                            }
                        } else {
                            strZ = sx3Var.b;
                        }
                        if (strZ == null) {
                            TreeSet treeSet = wm8.e;
                            int i = 0;
                            while (true) {
                                int iIndexOf = strE.indexOf("-", i);
                                String strSubstring = iIndexOf < 0 ? strE.substring(i) : strE.substring(i, iIndexOf);
                                if (strSubstring.length() < 3 || strSubstring.length() > 8 || !gv3.H(strSubstring)) {
                                    break;
                                }
                                if (iIndexOf < 0) {
                                    if (i >= strE.length()) {
                                        break;
                                    }
                                    strZ = gv3.Z(strE);
                                    break;
                                }
                                i = iIndexOf + 1;
                            }
                        }
                        if (strZ3 != null && strZ != null) {
                            try {
                                ig3Var.g(strZ3, strZ);
                            } catch (ke4 unused2) {
                            }
                        }
                    } else if (str2.length() == 1 && str2.charAt(0) != 'u') {
                        ig3Var.d(str2.charAt(0), e(str2).replace("_", "-"));
                    }
                }
                str = null;
                this.f0 = ig3Var.c();
            }
        }
        de4 de4VarC = this.f0;
        if (e20VarB.d.equalsIgnoreCase("POSIX")) {
            e20VarB = e20.a(e20VarB.a, e20VarB.b, e20VarB.c, _UrlKt.FRAGMENT_ENCODE_SET);
            m62 m62Var = (m62) de4VarC.a.get('u');
            if ((m62Var == null ? str : (String) ((wm8) m62Var).d.get(gv3.Z("va"))) == null) {
                ig3 ig3Var2 = new ig3();
                try {
                    ig3Var2.e(e20.g, de4VarC);
                    ig3Var2.g("va", "posix");
                    de4VarC = ig3Var2.c();
                } catch (ke4 e) {
                    u52.q(e);
                    return str;
                }
            }
        }
        q24 q24Var = new q24();
        String str4 = e20VarB.a;
        String str5 = e20VarB.b;
        String str6 = e20VarB.c;
        String str7 = e20VarB.d;
        if (str4.length() > 0 && q24.a(str4)) {
            if (str4.equals("iw")) {
                str4 = "he";
            } else if (str4.equals("ji")) {
                str4 = "yi";
            } else if (str4.equals("in")) {
                str4 = "id";
            }
            q24Var.a = str4;
        }
        if (str5.length() > 0 && str5.length() == 4 && gv3.I(str5)) {
            q24Var.b = gv3.a0(str5);
            z = true;
        } else {
            z = false;
        }
        if (str6.length() > 0 && q24.c(str6)) {
            q24Var.c = gv3.c0(str6);
            z = true;
        }
        if (str7.length() > 0) {
            us5 us5Var = new us5(str7, "_");
            ?? arrayList = str;
            while (!us5Var.c) {
                String str8 = (String) us5Var.f;
                if (!q24.d(str8)) {
                    break;
                }
                if (arrayList == 0) {
                    arrayList = new ArrayList();
                }
                arrayList.add(gv3.Z(str8));
                us5Var.a();
                arrayList = arrayList;
            }
            if (arrayList != 0) {
                q24Var.f = arrayList;
                z = true;
            }
            if (us5Var.c) {
                string = str;
            } else {
                StringBuilder sb = new StringBuilder();
                while (!us5Var.c) {
                    String str9 = (String) us5Var.f;
                    if (!q24.b(str9)) {
                        break;
                    }
                    if (sb.length() > 0) {
                        sb.append("-");
                    }
                    sb.append(gv3.Z(str9));
                    us5Var.a();
                }
                if (sb.length() > 0) {
                    string = sb.toString();
                } else {
                    string = str;
                }
            }
        } else {
            string = str;
        }
        ?? arrayList2 = str;
        ?? Concat = arrayList2;
        for (Character ch : Collections.unmodifiableSet(de4VarC.a.keySet())) {
            m62 m62VarA = de4VarC.a(ch);
            if (gv3.k("x", String.valueOf(ch.charValue()))) {
                Concat = m62VarA.b;
            } else {
                if (arrayList2 == 0) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(ch.toString() + "-" + m62VarA.b);
            }
        }
        if (arrayList2 != 0) {
            q24Var.g = arrayList2;
        } else {
            z2 = z;
        }
        if (string != null) {
            Concat = Concat == 0 ? "lvariant-".concat(string) : ((String) Concat) + "-lvariant-" + string.replace("_", "-");
        }
        if (Concat != 0) {
            q24Var.d = Concat;
        }
        if (q24Var.a.length() == 0 && (z2 || Concat == 0)) {
            q24Var.a = "und";
        }
        StringBuilder sb2 = new StringBuilder();
        String str10 = q24Var.a;
        if (str10.length() > 0) {
            sb2.append(gv3.Z(str10));
        }
        String str11 = q24Var.b;
        if (str11.length() > 0) {
            sb2.append("-");
            sb2.append(gv3.a0(str11));
        }
        String str12 = q24Var.c;
        if (str12.length() > 0) {
            sb2.append("-");
            sb2.append(gv3.c0(str12));
        }
        ArrayList<String> arrayList3 = new ArrayList(Collections.unmodifiableList(q24Var.f));
        Collections.sort(arrayList3);
        for (String str13 : arrayList3) {
            sb2.append("-");
            sb2.append(gv3.Z(str13));
        }
        for (String str14 : Collections.unmodifiableList(q24Var.g)) {
            sb2.append("-");
            String strZ6 = gv3.Z(str14);
            if (strZ6.startsWith("u-")) {
                while (strZ6.endsWith("-true")) {
                    strZ6 = strZ6.substring(0, strZ6.length() - 5);
                }
                while (true) {
                    int iIndexOf2 = strZ6.indexOf("-true-");
                    if (iIndexOf2 <= 0) {
                        break;
                    }
                    strZ6 = strZ6.substring(0, iIndexOf2).concat(strZ6.substring(iIndexOf2 + 5));
                }
                while (strZ6.endsWith("-yes")) {
                    strZ6 = strZ6.substring(0, strZ6.length() - 4);
                }
                while (true) {
                    int iIndexOf3 = strZ6.indexOf("-yes-");
                    if (iIndexOf3 > 0) {
                        strZ6 = strZ6.substring(0, iIndexOf3).concat(strZ6.substring(iIndexOf3 + 4));
                    }
                }
            }
            sb2.append(strZ6);
        }
        String str15 = q24Var.d;
        if (str15.length() > 0) {
            if (sb2.length() == 0) {
                sb2.append("und");
            }
            sb2.append("-");
            sb2.append("x");
            sb2.append("-");
            sb2.append(gv3.Z(str15));
        }
        return sb2.toString();
    }

    public final Locale n() {
        if (this.X == null) {
            Locale localeForLanguageTag = (b().b.length() > 0 || this.Y.contains("@")) ? Locale.forLanguageTag(gv3.c0(k())) : null;
            if (localeForLanguageTag == null) {
                localeForLanguageTag = new Locale(b().a, b().c, b().d);
            }
            this.X = localeForLanguageTag;
        }
        return this.X;
    }

    public final String toString() {
        return this.Y;
    }

    public sk8(String str, Locale locale) {
        this.Y = str;
        this.X = locale;
    }

    public final Object clone() {
        return this;
    }
}
