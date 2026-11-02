package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qx1 {
    public static final LinkedHashMap a;
    public static final LinkedHashMap b;

    static {
        px1 px1Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        b = linkedHashMap2;
        px1 px1Var2 = px1.d;
        linkedHashMap.put(1L, px1Var2);
        linkedHashMap2.put(px1Var2, i21.K(1L));
        linkedHashMap.put(2L, px1.e);
        linkedHashMap2.put(linkedHashMap.get(2L), i21.K(2L));
        px1 px1Var3 = px1.f;
        linkedHashMap.put(4L, px1Var3);
        linkedHashMap2.put(px1Var3, i21.K(4L));
        px1 px1Var4 = px1.g;
        linkedHashMap.put(8L, px1Var4);
        linkedHashMap2.put(px1Var4, i21.K(8L));
        List listL = i21.L(64L, 128L, 16L, 32L);
        Iterator it = listL.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            px1Var = px1.h;
            if (!zHasNext) {
                break;
            }
            a.put(Long.valueOf(((Number) it.next()).longValue()), px1Var);
        }
        b.put(px1Var, listL);
        List listL2 = i21.L(Long.valueOf(RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE), 2048L, 256L, 512L);
        Iterator it2 = listL2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            px1 px1Var5 = px1.i;
            if (!zHasNext2) {
                b.put(px1Var5, listL2);
                return;
            } else {
                a.put(Long.valueOf(((Number) it2.next()).longValue()), px1Var5);
            }
        }
    }

    public static Long a(px1 px1Var, DynamicRangeProfiles dynamicRangeProfiles) {
        px1Var.getClass();
        dynamicRangeProfiles.getClass();
        List list = (List) b.get(px1Var);
        if (list == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        supportedProfiles.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            if (supportedProfiles.contains(Long.valueOf(jLongValue))) {
                return Long.valueOf(jLongValue);
            }
        }
        return null;
    }
}
