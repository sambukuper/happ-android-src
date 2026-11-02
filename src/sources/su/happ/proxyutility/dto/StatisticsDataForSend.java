package su.happ.proxyutility.dto;

import defpackage.bd8;
import defpackage.si7;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R/\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\t0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lsu/happ/proxyutility/dto/StatisticsDataForSend;", "", "", "passedTime", "J", "c", "()J", "currentTime", "a", "", "Lbd8;", "Lsi7;", "data", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final /* data */ class StatisticsDataForSend {
    public static final int $stable = 8;
    private final long currentTime;
    private final Map<bd8, Map<si7, Long>> data;
    private final long passedTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public StatisticsDataForSend(long j, long j2, LinkedHashMap linkedHashMap) {
        this.passedTime = j;
        this.currentTime = j2;
        this.data = linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCurrentTime() {
        return this.currentTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Map getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getPassedTime() {
        return this.passedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatisticsDataForSend)) {
            return false;
        }
        StatisticsDataForSend statisticsDataForSend = (StatisticsDataForSend) obj;
        return this.passedTime == statisticsDataForSend.passedTime && this.currentTime == statisticsDataForSend.currentTime && dh3.f(this.data, statisticsDataForSend.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.data.hashCode() + p61.g(Long.hashCode(this.passedTime) * 31, this.currentTime, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        long j = this.passedTime;
        long j2 = this.currentTime;
        Map<bd8, Map<si7, Long>> map = this.data;
        StringBuilder sbS = pc6.s(j, "StatisticsDataForSend(passedTime=", ", currentTime=");
        sbS.append(j2);
        sbS.append(", data=");
        sbS.append(map);
        sbS.append(")");
        return sbS.toString();
    }
}
