package okhttp3.dnsoverhttps;

import defpackage.dh3;
import defpackage.p61;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Dns;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lokhttp3/dnsoverhttps/BootstrapDns;", "Lokhttp3/Dns;", "dnsHostname", _UrlKt.FRAGMENT_ENCODE_SET, "dnsServers", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/net/InetAddress;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "lookup", "hostname", "okhttp-dnsoverhttps"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BootstrapDns implements Dns {
    private final String dnsHostname;
    private final List<InetAddress> dnsServers;

    /* JADX WARN: Multi-variable type inference failed */
    public BootstrapDns(String str, List<? extends InetAddress> list) {
        str.getClass();
        list.getClass();
        this.dnsHostname = str;
        this.dnsServers = list;
    }

    @Override // okhttp3.Dns
    public List<InetAddress> lookup(String hostname) throws UnknownHostException {
        hostname.getClass();
        if (dh3.f(this.dnsHostname, hostname)) {
            return this.dnsServers;
        }
        StringBuilder sbP = p61.p("BootstrapDns called for ", hostname, " instead of ");
        sbP.append(this.dnsHostname);
        throw new UnknownHostException(sbP.toString());
    }
}
