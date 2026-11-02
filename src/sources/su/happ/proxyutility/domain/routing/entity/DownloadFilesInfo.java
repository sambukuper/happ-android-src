package su.happ.proxyutility.domain.routing.entity;

import defpackage.ch3;
import defpackage.e37;
import defpackage.g44;
import defpackage.ol7;
import defpackage.ow3;
import defpackage.p61;
import defpackage.w01;
import defpackage.w74;
import defpackage.x97;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "id", "J", "d", "()J", "Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;", "state", "Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;", "f", "()Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;", "downloadBytes", "c", "totalBytes", "g", _UrlKt.FRAGMENT_ENCODE_SET, "progress", "I", "e", "()I", "Companion", "$serializer", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DownloadFilesInfo {
    public static final int $stable = 0;
    private final long downloadBytes;
    private final long id;
    private final int progress;
    private final StateDownloadFile state;
    private final long totalBytes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final g44[] $childSerializers = {null, x97.P(w74.X, new w01(18)), null, null, null};

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "Low3;", "Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;", "serializer", "()Low3;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public final ow3 serializer() {
            return DownloadFilesInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DownloadFilesInfo(int i, long j, StateDownloadFile stateDownloadFile, long j2, long j3, int i2) {
        if (31 != (i & 31)) {
            ch3.S(i, 31, DownloadFilesInfo$$serializer.INSTANCE.d());
            throw null;
        }
        this.id = j;
        this.state = stateDownloadFile;
        this.downloadBytes = j2;
        this.totalBytes = j3;
        this.progress = i2;
    }

    public static DownloadFilesInfo b(DownloadFilesInfo downloadFilesInfo, StateDownloadFile stateDownloadFile) {
        long j = downloadFilesInfo.id;
        long j2 = downloadFilesInfo.downloadBytes;
        long j3 = downloadFilesInfo.totalBytes;
        int i = downloadFilesInfo.progress;
        stateDownloadFile.getClass();
        return new DownloadFilesInfo(j, stateDownloadFile, j2, j3, i);
    }

    public static final /* synthetic */ void i(DownloadFilesInfo downloadFilesInfo, ol7 ol7Var, e37 e37Var) {
        g44[] g44VarArr = $childSerializers;
        ol7Var.n(e37Var, 0, downloadFilesInfo.id);
        ol7Var.q(e37Var, 1, (ow3) g44VarArr[1].getValue(), downloadFilesInfo.state);
        ol7Var.n(e37Var, 2, downloadFilesInfo.downloadBytes);
        ol7Var.n(e37Var, 3, downloadFilesInfo.totalBytes);
        ol7Var.l(4, downloadFilesInfo.progress, e37Var);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getDownloadBytes() {
        return this.downloadBytes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadFilesInfo)) {
            return false;
        }
        DownloadFilesInfo downloadFilesInfo = (DownloadFilesInfo) obj;
        return this.id == downloadFilesInfo.id && this.state == downloadFilesInfo.state && this.downloadBytes == downloadFilesInfo.downloadBytes && this.totalBytes == downloadFilesInfo.totalBytes && this.progress == downloadFilesInfo.progress;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final StateDownloadFile getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getTotalBytes() {
        return this.totalBytes;
    }

    public final boolean h() {
        return this.state == StateDownloadFile.SUCCESS;
    }

    public final int hashCode() {
        return Integer.hashCode(this.progress) + p61.g(p61.g((this.state.hashCode() + (Long.hashCode(this.id) * 31)) * 31, this.downloadBytes, 31), this.totalBytes, 31);
    }

    public final String toString() {
        return "DownloadFilesInfo(id=" + this.id + ", state=" + this.state + ", downloadBytes=" + this.downloadBytes + ", totalBytes=" + this.totalBytes + ", progress=" + this.progress + ")";
    }

    public DownloadFilesInfo(long j, StateDownloadFile stateDownloadFile, long j2, long j3, int i) {
        stateDownloadFile.getClass();
        this.id = j;
        this.state = stateDownloadFile;
        this.downloadBytes = j2;
        this.totalBytes = j3;
        this.progress = i;
    }
}
