package su.happ.proxyutility.dto;

import kotlin.Metadata;
import su.happ.proxyutility.dto.enums.EPingType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsu/happ/proxyutility/dto/TestPingViaProxyData;", "", "", "config", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lsu/happ/proxyutility/domain/sub/GuId;", "guid", "b", "Lsu/happ/proxyutility/dto/enums/EPingType;", "type", "Lsu/happ/proxyutility/dto/enums/EPingType;", "c", "()Lsu/happ/proxyutility/dto/enums/EPingType;", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final /* data */ class TestPingViaProxyData {
    public static final int $stable = 0;
    private final String config;
    private final String guid;
    private final EPingType type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TestPingViaProxyData(String str, String str2, EPingType ePingType) {
        str2.getClass();
        ePingType.getClass();
        this.config = str;
        this.guid = str2;
        this.type = ePingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getConfig() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c, reason: from getter */
    public final EPingType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestPingViaProxyData)) {
            return false;
        }
        TestPingViaProxyData testPingViaProxyData = (TestPingViaProxyData) obj;
        return dh3.f(this.config, testPingViaProxyData.config) && dh3.f(this.guid, testPingViaProxyData.guid) && this.type == testPingViaProxyData.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.type.hashCode() + pc6.e(this.config.hashCode() * 31, 31, this.guid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.config;
        String str2 = this.guid;
        EPingType ePingType = this.type;
        StringBuilder sbT = oi0.t("TestPingViaProxyData(config=", str, ", guid=", str2, ", type=");
        sbT.append(ePingType);
        sbT.append(")");
        return sbT.toString();
    }
}
