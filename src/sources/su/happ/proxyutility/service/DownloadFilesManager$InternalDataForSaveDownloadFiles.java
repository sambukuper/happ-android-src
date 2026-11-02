package su.happ.proxyutility.service;

import kotlin.Metadata;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFile;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0083\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"su/happ/proxyutility/service/DownloadFilesManager$InternalDataForSaveDownloadFiles", "", "", "id", "J", "b", "()J", "setId", "(J)V", "Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;", "state", "Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;", "d", "()Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;", "setState", "(Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;)V", "", "fileName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "path", "c", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final /* data */ class DownloadFilesManager$InternalDataForSaveDownloadFiles {
    private final String fileName;
    private long id;
    private final String path;
    private StateDownloadFile state;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DownloadFilesManager$InternalDataForSaveDownloadFiles(long j, StateDownloadFile stateDownloadFile, String str, String str2) {
        stateDownloadFile.getClass();
        str.getClass();
        str2.getClass();
        this.id = j;
        this.state = stateDownloadFile;
        this.fileName = str;
        this.path = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d, reason: from getter */
    public final StateDownloadFile getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadFilesManager$InternalDataForSaveDownloadFiles)) {
            return false;
        }
        DownloadFilesManager$InternalDataForSaveDownloadFiles downloadFilesManager$InternalDataForSaveDownloadFiles = (DownloadFilesManager$InternalDataForSaveDownloadFiles) obj;
        return this.id == downloadFilesManager$InternalDataForSaveDownloadFiles.id && this.state == downloadFilesManager$InternalDataForSaveDownloadFiles.state && dh3.f(this.fileName, downloadFilesManager$InternalDataForSaveDownloadFiles.fileName) && dh3.f(this.path, downloadFilesManager$InternalDataForSaveDownloadFiles.path);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.path.hashCode() + pc6.e((this.state.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.fileName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        long j = this.id;
        StateDownloadFile stateDownloadFile = this.state;
        String str = this.fileName;
        String str2 = this.path;
        StringBuilder sb = new StringBuilder("InternalDataForSaveDownloadFiles(id=");
        sb.append(j);
        sb.append(", state=");
        sb.append(stateDownloadFile);
        oi0.y(sb, ", fileName=", str, ", path=", str2);
        sb.append(")");
        return sb.toString();
    }
}
