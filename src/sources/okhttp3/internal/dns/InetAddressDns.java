package okhttp3.internal.dns;

import defpackage.eu;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Dns;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lokhttp3/internal/dns/InetAddressDns;", "Lokhttp3/Dns;", "<init>", "()V", "lookup", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/net/InetAddress;", "hostname", _UrlKt.FRAGMENT_ENCODE_SET, "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InetAddressDns implements Dns {
    public static final InetAddressDns INSTANCE = new InetAddressDns();

    private InetAddressDns() {
    }

    @Override // okhttp3.Dns
    public List<InetAddress> lookup(String hostname) throws UnknownHostException {
        hostname.getClass();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostname);
            allByName.getClass();
            return eu.K0(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostname));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }
}
