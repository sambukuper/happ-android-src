package su.happ.proxyutility.dto;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lsu/happ/proxyutility/dto/ServerCache;", "", "Lsu/happ/proxyutility/domain/sub/GuId;", "guid", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lsu/happ/proxyutility/dto/ServerConfig;", "config", "Lsu/happ/proxyutility/dto/ServerConfig;", "c", "()Lsu/happ/proxyutility/dto/ServerConfig;", "Lsu/happ/proxyutility/dto/ServerAffiliationInfo;", "affiliationInfo", "Lsu/happ/proxyutility/dto/ServerAffiliationInfo;", "b", "()Lsu/happ/proxyutility/dto/ServerAffiliationInfo;", "setAffiliationInfo", "(Lsu/happ/proxyutility/dto/ServerAffiliationInfo;)V", "", "isSelected", "Z", "e", "()Z", "f", "(Z)V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final /* data */ class ServerCache {
    public static final int $stable = 8;
    private ServerAffiliationInfo affiliationInfo;
    private final ServerConfig config;
    private final String guid;
    private boolean isSelected;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ServerCache(String str, ServerConfig serverConfig, ServerAffiliationInfo serverAffiliationInfo, boolean z) {
        serverConfig.getClass();
        this.guid = str;
        this.config = serverConfig;
        this.affiliationInfo = serverAffiliationInfo;
        this.isSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ServerCache a(ServerCache serverCache, ServerConfig serverConfig, ServerAffiliationInfo serverAffiliationInfo, boolean z, int i) {
        String str = serverCache.guid;
        if ((i & 2) != 0) {
            serverConfig = serverCache.config;
        }
        if ((i & 4) != 0) {
            serverAffiliationInfo = serverCache.affiliationInfo;
        }
        if ((i & 8) != 0) {
            z = serverCache.isSelected;
        }
        serverCache.getClass();
        str.getClass();
        serverConfig.getClass();
        return new ServerCache(str, serverConfig, serverAffiliationInfo, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ServerAffiliationInfo getAffiliationInfo() {
        return this.affiliationInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ServerConfig getConfig() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerCache)) {
            return false;
        }
        ServerCache serverCache = (ServerCache) obj;
        return dh3.f(this.guid, serverCache.guid) && dh3.f(this.config, serverCache.config) && dh3.f(this.affiliationInfo, serverCache.affiliationInfo) && this.isSelected == serverCache.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        this.isSelected = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.config.hashCode() + (this.guid.hashCode() * 31)) * 31;
        ServerAffiliationInfo serverAffiliationInfo = this.affiliationInfo;
        return Boolean.hashCode(this.isSelected) + ((iHashCode + (serverAffiliationInfo == null ? 0 : serverAffiliationInfo.hashCode())) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ServerCache(guid=" + this.guid + ", config=" + this.config + ", affiliationInfo=" + this.affiliationInfo + ", isSelected=" + this.isSelected + ")";
    }
}
