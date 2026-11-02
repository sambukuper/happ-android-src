package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.ConfigGroupCache;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.enums.SubscriptionSortType;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class lm4 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ MainViewModel Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ lm4(MainViewModel mainViewModel, byte b) {
        this.X = b;
        this.Y = mainViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object B(Object obj) {
        SubscriptionSortType subscriptionSortType;
        ConfigGroupCache configGroupCacheA;
        byte b = this.X;
        MainViewModel mainViewModel = this.Y;
        switch (b) {
            case 0:
                ((j2) obj).getClass();
                CopyOnWriteArrayList<ConfigGroupCache> copyOnWriteArrayList = mainViewModel.q;
                qm5 qm5VarC = ec7.Y.c();
                for (ConfigGroupCache configGroupCache : copyOnWriteArrayList) {
                    qs7 qs7VarA = mainViewModel.q().a(configGroupCache.getSubId());
                    if (qs7VarA == null || (subscriptionSortType = qs7VarA.j) == null) {
                        subscriptionSortType = SubscriptionSortType.WITHOUT;
                    }
                    int i = ln4.b[subscriptionSortType.ordinal()];
                    if (i == 1) {
                        configGroupCacheA = ConfigGroupCache.a(configGroupCache, null, wv0.Z0(configGroupCache.getConfigs()), false, false, 27);
                    } else if (i == 2) {
                        configGroupCacheA = ConfigGroupCache.a(configGroupCache, null, new ArrayList(wv0.S0(configGroupCache.getConfigs(), new l71((byte) 28))), false, false, 27);
                    } else {
                        if (i != 3) {
                            b61.c();
                            return null;
                        }
                        configGroupCacheA = ConfigGroupCache.a(configGroupCache, null, new ArrayList(wv0.S0(configGroupCache.getConfigs(), new l71((byte) 29))), false, false, 27);
                    }
                    qm5VarC.add(configGroupCacheA);
                }
                return qm5VarC.c();
            default:
                qg5 qg5Var = (qg5) obj;
                String strD = ((SubId) qg5Var.X).d();
                SubscriptionItem subscriptionItem = (SubscriptionItem) qg5Var.Y;
                qs7 qs7VarA2 = mainViewModel.q().a(strD);
                if (subscriptionItem != null) {
                    return new yf8(new SubId(strD), subscriptionItem, qs7VarA2);
                }
                return null;
        }
    }
}
