package defpackage;

import su.happ.proxyutility.domain.routing.entity.DownloadFilesInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ga3 implements ja3 {
    public final zo8 a;
    public final DownloadFilesInfo b;
    public final boolean c;
    public final boolean d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ga3(zo8 zo8Var, DownloadFilesInfo downloadFilesInfo, boolean z, boolean z2) {
        zo8Var.getClass();
        downloadFilesInfo.getClass();
        this.a = zo8Var;
        this.b = downloadFilesInfo;
        this.c = z;
        this.d = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga3)) {
            return false;
        }
        ga3 ga3Var = (ga3) obj;
        return dh3.f(this.a, ga3Var.a) && dh3.f(this.b, ga3Var.b) && this.c == ga3Var.c && this.d == ga3Var.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.d) + pc6.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DownloadProgress(params=" + ("UpdateParamsUiState(value=" + this.a + ")") + ", downloadInfo=" + this.b + ", isForceUpdate=" + this.c + ", isPaused=" + this.d + ")";
    }
}
