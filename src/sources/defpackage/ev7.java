package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.service.SubscriptionUpdater$UpdateTask;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class ev7 {
    public static final vz7 a = new vz7(new mq7((byte) 12));
    public static final vz7 b = new vz7(new mq7((byte) 13));
    public static final vz7 c = new vz7(new mq7((byte) 14));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(String str) {
        Integer numT0;
        int iIntValue;
        is7 is7Var;
        Integer numT1;
        HappApplication happApplication = HappApplication.M0;
        pd6 pd6VarC = pd6.c(k32.i());
        qs7 qs7VarA = str != null ? ((zt7) c.getValue()).a(str) : null;
        if (qs7VarA == null || (is7Var = qs7VarA.a) == null || !is7Var.a) {
            if (str != null) {
                pd6VarC.a(str);
                return;
            }
            pd6VarC.a("subscription_updater");
            kw4 kw4Var = kw4.a;
            for (qg5 qg5Var : kw4.d()) {
                MetaParams metaParams = ((SubscriptionItem) qg5Var.Y).getMetaParams();
                if (metaParams != null && (numT0 = metaParams.getProfileUpdateInterval()) != null && (iIntValue = numT0.intValue()) > 0) {
                    SubId subId = (SubId) qg5Var.X;
                    b(iIntValue, subId != null ? subId.d() : null);
                }
            }
            return;
        }
        pd6VarC.a("subscription_updater");
        kw4 kw4Var2 = kw4.a;
        List listD = kw4.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            MetaParams metaParams2 = ((SubscriptionItem) ((qg5) obj).Y).getMetaParams();
            if (metaParams2 == null || (numT1 = metaParams2.getProfileUpdateInterval()) == null || numT1.intValue() <= 0) {
                numT1 = null;
            }
            if (numT1 != null) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pd6VarC.a(((SubId) ((qg5) it.next()).X).d());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(int i, String str) {
        is7 is7Var;
        long jIntValue = i;
        HappApplication happApplication = HappApplication.M0;
        pd6 pd6VarC = pd6.c(k32.i());
        String str2 = str == null ? "subscription_updater" : str;
        TimeUnit timeUnit = TimeUnit.HOURS;
        eb5 eb5Var = new eb5(SubscriptionUpdater$UpdateTask.class, jIntValue, timeUnit);
        Integer num = null;
        qs7 qs7VarA = str != null ? ((zt7) c.getValue()).a(new SubId(str).d()) : null;
        if (qs7VarA != null && (is7Var = qs7VarA.a) != null) {
            Integer numValueOf = Integer.valueOf(is7Var.d);
            ss8 ss8Var = ss8.a;
            if (ss8.t() && is7Var.a) {
                num = numValueOf;
            }
            if (num != null) {
                jIntValue = num.intValue();
            }
        }
        eb5Var.e(jIntValue, timeUnit);
        if (str != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("subIdData", str);
            u91 u91Var = new u91(linkedHashMap);
            wl7.c0(u91Var);
            ((l49) ((wb4) eb5Var).c).e = u91Var;
        }
        pd6VarC.b(str2, eb5Var.a());
    }
}
