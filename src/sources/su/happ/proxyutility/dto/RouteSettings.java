package su.happ.proxyutility.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import su.happ.proxyutility.dto.enums.EDnsType;
import su.happ.proxyutility.dto.enums.RoutingOrder;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u001b\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 c2\u00020\u0001:\u0001cR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010\u001d\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR\"\u0010 \u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000fR\"\u0010#\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010\u000fR\"\u0010&\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u000b\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010\u000fR\"\u0010)\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u000b\u001a\u0004\b*\u0010\r\"\u0004\b+\u0010\u000fR.\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010,8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R(\u00104\u001a\b\u0012\u0004\u0012\u00020\t038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R(\u0010:\u001a\b\u0012\u0004\u0012\u00020\t038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u00109R(\u0010=\u001a\b\u0012\u0004\u0012\u00020\t038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u00105\u001a\u0004\b>\u00107\"\u0004\b?\u00109R(\u0010@\u001a\b\u0012\u0004\u0012\u00020\t038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u00105\u001a\u0004\bA\u00107\"\u0004\bB\u00109R(\u0010C\u001a\b\u0012\u0004\u0012\u00020\t038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u00105\u001a\u0004\bD\u00107\"\u0004\bE\u00109R(\u0010F\u001a\b\u0012\u0004\u0012\u00020\t038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bF\u00105\u001a\u0004\bG\u00107\"\u0004\bH\u00109R\"\u0010I\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010\u0004\u001a\u0004\bJ\u0010\u0006\"\u0004\bK\u0010\bR\"\u0010L\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bL\u0010\u000b\u001a\u0004\bM\u0010\r\"\u0004\bN\u0010\u000fR$\u0010P\u001a\u0004\u0018\u00010O8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010V\u001a\u0004\u0018\u00010O8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010Q\u001a\u0004\bW\u0010S\"\u0004\bX\u0010UR$\u0010Y\u001a\u0004\u0018\u00010O8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bY\u0010Q\u001a\u0004\bZ\u0010S\"\u0004\b[\u0010UR\"\u0010]\u001a\u00020\\8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010b¨\u0006d"}, d2 = {"Lsu/happ/proxyutility/dto/RouteSettings;", "", "", "globalProxy", "Z", "t", "()Z", "O", "(Z)V", "", "remoteDnsIp", "Ljava/lang/String;", "z", "()Ljava/lang/String;", "U", "(Ljava/lang/String;)V", "domesticDnsIp", "o", "J", "Lsu/happ/proxyutility/dto/enums/EDnsType;", "remoteDnsType", "Lsu/happ/proxyutility/dto/enums/EDnsType;", "A", "()Lsu/happ/proxyutility/dto/enums/EDnsType;", "V", "(Lsu/happ/proxyutility/dto/enums/EDnsType;)V", "domesticDnsType", "p", "K", "remoteDnsDomain", "y", "T", "domesticDnsDomain", "n", "I", "geoIpUrl", "r", "M", "geoSiteUrl", "s", "N", "domainStrategy", "m", "H", "", "dnsHosts", "Ljava/util/Map;", "l", "()Ljava/util/Map;", "G", "(Ljava/util/Map;)V", "", "proxySites", "Ljava/util/List;", "x", "()Ljava/util/List;", "S", "(Ljava/util/List;)V", "proxyIp", "w", "R", "directSites", "k", "F", "directIp", "j", "E", "blockSites", "g", "D", "blockIp", "f", "C", "fakeDnsEnabled", "q", "L", "localPathGeo", "v", "Q", "", "dateLastUpdateSite", "Ljava/lang/Long;", "i", "()Ljava/lang/Long;", "setDateLastUpdateSite", "(Ljava/lang/Long;)V", "dateLastUpdateIp", "h", "setDateLastUpdateIp", "lastUpdated", "u", "P", "Lsu/happ/proxyutility/dto/enums/RoutingOrder;", "routeOrder", "Lsu/happ/proxyutility/dto/enums/RoutingOrder;", "B", "()Lsu/happ/proxyutility/dto/enums/RoutingOrder;", "W", "(Lsu/happ/proxyutility/dto/enums/RoutingOrder;)V", "Companion", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final /* data */ class RouteSettings {
    public static final int $stable = 8;
    public static final String DEFAULT_DNS_DOMAIN_DOMESTIC = "https://dns.google/dns-query";
    public static final String DEFAULT_DNS_DOMAIN_REMOTE = "https://cloudflare-dns.com/dns-query";
    public static final boolean DEFAULT_FAKE_DNS_ENABLED = false;
    public static final String DEFAULT_GEO_IP_URL = "https://github.com/Loyalsoldier/v2ray-rules-dat/releases/latest/download/geoip.dat";
    public static final String DEFAULT_GEO_SITE_URL = "https://github.com/Loyalsoldier/v2ray-rules-dat/releases/latest/download/geosite.dat";
    public static final boolean DEFAULT_GLOBAL_PROXY = true;
    public static final String DEFAULT_ROUTING_DOMAIN_STRATEGY = "IPIfNonMatch";

    @p37("BlockIp")
    private List<String> blockIp;

    @p37("BlockSites")
    private List<String> blockSites;

    @p37("DateLastUpdateIp")
    private Long dateLastUpdateIp;

    @p37("DateLastUpdateSite")
    private Long dateLastUpdateSite;

    @p37("DirectIp")
    private List<String> directIp;

    @p37("DirectSites")
    private List<String> directSites;

    @p37("DnsHosts")
    private Map<String, Object> dnsHosts;

    @p37("DomainStrategy")
    private String domainStrategy;

    @p37("DomesticDnsDomain")
    private String domesticDnsDomain;

    @p37("DomesticDnsIp")
    private String domesticDnsIp;

    @p37("DomesticDnsType")
    private EDnsType domesticDnsType;

    @p37("FakeDns")
    private boolean fakeDnsEnabled;

    @p37("Geoipurl")
    private String geoIpUrl;

    @p37("Geositeurl")
    private String geoSiteUrl;

    @p37("GlobalProxy")
    private boolean globalProxy;

    @p37("LastUpdated")
    private Long lastUpdated;

    @p37("LocalPathGeo")
    private String localPathGeo;

    @p37("ProxyIp")
    private List<String> proxyIp;

    @p37("ProxySites")
    private List<String> proxySites;

    @p37("RemoteDnsDomain")
    private String remoteDnsDomain;

    @p37("RemoteDnsIp")
    private String remoteDnsIp;

    @p37("RemoteDnsType")
    private EDnsType remoteDnsType;

    @p37("RouteOrder")
    private RoutingOrder routeOrder;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final String DEFAULT_REMOTE_DNS_IP = "1.1.1.1";
    public static final String DEFAULT_DOMESTIC_DNS_IP = "8.8.8.8";
    private static final Map<String, Object> DEFAULT_DNS_HOSTS = zp4.K(new qg5[]{new qg5("cloudflare-dns.com", DEFAULT_REMOTE_DNS_IP), new qg5("dns.google", DEFAULT_DOMESTIC_DNS_IP)});
    private static final EDnsType DEFAULT_DNS_TYPE = EDnsType.DOH;
    private static final RoutingOrder DEFAULT_ROUTE_ORDER = RoutingOrder.BLOCK_DIRECT_PROXY;
    private static final List<String> DEFAULT_DIRECT_IP = i21.L(new String[]{"10.0.0.0/8", "172.16.0.0/12", "192.168.0.0/16", "169.254.0.0/16", "224.0.0.0/4", "255.255.255.255"});
    private static final List<String> LAN_ADDRESSES = i21.L(new String[]{"10.0.0.0/8", "172.16.0.0/12", "192.168.0.0/16", "169.254.0.0/16", "224.0.0.0/4", "255.255.255.255"});

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lsu/happ/proxyutility/dto/RouteSettings$Companion;", "", "", "DEFAULT_ROUTING_DOMAIN_STRATEGY", "Ljava/lang/String;", "DEFAULT_GEO_IP_URL", "DEFAULT_GEO_SITE_URL", "DEFAULT_REMOTE_DNS_IP", "DEFAULT_DOMESTIC_DNS_IP", "DEFAULT_DNS_DOMAIN_REMOTE", "DEFAULT_DNS_DOMAIN_DOMESTIC", "", "DEFAULT_GLOBAL_PROXY", "Z", "DEFAULT_FAKE_DNS_ENABLED", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RouteSettings(boolean z, String str, String str2, EDnsType eDnsType, EDnsType eDnsType2, String str3, String str4, String str5, String str6, String str7, Map map, List list, List list2, List list3, List list4, List list5, List list6, boolean z2, String str8, Long l, Long l2, Long l3, RoutingOrder routingOrder) {
        eDnsType.getClass();
        eDnsType2.getClass();
        map.getClass();
        str8.getClass();
        routingOrder.getClass();
        this.globalProxy = z;
        this.remoteDnsIp = str;
        this.domesticDnsIp = str2;
        this.remoteDnsType = eDnsType;
        this.domesticDnsType = eDnsType2;
        this.remoteDnsDomain = str3;
        this.domesticDnsDomain = str4;
        this.geoIpUrl = str5;
        this.geoSiteUrl = str6;
        this.domainStrategy = str7;
        this.dnsHosts = map;
        this.proxySites = list;
        this.proxyIp = list2;
        this.directSites = list3;
        this.directIp = list4;
        this.blockSites = list5;
        this.blockIp = list6;
        this.fakeDnsEnabled = z2;
        this.localPathGeo = str8;
        this.dateLastUpdateSite = l;
        this.dateLastUpdateIp = l2;
        this.lastUpdated = l3;
        this.routeOrder = routingOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static RouteSettings e(RouteSettings routeSettings, boolean z, String str, String str2, EDnsType eDnsType, EDnsType eDnsType2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, List list4, List list5, List list6, boolean z2, String str8, Long l, Long l2, RoutingOrder routingOrder, int i) {
        boolean z3 = (i & 1) != 0 ? routeSettings.globalProxy : z;
        String str9 = (i & 2) != 0 ? routeSettings.remoteDnsIp : str;
        String str10 = (i & 4) != 0 ? routeSettings.domesticDnsIp : str2;
        EDnsType eDnsType3 = (i & 8) != 0 ? routeSettings.remoteDnsType : eDnsType;
        EDnsType eDnsType4 = (i & 16) != 0 ? routeSettings.domesticDnsType : eDnsType2;
        String str11 = (i & 32) != 0 ? routeSettings.remoteDnsDomain : str3;
        String str12 = (i & 64) != 0 ? routeSettings.domesticDnsDomain : str4;
        String str13 = (i & 128) != 0 ? routeSettings.geoIpUrl : str5;
        String str14 = (i & 256) != 0 ? routeSettings.geoSiteUrl : str6;
        String str15 = (i & 512) != 0 ? routeSettings.domainStrategy : str7;
        Map<String, Object> map = routeSettings.dnsHosts;
        List list7 = (i & 2048) != 0 ? routeSettings.proxySites : list;
        List list8 = (i & 4096) != 0 ? routeSettings.proxyIp : list2;
        List list9 = (i & 8192) != 0 ? routeSettings.directSites : list3;
        List list10 = (i & 16384) != 0 ? routeSettings.directIp : list4;
        List list11 = (32768 & i) != 0 ? routeSettings.blockSites : list5;
        List list12 = (65536 & i) != 0 ? routeSettings.blockIp : list6;
        boolean z4 = (131072 & i) != 0 ? routeSettings.fakeDnsEnabled : z2;
        String str16 = (262144 & i) != 0 ? routeSettings.localPathGeo : str8;
        Long l3 = (524288 & i) != 0 ? routeSettings.dateLastUpdateSite : l;
        Long l4 = (1048576 & i) != 0 ? routeSettings.dateLastUpdateIp : l2;
        Long l5 = routeSettings.lastUpdated;
        RoutingOrder routingOrder2 = (i & 4194304) != 0 ? routeSettings.routeOrder : routingOrder;
        routeSettings.getClass();
        str9.getClass();
        str10.getClass();
        eDnsType3.getClass();
        eDnsType4.getClass();
        str11.getClass();
        str12.getClass();
        str13.getClass();
        str14.getClass();
        str15.getClass();
        map.getClass();
        list7.getClass();
        list8.getClass();
        list9.getClass();
        list10.getClass();
        list11.getClass();
        list12.getClass();
        str16.getClass();
        routingOrder2.getClass();
        return new RouteSettings(z3, str9, str10, eDnsType3, eDnsType4, str11, str12, str13, str14, str15, map, list7, list8, list9, list10, list11, list12, z4, str16, l3, l4, l5, routingOrder2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A, reason: from getter */
    public final EDnsType getRemoteDnsType() {
        return this.remoteDnsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B, reason: from getter */
    public final RoutingOrder getRouteOrder() {
        return this.routeOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void C(List list) {
        list.getClass();
        this.blockIp = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void D(List list) {
        list.getClass();
        this.blockSites = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E(List list) {
        list.getClass();
        this.directIp = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void F(List list) {
        list.getClass();
        this.directSites = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G(Map map) {
        map.getClass();
        this.dnsHosts = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H(String str) {
        str.getClass();
        this.domainStrategy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I(String str) {
        str.getClass();
        this.domesticDnsDomain = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void J(String str) {
        str.getClass();
        this.domesticDnsIp = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void K(EDnsType eDnsType) {
        eDnsType.getClass();
        this.domesticDnsType = eDnsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void L(boolean z) {
        this.fakeDnsEnabled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void M(String str) {
        str.getClass();
        this.geoIpUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void N(String str) {
        str.getClass();
        this.geoSiteUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void O(boolean z) {
        this.globalProxy = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void P(Long l) {
        this.lastUpdated = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Q(String str) {
        this.localPathGeo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void R(List list) {
        list.getClass();
        this.proxyIp = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void S(List list) {
        list.getClass();
        this.proxySites = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void T(String str) {
        str.getClass();
        this.remoteDnsDomain = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void U(String str) {
        str.getClass();
        this.remoteDnsIp = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void V(EDnsType eDnsType) {
        eDnsType.getClass();
        this.remoteDnsType = eDnsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void W(RoutingOrder routingOrder) {
        routingOrder.getClass();
        this.routeOrder = routingOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteSettings)) {
            return false;
        }
        RouteSettings routeSettings = (RouteSettings) obj;
        return this.globalProxy == routeSettings.globalProxy && dh3.f(this.remoteDnsIp, routeSettings.remoteDnsIp) && dh3.f(this.domesticDnsIp, routeSettings.domesticDnsIp) && this.remoteDnsType == routeSettings.remoteDnsType && this.domesticDnsType == routeSettings.domesticDnsType && dh3.f(this.remoteDnsDomain, routeSettings.remoteDnsDomain) && dh3.f(this.domesticDnsDomain, routeSettings.domesticDnsDomain) && dh3.f(this.geoIpUrl, routeSettings.geoIpUrl) && dh3.f(this.geoSiteUrl, routeSettings.geoSiteUrl) && dh3.f(this.domainStrategy, routeSettings.domainStrategy) && dh3.f(this.dnsHosts, routeSettings.dnsHosts) && dh3.f(this.proxySites, routeSettings.proxySites) && dh3.f(this.proxyIp, routeSettings.proxyIp) && dh3.f(this.directSites, routeSettings.directSites) && dh3.f(this.directIp, routeSettings.directIp) && dh3.f(this.blockSites, routeSettings.blockSites) && dh3.f(this.blockIp, routeSettings.blockIp) && this.fakeDnsEnabled == routeSettings.fakeDnsEnabled && dh3.f(this.localPathGeo, routeSettings.localPathGeo) && dh3.f(this.dateLastUpdateSite, routeSettings.dateLastUpdateSite) && dh3.f(this.dateLastUpdateIp, routeSettings.dateLastUpdateIp) && dh3.f(this.lastUpdated, routeSettings.lastUpdated) && this.routeOrder == routeSettings.routeOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getBlockIp() {
        return this.blockIp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getBlockSites() {
        return this.blockSites;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getDateLastUpdateIp() {
        return this.dateLastUpdateIp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.routeOrder.hashCode() + ((((((pc6.e(pc6.f(p61.f(p61.f(p61.f(p61.f(p61.f(p61.f((this.dnsHosts.hashCode() + pc6.e(pc6.e(pc6.e(pc6.e(pc6.e((this.domesticDnsType.hashCode() + ((this.remoteDnsType.hashCode() + pc6.e(pc6.e(Boolean.hashCode(this.globalProxy) * 31, 31, this.remoteDnsIp), 31, this.domesticDnsIp)) * 31)) * 31, 31, this.remoteDnsDomain), 31, this.domesticDnsDomain), 31, this.geoIpUrl), 31, this.geoSiteUrl), 31, this.domainStrategy)) * 31, 31, this.proxySites), 31, this.proxyIp), 31, this.directSites), 31, this.directIp), 31, this.blockSites), 31, this.blockIp), 31, this.fakeDnsEnabled), 31, this.localPathGeo) + (this.dateLastUpdateSite == null ? 0 : this.dateLastUpdateSite.hashCode())) * 31) + (this.dateLastUpdateIp == null ? 0 : this.dateLastUpdateIp.hashCode())) * 31) + (this.lastUpdated != null ? this.lastUpdated.hashCode() : 0)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getDateLastUpdateSite() {
        return this.dateLastUpdateSite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j, reason: from getter */
    public final List getDirectIp() {
        return this.directIp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k, reason: from getter */
    public final List getDirectSites() {
        return this.directSites;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Map getDnsHosts() {
        return this.dnsHosts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getDomainStrategy() {
        return this.domainStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getDomesticDnsDomain() {
        return this.domesticDnsDomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getDomesticDnsIp() {
        return this.domesticDnsIp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p, reason: from getter */
    public final EDnsType getDomesticDnsType() {
        return this.domesticDnsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getFakeDnsEnabled() {
        return this.fakeDnsEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getGeoIpUrl() {
        return this.geoIpUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getGeoSiteUrl() {
        return this.geoSiteUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getGlobalProxy() {
        return this.globalProxy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        boolean z = this.globalProxy;
        String str = this.remoteDnsIp;
        String str2 = this.domesticDnsIp;
        EDnsType eDnsType = this.remoteDnsType;
        EDnsType eDnsType2 = this.domesticDnsType;
        String str3 = this.remoteDnsDomain;
        String str4 = this.domesticDnsDomain;
        String str5 = this.geoIpUrl;
        String str6 = this.geoSiteUrl;
        String str7 = this.domainStrategy;
        Map<String, Object> map = this.dnsHosts;
        List<String> list = this.proxySites;
        List<String> list2 = this.proxyIp;
        List<String> list3 = this.directSites;
        List<String> list4 = this.directIp;
        List<String> list5 = this.blockSites;
        List<String> list6 = this.blockIp;
        boolean z2 = this.fakeDnsEnabled;
        String str8 = this.localPathGeo;
        Long l = this.dateLastUpdateSite;
        Long l2 = this.dateLastUpdateIp;
        Long l3 = this.lastUpdated;
        RoutingOrder routingOrder = this.routeOrder;
        StringBuilder sb = new StringBuilder("RouteSettings(globalProxy=");
        sb.append(z);
        sb.append(", remoteDnsIp=");
        sb.append(str);
        sb.append(", domesticDnsIp=");
        sb.append(str2);
        sb.append(", remoteDnsType=");
        sb.append(eDnsType);
        sb.append(", domesticDnsType=");
        sb.append(eDnsType2);
        sb.append(", remoteDnsDomain=");
        sb.append(str3);
        sb.append(", domesticDnsDomain=");
        oi0.y(sb, str4, ", geoIpUrl=", str5, ", geoSiteUrl=");
        oi0.y(sb, str6, ", domainStrategy=", str7, ", dnsHosts=");
        sb.append(map);
        sb.append(", proxySites=");
        sb.append(list);
        sb.append(", proxyIp=");
        sb.append(list2);
        sb.append(", directSites=");
        sb.append(list3);
        sb.append(", directIp=");
        sb.append(list4);
        sb.append(", blockSites=");
        sb.append(list5);
        sb.append(", blockIp=");
        sb.append(list6);
        sb.append(", fakeDnsEnabled=");
        sb.append(z2);
        sb.append(", localPathGeo=");
        sb.append(str8);
        sb.append(", dateLastUpdateSite=");
        sb.append(l);
        sb.append(", dateLastUpdateIp=");
        sb.append(l2);
        sb.append(", lastUpdated=");
        sb.append(l3);
        sb.append(", routeOrder=");
        sb.append(routingOrder);
        sb.append(")");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u, reason: from getter */
    public final Long getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getLocalPathGeo() {
        return this.localPathGeo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w, reason: from getter */
    public final List getProxyIp() {
        return this.proxyIp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x, reason: from getter */
    public final List getProxySites() {
        return this.proxySites;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getRemoteDnsDomain() {
        return this.remoteDnsDomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getRemoteDnsIp() {
        return this.remoteDnsIp;
    }

    public RouteSettings() {
        this(null, 8388607);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RouteSettings(String str, int i) {
        EDnsType eDnsType = DEFAULT_DNS_TYPE;
        this(true, DEFAULT_REMOTE_DNS_IP, DEFAULT_DOMESTIC_DNS_IP, eDnsType, eDnsType, DEFAULT_DNS_DOMAIN_REMOTE, DEFAULT_DNS_DOMAIN_DOMESTIC, DEFAULT_GEO_IP_URL, DEFAULT_GEO_SITE_URL, DEFAULT_ROUTING_DOMAIN_STRATEGY, DEFAULT_DNS_HOSTS, new ArrayList(), new ArrayList(), new ArrayList(), wv0.Z0(DEFAULT_DIRECT_IP), new ArrayList(), new ArrayList(), false, (i & 262144) != 0 ? "" : str, null, null, null, DEFAULT_ROUTE_ORDER);
    }
}
