package su.happ.proxyutility.dto;

import android.net.IpPrefix;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lsu/happ/proxyutility/dto/ExcludeSettingsCache;", "", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "Landroid/net/IpPrefix;", "ipPrefix", "Landroid/net/IpPrefix;", "a", "()Landroid/net/IpPrefix;", "setIpPrefix", "(Landroid/net/IpPrefix;)V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final /* data */ class ExcludeSettingsCache {
    public static final int $stable = 8;
    private IpPrefix ipPrefix;
    private String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ExcludeSettingsCache(String str, IpPrefix ipPrefix) {
        str.getClass();
        this.value = str;
        this.ipPrefix = ipPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a, reason: from getter */
    public final IpPrefix getIpPrefix() {
        return this.ipPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExcludeSettingsCache)) {
            return false;
        }
        ExcludeSettingsCache excludeSettingsCache = (ExcludeSettingsCache) obj;
        return dh3.f(this.value, excludeSettingsCache.value) && dh3.f(this.ipPrefix, excludeSettingsCache.ipPrefix);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        IpPrefix ipPrefix = this.ipPrefix;
        return iHashCode + (ipPrefix == null ? 0 : ipPrefix.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ExcludeSettingsCache(value=" + this.value + ", ipPrefix=" + this.ipPrefix + ")";
    }
}
