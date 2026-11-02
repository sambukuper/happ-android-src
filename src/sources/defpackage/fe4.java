package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fe4 {
    public final char[] a;
    public int b;
    public StringBuilder c;
    public boolean d;
    public Map e;

    public fe4(String str) {
        char[] charArray = str.toCharArray();
        this.a = charArray;
        this.b = 0;
        this.c = new StringBuilder(charArray.length + 5);
    }

    public static boolean f(char c) {
        return c == '_' || c == '-' || c == '@' || c == 65535 || c == '.';
    }

    public final void a(char c) {
        this.c.append(c);
    }

    public final boolean b() {
        char c;
        int i = this.b;
        char[] cArr = this.a;
        return i >= cArr.length || (c = cArr[i]) == '@' || c == 65535 || c == '.';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final Map c() {
        Map map;
        char cG;
        char cG2;
        TreeMap treeMap;
        Map map2 = this.e;
        if (map2 != null) {
            return map2;
        }
        int i = this.b;
        while (true) {
            char[] cArr = this.a;
            map = 0;
            map = 0;
            map = 0;
            if (i >= cArr.length) {
                break;
            }
            if (cArr[i] == '@') {
                int i2 = i + 1;
                if (i2 >= cArr.length) {
                    break;
                }
                this.b = i2;
                do {
                    int i3 = this.b;
                    do {
                        cG = g();
                        if (cG == 65535) {
                            break;
                        }
                    } while (cG != '=');
                    int i4 = this.b - 1;
                    this.b = i4;
                    String strZ = gv3.Z(new String(cArr, i3, i4 - i3).trim());
                    if (strZ.length() == 0) {
                        break;
                    }
                    char cG3 = g();
                    if (cG3 != '=') {
                        if (cG3 != 65535) {
                            break;
                        }
                        break;
                    }
                    map = map;
                    int i5 = this.b;
                    do {
                        cG2 = g();
                        if (cG2 == 65535) {
                            break;
                        }
                    } while (cG2 != ';');
                    int i6 = this.b - 1;
                    this.b = i6;
                    String strTrim = new String(cArr, i5, i6 - i5).trim();
                    map = map;
                    if (strTrim.length() != 0) {
                        if (map == 0) {
                            treeMap = new TreeMap(new l71((byte) 26));
                        } else if (!map.containsKey(strZ)) {
                        }
                        map = map;
                        treeMap = map;
                        treeMap.put(strZ, strTrim);
                        map = treeMap;
                    }
                    map = map;
                    treeMap = map;
                } while (g() == ';');
            } else {
                i++;
            }
        }
        if (map == 0) {
            map = Collections.EMPTY_MAP;
        }
        this.e = map;
        return map;
    }

    public final String d() {
        m();
        if (e()) {
            this.b = 2;
        }
        while (!f(g())) {
        }
        this.b--;
        n();
        if (!b()) {
            int i = this.b;
            char c = this.a[i];
            if (c == '_' || c == '-') {
                i++;
                this.b = i;
            }
            while (!f(g())) {
            }
            int i2 = this.b - 1;
            this.b = i2;
            int i3 = i2 - i;
            if (i3 < 2 || i3 > 3) {
                this.b = i;
            }
        }
        return this.c.substring(l());
    }

    public final boolean e() {
        char c;
        char[] cArr = this.a;
        if (cArr.length <= 2 || !((c = cArr[1]) == '-' || c == '_')) {
            return false;
        }
        char c2 = cArr[0];
        return c2 == 'x' || c2 == 'X' || c2 == 'i' || c2 == 'I';
    }

    public final char g() {
        int i = this.b;
        char[] cArr = this.a;
        if (i == cArr.length) {
            this.b = i + 1;
            return (char) 65535;
        }
        this.b = i + 1;
        return cArr[i];
    }

    public final void h() {
        m();
        j();
        k();
        i();
        l();
        int length = this.c.length();
        if (length > 0) {
            int i = length - 1;
            if (this.c.charAt(i) == '_') {
                this.c.deleteCharAt(i);
            }
        }
    }

    public final int i() {
        String str;
        if (b()) {
            return this.c.length();
        }
        int i = this.b;
        this.b = i + 1;
        int length = this.c.length();
        boolean z = true;
        while (true) {
            char cG = g();
            if (f(cG)) {
                break;
            }
            if (z) {
                this.d = true;
                a('_');
                length++;
                z = false;
            }
            a(gv3.b0(cG));
        }
        this.b--;
        int length2 = this.c.length() - length;
        if (length2 != 0) {
            if (length2 < 2 || length2 > 3) {
                this.b = i;
                int i2 = length - 1;
                StringBuilder sb = this.c;
                sb.delete(i2, sb.length());
                this.d = false;
                return i2;
            }
            if (length2 == 3) {
                String strSubstring = this.c.substring(length);
                int iT = pu.t(strSubstring, pu.x);
                if (iT >= 0) {
                    str = pu.v[iT];
                } else {
                    int iT2 = pu.t(strSubstring, pu.y);
                    str = iT2 >= 0 ? pu.w[iT2] : null;
                }
                if (str != null) {
                    StringBuilder sb2 = this.c;
                    sb2.delete(length, sb2.length());
                    this.c.insert(length, str);
                }
            }
        }
        return length;
    }

    public final void j() {
        String str;
        int length = this.c.length();
        if (e()) {
            a(gv3.Y(this.a[0]));
            a('-');
            this.b = 2;
        }
        while (true) {
            char cG = g();
            if (f(cG)) {
                break;
            } else {
                a(gv3.Y(cG));
            }
        }
        this.b--;
        if (this.c.length() - length == 3) {
            String strSubstring = this.c.substring(0);
            int iT = pu.t(strSubstring, pu.t);
            if (iT >= 0) {
                str = pu.r[iT];
            } else {
                int iT2 = pu.t(strSubstring, pu.u);
                str = iT2 >= 0 ? pu.s[iT2] : null;
            }
            if (str != null) {
                StringBuilder sb = this.c;
                sb.delete(0, sb.length());
                this.c.insert(0, str);
            }
        }
    }

    public final int k() {
        if (b()) {
            return this.c.length();
        }
        int i = this.b;
        this.b = i + 1;
        int length = this.c.length();
        boolean z = true;
        while (true) {
            char cG = g();
            if (f(cG) || !gv3.F(cG)) {
                break;
            }
            if (z) {
                a('_');
                a(gv3.b0(cG));
                z = false;
            } else {
                a(gv3.Y(cG));
            }
        }
        int i2 = this.b - 1;
        this.b = i2;
        if (i2 - i == 5) {
            return length + 1;
        }
        this.b = i;
        StringBuilder sb = this.c;
        sb.delete(length, sb.length());
        return length;
    }

    public final int l() {
        int length = this.c.length();
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = false;
        loop0: while (true) {
            char cG = g();
            if (cG == 65535) {
                break;
            }
            if (cG == '.') {
                z4 = true;
            } else if (cG == '@') {
                int i = this.b;
                while (true) {
                    char[] cArr = this.a;
                    if (i >= cArr.length) {
                        z2 = true;
                        z = false;
                        z4 = false;
                        break;
                    }
                    if (cArr[i] == '=') {
                        break loop0;
                    }
                    i++;
                }
            } else {
                char c = '_';
                if (z) {
                    if (cG != '_' && cG != '-') {
                        this.b--;
                    }
                } else if (z4) {
                    continue;
                } else {
                    if (z2) {
                        if (z3 && !this.d) {
                            a('_');
                            length++;
                        }
                        a('_');
                        if (z3) {
                            length++;
                            z2 = false;
                            z3 = false;
                        } else {
                            z2 = false;
                        }
                    }
                    char cB0 = gv3.b0(cG);
                    if (cB0 != '-' && cB0 != ',') {
                        c = cB0;
                    }
                    a(c);
                    if (this.c.length() - length > 179) {
                        bt.q("variants is too long");
                        return 0;
                    }
                }
            }
            z = false;
        }
        this.b--;
        return length;
    }

    public final void m() {
        this.b = 0;
        this.c = new StringBuilder(this.a.length + 5);
    }

    public final void n() {
        char cG;
        if (b()) {
            return;
        }
        int i = this.b;
        this.b = i + 1;
        do {
            cG = g();
            if (f(cG)) {
                break;
            }
        } while (gv3.F(cG));
        int i2 = this.b - 1;
        this.b = i2;
        if (i2 - i != 5) {
            this.b = i;
        }
    }
}
