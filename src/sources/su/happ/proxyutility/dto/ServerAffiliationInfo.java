package su.happ.proxyutility.dto;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lsu/happ/proxyutility/dto/ServerAffiliationInfo;", "", "", "testDelayMillis", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "setTestDelayMillis", "(Ljava/lang/Long;)V", "", "isLoading", "Z", "c", "()Z", "setLoading", "(Z)V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final /* data */ class ServerAffiliationInfo {
    public static final int $stable = 8;
    private boolean isLoading;
    private Long testDelayMillis;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap java.lang.Long:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap boolean:?: TERNARY null = ((wrap int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED] (LINE:6)) == (0 int)) ? true : false)
 A[MD:(java.lang.Long, boolean):void (m)] (LINE:13) call: su.happ.proxyutility.dto.ServerAffiliationInfo.<init>(java.lang.Long, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ServerAffiliationInfo(Long l, int i) {
        this((i & 1) != 0 ? null : l, (i & 2) == 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ServerAffiliationInfo a(ServerAffiliationInfo serverAffiliationInfo) {
        return new ServerAffiliationInfo(serverAffiliationInfo.testDelayMillis, serverAffiliationInfo.isLoading);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getTestDelayMillis() {
        return this.testDelayMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerAffiliationInfo)) {
            return false;
        }
        ServerAffiliationInfo serverAffiliationInfo = (ServerAffiliationInfo) obj;
        return dh3.f(this.testDelayMillis, serverAffiliationInfo.testDelayMillis) && this.isLoading == serverAffiliationInfo.isLoading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Long l = this.testDelayMillis;
        return Boolean.hashCode(this.isLoading) + ((l == null ? 0 : l.hashCode()) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ServerAffiliationInfo(testDelayMillis=" + this.testDelayMillis + ", isLoading=" + this.isLoading + ")";
    }

    public ServerAffiliationInfo(Long l, boolean z) {
        this.testDelayMillis = l;
        this.isLoading = z;
    }
}
