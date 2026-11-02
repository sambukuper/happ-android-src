package su.happ.proxyutility.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b,\b\u0087\b\u0018\u0000 ]2\u00020\u0001:\u0001]R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR$\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR$\u0010(\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0004\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR0\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010+8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u00103\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R*\u00109\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u00106\"\u0004\b;\u00108R*\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u00104\u001a\u0004\b=\u00106\"\u0004\b>\u00108R*\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u00104\u001a\u0004\b@\u00106\"\u0004\bA\u00108R*\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u00104\u001a\u0004\bC\u00106\"\u0004\bD\u00108R*\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bE\u00104\u001a\u0004\bF\u00106\"\u0004\bG\u00108R\"\u0010H\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010N\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010\u0004\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR*\u0010Q\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bQ\u0010\u0004\u0012\u0004\bT\u0010U\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR*\u0010V\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bV\u0010\u0004\u0012\u0004\bY\u0010U\u001a\u0004\bW\u0010\u0006\"\u0004\bX\u0010\bR$\u0010Z\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bZ\u0010\u0004\u001a\u0004\b[\u0010\u0006\"\u0004\b\\\u0010\b¨\u0006^"}, d2 = {"Lsu/happ/proxyutility/dto/ProfileRoutingSettings;", "", "", "name", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "y", "(Ljava/lang/String;)V", "remoteDnsIp", "v", "setRemoteDnsIp", "domesticDnsIp", "j", "setDomesticDnsIp", "remoteDnsType", "w", "setRemoteDnsType", "domesticDnsType", "k", "setDomesticDnsType", "remoteDnsDomain", "u", "setRemoteDnsDomain", "domesticDnsDomain", "i", "setDomesticDnsDomain", "", "globalProxy", "Ljava/lang/Boolean;", "o", "()Ljava/lang/Boolean;", "setGlobalProxy", "(Ljava/lang/Boolean;)V", "geoIpUrl", "m", "setGeoIpUrl", "geoSiteUrl", "n", "setGeoSiteUrl", "domainStrategy", "g", "setDomainStrategy", "", "dnsHosts", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "setDnsHosts", "(Ljava/util/Map;)V", "", "proxySites", "Ljava/util/List;", "s", "()Ljava/util/List;", "setProxySites", "(Ljava/util/List;)V", "proxyIp", "r", "setProxyIp", "directSites", "e", "setDirectSites", "directIp", "d", "setDirectIp", "blockSites", "c", "setBlockSites", "blockIp", "b", "setBlockIp", "fakeDnsEnabled", "Z", "l", "()Z", "setFakeDnsEnabled", "(Z)V", "lastUpdated", "p", "setLastUpdated", "remoteDns", "t", "setRemoteDns", "getRemoteDns$annotations", "()V", "domesticDns", "h", "setDomesticDns", "getDomesticDns$annotations", "routeOrder", "x", "setRouteOrder", "Companion", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final /* data */ class ProfileRoutingSettings {
    public static final int $stable = 8;
    public static final String DEFAULT_NAME = "Default";

    @p37("blockip")
    private List<String> blockIp;

    @p37("blocksites")
    private List<String> blockSites;

    @p37("directip")
    private List<String> directIp;

    @p37("directsites")
    private List<String> directSites;

    @p37("dnshosts")
    private Map<String, Object> dnsHosts;

    @p37("domainstrategy")
    private String domainStrategy;

    @p37("domesticdns")
    private String domesticDns;

    @p37("domesticdnsdomain")
    private String domesticDnsDomain;

    @p37("domesticdnsip")
    private String domesticDnsIp;

    @p37("domesticdnstype")
    private String domesticDnsType;

    @p37("fakedns")
    private boolean fakeDnsEnabled;

    @p37("geoipurl")
    private String geoIpUrl;

    @p37("geositeurl")
    private String geoSiteUrl;

    @p37("globalproxy")
    private Boolean globalProxy;

    @p37("lastupdated")
    private String lastUpdated;

    @p37("name")
    private String name;

    @p37("proxyip")
    private List<String> proxyIp;

    @p37("proxysites")
    private List<String> proxySites;

    @p37("remotedns")
    private String remoteDns;

    @p37("remotednsdomain")
    private String remoteDnsDomain;

    @p37("remotednsip")
    private String remoteDnsIp;

    @p37("remotednstype")
    private String remoteDnsType;

    @p37("routeorder")
    private String routeOrder;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ProfileRoutingSettings(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, String str10, Map map, List list, List list2, List list3, List list4, List list5, List list6, boolean z, String str11, String str12, String str13, String str14) {
        str.getClass();
        this.name = str;
        this.remoteDnsIp = str2;
        this.domesticDnsIp = str3;
        this.remoteDnsType = str4;
        this.domesticDnsType = str5;
        this.remoteDnsDomain = str6;
        this.domesticDnsDomain = str7;
        this.globalProxy = bool;
        this.geoIpUrl = str8;
        this.geoSiteUrl = str9;
        this.domainStrategy = str10;
        this.dnsHosts = map;
        this.proxySites = list;
        this.proxyIp = list2;
        this.directSites = list3;
        this.directIp = list4;
        this.blockSites = list5;
        this.blockIp = list6;
        this.fakeDnsEnabled = z;
        this.lastUpdated = str11;
        this.remoteDns = str12;
        this.domesticDns = str13;
        this.routeOrder = str14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ProfileRoutingSettings a(ProfileRoutingSettings profileRoutingSettings, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9, Map map, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, String str10) {
        String str11 = profileRoutingSettings.name;
        boolean z = profileRoutingSettings.fakeDnsEnabled;
        String str12 = profileRoutingSettings.lastUpdated;
        String str13 = profileRoutingSettings.remoteDns;
        String str14 = profileRoutingSettings.domesticDns;
        str11.getClass();
        return new ProfileRoutingSettings(str11, str, str2, str3, str4, str5, str6, bool, str7, str8, str9, map, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, z, str12, str13, str14, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getBlockIp() {
        return this.blockIp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getBlockSites() {
        return this.blockSites;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getDirectIp() {
        return this.directIp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getDirectSites() {
        return this.directSites;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileRoutingSettings)) {
            return false;
        }
        ProfileRoutingSettings profileRoutingSettings = (ProfileRoutingSettings) obj;
        return dh3.f(this.name, profileRoutingSettings.name) && dh3.f(this.remoteDnsIp, profileRoutingSettings.remoteDnsIp) && dh3.f(this.domesticDnsIp, profileRoutingSettings.domesticDnsIp) && dh3.f(this.remoteDnsType, profileRoutingSettings.remoteDnsType) && dh3.f(this.domesticDnsType, profileRoutingSettings.domesticDnsType) && dh3.f(this.remoteDnsDomain, profileRoutingSettings.remoteDnsDomain) && dh3.f(this.domesticDnsDomain, profileRoutingSettings.domesticDnsDomain) && dh3.f(this.globalProxy, profileRoutingSettings.globalProxy) && dh3.f(this.geoIpUrl, profileRoutingSettings.geoIpUrl) && dh3.f(this.geoSiteUrl, profileRoutingSettings.geoSiteUrl) && dh3.f(this.domainStrategy, profileRoutingSettings.domainStrategy) && dh3.f(this.dnsHosts, profileRoutingSettings.dnsHosts) && dh3.f(this.proxySites, profileRoutingSettings.proxySites) && dh3.f(this.proxyIp, profileRoutingSettings.proxyIp) && dh3.f(this.directSites, profileRoutingSettings.directSites) && dh3.f(this.directIp, profileRoutingSettings.directIp) && dh3.f(this.blockSites, profileRoutingSettings.blockSites) && dh3.f(this.blockIp, profileRoutingSettings.blockIp) && this.fakeDnsEnabled == profileRoutingSettings.fakeDnsEnabled && dh3.f(this.lastUpdated, profileRoutingSettings.lastUpdated) && dh3.f(this.remoteDns, profileRoutingSettings.remoteDns) && dh3.f(this.domesticDns, profileRoutingSettings.domesticDns) && dh3.f(this.routeOrder, profileRoutingSettings.routeOrder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Map getDnsHosts() {
        return this.dnsHosts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDomainStrategy() {
        return this.domainStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getDomesticDns() {
        return this.domesticDns;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return ((((((pc6.f(((((((((((((((((((((((((((((((((((this.name.hashCode() * 31) + (this.remoteDnsIp == null ? 0 : this.remoteDnsIp.hashCode())) * 31) + (this.domesticDnsIp == null ? 0 : this.domesticDnsIp.hashCode())) * 31) + (this.remoteDnsType == null ? 0 : this.remoteDnsType.hashCode())) * 31) + (this.domesticDnsType == null ? 0 : this.domesticDnsType.hashCode())) * 31) + (this.remoteDnsDomain == null ? 0 : this.remoteDnsDomain.hashCode())) * 31) + (this.domesticDnsDomain == null ? 0 : this.domesticDnsDomain.hashCode())) * 31) + (this.globalProxy == null ? 0 : this.globalProxy.hashCode())) * 31) + (this.geoIpUrl == null ? 0 : this.geoIpUrl.hashCode())) * 31) + (this.geoSiteUrl == null ? 0 : this.geoSiteUrl.hashCode())) * 31) + (this.domainStrategy == null ? 0 : this.domainStrategy.hashCode())) * 31) + (this.dnsHosts == null ? 0 : this.dnsHosts.hashCode())) * 31) + (this.proxySites == null ? 0 : this.proxySites.hashCode())) * 31) + (this.proxyIp == null ? 0 : this.proxyIp.hashCode())) * 31) + (this.directSites == null ? 0 : this.directSites.hashCode())) * 31) + (this.directIp == null ? 0 : this.directIp.hashCode())) * 31) + (this.blockSites == null ? 0 : this.blockSites.hashCode())) * 31) + (this.blockIp == null ? 0 : this.blockIp.hashCode())) * 31, 31, this.fakeDnsEnabled) + (this.lastUpdated == null ? 0 : this.lastUpdated.hashCode())) * 31) + (this.remoteDns == null ? 0 : this.remoteDns.hashCode())) * 31) + (this.domesticDns == null ? 0 : this.domesticDns.hashCode())) * 31) + (this.routeOrder != null ? this.routeOrder.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getDomesticDnsDomain() {
        return this.domesticDnsDomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getDomesticDnsIp() {
        return this.domesticDnsIp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getDomesticDnsType() {
        return this.domesticDnsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getFakeDnsEnabled() {
        return this.fakeDnsEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getGeoIpUrl() {
        return this.geoIpUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getGeoSiteUrl() {
        return this.geoSiteUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o, reason: from getter */
    public final Boolean getGlobalProxy() {
        return this.globalProxy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r, reason: from getter */
    public final List getProxyIp() {
        return this.proxyIp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s, reason: from getter */
    public final List getProxySites() {
        return this.proxySites;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getRemoteDns() {
        return this.remoteDns;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.name;
        String str2 = this.remoteDnsIp;
        String str3 = this.domesticDnsIp;
        String str4 = this.remoteDnsType;
        String str5 = this.domesticDnsType;
        String str6 = this.remoteDnsDomain;
        String str7 = this.domesticDnsDomain;
        Boolean bool = this.globalProxy;
        String str8 = this.geoIpUrl;
        String str9 = this.geoSiteUrl;
        String str10 = this.domainStrategy;
        Map<String, Object> map = this.dnsHosts;
        List<String> list = this.proxySites;
        List<String> list2 = this.proxyIp;
        List<String> list3 = this.directSites;
        List<String> list4 = this.directIp;
        List<String> list5 = this.blockSites;
        List<String> list6 = this.blockIp;
        boolean z = this.fakeDnsEnabled;
        String str11 = this.lastUpdated;
        String str12 = this.remoteDns;
        String str13 = this.domesticDns;
        String str14 = this.routeOrder;
        StringBuilder sbT = oi0.t("ProfileRoutingSettings(name=", str, ", remoteDnsIp=", str2, ", domesticDnsIp=");
        oi0.y(sbT, str3, ", remoteDnsType=", str4, ", domesticDnsType=");
        oi0.y(sbT, str5, ", remoteDnsDomain=", str6, ", domesticDnsDomain=");
        sbT.append(str7);
        sbT.append(", globalProxy=");
        sbT.append(bool);
        sbT.append(", geoIpUrl=");
        oi0.y(sbT, str8, ", geoSiteUrl=", str9, ", domainStrategy=");
        sbT.append(str10);
        sbT.append(", dnsHosts=");
        sbT.append(map);
        sbT.append(", proxySites=");
        sbT.append(list);
        sbT.append(", proxyIp=");
        sbT.append(list2);
        sbT.append(", directSites=");
        sbT.append(list3);
        sbT.append(", directIp=");
        sbT.append(list4);
        sbT.append(", blockSites=");
        sbT.append(list5);
        sbT.append(", blockIp=");
        sbT.append(list6);
        sbT.append(", fakeDnsEnabled=");
        sbT.append(z);
        sbT.append(", lastUpdated=");
        sbT.append(str11);
        sbT.append(", remoteDns=");
        oi0.y(sbT, str12, ", domesticDns=", str13, ", routeOrder=");
        return oi0.p(sbT, str14, ")");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getRemoteDnsDomain() {
        return this.remoteDnsDomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getRemoteDnsIp() {
        return this.remoteDnsIp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getRemoteDnsType() {
        return this.remoteDnsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getRouteOrder() {
        return this.routeOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y() {
        this.name = DEFAULT_NAME;
    }
}
