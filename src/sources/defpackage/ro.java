package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.RandomAccess;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ro {
    public static final String a;
    public static final String b;
    public static final String c;

    static {
        ArrayList<List> arrayList;
        Collection collectionU;
        n22 n22Var = u47.Z;
        ArrayList arrayList2 = new ArrayList(xv0.Z(n22Var, 10));
        w1 w1Var = new w1(n22Var, (byte) 0);
        while (w1Var.hasNext()) {
            arrayList2.add(((u47) w1Var.next()).X);
        }
        String strValueOf = String.valueOf(1415344234);
        ArrayList arrayList3 = new ArrayList(strValueOf.length());
        for (int i = 0; i < strValueOf.length(); i++) {
            arrayList3.add(Integer.valueOf(Integer.parseInt(String.valueOf(strValueOf.charAt(i)))));
        }
        List listY0 = wv0.Y0(arrayList2);
        w79.j(2, 2);
        byte b2 = 1;
        if (listY0 instanceof RandomAccess) {
            int size = listY0.size();
            arrayList = new ArrayList((size / 2) + (size % 2 == 0 ? 0 : 1));
            for (int i2 = 0; i2 >= 0 && i2 < size; i2 += 2) {
                int i3 = size - i2;
                if (2 <= i3) {
                    i3 = 2;
                }
                if (i3 < 2) {
                    break;
                }
                ArrayList arrayList4 = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    arrayList4.add(listY0.get(i4 + i2));
                }
                arrayList.add(arrayList4);
            }
        } else {
            arrayList = new ArrayList();
            Iterator it = listY0.iterator();
            it.getClass();
            Iterator itP = !it.hasNext() ? c02.X : jm4.P(new nm3(it, null, b2));
            while (itP.hasNext()) {
                arrayList.add((List) itP.next());
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (List list : arrayList) {
            bw0.d0(arrayList5, i21.L((String) list.get(0), fm7.B0((String) list.get(1)).toString()));
        }
        a = wv0.y0(wv0.e1(arrayList5, arrayList3), _UrlKt.FRAGMENT_ENCODE_SET, null, null, new h80((byte) 22), 30);
        String upperCase = fm7.B0("rv_SAGGIN").toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        String strReplace = upperCase.replace('_', 'S');
        strReplace.getClass();
        int length = strReplace.length();
        if (length == 0) {
            collectionU = m02.X;
        } else if (length != 1) {
            int length2 = strReplace.length();
            if (length2 > 128) {
                length2 = 128;
            }
            collectionU = new LinkedHashSet(aq4.G(length2));
            for (int i5 = 0; i5 < strReplace.length(); i5++) {
                collectionU.add(Character.valueOf(strReplace.charAt(i5)));
            }
        } else {
            collectionU = w45.U(Character.valueOf(strReplace.charAt(0)));
        }
        b = fm7.B0(wv0.y0(wv0.o0(collectionU, 5), _UrlKt.FRAGMENT_ENCODE_SET, "M", null, null, 60)).toString();
        String lowerCase = fm7.B0("GH").toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String strG0 = fm7.g0(2, "8D4Z67ZIGH");
        ArrayList arrayList6 = new ArrayList(strG0.length());
        for (int i6 = 0; i6 < strG0.length(); i6++) {
            char cCharAt = strG0.charAt(i6);
            boolean zIsDigit = Character.isDigit(cCharAt);
            String strValueOf2 = String.valueOf(cCharAt);
            if (zIsDigit) {
                strValueOf2 = String.valueOf(Integer.parseInt(strValueOf2) - 1);
            }
            arrayList6.add(strValueOf2);
        }
        String lowerCase2 = lowerCase.concat(wv0.y0(arrayList6, _UrlKt.FRAGMENT_ENCODE_SET, null, null, null, 62)).toLowerCase(Locale.ROOT);
        lowerCase2.getClass();
        c = lowerCase2;
    }
}
