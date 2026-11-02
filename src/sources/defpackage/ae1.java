package defpackage;

import java.util.ArrayList;
import su.happ.proxyutility.dto.enums.EDeeplinkType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class ae1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static b12 a(EDeeplinkType eDeeplinkType) {
        int i = zd1.a[eDeeplinkType.ordinal()];
        if (i == 1) {
            return b12.X;
        }
        if (i == 2) {
            return b12.Y;
        }
        if (i == 3) {
            return b12.Z;
        }
        if (i == 4) {
            return b12.f0;
        }
        if (i != 5) {
            return null;
        }
        return b12.g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EDeeplinkType b(String str) {
        str.getClass();
        if (mm7.Z(str, false, "happ://")) {
            EDeeplinkType.Companion companion = EDeeplinkType.INSTANCE;
            String strX0 = fm7.x0("happ://", str);
            companion.getClass();
            l22 l22VarA = EDeeplinkType.a();
            ArrayList<EDeeplinkType> arrayList = new ArrayList();
            for (Object obj : l22VarA) {
                String prefix = ((EDeeplinkType) obj).getPrefix();
                if (prefix != null && mm7.Z(strX0, false, prefix)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return EDeeplinkType.NOT_SUPPORTED;
            }
            if (arrayList.size() == 1) {
                return (EDeeplinkType) arrayList.get(0);
            }
            for (EDeeplinkType eDeeplinkType : arrayList) {
                String prefix2 = eDeeplinkType.getPrefix();
                prefix2.getClass();
                if (fm7.d0(prefix2, "without_ui", false)) {
                    return eDeeplinkType;
                }
            }
            em7.g("Collection contains no element matching the predicate.");
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String c(String str, EDeeplinkType eDeeplinkType) {
        String prefix = eDeeplinkType.getPrefix();
        if (prefix == null) {
            prefix = "";
        }
        return fm7.x0(prefix, str);
    }
}
