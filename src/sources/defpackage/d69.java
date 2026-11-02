package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.a;
import com.tencent.mmkv.MMKV;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.domain.routing.entity.RouteProfile;
import su.happ.proxyutility.domain.routing.entity.RouteSettingsCache;
import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.dto.AuthData;
import su.happ.proxyutility.dto.ExcludeSettingsCache;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.RouteSettings;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EConfigNetworkType;
import su.happ.proxyutility.dto.enums.EConfigObservatoryType;
import su.happ.proxyutility.dto.enums.EConfigType;
import su.happ.proxyutility.dto.enums.EDnsType;
import su.happ.proxyutility.dto.enums.EIpType;
import su.happ.proxyutility.dto.enums.ERoutingSettingsType;
import su.happ.proxyutility.dto.enums.FragmentationType;
import su.happ.proxyutility.dto.enums.InboundAuthMode;
import su.happ.proxyutility.dto.enums.RoutingOrderKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class d69 {
    public static final vz7 a = new vz7(new ng8((byte) 21));
    public static final vz7 b = new vz7(new ng8((byte) 22));
    public static final vz7 c = new vz7(new ng8((byte) 23));
    public static final vz7 d = new vz7(new ng8((byte) 24));
    public static final List e = i21.L(new String[]{"happ.su", "happ-proxy.com", "qlimited.link", "ntp2-sync.com", "time-ntp.com"});

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(List list, List list2, String str, XRayConfig xRayConfig) {
        try {
            XRayConfig.RoutingBean.RulesBean rulesBean = new XRayConfig.RoutingBean.RulesBean(null, null, null, null, null, 16383);
            rulesBean.g(str);
            rulesBean.e(new ArrayList());
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.length() > 0 && (!g(str2) || str.equals("proxy"))) {
                    ArrayList domain = rulesBean.getDomain();
                    if (domain != null) {
                        domain.add(str2);
                    }
                }
            }
            ArrayList domain2 = rulesBean.getDomain();
            if (domain2 != null && (!domain2.isEmpty())) {
                xRayConfig.getRouting().getRules().add(rulesBean);
            }
            XRayConfig.RoutingBean.RulesBean rulesBean2 = new XRayConfig.RoutingBean.RulesBean(null, null, null, null, null, 16383);
            rulesBean2.g(str);
            rulesBean2.f(new ArrayList());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                ss8 ss8Var = ss8.a;
                if (ss8.A(str3) || mm7.Z(str3, false, "geoip:")) {
                    if (!g(str3) || str.equals("proxy")) {
                        ArrayList ip = rulesBean2.getIp();
                        if (ip != null) {
                            ip.add(str3);
                        }
                    }
                }
            }
            ArrayList ip2 = rulesBean2.getIp();
            if (ip2 == null || !(!ip2.isEmpty())) {
                return;
            }
            xRayConfig.getRouting().getRules().add(rulesBean2);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(XRayConfig xRayConfig) {
        try {
            xRayConfig.m(new XRayConfig.Api(i21.f(new String[]{"StatsService"})));
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(XRayConfig xRayConfig, EConfigObservatoryType eConfigObservatoryType) {
        Boolean rj6Var;
        try {
            for (XRayConfig.RoutingBean.RulesBean rulesBean : xRayConfig.getRouting().getRules()) {
                if (dh3.f(rulesBean.getOutboundTag(), "proxy")) {
                    rulesBean.g(null);
                    rulesBean.d();
                }
            }
            List listK = i21.K("proxy-");
            int i = c69.f[eConfigObservatoryType.ordinal()];
            if (i == 1) {
                xRayConfig.getRouting().c(i21.K(new XRayConfig.RoutingBean.BalancerBean(listK, new XRayConfig.RoutingBean.StrategyObject(eConfigObservatoryType.getCoreValue()))));
                ss8 ss8Var = ss8.a;
                xRayConfig.n(new XRayConfig.BurstObservatoryObject(listK, new XRayConfig.BurstObservatoryObject.PingConfigObject(ss8.h())));
            } else if (i == 2) {
                xRayConfig.getRouting().c(i21.K(new XRayConfig.RoutingBean.BalancerBean(listK, new XRayConfig.RoutingBean.StrategyObject(eConfigObservatoryType.getCoreValue()))));
            } else if (i == 3) {
                xRayConfig.getRouting().c(i21.K(new XRayConfig.RoutingBean.BalancerBean(listK, new XRayConfig.RoutingBean.StrategyObject("roundRobin"))));
            } else {
                if (i != 4) {
                    throw new b55();
                }
                xRayConfig.getRouting().c(i21.K(new XRayConfig.RoutingBean.BalancerBean(listK, new XRayConfig.RoutingBean.StrategyObject("leastPing"))));
                ss8 ss8Var2 = ss8.a;
                xRayConfig.q(new XRayConfig.ObservatoryObject(listK, ss8.h()));
            }
            if (dh3.f(xRayConfig.getRouting().getDomainStrategy(), RouteSettings.DEFAULT_ROUTING_DOMAIN_STRATEGY)) {
                xRayConfig.getRouting().getRules().add(new XRayConfig.RoutingBean.RulesBean(i21.f(new String[]{"0.0.0.0/0", "::/0"}), null, null, null, null, 16374));
            } else {
                xRayConfig.getRouting().getRules().add(new XRayConfig.RoutingBean.RulesBean(null, null, null, null, null, 16311));
            }
            rj6Var = Boolean.TRUE;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        Boolean bool = Boolean.FALSE;
        if (rj6Var instanceof rj6) {
            rj6Var = bool;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:55:0x00f0 A[Catch: all -> 0x014d, TryCatch #0 {all -> 0x014d, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x0011, B:8:0x0017, B:11:0x001f, B:13:0x002a, B:15:0x0030, B:17:0x0036, B:19:0x003d, B:21:0x0043, B:23:0x0048, B:25:0x004e, B:26:0x0051, B:28:0x0057, B:30:0x005d, B:31:0x0069, B:34:0x0077, B:45:0x00a5, B:47:0x00b5, B:49:0x00be, B:50:0x00e3, B:52:0x00e9, B:63:0x0119, B:64:0x012d, B:55:0x00f0, B:56:0x00f4, B:58:0x00fa, B:60:0x010c, B:37:0x007e, B:38:0x0082, B:40:0x0088, B:42:0x009a), top: B:73:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fa A[Catch: all -> 0x014d, TryCatch #0 {all -> 0x014d, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x0011, B:8:0x0017, B:11:0x001f, B:13:0x002a, B:15:0x0030, B:17:0x0036, B:19:0x003d, B:21:0x0043, B:23:0x0048, B:25:0x004e, B:26:0x0051, B:28:0x0057, B:30:0x005d, B:31:0x0069, B:34:0x0077, B:45:0x00a5, B:47:0x00b5, B:49:0x00be, B:50:0x00e3, B:52:0x00e9, B:63:0x0119, B:64:0x012d, B:55:0x00f0, B:56:0x00f4, B:58:0x00fa, B:60:0x010c, B:37:0x007e, B:38:0x0082, B:40:0x0088, B:42:0x009a), top: B:73:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static void d(XRayConfig xRayConfig) {
        ArrayList<XRayConfig.OutboundBean> outbounds;
        ArrayList servers;
        List directSites;
        List proxySites;
        RouteSettingsCache routeSettingsCacheB;
        RouteSettingsCache routeSettingsCacheB2;
        RouteSettings routeSettings;
        try {
            RouteProfile routeProfileK = mn6.k(j());
            if ((routeProfileK == null || (routeSettingsCacheB2 = routeProfileK.b()) == null || (routeSettings = routeSettingsCacheB2.getRouteSettings()) == null) ? false : routeSettings.getFakeDnsEnabled()) {
                RouteProfile routeProfileK2 = mn6.k(j());
                RouteSettings routeSettings2 = (routeProfileK2 == null || (routeSettingsCacheB = routeProfileK2.b()) == null) ? null : routeSettingsCacheB.getRouteSettings();
                ArrayList arrayList = new ArrayList();
                if (routeSettings2 != null && (proxySites = routeSettings2.getProxySites()) != null) {
                    arrayList.addAll(proxySites);
                }
                if (routeSettings2 != null && (directSites = routeSettings2.getDirectSites()) != null) {
                    arrayList.addAll(directSites);
                }
                XRayConfig.DnsBean dns = xRayConfig.getDns();
                if (dns != null && (servers = dns.getServers()) != null) {
                    servers.add(0, new XRayConfig.DnsBean.ServersBean("fakedns", null, arrayList, 122));
                }
            }
            ss8 ss8Var = ss8.a;
            List listO = ss8.o();
            ArrayList inbounds = xRayConfig.getInbounds();
            if (inbounds == null || !inbounds.isEmpty()) {
                Iterator it = inbounds.iterator();
                while (true) {
                    if (it.hasNext()) {
                        XRayConfig.InboundBean inboundBean = (XRayConfig.InboundBean) it.next();
                        if (!dh3.f(inboundBean.getProtocol(), "dokodemo-door") || !dh3.f(inboundBean.getTag(), "dns-in")) {
                        }
                    }
                    outbounds = xRayConfig.getOutbounds();
                    if (outbounds != null || !outbounds.isEmpty()) {
                        for (XRayConfig.OutboundBean outboundBean : outbounds) {
                            if (!dh3.f(outboundBean.getProtocol(), "dns") && dh3.f(outboundBean.getTag(), "dns-out")) {
                                xRayConfig.getRouting().getRules().add(0, new XRayConfig.RoutingBean.RulesBean(null, "dns-out", null, null, i21.f(new String[]{"dns-in"}), 15353));
                            }
                        }
                    }
                    xRayConfig.getOutbounds().add(new XRayConfig.OutboundBean("dns-out", "dns", null, null, 48));
                    xRayConfig.getRouting().getRules().add(0, new XRayConfig.RoutingBean.RulesBean(null, "dns-out", null, null, i21.f(new String[]{"dns-in"}), 15353));
                }
            }
            ss8 ss8Var2 = ss8.a;
            xRayConfig.getInbounds().add(new XRayConfig.InboundBean(ss8.C(Integer.parseInt("10853"), n67.c().i("pref_local_dns_port")), new XRayConfig.InboundBean.InSettingsBean(ss8.y((String) wv0.r0(listO)) ? (String) wv0.r0(listO) : RouteSettings.DEFAULT_REMOTE_DNS_IP, 63)));
            outbounds = xRayConfig.getOutbounds();
            if (outbounds != null) {
                while (r0.hasNext()) {
                    if (!dh3.f(outboundBean.getProtocol(), "dns")) {
                    }
                }
                xRayConfig.getOutbounds().add(new XRayConfig.OutboundBean("dns-out", "dns", null, null, 48));
            } else {
                while (r0.hasNext()) {
                    if (!dh3.f(outboundBean.getProtocol(), "dns")) {
                    }
                }
                xRayConfig.getOutbounds().add(new XRayConfig.OutboundBean("dns-out", "dns", null, null, 48));
            }
            xRayConfig.getRouting().getRules().add(0, new XRayConfig.RoutingBean.RulesBean(null, "dns-out", null, null, i21.f(new String[]{"dns-in"}), 15353));
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v6, resolved type: java.lang.String[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: java.lang.String[] */
    /* JADX WARN: Code duplicated, block: B:28:0x0080 A[Catch: all -> 0x023f, TryCatch #0 {all -> 0x023f, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x001b, B:8:0x0021, B:10:0x0039, B:13:0x004b, B:16:0x0057, B:21:0x0068, B:23:0x006e, B:27:0x0077, B:30:0x0091, B:32:0x009d, B:35:0x00a9, B:40:0x00b7, B:42:0x00bd, B:46:0x00c6, B:51:0x00e9, B:53:0x00f7, B:55:0x0106, B:59:0x010f, B:60:0x0116, B:62:0x0122, B:64:0x0131, B:68:0x013a, B:69:0x0141, B:71:0x014a, B:73:0x0150, B:74:0x0158, B:76:0x015e, B:77:0x0172, B:83:0x0195, B:88:0x01af, B:90:0x01cb, B:92:0x01d5, B:94:0x01db, B:98:0x01e2, B:99:0x0201, B:101:0x020d, B:103:0x0217, B:104:0x021b, B:107:0x0220, B:84:0x019c, B:85:0x01a1, B:86:0x01a2, B:87:0x01a9, B:47:0x00cf, B:48:0x00dd, B:28:0x0080, B:29:0x008e, B:49:0x00e1), top: B:116:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cf A[Catch: all -> 0x023f, TryCatch #0 {all -> 0x023f, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x001b, B:8:0x0021, B:10:0x0039, B:13:0x004b, B:16:0x0057, B:21:0x0068, B:23:0x006e, B:27:0x0077, B:30:0x0091, B:32:0x009d, B:35:0x00a9, B:40:0x00b7, B:42:0x00bd, B:46:0x00c6, B:51:0x00e9, B:53:0x00f7, B:55:0x0106, B:59:0x010f, B:60:0x0116, B:62:0x0122, B:64:0x0131, B:68:0x013a, B:69:0x0141, B:71:0x014a, B:73:0x0150, B:74:0x0158, B:76:0x015e, B:77:0x0172, B:83:0x0195, B:88:0x01af, B:90:0x01cb, B:92:0x01d5, B:94:0x01db, B:98:0x01e2, B:99:0x0201, B:101:0x020d, B:103:0x0217, B:104:0x021b, B:107:0x0220, B:84:0x019c, B:85:0x01a1, B:86:0x01a2, B:87:0x01a9, B:47:0x00cf, B:48:0x00dd, B:28:0x0080, B:29:0x008e, B:49:0x00e1), top: B:116:0x0000 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public static void e(XRayConfig xRayConfig) {
        String ipValue;
        Map dnsHosts;
        RouteSettingsCache routeSettingsCacheB;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            RouteProfile routeProfileK = mn6.k(j());
            RouteSettings routeSettings = (routeProfileK == null || (routeSettingsCacheB = routeProfileK.b()) == null) ? null : routeSettingsCacheB.getRouteSettings();
            ss8 ss8Var = ss8.a;
            List listO = ss8.o();
            List listI = ss8.i();
            z59 z59Var = new z59(listO, routeSettings, arrayList);
            z59 z59Var2 = new z59(routeSettings, arrayList, listI);
            if (routeSettings != null) {
                EDnsType remoteDnsType = routeSettings.getRemoteDnsType();
                int[] iArr = c69.e;
                if (iArr[remoteDnsType.ordinal()] == 1) {
                    String remoteDnsDomain = routeSettings.getRemoteDnsDomain();
                    if (remoteDnsDomain.length() == 0) {
                        remoteDnsDomain = RouteSettings.DEFAULT_DNS_DOMAIN_REMOTE;
                    }
                    arrayList.add(remoteDnsDomain);
                    List proxySites = routeSettings.getProxySites();
                    if (proxySites.isEmpty()) {
                        proxySites = null;
                    }
                    if (proxySites == null) {
                        arrayList.add(new XRayConfig.DnsBean.ServersBean(remoteDnsDomain, null, new ArrayList(), 122));
                    } else {
                        MMKV mmkvK = k();
                        if (mmkvK != null && mmkvK.c("pref_run_without_routing", false)) {
                            proxySites = null;
                        }
                        if (proxySites != null) {
                            arrayList.add(new XRayConfig.DnsBean.ServersBean(remoteDnsDomain, null, proxySites, 122));
                        } else {
                            arrayList.add(new XRayConfig.DnsBean.ServersBean(remoteDnsDomain, null, new ArrayList(), 122));
                        }
                    }
                } else {
                    z59Var.invoke();
                }
                if (iArr[routeSettings.getDomesticDnsType().ordinal()] == 1) {
                    String domesticDnsDomain = routeSettings.getDomesticDnsDomain();
                    if (domesticDnsDomain.length() == 0) {
                        domesticDnsDomain = RouteSettings.DEFAULT_DNS_DOMAIN_DOMESTIC;
                    }
                    List directSites = routeSettings.getDirectSites();
                    if (directSites.isEmpty()) {
                        directSites = null;
                    }
                    if (directSites == null) {
                        arrayList.add(new XRayConfig.DnsBean.ServersBean(domesticDnsDomain, null, new ArrayList(), 122));
                    } else {
                        MMKV mmkvK2 = k();
                        if (mmkvK2 != null && mmkvK2.c("pref_run_without_routing", false)) {
                            directSites = null;
                        }
                        if (directSites != null) {
                            arrayList.add(new XRayConfig.DnsBean.ServersBean(domesticDnsDomain, null, directSites, 122));
                        } else {
                            arrayList.add(new XRayConfig.DnsBean.ServersBean(domesticDnsDomain, null, new ArrayList(), 122));
                        }
                    }
                } else {
                    z59Var2.invoke();
                }
            } else {
                z59Var.invoke();
                z59Var2.invoke();
            }
            if (routeSettings != null) {
                EDnsType remoteDnsType2 = routeSettings.getRemoteDnsType();
                int[] iArr2 = c69.e;
                if (iArr2[remoteDnsType2.ordinal()] == 1) {
                    String host = new URL(routeSettings.getRemoteDnsDomain()).getHost();
                    if (host == null || host.length() == 0) {
                        host = null;
                    }
                    if (host != null) {
                        linkedHashMap.put(host, routeSettings.getRemoteDnsIp());
                    }
                }
                if (iArr2[routeSettings.getDomesticDnsType().ordinal()] == 1) {
                    String host2 = new URL(routeSettings.getDomesticDnsDomain()).getHost();
                    if (host2 == null || host2.length() == 0) {
                        host2 = null;
                    }
                    if (host2 != null) {
                        linkedHashMap.put(host2, routeSettings.getDomesticDnsIp());
                    }
                }
            }
            linkedHashMap.put("domain:googleapis.cn", "googleapis.com");
            if (routeSettings != null && (dnsHosts = routeSettings.getDnsHosts()) != null) {
                for (Map.Entry entry : dnsHosts.entrySet()) {
                    linkedHashMap.put((String) entry.getKey(), entry.getValue());
                }
            }
            EIpType.Companion companion = EIpType.INSTANCE;
            String strI = k().i("pref_ip_type");
            companion.getClass();
            int i = c69.b[EIpType.Companion.a(strI).ordinal()];
            if (i == 1) {
                ipValue = EIpType.IPv4.getIpValue();
            } else if (i == 2) {
                ipValue = EIpType.IPv6.getIpValue();
            } else {
                if (i != 3) {
                    throw new b55();
                }
                ipValue = EIpType.AUTO.getIpValue();
            }
            xRayConfig.o(new XRayConfig.DnsBean(arrayList, linkedHashMap, ipValue));
            ss8 ss8Var2 = ss8.a;
            if (ss8.y((String) wv0.r0(listI))) {
                xRayConfig.getRouting().getRules().add(0, new XRayConfig.RoutingBean.RulesBean(i21.f(new String[]{wv0.r0(listI)}), "direct", String.valueOf((routeSettings != null ? routeSettings.getDomesticDnsType() : null) == EDnsType.DOH ? 443 : 53), null, null, 16360));
            }
            if (ss8.y((String) wv0.r0(listO))) {
                xRayConfig.getRouting().getRules().add(0, new XRayConfig.RoutingBean.RulesBean(i21.f(new String[]{wv0.r0(listO)}), "proxy", String.valueOf((routeSettings != null ? routeSettings.getRemoteDnsType() : null) == EDnsType.DOH ? 443 : 53), null, null, 16360));
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(XRayConfig xRayConfig) {
        RouteSettingsCache routeSettingsCacheB;
        RouteSettings routeSettings;
        RouteProfile routeProfileK = mn6.k(j());
        boolean fakeDnsEnabled = (routeProfileK == null || (routeSettingsCacheB = routeProfileK.b()) == null || (routeSettings = routeSettingsCacheB.getRouteSettings()) == null) ? false : routeSettings.getFakeDnsEnabled();
        if (k().b("pref_local_dns_enabled") || fakeDnsEnabled) {
            xRayConfig.p(i21.K(new XRayConfig.FakednsBean()));
            ArrayList outbounds = xRayConfig.getOutbounds();
            ArrayList arrayList = new ArrayList();
            for (Object obj : outbounds) {
                XRayConfig.OutboundBean outboundBean = (XRayConfig.OutboundBean) obj;
                if (dh3.f(outboundBean.getProtocol(), "freedom") && dh3.f(outboundBean.getTag(), "direct")) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                XRayConfig.OutboundBean.OutSettingsBean settings = ((XRayConfig.OutboundBean) it.next()).getSettings();
                if (settings != null) {
                    settings.n();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean g(String str) {
        List list = e;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (fm7.d0(str, (CharSequence) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static b69 h(Context context, LinkedHashMap linkedHashMap, List list, HashMap map) {
        b69 rj6Var;
        String ipValue;
        context.getClass();
        try {
            rj6Var = new b69();
            rj6Var.a = false;
            rj6Var.b = "";
            XRayConfig xRayConfigQ = q(context, true);
            if (xRayConfigQ == null) {
                return rj6Var;
            }
            GuId.Companion.getClass();
            r(xRayConfigQ, GuId.a(), false);
            XRayConfig.OutboundBean outboundBean = new XRayConfig.OutboundBean(MetaParams.FRAGMENT, "freedom", null, null, 60);
            outboundBean.o(new XRayConfig.OutboundBean.OutSettingsBean(null, null, 33553407));
            outboundBean.p(new XRayConfig.OutboundBean.StreamSettingsBean(null, new XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean(i21.K(new XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean(linkedHashMap)), i21.K(new XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean("noise", XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean.UdpMaskSettingBean.a(null, null, list, null, null, 495))), 4), new XRayConfig.OutboundBean.StreamSettingsBean.SockoptBean(238), 6143));
            xRayConfigQ.getOutbounds().set(0, outboundBean);
            p(xRayConfigQ, true);
            ArrayList arrayList = new ArrayList();
            for (XRayConfig.InboundBean inboundBean : xRayConfigQ.getInbounds()) {
                if (dh3.f(inboundBean.getProtocol(), "socks")) {
                    vz7 vz7Var = n67.a;
                    ss8 ss8Var = ss8.a;
                    inboundBean.g(ss8.C(Integer.parseInt("10811"), n67.c().i("pref_fronting_socks_port")));
                } else {
                    arrayList.add(inboundBean);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                xRayConfigQ.getInbounds().remove((XRayConfig.InboundBean) it.next());
            }
            EIpType.Companion companion = EIpType.INSTANCE;
            String strI = k().i("pref_ip_type");
            companion.getClass();
            int i = c69.b[EIpType.Companion.a(strI).ordinal()];
            if (i == 1) {
                ipValue = EIpType.IPv4.getIpValue();
            } else if (i == 2) {
                ipValue = EIpType.IPv6.getIpValue();
            } else {
                if (i != 3) {
                    throw new b55();
                }
                ipValue = EIpType.AUTO.getIpValue();
            }
            xRayConfigQ.o(new XRayConfig.DnsBean(i21.f(new Object[]{"localhost"}), map, ipValue));
            b(xRayConfigQ);
            rj6Var.a = true;
            rj6Var.b = yw2.d.h(xRayConfigQ);
            if (sj6.a(rj6Var) != null) {
                rj6Var = new b69();
                rj6Var.a = false;
                rj6Var.b = "";
            }
            return rj6Var;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static kf4 i() {
        return (kf4) c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static mn6 j() {
        return (mn6) d.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static MMKV k() {
        return (MMKV) b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static b69 l(Context context, String str, boolean z, int i) {
        Boolean bool = Boolean.TRUE;
        boolean z2 = (i & 4) != 0 ? false : z;
        boolean z3 = (i & 8) == 0;
        if ((i & 16) != 0) {
            bool = null;
        }
        context.getClass();
        str.getClass();
        try {
            j().v();
            HappApplication happApplication = HappApplication.M0;
            ((u42) k32.i().s0.getValue()).b();
            kw4 kw4Var = kw4.a;
            ServerConfig serverConfigB = kw4.b(str);
            if (serverConfigB == null) {
                b69 b69Var = new b69();
                b69Var.a = false;
                b69Var.b = "";
                return b69Var;
            }
            if (serverConfigB.getConfigType() == EConfigType.CUSTOM) {
                return m(context, str, serverConfigB, bool != null ? bool.booleanValue() : z3, z3);
            }
            XRayConfig.OutboundBean outboundBeanG = serverConfigB.g();
            if (outboundBeanG != null) {
                return n(context, outboundBeanG, serverConfigB.getRemarks(), z2, str, z3);
            }
            b69 b69Var2 = new b69();
            b69Var2.a = false;
            b69Var2.b = "";
            return b69Var2;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            b69 rj6Var = new rj6(th);
            if (sj6.a(rj6Var) != null) {
                rj6Var = new b69();
                rj6Var.a = false;
                rj6Var.b = "";
            }
            return rj6Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:108:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:127:0x034e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0437  */
    /* JADX WARN: Code duplicated, block: B:169:0x0462  */
    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    public static b69 m(Context context, String str, ServerConfig serverConfig, boolean z, boolean z2) {
        String strH;
        InboundAuthMode inboundAuthMode;
        String str2;
        String str3;
        Object obj;
        InboundAuthMode inboundAuthMode2;
        Object obj2;
        String rj6Var;
        Object next;
        Object objB;
        bo3 bo3VarJ;
        bq3 bq3VarC;
        bq3 bq3VarC2;
        String str4;
        String str5;
        bo3 bo3VarJ2;
        bq3 bq3Var;
        dn8 dn8Var;
        String strI = ((MMKV) a.getValue()).i(str);
        String str6 = "";
        if (strI == null || fm7.o0(strI)) {
            XRayConfig fullConfig = serverConfig.getFullConfig();
            if (fullConfig == null) {
                b69 b69Var = new b69();
                b69Var.a = false;
                b69Var.b = "";
                return b69Var;
            }
            if (z2) {
                fullConfig.getLog().a("");
                fullConfig.getLog().b("");
            } else {
                XRayConfig.LogBean log = fullConfig.getLog();
                String strD = i().d();
                if (strD == null) {
                    strD = "";
                }
                log.a(strD);
                XRayConfig.LogBean log2 = fullConfig.getLog();
                String strE = i().e(str);
                if (strE == null) {
                    strE = "";
                }
                log2.b(strE);
            }
            o(fullConfig, true);
            strH = yw2.d.h(fullConfig);
        } else {
            a aVar = yw2.c;
            aVar.getClass();
            bq3 bq3Var2 = (bq3) aVar.c(strI, new yi8(bq3.class));
            if (z) {
                bq3Var2.getClass();
                i21.R(bq3Var2, "geodata");
            }
            if (z2) {
                bq3 bq3VarL = bq3Var2.l("log");
                if (bq3VarL != null) {
                    i21.R(bq3VarL, "access");
                    i21.R(bq3VarL, "error");
                }
            } else {
                String strD2 = i().d();
                String strE2 = i().e(str);
                bq3 bq3VarL2 = bq3Var2.l("log");
                if (bq3VarL2 != null) {
                    i21.R(bq3VarL2, "access");
                    if (strD2 != null) {
                        bq3VarL2.i("access", strD2);
                    }
                    i21.R(bq3VarL2, "error");
                    if (strE2 != null) {
                        bq3VarL2.i("error", strE2);
                        dn8Var = dn8.a;
                    } else {
                        dn8Var = null;
                    }
                    if (dn8Var == null) {
                        bq3Var = new bq3();
                        if (strD2 != null) {
                            bq3Var.i("access", strD2);
                        }
                        if (strE2 != null) {
                            bq3Var.i("error", strE2);
                        }
                        bq3Var2.e("log", bq3Var);
                    }
                } else {
                    bq3Var = new bq3();
                    if (strD2 != null) {
                        bq3Var.i("access", strD2);
                    }
                    if (strE2 != null) {
                        bq3Var.i("error", strE2);
                    }
                    bq3Var2.e("log", bq3Var);
                }
            }
            if (k().c("pref_run_without_routing", false)) {
                XRayConfig.RoutingBean.RulesBean rulesBean = new XRayConfig.RoutingBean.RulesBean(null, null, null, null, null, 16383);
                XRayConfig.RoutingBean.RulesBean rulesBean2 = new XRayConfig.RoutingBean.RulesBean(null, null, null, null, null, 16383);
                rulesBean.f(i21.f(new String[]{RouteSettings.DEFAULT_REMOTE_DNS_IP}));
                rulesBean.g("proxy");
                rulesBean.h();
                rulesBean2.f(i21.f(new String[]{RouteSettings.DEFAULT_DOMESTIC_DNS_IP}));
                rulesBean2.g("direct");
                rulesBean2.h();
                bq3Var2.l(MetaParams.ROUTING).e("rules", (bo3) aVar.c(aVar.h(i21.f(new XRayConfig.RoutingBean.RulesBean[]{rulesBean, rulesBean2})), new yi8(bo3.class)));
                bq3Var2.l("dns").e("servers", (bo3) aVar.c(aVar.h(i21.f(new String[]{RouteSettings.DEFAULT_REMOTE_DNS_IP, RouteSettings.DEFAULT_DOMESTIC_DNS_IP})), new yi8(bo3.class)));
                k().p("pref_run_without_routing", false);
            }
            strH = bq3Var2.toString();
        }
        if (z2) {
            b69 b69Var2 = new b69();
            b69Var2.a = true;
            b69Var2.b = strH;
            return b69Var2;
        }
        a aVar2 = yw2.c;
        aVar2.getClass();
        bq3 bq3Var3 = (bq3) aVar2.c(strH, new yi8(bq3.class));
        bo3 bo3VarJ3 = bq3Var3.j("inbounds");
        ya4 ya4Var = bq3Var3.X;
        Boolean boolValueOf = bo3VarJ3 != null ? Boolean.valueOf(bo3VarJ3 instanceof xp3) : null;
        Boolean bool = Boolean.FALSE;
        en3 en3Var = dh3.f(boolValueOf, bool) ? (en3) ya4Var.get("inbounds") : new en3();
        String str7 = "outbounds";
        bo3 bo3VarJ4 = bq3Var3.j("outbounds");
        en3 en3Var2 = dh3.f(bo3VarJ4 != null ? Boolean.valueOf(bo3VarJ4 instanceof xp3) : null, bool) ? (en3) ya4Var.get("outbounds") : new en3();
        bo3 bo3VarJ5 = bq3Var3.j(MetaParams.ROUTING);
        bq3 bq3VarL3 = dh3.f(bo3VarJ5 != null ? Boolean.valueOf(bo3VarJ5 instanceof xp3) : null, bool) ? bq3Var3.l(MetaParams.ROUTING) : new bq3();
        bo3 bo3VarJ6 = bq3VarL3.j("rules");
        en3 en3Var3 = dh3.f(bo3VarJ6 != null ? Boolean.valueOf(bo3VarJ6 instanceof xp3) : null, bool) ? (en3) bq3VarL3.X.get("rules") : new en3();
        String str8 = "pref_proxy_sharing_enabled";
        if (n67.c().c("pref_proxy_sharing_enabled", false)) {
            try {
                en3Var.getClass();
                ka2 ka2Var = new ka2(new la2(w27.l0(new la2(new hu(en3Var, (byte) 1), true, new a69((byte) 6)), new a69((byte) 7)), true, new ut8((byte) 26)));
                while (ka2Var.hasNext()) {
                    bq3 bq3Var4 = (bq3) ka2Var.next();
                    bq3Var4.getClass();
                    i21.R(bq3Var4, "listen");
                }
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
            }
        }
        en3Var.getClass();
        ArrayList arrayList = en3Var.X;
        int iD = n67.d();
        int iE = k().e(-1, "pref_socks_auth_mode");
        Integer numValueOf = Integer.valueOf(iE);
        if (iE == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            inboundAuthMode = (InboundAuthMode) InboundAuthMode.b().get(numValueOf.intValue());
            if (inboundAuthMode == null) {
                InboundAuthMode.INSTANCE.getClass();
                inboundAuthMode = InboundAuthMode.f5default;
            }
        } else {
            InboundAuthMode.INSTANCE.getClass();
            inboundAuthMode = InboundAuthMode.f5default;
        }
        InboundAuthMode inboundAuthMode3 = inboundAuthMode;
        md8 md8VarL0 = w27.l0(new la2(new hu(en3Var, (byte) 1), true, new ut8((byte) 29)), new a69((byte) 0));
        Iterator it = md8VarL0.a.iterator();
        while (true) {
            Iterator it2 = it;
            str2 = "socks";
            if (!it.hasNext()) {
                str3 = str6;
                obj = null;
                break;
            }
            str3 = str6;
            md8 md8Var = md8VarL0;
            Object objB2 = md8VarL0.b.B(it2.next());
            bq3 bq3Var5 = (bq3) objB2;
            obj = objB2;
            if (dh3.f(bq3Var5.j("protocol").d(), "socks") && bq3Var5.j("port").a() == iD) {
                break;
            }
            it = it2;
            str6 = str3;
            md8VarL0 = md8Var;
        }
        bq3 bq3Var6 = (bq3) obj;
        int iB = n67.b();
        int iE2 = k().e(-1, "pref_http_auth_mode");
        Integer numValueOf2 = Integer.valueOf(iE2);
        if (iE2 == -1) {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            inboundAuthMode2 = (InboundAuthMode) InboundAuthMode.b().get(numValueOf2.intValue());
            if (inboundAuthMode2 == null) {
                InboundAuthMode.INSTANCE.getClass();
                inboundAuthMode2 = InboundAuthMode.f5default;
            }
        } else {
            InboundAuthMode.INSTANCE.getClass();
            inboundAuthMode2 = InboundAuthMode.f5default;
        }
        InboundAuthMode inboundAuthMode4 = inboundAuthMode2;
        md8 md8VarL1 = w27.l0(new la2(new hu(en3Var, (byte) 1), true, new a69((byte) 1)), new a69((byte) 2));
        Iterator it3 = md8VarL1.a.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj2 = null;
                break;
            }
            Object objB3 = md8VarL1.b.B(it3.next());
            bq3 bq3Var7 = (bq3) objB3;
            md8 md8Var2 = md8VarL1;
            obj2 = objB3;
            if (dh3.f(bq3Var7.j("protocol").d(), "http") && bq3Var7.j("port").a() == iB) {
                break;
            }
            md8VarL1 = md8Var2;
        }
        bq3 bq3Var8 = (bq3) obj2;
        HappApplication happApplication = HappApplication.M0;
        c16 c16VarE = k32.i().e();
        ka2 ka2Var2 = new ka2(new la2(w27.l0(new la2(new hu(en3Var, (byte) 1), true, new a69((byte) 3)), new a69((byte) 4)), true, new n73(iD, iB, (byte) 1)));
        while (ka2Var2.hasNext()) {
            bq3 bq3Var9 = (bq3) ka2Var2.next();
            boolean zF = dh3.f(bq3Var9.j("protocol").d(), str2);
            bq3 bq3Var10 = zF ? bq3Var6 : bq3Var8;
            InboundAuthMode inboundAuthMode5 = zF ? inboundAuthMode3 : inboundAuthMode4;
            AuthData authDataF = zF ? c16VarE.f() : c16VarE.d();
            c16 c16Var = c16VarE;
            bo3 bo3VarJ7 = bq3Var9.j("settings");
            ka2 ka2Var3 = ka2Var2;
            if (bo3VarJ7 == null) {
                bq3VarC = yw2.c.k(new XRayConfig.InboundBean.InSettingsBean(null, 511)).c();
            } else {
                if (!(bo3VarJ7 instanceof bq3)) {
                    bo3VarJ7 = null;
                }
                if (bo3VarJ7 != null) {
                    bq3VarC = bo3VarJ7.c();
                } else {
                    bq3VarC = yw2.c.k(new XRayConfig.InboundBean.InSettingsBean(null, 511)).c();
                }
            }
            if (bq3Var10 == null || (bo3VarJ2 = bq3Var10.j("settings")) == null) {
                bq3VarC2 = null;
            } else {
                if (!(bo3VarJ2 instanceof bq3)) {
                    bo3VarJ2 = null;
                }
                if (bo3VarJ2 != null) {
                    bq3VarC2 = bo3VarJ2.c();
                } else {
                    bq3VarC2 = null;
                }
            }
            if (n67.c().c(str8, false)) {
                bq3VarC.e("auth", new iq3("noauth"));
                bo3 bo3VarK = yw2.c.k(bq3VarC);
                bo3VarK.getClass();
                bq3Var9.e("settings", bo3VarK);
                str4 = str7;
                str5 = str8;
            } else {
                int i = c69.c[inboundAuthMode5.ordinal()];
                if (i != 1 || bq3VarC2 == null) {
                    if (i == 1 || i == 2) {
                        str4 = str7;
                        str5 = str8;
                        bq3VarC.e("auth", new iq3("noauth"));
                    } else {
                        str5 = str8;
                        str4 = str7;
                        if (i == 3) {
                            bq3VarC.e("auth", new iq3("password"));
                            en3 en3Var4 = new en3();
                            bq3 bq3Var11 = new bq3();
                            bq3Var11.e("user", new iq3(authDataF.getUser()));
                            bq3Var11.e("pass", new iq3(authDataF.getPassword()));
                            en3Var4.e(bq3Var11);
                            bq3VarC.e("accounts", en3Var4);
                        } else {
                            if (i != 4) {
                                b61.c();
                                return null;
                            }
                            bq3VarC.e("auth", new iq3("password"));
                            en3 en3Var5 = new en3();
                            bq3 bq3Var12 = new bq3();
                            bq3Var12.e("user", new iq3(authDataF.getUser()));
                            bq3Var12.e("pass", new iq3(authDataF.getPassword()));
                            en3Var5.e(bq3Var12);
                            bq3VarC.e("accounts", en3Var5);
                        }
                    }
                    bo3 bo3VarK2 = yw2.c.k(bq3VarC);
                    bo3VarK2.getClass();
                    bq3Var9.e("settings", bo3VarK2);
                } else {
                    bq3VarC = bq3VarC2;
                    str4 = str7;
                    str5 = str8;
                }
                bo3 bo3VarK3 = yw2.c.k(bq3VarC);
                bo3VarK3.getClass();
                bq3Var9.e("settings", bo3VarK3);
            }
            c16VarE = c16Var;
            ka2Var2 = ka2Var3;
            str2 = str2;
            str8 = str5;
            str7 = str4;
        }
        String str9 = str7;
        if (n67.f() && n67.c().c("pref_block_bindtodevice_enabled", false)) {
            en3Var2.getClass();
            md8 md8VarL2 = w27.l0(new la2(new hu(en3Var2, (byte) 1), true, new ut8((byte) 27)), new ut8((byte) 28));
            Iterator it4 = md8VarL2.a.iterator();
            do {
                if (!it4.hasNext()) {
                    objB = null;
                    break;
                }
                objB = md8VarL2.b.B(it4.next());
                bo3VarJ = ((bq3) objB).j("tag");
            } while (!dh3.f(bo3VarJ != null ? bo3VarJ.d() : null, "block"));
            if (((bq3) objB) == null) {
                bq3 bq3Var13 = new bq3();
                bq3Var13.i("tag", "block");
                bq3Var13.i("protocol", "blackhole");
                en3Var2.e(bq3Var13);
            }
            en3Var3.getClass();
            bq3 bq3Var14 = new bq3();
            en3 en3Var6 = new en3();
            en3Var6.X.add(new iq3("-1"));
            bq3Var14.e("process", en3Var6);
            bq3Var14.i("outboundTag", "block");
            en3 en3Var7 = new en3();
            en3Var7.e(bq3Var14);
            en3Var7.X.addAll(en3Var3.X);
            en3Var3 = en3Var7;
        }
        bq3Var3.e("inbounds", en3Var);
        en3Var2.getClass();
        bq3Var3.e(str9, en3Var2);
        en3Var3.getClass();
        bq3VarL3.e("rules", en3Var3);
        bq3Var3.e(MetaParams.ROUTING, bq3VarL3);
        if (!n67.f()) {
            String strE3 = x79.e(bq3Var3);
            b69 b69Var3 = new b69();
            b69Var3.a = true;
            b69Var3.b = strE3;
            return b69Var3;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                bo3 bo3Var = (bo3) obj3;
                bo3Var.getClass();
                if (bo3Var instanceof bq3) {
                    arrayList2.add(obj3);
                }
            }
            Iterator it5 = arrayList2.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    ss8 ss8Var = ss8.a;
                    String strD3 = ss8.D(context, "xray_config_with_tun.json");
                    a aVar3 = yw2.c;
                    aVar3.getClass();
                    Iterator it6 = ((XRayConfig) aVar3.c(strD3, new yi8(XRayConfig.class))).getInbounds().iterator();
                    do {
                        if (!it6.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it6.next();
                    } while (!dh3.f(((XRayConfig.InboundBean) next).getTag(), "tun"));
                    XRayConfig.InboundBean inboundBean = (XRayConfig.InboundBean) next;
                    if (inboundBean != null) {
                        XRayConfig.InboundBean.InSettingsBean settings = inboundBean.getSettings();
                        if (settings != null) {
                            vz7 vz7Var = n67.a;
                            ss8 ss8Var2 = ss8.a;
                            settings.c(Integer.valueOf(ss8.C(1500, n67.c().i("pref_tun_mtu"))));
                        }
                        en3Var.e(yw2.c.k(inboundBean));
                        if (arrayList.size() == 1) {
                            bq3Var3.e("inbounds", en3Var);
                        }
                        rj6Var = x79.e(bq3Var3);
                        break;
                    }
                    rj6Var = x79.e(bq3Var3);
                    break;
                }
                bq3 bq3VarC3 = ((bo3) it5.next()).c();
                bo3 bo3VarJ8 = bq3VarC3.j("tag");
                if (dh3.f(dh3.f(bo3VarJ8 != null ? Boolean.valueOf(bo3VarJ8 instanceof xp3) : null, Boolean.FALSE) ? bq3VarC3.j("tag").d() : str3, "tun")) {
                    rj6Var = x79.e(bq3Var3);
                    break;
                }
            }
        } catch (Throwable th2) {
            if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            rj6Var = new rj6(th2);
        }
        String strE4 = rj6Var instanceof rj6 ? null : rj6Var;
        if (strE4 == null) {
            strE4 = x79.e(bq3Var3);
        }
        b69 b69Var4 = new b69();
        b69Var4.a = true;
        b69Var4.b = strE4;
        return b69Var4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    public static b69 n(Context context, XRayConfig.OutboundBean outboundBean, String str, boolean z, String str2, boolean z2) {
        Object next;
        RouteSettingsCache routeSettingsCacheB;
        RouteSettings routeSettings;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings;
        XRayConfig.OutboundBean.StreamSettingsBean.TlsSettingsBean tlsSettings;
        XRayConfig.OutboundBean.StreamSettingsBean.TlsSettingsBean tlsSettings2;
        String strG;
        String string;
        Map hosts;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask;
        XRayConfig.OutboundBean.StreamSettingsBean.SockoptBean sockopt;
        XRayConfig.OutboundBean.StreamSettingsBean.SockoptBean sockopt2;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings2;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings3;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean tcpSettings;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean header;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean request;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean.HeadersBean headers;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean tcpSettings2;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean header2;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean request2;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean tcpSettings3;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean header3;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean tcpSettings4;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean header4;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean request3;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean.HeadersBean headers2;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean tcpSettings5;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean header5;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean request4;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean tcpSettings6;
        XRayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean header6;
        List listK;
        b69 b69Var = new b69();
        b69Var.a = false;
        b69Var.b = "";
        XRayConfig xRayConfigQ = q(context, false);
        if (xRayConfigQ == null) {
            return b69Var;
        }
        r(xRayConfigQ, str2, z2);
        p(xRayConfigQ, z2);
        try {
            boolean zC = k().c("pref_mux_enabled", false);
            String protocol = outboundBean.getProtocol();
            if (mm7.S(protocol, "SHADOWSOCKS") || mm7.S(protocol, "SOCKS") || mm7.S(protocol, "TROJAN") || mm7.S(protocol, "WIREGUARD")) {
                zC = false;
            } else {
                XRayConfig.OutboundBean.StreamSettingsBean streamSettings4 = outboundBean.getStreamSettings();
                if (dh3.f(streamSettings4 != null ? streamSettings4.getNetwork() : null, EConfigNetworkType.XHTTP.getType())) {
                    zC = false;
                }
            }
            if (zC) {
                XRayConfig.OutboundBean.MuxBean mux = outboundBean.getMux();
                if (mux != null) {
                    mux.b(true);
                }
                XRayConfig.OutboundBean.MuxBean mux2 = outboundBean.getMux();
                if (mux2 != null) {
                    int iE = k().e(-2, "pref_mux_concurency");
                    Integer numValueOf = Integer.valueOf(iE);
                    if (iE < -1) {
                        numValueOf = null;
                    }
                    mux2.a(numValueOf != null ? numValueOf.intValue() : 8);
                }
                XRayConfig.OutboundBean.MuxBean mux3 = outboundBean.getMux();
                if (mux3 != null) {
                    int iE2 = k().e(-2, "pref_mux_xudp_concurency");
                    Integer numValueOf2 = Integer.valueOf(iE2);
                    if (iE2 < -1) {
                        numValueOf2 = null;
                    }
                    mux3.c(numValueOf2 != null ? numValueOf2.intValue() : 8);
                }
                XRayConfig.OutboundBean.MuxBean mux4 = outboundBean.getMux();
                if (mux4 != null) {
                    String strI = k().i("pref_mux_xudp_quic");
                    if (strI == null) {
                        strI = cr.a;
                    }
                    mux4.d(strI);
                }
            } else {
                XRayConfig.OutboundBean.MuxBean mux5 = outboundBean.getMux();
                if (mux5 != null) {
                    mux5.b(false);
                }
                XRayConfig.OutboundBean.MuxBean mux6 = outboundBean.getMux();
                if (mux6 != null) {
                    mux6.a(-1);
                }
            }
            if (mm7.S(protocol, "WIREGUARD")) {
                XRayConfig.OutboundBean.OutSettingsBean settings = outboundBean.getSettings();
                if ((settings != null ? settings.getAddress() : null) == null) {
                    listK = i21.L(new String[]{"172.16.0.2/32", "2606:4700:110:8f81:d551:a0:532e:a2b3/128"});
                } else {
                    XRayConfig.OutboundBean.OutSettingsBean settings2 = outboundBean.getSettings();
                    Object address = settings2 != null ? settings2.getAddress() : null;
                    address.getClass();
                    listK = (List) address;
                }
                if (!n67.g()) {
                    listK = i21.K(wv0.r0(listK));
                }
                XRayConfig.OutboundBean.OutSettingsBean settings3 = outboundBean.getSettings();
                if (settings3 != null) {
                    settings3.m(listK);
                }
            }
            XRayConfig.OutboundBean.StreamSettingsBean streamSettings5 = outboundBean.getStreamSettings();
            String network = streamSettings5 != null ? streamSettings5.getNetwork() : null;
            XRayConfig.INSTANCE.getClass();
            if (dh3.f(network, XRayConfig.DEFAULT_NETWORK)) {
                XRayConfig.OutboundBean.StreamSettingsBean streamSettings6 = outboundBean.getStreamSettings();
                if (dh3.f((streamSettings6 == null || (tcpSettings6 = streamSettings6.getTcpSettings()) == null || (header6 = tcpSettings6.getHeader()) == null) ? null : header6.getType(), XRayConfig.HTTP)) {
                    XRayConfig.OutboundBean.StreamSettingsBean streamSettings7 = outboundBean.getStreamSettings();
                    List path = (streamSettings7 == null || (tcpSettings5 = streamSettings7.getTcpSettings()) == null || (header5 = tcpSettings5.getHeader()) == null || (request4 = header5.getRequest()) == null) ? null : request4.getPath();
                    XRayConfig.OutboundBean.StreamSettingsBean streamSettings8 = outboundBean.getStreamSettings();
                    List host = (streamSettings8 == null || (tcpSettings4 = streamSettings8.getTcpSettings()) == null || (header4 = tcpSettings4.getHeader()) == null || (request3 = header4.getRequest()) == null || (headers2 = request3.getHeaders()) == null) ? null : headers2.getHost();
                    vz7 vz7Var = new vz7(new ng8((byte) 25));
                    XRayConfig.OutboundBean.StreamSettingsBean streamSettings9 = outboundBean.getStreamSettings();
                    if (streamSettings9 != null && (tcpSettings3 = streamSettings9.getTcpSettings()) != null && (header3 = tcpSettings3.getHeader()) != null) {
                        a aVar = yw2.c;
                        String str3 = (String) vz7Var.getValue();
                        aVar.getClass();
                        header3.c((XRayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean) aVar.c(str3, new yi8(XRayConfig.OutboundBean.StreamSettingsBean.TcpSettingsBean.HeaderBean.RequestBean.class)));
                    }
                    XRayConfig.OutboundBean.StreamSettingsBean streamSettings10 = outboundBean.getStreamSettings();
                    if (streamSettings10 != null && (tcpSettings2 = streamSettings10.getTcpSettings()) != null && (header2 = tcpSettings2.getHeader()) != null && (request2 = header2.getRequest()) != null) {
                        if (path == null || path.isEmpty()) {
                            path = i21.K("/");
                        }
                        request2.c(path);
                    }
                    if (host != null && (streamSettings3 = outboundBean.getStreamSettings()) != null && (tcpSettings = streamSettings3.getTcpSettings()) != null && (header = tcpSettings.getHeader()) != null && (request = header.getRequest()) != null && (headers = request.getHeaders()) != null) {
                        headers.b(host);
                    }
                }
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
        xRayConfigQ.getOutbounds().set(0, outboundBean);
        if (z) {
            if (((XRayConfig.OutboundBean) xRayConfigQ.getOutbounds().get(0)).getStreamSettings() == null) {
                ((XRayConfig.OutboundBean) xRayConfigQ.getOutbounds().get(0)).p(new XRayConfig.OutboundBean.StreamSettingsBean(null, null, null, 16383));
            }
            XRayConfig.OutboundBean.StreamSettingsBean streamSettings11 = ((XRayConfig.OutboundBean) xRayConfigQ.getOutbounds().get(0)).getStreamSettings();
            if ((streamSettings11 != null ? streamSettings11.getSockopt() : null) == null && (streamSettings2 = ((XRayConfig.OutboundBean) xRayConfigQ.getOutbounds().get(0)).getStreamSettings()) != null) {
                streamSettings2.s(new XRayConfig.OutboundBean.StreamSettingsBean.SockoptBean(255));
            }
            XRayConfig.OutboundBean.StreamSettingsBean streamSettings12 = ((XRayConfig.OutboundBean) xRayConfigQ.getOutbounds().get(0)).getStreamSettings();
            if (streamSettings12 != null && (sockopt2 = streamSettings12.getSockopt()) != null) {
                sockopt2.a();
            }
            XRayConfig.OutboundBean.StreamSettingsBean streamSettings13 = ((XRayConfig.OutboundBean) xRayConfigQ.getOutbounds().get(0)).getStreamSettings();
            if (streamSettings13 != null && (sockopt = streamSettings13.getSockopt()) != null) {
                sockopt.b("ForceIP");
            }
            xRayConfigQ.getOutbounds().add(new XRayConfig.OutboundBean("antifilter", "socks", new XRayConfig.OutboundBean.OutSettingsBean(i21.K(new XRayConfig.OutboundBean.OutSettingsBean.ServersBean(n67.a(), 65518)), null, 33554415), null, 120));
            XRayConfig.OutboundBean.StreamSettingsBean streamSettings14 = ((XRayConfig.OutboundBean) xRayConfigQ.getOutbounds().get(0)).getStreamSettings();
            if (streamSettings14 != null && (finalMask = streamSettings14.getFinalMask()) != null) {
                finalMask.e(null);
            }
        } else {
            v(xRayConfigQ);
        }
        if (!k().c("pref_run_without_routing", false)) {
            u(xRayConfigQ);
        }
        try {
            HappApplication happApplication = HappApplication.M0;
            Iterable iterable = (Iterable) ((u42) k32.i().s0.getValue()).c.X.getValue();
            ArrayList arrayList = new ArrayList(xv0.Z(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((ExcludeSettingsCache) it.next()).getValue());
            }
            a(arrayList, d02.X, "direct", xRayConfigQ);
        } catch (Throwable th2) {
            if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                throw th2;
            }
        }
        f(xRayConfigQ);
        e(xRayConfigQ);
        if (z && (strG = outboundBean.g()) != null) {
            try {
                InetAddress[] allByName = InetAddress.getAllByName(strG);
                allByName.getClass();
                InetAddress inetAddress = allByName.length == 0 ? null : allByName[0];
                if (inetAddress != null && (string = inetAddress.toString()) != null && !mm7.Z(string, false, "/")) {
                    ArrayList arrayList2 = new ArrayList();
                    for (InetAddress inetAddress2 : allByName) {
                        if (inetAddress2 instanceof Inet4Address) {
                            arrayList2.add(inetAddress2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (InetAddress inetAddress3 : allByName) {
                        if (inetAddress3 instanceof Inet6Address) {
                            arrayList3.add(inetAddress3);
                        }
                    }
                    ArrayList arrayListH0 = n67.g() ? wv0.H0(arrayList3, arrayList2) : wv0.H0(arrayList2, arrayList3);
                    XRayConfig.DnsBean dns = xRayConfigQ.getDns();
                    LinkedHashMap linkedHashMap = (dns == null || (hosts = dns.getHosts()) == null) ? new LinkedHashMap() : new LinkedHashMap(hosts);
                    linkedHashMap.put(strG, mb6.d0(arrayListH0));
                    XRayConfig.DnsBean dns2 = xRayConfigQ.getDns();
                    if (dns2 != null) {
                        dns2.c(linkedHashMap);
                    }
                }
            } catch (Throwable th3) {
                if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                    throw th3;
                }
            }
        }
        if (!z2) {
            b(xRayConfigQ);
        }
        if (k().b("pref_local_dns_enabled")) {
            d(xRayConfigQ);
        }
        xRayConfigQ.t(str);
        k().p("pref_run_without_routing", false);
        ArrayList outbounds = xRayConfigQ.getOutbounds();
        ArrayList<XRayConfig.OutboundBean> arrayList4 = new ArrayList();
        for (Object obj : outbounds) {
            XRayConfig.OutboundBean outboundBean2 = (XRayConfig.OutboundBean) obj;
            l22 l22VarA = EConfigType.a();
            ArrayList arrayList5 = new ArrayList(xv0.Z(l22VarA, 10));
            Iterator it2 = l22VarA.iterator();
            while (it2.hasNext()) {
                String lowerCase = ((EConfigType) it2.next()).name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                arrayList5.add(lowerCase);
            }
            if (wv0.Y0(arrayList5).contains(outboundBean2.getProtocol())) {
                arrayList4.add(obj);
            }
        }
        for (XRayConfig.OutboundBean outboundBean3 : arrayList4) {
            XRayConfig.OutboundBean.StreamSettingsBean streamSettings15 = outboundBean3.getStreamSettings();
            if (dh3.f(streamSettings15 != null ? streamSettings15.getNetwork() : null, EConfigNetworkType.WS.getType())) {
                XRayConfig.OutboundBean.StreamSettingsBean streamSettings16 = outboundBean3.getStreamSettings();
                if (dh3.f((streamSettings16 == null || (tlsSettings2 = streamSettings16.getTlsSettings()) == null) ? null : tlsSettings2.getAlpn(), i21.L(new String[]{"h2", "http/1.1"})) && (streamSettings = outboundBean3.getStreamSettings()) != null) {
                    XRayConfig.OutboundBean.StreamSettingsBean streamSettings17 = outboundBean3.getStreamSettings();
                    streamSettings.t((streamSettings17 == null || (tlsSettings = streamSettings17.getTlsSettings()) == null) ? null : XRayConfig.OutboundBean.StreamSettingsBean.TlsSettingsBean.a(tlsSettings, i21.K("http/1.1")));
                }
            }
        }
        RouteProfile routeProfileK = mn6.k(j());
        if (((routeProfileK == null || (routeSettingsCacheB = routeProfileK.b()) == null || (routeSettings = routeSettingsCacheB.getRouteSettings()) == null) ? true : routeSettings.getGlobalProxy()) || z2) {
            if (!dh3.f(((XRayConfig.OutboundBean) xRayConfigQ.getOutbounds().get(0)).getTag(), "proxy")) {
                Iterator it3 = xRayConfigQ.getOutbounds().iterator();
                int i = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (dh3.f(((XRayConfig.OutboundBean) it3.next()).getTag(), "proxy")) {
                        break;
                    }
                    i++;
                }
                Integer numValueOf3 = Integer.valueOf(i);
                if (i <= -1) {
                    numValueOf3 = null;
                }
                if (numValueOf3 != null) {
                    int iIntValue = numValueOf3.intValue();
                    Object obj2 = xRayConfigQ.getOutbounds().get(0);
                    obj2.getClass();
                    XRayConfig.OutboundBean outboundBeanA = XRayConfig.OutboundBean.a((XRayConfig.OutboundBean) obj2);
                    ArrayList outbounds2 = xRayConfigQ.getOutbounds();
                    Object obj3 = xRayConfigQ.getOutbounds().get(iIntValue);
                    obj3.getClass();
                    outbounds2.set(0, XRayConfig.OutboundBean.a((XRayConfig.OutboundBean) obj3));
                    xRayConfigQ.getOutbounds().set(iIntValue, outboundBeanA);
                }
            }
        } else if (!dh3.f(((XRayConfig.OutboundBean) xRayConfigQ.getOutbounds().get(0)).getTag(), "direct")) {
            Iterator it4 = xRayConfigQ.getOutbounds().iterator();
            int i2 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (dh3.f(((XRayConfig.OutboundBean) it4.next()).getTag(), "direct")) {
                    break;
                }
                i2++;
            }
            Integer numValueOf4 = Integer.valueOf(i2);
            if (i2 <= -1) {
                numValueOf4 = null;
            }
            if (numValueOf4 != null) {
                int iIntValue2 = numValueOf4.intValue();
                Object obj4 = xRayConfigQ.getOutbounds().get(0);
                obj4.getClass();
                XRayConfig.OutboundBean outboundBeanA2 = XRayConfig.OutboundBean.a((XRayConfig.OutboundBean) obj4);
                ArrayList outbounds3 = xRayConfigQ.getOutbounds();
                Object obj5 = xRayConfigQ.getOutbounds().get(iIntValue2);
                obj5.getClass();
                outbounds3.set(0, XRayConfig.OutboundBean.a((XRayConfig.OutboundBean) obj5));
                xRayConfigQ.getOutbounds().set(iIntValue2, outboundBeanA2);
            }
        }
        if (n67.f() && n67.c().c("pref_block_bindtodevice_enabled", false)) {
            Iterator it5 = xRayConfigQ.getOutbounds().iterator();
            do {
                if (!it5.hasNext()) {
                    next = null;
                    break;
                }
                next = it5.next();
            } while (!dh3.f(((XRayConfig.OutboundBean) next).getTag(), "block"));
            if (((XRayConfig.OutboundBean) next) == null) {
                xRayConfigQ.getOutbounds().add(new XRayConfig.OutboundBean("block", "blackhole", null, null, 124));
            }
            xRayConfigQ.getRouting().getRules().add(0, new XRayConfig.RoutingBean.RulesBean(null, "block", null, i21.f(new String[]{"-1"}), null, 16251));
        }
        if (z2) {
            xRayConfigQ.getLog().c("none");
            xRayConfigQ.getInbounds().clear();
            xRayConfigQ.getRouting().getRules().clear();
            xRayConfigQ.o(null);
            xRayConfigQ.p(null);
            xRayConfigQ.u();
            xRayConfigQ.s();
            Iterator it6 = xRayConfigQ.getOutbounds().iterator();
            while (it6.hasNext()) {
                ((XRayConfig.OutboundBean) it6.next()).m();
            }
        }
        b69Var.a = true;
        b69Var.b = yw2.d.h(xRayConfigQ);
        return b69Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r14v10, resolved type: su.happ.proxyutility.dto.XRayConfig$InboundBean$InSettingsBean */
    /* JADX DEBUG: Multi-variable search result rejected for r14v11, resolved type: su.happ.proxyutility.dto.XRayConfig$InboundBean$InSettingsBean */
    /* JADX DEBUG: Multi-variable search result rejected for r14v12, resolved type: su.happ.proxyutility.dto.XRayConfig$InboundBean$InSettingsBean */
    /* JADX DEBUG: Multi-variable search result rejected for r14v2, resolved type: su.happ.proxyutility.dto.XRayConfig$InboundBean$InSettingsBean */
    /* JADX DEBUG: Multi-variable search result rejected for r14v9, resolved type: su.happ.proxyutility.dto.XRayConfig$InboundBean$InSettingsBean */
    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static void o(XRayConfig xRayConfig, boolean z) {
        InboundAuthMode inboundAuthMode;
        Object next;
        InboundAuthMode inboundAuthMode2;
        Object next2;
        Object settings;
        char c2;
        XRayConfig.InboundBean.InSettingsBean inSettingsBean;
        Object obj;
        XRayConfig.InboundBean.InSettingsBean inSettingsBean2;
        int iD = n67.d();
        int iE = k().e(-1, "pref_socks_auth_mode");
        Integer numValueOf = Integer.valueOf(iE);
        String str = null;
        if (iE == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            inboundAuthMode = (InboundAuthMode) InboundAuthMode.b().get(numValueOf.intValue());
            if (inboundAuthMode == null) {
                InboundAuthMode.INSTANCE.getClass();
                inboundAuthMode = InboundAuthMode.f5default;
            }
        } else {
            InboundAuthMode.INSTANCE.getClass();
            inboundAuthMode = InboundAuthMode.f5default;
        }
        Iterator it = xRayConfig.getInbounds().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            XRayConfig.InboundBean inboundBean = (XRayConfig.InboundBean) next;
            if (dh3.f(inboundBean.getProtocol(), "socks") && inboundBean.getPort() == iD) {
                break;
            }
        }
        XRayConfig.InboundBean inboundBean2 = (XRayConfig.InboundBean) next;
        int iB = n67.b();
        int iE2 = k().e(-1, "pref_http_auth_mode");
        Integer numValueOf2 = Integer.valueOf(iE2);
        if (iE2 == -1) {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            inboundAuthMode2 = (InboundAuthMode) InboundAuthMode.b().get(numValueOf2.intValue());
            if (inboundAuthMode2 == null) {
                InboundAuthMode.INSTANCE.getClass();
                inboundAuthMode2 = InboundAuthMode.f5default;
            }
        } else {
            InboundAuthMode.INSTANCE.getClass();
            inboundAuthMode2 = InboundAuthMode.f5default;
        }
        Iterator it2 = xRayConfig.getInbounds().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            XRayConfig.InboundBean inboundBean3 = (XRayConfig.InboundBean) next2;
            if (dh3.f(inboundBean3.getProtocol(), "http") && inboundBean3.getPort() == iB) {
                break;
            }
        }
        XRayConfig.InboundBean inboundBean4 = (XRayConfig.InboundBean) next2;
        byte b2 = 1;
        if (!k().b("pref_http_auth_enabled")) {
            xRayConfig.getInbounds().removeIf(new if4(new a69((byte) 5), b2));
        }
        HappApplication happApplication = HappApplication.M0;
        c16 c16VarE = k32.i().e();
        ka2 ka2Var = new ka2(new la2(wv0.l0(xRayConfig.getInbounds()), true, new n73(iD, iB, (byte) 2)));
        while (ka2Var.hasNext()) {
            XRayConfig.InboundBean inboundBean5 = (XRayConfig.InboundBean) ka2Var.next();
            boolean zF = dh3.f(inboundBean5.getProtocol(), "socks");
            XRayConfig.InboundBean inboundBean6 = zF ? inboundBean2 : inboundBean4;
            InboundAuthMode inboundAuthMode3 = zF ? inboundAuthMode : inboundAuthMode2;
            AuthData authDataF = zF ? c16VarE.f() : c16VarE.d();
            XRayConfig.InboundBean.InSettingsBean settings2 = inboundBean5.getSettings();
            XRayConfig.InboundBean.InSettingsBean inSettingsBean3 = settings2;
            if (settings2 == null) {
                inSettingsBean2 = new XRayConfig.InboundBean.InSettingsBean(str, 511);
            }
            if (inboundBean6 != null) {
                inSettingsBean3 = inSettingsBean2;
                settings = inboundBean6.getSettings();
            } else {
                inSettingsBean3 = inSettingsBean2;
                settings = str;
            }
            if (n67.c().c("pref_proxy_sharing_enabled", false)) {
                inSettingsBean3.b("noauth");
                inboundBean5.h(inSettingsBean3);
                c2 = 2;
            } else {
                int i = c69.c[inboundAuthMode3.ordinal()];
                if (i == 1 && z && settings != null) {
                    obj = settings;
                } else {
                    if (i == 1 && z) {
                        inSettingsBean3.b("noauth");
                        obj = inSettingsBean3;
                    } else {
                        c2 = 2;
                        if (i == 2) {
                            inSettingsBean3.b("noauth");
                            inSettingsBean = inSettingsBean3;
                        } else if (i != 3 && i != 1 && i != 4) {
                            b61.c();
                            return;
                        } else {
                            inSettingsBean3.b("password");
                            inSettingsBean3.a(i21.K(new XRayConfig.InboundBean.Account(authDataF.getUser(), authDataF.getPassword())));
                            inSettingsBean = inSettingsBean3;
                        }
                    }
                    inboundBean5.h(inSettingsBean);
                }
                c2 = 2;
                inSettingsBean = obj;
                inboundBean5.h(inSettingsBean);
            }
            str = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean p(XRayConfig xRayConfig, boolean z) {
        dn8 rj6Var;
        Object obj;
        Object next;
        Object next2;
        XRayConfig.InboundBean.InSettingsBean settings;
        XRayConfig.InboundBean.SniffingBean sniffing;
        ArrayList destOverride;
        XRayConfig.InboundBean.SniffingBean sniffing2;
        ArrayList destOverride2;
        RouteSettingsCache routeSettingsCacheB;
        RouteSettings routeSettings;
        try {
            boolean zC = k().c("pref_sniffing_enabled", true);
            for (XRayConfig.InboundBean inboundBean : xRayConfig.getInbounds()) {
                if (!k().b("pref_proxy_sharing_enabled") && !dh3.f(inboundBean.getProtocol(), "tun")) {
                    inboundBean.f();
                }
                if (inboundBean.getSniffing() == null && zC) {
                    XRayConfig.INSTANCE.getClass();
                    inboundBean.i(new XRayConfig.InboundBean.SniffingBean(i21.f(new String[]{XRayConfig.HTTP, XRayConfig.TLS, XRayConfig.QUIC})));
                }
            }
            Iterator it = xRayConfig.getInbounds().iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!dh3.f(((XRayConfig.InboundBean) next).getProtocol(), "socks"));
            XRayConfig.InboundBean inboundBean2 = (XRayConfig.InboundBean) next;
            if (inboundBean2 != null) {
                inboundBean2.g(n67.d());
            }
            Iterator it2 = xRayConfig.getInbounds().iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!dh3.f(((XRayConfig.InboundBean) next2).getProtocol(), "http"));
            XRayConfig.InboundBean inboundBean3 = (XRayConfig.InboundBean) next2;
            if (inboundBean3 != null) {
                inboundBean3.g(n67.b());
            }
            RouteProfile routeProfileK = mn6.k(j());
            boolean fakeDnsEnabled = (routeProfileK == null || (routeSettingsCacheB = routeProfileK.b()) == null || (routeSettings = routeSettingsCacheB.getRouteSettings()) == null) ? false : routeSettings.getFakeDnsEnabled();
            XRayConfig.InboundBean.SniffingBean sniffing3 = ((XRayConfig.InboundBean) xRayConfig.getInbounds().get(0)).getSniffing();
            if (sniffing3 != null) {
                sniffing3.b(fakeDnsEnabled || zC);
            }
            if (!zC && (sniffing2 = ((XRayConfig.InboundBean) xRayConfig.getInbounds().get(0)).getSniffing()) != null && (destOverride2 = sniffing2.getDestOverride()) != null) {
                destOverride2.clear();
            }
            if (fakeDnsEnabled && (sniffing = ((XRayConfig.InboundBean) xRayConfig.getInbounds().get(0)).getSniffing()) != null && (destOverride = sniffing.getDestOverride()) != null) {
                destOverride.add("fakedns");
            }
            if (n67.f()) {
                for (Object obj2 : xRayConfig.getInbounds()) {
                    if (dh3.f(((XRayConfig.InboundBean) obj2).getTag(), "tun")) {
                        obj = obj2;
                        break;
                    }
                }
                XRayConfig.InboundBean inboundBean4 = (XRayConfig.InboundBean) obj;
                if (inboundBean4 != null && (settings = inboundBean4.getSettings()) != null) {
                    vz7 vz7Var = n67.a;
                    ss8 ss8Var = ss8.a;
                    settings.c(Integer.valueOf(ss8.C(1500, n67.c().i("pref_tun_mtu"))));
                }
            }
            if (!z) {
                o(xRayConfig, false);
            }
            rj6Var = dn8.a;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        return !(rj6Var instanceof rj6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static XRayConfig q(Context context, boolean z) {
        XRayConfig rj6Var;
        String strD;
        try {
            if (!n67.f() || z) {
                ss8 ss8Var = ss8.a;
                strD = ss8.D(context, "xray_config.json");
            } else {
                ss8 ss8Var2 = ss8.a;
                strD = ss8.D(context, "xray_config_with_tun.json");
            }
            if (TextUtils.isEmpty(strD)) {
                return null;
            }
            a aVar = yw2.c;
            aVar.getClass();
            rj6Var = (XRayConfig) aVar.c(strD, new yi8(XRayConfig.class));
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        return rj6Var instanceof rj6 ? null : rj6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean r(XRayConfig xRayConfig, String str, boolean z) {
        dn8 rj6Var;
        str.getClass();
        try {
            f08 f08Var = e69.Z;
            int iE = k().e(-1, "pref_logs_type");
            f08Var.getClass();
            e69 e69VarI = f08.i(iE);
            if (k().b("pref_logs_hidden")) {
                e69VarI = e69.g0;
            }
            if (!z) {
                XRayConfig.LogBean log = xRayConfig.getLog();
                String strE = i().e(str);
                String str2 = "";
                if (strE == null) {
                    strE = "";
                }
                log.b(strE);
                XRayConfig.LogBean log2 = xRayConfig.getLog();
                String strD = i().d();
                if (strD != null) {
                    str2 = strD;
                }
                log2.a(str2);
                xRayConfig.getLog().c(e69VarI.X);
            }
            rj6Var = dn8.a;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        return !(rj6Var instanceof rj6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean s(String str) {
        Boolean rj6Var;
        XRayConfig.OutboundBean outboundBeanG;
        String strG;
        str.getClass();
        try {
            if (n67.c().c("pref_resolve_server_before_start_enabled", false)) {
                kw4 kw4Var = kw4.a;
                ServerConfig serverConfigB = kw4.b(str);
                if (serverConfigB != null) {
                    if (c69.a[serverConfigB.getConfigType().ordinal()] != 1 && (outboundBeanG = serverConfigB.g()) != null && (strG = outboundBeanG.g()) != null) {
                        ss8 ss8Var = ss8.a;
                        if (!ss8.u(strG)) {
                            return true;
                        }
                    }
                    rj6Var = Boolean.FALSE;
                    if (rj6Var instanceof rj6) {
                        rj6Var = null;
                    }
                    Boolean bool = rj6Var;
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void t(XRayConfig xRayConfig) {
        ArrayList arrayListC;
        Map hosts;
        ArrayList<XRayConfig.OutboundBean> arrayListD = xRayConfig.d();
        XRayConfig.DnsBean dns = xRayConfig.getDns();
        LinkedHashMap linkedHashMap = (dns == null || (hosts = dns.getHosts()) == null) ? new LinkedHashMap() : new LinkedHashMap(hosts);
        boolean zG = n67.g();
        for (XRayConfig.OutboundBean outboundBean : arrayListD) {
            String strG = outboundBean.g();
            if (strG != null && strG.length() != 0 && !linkedHashMap.containsKey(strG) && (arrayListC = fr1.c(strG, zG)) != null && !arrayListC.isEmpty()) {
                outboundBean.b().b(zG ? "UseIPv6v4" : "UseIPv4v6");
                int size = arrayListC.size();
                Object obj = arrayListC;
                if (size == 1) {
                    obj = arrayListC.get(0);
                }
                linkedHashMap.put(strG, obj);
            }
        }
        if (dns != null) {
            dns.c(linkedHashMap);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void u(XRayConfig xRayConfig) {
        String domainStrategy;
        RouteSettingsCache routeSettingsCacheB;
        RouteSettings routeSettings;
        RouteSettingsCache routeSettingsCacheB2;
        RouteSettings routeSettings2;
        try {
            RouteProfile routeProfileK = mn6.k(j());
            if (routeProfileK != null && (routeSettingsCacheB2 = routeProfileK.b()) != null && (routeSettings2 = routeSettingsCacheB2.getRouteSettings()) != null) {
                Iterator it = RoutingOrderKt.a(routeSettings2.getRouteOrder()).iterator();
                while (it.hasNext()) {
                    int i = c69.d[((ERoutingSettingsType) it.next()).ordinal()];
                    if (i == 1) {
                        a(routeSettings2.getProxyIp(), routeSettings2.getProxySites(), "proxy", xRayConfig);
                    } else if (i == 2) {
                        a(routeSettings2.getDirectIp(), routeSettings2.getDirectSites(), "direct", xRayConfig);
                    } else {
                        if (i != 3) {
                            throw new b55();
                        }
                        a(routeSettings2.getBlockIp(), routeSettings2.getBlockSites(), "block", xRayConfig);
                    }
                }
            }
            XRayConfig.RoutingBean routing = xRayConfig.getRouting();
            if (routeProfileK == null || (routeSettingsCacheB = routeProfileK.b()) == null || (routeSettings = routeSettingsCacheB.getRouteSettings()) == null || (domainStrategy = routeSettings.getDomainStrategy()) == null) {
                domainStrategy = RouteSettings.DEFAULT_ROUTING_DOMAIN_STRATEGY;
            }
            routing.d(domainStrategy);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:101:0x0170  */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Serializable] */
    public static void v(XRayConfig xRayConfig) {
        String strI;
        String strI2;
        Object obj;
        String strI3;
        Integer[] numArr;
        try {
            Object obj2 = xRayConfig.getOutbounds().get(0);
            obj2.getClass();
            XRayConfig.OutboundBean outboundBean = (XRayConfig.OutboundBean) obj2;
            FragmentationType.Companion companion = FragmentationType.INSTANCE;
            String strJ = k().j("pref_fragment_type", "XRAY");
            companion.getClass();
            FragmentationType fragmentationTypeA = FragmentationType.Companion.a(strJ);
            boolean z = true;
            boolean z2 = k().c("pref_fragment_enabled", false) && fragmentationTypeA == FragmentationType.XRAY;
            XRayConfig.OutboundBean.StreamSettingsBean streamSettings = outboundBean.getStreamSettings();
            List listK = null;
            if ((streamSettings != null ? streamSettings.getFinalMask() : null) == null && z2) {
                XRayConfig.OutboundBean.StreamSettingsBean streamSettings2 = outboundBean.getStreamSettings();
                if (streamSettings2 != null) {
                    streamSettings2.o(new XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean(null, null, 7));
                }
                String strI4 = k().i("pref_fragment_packets");
                if (strI4 == null) {
                    strI4 = "tlshello";
                } else {
                    if (strI4.length() <= 0) {
                        strI4 = null;
                    }
                    if (strI4 == null) {
                        strI4 = "tlshello";
                    }
                }
                String strI5 = k().i("pref_fragment_length");
                if (strI5 == null) {
                    strI5 = "50-100";
                } else {
                    if (strI5.length() <= 0) {
                        strI5 = null;
                    }
                    if (strI5 == null) {
                        strI5 = "50-100";
                    }
                }
                String strI6 = k().i("pref_fragment_interval");
                if (strI6 == null) {
                    strI6 = "10-20";
                } else {
                    if (strI6.length() <= 0) {
                        strI6 = null;
                    }
                    if (strI6 == null) {
                        strI6 = "10-20";
                    }
                }
                String strI7 = k().i("pref_fragment_max_split");
                if (strI7 == null) {
                    strI7 = "100-200";
                } else {
                    if (strI7.length() <= 0) {
                        strI7 = null;
                    }
                    if (strI7 == null) {
                        strI7 = "100-200";
                    }
                }
                if (!k().c("pref_noises_enabled", false) || fragmentationTypeA != FragmentationType.XRAY) {
                    z = false;
                }
                String strI8 = z ? k().i("pref_noises_delay") : null;
                if (strI8 == null || strI8.length() <= 0) {
                    strI8 = null;
                }
                if (z) {
                    strI = k().i("pref_noises_type");
                    if (strI == null) {
                        strI = "array";
                    }
                } else {
                    strI = null;
                }
                if (strI == null || strI.length() <= 0) {
                    strI = null;
                }
                if (z && dh3.f(strI, "array")) {
                    String strI9 = k().i("pref_noises_packet");
                    if (strI9 != null) {
                        List listF0 = fm7.F0(strI9, new String[]{","}, 6);
                        ArrayList arrayList = new ArrayList(xv0.Z(listF0, 10));
                        Iterator it = listF0.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
                        }
                        if (arrayList.isEmpty()) {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            numArr = (Integer[]) arrayList.toArray(new Integer[0]);
                        } else {
                            obj = null;
                        }
                    } else {
                        obj = null;
                    }
                } else if (!z || (strI2 = k().i("pref_noises_packet")) == null || strI2.length() <= 0) {
                    obj = null;
                }
                if (obj != null) {
                    obj = strI2;
                } else {
                    obj = strI2;
                    strI = null;
                }
                if (obj == null && z) {
                    strI3 = k().i("pref_noises_rand");
                    if (strI3 == null) {
                        strI3 = "1-8192";
                    }
                } else {
                    obj = numArr;
                    obj = numArr;
                    strI3 = null;
                }
                String strI10 = z ? k().i("pref_noises_rand_range") : null;
                XRayConfig.OutboundBean.StreamSettingsBean streamSettings3 = outboundBean.getStreamSettings();
                if (streamSettings3 == null) {
                    streamSettings3 = new XRayConfig.OutboundBean.StreamSettingsBean(null, null, null, 16383);
                }
                outboundBean.p(streamSettings3);
                XRayConfig.OutboundBean.StreamSettingsBean streamSettings4 = outboundBean.getStreamSettings();
                if (streamSettings4 != null) {
                    List listK2 = i21.K(new XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean(XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean.c(strI7, strI6, strI5, strI4)));
                    if (z) {
                        listK = i21.K(new XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean("noise", XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean.UdpMaskSettingBean.a(null, null, i21.K(new XRayConfig.OutboundBean.OutSettingsBean.NoisesBean(strI, strI3, strI10, strI8, obj)), null, null, 495)));
                    }
                    streamSettings4.o(new XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean(listK2, listK, 4));
                }
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
    }
}
