package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class fm7 extends mm7 {
    public static final void A0(int i) {
        if (i >= 0) {
            return;
        }
        em7.c(pc6.j(i, "Limit must be non-negative, but was "));
    }

    public static StringBuilder B0(CharSequence charSequence) {
        charSequence.getClass();
        return new StringBuilder(charSequence).reverse();
    }

    public static String C0(kf3 kf3Var) {
        return kf3Var.isEmpty() ? _UrlKt.FRAGMENT_ENCODE_SET : "VH0XpYUm2LZyH1MG".substring(kf3Var.X, kf3Var.Y + 1);
    }

    public static final List D0(CharSequence charSequence, String str, int i) {
        A0(i);
        int iJ0 = j0(charSequence, str, 0, false);
        if (iJ0 == -1 || i == 1) {
            return i21.K(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iJ0).toString());
            length = str.length() + iJ0;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iJ0 = j0(charSequence, str, length, false);
        } while (iJ0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List E0(CharSequence charSequence, char[] cArr) {
        charSequence.getClass();
        if (cArr.length == 1) {
            return D0(charSequence, String.valueOf(cArr[0]), 0);
        }
        ci1 ci1VarV0 = v0(charSequence, cArr);
        ArrayList arrayList = new ArrayList(xv0.Z(new gu(ci1VarV0, (byte) 2), 10));
        Iterator it = ci1VarV0.iterator();
        while (it.hasNext()) {
            arrayList.add(I0(charSequence, (kf3) it.next()));
        }
        return arrayList;
    }

    public static List F0(CharSequence charSequence, String[] strArr, int i) {
        byte b = 2;
        int i2 = (i & 4) != 0 ? 0 : 2;
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() > 0) {
                return D0(charSequence, str, i2);
            }
        }
        A0(i2);
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        ci1 ci1Var = new ci1(charSequence, i2, new b1(listAsList, (byte) 25));
        ArrayList arrayList = new ArrayList(xv0.Z(new gu(ci1Var, b), 10));
        Iterator it = ci1Var.iterator();
        while (it.hasNext()) {
            arrayList.add(I0(charSequence, (kf3) it.next()));
        }
        return arrayList;
    }

    public static boolean G0(char c, String str) {
        str.getClass();
        return str.length() > 0 && km4.z(str.charAt(0), c, false);
    }

    public static boolean H0(CharSequence charSequence, String str) {
        return charSequence instanceof String ? mm7.Z(str, false, (String) charSequence) : w0(str, 0, charSequence, 0, charSequence.length(), false);
    }

    public static final String I0(CharSequence charSequence, kf3 kf3Var) {
        charSequence.getClass();
        kf3Var.getClass();
        return charSequence.subSequence(kf3Var.X, kf3Var.Y + 1).toString();
    }

    public static String J0(String str, String str2) {
        str.getClass();
        str2.getClass();
        str.getClass();
        int iM0 = m0(str, str2, 0, false, 6);
        return iM0 == -1 ? str : str.substring(str2.length() + iM0, str.length());
    }

    public static String K0(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int iQ0 = q0(str, c, 0, 6);
        return iQ0 == -1 ? str2 : str.substring(iQ0 + 1, str.length());
    }

    public static String L0(String str, String str2) {
        int iR0 = r0(str, str2, 0, 6);
        return iR0 == -1 ? str : str.substring(str2.length() + iR0, str.length());
    }

    public static String M0(char c, String str) {
        str.getClass();
        str.getClass();
        int iL0 = l0(str, c, 0, 6);
        return iL0 == -1 ? str : str.substring(0, iL0);
    }

    public static String N0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iM0 = m0(str, str2, 0, false, 6);
        return iM0 == -1 ? str : str.substring(0, iM0);
    }

    public static String O0(char c, String str) {
        int iQ0 = q0(str, c, 0, 6);
        return iQ0 == -1 ? str : str.substring(0, iQ0);
    }

    public static CharSequence P0(CharSequence charSequence, int i) {
        charSequence.getClass();
        if (i < 0) {
            em7.c(ie2.h("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = charSequence.length();
        if (i > length) {
            i = length;
        }
        return charSequence.subSequence(0, i);
    }

    public static String Q0(int i, String str) {
        str.getClass();
        if (i < 0) {
            em7.c(ie2.h("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static CharSequence R0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zA0 = km4.a0(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zA0) {
                    break;
                }
                length--;
            } else if (zA0) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static CharSequence S0(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!km4.a0(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return _UrlKt.FRAGMENT_ENCODE_SET;
    }

    public static ArrayList T0(CharSequence charSequence, int i, int i2, boolean z) {
        w79.j(i, i2);
        int length = charSequence.length();
        int i3 = 0;
        ArrayList arrayList = new ArrayList((length / i2) + (length % i2 == 0 ? 0 : 1));
        while (i3 >= 0 && i3 < length) {
            int i4 = i3 + i;
            if (i4 < 0 || i4 > length) {
                if (!z) {
                    break;
                }
                i4 = length;
            }
            CharSequence charSequenceSubSequence = charSequence.subSequence(i3, i4);
            charSequenceSubSequence.getClass();
            arrayList.add(charSequenceSubSequence.toString());
            i3 += i2;
        }
        return arrayList;
    }

    public static boolean d0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (m0(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (k0(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean e0(CharSequence charSequence, char c) {
        charSequence.getClass();
        return l0(charSequence, c, 0, 2) >= 0;
    }

    public static String f0(int i, String str) {
        str.getClass();
        if (i < 0) {
            em7.c(ie2.h("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    public static String g0(int i, String str) {
        str.getClass();
        if (i < 0) {
            em7.c(ie2.h("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = str.length() - i;
        if (length < 0) {
            length = 0;
        }
        return Q0(length, str);
    }

    public static boolean h0(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && km4.z(charSequence.charAt(charSequence.length() - 1), c, false);
    }

    public static boolean i0(CharSequence charSequence, String str) {
        return charSequence instanceof String ? mm7.R((String) charSequence, false, str) : w0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static final int j0(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? k0(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int k0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        if3 if3Var;
        if (z2) {
            charSequence.getClass();
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            if3Var = new if3(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length2 = charSequence.length();
            if (i2 > length2) {
                i2 = length2;
            }
            if3Var = new kf3(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = if3Var.Z;
        int i4 = if3Var.Y;
        int i5 = if3Var.X;
        if (!z3 || !(charSequence2 instanceof String)) {
            boolean z4 = z;
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z5 = z4;
                    z4 = z5;
                    if (w0(charSequence4, 0, charSequence3, i5, charSequence2.length(), z5)) {
                        return i5;
                    }
                    if (i5 != i4) {
                        i5 += i3;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z6 = z;
                if (mm7.U(0, i6, str.length(), str, (String) charSequence, z6)) {
                    return i6;
                }
                if (i6 != i4) {
                    i6 += i3;
                    z = z6;
                }
            }
        }
        return -1;
    }

    public static int l0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? n0(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int m0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return j0(charSequence, str, i, z);
    }

    public static final int n0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(eu.C0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (km4.z(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static boolean o0(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!km4.a0(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char p0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        em7.g("Char sequence is empty.");
        return (char) 0;
    }

    public static int q0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            charSequence.getClass();
            i = charSequence.length() - 1;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(eu.C0(cArr), i);
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (km4.z(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int r0(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            charSequence.getClass();
            i = charSequence.length() - 1;
        }
        int i3 = i;
        charSequence.getClass();
        str.getClass();
        return !(charSequence instanceof String) ? k0(charSequence, str, i3, 0, false, true) : ((String) charSequence).lastIndexOf(str, i3);
    }

    public static List s0(CharSequence charSequence) {
        la4 la4Var = new la4(charSequence);
        if (!la4Var.hasNext()) {
            return d02.X;
        }
        Object next = la4Var.next();
        if (!la4Var.hasNext()) {
            return i21.K(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (la4Var.hasNext()) {
            arrayList.add(la4Var.next());
        }
        return arrayList;
    }

    public static String t0(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            bt.q(ie2.h("Desired length ", i, " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(' ');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static String u0(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            bt.q(ie2.h("Desired length ", i, " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static ci1 v0(CharSequence charSequence, char[] cArr) {
        A0(0);
        return new ci1(charSequence, 0, new b1(cArr, (byte) 24));
    }

    public static final boolean w0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!km4.z(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String x0(CharSequence charSequence, String str) {
        str.getClass();
        return H0(charSequence, str) ? str.substring(charSequence.length()) : str;
    }

    public static String y0(String str, String str2) {
        str.getClass();
        return i0(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static String z0(String str, String str2, String str3) {
        str.getClass();
        return (str.length() >= str3.length() + str2.length() && H0(str2, str) && i0(str, str3)) ? str.substring(str2.length(), str.length() - str3.length()) : str;
    }
}
