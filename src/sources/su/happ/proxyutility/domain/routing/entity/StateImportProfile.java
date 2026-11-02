package su.happ.proxyutility.domain.routing.entity;

import defpackage.dh3;
import defpackage.p61;
import defpackage.pc6;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lsu/happ/proxyutility/domain/routing/entity/StateImportProfile;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "data", "Ljava/lang/String;", "b", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "activateInEnd", "Z", "a", "()Z", "enableRouting", "c", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class StateImportProfile {
    public static final int $stable = 0;
    private final boolean activateInEnd;
    private final String data;
    private final boolean enableRouting;

    public StateImportProfile(String str, boolean z, boolean z2) {
        this.data = str;
        this.activateInEnd = z;
        this.enableRouting = z2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getActivateInEnd() {
        return this.activateInEnd;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getEnableRouting() {
        return this.enableRouting;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StateImportProfile)) {
            return false;
        }
        StateImportProfile stateImportProfile = (StateImportProfile) obj;
        return dh3.f(this.data, stateImportProfile.data) && this.activateInEnd == stateImportProfile.activateInEnd && this.enableRouting == stateImportProfile.enableRouting;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.enableRouting) + pc6.f(this.data.hashCode() * 31, 31, this.activateInEnd);
    }

    public final String toString() {
        String str = this.data;
        boolean z = this.activateInEnd;
        boolean z2 = this.enableRouting;
        StringBuilder sb = new StringBuilder("StateImportProfile(data=");
        sb.append(str);
        sb.append(", activateInEnd=");
        sb.append(z);
        sb.append(", enableRouting=");
        return p61.o(sb, z2, ")");
    }
}
