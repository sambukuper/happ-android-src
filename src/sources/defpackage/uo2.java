package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uo2 {
    public static final uo2 b = new uo2(i21.L(oo2.d, ro2.d, po2.d, qo2.d));
    public final LinkedHashMap a;

    public uo2(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            fk2 fk2Var = ((so2) obj).a;
            Object arrayList = linkedHashMap.get(fk2Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(fk2Var, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.a = linkedHashMap;
    }

    public final to2 a(fk2 fk2Var, String str) {
        Integer numValueOf;
        fk2Var.getClass();
        str.getClass();
        List<so2> list = (List) this.a.get(fk2Var);
        if (list == null) {
            return null;
        }
        for (so2 so2Var : list) {
            int i = 0;
            if (mm7.Z(str, false, so2Var.b)) {
                String strSubstring = str.substring(so2Var.b.length());
                if (strSubstring.length() == 0) {
                    numValueOf = null;
                    break;
                }
                int length = strSubstring.length();
                int i2 = 0;
                while (true) {
                    if (i >= length) {
                        numValueOf = Integer.valueOf(i2);
                        break;
                    }
                    int iCharAt = strSubstring.charAt(i) - '0';
                    if (iCharAt < 0 || iCharAt >= 10) {
                        numValueOf = null;
                        break;
                    }
                    i2 = (i2 * 10) + iCharAt;
                    i++;
                }
                if (numValueOf != null) {
                    return new to2(so2Var, numValueOf.intValue());
                }
            }
        }
        return null;
    }
}
