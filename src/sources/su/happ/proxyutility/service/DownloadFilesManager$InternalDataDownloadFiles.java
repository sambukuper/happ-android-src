package su.happ.proxyutility.service;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFile;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0083\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"su/happ/proxyutility/service/DownloadFilesManager$InternalDataDownloadFiles", "", "", "id", "J", "c", "()J", "setId", "(J)V", "Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;", "state", "Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;", "f", "()Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;", "g", "(Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;)V", "", "fileName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "path", "e", "", "Lhs;", "listeners", "Ljava/util/List;", "d", "()Ljava/util/List;", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
final /* data */ class DownloadFilesManager$InternalDataDownloadFiles {
    private final String fileName;
    private long id;
    private final transient List<hs> listeners;
    private final String path;
    private StateDownloadFile state;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DownloadFilesManager$InternalDataDownloadFiles(long j, StateDownloadFile stateDownloadFile, String str, String str2, List list) {
        stateDownloadFile.getClass();
        str.getClass();
        str2.getClass();
        this.id = j;
        this.state = stateDownloadFile;
        this.fileName = str;
        this.path = str2;
        this.listeners = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static DownloadFilesManager$InternalDataDownloadFiles a(DownloadFilesManager$InternalDataDownloadFiles downloadFilesManager$InternalDataDownloadFiles, ArrayList arrayList) {
        long j = downloadFilesManager$InternalDataDownloadFiles.id;
        StateDownloadFile stateDownloadFile = downloadFilesManager$InternalDataDownloadFiles.state;
        String str = downloadFilesManager$InternalDataDownloadFiles.fileName;
        String str2 = downloadFilesManager$InternalDataDownloadFiles.path;
        stateDownloadFile.getClass();
        str.getClass();
        str2.getClass();
        return new DownloadFilesManager$InternalDataDownloadFiles(j, stateDownloadFile, str, str2, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getListeners() {
        return this.listeners;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadFilesManager$InternalDataDownloadFiles)) {
            return false;
        }
        DownloadFilesManager$InternalDataDownloadFiles downloadFilesManager$InternalDataDownloadFiles = (DownloadFilesManager$InternalDataDownloadFiles) obj;
        return this.id == downloadFilesManager$InternalDataDownloadFiles.id && this.state == downloadFilesManager$InternalDataDownloadFiles.state && dh3.f(this.fileName, downloadFilesManager$InternalDataDownloadFiles.fileName) && dh3.f(this.path, downloadFilesManager$InternalDataDownloadFiles.path) && dh3.f(this.listeners, downloadFilesManager$InternalDataDownloadFiles.listeners);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f, reason: from getter */
    public final StateDownloadFile getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(StateDownloadFile stateDownloadFile) {
        stateDownloadFile.getClass();
        this.state = stateDownloadFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.listeners.hashCode() + pc6.e(pc6.e((this.state.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.fileName), 31, this.path);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        long j = this.id;
        StateDownloadFile stateDownloadFile = this.state;
        String str = this.fileName;
        String str2 = this.path;
        List<hs> list = this.listeners;
        StringBuilder sb = new StringBuilder("InternalDataDownloadFiles(id=");
        sb.append(j);
        sb.append(", state=");
        sb.append(stateDownloadFile);
        oi0.y(sb, ", fileName=", str, ", path=", str2);
        sb.append(", listeners=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
