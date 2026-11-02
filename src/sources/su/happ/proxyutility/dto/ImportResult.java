package su.happ.proxyutility.dto;

import defpackage.t83;
import defpackage.x83;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lsu/happ/proxyutility/dto/ImportResult;", "", "", "count", "I", "a", "()I", "Lx83;", "status", "Lx83;", "c", "()Lx83;", "Lt83;", "lastParseError", "Lt83;", "b", "()Lt83;", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final /* data */ class ImportResult {
    public static final int $stable = 0;
    private final int count;
    private final t83 lastParseError;
    private final x83 status;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ImportResult(int i, x83 x83Var, t83 t83Var, int i2) {
        i = (i2 & 1) != 0 ? 0 : i;
        x83Var = (i2 & 2) != 0 ? null : x83Var;
        t83Var = (i2 & 4) != 0 ? null : t83Var;
        this.count = i;
        this.status = x83Var;
        this.lastParseError = t83Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b, reason: from getter */
    public final t83 getLastParseError() {
        return this.lastParseError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c, reason: from getter */
    public final x83 getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportResult)) {
            return false;
        }
        ImportResult importResult = (ImportResult) obj;
        return this.count == importResult.count && dh3.f(this.status, importResult.status) && dh3.f(this.lastParseError, importResult.lastParseError);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.count) * 31;
        x83 x83Var = this.status;
        int iHashCode2 = (iHashCode + (x83Var == null ? 0 : x83Var.hashCode())) * 31;
        t83 t83Var = this.lastParseError;
        return iHashCode2 + (t83Var != null ? t83Var.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ImportResult(count=" + this.count + ", status=" + this.status + ", lastParseError=" + this.lastParseError + ")";
    }
}
