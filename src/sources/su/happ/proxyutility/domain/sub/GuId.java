package su.happ.proxyutility.domain.sub;

import defpackage.dh3;
import defpackage.wu2;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00072\u00020\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\t"}, d2 = {"Lsu/happ/proxyutility/domain/sub/GuId;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "wu2", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class GuId {
    public static final wu2 Companion = new wu2();
    private static final String EMPTY = "";
    private final String value;

    public /* synthetic */ GuId(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final /* synthetic */ String getValue() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GuId) && dh3.f(this.value, ((GuId) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return this.value;
    }
}
