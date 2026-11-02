package defpackage;

import android.util.StateSet;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t23 {
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Serializable d;
    public Serializable e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public t23(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                break;
            default:
                this.d = _UrlKt.FRAGMENT_ENCODE_SET;
                this.e = _UrlKt.FRAGMENT_ENCODE_SET;
                this.b = -1;
                ArrayList arrayList = new ArrayList();
                this.h = arrayList;
                arrayList.add(_UrlKt.FRAGMENT_ENCODE_SET);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [a77[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.io.Serializable, java.lang.Object] */
    public void a(int[] iArr, a77 a77Var) {
        int i = this.b;
        if (i == 0 || iArr.length == 0) {
            this.c = a77Var;
        }
        int[][] iArr2 = (int[][]) this.d;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            ?? r3 = new int[i2][];
            System.arraycopy(iArr2, 0, r3, 0, i);
            this.d = r3;
            ?? r1 = new a77[i2];
            System.arraycopy((a77[]) this.e, 0, r1, 0, i);
            this.e = r1;
        }
        int[][] iArr3 = (int[][]) this.d;
        int i3 = this.b;
        iArr3[i3] = iArr;
        ((a77[]) this.e)[i3] = a77Var;
        this.b = i3 + 1;
    }

    public u23 b() {
        ArrayList arrayList;
        String str = (String) this.c;
        if (str == null) {
            bt.i("scheme == null");
            return null;
        }
        String strK = k32.k((String) this.d, 0, 0, 7);
        String strK2 = k32.k((String) this.e, 0, 0, 7);
        String str2 = (String) this.f;
        if (str2 == null) {
            bt.i("host == null");
            return null;
        }
        int iD = d();
        ArrayList arrayList2 = (ArrayList) this.h;
        ArrayList arrayList3 = new ArrayList(xv0.Z(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(k32.k((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.i;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(xv0.Z(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 != null ? k32.k(str3, 0, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.g;
        return new u23(str, strK, strK2, str2, iD, arrayList3, arrayList, str4 != null ? k32.k(str4, 0, 0, 7) : null, toString());
    }

    public th7 c() {
        if (this.b == 0) {
            return null;
        }
        return new th7(this);
    }

    public int d() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        String str = (String) this.c;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return XRayConfig.DEFAULT_PORT;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [a77[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    public void e() {
        this.c = new a77();
        this.d = new int[10][];
        this.e = new a77[10];
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0027  */
    public void f(u23 u23Var, String str) {
        int i;
        int iF;
        int i2;
        char cCharAt;
        ArrayList arrayList = (ArrayList) this.h;
        byte[] bArr = ks8.a;
        int iL = ks8.l(str, 0, str.length());
        int iM = ks8.m(str, iL, str.length());
        byte b = -1;
        if (iM - iL < 2) {
            i = -1;
            break;
        }
        char cCharAt2 = str.charAt(iL);
        if ((dh3.k(cCharAt2, 97) < 0 || dh3.k(cCharAt2, 122) > 0) && (dh3.k(cCharAt2, 65) < 0 || dh3.k(cCharAt2, 90) > 0)) {
            i = -1;
            break;
        }
        i = iL + 1;
        while (true) {
            if (i < iM) {
                char cCharAt3 = str.charAt(i);
                if (('a' > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && !(('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                    if (cCharAt3 != ':') {
                        break;
                    } else {
                        break;
                    }
                }
                i++;
            }
            i = -1;
            break;
        }
        if (i == -1) {
            if (u23Var == null) {
                bt.q("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? fm7.Q0(6, str).concat("...") : str));
                return;
            }
            this.c = u23Var.a;
        } else if (mm7.Y(str, "https:", iL, true)) {
            this.c = "https";
            iL += 6;
        } else {
            if (!mm7.Y(str, "http:", iL, true)) {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
            }
            this.c = "http";
            iL += 5;
        }
        int i3 = 0;
        for (int i4 = iL; i4 < iM && ((cCharAt = str.charAt(i4)) == '\\' || cCharAt == '/'); i4++) {
            i3++;
        }
        byte b2 = 35;
        if (i3 >= 2 || u23Var == null || !dh3.f(u23Var.a, (String) this.c)) {
            int i5 = iL + i3;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                iF = ks8.f(str, "@/\\?#", i5, iM);
                byte bCharAt = iF != iM ? str.charAt(iF) : b;
                if (bCharAt == b || bCharAt == b2 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (z) {
                        this.e = ((String) this.e) + "%40" + k32.b(str, i5, iF, 240, " \"':;<=>@[]^`{}|/\\?#");
                    } else {
                        int iE = ks8.e(str, ':', i5, iF);
                        String strB = k32.b(str, i5, iE, 240, " \"':;<=>@[]^`{}|/\\?#");
                        if (z2) {
                            strB = oi0.p(new StringBuilder((String) this.d), "%40", strB);
                        }
                        this.d = strB;
                        if (iE != iF) {
                            this.e = k32.b(str, iE + 1, iF, 240, " \"':;<=>@[]^`{}|/\\?#");
                            z = true;
                        }
                        z2 = true;
                    }
                    i5 = iF + 1;
                    b2 = 35;
                    b = -1;
                }
            }
            int i6 = i5;
            while (true) {
                if (i6 >= iF) {
                    i6 = iF;
                    break;
                }
                char cCharAt4 = str.charAt(i6);
                if (cCharAt4 != '[') {
                    if (cCharAt4 == ':') {
                        break;
                    }
                } else {
                    do {
                        i6++;
                        if (i6 >= iF) {
                            break;
                        }
                    } while (str.charAt(i6) != ']');
                }
                i6++;
            }
            int i7 = i6 + 1;
            if (i7 < iF) {
                this.f = nr4.U(k32.k(str, i5, i6, 4));
                try {
                    i2 = Integer.parseInt(k32.b(str, i7, iF, 248, _UrlKt.FRAGMENT_ENCODE_SET));
                    if (1 > i2 || i2 >= 65536) {
                        i2 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.b = i2;
                if (i2 == -1) {
                    u52.f(34, str.substring(i7, iF), "Invalid URL port: \"");
                    return;
                }
            } else {
                this.f = nr4.U(k32.k(str, i5, i6, 4));
                String str2 = (String) this.c;
                str2.getClass();
                this.b = str2.equals("http") ? 80 : str2.equals("https") ? XRayConfig.DEFAULT_PORT : -1;
            }
            if (((String) this.f) == null) {
                u52.f(34, str.substring(i5, i6), "Invalid URL host: \"");
                return;
            }
            iL = iF;
        } else {
            this.d = u23Var.e();
            this.e = u23Var.a();
            this.f = u23Var.d;
            this.b = u23Var.e;
            arrayList.clear();
            arrayList.addAll(u23Var.c());
            if (iL == iM || str.charAt(iL) == '#') {
                String strD = u23Var.d();
                this.i = strD != null ? k32.m(k32.b(strD, 0, 0, 211, _UrlKt.QUERY_ENCODE_SET)) : null;
            }
        }
        int iF2 = ks8.f(str, "?#", iL, iM);
        if (iL != iF2) {
            char cCharAt5 = str.charAt(iL);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add(_UrlKt.FRAGMENT_ENCODE_SET);
                iL++;
            } else {
                arrayList.set(arrayList.size() - 1, _UrlKt.FRAGMENT_ENCODE_SET);
            }
            while (iL < iF2) {
                int iF3 = ks8.f(str, "/\\", iL, iF2);
                boolean z3 = iF3 < iF2;
                String strB2 = k32.b(str, iL, iF3, 240, _UrlKt.PATH_SEGMENT_ENCODE_SET);
                if (!strB2.equals(".") && !strB2.equalsIgnoreCase("%2e")) {
                    if (!strB2.equals("..") && !strB2.equalsIgnoreCase("%2e.") && !strB2.equalsIgnoreCase(".%2e") && !strB2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) oi0.h(1, arrayList)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strB2);
                        } else {
                            arrayList.add(strB2);
                        }
                        if (z3) {
                            arrayList.add(_UrlKt.FRAGMENT_ENCODE_SET);
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add(_UrlKt.FRAGMENT_ENCODE_SET);
                    } else {
                        arrayList.set(arrayList.size() - 1, _UrlKt.FRAGMENT_ENCODE_SET);
                    }
                }
                iL = z3 ? iF3 + 1 : iF3;
            }
        }
        if (iF2 < iM && str.charAt(iF2) == '?') {
            int iE2 = ks8.e(str, '#', iF2, iM);
            this.i = k32.m(k32.b(str, iF2 + 1, iE2, 208, _UrlKt.QUERY_ENCODE_SET));
            iF2 = iE2;
        }
        if (iF2 >= iM || str.charAt(iF2) != '#') {
            return;
        }
        this.g = k32.b(str, iF2 + 1, iM, 176, _UrlKt.FRAGMENT_ENCODE_SET);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                String str = (String) this.c;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (((String) this.d).length() > 0 || ((String) this.e).length() > 0) {
                    sb.append((String) this.d);
                    if (((String) this.e).length() > 0) {
                        sb.append(':');
                        sb.append((String) this.e);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.f;
                if (str2 != null) {
                    if (fm7.e0(str2, ':')) {
                        sb.append('[');
                        sb.append((String) this.f);
                        sb.append(']');
                    } else {
                        sb.append((String) this.f);
                    }
                }
                int i = -1;
                if (this.b != -1 || ((String) this.c) != null) {
                    int iD = d();
                    String str3 = (String) this.c;
                    if (str3 == null) {
                        sb.append(':');
                        sb.append(iD);
                    } else {
                        if (str3.equals("http")) {
                            i = 80;
                        } else if (str3.equals("https")) {
                            i = XRayConfig.DEFAULT_PORT;
                        }
                        if (iD != i) {
                            sb.append(':');
                            sb.append(iD);
                        }
                    }
                }
                ArrayList arrayList = (ArrayList) this.h;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i2));
                }
                if (((ArrayList) this.i) != null) {
                    sb.append('?');
                    ArrayList arrayList2 = (ArrayList) this.i;
                    arrayList2.getClass();
                    if3 if3VarW = x97.W(x97.a0(0, arrayList2.size()), 2);
                    int i3 = if3VarW.X;
                    int i4 = if3VarW.Y;
                    int i5 = if3VarW.Z;
                    if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                        while (true) {
                            String str4 = (String) arrayList2.get(i3);
                            String str5 = (String) arrayList2.get(i3 + 1);
                            if (i3 > 0) {
                                sb.append('&');
                            }
                            sb.append(str4);
                            if (str5 != null) {
                                sb.append('=');
                                sb.append(str5);
                            }
                            if (i3 != i4) {
                                i3 += i5;
                            }
                        }
                    }
                }
                if (((String) this.g) != null) {
                    sb.append('#');
                    sb.append((String) this.g);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public t23(a77 a77Var) {
        this.a = (byte) 1;
        e();
        a(StateSet.WILD_CARD, a77Var);
    }
}
