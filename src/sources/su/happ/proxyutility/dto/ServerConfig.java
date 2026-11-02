package su.happ.proxyutility.dto;

import java.util.Locale;
import kotlin.Metadata;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.enums.EConfigType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000223R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010/\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u000e\u001a\u0004\b0\u0010\u0010\"\u0004\b1\u0010\u0012¨\u00064"}, d2 = {"Lsu/happ/proxyutility/dto/ServerConfig;", "", "", "configVersion", "I", "getConfigVersion", "()I", "Lsu/happ/proxyutility/dto/enums/EConfigType;", "configType", "Lsu/happ/proxyutility/dto/enums/EConfigType;", "c", "()Lsu/happ/proxyutility/dto/enums/EConfigType;", "Lsu/happ/proxyutility/domain/sub/SubId;", "subscriptionId", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "n", "(Ljava/lang/String;)V", "", "addedTime", "J", "getAddedTime", "()J", "", "remarks", "h", "m", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;", "outboundBean", "Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;", "f", "()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;", "Lsu/happ/proxyutility/dto/XRayConfig;", "fullConfig", "Lsu/happ/proxyutility/dto/XRayConfig;", "d", "()Lsu/happ/proxyutility/dto/XRayConfig;", "k", "(Lsu/happ/proxyutility/dto/XRayConfig;)V", "Lsu/happ/proxyutility/dto/ServerConfig$Meta;", "meta", "Lsu/happ/proxyutility/dto/ServerConfig$Meta;", "e", "()Lsu/happ/proxyutility/dto/ServerConfig$Meta;", "l", "(Lsu/happ/proxyutility/dto/ServerConfig$Meta;)V", "advancedFragment", "b", "j", "Companion", "Meta", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final /* data */ class ServerConfig {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final long addedTime;
    private String advancedFragment;
    private final EConfigType configType;
    private final int configVersion;
    private XRayConfig fullConfig;
    private Meta meta;
    private final XRayConfig.OutboundBean outboundBean;
    private String remarks;
    private String subscriptionId;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsu/happ/proxyutility/dto/ServerConfig$Companion;", "", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(k = 3, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 1328)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            static {
                int[] iArr = new int[EConfigType.values().length];
                try {
                    iArr[EConfigType.VMESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EConfigType.VLESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EConfigType.CUSTOM.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EConfigType.SHADOWSOCKS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EConfigType.SOCKS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EConfigType.TROJAN.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EConfigType.WIREGUARD.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EConfigType.HYSTERIA.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static ServerConfig a(EConfigType eConfigType) {
            eConfigType.getClass();
            switch (WhenMappings.$EnumSwitchMapping$0[eConfigType.ordinal()]) {
                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                    String lowerCase = eConfigType.name().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    return new ServerConfig(eConfigType, new XRayConfig.OutboundBean(null, lowerCase, new XRayConfig.OutboundBean.OutSettingsBean(null, null, 29884031), new XRayConfig.OutboundBean.StreamSettingsBean(null, null, null, 16383), 113), 477);
                case 3:
                    return new ServerConfig(eConfigType, null, 509);
                case 4:
                case 5:
                case 6:
                    String lowerCase2 = eConfigType.name().toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    return new ServerConfig(eConfigType, new XRayConfig.OutboundBean(null, lowerCase2, new XRayConfig.OutboundBean.OutSettingsBean(i21.K(new XRayConfig.OutboundBean.OutSettingsBean.ServersBean(0, 65535)), null, 33554415), new XRayConfig.OutboundBean.StreamSettingsBean(null, null, null, 16383), 113), 477);
                case 7:
                    String lowerCase3 = eConfigType.name().toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                    return new ServerConfig(eConfigType, new XRayConfig.OutboundBean(null, lowerCase3, new XRayConfig.OutboundBean.OutSettingsBean(null, i21.K(new XRayConfig.OutboundBean.OutSettingsBean.WireGuardBean()), 33456127), new XRayConfig.OutboundBean.StreamSettingsBean(null, null, null, 16383), 113), 477);
                case 8:
                    String lowerCase4 = eConfigType.name().toLowerCase(Locale.ROOT);
                    lowerCase4.getClass();
                    return new ServerConfig(eConfigType, new XRayConfig.OutboundBean(null, lowerCase4, new XRayConfig.OutboundBean.OutSettingsBean(null, null, 16777215), new XRayConfig.OutboundBean.StreamSettingsBean(new XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean(), new XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean(null, null, 7), null, 13311), 113), 477);
                default:
                    b61.c();
                    return null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ServerConfig(EConfigType eConfigType, XRayConfig.OutboundBean outboundBean, int i) {
        this(3, eConfigType, SubId.c(), System.currentTimeMillis(), "", (i & 32) != 0 ? null : outboundBean, null, null, null);
        SubId.Companion.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ServerConfig a(ServerConfig serverConfig) {
        int i = serverConfig.configVersion;
        EConfigType eConfigType = serverConfig.configType;
        String str = serverConfig.subscriptionId;
        long j = serverConfig.addedTime;
        String str2 = serverConfig.remarks;
        XRayConfig.OutboundBean outboundBean = serverConfig.outboundBean;
        XRayConfig xRayConfig = serverConfig.fullConfig;
        Meta meta = serverConfig.meta;
        String str3 = serverConfig.advancedFragment;
        serverConfig.getClass();
        eConfigType.getClass();
        str.getClass();
        str2.getClass();
        return new ServerConfig(i, eConfigType, str, j, str2, outboundBean, xRayConfig, meta, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAdvancedFragment() {
        return this.advancedFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c, reason: from getter */
    public final EConfigType getConfigType() {
        return this.configType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d, reason: from getter */
    public final XRayConfig getFullConfig() {
        return this.fullConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerConfig)) {
            return false;
        }
        ServerConfig serverConfig = (ServerConfig) obj;
        return this.configVersion == serverConfig.configVersion && this.configType == serverConfig.configType && dh3.f(this.subscriptionId, serverConfig.subscriptionId) && this.addedTime == serverConfig.addedTime && dh3.f(this.remarks, serverConfig.remarks) && dh3.f(this.outboundBean, serverConfig.outboundBean) && dh3.f(this.fullConfig, serverConfig.fullConfig) && dh3.f(this.meta, serverConfig.meta) && dh3.f(this.advancedFragment, serverConfig.advancedFragment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f, reason: from getter */
    public final XRayConfig.OutboundBean getOutboundBean() {
        return this.outboundBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final XRayConfig.OutboundBean g() {
        if (this.configType != EConfigType.CUSTOM) {
            return this.outboundBean;
        }
        XRayConfig xRayConfig = this.fullConfig;
        if (xRayConfig != null) {
            return xRayConfig.j();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getRemarks() {
        return this.remarks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iE = pc6.e(p61.g(pc6.e((this.configType.hashCode() + (Integer.hashCode(this.configVersion) * 31)) * 31, 31, this.subscriptionId), this.addedTime, 31), 31, this.remarks);
        XRayConfig.OutboundBean outboundBean = this.outboundBean;
        int iHashCode = (iE + (outboundBean == null ? 0 : outboundBean.hashCode())) * 31;
        XRayConfig xRayConfig = this.fullConfig;
        int iHashCode2 = (iHashCode + (xRayConfig == null ? 0 : xRayConfig.hashCode())) * 31;
        Meta meta = this.meta;
        int iHashCode3 = (iHashCode2 + (meta == null ? 0 : meta.hashCode())) * 31;
        String str = this.advancedFragment;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(String str) {
        this.advancedFragment = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(XRayConfig xRayConfig) {
        this.fullConfig = xRayConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(Meta meta) {
        this.meta = meta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(String str) {
        str.getClass();
        this.remarks = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n(String str) {
        str.getClass();
        this.subscriptionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i = this.configVersion;
        EConfigType eConfigType = this.configType;
        String str = this.subscriptionId;
        long j = this.addedTime;
        String str2 = this.remarks;
        XRayConfig.OutboundBean outboundBean = this.outboundBean;
        XRayConfig xRayConfig = this.fullConfig;
        Meta meta = this.meta;
        String str3 = this.advancedFragment;
        StringBuilder sb = new StringBuilder("ServerConfig(configVersion=");
        sb.append(i);
        sb.append(", configType=");
        sb.append(eConfigType);
        sb.append(", subscriptionId=");
        sb.append(str);
        sb.append(", addedTime=");
        sb.append(j);
        sb.append(", remarks=");
        sb.append(str2);
        sb.append(", outboundBean=");
        sb.append(outboundBean);
        sb.append(", fullConfig=");
        sb.append(xRayConfig);
        sb.append(", meta=");
        sb.append(meta);
        return p61.n(sb, ", advancedFragment=", str3, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsu/happ/proxyutility/dto/ServerConfig$Meta;", "", "", "serverDescription", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
    public static final /* data */ class Meta {
        public static final int $stable = 0;

        @p37("serverDescription")
        private final String serverDescription;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Meta(String str) {
            this.serverDescription = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getServerDescription() {
            return this.serverDescription;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Meta) && dh3.f(this.serverDescription, ((Meta) obj).serverDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int hashCode() {
            if (this.serverDescription == null) {
                return 0;
            }
            return this.serverDescription.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String toString() {
            return pc6.p("Meta(serverDescription=", this.serverDescription, ")");
        }

        public Meta() {
            this(null);
        }
    }

    public ServerConfig(int i, EConfigType eConfigType, String str, long j, String str2, XRayConfig.OutboundBean outboundBean, XRayConfig xRayConfig, Meta meta, String str3) {
        eConfigType.getClass();
        str.getClass();
        this.configVersion = i;
        this.configType = eConfigType;
        this.subscriptionId = str;
        this.addedTime = j;
        this.remarks = str2;
        this.outboundBean = outboundBean;
        this.fullConfig = xRayConfig;
        this.meta = meta;
        this.advancedFragment = str3;
    }
}
