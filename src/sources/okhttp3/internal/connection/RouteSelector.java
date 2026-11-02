package okhttp3.internal.connection;

import defpackage.aq4;
import defpackage.bt;
import defpackage.bw0;
import defpackage.d02;
import defpackage.ge1;
import defpackage.i21;
import defpackage.kb0;
import defpackage.xv0;
import defpackage.xw3;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Address;
import okhttp3.Dns;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.dns.LookupDnsCall;
import okhttp3.internal.dns._ExecuteDnsKt;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\u00020\u0001:\u00020/B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b!\u0010\u0014J\u0010\u0010#\u001a\u00020\"H\u0086\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00160-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010*¨\u00061"}, d2 = {"Lokhttp3/internal/connection/RouteSelector;", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Address;", "address", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RealCall;", "call", _UrlKt.FRAGMENT_ENCODE_SET, "fastFallback", "<init>", "(Lokhttp3/Address;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/internal/connection/RealCall;Z)V", "Lokhttp3/HttpUrl;", "url", "Ljava/net/Proxy;", "proxy", "Ldn8;", "resetNextProxy", "(Lokhttp3/HttpUrl;Ljava/net/Proxy;)V", "hasNextProxy", "()Z", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Route;", "nextProxy", "()Ljava/util/List;", "nextRoutes", "(Ljava/net/Proxy;)Ljava/util/List;", _UrlKt.FRAGMENT_ENCODE_SET, "socketHost", _UrlKt.FRAGMENT_ENCODE_SET, "socketPort", "dnsLookup", "(Ljava/net/Proxy;Ljava/lang/String;I)Ljava/util/List;", "hasNext", "Lokhttp3/internal/connection/RouteSelector$Selection;", "next", "()Lokhttp3/internal/connection/RouteSelector$Selection;", "Lokhttp3/Address;", "Lokhttp3/internal/connection/RouteDatabase;", "Lokhttp3/internal/connection/RealCall;", "Z", "proxies", "Ljava/util/List;", "nextProxyIndex", "I", _UrlKt.FRAGMENT_ENCODE_SET, "postponedRoutes", "Companion", "Selection", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RouteSelector {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Address address;
    private final RealCall call;
    private final boolean fastFallback;
    private int nextProxyIndex;
    private final List<Route> postponedRoutes;
    private List<? extends Proxy> proxies;
    private final RouteDatabase routeDatabase;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000b\u001a\u00020\fH\u0086\u0002J\t\u0010\r\u001a\u00020\u0004H\u0086\u0002R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Selection;", _UrlKt.FRAGMENT_ENCODE_SET, "routes", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Route;", "<init>", "(Ljava/util/List;)V", "getRoutes", "()Ljava/util/List;", "nextRouteIndex", _UrlKt.FRAGMENT_ENCODE_SET, "hasNext", _UrlKt.FRAGMENT_ENCODE_SET, "next", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Selection {
        private int nextRouteIndex;
        private final List<Route> routes;

        public Selection(List<Route> list) {
            list.getClass();
            this.routes = list;
        }

        public final List<Route> getRoutes() {
            return this.routes;
        }

        public final boolean hasNext() {
            return this.nextRouteIndex < this.routes.size();
        }

        public final Route next() {
            if (!hasNext()) {
                bt.n();
                return null;
            }
            List<Route> list = this.routes;
            int i = this.nextRouteIndex;
            this.nextRouteIndex = i + 1;
            return list.get(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, RealCall realCall, boolean z) {
        address.getClass();
        routeDatabase.getClass();
        realCall.getClass();
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = realCall;
        this.fastFallback = z;
        this.proxies = d02.X;
        this.postponedRoutes = new ArrayList();
        resetNextProxy(address.url(), address.proxy());
    }

    private final List<Route> dnsLookup(Proxy proxy, String socketHost, int socketPort) throws UnknownHostException {
        ArrayList arrayList;
        this.call.getEventListener().dnsStart(this.call, socketHost);
        Dns.Call callNewCall = this.address.dns().newCall(new Dns.Request(socketHost, (this.address.url().isHttps() || socketPort != 80) ? socketPort : -1));
        if (callNewCall instanceof LookupDnsCall) {
            List<InetAddress> listLookup = this.address.dns().lookup(socketHost);
            arrayList = new ArrayList(xv0.Z(listLookup, 10));
            Iterator<T> it = listLookup.iterator();
            while (it.hasNext()) {
                arrayList.add(new Route(this.address, proxy, new InetSocketAddress((InetAddress) it.next(), socketPort)));
            }
        } else {
            List<Dns.Record> listExecute = _ExecuteDnsKt.execute(callNewCall);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listExecute) {
                if (obj instanceof Dns.Record.ServiceMetadata) {
                    arrayList2.add(obj);
                }
            }
            int iG = aq4.G(xv0.Z(arrayList2, 10));
            if (iG < 16) {
                iG = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
            for (Object obj2 : arrayList2) {
                linkedHashMap.put(((Dns.Record.ServiceMetadata) obj2).getHostname(), obj2);
            }
            ArrayList<Dns.Record.IpAddress> arrayList3 = new ArrayList();
            for (Object obj3 : listExecute) {
                if (obj3 instanceof Dns.Record.IpAddress) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(xv0.Z(arrayList3, 10));
            for (Dns.Record.IpAddress ipAddress : arrayList3) {
                Dns.Record.ServiceMetadata serviceMetadata = (Dns.Record.ServiceMetadata) linkedHashMap.get(ipAddress.getHostname());
                Address address = this.address;
                InetSocketAddress inetSocketAddress = new InetSocketAddress(ipAddress.getAddress(), socketPort);
                Proxy.Type type = proxy.type();
                kb0 echConfigList = null;
                if ((type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) == 1 && serviceMetadata != null) {
                    echConfigList = serviceMetadata.getEchConfigList();
                }
                arrayList4.add(new Route(address, proxy, inetSocketAddress, echConfigList));
            }
            arrayList = arrayList4;
        }
        if (arrayList.isEmpty()) {
            throw new UnknownHostException(this.address.dns() + " returned no addresses for " + socketHost);
        }
        EventListener eventListener = this.call.getEventListener();
        RealCall realCall = this.call;
        ArrayList arrayList5 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList5.add(((Route) it2.next()).socketAddress().getAddress());
        }
        eventListener.dnsEnd(realCall, socketHost, arrayList5);
        return arrayList;
    }

    private final boolean hasNextProxy() {
        return this.nextProxyIndex < this.proxies.size();
    }

    private final List<Route> nextProxy() throws IOException {
        if (hasNextProxy()) {
            List<? extends Proxy> list = this.proxies;
            int i = this.nextProxyIndex;
            this.nextProxyIndex = i + 1;
            return nextRoutes(list.get(i));
        }
        throw new SocketException("No route to " + this.address.url().host() + "; exhausted proxy configurations: " + this.proxies);
    }

    private final List<Route> nextRoutes(Proxy proxy) throws IOException {
        String strHost;
        int iPort;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strHost = this.address.url().host();
            iPort = this.address.url().port();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                xw3.z(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                return null;
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strHost = INSTANCE.getSocketHost(inetSocketAddress);
            iPort = inetSocketAddress.getPort();
        }
        if (1 > iPort || iPort >= 65536) {
            throw new SocketException("No route to " + strHost + ':' + iPort + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            Address address = this.address;
            InetSocketAddress inetSocketAddressCreateUnresolved = InetSocketAddress.createUnresolved(strHost, iPort);
            inetSocketAddressCreateUnresolved.getClass();
            return i21.K(new Route(address, proxy, inetSocketAddressCreateUnresolved));
        }
        if (_HostnamesCommonKt.canParseAsIpAddress(strHost)) {
            return i21.K(new Route(this.address, proxy, new InetSocketAddress(InetAddress.getByName(strHost), iPort)));
        }
        List<Route> listDnsLookup = dnsLookup(proxy, strHost, iPort);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listDnsLookup) {
            if (((Route) obj).getEchConfigList() != null) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            listDnsLookup = arrayList;
        }
        return this.fastFallback ? InetAddressOrderKt.reorderForHappyEyeballs(listDnsLookup) : listDnsLookup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void resetNextProxy(HttpUrl url, Proxy proxy) {
        this.call.getEventListener().proxySelectStart(this.call, url);
        this.proxies = resetNextProxy$selectProxies(proxy, url, this);
        this.nextProxyIndex = 0;
        this.call.getEventListener().proxySelectEnd(this.call, url, this.proxies);
    }

    private static final List<Proxy> resetNextProxy$selectProxies(Proxy proxy, HttpUrl httpUrl, RouteSelector routeSelector) {
        List<Proxy> listSelect;
        if (proxy != null) {
            return i21.K(proxy);
        }
        URI uri = httpUrl.uri();
        if (uri.getHost() == null) {
            return _UtilJvmKt.immutableListOf(Proxy.NO_PROXY);
        }
        try {
            listSelect = routeSelector.address.proxySelector().select(uri);
        } catch (IllegalArgumentException unused) {
            listSelect = null;
        }
        return (listSelect == null || listSelect.isEmpty()) ? _UtilJvmKt.immutableListOf(Proxy.NO_PROXY) : _UtilJvmKt.toImmutableList(listSelect);
    }

    public final boolean hasNext() {
        return hasNextProxy() || !this.postponedRoutes.isEmpty();
    }

    public final Selection next() throws IOException {
        if (!hasNext()) {
            bt.n();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (hasNextProxy()) {
            for (Route route : nextProxy()) {
                if (this.routeDatabase.shouldPostpone(route)) {
                    this.postponedRoutes.add(route);
                } else {
                    arrayList.add(route);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            bw0.d0(arrayList, this.postponedRoutes);
            this.postponedRoutes.clear();
        }
        return new Selection(arrayList);
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "socketHost", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/net/InetSocketAddress;", "getSocketHost", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(ge1 ge1Var) {
            this();
        }

        public final String getSocketHost(InetSocketAddress inetSocketAddress) {
            inetSocketAddress.getClass();
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                hostName.getClass();
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            hostAddress.getClass();
            return hostAddress;
        }

        private Companion() {
        }
    }
}
