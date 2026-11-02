package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ig3 {
    public static final gg3 h = new gg3("x".charAt(0));
    public String a = _UrlKt.FRAGMENT_ENCODE_SET;
    public String b = _UrlKt.FRAGMENT_ENCODE_SET;
    public String c = _UrlKt.FRAGMENT_ENCODE_SET;
    public String d = _UrlKt.FRAGMENT_ENCODE_SET;
    public HashMap e;
    public HashSet f;
    public HashMap g;

    public final void a(String str) {
        if (str != null) {
            TreeSet treeSet = wm8.e;
            if (str.length() >= 3 && str.length() <= 8 && gv3.H(str)) {
                HashSet hashSet = this.f;
                if (hashSet == null) {
                    hashSet = new HashSet(4);
                    this.f = hashSet;
                }
                hashSet.add(new hg3(str));
                return;
            }
        }
        throw new ke4(oi0.l("Ill-formed Unicode locale attribute: ", str));
    }

    public final void b() {
        HashMap map = this.e;
        if (map != null) {
            map.clear();
        }
        HashSet hashSet = this.f;
        if (hashSet != null) {
            hashSet.clear();
        }
        HashMap map2 = this.g;
        if (map2 != null) {
            map2.clear();
        }
    }

    public final de4 c() {
        HashSet hashSet;
        HashMap map;
        TreeSet treeSet;
        TreeMap treeMap;
        HashMap map2 = this.e;
        if ((map2 == null || map2.size() == 0) && (((hashSet = this.f) == null || hashSet.size() == 0) && ((map = this.g) == null || map.size() == 0))) {
            return de4.d;
        }
        HashMap map3 = this.e;
        HashSet hashSet2 = this.f;
        HashMap map4 = this.g;
        SortedMap sortedMap = de4.c;
        de4 de4Var = new de4();
        boolean z = map3 != null && map3.size() > 0;
        boolean z2 = hashSet2 != null && hashSet2.size() > 0;
        boolean z3 = map4 != null && map4.size() > 0;
        if (!z && !z2 && !z3) {
            de4Var.a = sortedMap;
            de4Var.b = _UrlKt.FRAGMENT_ENCODE_SET;
            return de4Var;
        }
        de4Var.a = new TreeMap();
        if (z) {
            for (Map.Entry entry : map3.entrySet()) {
                char cY = gv3.Y(((gg3) entry.getKey()).a);
                String strSubstring = (String) entry.getValue();
                HashMap map5 = q24.h;
                if (gv3.k("x", String.valueOf(cY))) {
                    us5 us5Var = new us5(strSubstring, "-");
                    int i = -1;
                    int i2 = -1;
                    while (!us5Var.c) {
                        if (i2 != i) {
                            if (i2 != 0) {
                                strSubstring = strSubstring.substring(0, i2 - 1);
                                break;
                            }
                            strSubstring = null;
                            break;
                        }
                        if (gv3.k((String) us5Var.f, "lvariant")) {
                            i2 = us5Var.a;
                        }
                        us5Var.a();
                        i = -1;
                    }
                    if (strSubstring == null) {
                    }
                }
                String strZ = gv3.Z(strSubstring);
                m62 m62Var = new m62();
                m62Var.a = cY;
                m62Var.b = strZ;
                de4Var.a.put(Character.valueOf(cY), m62Var);
            }
        }
        if (z2 || z3) {
            if (z2) {
                treeSet = new TreeSet();
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    treeSet.add(gv3.Z(((hg3) it.next()).a));
                }
            } else {
                treeSet = null;
            }
            if (z3) {
                treeMap = new TreeMap();
                for (Map.Entry entry2 : map4.entrySet()) {
                    treeMap.put(gv3.Z(((hg3) entry2.getKey()).a), gv3.Z((String) entry2.getValue()));
                }
            } else {
                treeMap = null;
            }
            wm8 wm8Var = new wm8();
            if (treeSet != null && treeSet.size() > 0) {
                wm8Var.c = treeSet;
            }
            if (treeMap != null && treeMap.size() > 0) {
                wm8Var.d = treeMap;
            }
            if (wm8Var.c.size() > 0 || wm8Var.d.size() > 0) {
                StringBuilder sb = new StringBuilder();
                for (String str : wm8Var.c) {
                    sb.append("-");
                    sb.append(str);
                }
                for (Map.Entry entry3 : wm8Var.d.entrySet()) {
                    String str2 = (String) entry3.getKey();
                    String str3 = (String) entry3.getValue();
                    sb.append("-");
                    sb.append(str2);
                    if (str3.length() > 0) {
                        sb.append("-");
                        sb.append(str3);
                    }
                }
                wm8Var.b = sb.substring(1);
            }
            de4Var.a.put('u', wm8Var);
        }
        if (de4Var.a.size() == 0) {
            de4Var.a = sortedMap;
            de4Var.b = _UrlKt.FRAGMENT_ENCODE_SET;
            return de4Var;
        }
        SortedMap sortedMap2 = de4Var.a;
        StringBuilder sb2 = new StringBuilder();
        m62 m62Var2 = null;
        for (Map.Entry entry4 : sortedMap2.entrySet()) {
            char cCharValue = ((Character) entry4.getKey()).charValue();
            m62 m62Var3 = (m62) entry4.getValue();
            HashMap map6 = q24.h;
            if (gv3.k("x", String.valueOf(cCharValue))) {
                m62Var2 = m62Var3;
            } else {
                if (sb2.length() > 0) {
                    sb2.append("-");
                }
                sb2.append(m62Var3);
            }
        }
        if (m62Var2 != null) {
            if (sb2.length() > 0) {
                sb2.append("-");
            }
            sb2.append(m62Var2);
        }
        de4Var.b = sb2.toString();
        return de4Var;
    }

    public final void d(char c, String str) {
        boolean zB;
        HashMap map = q24.h;
        boolean zK = gv3.k("x", String.valueOf(c));
        if (!zK) {
            String strValueOf = String.valueOf(c);
            if (strValueOf.length() != 1 || !gv3.H(strValueOf) || gv3.k("x", strValueOf)) {
                throw new ke4("Ill-formed extension key: " + c);
            }
        }
        boolean z = str == null || str.length() == 0;
        gg3 gg3Var = new gg3(c);
        if (z) {
            TreeSet treeSet = wm8.e;
            if ('u' != gv3.Y(c)) {
                HashMap map2 = this.e;
                if (map2 == null || !map2.containsKey(gg3Var)) {
                    return;
                }
                this.e.remove(gg3Var);
                return;
            }
            HashSet hashSet = this.f;
            if (hashSet != null) {
                hashSet.clear();
            }
            HashMap map3 = this.g;
            if (map3 != null) {
                map3.clear();
                return;
            }
            return;
        }
        String strReplaceAll = str.replaceAll("_", "-");
        us5 us5Var = new us5(strReplaceAll, "-");
        while (!us5Var.c) {
            String str2 = (String) us5Var.f;
            if (zK) {
                zB = q24.b(str2);
            } else {
                zB = str2.length() >= 2 && str2.length() <= 8 && gv3.H(str2);
            }
            if (!zB) {
                throw new ke4(oi0.l("Ill-formed extension value: ", str2));
            }
            us5Var.a();
        }
        TreeSet treeSet2 = wm8.e;
        if ('u' == gv3.Y(gg3Var.a)) {
            f(strReplaceAll);
            return;
        }
        HashMap map4 = this.e;
        if (map4 == null) {
            map4 = new HashMap(4);
            this.e = map4;
        }
        map4.put(gg3Var, strReplaceAll);
    }

    public final void e(e20 e20Var, de4 de4Var) {
        int i;
        String str = e20Var.a;
        String str2 = e20Var.b;
        String str3 = e20Var.c;
        String str4 = e20Var.d;
        if (str.length() > 0 && !q24.a(str)) {
            throw new ke4("Ill-formed language: ".concat(str));
        }
        if (str2.length() > 0) {
            HashMap map = q24.h;
            if (str2.length() != 4 || !gv3.I(str2)) {
                throw new ke4("Ill-formed script: ".concat(str2));
            }
        }
        if (str3.length() > 0 && !q24.c(str3)) {
            throw new ke4("Ill-formed region: ".concat(str3));
        }
        if (str4.length() > 0) {
            us5 us5Var = new us5(str4, "_");
            while (true) {
                if (us5Var.c) {
                    i = -1;
                    break;
                } else {
                    if (!q24.d((String) us5Var.f)) {
                        i = us5Var.a;
                        break;
                    }
                    us5Var.a();
                }
            }
            if (i != -1) {
                throw new ke4("Ill-formed variant: ".concat(str4));
            }
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        b();
        Set<Character> setUnmodifiableSet = de4Var == null ? null : Collections.unmodifiableSet(de4Var.a.keySet());
        if (setUnmodifiableSet != null) {
            for (Character ch : setUnmodifiableSet) {
                m62 m62VarA = de4Var.a(ch);
                if (m62VarA instanceof wm8) {
                    wm8 wm8Var = (wm8) m62VarA;
                    for (String str5 : Collections.unmodifiableSet(wm8Var.c)) {
                        HashSet hashSet = this.f;
                        if (hashSet == null) {
                            hashSet = new HashSet(4);
                            this.f = hashSet;
                        }
                        hashSet.add(new hg3(str5));
                    }
                    for (String str6 : Collections.unmodifiableSet(wm8Var.d.keySet())) {
                        HashMap map2 = this.g;
                        if (map2 == null) {
                            map2 = new HashMap(4);
                            this.g = map2;
                        }
                        map2.put(new hg3(str6), (String) wm8Var.d.get(str6));
                    }
                } else {
                    HashMap map3 = this.e;
                    if (map3 == null) {
                        map3 = new HashMap(4);
                        this.e = map3;
                    }
                    map3.put(new gg3(ch.charValue()), m62VarA.b);
                }
            }
        }
    }

    public final void f(String str) {
        HashSet hashSet = this.f;
        if (hashSet != null) {
            hashSet.clear();
        }
        HashMap map = this.g;
        if (map != null) {
            map.clear();
        }
        us5 us5Var = new us5(str, "-");
        while (!us5Var.c) {
            String str2 = (String) us5Var.f;
            TreeSet treeSet = wm8.e;
            if (str2.length() < 3 || str2.length() > 8 || !gv3.H(str2)) {
                break;
            }
            HashSet hashSet2 = this.f;
            if (hashSet2 == null) {
                hashSet2 = new HashSet(4);
                this.f = hashSet2;
            }
            hashSet2.add(new hg3((String) us5Var.f));
            us5Var.a();
        }
        hg3 hg3Var = null;
        int i = -1;
        int i2 = -1;
        while (!us5Var.c) {
            String str3 = (String) us5Var.f;
            String strSubstring = _UrlKt.FRAGMENT_ENCODE_SET;
            if (hg3Var != null) {
                if (wm8.a(str3)) {
                    String strSubstring2 = i == -1 ? _UrlKt.FRAGMENT_ENCODE_SET : str.substring(i, i2);
                    HashMap map2 = this.g;
                    if (map2 == null) {
                        map2 = new HashMap(4);
                        this.g = map2;
                    }
                    map2.put(hg3Var, strSubstring2);
                    hg3Var = new hg3((String) us5Var.f);
                    if (this.g.containsKey(hg3Var)) {
                        hg3Var = null;
                    }
                    i = -1;
                    i2 = -1;
                } else {
                    if (i == -1) {
                        i = us5Var.a;
                    }
                    i2 = us5Var.b;
                }
            } else if (wm8.a(str3)) {
                hg3Var = new hg3((String) us5Var.f);
                HashMap map3 = this.g;
                if (map3 != null && map3.containsKey(hg3Var)) {
                    hg3Var = null;
                }
            }
            if (us5Var.b >= ((String) us5Var.d).length()) {
                if (hg3Var != null) {
                    if (i != -1) {
                        strSubstring = str.substring(i, i2);
                    }
                    HashMap map4 = this.g;
                    if (map4 == null) {
                        map4 = new HashMap(4);
                        this.g = map4;
                    }
                    map4.put(hg3Var, strSubstring);
                    return;
                }
                return;
            }
            us5Var.a();
        }
    }

    public final void g(String str, String str2) {
        if (!wm8.a(str)) {
            throw new ke4("Ill-formed Unicode locale keyword key: ".concat(str));
        }
        hg3 hg3Var = new hg3(str);
        if (str2.length() != 0) {
            us5 us5Var = new us5(str2.replaceAll("_", "-"), "-");
            while (!us5Var.c) {
                String str3 = (String) us5Var.f;
                if (str3.length() < 3 || str3.length() > 8 || !gv3.H(str3)) {
                    throw new ke4("Ill-formed Unicode locale keyword type: ".concat(str2));
                }
                us5Var.a();
            }
        }
        HashMap map = this.g;
        if (map == null) {
            map = new HashMap(4);
            this.g = map;
        }
        map.put(hg3Var, str2);
    }
}
