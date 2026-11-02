package okhttp3.internal.connection;

import defpackage.ge1;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lokhttp3/internal/connection/AddressPolicy;", _UrlKt.FRAGMENT_ENCODE_SET, "minimumConcurrentCalls", _UrlKt.FRAGMENT_ENCODE_SET, "backoffDelayMillis", _UrlKt.FRAGMENT_ENCODE_SET, "backoffJitterMillis", "<init>", "(IJI)V", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddressPolicy {
    public final long backoffDelayMillis;
    public final int backoffJitterMillis;
    public final int minimumConcurrentCalls;

    public /* synthetic */ AddressPolicy(int i, long j, int i2, int i3, ge1 ge1Var) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS : j, (i3 & 4) != 0 ? 100 : i2);
    }

    public AddressPolicy(int i, long j, int i2) {
        this.minimumConcurrentCalls = i;
        this.backoffDelayMillis = j;
        this.backoffJitterMillis = i2;
    }

    public AddressPolicy() {
        this(0, 0L, 0, 7, null);
    }
}
