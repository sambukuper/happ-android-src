package defpackage;

import com.tencent.mmkv.MMKV;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import su.happ.proxyutility.dto.RouteSettings;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EDnsType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class z59 implements dn2 {
    public final /* synthetic */ byte X = 0;
    public final /* synthetic */ RouteSettings Y;
    public final /* synthetic */ ArrayList Z;
    public final /* synthetic */ List f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ z59(List list, RouteSettings routeSettings, ArrayList arrayList) {
        this.f0 = list;
        this.Y = routeSettings;
        this.Z = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        List proxySites;
        List directSites;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        int i = XRayConfig.DEFAULT_PORT;
        List list = this.f0;
        ArrayList arrayList = this.Z;
        RouteSettings routeSettings = this.Y;
        switch (b) {
            case 0:
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                if (routeSettings != null && (proxySites = routeSettings.getProxySites()) != null) {
                    vz7 vz7Var = d69.a;
                    if (d69.k().c("pref_run_without_routing", false)) {
                        proxySites = null;
                    }
                    if (proxySites != null) {
                        if (proxySites.isEmpty()) {
                            return dn8Var;
                        }
                        String str = (String) wv0.r0(list);
                        if (routeSettings.getRemoteDnsType() != EDnsType.DOH) {
                            i = 53;
                        }
                        arrayList.add(new XRayConfig.DnsBean.ServersBean(str, Integer.valueOf(i), proxySites, 112));
                        return dn8Var;
                    }
                }
                String str2 = (String) wv0.r0(list);
                if ((routeSettings != null ? routeSettings.getRemoteDnsType() : null) != EDnsType.DOH) {
                    i = 53;
                }
                return Boolean.valueOf(arrayList.add(new XRayConfig.DnsBean.ServersBean(str2, Integer.valueOf(i), new ArrayList(), 112)));
            default:
                if (routeSettings != null && (directSites = routeSettings.getDirectSites()) != null) {
                    vz7 vz7Var2 = d69.a;
                    MMKV mmkvK = d69.k();
                    if (mmkvK != null && mmkvK.c("pref_run_without_routing", false)) {
                        directSites = null;
                    }
                    if (directSites != null) {
                        if (directSites.isEmpty()) {
                            return dn8Var;
                        }
                        String str3 = (String) wv0.r0(list);
                        if (routeSettings.getDomesticDnsType() != EDnsType.DOH) {
                            i = 53;
                        }
                        arrayList.add(new XRayConfig.DnsBean.ServersBean(str3, Integer.valueOf(i), directSites, 120));
                        return dn8Var;
                    }
                }
                String str4 = (String) wv0.r0(list);
                if ((routeSettings != null ? routeSettings.getDomesticDnsType() : null) != EDnsType.DOH) {
                    i = 53;
                }
                return Boolean.valueOf(arrayList.add(new XRayConfig.DnsBean.ServersBean(str4, Integer.valueOf(i), new ArrayList(), 112)));
        }
    }

    public /* synthetic */ z59(RouteSettings routeSettings, ArrayList arrayList, List list) {
        this.Y = routeSettings;
        this.Z = arrayList;
        this.f0 = list;
    }
}
