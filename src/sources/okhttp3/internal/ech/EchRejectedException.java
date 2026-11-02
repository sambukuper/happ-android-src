package okhttp3.internal.ech;

import defpackage.kb0;
import javax.net.ssl.SSLException;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/ech/EchRejectedException;", "Ljavax/net/ssl/SSLException;", _UrlKt.FRAGMENT_ENCODE_SET, "publicName", "Lkb0;", "nextEchConfigList", "<init>", "(Ljava/lang/String;Lkb0;)V", "Ljava/lang/String;", "getPublicName", "()Ljava/lang/String;", "Lkb0;", "getNextEchConfigList", "()Lkb0;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EchRejectedException extends SSLException {
    private final kb0 nextEchConfigList;
    private final String publicName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EchRejectedException(String str, kb0 kb0Var) {
        super("Encrypted Client Hello (ECH) rejected");
        str.getClass();
        this.publicName = str;
        this.nextEchConfigList = kb0Var;
    }

    public final kb0 getNextEchConfigList() {
        return this.nextEchConfigList;
    }

    public final String getPublicName() {
        return this.publicName;
    }
}
