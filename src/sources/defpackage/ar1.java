package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class ar1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static br1 a(String str) {
        str.getClass();
        if (mm7.R(str, false, ".")) {
            str = fm7.g0(1, str);
        }
        if (str.length() == 0) {
            return br1.b;
        }
        List listF0 = fm7.F0(str, new String[]{"."}, 6);
        ArrayList arrayList = new ArrayList(xv0.Z(listF0, 10));
        Iterator it = listF0.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(iq0.a);
            bytes.getClass();
            arrayList.add(bytes);
        }
        return b(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static br1 b(ArrayList arrayList) throws zq1.b, zq1.h, zq1.a {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            if (bArr.length == 0) {
                throw new zq1.h("name contains a zero-length label");
            }
            if (bArr.length > 63) {
                throw new zq1.a("name contains a label longer than 63 octets");
            }
        }
        Iterator it2 = arrayList.iterator();
        int length = 0;
        while (it2.hasNext()) {
            length += ((byte[]) it2.next()).length + 1;
        }
        if (length + 1 <= 255) {
            return new br1(arrayList);
        }
        throw new zq1.b("name is longer than 255 octets");
    }
}
