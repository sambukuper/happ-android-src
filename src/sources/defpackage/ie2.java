package defpackage;

import android.os.Parcel;
import java.util.ArrayList;
import org.conscrypt.OpenSSLProvider;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ie2 {
    public static final boolean a(int i, int i2) {
        return (b(i) & i2) != 0;
    }

    public static final int b(int i) {
        return 1 << p61.B(i);
    }

    public static /* synthetic */ boolean c(int i) {
        if (i == 1 || i == 2) {
            return false;
        }
        if (i == 3 || i == 4) {
            return true;
        }
        throw null;
    }

    public static o14 d(String str) {
        zc3.b(str);
        return new o14();
    }

    public static nx7 e(ArrayList arrayList, nx7 nx7Var) {
        arrayList.add(nx7Var);
        return new nx7();
    }

    public static String f(long j, String str) {
        return str + j;
    }

    public static String g(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String h(String str, int i, String str2) {
        return str + i + str2;
    }

    public static String i(String str, qk2 qk2Var, String str2) {
        return str + qk2Var + str2;
    }

    public static String j(OpenSSLProvider openSSLProvider, String str, String str2, String str3, String str4) {
        openSSLProvider.put(str, str2);
        return str3 + str4;
    }

    public static StringBuilder k(String str, float f, String str2, float f2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder l(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder m(OpenSSLProvider openSSLProvider, String str, String str2, String str3, String str4) {
        openSSLProvider.put(str, str2);
        openSSLProvider.put(str3, str4);
        return new StringBuilder();
    }

    public static void n(int i, int i2, int i3, int i4, int i5) {
        pu.d(i);
        pu.d(i2);
        pu.d(i3);
        pu.d(i4);
        pu.d(i5);
    }

    public static void o(nx7 nx7Var, rx7 rx7Var, qx7 qx7Var, ox7 ox7Var, jl7 jl7Var) {
        nx7Var.a(rx7Var);
        nx7Var.a(we5.f(qx7Var, ox7Var, jl7Var));
    }

    public static void p(Parcel parcel, int i, Boolean bool) {
        parcel.writeInt(i);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void q(StringBuilder sb, String str, String str2, OpenSSLProvider openSSLProvider, String str3) {
        sb.append(str);
        sb.append(str2);
        openSSLProvider.put(str3, sb.toString());
    }

    public static /* synthetic */ String r(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
