package okhttp3;

import defpackage.gn2;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lokhttp3/Interceptor;", _UrlKt.FRAGMENT_ENCODE_SET, "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "Chain", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Interceptor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u000bH&J\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0012\u001a\u00020\u000bH&J\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010#\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 H&J\u0010\u0010&\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0015H&J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(H&J\u0010\u00100\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-H&J\u0012\u00105\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u000102H&J\u0012\u0010:\u001a\u00020\u00002\b\u00106\u001a\u0004\u0018\u000107H&J\u0010\u0010?\u001a\u00020\u00002\u0006\u0010;\u001a\u00020<H&J\u0010\u0010B\u001a\u00020\u00002\u0006\u0010@\u001a\u00020(H&J\u001c\u0010G\u001a\u00020\u00002\b\u0010H\u001a\u0004\u0018\u00010D2\b\u0010I\u001a\u0004\u0018\u00010JH&J\u0010\u0010R\u001a\u00020\u00002\u0006\u0010N\u001a\u00020OH&J\u0010\u0010W\u001a\u00020\u00002\u0006\u0010S\u001a\u00020TH&J\u0010\u0010\\\u001a\u00020\u00002\u0006\u0010X\u001a\u00020YH&R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001f\u001a\u00020 X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0012\u0010$\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0017R\u0012\u0010'\u001a\u00020(X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0012\u0010,\u001a\u00020-X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u0004\u0018\u000102X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00106\u001a\u0004\u0018\u000107X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0012\u0010;\u001a\u00020<X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0012\u0010@\u001a\u00020(X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010*R\u0014\u0010C\u001a\u0004\u0018\u00010DX¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010K\u001a\u0004\u0018\u00010JX¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0012\u0010N\u001a\u00020OX¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0012\u0010S\u001a\u00020TX¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0012\u0010X\u001a\u00020YX¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0012\u0010]\u001a\u00020^X¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006aÀ\u0006\u0001"}, d2 = {"Lokhttp3/Interceptor$Chain;", _UrlKt.FRAGMENT_ENCODE_SET, "request", "Lokhttp3/Request;", "proceed", "Lokhttp3/Response;", "connection", "Lokhttp3/Connection;", "call", "Lokhttp3/Call;", "connectTimeoutMillis", _UrlKt.FRAGMENT_ENCODE_SET, "withConnectTimeout", "timeout", "unit", "Ljava/util/concurrent/TimeUnit;", "readTimeoutMillis", "withReadTimeout", "writeTimeoutMillis", "withWriteTimeout", "followSslRedirects", _UrlKt.FRAGMENT_ENCODE_SET, "getFollowSslRedirects", "()Z", "followRedirects", "getFollowRedirects", "dns", "Lokhttp3/Dns;", "getDns", "()Lokhttp3/Dns;", "withDns", "socketFactory", "Ljavax/net/SocketFactory;", "getSocketFactory", "()Ljavax/net/SocketFactory;", "withSocketFactory", "retryOnConnectionFailure", "getRetryOnConnectionFailure", "withRetryOnConnectionFailure", "authenticator", "Lokhttp3/Authenticator;", "getAuthenticator", "()Lokhttp3/Authenticator;", "withAuthenticator", "cookieJar", "Lokhttp3/CookieJar;", "getCookieJar", "()Lokhttp3/CookieJar;", "withCookieJar", "cache", "Lokhttp3/Cache;", "getCache", "()Lokhttp3/Cache;", "withCache", "proxy", "Ljava/net/Proxy;", "getProxy", "()Ljava/net/Proxy;", "withProxy", "proxySelector", "Ljava/net/ProxySelector;", "getProxySelector", "()Ljava/net/ProxySelector;", "withProxySelector", "proxyAuthenticator", "getProxyAuthenticator", "withProxyAuthenticator", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactoryOrNull", "()Ljavax/net/ssl/SSLSocketFactory;", "withSslSocketFactory", "sslSocketFactory", "x509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "x509TrustManagerOrNull", "getX509TrustManagerOrNull", "()Ljavax/net/ssl/X509TrustManager;", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "getHostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "withHostnameVerifier", "certificatePinner", "Lokhttp3/CertificatePinner;", "getCertificatePinner", "()Lokhttp3/CertificatePinner;", "withCertificatePinner", "connectionPool", "Lokhttp3/ConnectionPool;", "getConnectionPool", "()Lokhttp3/ConnectionPool;", "withConnectionPool", "eventListener", "Lokhttp3/EventListener;", "getEventListener", "()Lokhttp3/EventListener;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Chain {
        Call call();

        /* JADX INFO: renamed from: connectTimeoutMillis */
        int getConnectTimeoutMillis();

        Connection connection();

        Authenticator getAuthenticator();

        Cache getCache();

        CertificatePinner getCertificatePinner();

        ConnectionPool getConnectionPool();

        CookieJar getCookieJar();

        Dns getDns();

        EventListener getEventListener();

        boolean getFollowRedirects();

        boolean getFollowSslRedirects();

        HostnameVerifier getHostnameVerifier();

        Proxy getProxy();

        Authenticator getProxyAuthenticator();

        ProxySelector getProxySelector();

        boolean getRetryOnConnectionFailure();

        SocketFactory getSocketFactory();

        SSLSocketFactory getSslSocketFactoryOrNull();

        X509TrustManager getX509TrustManagerOrNull();

        Response proceed(Request request) throws IOException;

        int readTimeoutMillis();

        Request request();

        Chain withAuthenticator(Authenticator authenticator);

        Chain withCache(Cache cache);

        Chain withCertificatePinner(CertificatePinner certificatePinner);

        Chain withConnectTimeout(int timeout, TimeUnit unit);

        Chain withConnectionPool(ConnectionPool connectionPool);

        Chain withCookieJar(CookieJar cookieJar);

        Chain withDns(Dns dns);

        Chain withHostnameVerifier(HostnameVerifier hostnameVerifier);

        Chain withProxy(Proxy proxy);

        Chain withProxyAuthenticator(Authenticator proxyAuthenticator);

        Chain withProxySelector(ProxySelector proxySelector);

        Chain withReadTimeout(int timeout, TimeUnit unit);

        Chain withRetryOnConnectionFailure(boolean retryOnConnectionFailure);

        Chain withSocketFactory(SocketFactory socketFactory);

        Chain withSslSocketFactory(SSLSocketFactory sslSocketFactory, X509TrustManager x509TrustManager);

        Chain withWriteTimeout(int timeout, TimeUnit unit);

        int writeTimeoutMillis();
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\u0014\b\u0004\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\nø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"Lokhttp3/Interceptor$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "Lkotlin/Function1;", "Lokhttp3/Interceptor$Chain;", "Lokhttp3/Response;", "block", "Lokhttp3/Interceptor;", "invoke", "(Lgn2;)Lokhttp3/Interceptor;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Interceptor invoke(final gn2 block) {
            block.getClass();
            return new Interceptor() { // from class: okhttp3.Interceptor$Companion$invoke$1
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    chain.getClass();
                    return (Response) block.B(chain);
                }
            };
        }
    }

    Response intercept(Chain chain) throws IOException;
}
