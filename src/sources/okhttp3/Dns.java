package okhttp3;

import defpackage.bt;
import defpackage.d02;
import defpackage.dh3;
import defpackage.ge1;
import defpackage.h80;
import defpackage.kb0;
import defpackage.p61;
import defpackage.pc6;
import defpackage.wv0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.dns.LookupDnsCall;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bæ\u0080\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0005\u000b\f\r\u000e\u000fJ\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lokhttp3/Dns;", _UrlKt.FRAGMENT_ENCODE_SET, "lookup", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/net/InetAddress;", "hostname", _UrlKt.FRAGMENT_ENCODE_SET, "newCall", "Lokhttp3/Dns$Call;", "request", "Lokhttp3/Dns$Request;", "Call", "Callback", "Request", "Record", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Dns {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final Dns SYSTEM = new Dns() { // from class: okhttp3.Dns$Companion$SYSTEM$1
        @Override // okhttp3.Dns
        public List<InetAddress> lookup(String hostname) {
            hostname.getClass();
            return Platform.INSTANCE.get().getSystemDns().lookup(hostname);
        }

        @Override // okhttp3.Dns
        public Dns.Call newCall(Dns.Request request) {
            request.getClass();
            return Platform.INSTANCE.get().getSystemDns().newCall(request);
        }

        public String toString() {
            return "Dns.SYSTEM";
        }
    };

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lokhttp3/Dns$Call;", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Dns$Callback;", "callback", "Ldn8;", "enqueue", "(Lokhttp3/Dns$Callback;)V", "cancel", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "isCanceled", "()Z", "Lokhttp3/Dns$Request;", "getRequest", "()Lokhttp3/Dns$Request;", "request", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Call {
        void cancel();

        void enqueue(Callback callback);

        Request getRequest();

        boolean isCanceled();
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lokhttp3/Dns$Callback;", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Dns$Call;", "call", _UrlKt.FRAGMENT_ENCODE_SET, "last", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Dns$Record;", "records", "Ldn8;", "onRecords", "(Lokhttp3/Dns$Call;ZLjava/util/List;)V", "Ljava/io/IOException;", "e", "onFailure", "(Lokhttp3/Dns$Call;Ljava/io/IOException;)V", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Callback {
        void onFailure(Call call, IOException e);

        void onRecords(Call call, boolean last, List<? extends Record> records);
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/Dns$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "SYSTEM", "Lokhttp3/Dns;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    List<InetAddress> lookup(String hostname) throws UnknownHostException;

    default Call newCall(Request request) {
        request.getClass();
        return new LookupDnsCall(TaskRunner.INSTANCE, this, request);
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lokhttp3/Dns$Record;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "hostname", _UrlKt.FRAGMENT_ENCODE_SET, "getHostname", "()Ljava/lang/String;", "IpAddress", "ServiceMetadata", "Lokhttp3/Dns$Record$IpAddress;", "Lokhttp3/Dns$Record$ServiceMetadata;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Record {

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\t¨\u0006\u0011"}, d2 = {"Lokhttp3/Dns$Record$IpAddress;", "Lokhttp3/Dns$Record;", "hostname", _UrlKt.FRAGMENT_ENCODE_SET, "address", "Ljava/net/InetAddress;", "<init>", "(Ljava/lang/String;Ljava/net/InetAddress;)V", "()Ljava/net/InetAddress;", "()Ljava/lang/String;", "equals", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class IpAddress extends Record {
            private final InetAddress address;
            private final String hostname;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IpAddress(String str, InetAddress inetAddress) {
                super(null);
                str.getClass();
                inetAddress.getClass();
                this.address = inetAddress;
                String canonicalHost = _HostnamesCommonKt.toCanonicalHost(str);
                if (canonicalHost != null) {
                    this.hostname = canonicalHost;
                } else {
                    bt.q("unexpected hostname: ".concat(str));
                    throw null;
                }
            }

            /* JADX INFO: renamed from: address, reason: from getter */
            public final InetAddress getAddress() {
                return this.address;
            }

            public boolean equals(Object other) {
                if (!(other instanceof IpAddress)) {
                    return false;
                }
                IpAddress ipAddress = (IpAddress) other;
                return dh3.f(ipAddress.getHostname(), getHostname()) && dh3.f(ipAddress.address, this.address);
            }

            public int hashCode() {
                return this.address.hashCode() + (getHostname().hashCode() * 31);
            }

            @Override // okhttp3.Dns.Record
            /* JADX INFO: renamed from: hostname, reason: from getter */
            public String getHostname() {
                return this.hostname;
            }

            public String toString() {
                return getHostname() + '/' + this.address.getHostAddress();
            }
        }

        public /* synthetic */ Record(ge1 ge1Var) {
            this();
        }

        public abstract String getHostname();

        private Record() {
        }

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\f\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u0003\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\b\u0010\u0015R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u0006\u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0007¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\n\u0010\u001d¨\u0006\u001e"}, d2 = {"Lokhttp3/Dns$Record$ServiceMetadata;", "Lokhttp3/Dns$Record;", _UrlKt.FRAGMENT_ENCODE_SET, "hostname", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Protocol;", "alpnIds", _UrlKt.FRAGMENT_ENCODE_SET, "port", "Ljava/net/InetAddress;", "ipAddressHints", "Lkb0;", "echConfigList", "<init>", "(Ljava/lang/String;Ljava/util/List;ILjava/util/List;Lkb0;)V", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkb0;", "()Lkb0;", "Ljava/lang/String;", "I", "Ljava/util/List;", "()Ljava/util/List;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ServiceMetadata extends Record {
            private final List<Protocol> alpnIds;
            private final kb0 echConfigList;
            private final String hostname;
            private final List<InetAddress> ipAddressHints;
            private final int port;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ServiceMetadata(String str, List<? extends Protocol> list, int i, List<? extends InetAddress> list2, kb0 kb0Var) {
                super(0 == true ? 1 : 0);
                str.getClass();
                list2.getClass();
                this.echConfigList = kb0Var;
                String canonicalHost = _HostnamesCommonKt.toCanonicalHost(str);
                if (canonicalHost == null) {
                    bt.q("unexpected hostname: ".concat(str));
                    throw null;
                }
                this.hostname = canonicalHost;
                if (i == -1) {
                    i = XRayConfig.DEFAULT_PORT;
                } else if (1 > i || i >= 65536) {
                    bt.q(pc6.j(i, "unexpected port: "));
                    throw null;
                }
                this.port = i;
                this.alpnIds = list != null ? wv0.Y0(list) : null;
                this.ipAddressHints = wv0.Y0(list2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CharSequence toString$lambda$0$0(InetAddress inetAddress) {
                inetAddress.getClass();
                String hostAddress = inetAddress.getHostAddress();
                hostAddress.getClass();
                return hostAddress;
            }

            public final List<Protocol> alpnIds() {
                return this.alpnIds;
            }

            /* JADX INFO: renamed from: echConfigList, reason: from getter */
            public final kb0 getEchConfigList() {
                return this.echConfigList;
            }

            public boolean equals(Object other) {
                if (!(other instanceof ServiceMetadata)) {
                    return false;
                }
                ServiceMetadata serviceMetadata = (ServiceMetadata) other;
                return dh3.f(serviceMetadata.getHostname(), getHostname()) && dh3.f(serviceMetadata.alpnIds, this.alpnIds) && serviceMetadata.port == this.port && dh3.f(serviceMetadata.ipAddressHints, this.ipAddressHints) && dh3.f(serviceMetadata.echConfigList, this.echConfigList);
            }

            public int hashCode() {
                int iHashCode = (getHostname().hashCode() + 527) * 31;
                List<Protocol> list = this.alpnIds;
                int iF = p61.f((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.port) * 31, 31, this.ipAddressHints);
                kb0 kb0Var = this.echConfigList;
                return iF + (kb0Var != null ? kb0Var.hashCode() : 0);
            }

            @Override // okhttp3.Dns.Record
            /* JADX INFO: renamed from: hostname, reason: from getter */
            public String getHostname() {
                return this.hostname;
            }

            public final List<InetAddress> ipAddressHints() {
                return this.ipAddressHints;
            }

            /* JADX INFO: renamed from: port, reason: from getter */
            public final int getPort() {
                return this.port;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder(32);
                sb.append("ServiceMetadata{");
                sb.append(getHostname());
                if (this.alpnIds != null) {
                    sb.append(", alpnIds=");
                    sb.append(this.alpnIds);
                }
                if (this.port != 443) {
                    sb.append(", port=");
                    sb.append(this.port);
                }
                if (!this.ipAddressHints.isEmpty()) {
                    sb.append(", ipAddressHints=[");
                    sb.append(wv0.y0(this.ipAddressHints, null, null, null, new h80((byte) 15), 31));
                    sb.append("]");
                }
                if (this.echConfigList != null) {
                    sb.append(", echConfigList=");
                    sb.append(this.echConfigList.f());
                }
                sb.append("}");
                return sb.toString();
            }

            public /* synthetic */ ServiceMetadata(String str, List list, int i, List list2, kb0 kb0Var, int i2, ge1 ge1Var) {
                this(str, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? d02.X : list2, (i2 & 16) != 0 ? null : kb0Var);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u000f"}, d2 = {"Lokhttp3/Dns$Request;", _UrlKt.FRAGMENT_ENCODE_SET, "hostname", _UrlKt.FRAGMENT_ENCODE_SET, "port", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "(Ljava/lang/String;I)V", "()Ljava/lang/String;", "()I", "equals", _UrlKt.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Request {
        private final String hostname;
        private final int port;

        public Request(String str, int i) {
            str.getClass();
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(str);
            if (canonicalHost == null) {
                bt.q("unexpected hostname: ".concat(str));
                throw null;
            }
            this.hostname = canonicalHost;
            if (i == -1) {
                i = XRayConfig.DEFAULT_PORT;
            } else if (1 > i || i >= 65536) {
                bt.q(pc6.j(i, "unexpected port: "));
                throw null;
            }
            this.port = i;
        }

        public boolean equals(Object other) {
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return dh3.f(request.hostname, this.hostname) && request.port == this.port;
        }

        public int hashCode() {
            return (this.hostname.hashCode() * 31) + this.port;
        }

        /* JADX INFO: renamed from: hostname, reason: from getter */
        public final String getHostname() {
            return this.hostname;
        }

        /* JADX INFO: renamed from: port, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        public String toString() {
            int i = this.port;
            String str = this.hostname;
            if (i == 443) {
                return str;
            }
            return str + ':' + this.port;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(String str) {
            this(str, 0, 2, null);
            str.getClass();
        }

        public /* synthetic */ Request(String str, int i, int i2, ge1 ge1Var) {
            this(str, (i2 & 2) != 0 ? -1 : i);
        }
    }
}
