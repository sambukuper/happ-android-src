package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gm7 extends z39 {
    public static String M(String str) {
        return w27.j0(w27.l0(new hu(str, (byte) 6), new m40("    ", (byte) 29)), "\n", null, 62);
    }

    public static String N(String str) throws IOException {
        int length;
        List listS0 = fm7.s0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listS0) {
            if (!fm7.o0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!km4.a0(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Integer num = (Integer) wv0.C0(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listS0.size();
        int size = listS0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listS0) {
            int i = length + 1;
            if (length < 0) {
                i21.X();
                throw null;
            }
            String str3 = (String) obj2;
            String strF0 = ((length == 0 || length == size) && fm7.o0(str3)) ? null : fm7.f0(iIntValue, str3);
            if (strF0 != null) {
                arrayList3.add(strF0);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        wv0.x0(arrayList3, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    public static String O(String str) throws IOException {
        if (fm7.o0("|")) {
            bt.q("marginPrefix must be non-blank string.");
            return null;
        }
        List listS0 = fm7.s0(str);
        int length = str.length();
        listS0.size();
        int size = listS0.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listS0) {
            int i2 = i + 1;
            if (i < 0) {
                i21.X();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && fm7.o0(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!km4.a0(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && mm7.Y(str2, "|", i3, false)) ? str2.substring("|".length() + i3) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        wv0.x0(arrayList, sb, "\n", null, null, null, 124);
        return sb.toString();
    }
}
