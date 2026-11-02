package su.happ.proxyutility.domain.sub;

import defpackage.dh3;
import defpackage.pc6;
import defpackage.pr;
import defpackage.q23;
import defpackage.y83;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lsu/happ/proxyutility/domain/sub/ImportSubResult;", _UrlKt.FRAGMENT_ENCODE_SET, "Lpr;", "networkResponse", "Lpr;", "c", "()Lpr;", _UrlKt.FRAGMENT_ENCODE_SET, "isSubUpdateRequired", "Z", "d", "()Z", "Lq23;", "errorStatusCode", "Lq23;", "b", "()Lq23;", "Companion", "y83", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ImportSubResult {
    public static final int $stable = 8;
    public static final y83 Companion = new y83();
    private static final ImportSubResult EMPTY = new ImportSubResult(new pr(_UrlKt.FRAGMENT_ENCODE_SET, null, null), false, null);
    private final q23 errorStatusCode;
    private final boolean isSubUpdateRequired;
    private final pr networkResponse;

    public ImportSubResult(pr prVar, boolean z, q23 q23Var) {
        this.networkResponse = prVar;
        this.isSubUpdateRequired = z;
        this.errorStatusCode = q23Var;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final q23 getErrorStatusCode() {
        return this.errorStatusCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final pr getNetworkResponse() {
        return this.networkResponse;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsSubUpdateRequired() {
        return this.isSubUpdateRequired;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportSubResult)) {
            return false;
        }
        ImportSubResult importSubResult = (ImportSubResult) obj;
        return dh3.f(this.networkResponse, importSubResult.networkResponse) && this.isSubUpdateRequired == importSubResult.isSubUpdateRequired && this.errorStatusCode == importSubResult.errorStatusCode;
    }

    public final int hashCode() {
        int iF = pc6.f(this.networkResponse.hashCode() * 31, 31, this.isSubUpdateRequired);
        q23 q23Var = this.errorStatusCode;
        return iF + (q23Var == null ? 0 : q23Var.hashCode());
    }

    public final String toString() {
        return "ImportSubResult(networkResponse=" + this.networkResponse + ", isSubUpdateRequired=" + this.isSubUpdateRequired + ", errorStatusCode=" + this.errorStatusCode + ")";
    }
}
