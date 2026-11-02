package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.gson.a;
import com.tencent.mmkv.MMKV;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedDeque;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.routing.entity.GeoFileKey;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.domain.routing.entity.RouteProfileId;
import su.happ.proxyutility.domain.routing.entity.RouteSettingsCache;
import su.happ.proxyutility.domain.routing.entity.StateCreateProfile;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFile;
import su.happ.proxyutility.domain.routing.entity.StateExportProfile;
import su.happ.proxyutility.domain.routing.entity.StateImportProfile;
import su.happ.proxyutility.domain.routing.entity.SubRoutingState;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.ProfileRoutingSettings;
import su.happ.proxyutility.dto.RouteSettings;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.enums.EDeeplinkType;
import su.happ.proxyutility.dto.enums.EDnsType;
import su.happ.proxyutility.dto.enums.RoutingOrder;
import su.happ.proxyutility.util.adapters.ParsingRoutingAdapter;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mn6 {
    public static final vz7 j = new vz7(new w76(9));
    public static final vz7 k = new vz7(new w76(10));
    public final MMKV a;
    public final MMKV b;
    public final vz7 c;
    public final fn6 d;
    public final ConcurrentLinkedDeque e;
    public final oh7 f;
    public final h76 g;
    public final vz7 h;
    public final m51 i;

    public mn6() {
        kw4 kw4Var = kw4.a;
        MMKV mmkvL = kw4.l();
        Object value = kw4.h.getValue();
        value.getClass();
        this.a = mmkvL;
        this.b = (MMKV) value;
        this.c = new vz7(new w76((byte) 11));
        this.d = new fn6(this, (byte) 0);
        this.e = new ConcurrentLinkedDeque();
        dm5 dm5Var = dm5.f0;
        dm5Var.getClass();
        oh7 oh7VarA = ph7.a(dm5Var);
        this.f = oh7VarA;
        this.g = jm4.n(oh7VarA);
        this.h = new vz7(new hr5(this, (byte) 7));
        ow7 ow7VarB = pw7.b();
        nf1 nf1Var = tp1.a;
        this.i = gv3.c(g33.K(ow7VarB, dm4.a));
        v();
        ss8 ss8Var = ss8.a;
        zp4.K(new qg5(mr2.GEOIP, new File(ss8.L(j()), "geoip.dat")), new qg5(mr2.GEOSITE, new File(ss8.L(j()), "geosite.dat")));
    }

    public static RouteSettings d(String str) {
        str.getClass();
        RouteSettings.Companion companion = RouteSettings.INSTANCE;
        Context contextJ = j();
        contextJ.getClass();
        companion.getClass();
        ss8 ss8Var = ss8.a;
        RouteSettings routeSettings = new RouteSettings(ss8.L(contextJ), 8126463);
        routeSettings.Q(m(str));
        return routeSettings;
    }

    public static Object f(String str) {
        str.getClass();
        try {
            a aVar = (a) j.getValue();
            aVar.getClass();
            Object objC = aVar.c(str, new yi8(ProfileRoutingSettings.class));
            if (objC == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ProfileRoutingSettings profileRoutingSettings = (ProfileRoutingSettings) objC;
            String strV = profileRoutingSettings.getRemoteDnsIp();
            if (strV == null) {
                strV = RouteSettings.DEFAULT_REMOTE_DNS_IP;
            }
            String str2 = strV;
            String strJ = profileRoutingSettings.getDomesticDnsIp();
            if (strJ == null) {
                strJ = RouteSettings.DEFAULT_DOMESTIC_DNS_IP;
            }
            String str3 = strJ;
            String strW = profileRoutingSettings.getRemoteDnsType();
            if (strW == null) {
                RouteSettings.INSTANCE.getClass();
                strW = RouteSettings.DEFAULT_DNS_TYPE.getText();
            }
            String str4 = strW;
            String strK = profileRoutingSettings.getDomesticDnsType();
            if (strK == null) {
                RouteSettings.INSTANCE.getClass();
                strK = RouteSettings.DEFAULT_DNS_TYPE.getText();
            }
            String str5 = strK;
            String strU = profileRoutingSettings.getRemoteDnsDomain();
            if (strU == null) {
                strU = RouteSettings.DEFAULT_DNS_DOMAIN_REMOTE;
            }
            String str6 = strU;
            String strI = profileRoutingSettings.getDomesticDnsDomain();
            if (strI == null) {
                strI = RouteSettings.DEFAULT_DNS_DOMAIN_DOMESTIC;
            }
            String str7 = strI;
            Boolean boolO = profileRoutingSettings.getGlobalProxy();
            Boolean boolValueOf = Boolean.valueOf(boolO != null ? boolO.booleanValue() : true);
            String strM = profileRoutingSettings.getGeoIpUrl();
            if (strM == null) {
                strM = RouteSettings.DEFAULT_GEO_IP_URL;
            }
            String str8 = strM;
            String strN = profileRoutingSettings.getGeoSiteUrl();
            if (strN == null) {
                strN = RouteSettings.DEFAULT_GEO_SITE_URL;
            }
            String str9 = strN;
            String strG = profileRoutingSettings.getDomainStrategy();
            if (strG == null) {
                strG = RouteSettings.DEFAULT_ROUTING_DOMAIN_STRATEGY;
            }
            String str10 = strG;
            Map mapF = profileRoutingSettings.getDnsHosts();
            if (mapF == null) {
                RouteSettings.INSTANCE.getClass();
                mapF = RouteSettings.DEFAULT_DNS_HOSTS;
            }
            Map map = mapF;
            ArrayList arrayListI = i(profileRoutingSettings.getProxySites());
            if (arrayListI == null) {
                arrayListI = new ArrayList();
            }
            ArrayList arrayList = arrayListI;
            ArrayList arrayListI2 = i(profileRoutingSettings.getProxyIp());
            if (arrayListI2 == null) {
                arrayListI2 = new ArrayList();
            }
            ArrayList arrayList2 = arrayListI2;
            ArrayList arrayListI3 = i(profileRoutingSettings.getDirectSites());
            if (arrayListI3 == null) {
                arrayListI3 = new ArrayList();
            }
            ArrayList arrayList3 = arrayListI3;
            ArrayList arrayListI4 = i(profileRoutingSettings.getDirectIp());
            if (arrayListI4 == null) {
                arrayListI4 = new ArrayList();
            }
            ArrayList arrayList4 = arrayListI4;
            ArrayList arrayListI5 = i(profileRoutingSettings.getBlockSites());
            if (arrayListI5 == null) {
                arrayListI5 = new ArrayList();
            }
            ArrayList arrayList5 = arrayListI5;
            ArrayList arrayListI6 = i(profileRoutingSettings.getBlockIp());
            if (arrayListI6 == null) {
                arrayListI6 = new ArrayList();
            }
            ArrayList arrayList6 = arrayListI6;
            String strX = profileRoutingSettings.getRouteOrder();
            if (strX == null) {
                RouteSettings.INSTANCE.getClass();
                strX = RouteSettings.DEFAULT_ROUTE_ORDER.getValue();
            }
            return ProfileRoutingSettings.a(profileRoutingSettings, str2, str3, str4, str5, str6, str7, boolValueOf, str8, str9, str10, map, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, strX);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            return new rj6(th);
        }
    }

    public static ArrayList i(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!fm7.o0((String) obj)) {
                arrayList.add(obj);
            }
        }
        return new ArrayList(arrayList);
    }

    public static Context j() {
        HappApplication happApplication = HappApplication.M0;
        Activity activity = (Activity) k32.i().L0.Y;
        return activity != null ? activity : k32.i().getApplicationContext();
    }

    public static RouteProfile k(mn6 mn6Var) {
        String strP;
        mn6Var.getClass();
        String strI = kw4.h().i("SELECTED_SERVER");
        if (strI == null) {
            strI = null;
        }
        ServerConfig serverConfigB = strI != null ? kw4.b(strI) : null;
        if (serverConfigB == null || (strP = mn6Var.p(serverConfigB.getSubscriptionId(), false)) == null) {
            return null;
        }
        return mn6Var.n(strP, null);
    }

    public static String m(String str) {
        ss8 ss8Var = ss8.a;
        return pc6.p(ss8.L(j()), "/", str);
    }

    public static RouteProfile r(mn6 mn6Var, RouteSettingsCache routeSettingsCache) {
        SubId.Companion.getClass();
        StateCreateProfile stateCreateProfileU = mn6Var.u(routeSettingsCache.getName(), SubId.EMPTY);
        String strC = stateCreateProfileU instanceof StateCreateProfile.Create ? ((StateCreateProfile.Create) stateCreateProfileU).getId() : null;
        if (strC == null) {
            return null;
        }
        RouteSettings routeSettingsE = RouteSettings.e(routeSettingsCache.getRouteSettings(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, m(strC), null, null, null, 8126463);
        RouteSettings defaultValue = routeSettingsCache.getDefaultValue();
        RouteSettingsCache routeSettingsCacheA = RouteSettingsCache.a(routeSettingsCache, null, routeSettingsE, defaultValue != null ? RouteSettings.e(defaultValue, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, m(strC), null, null, null, 8126463) : null, null, false, 25);
        ht1 ht1VarL = mn6Var.l();
        String localPathGeo = routeSettingsCache.getRouteSettings().getLocalPathGeo();
        String localPathGeo2 = routeSettingsCacheA.getRouteSettings().getLocalPathGeo();
        ht1VarL.getClass();
        localPathGeo.getClass();
        localPathGeo2.getClass();
        try {
            ht1.d(ht1VarL, localPathGeo, localPathGeo2, mr2.GEOIP);
            ht1.d(ht1VarL, localPathGeo, localPathGeo2, mr2.GEOSITE);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
        new File(routeSettingsCache.getRouteSettings().getLocalPathGeo()).delete();
        return mn6Var.D(strC, null, new t16((Object) routeSettingsCacheA, (byte) 6));
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0129  */
    /* JADX WARN: Code duplicated, block: B:117:0x0143  */
    /* JADX WARN: Code duplicated, block: B:138:0x0190  */
    /* JADX WARN: Code duplicated, block: B:149:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:160:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:171:0x01de  */
    /* JADX WARN: Code duplicated, block: B:182:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:193:0x0212  */
    /* JADX WARN: Code duplicated, block: B:204:0x022c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:233:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e5  */
    public static RouteSettings w(RouteSettings routeSettings, ProfileRoutingSettings profileRoutingSettings) {
        EDnsType remoteDnsType;
        EDnsType domesticDnsType;
        String remoteDnsIp;
        String domesticDnsIp;
        String remoteDnsDomain;
        String domesticDnsDomain;
        String geoIpUrl;
        String geoSiteUrl;
        Map dnsHosts;
        List proxySites;
        List proxyIp;
        List directSites;
        List directIp;
        List blockSites;
        List blockIp;
        RoutingOrder routeOrder;
        String strX;
        String strP;
        String strG;
        String strH;
        String strT;
        String strK;
        String strW;
        Boolean boolO;
        RouteSettings routeSettingsE = RouteSettings.e(routeSettings, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388607);
        routeSettingsE.O((profileRoutingSettings == null || (boolO = profileRoutingSettings.getGlobalProxy()) == null) ? routeSettingsE.getGlobalProxy() : boolO.booleanValue());
        Object obj = null;
        if (profileRoutingSettings == null || (strW = profileRoutingSettings.getRemoteDnsType()) == null) {
            remoteDnsType = routeSettingsE.getRemoteDnsType();
        } else {
            if (fm7.o0(strW)) {
                strW = null;
            }
            if (strW != null) {
                EDnsType.INSTANCE.getClass();
                remoteDnsType = EDnsType.Companion.a(strW);
                if (remoteDnsType == null) {
                    remoteDnsType = routeSettingsE.getRemoteDnsType();
                }
            } else {
                remoteDnsType = routeSettingsE.getRemoteDnsType();
            }
        }
        routeSettingsE.V(remoteDnsType);
        if (profileRoutingSettings == null || (strK = profileRoutingSettings.getDomesticDnsType()) == null) {
            domesticDnsType = routeSettingsE.getDomesticDnsType();
        } else {
            if (fm7.o0(strK)) {
                strK = null;
            }
            if (strK != null) {
                EDnsType.INSTANCE.getClass();
                domesticDnsType = EDnsType.Companion.a(strK);
                if (domesticDnsType == null) {
                    domesticDnsType = routeSettingsE.getDomesticDnsType();
                }
            } else {
                domesticDnsType = routeSettingsE.getDomesticDnsType();
            }
        }
        routeSettingsE.K(domesticDnsType);
        if (profileRoutingSettings == null || (remoteDnsIp = profileRoutingSettings.getRemoteDnsIp()) == null) {
            remoteDnsIp = routeSettingsE.getRemoteDnsIp();
        } else {
            if (fm7.o0(remoteDnsIp)) {
                remoteDnsIp = null;
            }
            if (remoteDnsIp == null) {
                remoteDnsIp = routeSettingsE.getRemoteDnsIp();
            }
        }
        routeSettingsE.U(remoteDnsIp);
        if (profileRoutingSettings == null || (domesticDnsIp = profileRoutingSettings.getDomesticDnsIp()) == null) {
            domesticDnsIp = routeSettingsE.getDomesticDnsIp();
        } else {
            if (fm7.o0(domesticDnsIp)) {
                domesticDnsIp = null;
            }
            if (domesticDnsIp == null) {
                domesticDnsIp = routeSettingsE.getDomesticDnsIp();
            }
        }
        routeSettingsE.J(domesticDnsIp);
        if (profileRoutingSettings == null || (remoteDnsDomain = profileRoutingSettings.getRemoteDnsDomain()) == null) {
            remoteDnsDomain = routeSettingsE.getRemoteDnsDomain();
        } else {
            if (fm7.o0(remoteDnsDomain)) {
                remoteDnsDomain = null;
            }
            if (remoteDnsDomain == null) {
                remoteDnsDomain = routeSettingsE.getRemoteDnsDomain();
            }
        }
        routeSettingsE.T(remoteDnsDomain);
        if (profileRoutingSettings == null || (domesticDnsDomain = profileRoutingSettings.getDomesticDnsDomain()) == null) {
            domesticDnsDomain = routeSettingsE.getDomesticDnsDomain();
        } else {
            if (fm7.o0(domesticDnsDomain)) {
                domesticDnsDomain = null;
            }
            if (domesticDnsDomain == null) {
                domesticDnsDomain = routeSettingsE.getDomesticDnsDomain();
            }
        }
        routeSettingsE.I(domesticDnsDomain);
        if (profileRoutingSettings != null && (strT = profileRoutingSettings.getRemoteDns()) != null) {
            if (fm7.o0(strT)) {
                strT = null;
            }
            if (strT != null) {
                routeSettingsE.U(strT);
            }
        }
        if (profileRoutingSettings != null && (strH = profileRoutingSettings.getDomesticDns()) != null) {
            if (fm7.o0(strH)) {
                strH = null;
            }
            if (strH != null) {
                routeSettingsE.J(strH);
            }
        }
        if (profileRoutingSettings == null || (geoIpUrl = profileRoutingSettings.getGeoIpUrl()) == null) {
            geoIpUrl = routeSettingsE.getGeoIpUrl();
        } else {
            if (fm7.o0(geoIpUrl)) {
                geoIpUrl = null;
            }
            if (geoIpUrl == null) {
                geoIpUrl = routeSettingsE.getGeoIpUrl();
            }
        }
        routeSettingsE.M(geoIpUrl);
        if (profileRoutingSettings == null || (geoSiteUrl = profileRoutingSettings.getGeoSiteUrl()) == null) {
            geoSiteUrl = routeSettingsE.getGeoSiteUrl();
        } else {
            if (fm7.o0(geoSiteUrl)) {
                geoSiteUrl = null;
            }
            if (geoSiteUrl == null) {
                geoSiteUrl = routeSettingsE.getGeoSiteUrl();
            }
        }
        routeSettingsE.N(geoSiteUrl);
        if (profileRoutingSettings != null && (strG = profileRoutingSettings.getDomainStrategy()) != null) {
            String[] stringArray = j().getResources().getStringArray(m26.routing_domain_strategy);
            stringArray.getClass();
            String domainStrategy = routeSettingsE.getDomainStrategy();
            for (String str : stringArray) {
                if (mm7.S(str, strG)) {
                    str.getClass();
                    domainStrategy = str;
                }
            }
            routeSettingsE.H(domainStrategy);
        }
        if (profileRoutingSettings == null || (dnsHosts = profileRoutingSettings.getDnsHosts()) == null) {
            dnsHosts = routeSettingsE.getDnsHosts();
        } else {
            if (dnsHosts.isEmpty()) {
                dnsHosts = null;
            }
            if (dnsHosts == null) {
                dnsHosts = routeSettingsE.getDnsHosts();
            }
        }
        routeSettingsE.G(dnsHosts);
        if (profileRoutingSettings == null || (proxySites = profileRoutingSettings.getProxySites()) == null) {
            proxySites = routeSettingsE.getProxySites();
        } else {
            if (proxySites.isEmpty()) {
                proxySites = null;
            }
            if (proxySites == null) {
                proxySites = routeSettingsE.getProxySites();
            }
        }
        routeSettingsE.S(proxySites);
        if (profileRoutingSettings == null || (proxyIp = profileRoutingSettings.getProxyIp()) == null) {
            proxyIp = routeSettingsE.getProxyIp();
        } else {
            if (proxyIp.isEmpty()) {
                proxyIp = null;
            }
            if (proxyIp == null) {
                proxyIp = routeSettingsE.getProxyIp();
            }
        }
        routeSettingsE.R(proxyIp);
        if (profileRoutingSettings == null || (directSites = profileRoutingSettings.getDirectSites()) == null) {
            directSites = routeSettingsE.getDirectSites();
        } else {
            if (directSites.isEmpty()) {
                directSites = null;
            }
            if (directSites == null) {
                directSites = routeSettingsE.getDirectSites();
            }
        }
        routeSettingsE.F(directSites);
        if (profileRoutingSettings == null || (directIp = profileRoutingSettings.getDirectIp()) == null) {
            directIp = routeSettingsE.getDirectIp();
        } else {
            if (directIp.isEmpty()) {
                directIp = null;
            }
            if (directIp == null) {
                directIp = routeSettingsE.getDirectIp();
            }
        }
        routeSettingsE.E(directIp);
        if (profileRoutingSettings == null || (blockSites = profileRoutingSettings.getBlockSites()) == null) {
            blockSites = routeSettingsE.getBlockSites();
        } else {
            if (blockSites.isEmpty()) {
                blockSites = null;
            }
            if (blockSites == null) {
                blockSites = routeSettingsE.getBlockSites();
            }
        }
        routeSettingsE.D(blockSites);
        if (profileRoutingSettings == null || (blockIp = profileRoutingSettings.getBlockIp()) == null) {
            blockIp = routeSettingsE.getBlockIp();
        } else {
            if (blockIp.isEmpty()) {
                blockIp = null;
            }
            if (blockIp == null) {
                blockIp = routeSettingsE.getBlockIp();
            }
        }
        routeSettingsE.C(blockIp);
        routeSettingsE.P((profileRoutingSettings == null || (strP = profileRoutingSettings.getLastUpdated()) == null) ? null : mm7.c0(strP));
        routeSettingsE.L(profileRoutingSettings != null ? profileRoutingSettings.getFakeDnsEnabled() : routeSettingsE.getFakeDnsEnabled());
        if (profileRoutingSettings == null || (strX = profileRoutingSettings.getRouteOrder()) == null) {
            routeOrder = routeSettingsE.getRouteOrder();
        } else {
            if (strX.length() <= 0) {
                strX = null;
            }
            if (strX != null) {
                RoutingOrder.INSTANCE.getClass();
                String lowerCase = strX.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                for (Object obj2 : RoutingOrder.a()) {
                    String lowerCase2 = ((RoutingOrder) obj2).getValue().toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    if (lowerCase2.equals(lowerCase)) {
                        obj = obj2;
                        break;
                    }
                }
                routeOrder = (RoutingOrder) obj;
                if (routeOrder == null) {
                    routeOrder = routeSettingsE.getRouteOrder();
                }
            } else {
                routeOrder = routeSettingsE.getRouteOrder();
            }
        }
        routeSettingsE.W(routeOrder);
        return RouteSettings.e(routeSettingsE, false, null, null, null, null, null, null, null, null, null, wv0.Z0(routeSettingsE.getProxySites()), wv0.Z0(routeSettingsE.getProxyIp()), wv0.Z0(routeSettingsE.getDirectSites()), wv0.Z0(routeSettingsE.getDirectIp()), wv0.Z0(routeSettingsE.getBlockSites()), wv0.Z0(routeSettingsE.getBlockIp()), false, null, null, null, null, 8259583);
    }

    public static void z(mn6 mn6Var, String str) {
        Object value;
        RouteProfile routeProfileN = mn6Var.n(str, null);
        if (routeProfileN != null && routeProfileN.getData().getIsSelected()) {
            String subId = routeProfileN.getSubId();
            b83<RouteProfile> b83VarO = mn6Var.o(subId);
            qm5 qm5VarC = ec7.Y.c();
            for (RouteProfile routeProfile : b83VarO) {
                qm5VarC.add(RouteProfile.a(routeProfile, RouteSettingsCache.a(routeProfile.getData(), null, null, null, null, false, 15)));
            }
            j2 j2VarC = qm5VarC.c();
            oh7 oh7Var = mn6Var.f;
            do {
                value = oh7Var.getValue();
            } while (!oh7Var.k(value, ((cm5) value).d(new SubId(subId), j2VarC)));
            mn6Var.A();
        }
    }

    public final void A() {
        Set setA = ((b2) ((cm5) this.g.X.getValue())).a();
        ArrayList arrayList = new ArrayList();
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            bw0.d0(arrayList, (Iterable) ((Map.Entry) it.next()).getValue());
        }
        this.a.q("routing_profile_list", new a().k(arrayList).toString());
    }

    public final void B(String str, String str2) {
        oh7 oh7Var;
        Object value;
        str.getClass();
        RouteProfile routeProfileN = n(str, str2);
        if (routeProfileN == null || b(routeProfileN.getId(), routeProfileN.getSubId())) {
            return;
        }
        b83<RouteProfile> b83VarO = o(routeProfileN.getSubId());
        qm5 qm5VarC = ec7.Y.c();
        for (RouteProfile routeProfile : b83VarO) {
            qm5VarC.add(RouteProfile.a(routeProfile, RouteSettingsCache.a(routeProfile.getData(), null, null, null, null, dh3.f(routeProfile.getId(), str), 15)));
        }
        j2 j2VarC = qm5VarC.c();
        do {
            oh7Var = this.f;
            value = oh7Var.getValue();
        } while (!oh7Var.k(value, ((cm5) value).d(new SubId(routeProfileN.getSubId()), j2VarC)));
        A();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object C(String str, String str2, mr2 mr2Var, boolean z, s51 s51Var) {
        kn6 kn6Var;
        mn6 mn6Var;
        String str3;
        if (s51Var instanceof kn6) {
            kn6Var = (kn6) s51Var;
            int i = kn6Var.j0;
            if ((i & Integer.MIN_VALUE) != 0) {
                kn6Var.j0 = i - Integer.MIN_VALUE;
            } else {
                kn6Var = new kn6(this, s51Var);
            }
        } else {
            kn6Var = new kn6(this, s51Var);
        }
        kn6 kn6Var2 = kn6Var;
        Object objG = kn6Var2.h0;
        int i2 = kn6Var2.j0;
        if (i2 == 0) {
            w39.n0(objG);
            fn6[] fn6VarArr = (fn6[]) d02.X.toArray(new fn6[0]);
            fn6[] fn6VarArr2 = (fn6[]) Arrays.copyOf(fn6VarArr, fn6VarArr.length);
            kn6Var2.f0 = str;
            kn6Var2.g0 = z;
            kn6Var2.j0 = 1;
            mn6Var = this;
            objG = mn6Var.g(kn6Var2, mr2Var, str, str2, null, fn6VarArr2);
            c71 c71Var = c71.X;
            if (objG == c71Var) {
                return c71Var;
            }
            str3 = str;
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = kn6Var2.g0;
            str3 = kn6Var2.f0;
            w39.n0(objG);
            mn6Var = this;
        }
        if (((bm3) objG) != null && z) {
            mn6Var.a(str3);
        }
        return dn8.a;
    }

    public final RouteProfile D(String str, String str2, gn2 gn2Var) {
        oh7 oh7Var;
        Object value;
        str.getClass();
        RouteProfile routeProfileN = n(str, str2);
        if (routeProfileN == null) {
            return null;
        }
        b83<RouteProfile> b83VarO = o(routeProfileN.getSubId());
        RouteProfile routeProfileA = RouteProfile.a(routeProfileN, (RouteSettingsCache) gn2Var.B(routeProfileN.getData()));
        qm5 qm5VarC = ec7.Y.c();
        for (RouteProfile routeProfile : b83VarO) {
            if (dh3.f(routeProfile.getId(), str)) {
                routeProfile = routeProfileA;
            }
            qm5VarC.add(routeProfile);
        }
        j2 j2VarC = qm5VarC.c();
        do {
            oh7Var = this.f;
            value = oh7Var.getValue();
        } while (!oh7Var.k(value, ((cm5) value).d(new SubId(routeProfileA.getSubId()), j2VarC)));
        A();
        return routeProfileA;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0158  */
    /* JADX WARN: Code duplicated, block: B:53:0x015c  */
    /* JADX WARN: Code duplicated, block: B:54:0x015e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0164  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public final Object E(String str, ProfileRoutingSettings profileRoutingSettings, String str2, fn6[] fn6VarArr, boolean z, s51 s51Var) {
        ln6 ln6Var;
        RouteProfile routeProfileN;
        RouteProfile routeProfileD;
        Object obj;
        String str3;
        fn6[] fn6VarArr2;
        boolean z2;
        RouteProfile routeProfile;
        int i;
        String str4;
        RouteProfile routeProfile2;
        int i2;
        boolean z3;
        String str5;
        String str6;
        boolean z4;
        if (s51Var instanceof ln6) {
            ln6Var = (ln6) s51Var;
            int i3 = ln6Var.o0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ln6Var.o0 = i3 - Integer.MIN_VALUE;
            } else {
                ln6Var = new ln6(this, s51Var);
            }
        } else {
            ln6Var = new ln6(this, s51Var);
        }
        ln6 ln6Var2 = ln6Var;
        Object objG = ln6Var2.m0;
        int i4 = ln6Var2.o0;
        dn8 dn8Var = dn8.a;
        Object obj2 = c71.X;
        if (i4 != 0) {
            if (i4 == 1) {
                i = ln6Var2.l0;
                z2 = ln6Var2.k0;
                routeProfile = ln6Var2.j0;
                routeProfile2 = ln6Var2.i0;
                fn6VarArr2 = (fn6[]) ln6Var2.h0;
                str3 = ln6Var2.g0;
                str4 = ln6Var2.f0;
                w39.n0(objG);
                obj = obj2;
            } else {
                if (i4 != 2) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str5 = ln6Var2.g0;
                str6 = ln6Var2.f0;
                w39.n0(objG);
            }
            if (objG != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            str4 = str6;
            str3 = str5;
            z3 = z4;
            if (!z3) {
                List list = l().a;
                list.getClass();
                tm6 tm6Var = new tm6(str4, list, this, str3, (byte) 1);
                ConcurrentLinkedDeque concurrentLinkedDeque = this.e;
                concurrentLinkedDeque.getClass();
                bw0.g0(concurrentLinkedDeque, tm6Var, true);
            }
            return dn8Var;
        }
        w39.n0(objG);
        if (z) {
            a(str);
        }
        routeProfileN = n(str, null);
        if (routeProfileN != null && (routeProfileD = D(str, str2, new t16(this, profileRoutingSettings))) != null) {
            Long lastUpdated = routeProfileD.getData().getRouteSettings().getLastUpdated();
            int i5 = (lastUpdated == null || lastUpdated.longValue() <= y08.c()) ? 0 : 1;
            if (i5 == 0 && dh3.f(routeProfileN.getData().getRouteSettings().getGeoIpUrl(), routeProfileD.getData().getRouteSettings().getGeoIpUrl())) {
                str3 = str2;
                fn6VarArr2 = fn6VarArr;
                obj = obj2;
                i2 = i5;
                z2 = z;
                z3 = false;
                str4 = str;
                if (i2 == 0 || !dh3.f(routeProfileN.getData().getRouteSettings().getGeoSiteUrl(), routeProfileD.getData().getRouteSettings().getGeoSiteUrl())) {
                    RouteProfile routeProfile3 = routeProfileD;
                    String id = routeProfile3.getId();
                    String subId = routeProfile3.getSubId();
                    fn6[] fn6VarArr3 = (fn6[]) Arrays.copyOf(fn6VarArr2, fn6VarArr2.length);
                    ln6Var2.f0 = str4;
                    ln6Var2.g0 = str3;
                    ln6Var2.h0 = null;
                    ln6Var2.i0 = null;
                    ln6Var2.j0 = null;
                    ln6Var2.k0 = z2;
                    ln6Var2.l0 = i2;
                    ln6Var2.o0 = 2;
                    objG = g(ln6Var2, mr2.GEOSITE, id, subId, null, fn6VarArr3);
                    if (objG != obj) {
                        str5 = str3;
                        str6 = str4;
                        if (objG != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        str4 = str6;
                        str3 = str5;
                        z3 = z4;
                        if (!z3) {
                            List list2 = l().a;
                            list2.getClass();
                            tm6 tm6Var2 = new tm6(str4, list2, this, str3, (byte) 1);
                            ConcurrentLinkedDeque concurrentLinkedDeque2 = this.e;
                            concurrentLinkedDeque2.getClass();
                            bw0.g0(concurrentLinkedDeque2, tm6Var2, true);
                        }
                    }
                } else if (!z3) {
                    List list3 = l().a;
                    list3.getClass();
                    tm6 tm6Var3 = new tm6(str4, list3, this, str3, (byte) 1);
                    ConcurrentLinkedDeque concurrentLinkedDeque3 = this.e;
                    concurrentLinkedDeque3.getClass();
                    bw0.g0(concurrentLinkedDeque3, tm6Var3, true);
                }
            } else {
                String id2 = routeProfileD.getId();
                obj = obj2;
                String subId2 = routeProfileD.getSubId();
                fn6[] fn6VarArr4 = (fn6[]) Arrays.copyOf(fn6VarArr, fn6VarArr.length);
                ln6Var2.f0 = str;
                ln6Var2.g0 = str2;
                ln6Var2.h0 = fn6VarArr;
                ln6Var2.i0 = routeProfileN;
                ln6Var2.j0 = routeProfileD;
                ln6Var2.k0 = z;
                ln6Var2.l0 = i5;
                ln6Var2.o0 = 1;
                int i6 = i5;
                objG = g(ln6Var2, mr2.GEOIP, id2, subId2, null, fn6VarArr4);
                if (objG != obj) {
                    str3 = str2;
                    fn6VarArr2 = fn6VarArr;
                    z2 = z;
                    routeProfile = routeProfileD;
                    i = i6;
                    str4 = str;
                    routeProfile2 = routeProfileN;
                }
            }
            return obj;
        }
        return dn8Var;
        z3 = objG != null;
        i2 = i;
        routeProfileD = routeProfile;
        routeProfileN = routeProfile2;
        if (i2 == 0) {
        }
        RouteProfile routeProfile4 = routeProfileD;
        String id3 = routeProfile4.getId();
        String subId3 = routeProfile4.getSubId();
        fn6[] fn6VarArr5 = (fn6[]) Arrays.copyOf(fn6VarArr2, fn6VarArr2.length);
        ln6Var2.f0 = str4;
        ln6Var2.g0 = str3;
        ln6Var2.h0 = null;
        ln6Var2.i0 = null;
        ln6Var2.j0 = null;
        ln6Var2.k0 = z2;
        ln6Var2.l0 = i2;
        ln6Var2.o0 = 2;
        objG = g(ln6Var2, mr2.GEOSITE, id3, subId3, null, fn6VarArr5);
        if (objG != obj) {
            str5 = str3;
            str6 = str4;
            if (objG != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            str4 = str6;
            str3 = str5;
            z3 = z4;
            if (!z3) {
                List list4 = l().a;
                list4.getClass();
                tm6 tm6Var4 = new tm6(str4, list4, this, str3, (byte) 1);
                ConcurrentLinkedDeque concurrentLinkedDeque4 = this.e;
                concurrentLinkedDeque4.getClass();
                bw0.g0(concurrentLinkedDeque4, tm6Var4, true);
            }
            return dn8Var;
        }
        return obj;
    }

    public final void F(String str, boolean z) {
        str.getClass();
        SubRoutingState subRoutingStateQ = q(str);
        if (subRoutingStateQ == null) {
            subRoutingStateQ = new SubRoutingState(false, false);
        }
        if (fm7.o0(str)) {
            str = null;
        }
        if (str == null) {
            str = SubId.SERVER_LIST_NAME;
        }
        this.b.o(str, SubRoutingState.c(subRoutingStateQ, z, false, 2));
    }

    public final void a(String str) {
        RouteProfileId routeProfileId = new RouteProfileId(str);
        ConcurrentLinkedDeque concurrentLinkedDeque = this.e;
        if (concurrentLinkedDeque.contains(routeProfileId)) {
            return;
        }
        concurrentLinkedDeque.addFirst(new RouteProfileId(str));
    }

    public final boolean b(String str, String str2) {
        Long dateLastUpdateSite;
        str.getClass();
        RouteProfile routeProfileN = n(str, str2);
        if (routeProfileN == null) {
            return false;
        }
        List list = l().a;
        list.getClass();
        ArrayList<at1> arrayList = new ArrayList();
        for (Object obj : list) {
            if (dh3.f(((at1) obj).a, str)) {
                arrayList.add(obj);
            }
        }
        ArrayList<qg5> arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
        for (at1 at1Var : arrayList) {
            StateDownloadFile stateDownloadFile = at1Var.d;
            int iOrdinal = at1Var.c.ordinal();
            if (iOrdinal == 0) {
                dateLastUpdateSite = routeProfileN.getData().getRouteSettings().getDateLastUpdateSite();
            } else {
                if (iOrdinal != 1) {
                    b61.c();
                    return false;
                }
                dateLastUpdateSite = routeProfileN.getData().getRouteSettings().getDateLastUpdateIp();
            }
            arrayList2.add(new qg5(stateDownloadFile, dateLastUpdateSite));
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        for (qg5 qg5Var : arrayList2) {
            StateDownloadFile stateDownloadFile2 = (StateDownloadFile) qg5Var.X;
            Long l = (Long) qg5Var.Y;
            if (stateDownloadFile2 == StateDownloadFile.FAILURE || stateDownloadFile2 == StateDownloadFile.LINK_NOT_CORRECT) {
                if (l == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void c() {
        oh7 oh7Var;
        Object value;
        dm5 dm5Var;
        for (Map.Entry entry : ((Map) this.g.X.getValue()).entrySet()) {
            String value2 = ((SubId) entry.getKey()).getValue();
            Iterator<E> it = ((b83) entry.getValue()).iterator();
            while (it.hasNext()) {
                y(((RouteProfile) it.next()).getId(), value2);
            }
        }
        this.e.clear();
        do {
            oh7Var = this.f;
            value = oh7Var.getValue();
            dm5Var = dm5.f0;
            dm5Var.getClass();
        } while (!oh7Var.k(value, dm5Var));
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object e(String str, String str2, fn6[] fn6VarArr, s51 s51Var) throws Throwable {
        cn6 cn6Var;
        Object rj6Var;
        StateCreateProfile.UnknownError unknownError;
        StateCreateProfile stateCreateProfileU;
        fn6[] fn6VarArr2;
        int i;
        RouteProfile routeProfile;
        StateCreateProfile stateCreateProfile;
        if (s51Var instanceof cn6) {
            cn6Var = (cn6) s51Var;
            int i2 = cn6Var.l0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cn6Var.l0 = i2 - Integer.MIN_VALUE;
            } else {
                cn6Var = new cn6(this, s51Var);
            }
        } else {
            cn6Var = new cn6(this, s51Var);
        }
        cn6 cn6Var2 = cn6Var;
        Object obj = cn6Var2.j0;
        int i3 = cn6Var2.l0;
        Object obj2 = c71.X;
        try {
            try {
                if (i3 != 0) {
                    if (i3 == 1) {
                        int i4 = cn6Var2.i0;
                        routeProfile = cn6Var2.h0;
                        StateCreateProfile stateCreateProfile2 = cn6Var2.g0;
                        fn6VarArr2 = (fn6[]) cn6Var2.f0;
                        w39.n0(obj);
                        i = i4;
                        stateCreateProfileU = stateCreateProfile2;
                    } else {
                        if (i3 != 2) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i3 = cn6Var2.i0;
                        stateCreateProfile = cn6Var2.g0;
                        w39.n0(obj);
                    }
                    rj6Var = new StateCreateProfile.Create(((StateCreateProfile.Create) stateCreateProfile).getId());
                    unknownError = StateCreateProfile.UnknownError.INSTANCE;
                    if (rj6Var instanceof rj6) {
                        return unknownError;
                    }
                    return rj6Var;
                }
                w39.n0(obj);
                try {
                    stateCreateProfileU = u(str, str2);
                    if (!(stateCreateProfileU instanceof StateCreateProfile.Create)) {
                        return stateCreateProfileU;
                    }
                    RouteProfile routeProfileN = n(((StateCreateProfile.Create) stateCreateProfileU).getId(), null);
                    if (routeProfileN == null) {
                        return StateCreateProfile.UnknownError.INSTANCE;
                    }
                    mr2 mr2Var = mr2.GEOIP;
                    String id = routeProfileN.getId();
                    String subId = routeProfileN.getSubId();
                    fn6[] fn6VarArr3 = (fn6[]) Arrays.copyOf(fn6VarArr, fn6VarArr.length);
                    cn6Var2.f0 = fn6VarArr;
                    cn6Var2.g0 = stateCreateProfileU;
                    cn6Var2.h0 = routeProfileN;
                    cn6Var2.i0 = 0;
                    cn6Var2.l0 = 1;
                    if (g(cn6Var2, mr2Var, id, subId, null, fn6VarArr3) != obj2) {
                        fn6VarArr2 = fn6VarArr;
                        i = 0;
                        routeProfile = routeProfileN;
                    }
                    return obj2;
                } catch (Throwable th) {
                    th = th;
                    i3 = 0;
                    if (i3 != 0) {
                        th.printStackTrace();
                    }
                    if (th instanceof InterruptedException) {
                    }
                    throw th;
                }
                mr2 mr2Var2 = mr2.GEOSITE;
                String id2 = routeProfile.getId();
                String subId2 = routeProfile.getSubId();
                fn6[] fn6VarArr4 = (fn6[]) Arrays.copyOf(fn6VarArr2, fn6VarArr2.length);
                cn6Var2.f0 = null;
                cn6Var2.g0 = stateCreateProfileU;
                cn6Var2.h0 = null;
                cn6Var2.i0 = i;
                cn6Var2.l0 = 2;
                if (g(cn6Var2, mr2Var2, id2, subId2, null, fn6VarArr4) != obj2) {
                    i3 = i;
                    stateCreateProfile = stateCreateProfileU;
                    rj6Var = new StateCreateProfile.Create(((StateCreateProfile.Create) stateCreateProfile).getId());
                    unknownError = StateCreateProfile.UnknownError.INSTANCE;
                    if (rj6Var instanceof rj6) {
                        return unknownError;
                    }
                    return rj6Var;
                }
                return obj2;
            } catch (Throwable th2) {
                th = th2;
                i3 = i;
                if (i3 != 0 && !fm7.d0(gv3.W(th), "util.protection", false)) {
                    th.printStackTrace();
                }
                if (!(th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var = new rj6(th);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final Object g(s51 s51Var, mr2 mr2Var, String str, String str2, RouteSettings routeSettings, fn6[] fn6VarArr) {
        RouteSettingsCache data;
        RouteSettings updateValue;
        RouteProfile routeProfileD = D(str, str2, new zm6(routeSettings, (byte) 1));
        if (routeProfileD == null || (data = routeProfileD.getData()) == null || (updateValue = data.getUpdateValue()) == null) {
            return null;
        }
        ht1 ht1VarL = l();
        ps psVar = new ps(2);
        psVar.b(this.d);
        psVar.c(fn6VarArr);
        ArrayList arrayList = psVar.b;
        return ht1VarL.a(s51Var, mr2Var, str, str2, updateValue, (fn6[]) arrayList.toArray(new fn6[arrayList.size()]));
    }

    public final StateExportProfile h(String str, String str2) {
        Object rj6Var;
        str.getClass();
        if (str2 == null && (str2 = p(str, true)) == null) {
            return StateExportProfile.NoProfileSelected.INSTANCE;
        }
        RouteProfile routeProfileN = n(str2, str);
        if (routeProfileN == null) {
            return StateExportProfile.NoProfileSelected.INSTANCE;
        }
        try {
            ss8 ss8Var = ss8.a;
            String strB = ss8.b(new a().h(ys0.e0(routeProfileN.getData().getRouteSettings(), routeProfileN.getData().getName())));
            rj6Var = "happ://" + EDeeplinkType.ROUTING.getPrefix() + "add/" + strB;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        return sj6.a(rj6Var) == null ? new StateExportProfile.Success((String) rj6Var) : StateExportProfile.Error.INSTANCE;
    }

    public final ht1 l() {
        return (ht1) this.c.getValue();
    }

    public final RouteProfile n(String str, String str2) {
        str.getClass();
        Object obj = null;
        h76 h76Var = this.g;
        if (str2 == null) {
            for (Object obj2 : xv0.a0(((b2) ((cm5) h76Var.X.getValue())).e())) {
                if (dh3.f(((RouteProfile) obj2).getId(), str)) {
                    obj = obj2;
                    break;
                }
            }
            return (RouteProfile) obj;
        }
        b83 b83Var = (b83) ((cm5) h76Var.X.getValue()).get(new SubId(str2));
        if (b83Var == null) {
            return null;
        }
        for (Object obj3 : b83Var) {
            if (dh3.f(((RouteProfile) obj3).getId(), str)) {
                obj = obj3;
                break;
            }
        }
        return (RouteProfile) obj;
    }

    public final b83 o(String str) {
        b83 b83Var = (b83) ((cm5) this.g.X.getValue()).get(new SubId(str));
        return b83Var == null ? ec7.Y : b83Var;
    }

    public final String p(String str, boolean z) {
        RouteProfile routeProfile;
        Object next;
        str.getClass();
        SubRoutingState subRoutingStateQ = q(str);
        if ((subRoutingStateQ == null || !subRoutingStateQ.getIsEnabled()) && !z) {
            routeProfile = null;
        } else {
            Iterator<E> it = o(str).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((RouteProfile) next).getData().getIsSelected());
            routeProfile = (RouteProfile) next;
        }
        if (routeProfile != null) {
            return routeProfile.getId();
        }
        return null;
    }

    public final SubRoutingState q(String str) {
        str.getClass();
        if (fm7.o0(str)) {
            str = null;
        }
        if (str == null) {
            str = SubId.SERVER_LIST_NAME;
        }
        return (SubRoutingState) this.b.h(str);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0173  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.google.gson.a] */
    /* JADX WARN: Type inference failed for: r17v0, types: [mn6] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, su.happ.proxyutility.dto.ProfileRoutingSettings] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final Object s(ProfileRoutingSettings profileRoutingSettings, String str, fn6[] fn6VarArr, boolean z, boolean z2, s51 s51Var) throws Throwable {
        gn6 gn6Var;
        Object rj6Var;
        StateCreateProfile stateCreateProfileU;
        boolean z3;
        RouteSettings routeSettings;
        fn6[] fn6VarArr2;
        boolean z4;
        int i;
        RouteProfile routeProfile;
        StateCreateProfile stateCreateProfile;
        mr2 mr2Var;
        String id;
        String subId;
        fn6[] fn6VarArr3;
        StateCreateProfile stateCreateProfile2;
        ?? r2 = profileRoutingSettings;
        if (s51Var instanceof gn6) {
            gn6Var = (gn6) s51Var;
            int i2 = gn6Var.o0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gn6Var.o0 = i2 - Integer.MIN_VALUE;
            } else {
                gn6Var = new gn6(this, s51Var);
            }
        } else {
            gn6Var = new gn6(this, s51Var);
        }
        gn6 gn6Var2 = gn6Var;
        Object obj = gn6Var2.m0;
        int i3 = gn6Var2.o0;
        c71 c71Var = c71.X;
        try {
            if (i3 == 0) {
                w39.n0(obj);
                try {
                    stateCreateProfileU = u(r2.getName(), str);
                    if ((stateCreateProfileU instanceof StateCreateProfile.DuplicatedName) && !z) {
                        return StateCreateProfile.DuplicatedName.c((StateCreateProfile.DuplicatedName) stateCreateProfileU, z2, ((a) j.getValue()).h(r2));
                    }
                    if (stateCreateProfileU instanceof StateCreateProfile.DuplicatedName) {
                        String strE = ((StateCreateProfile.DuplicatedName) stateCreateProfileU).getId();
                        fn6[] fn6VarArr4 = (fn6[]) Arrays.copyOf(fn6VarArr, fn6VarArr.length);
                        gn6Var2.f0 = null;
                        gn6Var2.g0 = stateCreateProfileU;
                        gn6Var2.j0 = z;
                        gn6Var2.k0 = z2;
                        gn6Var2.l0 = 0;
                        gn6Var2.o0 = 1;
                        if (E(strE, r2, str, fn6VarArr4, z2, gn6Var2) != c71Var) {
                            stateCreateProfile = stateCreateProfileU;
                            String strE2 = ((StateCreateProfile.DuplicatedName) stateCreateProfile).getId();
                            strE2.getClass();
                            return new StateCreateProfile.Create(strE2);
                        }
                    } else {
                        z3 = z2;
                        if (!(stateCreateProfileU instanceof StateCreateProfile.Create)) {
                            return stateCreateProfileU;
                        }
                        RouteProfile routeProfileN = n(((StateCreateProfile.Create) stateCreateProfileU).getId(), null);
                        if (routeProfileN == null) {
                            return StateCreateProfile.UnknownError.INSTANCE;
                        }
                        RouteSettings routeSettingsW = w(routeProfileN.getData().getRouteSettings(), r2);
                        RouteProfile routeProfileD = D(routeProfileN.getId(), routeProfileN.getSubId(), new zm6(routeSettingsW, (byte) 0));
                        if (routeProfileD == null) {
                            return StateCreateProfile.UnknownError.INSTANCE;
                        }
                        if (z3) {
                            a(routeProfileD.getId());
                        }
                        mr2 mr2Var2 = mr2.GEOIP;
                        String id2 = routeProfileD.getId();
                        String subId2 = routeProfileD.getSubId();
                        fn6[] fn6VarArr5 = (fn6[]) Arrays.copyOf(fn6VarArr, fn6VarArr.length);
                        gn6Var2.f0 = fn6VarArr;
                        gn6Var2.g0 = stateCreateProfileU;
                        gn6Var2.h0 = routeSettingsW;
                        gn6Var2.i0 = routeProfileD;
                        gn6Var2.j0 = z;
                        gn6Var2.k0 = z3;
                        gn6Var2.l0 = 0;
                        gn6Var2.o0 = 2;
                        if (g(gn6Var2, mr2Var2, id2, subId2, routeSettingsW, fn6VarArr5) != c71Var) {
                            routeSettings = routeSettingsW;
                            fn6VarArr2 = fn6VarArr;
                            z4 = z;
                            i = 0;
                            routeProfile = routeProfileD;
                            mr2Var = mr2.GEOSITE;
                            id = routeProfile.getId();
                            subId = routeProfile.getSubId();
                            fn6VarArr3 = (fn6[]) Arrays.copyOf(fn6VarArr2, fn6VarArr2.length);
                            gn6Var2.f0 = null;
                            gn6Var2.g0 = stateCreateProfileU;
                            gn6Var2.h0 = null;
                            gn6Var2.i0 = null;
                            gn6Var2.j0 = z4;
                            gn6Var2.k0 = z3;
                            gn6Var2.l0 = i;
                            gn6Var2.o0 = 3;
                            if (g(gn6Var2, mr2Var, id, subId, routeSettings, fn6VarArr3) != c71Var) {
                                stateCreateProfile2 = stateCreateProfileU;
                                rj6Var = new StateCreateProfile.Create(((StateCreateProfile.Create) stateCreateProfile2).getId());
                            }
                        }
                    }
                    return c71Var;
                } catch (Throwable th) {
                    th = th;
                    r2 = 0;
                    if (r2 != 0) {
                        th.printStackTrace();
                    }
                    if (th instanceof InterruptedException) {
                    }
                    throw th;
                }
            }
            if (i3 == 1) {
                int i4 = gn6Var2.l0;
                stateCreateProfile = gn6Var2.g0;
                w39.n0(obj);
                String strE3 = ((StateCreateProfile.DuplicatedName) stateCreateProfile).getId();
                strE3.getClass();
                return new StateCreateProfile.Create(strE3);
            }
            if (i3 == 2) {
                int i5 = gn6Var2.l0;
                boolean z5 = gn6Var2.k0;
                z4 = gn6Var2.j0;
                routeProfile = gn6Var2.i0;
                RouteSettings routeSettings2 = gn6Var2.h0;
                StateCreateProfile stateCreateProfile3 = gn6Var2.g0;
                fn6VarArr2 = (fn6[]) gn6Var2.f0;
                w39.n0(obj);
                z3 = z5;
                routeSettings = routeSettings2;
                stateCreateProfileU = stateCreateProfile3;
                i = i5;
                try {
                    mr2Var = mr2.GEOSITE;
                    id = routeProfile.getId();
                    subId = routeProfile.getSubId();
                    fn6VarArr3 = (fn6[]) Arrays.copyOf(fn6VarArr2, fn6VarArr2.length);
                    gn6Var2.f0 = null;
                    gn6Var2.g0 = stateCreateProfileU;
                    gn6Var2.h0 = null;
                    gn6Var2.i0 = null;
                    gn6Var2.j0 = z4;
                    gn6Var2.k0 = z3;
                    gn6Var2.l0 = i;
                    gn6Var2.o0 = 3;
                    if (g(gn6Var2, mr2Var, id, subId, routeSettings, fn6VarArr3) != c71Var) {
                        stateCreateProfile2 = stateCreateProfileU;
                    }
                    return c71Var;
                } catch (Throwable th2) {
                    th = th2;
                    r2 = i;
                    if (r2 != 0 && !fm7.d0(gv3.W(th), "util.protection", false)) {
                        th.printStackTrace();
                    }
                    if (!(th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    rj6Var = new rj6(th);
                }
            } else {
                if (i3 != 3) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = gn6Var2.l0;
                stateCreateProfile2 = gn6Var2.g0;
                w39.n0(obj);
            }
            rj6Var = new StateCreateProfile.Create(((StateCreateProfile.Create) stateCreateProfile2).getId());
        } catch (Throwable th3) {
            th = th3;
        }
        return rj6Var instanceof rj6 ? StateCreateProfile.UnknownError.INSTANCE : rj6Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object t(String str, String str2, fn6[] fn6VarArr, boolean z, s51 s51Var) {
        hn6 hn6Var;
        Object rj6Var;
        StateImportProfile stateImportProfile;
        mn6 mn6Var;
        String str3;
        if (s51Var instanceof hn6) {
            hn6Var = (hn6) s51Var;
            int i = hn6Var.j0;
            if ((i & Integer.MIN_VALUE) != 0) {
                hn6Var.j0 = i - Integer.MIN_VALUE;
            } else {
                hn6Var = new hn6(this, s51Var);
            }
        } else {
            hn6Var = new hn6(this, s51Var);
        }
        hn6 hn6Var2 = hn6Var;
        Object objS = hn6Var2.h0;
        int i2 = hn6Var2.j0;
        try {
            if (i2 == 0) {
                w39.n0(objS);
                str.getClass();
                if (!mm7.Z(str, false, "happ://")) {
                    return StateCreateProfile.InvalidDeeplink.INSTANCE;
                }
                EDeeplinkType eDeeplinkTypeB = ae1.b(str);
                String strX0 = fm7.x0("happ://", str);
                if (eDeeplinkTypeB == null) {
                    bt.q("Required value was null.");
                    return null;
                }
                String strC = ae1.c(strX0, eDeeplinkTypeB);
                if (!mm7.Z(strC, false, "add/") && !mm7.Z(strC, false, "onadd/") && !mm7.Z(strC, false, "off")) {
                    return StateCreateProfile.InvalidDeeplink.INSTANCE;
                }
                if (mm7.Z(strC, false, "onadd/")) {
                    stateImportProfile = new StateImportProfile(fm7.x0("onadd/", strC), true, true);
                } else {
                    stateImportProfile = p(str2, true) != null ? new StateImportProfile(fm7.x0("add/", strC), false, false) : new StateImportProfile(fm7.x0("add/", strC), true, false);
                }
                ss8 ss8Var = ss8.a;
                Object objF = f(ss8.a(stateImportProfile.getData()));
                w39.n0(objF);
                ProfileRoutingSettings profileRoutingSettings = (ProfileRoutingSettings) objF;
                if (fm7.o0(profileRoutingSettings.getName())) {
                    profileRoutingSettings.y();
                }
                fn6[] fn6VarArr2 = (fn6[]) Arrays.copyOf(fn6VarArr, fn6VarArr.length);
                boolean zA = stateImportProfile.getActivateInEnd();
                hn6Var2.f0 = str2;
                hn6Var2.g0 = stateImportProfile;
                hn6Var2.j0 = 1;
                mn6Var = this;
                objS = mn6Var.s(profileRoutingSettings, str2, fn6VarArr2, z, zA, hn6Var2);
                c71 c71Var = c71.X;
                if (objS == c71Var) {
                    return c71Var;
                }
                str3 = str2;
            } else {
                if (i2 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                stateImportProfile = hn6Var2.g0;
                str3 = hn6Var2.f0;
                w39.n0(objS);
                mn6Var = this;
            }
            rj6Var = (StateCreateProfile) objS;
            if ((rj6Var instanceof StateCreateProfile.Create) && stateImportProfile.getEnableRouting()) {
                mn6Var.F(str3, true);
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        return sj6.a(rj6Var) == null ? rj6Var : StateCreateProfile.UnknownError.INSTANCE;
    }

    public final StateCreateProfile u(String str, String str2) {
        Object next;
        Object value;
        if (str.length() == 0) {
            return StateCreateProfile.EmptyName.INSTANCE;
        }
        b83 b83VarO = o(str2);
        Iterator<E> it = b83VarO.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!dh3.f(((RouteProfile) next).getData().getName(), str));
        RouteProfile routeProfile = (RouteProfile) next;
        if (routeProfile != null) {
            return new StateCreateProfile.DuplicatedName(routeProfile.getId(), str, null, false);
        }
        RouteProfileId.INSTANCE.getClass();
        String string = UUID.randomUUID().toString();
        string.getClass();
        RouteSettings routeSettingsD = d(string);
        oh7 oh7Var = this.f;
        Collection collection = (b83) ((cm5) oh7Var.getValue()).get(new SubId(str2));
        boolean zIsEmpty = collection != null ? ((z0) collection).isEmpty() : true;
        RouteProfile routeProfile2 = new RouteProfile(string, str2, new RouteSettingsCache(str, routeSettingsD, RouteSettings.e(routeSettingsD, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388607), null, false));
        qm5 qm5VarC = ec7.Y.c();
        qm5VarC.addAll(b83VarO);
        qm5VarC.add(routeProfile2);
        j2 j2VarC = qm5VarC.c();
        do {
            value = oh7Var.getValue();
        } while (!oh7Var.k(value, ((cm5) value).d(new SubId(str2), j2VarC)));
        A();
        if (zIsEmpty) {
            F(str2, true);
            B(string, str2);
        }
        return new StateCreateProfile.Create(string);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void v() {
        Object next;
        Object value;
        cm5 cm5VarF;
        MMKV mmkv = this.a;
        String strI = mmkv.i("setting_geo_routing_array_profiles");
        q51 q51Var = null;
        if (strI != null) {
            try {
                Type type = new in6().b;
                su2 su2Var = yw2.a;
                su2Var.c(type, new ParsingRoutingAdapter());
                a aVar = new a(su2Var);
                String strI2 = mmkv.i("setting_geo_routing_profile");
                Object objC = aVar.c(strI, new yi8(type));
                objC.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Iterable) objC).iterator();
                while (it.hasNext()) {
                    RouteProfile routeProfileR = r(this, (RouteSettingsCache) it.next());
                    if (routeProfileR != null) {
                        arrayList.add(routeProfileR);
                    }
                }
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!dh3.f(((RouteProfile) next).getData().getName(), strI2));
                RouteProfile routeProfile = (RouteProfile) next;
                if (routeProfile != null) {
                    B(routeProfile.getId(), null);
                }
                mmkv.remove("setting_geo_routing_profile");
                mmkv.remove("setting_geo_routing_array_profiles");
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
            }
        }
        String strI3 = mmkv.i("routing_profile_list");
        if (strI3 == null) {
            return;
        }
        try {
            List list = (List) ((a) k.getValue()).d(strI3, new jn6().b);
            list.getClass();
            if (!list.isEmpty() && ((RouteProfile) list.get(0)).getData().getDefaultValue() == null) {
                mmkv.remove("routing_profile_list");
                m51 m51Var = this.i;
                nf1 nf1Var = tp1.a;
                jm4.Q(m51Var, dm4.a, new r5((Object) this, q51Var, (byte) 27), 2);
            }
            oh7 oh7Var = this.f;
            do {
                value = oh7Var.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : list) {
                    SubId subId = new SubId(((RouteProfile) obj).getSubId());
                    Object arrayList2 = linkedHashMap.get(subId);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(subId, arrayList2);
                    }
                    ((List) arrayList2).add(obj);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(aq4.G(linkedHashMap.size()));
                for (Object obj2 : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(((Map.Entry) obj2).getKey(), mb6.d0((Iterable) ((Map.Entry) obj2).getValue()));
                }
                dm5 dm5Var = dm5.f0;
                dm5Var.getClass();
                if (linkedHashMap2.isEmpty()) {
                    cm5VarF = dm5Var;
                } else {
                    em5 em5Var = new em5(dm5Var);
                    em5Var.putAll(linkedHashMap2);
                    cm5VarF = em5Var.f();
                }
            } while (!oh7Var.k(value, cm5VarF));
        } catch (Throwable th2) {
            if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                throw th2;
            }
        }
    }

    public final void x(String str, boolean z) {
        str.getClass();
        RouteProfile routeProfileN = n(str, null);
        if (routeProfileN == null) {
            return;
        }
        boolean zB = b(routeProfileN.getId(), routeProfileN.getSubId());
        ConcurrentLinkedDeque concurrentLinkedDeque = this.e;
        if (!z || zB) {
            concurrentLinkedDeque.remove(new RouteProfileId(str));
            z(this, str);
            return;
        }
        if (p(routeProfileN.getSubId(), true) == null) {
            a(str);
        }
        String subId = routeProfileN.getSubId();
        List list = l().a;
        list.getClass();
        tm6 tm6Var = new tm6(str, list, this, subId, (byte) 1);
        concurrentLinkedDeque.getClass();
        bw0.g0(concurrentLinkedDeque, tm6Var, true);
    }

    public final void y(String str, String str2) {
        Object value;
        cm5 cm5Var;
        GeoFileKey geoFileKey;
        Object value2;
        cm5 cm5Var2;
        GeoFileKey geoFileKey2;
        oh7 oh7Var;
        Object value3;
        Object next;
        RouteProfile routeProfile;
        str.getClass();
        RouteProfile routeProfileN = n(str, str2);
        if (routeProfileN == null) {
            return;
        }
        b83 b83VarO = o(routeProfileN.getSubId());
        da2.R(new File(routeProfileN.getData().getRouteSettings().getLocalPathGeo()));
        ht1 ht1VarL = l();
        String id = routeProfileN.getId();
        String subId = routeProfileN.getSubId();
        mr2 mr2Var = mr2.GEOSITE;
        ht1VarL.e(mr2Var, id);
        oh7 oh7Var2 = ht1VarL.b;
        do {
            value = oh7Var2.getValue();
            cm5Var = (cm5) value;
            geoFileKey = new GeoFileKey(mr2Var, id, subId);
            cm5Var.getClass();
        } while (!oh7Var2.k(value, cm5Var.l(geoFileKey)));
        String id2 = routeProfileN.getId();
        String subId2 = routeProfileN.getSubId();
        mr2 mr2Var2 = mr2.GEOIP;
        ht1VarL.e(mr2Var2, id2);
        do {
            value2 = oh7Var2.getValue();
            cm5Var2 = (cm5) value2;
            geoFileKey2 = new GeoFileKey(mr2Var2, id2, subId2);
            cm5Var2.getClass();
        } while (!oh7Var2.k(value2, cm5Var2.l(geoFileKey2)));
        String strP = p(routeProfileN.getSubId(), true);
        b83VarO.getClass();
        qm5 qm5VarC = ec7.Y.c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b83VarO) {
            if (!dh3.f(obj, routeProfileN)) {
                arrayList.add(obj);
            }
        }
        qm5VarC.addAll(arrayList);
        j2 j2VarC = qm5VarC.c();
        do {
            oh7Var = this.f;
            value3 = oh7Var.getValue();
        } while (!oh7Var.k(value3, ((cm5) value3).d(new SubId(routeProfileN.getSubId()), j2VarC)));
        if (strP == null ? false : strP.equals(str)) {
            ListIterator listIterator = j2VarC.listIterator(0);
            do {
                if (!listIterator.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = listIterator.next();
                    routeProfile = (RouteProfile) next;
                }
            } while (b(routeProfile.getId(), routeProfile.getSubId()));
            RouteProfile routeProfile2 = (RouteProfile) next;
            if (routeProfile2 != null) {
                B(routeProfile2.getId(), routeProfile2.getSubId());
            } else {
                F(routeProfileN.getSubId(), false);
            }
        } else if (strP == null) {
            F(routeProfileN.getSubId(), false);
        }
        A();
    }
}
