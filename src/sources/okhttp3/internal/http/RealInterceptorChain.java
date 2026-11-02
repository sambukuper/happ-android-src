package okhttp3.internal.http;

import defpackage.bt;
import defpackage.ge1;
import defpackage.om0;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionPool;
import okhttp3.CookieJar;
import okhttp3.Dns;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BÑ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010 \u001a\u00020\u0011\u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&\u0012\b\u0010'\u001a\u0004\u0018\u00010(\u0012\b\u0010)\u001a\u0004\u0018\u00010*\u0012\b\u0010+\u001a\u0004\u0018\u00010,¢\u0006\u0004\b-\u0010.BC\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010/\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u00100\u001a\u000201¢\u0006\u0004\b-\u00102Jë\u0001\u0010[\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0000¢\u0006\u0002\b^J\n\u0010g\u001a\u0004\u0018\u00010hH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\u0018\u0010i\u001a\u00020\u00012\u0006\u0010j\u001a\u00020\b2\u0006\u0010k\u001a\u00020lH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010m\u001a\u00020\u00012\u0006\u0010j\u001a\u00020\b2\u0006\u0010k\u001a\u00020lH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\u0018\u0010n\u001a\u00020\u00012\u0006\u0010j\u001a\u00020\b2\u0006\u0010k\u001a\u00020lH\u0016J\u0010\u0010o\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010p\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010q\u001a\u00020\u00012\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010r\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010s\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010t\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010u\u001a\u00020\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010v\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010w\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u0011H\u0016J\u001c\u0010x\u001a\u00020\u00012\b\u0010\\\u001a\u0004\u0018\u00010(2\b\u0010]\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010y\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010z\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010{\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0002\u001a\u00020|H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010}\u001a\u00020~2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0011\u0010\u007f\u001a\u00030\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0014\u0010\r\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0014\u0010\u000e\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0014\u0010\u000f\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010:R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0014\u0010\u001a\u001a\u00020\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0014\u0010 \u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010>R\u0014\u0010!\u001a\u00020\"X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0014\u0010#\u001a\u00020$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0014\u0010%\u001a\u00020&X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0016\u0010'\u001a\u0004\u0018\u00010(X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0016\u0010)\u001a\u0004\u0018\u00010*X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0013\u0010+\u001a\u0004\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u000e\u0010Z\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010_\u001a\u00020`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010QR\u0014\u0010e\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010Q¨\u0006\u0083\u0001"}, d2 = {"Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Interceptor$Chain;", "call", "Lokhttp3/internal/connection/RealCall;", "interceptors", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Interceptor;", "index", _UrlKt.FRAGMENT_ENCODE_SET, "exchange", "Lokhttp3/internal/connection/Exchange;", "request", "Lokhttp3/Request;", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "authenticator", "Lokhttp3/Authenticator;", "cache", "Lokhttp3/Cache;", "certificatePinner", "Lokhttp3/CertificatePinner;", "connectionPool", "Lokhttp3/ConnectionPool;", "cookieJar", "Lokhttp3/CookieJar;", "dns", "Lokhttp3/Dns;", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "proxy", "Ljava/net/Proxy;", "proxyAuthenticator", "proxySelector", "Ljava/net/ProxySelector;", "retryOnConnectionFailure", _UrlKt.FRAGMENT_ENCODE_SET, "socketFactory", "Ljavax/net/SocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "x509TrustManagerOrNull", "Ljavax/net/ssl/X509TrustManager;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "<init>", "(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;)V", _UrlKt.FRAGMENT_ENCODE_SET, "client", "Lokhttp3/OkHttpClient;", "(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILjava/lang/Void;Lokhttp3/Request;Lokhttp3/OkHttpClient;)V", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "getRequest$okhttp", "()Lokhttp3/Request;", "getConnectTimeoutMillis$okhttp", "()I", "getReadTimeoutMillis$okhttp", "getWriteTimeoutMillis$okhttp", "getAuthenticator", "()Lokhttp3/Authenticator;", "getCache", "()Lokhttp3/Cache;", "getCertificatePinner", "()Lokhttp3/CertificatePinner;", "getConnectionPool", "()Lokhttp3/ConnectionPool;", "getCookieJar", "()Lokhttp3/CookieJar;", "getDns", "()Lokhttp3/Dns;", "getHostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "getProxy", "()Ljava/net/Proxy;", "getProxyAuthenticator", "getProxySelector", "()Ljava/net/ProxySelector;", "getRetryOnConnectionFailure", "()Z", "getSocketFactory", "()Ljavax/net/SocketFactory;", "getSslSocketFactoryOrNull", "()Ljavax/net/ssl/SSLSocketFactory;", "getX509TrustManagerOrNull", "()Ljavax/net/ssl/X509TrustManager;", "getCertificateChainCleaner", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "calls", "copy", "sslSocketFactory", "x509TrustManager", "copy$okhttp", "eventListener", "Lokhttp3/EventListener;", "getEventListener", "()Lokhttp3/EventListener;", "followSslRedirects", "getFollowSslRedirects", "followRedirects", "getFollowRedirects", "connection", "Lokhttp3/Connection;", "withConnectTimeout", "timeout", "unit", "Ljava/util/concurrent/TimeUnit;", "withReadTimeout", "withWriteTimeout", "withDns", "withSocketFactory", "withRetryOnConnectionFailure", "withAuthenticator", "withCookieJar", "withCache", "withProxy", "withProxySelector", "withProxyAuthenticator", "withSslSocketFactory", "withHostnameVerifier", "withCertificatePinner", "withConnectionPool", "Lokhttp3/Call;", "proceed", "Lokhttp3/Response;", "address", "Lokhttp3/Address;", "url", "Lokhttp3/HttpUrl;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RealInterceptorChain implements Interceptor.Chain {
    private final Authenticator authenticator;
    private final Cache cache;
    private final RealCall call;
    private int calls;
    private final CertificateChainCleaner certificateChainCleaner;
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    private final ConnectionPool connectionPool;
    private final CookieJar cookieJar;
    private final Dns dns;
    private final Exchange exchange;
    private final HostnameVerifier hostnameVerifier;
    private final int index;
    private final List<Interceptor> interceptors;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final Request request;
    private final boolean retryOnConnectionFailure;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;
    private final X509TrustManager x509TrustManagerOrNull;

    /* JADX WARN: Multi-variable type inference failed */
    public RealInterceptorChain(RealCall realCall, List<? extends Interceptor> list, int i, Exchange exchange, Request request, int i2, int i3, int i4, Authenticator authenticator, Cache cache, CertificatePinner certificatePinner, ConnectionPool connectionPool, CookieJar cookieJar, Dns dns, HostnameVerifier hostnameVerifier, Proxy proxy, Authenticator authenticator2, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, CertificateChainCleaner certificateChainCleaner) {
        realCall.getClass();
        list.getClass();
        request.getClass();
        authenticator.getClass();
        certificatePinner.getClass();
        connectionPool.getClass();
        cookieJar.getClass();
        dns.getClass();
        hostnameVerifier.getClass();
        authenticator2.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        this.call = realCall;
        this.interceptors = list;
        this.index = i;
        this.exchange = exchange;
        this.request = request;
        this.connectTimeoutMillis = i2;
        this.readTimeoutMillis = i3;
        this.writeTimeoutMillis = i4;
        this.authenticator = authenticator;
        this.cache = cache;
        this.certificatePinner = certificatePinner;
        this.connectionPool = connectionPool;
        this.cookieJar = cookieJar;
        this.dns = dns;
        this.hostnameVerifier = hostnameVerifier;
        this.proxy = proxy;
        this.proxyAuthenticator = authenticator2;
        this.proxySelector = proxySelector;
        this.retryOnConnectionFailure = z;
        this.socketFactory = socketFactory;
        this.sslSocketFactoryOrNull = sSLSocketFactory;
        this.x509TrustManagerOrNull = x509TrustManager;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public static /* synthetic */ RealInterceptorChain copy$okhttp$default(RealInterceptorChain realInterceptorChain, int i, Exchange exchange, Request request, int i2, int i3, int i4, Authenticator authenticator, Cache cache, CertificatePinner certificatePinner, ConnectionPool connectionPool, CookieJar cookieJar, Dns dns, HostnameVerifier hostnameVerifier, Proxy proxy, Authenticator authenticator2, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, CertificateChainCleaner certificateChainCleaner, int i5, Object obj) {
        return realInterceptorChain.copy$okhttp((i5 & 1) != 0 ? realInterceptorChain.index : i, (i5 & 2) != 0 ? realInterceptorChain.exchange : exchange, (i5 & 4) != 0 ? realInterceptorChain.request : request, (i5 & 8) != 0 ? realInterceptorChain.connectTimeoutMillis : i2, (i5 & 16) != 0 ? realInterceptorChain.readTimeoutMillis : i3, (i5 & 32) != 0 ? realInterceptorChain.writeTimeoutMillis : i4, (i5 & 64) != 0 ? realInterceptorChain.getAuthenticator() : authenticator, (i5 & 128) != 0 ? realInterceptorChain.getCache() : cache, (i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? realInterceptorChain.getCertificatePinner() : certificatePinner, (i5 & 512) != 0 ? realInterceptorChain.getConnectionPool() : connectionPool, (i5 & 1024) != 0 ? realInterceptorChain.getCookieJar() : cookieJar, (i5 & 2048) != 0 ? realInterceptorChain.getDns() : dns, (i5 & 4096) != 0 ? realInterceptorChain.getHostnameVerifier() : hostnameVerifier, (i5 & 8192) != 0 ? realInterceptorChain.getProxy() : proxy, (i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? realInterceptorChain.getProxyAuthenticator() : authenticator2, (i5 & 32768) != 0 ? realInterceptorChain.getProxySelector() : proxySelector, (i5 & DnsOverHttps.MAX_RESPONSE_SIZE) != 0 ? realInterceptorChain.getRetryOnConnectionFailure() : z, (i5 & 131072) != 0 ? realInterceptorChain.getSocketFactory() : socketFactory, (i5 & 262144) != 0 ? realInterceptorChain.getSslSocketFactoryOrNull() : sSLSocketFactory, (i5 & 524288) != 0 ? realInterceptorChain.getX509TrustManagerOrNull() : x509TrustManager, (i5 & 1048576) != 0 ? realInterceptorChain.certificateChainCleaner : certificateChainCleaner);
    }

    public final Address address(HttpUrl url) {
        SSLSocketFactory sslSocketFactoryOrNull;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        url.getClass();
        if (url.isHttps()) {
            sslSocketFactoryOrNull = getSslSocketFactoryOrNull();
            hostnameVerifier = getHostnameVerifier();
            certificatePinner = getCertificatePinner();
        } else {
            sslSocketFactoryOrNull = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(url.host(), url.port(), getDns(), getSocketFactory(), sslSocketFactoryOrNull, hostnameVerifier, certificatePinner, getProxyAuthenticator(), getProxy(), this.call.getClient().protocols(), this.call.getClient().connectionSpecs(), getProxySelector());
    }

    @Override // okhttp3.Interceptor.Chain
    public Call call() {
        return this.call;
    }

    @Override // okhttp3.Interceptor.Chain
    /* JADX INFO: renamed from: connectTimeoutMillis, reason: from getter */
    public int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    public Connection connection() {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.getConnection$okhttp();
        }
        return null;
    }

    public final RealInterceptorChain copy$okhttp(int index, Exchange exchange, Request request, int connectTimeoutMillis, int readTimeoutMillis, int writeTimeoutMillis, Authenticator authenticator, Cache cache, CertificatePinner certificatePinner, ConnectionPool connectionPool, CookieJar cookieJar, Dns dns, HostnameVerifier hostnameVerifier, Proxy proxy, Authenticator proxyAuthenticator, ProxySelector proxySelector, boolean retryOnConnectionFailure, SocketFactory socketFactory, SSLSocketFactory sslSocketFactory, X509TrustManager x509TrustManager, CertificateChainCleaner certificateChainCleaner) {
        request.getClass();
        authenticator.getClass();
        certificatePinner.getClass();
        connectionPool.getClass();
        cookieJar.getClass();
        dns.getClass();
        hostnameVerifier.getClass();
        proxyAuthenticator.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        return new RealInterceptorChain(this.call, this.interceptors, index, exchange, request, connectTimeoutMillis, readTimeoutMillis, writeTimeoutMillis, authenticator, cache, certificatePinner, connectionPool, cookieJar, dns, hostnameVerifier, proxy, proxyAuthenticator, proxySelector, retryOnConnectionFailure, socketFactory, sslSocketFactory, x509TrustManager, certificateChainCleaner);
    }

    @Override // okhttp3.Interceptor.Chain
    public Authenticator getAuthenticator() {
        return this.authenticator;
    }

    @Override // okhttp3.Interceptor.Chain
    public Cache getCache() {
        return this.cache;
    }

    /* JADX INFO: renamed from: getCall$okhttp, reason: from getter */
    public final RealCall getCall() {
        return this.call;
    }

    public final CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    @Override // okhttp3.Interceptor.Chain
    public CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    public final int getConnectTimeoutMillis$okhttp() {
        return this.connectTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    public ConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    @Override // okhttp3.Interceptor.Chain
    public CookieJar getCookieJar() {
        return this.cookieJar;
    }

    @Override // okhttp3.Interceptor.Chain
    public Dns getDns() {
        return this.dns;
    }

    @Override // okhttp3.Interceptor.Chain
    public EventListener getEventListener() {
        return this.call.getEventListener();
    }

    /* JADX INFO: renamed from: getExchange$okhttp, reason: from getter */
    public final Exchange getExchange() {
        return this.exchange;
    }

    @Override // okhttp3.Interceptor.Chain
    public boolean getFollowRedirects() {
        return this.call.getClient().followRedirects();
    }

    @Override // okhttp3.Interceptor.Chain
    public boolean getFollowSslRedirects() {
        return this.call.getClient().followSslRedirects();
    }

    @Override // okhttp3.Interceptor.Chain
    public HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @Override // okhttp3.Interceptor.Chain
    public Proxy getProxy() {
        return this.proxy;
    }

    @Override // okhttp3.Interceptor.Chain
    public Authenticator getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @Override // okhttp3.Interceptor.Chain
    public ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    /* JADX INFO: renamed from: getReadTimeoutMillis$okhttp, reason: from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    /* JADX INFO: renamed from: getRequest$okhttp, reason: from getter */
    public final Request getRequest() {
        return this.request;
    }

    @Override // okhttp3.Interceptor.Chain
    public boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @Override // okhttp3.Interceptor.Chain
    public SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @Override // okhttp3.Interceptor.Chain
    public SSLSocketFactory getSslSocketFactoryOrNull() {
        return this.sslSocketFactoryOrNull;
    }

    /* JADX INFO: renamed from: getWriteTimeoutMillis$okhttp, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    public X509TrustManager getX509TrustManagerOrNull() {
        return this.x509TrustManagerOrNull;
    }

    @Override // okhttp3.Interceptor.Chain
    public Response proceed(Request request) throws IOException {
        request.getClass();
        if (this.index >= this.interceptors.size()) {
            bt.i("Check failed.");
            return null;
        }
        this.calls++;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            if (!exchange.getFinder().getRoutePlanner().sameHostAndPort(request.url())) {
                om0.l("network interceptor ", this.interceptors.get(this.index - 1), " must retain the same host and port");
                return null;
            }
            if (this.calls != 1) {
                om0.l("network interceptor ", this.interceptors.get(this.index - 1), " must call proceed() exactly once");
                return null;
            }
        }
        RealInterceptorChain realInterceptorChainCopy$okhttp$default = copy$okhttp$default(this, this.index + 1, null, request, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 2097146, null);
        Interceptor interceptor = this.interceptors.get(this.index);
        Response responseIntercept = interceptor.intercept(realInterceptorChainCopy$okhttp$default);
        if (responseIntercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (this.exchange == null || this.index + 1 >= this.interceptors.size() || realInterceptorChainCopy$okhttp$default.calls == 1) {
            return responseIntercept;
        }
        om0.l("network interceptor ", interceptor, " must call proceed() exactly once");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    public Request request() {
        return this.request;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withAuthenticator(Authenticator authenticator) {
        authenticator.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, authenticator, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 2097087, null);
        }
        bt.i("authenticator can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withCache(Cache cache) {
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, cache, null, null, null, null, null, null, null, null, false, null, null, null, null, 2097023, null);
        }
        bt.i("cache can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withCertificatePinner(CertificatePinner certificatePinner) {
        certificatePinner.getClass();
        if (this.exchange == null) {
            CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, certificateChainCleaner != null ? certificatePinner.withCertificateChainCleaner$okhttp(certificateChainCleaner) : certificatePinner, null, null, null, null, null, null, null, false, null, null, null, null, 2096895, null);
        }
        bt.i("certificatePinner can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withConnectTimeout(int timeout, TimeUnit unit) {
        unit.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, _UtilJvmKt.checkDuration("connectTimeout", timeout, unit), 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 2097143, null);
        }
        bt.i("Timeouts can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withConnectionPool(ConnectionPool connectionPool) {
        connectionPool.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, null, connectionPool, null, null, null, null, null, null, false, null, null, null, null, 2096639, null);
        }
        bt.i("connectionPool can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withCookieJar(CookieJar cookieJar) {
        cookieJar.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, null, null, cookieJar, null, null, null, null, null, false, null, null, null, null, 2096127, null);
        }
        bt.i("cookieJar can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withDns(Dns dns) {
        dns.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, null, null, null, dns, null, null, null, null, false, null, null, null, null, 2095103, null);
        }
        bt.i("dns can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withHostnameVerifier(HostnameVerifier hostnameVerifier) {
        hostnameVerifier.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, null, null, null, null, hostnameVerifier, null, null, null, false, null, null, null, null, 2093055, null);
        }
        bt.i("hostnameVerifier can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withProxy(Proxy proxy) {
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, null, null, null, null, null, proxy, null, null, false, null, null, null, null, 2088959, null);
        }
        bt.i("proxy can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withProxyAuthenticator(Authenticator proxyAuthenticator) {
        proxyAuthenticator.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, proxyAuthenticator, null, false, null, null, null, null, 2080767, null);
        }
        bt.i("proxyAuthenticator can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withProxySelector(ProxySelector proxySelector) {
        proxySelector.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, proxySelector, false, null, null, null, null, 2064383, null);
        }
        bt.i("proxySelector can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withReadTimeout(int timeout, TimeUnit unit) {
        unit.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, _UtilJvmKt.checkDuration("readTimeout", timeout, unit), 0, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 2097135, null);
        }
        bt.i("Timeouts can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withRetryOnConnectionFailure(boolean retryOnConnectionFailure) {
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, retryOnConnectionFailure, null, null, null, null, 2031615, null);
        }
        bt.i("retryOnConnectionFailure can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withSocketFactory(SocketFactory socketFactory) {
        socketFactory.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, socketFactory, null, null, null, 1966079, null);
        }
        bt.i("socketFactory can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withSslSocketFactory(SSLSocketFactory sslSocketFactory, X509TrustManager x509TrustManager) {
        if (this.exchange != null) {
            bt.i("sslSocketFactory can't be adjusted in a network interceptor");
            return null;
        }
        if (sslSocketFactory == null || x509TrustManager == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 262143, null);
        }
        CertificateChainCleaner certificateChainCleaner = CertificateChainCleaner.INSTANCE.get(x509TrustManager);
        return copy$okhttp$default(this, 0, null, null, 0, 0, 0, null, null, getCertificatePinner().withCertificateChainCleaner$okhttp(certificateChainCleaner), null, null, null, null, null, null, null, false, null, sslSocketFactory, x509TrustManager, certificateChainCleaner, 261887, null);
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withWriteTimeout(int timeout, TimeUnit unit) {
        unit.getClass();
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, _UtilJvmKt.checkDuration("writeTimeout", timeout, unit), null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 2097119, null);
        }
        bt.i("Timeouts can't be adjusted in a network interceptor");
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public /* synthetic */ RealInterceptorChain(RealCall realCall, List list, int i, Void r11, Request request, OkHttpClient okHttpClient, int i2, ge1 ge1Var) {
        this(realCall, list, i, r11, request, (i2 & 32) != 0 ? realCall.getClient() : okHttpClient);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RealInterceptorChain(RealCall realCall, List<? extends Interceptor> list, int i, Void r28, Request request, OkHttpClient okHttpClient) {
        this(realCall, list, i, (Exchange) r28, request, okHttpClient.connectTimeoutMillis(), okHttpClient.readTimeoutMillis(), okHttpClient.writeTimeoutMillis(), okHttpClient.authenticator(), okHttpClient.cache(), okHttpClient.certificatePinner(), okHttpClient.connectionPool(), okHttpClient.cookieJar(), okHttpClient.dns(), okHttpClient.hostnameVerifier(), okHttpClient.proxy(), okHttpClient.proxyAuthenticator(), okHttpClient.proxySelector(), okHttpClient.retryOnConnectionFailure(), okHttpClient.socketFactory(), okHttpClient.getSslSocketFactoryOrNull(), okHttpClient.getX509TrustManager(), okHttpClient.getCertificateChainCleaner());
        realCall.getClass();
        list.getClass();
        request.getClass();
        okHttpClient.getClass();
    }
}
