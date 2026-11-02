package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class oi0 {
    public static boolean a(int i, int i2, int i3) {
        switch (i) {
            case 1:
                return ((i2 + i3) & 1) == 0;
            case 2:
                return (i2 & 1) == 0;
            case 3:
                return i3 % 3 == 0;
            case 4:
                return (i2 + i3) % 3 == 0;
            case 5:
                return (((i3 / 3) + (i2 / 2)) & 1) == 0;
            case 6:
                return (i2 * i3) % 6 == 0;
            case 7:
                return (i2 * i3) % 6 < 3;
            default:
                return ((((i2 * i3) % 3) + (i2 + i3)) & 1) == 0;
        }
    }

    public static String b(char c, String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static /* synthetic */ byte d(int i) {
        switch (i) {
            case 1:
                return (byte) 0;
            case 2:
                return (byte) 1;
            case 3:
                return (byte) 2;
            case 4:
                return (byte) 3;
            case 5:
                return (byte) 4;
            case 6:
                return (byte) 5;
            case 7:
                return (byte) 6;
            case 8:
                return (byte) 7;
            case 9:
                return (byte) 8;
            case 10:
                return (byte) 9;
            case 11:
                return (byte) 10;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return (byte) 11;
            case 13:
                return (byte) 12;
            case 14:
                return (byte) 13;
            default:
                throw null;
        }
    }

    public static int e(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static u06 f(l91 l91Var, n91 n91Var, int i) {
        return rs1.a(new m91((byte) 0, i, l91Var, n91Var));
    }

    public static u06 g(r91 r91Var, int i) {
        return rs1.a(new j70(r91Var, i));
    }

    public static Object h(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String i(oi5 oi5Var, String str) {
        return str + oi5Var;
    }

    public static String j(zb6 zb6Var, Class cls, StringBuilder sb) {
        sb.append(zb6Var.b(cls));
        return sb.toString();
    }

    public static String k(Object obj, String str) {
        return str + obj;
    }

    public static String l(String str, String str2) {
        return str + str2;
    }

    public static String m(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String n(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String o(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String p(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String q(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static StringBuilder r(int i, String str, int i2, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder s(String str, mh8 mh8Var, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(mh8Var);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder t(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void u(int i, lp2 lp2Var, dx0 dx0Var, lp2 lp2Var2) {
        pn7.m(dx0Var, lp2Var, Integer.valueOf(i));
        pn7.l(lp2Var2);
    }

    public static void v(long j, String str, StringBuilder sb) {
        sb.append((Object) dw0.h(j));
        sb.append(str);
    }

    public static void w(String str, String str2, String str3, String str4, String str5) {
        Color.parseColor(str);
        Color.parseColor(str2);
        Color.parseColor(str3);
        Color.parseColor(str4);
        Color.parseColor(str5);
    }

    public static void x(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void y(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static /* synthetic */ String z(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }
}
