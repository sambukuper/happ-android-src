package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import su.happ.proxyutility.dto.GeoFileSearchCache;
import su.happ.proxyutility.dto.enums.ERoutingSettingsType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class eq6 extends xw8 {
    public final vz7 b = new vz7(new w76((byte) 18));
    public mr2 c = mr2.GEOIP;
    public ERoutingSettingsType d = ERoutingSettingsType.PROXY;
    public String e = "";
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public String h = "";
    public gn2 i = new zw5((byte) 18);
    public final yz4 j = new yz4("");
    public final yz4 k = new yz4();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ArrayList e(int i, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        char cCharAt = ((String) wv0.r0(arrayList)).charAt(i);
        String strValueOf = String.valueOf(cCharAt);
        strValueOf.getClass();
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        arrayList2.add(new GeoFileSearchCache(upperCase, true, true));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (cCharAt != str.charAt(i)) {
                cCharAt = str.charAt(i);
                String strValueOf2 = String.valueOf(cCharAt);
                strValueOf2.getClass();
                String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                arrayList2.add(new GeoFileSearchCache(upperCase2, true, true));
            }
            arrayList2.add(new GeoFileSearchCache(str, this.f.contains(str), false));
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List f() {
        yz4 yz4Var = this.j;
        CharSequence charSequence = (CharSequence) yz4Var.d();
        yz4 yz4Var2 = this.k;
        if (charSequence == null || charSequence.length() == 0) {
            return (List) yz4Var2.d();
        }
        ArrayList arrayList = (ArrayList) yz4Var2.d();
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            GeoFileSearchCache geoFileSearchCache = (GeoFileSearchCache) obj;
            String str = (String) yz4Var.d();
            if (str != null ? fm7.d0(geoFileSearchCache.getValue(), str, true) : false) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
