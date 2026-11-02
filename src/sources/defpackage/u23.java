package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u23 {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final String g;
    public final String h;
    public final boolean i;

    public u23(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        str.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList2;
        this.g = str5;
        this.h = str6;
        this.i = str.equals("https");
    }

    public final String a() {
        if (this.c.length() == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(fm7.l0(str, ':', length, 4) + 1, fm7.l0(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.h;
        int iL0 = fm7.l0(str, '/', length, 4);
        return str.substring(iL0, ks8.f(str, "?#", iL0, str.length()));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.h;
        int iL0 = fm7.l0(str, '/', length, 4);
        int iF = ks8.f(str, "?#", iL0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iL0 < iF) {
            int i = iL0 + 1;
            int iE = ks8.e(str, '/', i, iF);
            arrayList.add(str.substring(i, iE));
            iL0 = iE;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f == null) {
            return null;
        }
        String str = this.h;
        int iL0 = fm7.l0(str, '?', 0, 6) + 1;
        return str.substring(iL0, ks8.e(str, '#', iL0, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        int length = this.a.length() + 3;
        String str = this.h;
        return str.substring(length, ks8.f(str, ":@", length, str.length()));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u23) && ((u23) obj).h.equals(this.h);
    }

    public final URI f() {
        String strSubstring;
        String strReplaceAll;
        t23 t23Var = new t23((byte) 0);
        ArrayList arrayList = (ArrayList) t23Var.h;
        String str = this.a;
        t23Var.c = str;
        t23Var.d = e();
        t23Var.e = a();
        t23Var.f = this.d;
        str.getClass();
        int i = str.equals("http") ? 80 : str.equals("https") ? XRayConfig.DEFAULT_PORT : -1;
        int i2 = this.e;
        t23Var.b = i2 != i ? i2 : -1;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        t23Var.i = strD != null ? k32.m(k32.b(strD, 0, 0, 211, _UrlKt.QUERY_ENCODE_SET)) : null;
        if (this.g == null) {
            strSubstring = null;
        } else {
            String str2 = this.h;
            strSubstring = str2.substring(fm7.l0(str2, '#', 0, 6) + 1);
        }
        t23Var.g = strSubstring;
        String str3 = (String) t23Var.f;
        if (str3 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            patternCompile.getClass();
            strReplaceAll = patternCompile.matcher(str3).replaceAll(_UrlKt.FRAGMENT_ENCODE_SET);
            strReplaceAll.getClass();
        } else {
            strReplaceAll = null;
        }
        t23Var.f = strReplaceAll;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, k32.b((String) arrayList.get(i3), 0, 0, 227, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI));
        }
        ArrayList arrayList2 = (ArrayList) t23Var.i;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str4 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str4 != null ? k32.b(str4, 0, 0, 195, _UrlKt.QUERY_COMPONENT_ENCODE_SET_URI) : null);
            }
        }
        String str5 = (String) t23Var.g;
        t23Var.g = str5 != null ? k32.b(str5, 0, 0, 163, _UrlKt.FRAGMENT_ENCODE_SET_URI) : null;
        String string = t23Var.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                patternCompile2.getClass();
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll(_UrlKt.FRAGMENT_ENCODE_SET);
                strReplaceAll2.getClass();
                URI uriCreate = URI.create(strReplaceAll2);
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                u52.q(e);
                return null;
            }
        }
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h;
    }
}
