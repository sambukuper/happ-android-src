package su.happ.proxyutility.dto;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lsu/happ/proxyutility/dto/SubscriptionRestrictedStatus;", "", "Lsu/happ/proxyutility/dto/ProviderId;", "providerId", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "", "status", "I", "c", "()I", "", "import", "Z", "a", "()Z", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final /* data */ class SubscriptionRestrictedStatus {
    public static final int $stable = 0;

    @p37("import")
    private final boolean import;

    @p37(MetaParams.PROVIDER_ID)
    private final String providerId;

    @p37("status")
    private final int status;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getImport() {
        return this.import;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getProviderId() {
        return this.providerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionRestrictedStatus)) {
            return false;
        }
        SubscriptionRestrictedStatus subscriptionRestrictedStatus = (SubscriptionRestrictedStatus) obj;
        String str = this.providerId;
        String str2 = subscriptionRestrictedStatus.providerId;
        ProviderId.Companion companion = ProviderId.INSTANCE;
        return dh3.f(str, str2) && this.status == subscriptionRestrictedStatus.status && this.import == subscriptionRestrictedStatus.import;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.providerId;
        ProviderId.Companion companion = ProviderId.INSTANCE;
        return Boolean.hashCode(this.import) + oi0.e(this.status, str.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.providerId;
        ProviderId.Companion companion = ProviderId.INSTANCE;
        int i = this.status;
        boolean z = this.import;
        StringBuilder sb = new StringBuilder("SubscriptionRestrictedStatus(providerId=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", import=");
        return p61.o(sb, z, ")");
    }
}
