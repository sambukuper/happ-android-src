package su.happ.proxyutility.dto;

import kotlin.Metadata;
import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.domain.sub.SubId;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Lsu/happ/proxyutility/dto/LogFileInfo;", "", "", "path", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "name", "b", "", "createDate", "J", "a", "()J", "Lsu/happ/proxyutility/domain/sub/GuId;", "guid", "getGuid-kfED8wo", "Lsu/happ/proxyutility/domain/sub/SubId;", "subId", "d", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final /* data */ class LogFileInfo {
    public static final int $stable = 0;
    private final long createDate;
    private final String guid;
    private final String name;
    private final String path;
    private final String subId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public LogFileInfo(long j, String str, String str2) {
        GuId.Companion.getClass();
        String strA = GuId.a();
        SubId.Companion.getClass();
        this(str, str2, strA, SubId.c(), j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCreateDate() {
        return this.createDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubId() {
        return this.subId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogFileInfo)) {
            return false;
        }
        LogFileInfo logFileInfo = (LogFileInfo) obj;
        return dh3.f(this.path, logFileInfo.path) && dh3.f(this.name, logFileInfo.name) && this.createDate == logFileInfo.createDate && dh3.f(this.guid, logFileInfo.guid) && dh3.f(this.subId, logFileInfo.subId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.subId.hashCode() + pc6.e(p61.g(pc6.e(this.path.hashCode() * 31, 31, this.name), this.createDate, 31), 31, this.guid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.path;
        String str2 = this.name;
        long j = this.createDate;
        String str3 = this.guid;
        String str4 = this.subId;
        StringBuilder sbT = oi0.t("LogFileInfo(path=", str, ", name=", str2, ", createDate=");
        sbT.append(j);
        sbT.append(", guid=");
        sbT.append(str3);
        return p61.n(sbT, ", subId=", str4, ")");
    }

    public LogFileInfo(String str, String str2, String str3, String str4, long j) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        this.path = str;
        this.name = str2;
        this.createDate = j;
        this.guid = str3;
        this.subId = str4;
    }
}
