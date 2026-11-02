package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.UnaryOperator;
import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.ConfigGroupCache;
import su.happ.proxyutility.dto.ServerCache;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class un4 implements UnaryOperator {
    public final /* synthetic */ String a;
    public final /* synthetic */ x83 b;
    public final /* synthetic */ MainViewModel c;
    public final /* synthetic */ ConfigGroupCache d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ un4(String str, x83 x83Var, MainViewModel mainViewModel, ConfigGroupCache configGroupCache) {
        this.a = str;
        this.b = x83Var;
        this.c = mainViewModel;
        this.d = configGroupCache;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object next;
        List<ServerCache> configs;
        ConfigGroupCache configGroupCache = (ConfigGroupCache) obj;
        String subId = configGroupCache.getSubId();
        String str = this.a;
        if (!dh3.f(subId, str)) {
            return configGroupCache;
        }
        kw4 kw4Var = kw4.a;
        SubscriptionItem subscriptionItemF = kw4.f(str);
        if (!(this.b instanceof v83)) {
            return new ConfigGroupCache(str, subscriptionItemF, new ArrayList(), configGroupCache.getIsExpand(), configGroupCache.getIsPinned());
        }
        MainViewModel mainViewModel = this.c;
        CopyOnWriteArrayList copyOnWriteArrayList = mainViewModel.o;
        String strI = mainViewModel.n().i("SELECTED_SERVER");
        if (strI == null) {
            strI = null;
        }
        Iterator it = mainViewModel.q.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!dh3.f(((ConfigGroupCache) next).getSubId(), str));
        ConfigGroupCache configGroupCache2 = (ConfigGroupCache) next;
        if (configGroupCache2 != null && (configs = configGroupCache2.getConfigs()) != null) {
            for (ServerCache serverCache : configs) {
                if (strI == null ? false : strI.equals(serverCache.getGuid())) {
                    mainViewModel.n().remove("SELECTED_SERVER");
                }
                copyOnWriteArrayList.remove(new GuId(serverCache.getGuid()));
                kw4 kw4Var2 = kw4.a;
                kw4.q(serverCache.getGuid());
            }
            configs.clear();
            if (copyOnWriteArrayList.isEmpty()) {
                CopyOnWriteArrayList copyOnWriteArrayList2 = mainViewModel.p;
                SubId.Companion.getClass();
                copyOnWriteArrayList2.remove(new qg5(new SubId(SubId.c()), (Object) null));
            }
        }
        ConfigGroupCache configGroupCache3 = this.d;
        String subId2 = configGroupCache3 != null ? configGroupCache3.getSubId() : null;
        if (subId2 != null ? subId2.equals(str) : false) {
            ss8 ss8Var = ss8.a;
            ss8.I(mainViewModel.b);
        }
        return new ConfigGroupCache(str, subscriptionItemF, new ArrayList(), configGroupCache.getIsExpand(), configGroupCache.getIsPinned());
    }
}
