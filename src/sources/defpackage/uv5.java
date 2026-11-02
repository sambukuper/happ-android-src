package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.SubscriptionItem;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uv5 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Map Y;

    public /* synthetic */ uv5(Map map, byte b) {
        this.X = b;
        this.Y = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gn2
    public final Object B(Object obj) {
        boolean z;
        byte b = this.X;
        Map map = this.Y;
        switch (b) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                String value = ((SubId) entry.getKey()).getValue();
                b83<RouteProfile> b83Var = (b83) entry.getValue();
                ArrayList arrayList = new ArrayList();
                for (RouteProfile routeProfile : b83Var) {
                    SubId.Companion.getClass();
                    om6 om6Var = null;
                    Object[] objArr = 0;
                    if (dh3.f(value, SubId.EMPTY)) {
                        om6Var = new om6(routeProfile, (SubscriptionItem) (objArr == true ? 1 : 0), 6);
                    } else {
                        SubscriptionItem subscriptionItem = (SubscriptionItem) map.get(new SubId(value));
                        if (subscriptionItem != null) {
                            om6Var = new om6(routeProfile, subscriptionItem, 4);
                        }
                    }
                    if (om6Var != null) {
                        arrayList.add(om6Var);
                    }
                }
                return arrayList;
            default:
                ee eeVar = (ee) obj;
                eeVar.getClass();
                for (Map.Entry entry2 : map.entrySet()) {
                    CaptureResult.Key key = (CaptureResult.Key) entry2.getKey();
                    List list = (List) entry2.getValue();
                    key.getClass();
                    if (!wv0.m0(list, eeVar.X.get(key))) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                }
                z = true;
                return Boolean.valueOf(z);
        }
    }
}
