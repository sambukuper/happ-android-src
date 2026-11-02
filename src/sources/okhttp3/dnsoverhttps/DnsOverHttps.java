package okhttp3.dnsoverhttps;

import defpackage.b61;
import defpackage.bt;
import defpackage.eu;
import defpackage.ge1;
import defpackage.xv0;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Dns;
import okhttp3.DnsCache;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.dnsoverhttps.internal.DnsOverHttpsQuery;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.dns.DnsQuery;
import okhttp3.internal.dns.StateMachineDnsCall;
import okhttp3.internal.dns._ExecuteDnsKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u0001:\u0002!\"BQ\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0013\u0010\n\u001a\u00020\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0013\u0010\f\u001a\u00020\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0015R\u0013\u0010\r\u001a\u00020\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0015R\u0013\u0010\u000e\u001a\u00020\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0015R\u0013\u0010\u000f\u001a\u00020\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lokhttp3/dnsoverhttps/DnsOverHttps;", "Lokhttp3/Dns;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "client", "Lokhttp3/OkHttpClient;", "url", "Lokhttp3/HttpUrl;", "cache", "Lokhttp3/DnsCache;", "includeIPv6", _UrlKt.FRAGMENT_ENCODE_SET, "includeServiceMetadata", "post", "resolvePrivateAddresses", "resolvePublicAddresses", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/OkHttpClient;Lokhttp3/HttpUrl;Lokhttp3/DnsCache;ZZZZZ)V", "()Lokhttp3/OkHttpClient;", "()Lokhttp3/HttpUrl;", "()Lokhttp3/DnsCache;", "()Z", "queryFactory", "Lokhttp3/internal/dns/DnsQuery$Factory;", "newCall", "Lokhttp3/Dns$Call;", "request", "Lokhttp3/Dns$Request;", "lookup", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/net/InetAddress;", "hostname", _UrlKt.FRAGMENT_ENCODE_SET, "Builder", "Companion", "okhttp-dnsoverhttps"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DnsOverHttps implements Dns {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final MediaType DNS_MESSAGE = MediaType.INSTANCE.get("application/dns-message");
    public static final int MAX_RESPONSE_SIZE = 65536;
    private final DnsCache cache;
    private final OkHttpClient client;
    private final boolean includeIPv6;
    private final boolean includeServiceMetadata;
    private final boolean post;
    private final DnsQuery.Factory queryFactory;
    private final boolean resolvePrivateAddresses;
    private final boolean resolvePublicAddresses;
    private final TaskRunner taskRunner;
    private final HttpUrl url;

    public DnsOverHttps(TaskRunner taskRunner, OkHttpClient okHttpClient, HttpUrl httpUrl, DnsCache dnsCache, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        taskRunner.getClass();
        okHttpClient.getClass();
        httpUrl.getClass();
        dnsCache.getClass();
        this.taskRunner = taskRunner;
        this.client = okHttpClient;
        this.url = httpUrl;
        this.cache = dnsCache;
        this.includeIPv6 = z;
        this.includeServiceMetadata = z2;
        this.post = z3;
        this.resolvePrivateAddresses = z4;
        this.resolvePublicAddresses = z5;
        this.queryFactory = dnsCache.-delegate.wrap(new DnsOverHttpsQuery.Factory(taskRunner, z4, z5, okHttpClient, httpUrl, z3));
    }

    /* JADX INFO: renamed from: cache, reason: from getter */
    public final DnsCache getCache() {
        return this.cache;
    }

    /* JADX INFO: renamed from: client, reason: from getter */
    public final OkHttpClient getClient() {
        return this.client;
    }

    /* JADX INFO: renamed from: includeIPv6, reason: from getter */
    public final boolean getIncludeIPv6() {
        return this.includeIPv6;
    }

    /* JADX INFO: renamed from: includeServiceMetadata, reason: from getter */
    public final boolean getIncludeServiceMetadata() {
        return this.includeServiceMetadata;
    }

    @Override // okhttp3.Dns
    public List<InetAddress> lookup(String hostname) throws UnknownHostException {
        hostname.getClass();
        List<Dns.Record> listExecute = _ExecuteDnsKt.execute(new DnsOverHttps(this.taskRunner, this.client, this.url, this.cache, this.includeIPv6, false, this.post, this.resolvePrivateAddresses, this.resolvePublicAddresses).newCall(new Dns.Request(hostname, 0, 2, null)));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listExecute) {
            if (obj instanceof Dns.Record.IpAddress) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Dns.Record.IpAddress) it.next()).getAddress());
        }
        return arrayList2;
    }

    @Override // okhttp3.Dns
    public Dns.Call newCall(Dns.Request request) {
        request.getClass();
        return new StateMachineDnsCall(this.taskRunner, request, this.queryFactory, this.includeIPv6, this.includeServiceMetadata);
    }

    /* JADX INFO: renamed from: post, reason: from getter */
    public final boolean getPost() {
        return this.post;
    }

    /* JADX INFO: renamed from: resolvePrivateAddresses, reason: from getter */
    public final boolean getResolvePrivateAddresses() {
        return this.resolvePrivateAddresses;
    }

    /* JADX INFO: renamed from: resolvePublicAddresses, reason: from getter */
    public final boolean getResolvePublicAddresses() {
        return this.resolvePublicAddresses;
    }

    /* JADX INFO: renamed from: url, reason: from getter */
    public final HttpUrl getUrl() {
        return this.url;
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lokhttp3/dnsoverhttps/DnsOverHttps$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "DNS_MESSAGE", "Lokhttp3/MediaType;", "getDNS_MESSAGE", "()Lokhttp3/MediaType;", "MAX_RESPONSE_SIZE", _UrlKt.FRAGMENT_ENCODE_SET, "buildBootstrapClient", "Lokhttp3/Dns;", "builder", "Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;", "isPrivateHost", _UrlKt.FRAGMENT_ENCODE_SET, MetaParams.HOST, _UrlKt.FRAGMENT_ENCODE_SET, "isPrivateHost$okhttp_dnsoverhttps", "okhttp-dnsoverhttps"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(ge1 ge1Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Dns buildBootstrapClient(Builder builder) {
            List<InetAddress> bootstrapDnsHosts$okhttp_dnsoverhttps = builder.getBootstrapDnsHosts$okhttp_dnsoverhttps();
            if (bootstrapDnsHosts$okhttp_dnsoverhttps == null) {
                return builder.getSystemDns();
            }
            HttpUrl url = builder.getUrl();
            url.getClass();
            return new BootstrapDns(url.host(), bootstrapDnsHosts$okhttp_dnsoverhttps);
        }

        public final MediaType getDNS_MESSAGE() {
            return DnsOverHttps.DNS_MESSAGE;
        }

        public final boolean isPrivateHost$okhttp_dnsoverhttps(String host) {
            host.getClass();
            return PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(host) == null;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u00109\u001a\u00020:J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001bJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u001bJ\u000e\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u001bJ\u000e\u00106\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u001bJ\u0016\u0010,\u001a\u00020\u00002\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-J\u001f\u0010,\u001a\u00020\u00002\u0012\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020.0;\"\u00020.¢\u0006\u0002\u0010<J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001a\u0010#\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u001a\u0010&\u001a\u00020'X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010,\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001fR\u001a\u00106\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001d\"\u0004\b8\u0010\u001f¨\u0006="}, d2 = {"Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp_dnsoverhttps", "()Lokhttp3/internal/concurrent/TaskRunner;", "client", "Lokhttp3/OkHttpClient;", "getClient$okhttp_dnsoverhttps", "()Lokhttp3/OkHttpClient;", "setClient$okhttp_dnsoverhttps", "(Lokhttp3/OkHttpClient;)V", "url", "Lokhttp3/HttpUrl;", "getUrl$okhttp_dnsoverhttps", "()Lokhttp3/HttpUrl;", "setUrl$okhttp_dnsoverhttps", "(Lokhttp3/HttpUrl;)V", "cache", "Lokhttp3/DnsCache;", "getCache$okhttp_dnsoverhttps", "()Lokhttp3/DnsCache;", "setCache$okhttp_dnsoverhttps", "(Lokhttp3/DnsCache;)V", "includeIPv6", _UrlKt.FRAGMENT_ENCODE_SET, "getIncludeIPv6$okhttp_dnsoverhttps", "()Z", "setIncludeIPv6$okhttp_dnsoverhttps", "(Z)V", "includeServiceMetadata", "getIncludeServiceMetadata$okhttp_dnsoverhttps", "setIncludeServiceMetadata$okhttp_dnsoverhttps", "post", "getPost$okhttp_dnsoverhttps", "setPost$okhttp_dnsoverhttps", "systemDns", "Lokhttp3/Dns;", "getSystemDns$okhttp_dnsoverhttps", "()Lokhttp3/Dns;", "setSystemDns$okhttp_dnsoverhttps", "(Lokhttp3/Dns;)V", "bootstrapDnsHosts", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/net/InetAddress;", "getBootstrapDnsHosts$okhttp_dnsoverhttps", "()Ljava/util/List;", "setBootstrapDnsHosts$okhttp_dnsoverhttps", "(Ljava/util/List;)V", "resolvePrivateAddresses", "getResolvePrivateAddresses$okhttp_dnsoverhttps", "setResolvePrivateAddresses$okhttp_dnsoverhttps", "resolvePublicAddresses", "getResolvePublicAddresses$okhttp_dnsoverhttps", "setResolvePublicAddresses$okhttp_dnsoverhttps", "build", "Lokhttp3/dnsoverhttps/DnsOverHttps;", _UrlKt.FRAGMENT_ENCODE_SET, "([Ljava/net/InetAddress;)Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;", "okhttp-dnsoverhttps"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        private List<? extends InetAddress> bootstrapDnsHosts;
        private OkHttpClient client;
        private boolean post;
        private boolean resolvePrivateAddresses;
        private HttpUrl url;
        private final TaskRunner taskRunner = TaskRunner.INSTANCE;
        private DnsCache cache = new DnsCache(0, 0, 0, 0, 0, 31, null);
        private boolean includeIPv6 = true;
        private boolean includeServiceMetadata = true;
        private Dns systemDns = Dns.SYSTEM;
        private boolean resolvePublicAddresses = true;

        public final Builder bootstrapDnsHosts(InetAddress... bootstrapDnsHosts) {
            bootstrapDnsHosts.getClass();
            return bootstrapDnsHosts(eu.K0(bootstrapDnsHosts));
        }

        public final DnsOverHttps build() {
            OkHttpClient okHttpClient = this.client;
            if (okHttpClient == null) {
                b61.i("client not set");
                return null;
            }
            TaskRunner taskRunner = this.taskRunner;
            OkHttpClient okHttpClientBuild = okHttpClient.newBuilder().dns(DnsOverHttps.INSTANCE.buildBootstrapClient(this)).build();
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new DnsOverHttps(taskRunner, okHttpClientBuild, httpUrl, this.cache, this.includeIPv6, this.includeServiceMetadata, this.post, this.resolvePrivateAddresses, this.resolvePublicAddresses);
            }
            bt.i("url not set");
            return null;
        }

        public final Builder cache(DnsCache cache) {
            cache.getClass();
            this.cache = cache;
            return this;
        }

        public final Builder client(OkHttpClient client) {
            client.getClass();
            this.client = client;
            return this;
        }

        public final List<InetAddress> getBootstrapDnsHosts$okhttp_dnsoverhttps() {
            return this.bootstrapDnsHosts;
        }

        /* JADX INFO: renamed from: getCache$okhttp_dnsoverhttps, reason: from getter */
        public final DnsCache getCache() {
            return this.cache;
        }

        /* JADX INFO: renamed from: getClient$okhttp_dnsoverhttps, reason: from getter */
        public final OkHttpClient getClient() {
            return this.client;
        }

        /* JADX INFO: renamed from: getIncludeIPv6$okhttp_dnsoverhttps, reason: from getter */
        public final boolean getIncludeIPv6() {
            return this.includeIPv6;
        }

        /* JADX INFO: renamed from: getIncludeServiceMetadata$okhttp_dnsoverhttps, reason: from getter */
        public final boolean getIncludeServiceMetadata() {
            return this.includeServiceMetadata;
        }

        /* JADX INFO: renamed from: getPost$okhttp_dnsoverhttps, reason: from getter */
        public final boolean getPost() {
            return this.post;
        }

        /* JADX INFO: renamed from: getResolvePrivateAddresses$okhttp_dnsoverhttps, reason: from getter */
        public final boolean getResolvePrivateAddresses() {
            return this.resolvePrivateAddresses;
        }

        /* JADX INFO: renamed from: getResolvePublicAddresses$okhttp_dnsoverhttps, reason: from getter */
        public final boolean getResolvePublicAddresses() {
            return this.resolvePublicAddresses;
        }

        /* JADX INFO: renamed from: getSystemDns$okhttp_dnsoverhttps, reason: from getter */
        public final Dns getSystemDns() {
            return this.systemDns;
        }

        /* JADX INFO: renamed from: getTaskRunner$okhttp_dnsoverhttps, reason: from getter */
        public final TaskRunner getTaskRunner() {
            return this.taskRunner;
        }

        /* JADX INFO: renamed from: getUrl$okhttp_dnsoverhttps, reason: from getter */
        public final HttpUrl getUrl() {
            return this.url;
        }

        public final Builder includeIPv6(boolean includeIPv6) {
            this.includeIPv6 = includeIPv6;
            return this;
        }

        public final Builder includeServiceMetadata(boolean includeServiceMetadata) {
            this.includeServiceMetadata = includeServiceMetadata;
            return this;
        }

        public final Builder post(boolean post) {
            this.post = post;
            return this;
        }

        public final Builder resolvePrivateAddresses(boolean resolvePrivateAddresses) {
            this.resolvePrivateAddresses = resolvePrivateAddresses;
            return this;
        }

        public final Builder resolvePublicAddresses(boolean resolvePublicAddresses) {
            this.resolvePublicAddresses = resolvePublicAddresses;
            return this;
        }

        public final void setBootstrapDnsHosts$okhttp_dnsoverhttps(List<? extends InetAddress> list) {
            this.bootstrapDnsHosts = list;
        }

        public final void setCache$okhttp_dnsoverhttps(DnsCache dnsCache) {
            dnsCache.getClass();
            this.cache = dnsCache;
        }

        public final void setClient$okhttp_dnsoverhttps(OkHttpClient okHttpClient) {
            this.client = okHttpClient;
        }

        public final void setIncludeIPv6$okhttp_dnsoverhttps(boolean z) {
            this.includeIPv6 = z;
        }

        public final void setIncludeServiceMetadata$okhttp_dnsoverhttps(boolean z) {
            this.includeServiceMetadata = z;
        }

        public final void setPost$okhttp_dnsoverhttps(boolean z) {
            this.post = z;
        }

        public final void setResolvePrivateAddresses$okhttp_dnsoverhttps(boolean z) {
            this.resolvePrivateAddresses = z;
        }

        public final void setResolvePublicAddresses$okhttp_dnsoverhttps(boolean z) {
            this.resolvePublicAddresses = z;
        }

        public final void setSystemDns$okhttp_dnsoverhttps(Dns dns) {
            dns.getClass();
            this.systemDns = dns;
        }

        public final void setUrl$okhttp_dnsoverhttps(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        public final Builder systemDns(Dns systemDns) {
            systemDns.getClass();
            this.systemDns = systemDns;
            return this;
        }

        public final Builder url(HttpUrl url) {
            url.getClass();
            this.url = url;
            return this;
        }

        public final Builder bootstrapDnsHosts(List<? extends InetAddress> bootstrapDnsHosts) {
            this.bootstrapDnsHosts = bootstrapDnsHosts;
            return this;
        }
    }
}
