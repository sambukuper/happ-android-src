package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class zl7 {
    public static final kc6 a = new kc6(".*hwidlink=(\\w+).*");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(long j) {
        be beVar = gx1.Y;
        long jM0 = vj8.m0(j, lx1.Z);
        return String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(gx1.j(jM0, lx1.h0)), Integer.valueOf(gx1.e(jM0)), Integer.valueOf(gx1.g(jM0))}, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static MetaParams b(String str) {
        if (!fm7.d0(str, "?", false)) {
            return null;
        }
        String strSubstring = str.substring(fm7.m0(str, "?", 0, false, 6) + 1);
        if (strSubstring.length() == 0) {
            return null;
        }
        List listF0 = fm7.F0(strSubstring, new String[]{"&"}, 6);
        ArrayList arrayList = new ArrayList(xv0.Z(listF0, 10));
        Iterator it = listF0.iterator();
        while (it.hasNext()) {
            String[] strArr = (String[]) fm7.F0((String) it.next(), new String[]{"="}, 6).toArray(new String[0]);
            arrayList.add(new qg5(strArr[0], strArr[1]));
        }
        MetaParams.INSTANCE.getClass();
        return MetaParams.Companion.a(arrayList, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String c(String str) {
        str.getClass();
        return fm7.d0(str, "#", false) ? fm7.Q0(fm7.r0(str, "#", 0, 6), str) : str;
    }
}
