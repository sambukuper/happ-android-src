package okhttp3.internal.connection;

import defpackage.bt;
import defpackage.dh3;
import defpackage.kt;
import defpackage.pc6;
import defpackage.u52;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Address;
import okhttp3.ConnectionSpec;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001Bq\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u0004\u0018\u00010\u001c2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010,\u001a\u00020)H\u0000¢\u0006\u0004\b*\u0010+J/\u00102\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010-\u001a\u0004\u0018\u00010)2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010.H\u0000¢\u0006\u0004\b0\u00101J)\u00105\u001a\u00020)2\u0006\u0010\u001d\u001a\u00020\u001c2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010.H\u0000¢\u0006\u0004\b3\u00104J\u0019\u00107\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\f2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010?R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010?R\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010?R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010@R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010@R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010DR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010ER\u0014\u0010F\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010@R\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR \u0010P\u001a\b\u0012\u0004\u0012\u00020&0O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S¨\u0006T"}, d2 = {"Lokhttp3/internal/connection/RealRoutePlanner;", "Lokhttp3/internal/connection/RoutePlanner;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", _UrlKt.FRAGMENT_ENCODE_SET, "readTimeoutMillis", "writeTimeoutMillis", "socketConnectTimeoutMillis", "socketReadTimeoutMillis", "pingIntervalMillis", _UrlKt.FRAGMENT_ENCODE_SET, "retryOnConnectionFailure", "fastFallback", "Lokhttp3/Address;", "address", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RealCall;", "call", "Lokhttp3/Request;", "request", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;IIIIIZZLokhttp3/Address;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/internal/connection/RealCall;Lokhttp3/Request;)V", "Lokhttp3/internal/connection/ReusePlan;", "planReuseCallConnection", "()Lokhttp3/internal/connection/ReusePlan;", "Lokhttp3/Route;", "route", "createTunnelRequest", "(Lokhttp3/Route;)Lokhttp3/Request;", "Lokhttp3/internal/connection/RealConnection;", "connection", "retryRoute", "(Lokhttp3/internal/connection/RealConnection;)Lokhttp3/Route;", "isCanceled", "()Z", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "plan", "()Lokhttp3/internal/connection/RoutePlanner$Plan;", "Lokhttp3/internal/connection/ConnectPlan;", "planConnect$okhttp", "()Lokhttp3/internal/connection/ConnectPlan;", "planConnect", "planToReplace", _UrlKt.FRAGMENT_ENCODE_SET, "routes", "planReusePooledConnection$okhttp", "(Lokhttp3/internal/connection/ConnectPlan;Ljava/util/List;)Lokhttp3/internal/connection/ReusePlan;", "planReusePooledConnection", "planConnectToRoute$okhttp", "(Lokhttp3/Route;Ljava/util/List;)Lokhttp3/internal/connection/ConnectPlan;", "planConnectToRoute", "failedConnection", "hasNext", "(Lokhttp3/internal/connection/RealConnection;)Z", "Lokhttp3/HttpUrl;", "url", "sameHostAndPort", "(Lokhttp3/HttpUrl;)Z", "Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/connection/RealConnectionPool;", "I", "Z", "Lokhttp3/Address;", "getAddress", "()Lokhttp3/Address;", "Lokhttp3/internal/connection/RouteDatabase;", "Lokhttp3/internal/connection/RealCall;", "doExtensiveHealthChecks", "Lokhttp3/internal/connection/RouteSelector$Selection;", "routeSelection", "Lokhttp3/internal/connection/RouteSelector$Selection;", "Lokhttp3/internal/connection/RouteSelector;", "routeSelector", "Lokhttp3/internal/connection/RouteSelector;", "nextRouteToTry", "Lokhttp3/Route;", "Lkt;", "deferredPlans", "Lkt;", "getDeferredPlans", "()Lkt;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RealRoutePlanner implements RoutePlanner {
    private final Address address;
    private final RealCall call;
    private final RealConnectionPool connectionPool;
    private final kt deferredPlans;
    private final boolean doExtensiveHealthChecks;
    private final boolean fastFallback;
    private Route nextRouteToTry;
    private final int pingIntervalMillis;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final RouteDatabase routeDatabase;
    private RouteSelector.Selection routeSelection;
    private RouteSelector routeSelector;
    private final int socketConnectTimeoutMillis;
    private final int socketReadTimeoutMillis;
    private final TaskRunner taskRunner;
    private final int writeTimeoutMillis;

    public RealRoutePlanner(TaskRunner taskRunner, RealConnectionPool realConnectionPool, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, Address address, RouteDatabase routeDatabase, RealCall realCall, Request request) {
        taskRunner.getClass();
        realConnectionPool.getClass();
        address.getClass();
        routeDatabase.getClass();
        realCall.getClass();
        request.getClass();
        this.taskRunner = taskRunner;
        this.connectionPool = realConnectionPool;
        this.readTimeoutMillis = i;
        this.writeTimeoutMillis = i2;
        this.socketConnectTimeoutMillis = i3;
        this.socketReadTimeoutMillis = i4;
        this.pingIntervalMillis = i5;
        this.retryOnConnectionFailure = z;
        this.fastFallback = z2;
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = realCall;
        this.doExtensiveHealthChecks = !dh3.f(request.method(), "GET");
        this.deferredPlans = new kt();
    }

    private final Request createTunnelRequest(Route route) throws IOException {
        Request requestBuild = new Request.Builder().url(route.address().url()).method("CONNECT", null).header("Host", _UtilJvmKt.toHostHeader(route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", _UtilCommonKt.USER_AGENT).build();
        Request requestAuthenticate = route.address().proxyAuthenticator().authenticate(route, new Response.Builder().request(requestBuild).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        return requestAuthenticate == null ? requestBuild : requestAuthenticate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConnectPlan planConnectToRoute$okhttp$default(RealRoutePlanner realRoutePlanner, Route route, List list, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            list = null;
        }
        return realRoutePlanner.planConnectToRoute$okhttp(route, list);
    }

    private final ReusePlan planReuseCallConnection() {
        Socket socketReleaseConnectionNoEvents$okhttp;
        boolean z;
        RealConnection connection = this.call.getConnection();
        if (connection == null) {
            return null;
        }
        boolean zIsHealthy = connection.isHealthy(this.doExtensiveHealthChecks);
        synchronized (connection) {
            try {
                if (!zIsHealthy) {
                    z = !connection.getNoNewExchanges();
                    connection.setNoNewExchanges(true);
                    socketReleaseConnectionNoEvents$okhttp = this.call.releaseConnectionNoEvents$okhttp();
                } else if (connection.getNoNewExchanges() || !sameHostAndPort(connection.route().address().url())) {
                    socketReleaseConnectionNoEvents$okhttp = this.call.releaseConnectionNoEvents$okhttp();
                    z = false;
                } else {
                    z = false;
                    socketReleaseConnectionNoEvents$okhttp = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.call.getConnection() != null) {
            if (socketReleaseConnectionNoEvents$okhttp == null) {
                return new ReusePlan(connection);
            }
            bt.i("Check failed.");
            return null;
        }
        if (socketReleaseConnectionNoEvents$okhttp != null) {
            _UtilJvmKt.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
        }
        this.call.getEventListener().connectionReleased(this.call, connection);
        connection.getConnectionListener().connectionReleased(connection, this.call);
        if (socketReleaseConnectionNoEvents$okhttp != null) {
            connection.getConnectionListener().connectionClosed(connection);
        } else if (z) {
            connection.getConnectionListener().noNewExchanges(connection);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReusePlan planReusePooledConnection$okhttp$default(RealRoutePlanner realRoutePlanner, ConnectPlan connectPlan, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            connectPlan = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        return realRoutePlanner.planReusePooledConnection$okhttp(connectPlan, list);
    }

    private final Route retryRoute(RealConnection connection) {
        Route route;
        synchronized (connection) {
            route = null;
            if (connection.getRouteFailureCount() == 0 && connection.getNoNewExchanges() && _UtilJvmKt.canReuseConnectionFor(connection.route().address().url(), getAddress().url())) {
                route = connection.route();
            }
        }
        return route;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public Address getAddress() {
        return this.address;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public kt getDeferredPlans() {
        return this.deferredPlans;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public boolean hasNext(RealConnection failedConnection) {
        RouteSelector routeSelector;
        Route routeRetryRoute;
        if (!getDeferredPlans().isEmpty() || this.nextRouteToTry != null) {
            return true;
        }
        if (failedConnection != null && (routeRetryRoute = retryRoute(failedConnection)) != null) {
            this.nextRouteToTry = routeRetryRoute;
            return true;
        }
        RouteSelector.Selection selection = this.routeSelection;
        if ((selection == null || !selection.hasNext()) && (routeSelector = this.routeSelector) != null) {
            return routeSelector.hasNext();
        }
        return true;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public boolean isCanceled() {
        return this.call.getCanceled();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public RoutePlanner.Plan plan() throws IOException {
        ReusePlan reusePlanPlanReuseCallConnection = planReuseCallConnection();
        if (reusePlanPlanReuseCallConnection != null) {
            return reusePlanPlanReuseCallConnection;
        }
        ReusePlan reusePlanPlanReusePooledConnection$okhttp$default = planReusePooledConnection$okhttp$default(this, null, null, 3, null);
        if (reusePlanPlanReusePooledConnection$okhttp$default != null) {
            return reusePlanPlanReusePooledConnection$okhttp$default;
        }
        if (!getDeferredPlans().isEmpty()) {
            return (RoutePlanner.Plan) getDeferredPlans().removeFirst();
        }
        ConnectPlan connectPlanPlanConnect$okhttp = planConnect$okhttp();
        ReusePlan reusePlanPlanReusePooledConnection$okhttp = planReusePooledConnection$okhttp(connectPlanPlanConnect$okhttp, connectPlanPlanConnect$okhttp.getRoutes$okhttp());
        return reusePlanPlanReusePooledConnection$okhttp != null ? reusePlanPlanReusePooledConnection$okhttp : connectPlanPlanConnect$okhttp;
    }

    public final ConnectPlan planConnect$okhttp() throws IOException {
        Route route = this.nextRouteToTry;
        if (route != null) {
            this.nextRouteToTry = null;
            return planConnectToRoute$okhttp$default(this, route, null, 2, null);
        }
        RouteSelector.Selection selection = this.routeSelection;
        if (selection != null && selection.hasNext()) {
            return planConnectToRoute$okhttp$default(this, selection.next(), null, 2, null);
        }
        RouteSelector routeSelector = this.routeSelector;
        if (routeSelector == null) {
            routeSelector = new RouteSelector(getAddress(), this.routeDatabase, this.call, this.fastFallback);
            this.routeSelector = routeSelector;
        }
        if (!routeSelector.hasNext()) {
            u52.s("exhausted all routes");
            return null;
        }
        RouteSelector.Selection next = routeSelector.next();
        this.routeSelection = next;
        if (!isCanceled()) {
            return planConnectToRoute$okhttp(next.next(), next.getRoutes());
        }
        u52.s("Canceled");
        return null;
    }

    public final ConnectPlan planConnectToRoute$okhttp(Route route, List<Route> routes) throws IOException {
        route.getClass();
        if (route.address().sslSocketFactory() == null) {
            if (!route.address().connectionSpecs().contains(ConnectionSpec.CLEARTEXT)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String strHost = route.address().url().host();
            if (!Platform.INSTANCE.get().isCleartextTrafficPermitted(strHost)) {
                throw new UnknownServiceException(pc6.p("CLEARTEXT communication to ", strHost, " not permitted by network security policy"));
            }
        } else if (route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        return new ConnectPlan(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.call, this, route, routes, 0, route.requiresTunnel() ? createTunnelRequest(route) : null, -1, false, null, DnsOverHttps.MAX_RESPONSE_SIZE, null);
    }

    public final ReusePlan planReusePooledConnection$okhttp(ConnectPlan planToReplace, List<Route> routes) {
        RealConnection realConnectionCallAcquirePooledConnection$okhttp = this.connectionPool.callAcquirePooledConnection$okhttp(this.doExtensiveHealthChecks, getAddress(), this.call, routes, planToReplace != null && planToReplace.getIsReady());
        if (realConnectionCallAcquirePooledConnection$okhttp == null) {
            return null;
        }
        if (planToReplace != null) {
            this.nextRouteToTry = planToReplace.getRoute();
            planToReplace.closeQuietly();
        }
        this.call.getEventListener().connectionAcquired(this.call, realConnectionCallAcquirePooledConnection$okhttp);
        realConnectionCallAcquirePooledConnection$okhttp.getConnectionListener().connectionAcquired(realConnectionCallAcquirePooledConnection$okhttp, this.call);
        return new ReusePlan(realConnectionCallAcquirePooledConnection$okhttp);
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public boolean sameHostAndPort(HttpUrl url) {
        url.getClass();
        HttpUrl httpUrlUrl = getAddress().url();
        return url.port() == httpUrlUrl.port() && dh3.f(url.host(), httpUrlUrl.host());
    }
}
