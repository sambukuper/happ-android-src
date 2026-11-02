.class public final Lokhttp3/internal/http/RealInterceptorChain;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lokhttp3/Interceptor$Chain;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008.\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u00d1\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u0008\u0012\u0006\u0010\u000e\u001a\u00020\u0008\u0012\u0006\u0010\u000f\u001a\u00020\u0008\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010 \u001a\u00020\u0011\u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0008\u0010\'\u001a\u0004\u0018\u00010(\u0012\u0008\u0010)\u001a\u0004\u0018\u00010*\u0012\u0008\u0010+\u001a\u0004\u0018\u00010,\u00a2\u0006\u0004\u0008-\u0010.BC\u0008\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010/\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u00100\u001a\u000201\u00a2\u0006\u0004\u0008-\u00102J\u00eb\u0001\u0010[\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u001b2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0008\u0008\u0002\u0010 \u001a\u00020\u00112\u0008\u0008\u0002\u0010!\u001a\u00020\"2\u0008\u0008\u0002\u0010#\u001a\u00020$2\u0008\u0008\u0002\u0010%\u001a\u00020&2\n\u0008\u0002\u0010\\\u001a\u0004\u0018\u00010(2\n\u0008\u0002\u0010]\u001a\u0004\u0018\u00010*2\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0000\u00a2\u0006\u0002\u0008^J\n\u0010g\u001a\u0004\u0018\u00010hH\u0016J\u0008\u0010\r\u001a\u00020\u0008H\u0016J\u0018\u0010i\u001a\u00020\u00012\u0006\u0010j\u001a\u00020\u00082\u0006\u0010k\u001a\u00020lH\u0016J\u0008\u0010\u000e\u001a\u00020\u0008H\u0016J\u0018\u0010m\u001a\u00020\u00012\u0006\u0010j\u001a\u00020\u00082\u0006\u0010k\u001a\u00020lH\u0016J\u0008\u0010\u000f\u001a\u00020\u0008H\u0016J\u0018\u0010n\u001a\u00020\u00012\u0006\u0010j\u001a\u00020\u00082\u0006\u0010k\u001a\u00020lH\u0016J\u0010\u0010o\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010p\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010q\u001a\u00020\u00012\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010r\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010s\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010t\u001a\u00020\u00012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010u\u001a\u00020\u00012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010v\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010w\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u0011H\u0016J\u001c\u0010x\u001a\u00020\u00012\u0008\u0010\\\u001a\u0004\u0018\u00010(2\u0008\u0010]\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010y\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010z\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010{\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0008\u0010\u0002\u001a\u00020|H\u0016J\u0008\u0010\u000b\u001a\u00020\u000cH\u0016J\u0010\u0010}\u001a\u00020~2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0011\u0010\u007f\u001a\u00030\u0080\u00012\u0008\u0010\u0081\u0001\u001a\u00030\u0082\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00104R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u00106R\u0014\u0010\u000b\u001a\u00020\u000cX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u00108R\u0014\u0010\r\u001a\u00020\u0008X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010:R\u0014\u0010\u000e\u001a\u00020\u0008X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010:R\u0014\u0010\u000f\u001a\u00020\u0008X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010:R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010>R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010@R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u0010BR\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010DR\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008E\u0010FR\u0014\u0010\u001a\u001a\u00020\u001bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u0010HR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008I\u0010JR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008K\u0010LR\u0014\u0010 \u001a\u00020\u0011X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008M\u0010>R\u0014\u0010!\u001a\u00020\"X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008N\u0010OR\u0014\u0010#\u001a\u00020$X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008P\u0010QR\u0014\u0010%\u001a\u00020&X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008R\u0010SR\u0016\u0010\'\u001a\u0004\u0018\u00010(X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008T\u0010UR\u0016\u0010)\u001a\u0004\u0018\u00010*X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008V\u0010WR\u0013\u0010+\u001a\u0004\u0018\u00010,\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008X\u0010YR\u000e\u0010Z\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010_\u001a\u00020`8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008a\u0010bR\u0014\u0010c\u001a\u00020$8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008d\u0010QR\u0014\u0010e\u001a\u00020$8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008f\u0010Q\u00a8\u0006\u0083\u0001"
    }
    d2 = {
        "Lokhttp3/internal/http/RealInterceptorChain;",
        "Lokhttp3/Interceptor$Chain;",
        "call",
        "Lokhttp3/internal/connection/RealCall;",
        "interceptors",
        "",
        "Lokhttp3/Interceptor;",
        "index",
        "",
        "exchange",
        "Lokhttp3/internal/connection/Exchange;",
        "request",
        "Lokhttp3/Request;",
        "connectTimeoutMillis",
        "readTimeoutMillis",
        "writeTimeoutMillis",
        "authenticator",
        "Lokhttp3/Authenticator;",
        "cache",
        "Lokhttp3/Cache;",
        "certificatePinner",
        "Lokhttp3/CertificatePinner;",
        "connectionPool",
        "Lokhttp3/ConnectionPool;",
        "cookieJar",
        "Lokhttp3/CookieJar;",
        "dns",
        "Lokhttp3/Dns;",
        "hostnameVerifier",
        "Ljavax/net/ssl/HostnameVerifier;",
        "proxy",
        "Ljava/net/Proxy;",
        "proxyAuthenticator",
        "proxySelector",
        "Ljava/net/ProxySelector;",
        "retryOnConnectionFailure",
        "",
        "socketFactory",
        "Ljavax/net/SocketFactory;",
        "sslSocketFactoryOrNull",
        "Ljavax/net/ssl/SSLSocketFactory;",
        "x509TrustManagerOrNull",
        "Ljavax/net/ssl/X509TrustManager;",
        "certificateChainCleaner",
        "Lokhttp3/internal/tls/CertificateChainCleaner;",
        "<init>",
        "(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;)V",
        "",
        "client",
        "Lokhttp3/OkHttpClient;",
        "(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILjava/lang/Void;Lokhttp3/Request;Lokhttp3/OkHttpClient;)V",
        "getCall$okhttp",
        "()Lokhttp3/internal/connection/RealCall;",
        "getExchange$okhttp",
        "()Lokhttp3/internal/connection/Exchange;",
        "getRequest$okhttp",
        "()Lokhttp3/Request;",
        "getConnectTimeoutMillis$okhttp",
        "()I",
        "getReadTimeoutMillis$okhttp",
        "getWriteTimeoutMillis$okhttp",
        "getAuthenticator",
        "()Lokhttp3/Authenticator;",
        "getCache",
        "()Lokhttp3/Cache;",
        "getCertificatePinner",
        "()Lokhttp3/CertificatePinner;",
        "getConnectionPool",
        "()Lokhttp3/ConnectionPool;",
        "getCookieJar",
        "()Lokhttp3/CookieJar;",
        "getDns",
        "()Lokhttp3/Dns;",
        "getHostnameVerifier",
        "()Ljavax/net/ssl/HostnameVerifier;",
        "getProxy",
        "()Ljava/net/Proxy;",
        "getProxyAuthenticator",
        "getProxySelector",
        "()Ljava/net/ProxySelector;",
        "getRetryOnConnectionFailure",
        "()Z",
        "getSocketFactory",
        "()Ljavax/net/SocketFactory;",
        "getSslSocketFactoryOrNull",
        "()Ljavax/net/ssl/SSLSocketFactory;",
        "getX509TrustManagerOrNull",
        "()Ljavax/net/ssl/X509TrustManager;",
        "getCertificateChainCleaner",
        "()Lokhttp3/internal/tls/CertificateChainCleaner;",
        "calls",
        "copy",
        "sslSocketFactory",
        "x509TrustManager",
        "copy$okhttp",
        "eventListener",
        "Lokhttp3/EventListener;",
        "getEventListener",
        "()Lokhttp3/EventListener;",
        "followSslRedirects",
        "getFollowSslRedirects",
        "followRedirects",
        "getFollowRedirects",
        "connection",
        "Lokhttp3/Connection;",
        "withConnectTimeout",
        "timeout",
        "unit",
        "Ljava/util/concurrent/TimeUnit;",
        "withReadTimeout",
        "withWriteTimeout",
        "withDns",
        "withSocketFactory",
        "withRetryOnConnectionFailure",
        "withAuthenticator",
        "withCookieJar",
        "withCache",
        "withProxy",
        "withProxySelector",
        "withProxyAuthenticator",
        "withSslSocketFactory",
        "withHostnameVerifier",
        "withCertificatePinner",
        "withConnectionPool",
        "Lokhttp3/Call;",
        "proceed",
        "Lokhttp3/Response;",
        "address",
        "Lokhttp3/Address;",
        "url",
        "Lokhttp3/HttpUrl;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final authenticator:Lokhttp3/Authenticator;

.field private final cache:Lokhttp3/Cache;

.field private final call:Lokhttp3/internal/connection/RealCall;

.field private calls:I

.field private final certificateChainCleaner:Lokhttp3/internal/tls/CertificateChainCleaner;

.field private final certificatePinner:Lokhttp3/CertificatePinner;

.field private final connectTimeoutMillis:I

.field private final connectionPool:Lokhttp3/ConnectionPool;

.field private final cookieJar:Lokhttp3/CookieJar;

.field private final dns:Lokhttp3/Dns;

.field private final exchange:Lokhttp3/internal/connection/Exchange;

.field private final hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

.field private final index:I

.field private final interceptors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/Interceptor;",
            ">;"
        }
    .end annotation
.end field

.field private final proxy:Ljava/net/Proxy;

.field private final proxyAuthenticator:Lokhttp3/Authenticator;

.field private final proxySelector:Ljava/net/ProxySelector;

.field private final readTimeoutMillis:I

.field private final request:Lokhttp3/Request;

.field private final retryOnConnectionFailure:Z

.field private final socketFactory:Ljavax/net/SocketFactory;

.field private final sslSocketFactoryOrNull:Ljavax/net/ssl/SSLSocketFactory;

.field private final writeTimeoutMillis:I

.field private final x509TrustManagerOrNull:Ljavax/net/ssl/X509TrustManager;


# direct methods
.method public constructor <init>(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILjava/lang/Void;Lokhttp3/Request;Lokhttp3/OkHttpClient;)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/internal/connection/RealCall;",
            "Ljava/util/List<",
            "+",
            "Lokhttp3/Interceptor;",
            ">;I",
            "Ljava/lang/Void;",
            "Lokhttp3/Request;",
            "Lokhttp3/OkHttpClient;",
            ")V"
        }
    .end annotation

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    move-object/from16 v4, p4

    check-cast v4, Lokhttp3/internal/connection/Exchange;

    .line 28
    invoke-virtual/range {p6 .. p6}, Lokhttp3/OkHttpClient;->connectTimeoutMillis()I

    move-result v6

    .line 29
    invoke-virtual/range {p6 .. p6}, Lokhttp3/OkHttpClient;->readTimeoutMillis()I

    move-result v7

    .line 30
    invoke-virtual/range {p6 .. p6}, Lokhttp3/OkHttpClient;->writeTimeoutMillis()I

    move-result v8

    .line 31
    invoke-virtual/range {p6 .. p6}, Lokhttp3/OkHttpClient;->authenticator()Lokhttp3/Authenticator;

    move-result-object v9

    .line 32
    invoke-virtual/range {p6 .. p6}, Lokhttp3/OkHttpClient;->cache()Lokhttp3/Cache;

    move-result-object v10

    .line 33
    invoke-virtual/range {p6 .. p6}, Lokhttp3/OkHttpClient;->certificatePinner()Lokhttp3/CertificatePinner;

    move-result-object v11

    .line 34
    invoke-virtual/range {p6 .. p6}, Lokhttp3/OkHttpClient;->connectionPool()Lokhttp3/ConnectionPool;

    move-result-object v12

    .line 35
    invoke-virtual/range {p6 .. p6}, Lokhttp3/OkHttpClient;->cookieJar()Lokhttp3/CookieJar;

    move-result-object v13

    .line 36
    invoke-virtual/range {p6 .. p6}, Lokhttp3/OkHttpClient;->dns()Lokhttp3/Dns;

    move-result-object v14

    .line 37
    invoke-virtual/range {p6 .. p6}, Lokhttp3/OkHttpClient;->hostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v15

    .line 38
    invoke-virtual/range {p6 .. p6}, Lokhttp3/OkHttpClient;->proxy()Ljava/net/Proxy;

    move-result-object v16

    .line 39
    invoke-virtual/range {p6 .. p6}, Lokhttp3/OkHttpClient;->proxyAuthenticator()Lokhttp3/Authenticator;

    move-result-object v17

    .line 40
    invoke-virtual/range {p6 .. p6}, Lokhttp3/OkHttpClient;->proxySelector()Ljava/net/ProxySelector;

    move-result-object v18

    .line 41
    invoke-virtual/range {p6 .. p6}, Lokhttp3/OkHttpClient;->retryOnConnectionFailure()Z

    move-result v19

    .line 42
    invoke-virtual/range {p6 .. p6}, Lokhttp3/OkHttpClient;->socketFactory()Ljavax/net/SocketFactory;

    move-result-object v20

    .line 43
    invoke-virtual/range {p6 .. p6}, Lokhttp3/OkHttpClient;->getSslSocketFactoryOrNull$okhttp()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v21

    .line 44
    invoke-virtual/range {p6 .. p6}, Lokhttp3/OkHttpClient;->x509TrustManager()Ljavax/net/ssl/X509TrustManager;

    move-result-object v22

    .line 45
    invoke-virtual/range {p6 .. p6}, Lokhttp3/OkHttpClient;->certificateChainCleaner()Lokhttp3/internal/tls/CertificateChainCleaner;

    move-result-object v23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v5, p5

    .line 46
    invoke-direct/range {v0 .. v23}, Lokhttp3/internal/http/RealInterceptorChain;-><init>(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;)V

    return-void
.end method

.method public synthetic constructor <init>(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILjava/lang/Void;Lokhttp3/Request;Lokhttp3/OkHttpClient;ILge1;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    .line 25
    invoke-virtual {p1}, Lokhttp3/internal/connection/RealCall;->getClient()Lokhttp3/OkHttpClient;

    move-result-object p6

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 26
    invoke-direct/range {v0 .. v6}, Lokhttp3/internal/http/RealInterceptorChain;-><init>(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILjava/lang/Void;Lokhttp3/Request;Lokhttp3/OkHttpClient;)V

    return-void
.end method

.method public constructor <init>(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/internal/connection/RealCall;",
            "Ljava/util/List<",
            "+",
            "Lokhttp3/Interceptor;",
            ">;I",
            "Lokhttp3/internal/connection/Exchange;",
            "Lokhttp3/Request;",
            "III",
            "Lokhttp3/Authenticator;",
            "Lokhttp3/Cache;",
            "Lokhttp3/CertificatePinner;",
            "Lokhttp3/ConnectionPool;",
            "Lokhttp3/CookieJar;",
            "Lokhttp3/Dns;",
            "Ljavax/net/ssl/HostnameVerifier;",
            "Ljava/net/Proxy;",
            "Lokhttp3/Authenticator;",
            "Ljava/net/ProxySelector;",
            "Z",
            "Ljavax/net/SocketFactory;",
            "Ljavax/net/ssl/SSLSocketFactory;",
            "Ljavax/net/ssl/X509TrustManager;",
            "Lokhttp3/internal/tls/CertificateChainCleaner;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p18 .. p18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p20 .. p20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lokhttp3/internal/http/RealInterceptorChain;->call:Lokhttp3/internal/connection/RealCall;

    .line 3
    iput-object p2, p0, Lokhttp3/internal/http/RealInterceptorChain;->interceptors:Ljava/util/List;

    .line 4
    iput p3, p0, Lokhttp3/internal/http/RealInterceptorChain;->index:I

    .line 5
    iput-object p4, p0, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    .line 6
    iput-object p5, p0, Lokhttp3/internal/http/RealInterceptorChain;->request:Lokhttp3/Request;

    .line 7
    iput p6, p0, Lokhttp3/internal/http/RealInterceptorChain;->connectTimeoutMillis:I

    .line 8
    iput p7, p0, Lokhttp3/internal/http/RealInterceptorChain;->readTimeoutMillis:I

    .line 9
    iput p8, p0, Lokhttp3/internal/http/RealInterceptorChain;->writeTimeoutMillis:I

    .line 10
    iput-object p9, p0, Lokhttp3/internal/http/RealInterceptorChain;->authenticator:Lokhttp3/Authenticator;

    .line 11
    iput-object p10, p0, Lokhttp3/internal/http/RealInterceptorChain;->cache:Lokhttp3/Cache;

    .line 12
    iput-object p11, p0, Lokhttp3/internal/http/RealInterceptorChain;->certificatePinner:Lokhttp3/CertificatePinner;

    .line 13
    iput-object p12, p0, Lokhttp3/internal/http/RealInterceptorChain;->connectionPool:Lokhttp3/ConnectionPool;

    .line 14
    iput-object p13, p0, Lokhttp3/internal/http/RealInterceptorChain;->cookieJar:Lokhttp3/CookieJar;

    .line 15
    iput-object p14, p0, Lokhttp3/internal/http/RealInterceptorChain;->dns:Lokhttp3/Dns;

    .line 16
    iput-object p15, p0, Lokhttp3/internal/http/RealInterceptorChain;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, Lokhttp3/internal/http/RealInterceptorChain;->proxy:Ljava/net/Proxy;

    move-object/from16 p1, p17

    .line 18
    iput-object p1, p0, Lokhttp3/internal/http/RealInterceptorChain;->proxyAuthenticator:Lokhttp3/Authenticator;

    move-object/from16 p1, p18

    .line 19
    iput-object p1, p0, Lokhttp3/internal/http/RealInterceptorChain;->proxySelector:Ljava/net/ProxySelector;

    move/from16 p1, p19

    .line 20
    iput-boolean p1, p0, Lokhttp3/internal/http/RealInterceptorChain;->retryOnConnectionFailure:Z

    move-object/from16 p1, p20

    .line 21
    iput-object p1, p0, Lokhttp3/internal/http/RealInterceptorChain;->socketFactory:Ljavax/net/SocketFactory;

    move-object/from16 p1, p21

    .line 22
    iput-object p1, p0, Lokhttp3/internal/http/RealInterceptorChain;->sslSocketFactoryOrNull:Ljavax/net/ssl/SSLSocketFactory;

    move-object/from16 p1, p22

    .line 23
    iput-object p1, p0, Lokhttp3/internal/http/RealInterceptorChain;->x509TrustManagerOrNull:Ljavax/net/ssl/X509TrustManager;

    move-object/from16 p1, p23

    .line 24
    iput-object p1, p0, Lokhttp3/internal/http/RealInterceptorChain;->certificateChainCleaner:Lokhttp3/internal/tls/CertificateChainCleaner;

    return-void
.end method

.method public static synthetic copy$okhttp$default(Lokhttp3/internal/http/RealInterceptorChain;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;ILjava/lang/Object;)Lokhttp3/internal/http/RealInterceptorChain;
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p22

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    .line 1
    iget v2, v0, Lokhttp3/internal/http/RealInterceptorChain;->index:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    .line 2
    iget-object v3, v0, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    .line 3
    iget-object v4, v0, Lokhttp3/internal/http/RealInterceptorChain;->request:Lokhttp3/Request;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    .line 4
    iget v5, v0, Lokhttp3/internal/http/RealInterceptorChain;->connectTimeoutMillis:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    .line 5
    iget v6, v0, Lokhttp3/internal/http/RealInterceptorChain;->readTimeoutMillis:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    .line 6
    iget v7, v0, Lokhttp3/internal/http/RealInterceptorChain;->writeTimeoutMillis:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    .line 7
    invoke-virtual {v0}, Lokhttp3/internal/http/RealInterceptorChain;->getAuthenticator()Lokhttp3/Authenticator;

    move-result-object v8

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    .line 8
    invoke-virtual {v0}, Lokhttp3/internal/http/RealInterceptorChain;->getCache()Lokhttp3/Cache;

    move-result-object v9

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    .line 9
    invoke-virtual {v0}, Lokhttp3/internal/http/RealInterceptorChain;->getCertificatePinner()Lokhttp3/CertificatePinner;

    move-result-object v10

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    .line 10
    invoke-virtual {v0}, Lokhttp3/internal/http/RealInterceptorChain;->getConnectionPool()Lokhttp3/ConnectionPool;

    move-result-object v11

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    .line 11
    invoke-virtual {v0}, Lokhttp3/internal/http/RealInterceptorChain;->getCookieJar()Lokhttp3/CookieJar;

    move-result-object v12

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    .line 12
    invoke-virtual {v0}, Lokhttp3/internal/http/RealInterceptorChain;->getDns()Lokhttp3/Dns;

    move-result-object v13

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    .line 13
    invoke-virtual {v0}, Lokhttp3/internal/http/RealInterceptorChain;->getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v14

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    .line 14
    invoke-virtual {v0}, Lokhttp3/internal/http/RealInterceptorChain;->getProxy()Ljava/net/Proxy;

    move-result-object v15

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    .line 15
    invoke-virtual {v0}, Lokhttp3/internal/http/RealInterceptorChain;->getProxyAuthenticator()Lokhttp3/Authenticator;

    move-result-object v2

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    .line 16
    invoke-virtual {v0}, Lokhttp3/internal/http/RealInterceptorChain;->getProxySelector()Ljava/net/ProxySelector;

    move-result-object v16

    goto :goto_f

    :cond_f
    move-object/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v1, v17

    if-eqz v17, :cond_10

    .line 17
    invoke-virtual {v0}, Lokhttp3/internal/http/RealInterceptorChain;->getRetryOnConnectionFailure()Z

    move-result v17

    goto :goto_10

    :cond_10
    move/from16 v17, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v1, v18

    if-eqz v18, :cond_11

    .line 18
    invoke-virtual {v0}, Lokhttp3/internal/http/RealInterceptorChain;->getSocketFactory()Ljavax/net/SocketFactory;

    move-result-object v18

    goto :goto_11

    :cond_11
    move-object/from16 v18, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v19, v1, v19

    if-eqz v19, :cond_12

    .line 19
    invoke-virtual {v0}, Lokhttp3/internal/http/RealInterceptorChain;->getSslSocketFactoryOrNull()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v19

    goto :goto_12

    :cond_12
    move-object/from16 v19, p19

    :goto_12
    const/high16 v20, 0x80000

    and-int v20, v1, v20

    if-eqz v20, :cond_13

    .line 20
    invoke-virtual {v0}, Lokhttp3/internal/http/RealInterceptorChain;->getX509TrustManagerOrNull()Ljavax/net/ssl/X509TrustManager;

    move-result-object v20

    goto :goto_13

    :cond_13
    move-object/from16 v20, p20

    :goto_13
    const/high16 v21, 0x100000

    and-int v1, v1, v21

    if-eqz v1, :cond_14

    .line 21
    iget-object v1, v0, Lokhttp3/internal/http/RealInterceptorChain;->certificateChainCleaner:Lokhttp3/internal/tls/CertificateChainCleaner;

    move-object/from16 p22, v1

    :goto_14
    move/from16 p2, p1

    move-object/from16 p1, v0

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p17, v16

    move/from16 p18, v17

    move-object/from16 p19, v18

    move-object/from16 p20, v19

    move-object/from16 p21, v20

    goto :goto_15

    :cond_14
    move-object/from16 p22, p21

    goto :goto_14

    .line 22
    :goto_15
    invoke-virtual/range {p1 .. p22}, Lokhttp3/internal/http/RealInterceptorChain;->copy$okhttp(ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;)Lokhttp3/internal/http/RealInterceptorChain;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final address(Lokhttp3/HttpUrl;)Lokhttp3/Address;
    .locals 14

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->isHttps()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lokhttp3/internal/http/RealInterceptorChain;->getSslSocketFactoryOrNull()Ljavax/net/ssl/SSLSocketFactory;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0}, Lokhttp3/internal/http/RealInterceptorChain;->getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p0}, Lokhttp3/internal/http/RealInterceptorChain;->getCertificatePinner()Lokhttp3/CertificatePinner;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    move-object v6, v0

    .line 23
    move-object v7, v1

    .line 24
    move-object v8, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    move-object v6, v0

    .line 28
    move-object v7, v6

    .line 29
    move-object v8, v7

    .line 30
    :goto_0
    new-instance v1, Lokhttp3/Address;

    .line 31
    .line 32
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->port()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-virtual {p0}, Lokhttp3/internal/http/RealInterceptorChain;->getDns()Lokhttp3/Dns;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {p0}, Lokhttp3/internal/http/RealInterceptorChain;->getSocketFactory()Ljavax/net/SocketFactory;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {p0}, Lokhttp3/internal/http/RealInterceptorChain;->getProxyAuthenticator()Lokhttp3/Authenticator;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    invoke-virtual {p0}, Lokhttp3/internal/http/RealInterceptorChain;->getProxy()Ljava/net/Proxy;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    iget-object p1, p0, Lokhttp3/internal/http/RealInterceptorChain;->call:Lokhttp3/internal/connection/RealCall;

    .line 57
    .line 58
    invoke-virtual {p1}, Lokhttp3/internal/connection/RealCall;->getClient()Lokhttp3/OkHttpClient;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->protocols()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    iget-object p1, p0, Lokhttp3/internal/http/RealInterceptorChain;->call:Lokhttp3/internal/connection/RealCall;

    .line 67
    .line 68
    invoke-virtual {p1}, Lokhttp3/internal/connection/RealCall;->getClient()Lokhttp3/OkHttpClient;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->connectionSpecs()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v12

    .line 76
    invoke-virtual {p0}, Lokhttp3/internal/http/RealInterceptorChain;->getProxySelector()Ljava/net/ProxySelector;

    .line 77
    .line 78
    .line 79
    move-result-object v13

    .line 80
    invoke-direct/range {v1 .. v13}, Lokhttp3/Address;-><init>(Ljava/lang/String;ILokhttp3/Dns;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/CertificatePinner;Lokhttp3/Authenticator;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    .line 81
    .line 82
    .line 83
    return-object v1
.end method

.method public call()Lokhttp3/Call;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->call:Lokhttp3/internal/connection/RealCall;

    .line 2
    .line 3
    return-object p0
.end method

.method public connectTimeoutMillis()I
    .locals 0

    .line 1
    iget p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->connectTimeoutMillis:I

    .line 2
    .line 3
    return p0
.end method

.method public connection()Lokhttp3/Connection;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lokhttp3/internal/connection/Exchange;->getConnection$okhttp()Lokhttp3/internal/connection/RealConnection;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public final copy$okhttp(ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;)Lokhttp3/internal/http/RealInterceptorChain;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p9 .. p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p10 .. p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p11 .. p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual/range {p12 .. p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {p13 .. p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual/range {p15 .. p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual/range {p18 .. p18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance v1, Lokhttp3/internal/http/RealInterceptorChain;

    .line 34
    .line 35
    move-object v2, v1

    .line 36
    iget-object v1, v0, Lokhttp3/internal/http/RealInterceptorChain;->call:Lokhttp3/internal/connection/RealCall;

    .line 37
    .line 38
    iget-object v0, v0, Lokhttp3/internal/http/RealInterceptorChain;->interceptors:Ljava/util/List;

    .line 39
    .line 40
    move-object v3, v2

    .line 41
    move-object v2, v0

    .line 42
    move-object v0, v3

    .line 43
    move/from16 v3, p1

    .line 44
    .line 45
    move-object/from16 v4, p2

    .line 46
    .line 47
    move-object/from16 v5, p3

    .line 48
    .line 49
    move/from16 v6, p4

    .line 50
    .line 51
    move/from16 v7, p5

    .line 52
    .line 53
    move/from16 v8, p6

    .line 54
    .line 55
    move-object/from16 v9, p7

    .line 56
    .line 57
    move-object/from16 v10, p8

    .line 58
    .line 59
    move-object/from16 v11, p9

    .line 60
    .line 61
    move-object/from16 v12, p10

    .line 62
    .line 63
    move-object/from16 v13, p11

    .line 64
    .line 65
    move-object/from16 v14, p12

    .line 66
    .line 67
    move-object/from16 v15, p13

    .line 68
    .line 69
    move-object/from16 v16, p14

    .line 70
    .line 71
    move-object/from16 v17, p15

    .line 72
    .line 73
    move-object/from16 v18, p16

    .line 74
    .line 75
    move/from16 v19, p17

    .line 76
    .line 77
    move-object/from16 v20, p18

    .line 78
    .line 79
    move-object/from16 v21, p19

    .line 80
    .line 81
    move-object/from16 v22, p20

    .line 82
    .line 83
    move-object/from16 v23, p21

    .line 84
    .line 85
    invoke-direct/range {v0 .. v23}, Lokhttp3/internal/http/RealInterceptorChain;-><init>(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;)V

    .line 86
    .line 87
    .line 88
    return-object v0
.end method

.method public getAuthenticator()Lokhttp3/Authenticator;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->authenticator:Lokhttp3/Authenticator;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCache()Lokhttp3/Cache;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->cache:Lokhttp3/Cache;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCall$okhttp()Lokhttp3/internal/connection/RealCall;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->call:Lokhttp3/internal/connection/RealCall;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCertificateChainCleaner()Lokhttp3/internal/tls/CertificateChainCleaner;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->certificateChainCleaner:Lokhttp3/internal/tls/CertificateChainCleaner;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCertificatePinner()Lokhttp3/CertificatePinner;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->certificatePinner:Lokhttp3/CertificatePinner;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getConnectTimeoutMillis$okhttp()I
    .locals 0

    .line 1
    iget p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->connectTimeoutMillis:I

    .line 2
    .line 3
    return p0
.end method

.method public getConnectionPool()Lokhttp3/ConnectionPool;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->connectionPool:Lokhttp3/ConnectionPool;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCookieJar()Lokhttp3/CookieJar;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->cookieJar:Lokhttp3/CookieJar;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDns()Lokhttp3/Dns;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->dns:Lokhttp3/Dns;

    .line 2
    .line 3
    return-object p0
.end method

.method public getEventListener()Lokhttp3/EventListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->call:Lokhttp3/internal/connection/RealCall;

    .line 2
    .line 3
    invoke-virtual {p0}, Lokhttp3/internal/connection/RealCall;->getEventListener$okhttp()Lokhttp3/EventListener;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getExchange$okhttp()Lokhttp3/internal/connection/Exchange;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    .line 2
    .line 3
    return-object p0
.end method

.method public getFollowRedirects()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->call:Lokhttp3/internal/connection/RealCall;

    .line 2
    .line 3
    invoke-virtual {p0}, Lokhttp3/internal/connection/RealCall;->getClient()Lokhttp3/OkHttpClient;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lokhttp3/OkHttpClient;->followRedirects()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public getFollowSslRedirects()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->call:Lokhttp3/internal/connection/RealCall;

    .line 2
    .line 3
    invoke-virtual {p0}, Lokhttp3/internal/connection/RealCall;->getClient()Lokhttp3/OkHttpClient;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lokhttp3/OkHttpClient;->followSslRedirects()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->hostnameVerifier:Ljavax/net/ssl/HostnameVerifier;

    .line 2
    .line 3
    return-object p0
.end method

.method public getProxy()Ljava/net/Proxy;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->proxy:Ljava/net/Proxy;

    .line 2
    .line 3
    return-object p0
.end method

.method public getProxyAuthenticator()Lokhttp3/Authenticator;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->proxyAuthenticator:Lokhttp3/Authenticator;

    .line 2
    .line 3
    return-object p0
.end method

.method public getProxySelector()Ljava/net/ProxySelector;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->proxySelector:Ljava/net/ProxySelector;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getReadTimeoutMillis$okhttp()I
    .locals 0

    .line 1
    iget p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->readTimeoutMillis:I

    .line 2
    .line 3
    return p0
.end method

.method public final getRequest$okhttp()Lokhttp3/Request;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->request:Lokhttp3/Request;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRetryOnConnectionFailure()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->retryOnConnectionFailure:Z

    .line 2
    .line 3
    return p0
.end method

.method public getSocketFactory()Ljavax/net/SocketFactory;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->socketFactory:Ljavax/net/SocketFactory;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSslSocketFactoryOrNull()Ljavax/net/ssl/SSLSocketFactory;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->sslSocketFactoryOrNull:Ljavax/net/ssl/SSLSocketFactory;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getWriteTimeoutMillis$okhttp()I
    .locals 0

    .line 1
    iget p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->writeTimeoutMillis:I

    .line 2
    .line 3
    return p0
.end method

.method public getX509TrustManagerOrNull()Ljavax/net/ssl/X509TrustManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->x509TrustManagerOrNull:Ljavax/net/ssl/X509TrustManager;

    .line 2
    .line 3
    return-object p0
.end method

.method public proceed(Lokhttp3/Request;)Lokhttp3/Response;
    .locals 28
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->index:I

    .line 7
    .line 8
    iget-object v2, v1, Lokhttp3/internal/http/RealInterceptorChain;->interceptors:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/16 v25, 0x0

    .line 15
    .line 16
    if-ge v0, v2, :cond_6

    .line 17
    .line 18
    iget v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->calls:I

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    add-int/2addr v0, v2

    .line 22
    iput v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->calls:I

    .line 23
    .line 24
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    .line 25
    .line 26
    const-string v3, " must call proceed() exactly once"

    .line 27
    .line 28
    const-string v4, "network interceptor "

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {v0}, Lokhttp3/internal/connection/Exchange;->getFinder$okhttp()Lokhttp3/internal/connection/ExchangeFinder;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Lokhttp3/internal/connection/ExchangeFinder;->getRoutePlanner()Lokhttp3/internal/connection/RoutePlanner;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual/range {p1 .. p1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-interface {v0, v5}, Lokhttp3/internal/connection/RoutePlanner;->sameHostAndPort(Lokhttp3/HttpUrl;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    iget v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->calls:I

    .line 51
    .line 52
    if-ne v0, v2, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->interceptors:Ljava/util/List;

    .line 56
    .line 57
    iget v1, v1, Lokhttp3/internal/http/RealInterceptorChain;->index:I

    .line 58
    .line 59
    sub-int/2addr v1, v2

    .line 60
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v4, v0, v3}, Lom0;->l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-object v25

    .line 68
    :cond_1
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->interceptors:Ljava/util/List;

    .line 69
    .line 70
    iget v1, v1, Lokhttp3/internal/http/RealInterceptorChain;->index:I

    .line 71
    .line 72
    sub-int/2addr v1, v2

    .line 73
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    const-string v1, " must retain the same host and port"

    .line 78
    .line 79
    invoke-static {v4, v0, v1}, Lom0;->l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-object v25

    .line 83
    :cond_2
    :goto_0
    iget v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->index:I

    .line 84
    .line 85
    add-int/2addr v0, v2

    .line 86
    const v23, 0x1ffffa

    .line 87
    .line 88
    .line 89
    const/16 v24, 0x0

    .line 90
    .line 91
    move-object v5, v3

    .line 92
    const/4 v3, 0x0

    .line 93
    move-object v6, v5

    .line 94
    const/4 v5, 0x0

    .line 95
    move-object v7, v6

    .line 96
    const/4 v6, 0x0

    .line 97
    move-object v8, v7

    .line 98
    const/4 v7, 0x0

    .line 99
    move-object v9, v8

    .line 100
    const/4 v8, 0x0

    .line 101
    move-object v10, v9

    .line 102
    const/4 v9, 0x0

    .line 103
    move-object v11, v10

    .line 104
    const/4 v10, 0x0

    .line 105
    move-object v12, v11

    .line 106
    const/4 v11, 0x0

    .line 107
    move-object v13, v12

    .line 108
    const/4 v12, 0x0

    .line 109
    move-object v14, v13

    .line 110
    const/4 v13, 0x0

    .line 111
    move-object v15, v14

    .line 112
    const/4 v14, 0x0

    .line 113
    move-object/from16 v16, v15

    .line 114
    .line 115
    const/4 v15, 0x0

    .line 116
    move-object/from16 v17, v16

    .line 117
    .line 118
    const/16 v16, 0x0

    .line 119
    .line 120
    move-object/from16 v18, v17

    .line 121
    .line 122
    const/16 v17, 0x0

    .line 123
    .line 124
    move-object/from16 v19, v18

    .line 125
    .line 126
    const/16 v18, 0x0

    .line 127
    .line 128
    move-object/from16 v20, v19

    .line 129
    .line 130
    const/16 v19, 0x0

    .line 131
    .line 132
    move-object/from16 v21, v20

    .line 133
    .line 134
    const/16 v20, 0x0

    .line 135
    .line 136
    move-object/from16 v22, v21

    .line 137
    .line 138
    const/16 v21, 0x0

    .line 139
    .line 140
    move-object/from16 v26, v22

    .line 141
    .line 142
    const/16 v22, 0x0

    .line 143
    .line 144
    move/from16 v27, v2

    .line 145
    .line 146
    move v2, v0

    .line 147
    move/from16 v0, v27

    .line 148
    .line 149
    move-object/from16 v27, v4

    .line 150
    .line 151
    move-object/from16 v4, p1

    .line 152
    .line 153
    invoke-static/range {v1 .. v24}, Lokhttp3/internal/http/RealInterceptorChain;->copy$okhttp$default(Lokhttp3/internal/http/RealInterceptorChain;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;ILjava/lang/Object;)Lokhttp3/internal/http/RealInterceptorChain;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    iget-object v3, v1, Lokhttp3/internal/http/RealInterceptorChain;->interceptors:Ljava/util/List;

    .line 158
    .line 159
    iget v4, v1, Lokhttp3/internal/http/RealInterceptorChain;->index:I

    .line 160
    .line 161
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    check-cast v3, Lokhttp3/Interceptor;

    .line 166
    .line 167
    invoke-interface {v3, v2}, Lokhttp3/Interceptor;->intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    if-eqz v4, :cond_5

    .line 172
    .line 173
    iget-object v5, v1, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    .line 174
    .line 175
    if-eqz v5, :cond_4

    .line 176
    .line 177
    iget v5, v1, Lokhttp3/internal/http/RealInterceptorChain;->index:I

    .line 178
    .line 179
    add-int/2addr v5, v0

    .line 180
    iget-object v1, v1, Lokhttp3/internal/http/RealInterceptorChain;->interceptors:Ljava/util/List;

    .line 181
    .line 182
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-ge v5, v1, :cond_4

    .line 187
    .line 188
    iget v1, v2, Lokhttp3/internal/http/RealInterceptorChain;->calls:I

    .line 189
    .line 190
    if-ne v1, v0, :cond_3

    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_3
    move-object/from16 v5, v26

    .line 194
    .line 195
    move-object/from16 v0, v27

    .line 196
    .line 197
    invoke-static {v0, v3, v5}, Lom0;->l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    return-object v25

    .line 201
    :cond_4
    :goto_1
    return-object v4

    .line 202
    :cond_5
    new-instance v0, Ljava/lang/NullPointerException;

    .line 203
    .line 204
    new-instance v1, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-string v2, "interceptor "

    .line 207
    .line 208
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-string v2, " returned null"

    .line 215
    .line 216
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw v0

    .line 227
    :cond_6
    const-string v0, "Check failed."

    .line 228
    .line 229
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    return-object v25
.end method

.method public readTimeoutMillis()I
    .locals 0

    .line 1
    iget p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->readTimeoutMillis:I

    .line 2
    .line 3
    return p0
.end method

.method public request()Lokhttp3/Request;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->request:Lokhttp3/Request;

    .line 2
    .line 3
    return-object p0
.end method

.method public withAuthenticator(Lokhttp3/Authenticator;)Lokhttp3/Interceptor$Chain;
    .locals 25

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object/from16 v1, p0

    .line 5
    .line 6
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const v23, 0x1fffbf

    .line 11
    .line 12
    .line 13
    const/16 v24, 0x0

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v9, 0x0

    .line 22
    const/4 v10, 0x0

    .line 23
    const/4 v11, 0x0

    .line 24
    const/4 v12, 0x0

    .line 25
    const/4 v13, 0x0

    .line 26
    const/4 v14, 0x0

    .line 27
    const/4 v15, 0x0

    .line 28
    const/16 v16, 0x0

    .line 29
    .line 30
    const/16 v17, 0x0

    .line 31
    .line 32
    const/16 v18, 0x0

    .line 33
    .line 34
    const/16 v19, 0x0

    .line 35
    .line 36
    const/16 v20, 0x0

    .line 37
    .line 38
    const/16 v21, 0x0

    .line 39
    .line 40
    const/16 v22, 0x0

    .line 41
    .line 42
    move-object/from16 v8, p1

    .line 43
    .line 44
    invoke-static/range {v1 .. v24}, Lokhttp3/internal/http/RealInterceptorChain;->copy$okhttp$default(Lokhttp3/internal/http/RealInterceptorChain;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;ILjava/lang/Object;)Lokhttp3/internal/http/RealInterceptorChain;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0

    .line 49
    :cond_0
    const-string v0, "authenticator can\'t be adjusted in a network interceptor"

    .line 50
    .line 51
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    return-object v0
.end method

.method public withCache(Lokhttp3/Cache;)Lokhttp3/Interceptor$Chain;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const v23, 0x1fff7f

    .line 8
    .line 9
    .line 10
    const/16 v24, 0x0

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v10, 0x0

    .line 20
    const/4 v11, 0x0

    .line 21
    const/4 v12, 0x0

    .line 22
    const/4 v13, 0x0

    .line 23
    const/4 v14, 0x0

    .line 24
    const/4 v15, 0x0

    .line 25
    const/16 v16, 0x0

    .line 26
    .line 27
    const/16 v17, 0x0

    .line 28
    .line 29
    const/16 v18, 0x0

    .line 30
    .line 31
    const/16 v19, 0x0

    .line 32
    .line 33
    const/16 v20, 0x0

    .line 34
    .line 35
    const/16 v21, 0x0

    .line 36
    .line 37
    const/16 v22, 0x0

    .line 38
    .line 39
    move-object/from16 v9, p1

    .line 40
    .line 41
    invoke-static/range {v1 .. v24}, Lokhttp3/internal/http/RealInterceptorChain;->copy$okhttp$default(Lokhttp3/internal/http/RealInterceptorChain;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;ILjava/lang/Object;)Lokhttp3/internal/http/RealInterceptorChain;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :cond_0
    const-string v0, "cache can\'t be adjusted in a network interceptor"

    .line 47
    .line 48
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    return-object v0
.end method

.method public withCertificatePinner(Lokhttp3/CertificatePinner;)Lokhttp3/Interceptor$Chain;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->certificateChainCleaner:Lokhttp3/internal/tls/CertificateChainCleaner;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    move-object/from16 v2, p1

    .line 15
    .line 16
    invoke-virtual {v2, v0}, Lokhttp3/CertificatePinner;->withCertificateChainCleaner$okhttp(Lokhttp3/internal/tls/CertificateChainCleaner;)Lokhttp3/CertificatePinner;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    move-object v10, v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object/from16 v2, p1

    .line 23
    .line 24
    move-object v10, v2

    .line 25
    :goto_0
    const v23, 0x1ffeff

    .line 26
    .line 27
    .line 28
    const/16 v24, 0x0

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v11, 0x0

    .line 39
    const/4 v12, 0x0

    .line 40
    const/4 v13, 0x0

    .line 41
    const/4 v14, 0x0

    .line 42
    const/4 v15, 0x0

    .line 43
    const/16 v16, 0x0

    .line 44
    .line 45
    const/16 v17, 0x0

    .line 46
    .line 47
    const/16 v18, 0x0

    .line 48
    .line 49
    const/16 v19, 0x0

    .line 50
    .line 51
    const/16 v20, 0x0

    .line 52
    .line 53
    const/16 v21, 0x0

    .line 54
    .line 55
    const/16 v22, 0x0

    .line 56
    .line 57
    invoke-static/range {v1 .. v24}, Lokhttp3/internal/http/RealInterceptorChain;->copy$okhttp$default(Lokhttp3/internal/http/RealInterceptorChain;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;ILjava/lang/Object;)Lokhttp3/internal/http/RealInterceptorChain;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0

    .line 62
    :cond_1
    const-string v0, "certificatePinner can\'t be adjusted in a network interceptor"

    .line 63
    .line 64
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    return-object v0
.end method

.method public withConnectTimeout(ILjava/util/concurrent/TimeUnit;)Lokhttp3/Interceptor$Chain;
    .locals 25

    .line 1
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object/from16 v1, p0

    .line 5
    .line 6
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "connectTimeout"

    .line 11
    .line 12
    move/from16 v2, p1

    .line 13
    .line 14
    int-to-long v2, v2

    .line 15
    move-object/from16 v4, p2

    .line 16
    .line 17
    invoke-static {v0, v2, v3, v4}, Lokhttp3/internal/_UtilJvmKt;->checkDuration(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    const v23, 0x1ffff7

    .line 22
    .line 23
    .line 24
    const/16 v24, 0x0

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    const/4 v11, 0x0

    .line 35
    const/4 v12, 0x0

    .line 36
    const/4 v13, 0x0

    .line 37
    const/4 v14, 0x0

    .line 38
    const/4 v15, 0x0

    .line 39
    const/16 v16, 0x0

    .line 40
    .line 41
    const/16 v17, 0x0

    .line 42
    .line 43
    const/16 v18, 0x0

    .line 44
    .line 45
    const/16 v19, 0x0

    .line 46
    .line 47
    const/16 v20, 0x0

    .line 48
    .line 49
    const/16 v21, 0x0

    .line 50
    .line 51
    const/16 v22, 0x0

    .line 52
    .line 53
    invoke-static/range {v1 .. v24}, Lokhttp3/internal/http/RealInterceptorChain;->copy$okhttp$default(Lokhttp3/internal/http/RealInterceptorChain;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;ILjava/lang/Object;)Lokhttp3/internal/http/RealInterceptorChain;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0

    .line 58
    :cond_0
    const-string v0, "Timeouts can\'t be adjusted in a network interceptor"

    .line 59
    .line 60
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    return-object v0
.end method

.method public withConnectionPool(Lokhttp3/ConnectionPool;)Lokhttp3/Interceptor$Chain;
    .locals 25

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object/from16 v1, p0

    .line 5
    .line 6
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const v23, 0x1ffdff

    .line 11
    .line 12
    .line 13
    const/16 v24, 0x0

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v12, 0x0

    .line 25
    const/4 v13, 0x0

    .line 26
    const/4 v14, 0x0

    .line 27
    const/4 v15, 0x0

    .line 28
    const/16 v16, 0x0

    .line 29
    .line 30
    const/16 v17, 0x0

    .line 31
    .line 32
    const/16 v18, 0x0

    .line 33
    .line 34
    const/16 v19, 0x0

    .line 35
    .line 36
    const/16 v20, 0x0

    .line 37
    .line 38
    const/16 v21, 0x0

    .line 39
    .line 40
    const/16 v22, 0x0

    .line 41
    .line 42
    move-object/from16 v11, p1

    .line 43
    .line 44
    invoke-static/range {v1 .. v24}, Lokhttp3/internal/http/RealInterceptorChain;->copy$okhttp$default(Lokhttp3/internal/http/RealInterceptorChain;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;ILjava/lang/Object;)Lokhttp3/internal/http/RealInterceptorChain;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0

    .line 49
    :cond_0
    const-string v0, "connectionPool can\'t be adjusted in a network interceptor"

    .line 50
    .line 51
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    return-object v0
.end method

.method public withCookieJar(Lokhttp3/CookieJar;)Lokhttp3/Interceptor$Chain;
    .locals 25

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object/from16 v1, p0

    .line 5
    .line 6
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const v23, 0x1ffbff

    .line 11
    .line 12
    .line 13
    const/16 v24, 0x0

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x0

    .line 25
    const/4 v13, 0x0

    .line 26
    const/4 v14, 0x0

    .line 27
    const/4 v15, 0x0

    .line 28
    const/16 v16, 0x0

    .line 29
    .line 30
    const/16 v17, 0x0

    .line 31
    .line 32
    const/16 v18, 0x0

    .line 33
    .line 34
    const/16 v19, 0x0

    .line 35
    .line 36
    const/16 v20, 0x0

    .line 37
    .line 38
    const/16 v21, 0x0

    .line 39
    .line 40
    const/16 v22, 0x0

    .line 41
    .line 42
    move-object/from16 v12, p1

    .line 43
    .line 44
    invoke-static/range {v1 .. v24}, Lokhttp3/internal/http/RealInterceptorChain;->copy$okhttp$default(Lokhttp3/internal/http/RealInterceptorChain;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;ILjava/lang/Object;)Lokhttp3/internal/http/RealInterceptorChain;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0

    .line 49
    :cond_0
    const-string v0, "cookieJar can\'t be adjusted in a network interceptor"

    .line 50
    .line 51
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    return-object v0
.end method

.method public withDns(Lokhttp3/Dns;)Lokhttp3/Interceptor$Chain;
    .locals 25

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object/from16 v1, p0

    .line 5
    .line 6
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const v23, 0x1ff7ff

    .line 11
    .line 12
    .line 13
    const/16 v24, 0x0

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x0

    .line 25
    const/4 v12, 0x0

    .line 26
    const/4 v14, 0x0

    .line 27
    const/4 v15, 0x0

    .line 28
    const/16 v16, 0x0

    .line 29
    .line 30
    const/16 v17, 0x0

    .line 31
    .line 32
    const/16 v18, 0x0

    .line 33
    .line 34
    const/16 v19, 0x0

    .line 35
    .line 36
    const/16 v20, 0x0

    .line 37
    .line 38
    const/16 v21, 0x0

    .line 39
    .line 40
    const/16 v22, 0x0

    .line 41
    .line 42
    move-object/from16 v13, p1

    .line 43
    .line 44
    invoke-static/range {v1 .. v24}, Lokhttp3/internal/http/RealInterceptorChain;->copy$okhttp$default(Lokhttp3/internal/http/RealInterceptorChain;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;ILjava/lang/Object;)Lokhttp3/internal/http/RealInterceptorChain;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0

    .line 49
    :cond_0
    const-string v0, "dns can\'t be adjusted in a network interceptor"

    .line 50
    .line 51
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    return-object v0
.end method

.method public withHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)Lokhttp3/Interceptor$Chain;
    .locals 25

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object/from16 v1, p0

    .line 5
    .line 6
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const v23, 0x1fefff

    .line 11
    .line 12
    .line 13
    const/16 v24, 0x0

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x0

    .line 25
    const/4 v12, 0x0

    .line 26
    const/4 v13, 0x0

    .line 27
    const/4 v15, 0x0

    .line 28
    const/16 v16, 0x0

    .line 29
    .line 30
    const/16 v17, 0x0

    .line 31
    .line 32
    const/16 v18, 0x0

    .line 33
    .line 34
    const/16 v19, 0x0

    .line 35
    .line 36
    const/16 v20, 0x0

    .line 37
    .line 38
    const/16 v21, 0x0

    .line 39
    .line 40
    const/16 v22, 0x0

    .line 41
    .line 42
    move-object/from16 v14, p1

    .line 43
    .line 44
    invoke-static/range {v1 .. v24}, Lokhttp3/internal/http/RealInterceptorChain;->copy$okhttp$default(Lokhttp3/internal/http/RealInterceptorChain;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;ILjava/lang/Object;)Lokhttp3/internal/http/RealInterceptorChain;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0

    .line 49
    :cond_0
    const-string v0, "hostnameVerifier can\'t be adjusted in a network interceptor"

    .line 50
    .line 51
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    return-object v0
.end method

.method public withProxy(Ljava/net/Proxy;)Lokhttp3/Interceptor$Chain;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const v23, 0x1fdfff

    .line 8
    .line 9
    .line 10
    const/16 v24, 0x0

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v10, 0x0

    .line 21
    const/4 v11, 0x0

    .line 22
    const/4 v12, 0x0

    .line 23
    const/4 v13, 0x0

    .line 24
    const/4 v14, 0x0

    .line 25
    const/16 v16, 0x0

    .line 26
    .line 27
    const/16 v17, 0x0

    .line 28
    .line 29
    const/16 v18, 0x0

    .line 30
    .line 31
    const/16 v19, 0x0

    .line 32
    .line 33
    const/16 v20, 0x0

    .line 34
    .line 35
    const/16 v21, 0x0

    .line 36
    .line 37
    const/16 v22, 0x0

    .line 38
    .line 39
    move-object/from16 v15, p1

    .line 40
    .line 41
    invoke-static/range {v1 .. v24}, Lokhttp3/internal/http/RealInterceptorChain;->copy$okhttp$default(Lokhttp3/internal/http/RealInterceptorChain;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;ILjava/lang/Object;)Lokhttp3/internal/http/RealInterceptorChain;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :cond_0
    const-string v0, "proxy can\'t be adjusted in a network interceptor"

    .line 47
    .line 48
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    return-object v0
.end method

.method public withProxyAuthenticator(Lokhttp3/Authenticator;)Lokhttp3/Interceptor$Chain;
    .locals 25

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object/from16 v1, p0

    .line 5
    .line 6
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const v23, 0x1fbfff

    .line 11
    .line 12
    .line 13
    const/16 v24, 0x0

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x0

    .line 25
    const/4 v12, 0x0

    .line 26
    const/4 v13, 0x0

    .line 27
    const/4 v14, 0x0

    .line 28
    const/4 v15, 0x0

    .line 29
    const/16 v17, 0x0

    .line 30
    .line 31
    const/16 v18, 0x0

    .line 32
    .line 33
    const/16 v19, 0x0

    .line 34
    .line 35
    const/16 v20, 0x0

    .line 36
    .line 37
    const/16 v21, 0x0

    .line 38
    .line 39
    const/16 v22, 0x0

    .line 40
    .line 41
    move-object/from16 v16, p1

    .line 42
    .line 43
    invoke-static/range {v1 .. v24}, Lokhttp3/internal/http/RealInterceptorChain;->copy$okhttp$default(Lokhttp3/internal/http/RealInterceptorChain;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;ILjava/lang/Object;)Lokhttp3/internal/http/RealInterceptorChain;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    :cond_0
    const-string v0, "proxyAuthenticator can\'t be adjusted in a network interceptor"

    .line 49
    .line 50
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    return-object v0
.end method

.method public withProxySelector(Ljava/net/ProxySelector;)Lokhttp3/Interceptor$Chain;
    .locals 25

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object/from16 v1, p0

    .line 5
    .line 6
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const v23, 0x1f7fff

    .line 11
    .line 12
    .line 13
    const/16 v24, 0x0

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x0

    .line 25
    const/4 v12, 0x0

    .line 26
    const/4 v13, 0x0

    .line 27
    const/4 v14, 0x0

    .line 28
    const/4 v15, 0x0

    .line 29
    const/16 v16, 0x0

    .line 30
    .line 31
    const/16 v18, 0x0

    .line 32
    .line 33
    const/16 v19, 0x0

    .line 34
    .line 35
    const/16 v20, 0x0

    .line 36
    .line 37
    const/16 v21, 0x0

    .line 38
    .line 39
    const/16 v22, 0x0

    .line 40
    .line 41
    move-object/from16 v17, p1

    .line 42
    .line 43
    invoke-static/range {v1 .. v24}, Lokhttp3/internal/http/RealInterceptorChain;->copy$okhttp$default(Lokhttp3/internal/http/RealInterceptorChain;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;ILjava/lang/Object;)Lokhttp3/internal/http/RealInterceptorChain;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    :cond_0
    const-string v0, "proxySelector can\'t be adjusted in a network interceptor"

    .line 49
    .line 50
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    return-object v0
.end method

.method public withReadTimeout(ILjava/util/concurrent/TimeUnit;)Lokhttp3/Interceptor$Chain;
    .locals 25

    .line 1
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object/from16 v1, p0

    .line 5
    .line 6
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "readTimeout"

    .line 11
    .line 12
    move/from16 v2, p1

    .line 13
    .line 14
    int-to-long v2, v2

    .line 15
    move-object/from16 v4, p2

    .line 16
    .line 17
    invoke-static {v0, v2, v3, v4}, Lokhttp3/internal/_UtilJvmKt;->checkDuration(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    const v23, 0x1fffef

    .line 22
    .line 23
    .line 24
    const/16 v24, 0x0

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    const/4 v11, 0x0

    .line 35
    const/4 v12, 0x0

    .line 36
    const/4 v13, 0x0

    .line 37
    const/4 v14, 0x0

    .line 38
    const/4 v15, 0x0

    .line 39
    const/16 v16, 0x0

    .line 40
    .line 41
    const/16 v17, 0x0

    .line 42
    .line 43
    const/16 v18, 0x0

    .line 44
    .line 45
    const/16 v19, 0x0

    .line 46
    .line 47
    const/16 v20, 0x0

    .line 48
    .line 49
    const/16 v21, 0x0

    .line 50
    .line 51
    const/16 v22, 0x0

    .line 52
    .line 53
    invoke-static/range {v1 .. v24}, Lokhttp3/internal/http/RealInterceptorChain;->copy$okhttp$default(Lokhttp3/internal/http/RealInterceptorChain;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;ILjava/lang/Object;)Lokhttp3/internal/http/RealInterceptorChain;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0

    .line 58
    :cond_0
    const-string v0, "Timeouts can\'t be adjusted in a network interceptor"

    .line 59
    .line 60
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    return-object v0
.end method

.method public withRetryOnConnectionFailure(Z)Lokhttp3/Interceptor$Chain;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const v23, 0x1effff

    .line 8
    .line 9
    .line 10
    const/16 v24, 0x0

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v10, 0x0

    .line 21
    const/4 v11, 0x0

    .line 22
    const/4 v12, 0x0

    .line 23
    const/4 v13, 0x0

    .line 24
    const/4 v14, 0x0

    .line 25
    const/4 v15, 0x0

    .line 26
    const/16 v16, 0x0

    .line 27
    .line 28
    const/16 v17, 0x0

    .line 29
    .line 30
    const/16 v19, 0x0

    .line 31
    .line 32
    const/16 v20, 0x0

    .line 33
    .line 34
    const/16 v21, 0x0

    .line 35
    .line 36
    const/16 v22, 0x0

    .line 37
    .line 38
    move/from16 v18, p1

    .line 39
    .line 40
    invoke-static/range {v1 .. v24}, Lokhttp3/internal/http/RealInterceptorChain;->copy$okhttp$default(Lokhttp3/internal/http/RealInterceptorChain;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;ILjava/lang/Object;)Lokhttp3/internal/http/RealInterceptorChain;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0

    .line 45
    :cond_0
    const-string v0, "retryOnConnectionFailure can\'t be adjusted in a network interceptor"

    .line 46
    .line 47
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    return-object v0
.end method

.method public withSocketFactory(Ljavax/net/SocketFactory;)Lokhttp3/Interceptor$Chain;
    .locals 25

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object/from16 v1, p0

    .line 5
    .line 6
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const v23, 0x1dffff

    .line 11
    .line 12
    .line 13
    const/16 v24, 0x0

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x0

    .line 25
    const/4 v12, 0x0

    .line 26
    const/4 v13, 0x0

    .line 27
    const/4 v14, 0x0

    .line 28
    const/4 v15, 0x0

    .line 29
    const/16 v16, 0x0

    .line 30
    .line 31
    const/16 v17, 0x0

    .line 32
    .line 33
    const/16 v18, 0x0

    .line 34
    .line 35
    const/16 v20, 0x0

    .line 36
    .line 37
    const/16 v21, 0x0

    .line 38
    .line 39
    const/16 v22, 0x0

    .line 40
    .line 41
    move-object/from16 v19, p1

    .line 42
    .line 43
    invoke-static/range {v1 .. v24}, Lokhttp3/internal/http/RealInterceptorChain;->copy$okhttp$default(Lokhttp3/internal/http/RealInterceptorChain;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;ILjava/lang/Object;)Lokhttp3/internal/http/RealInterceptorChain;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    :cond_0
    const-string v0, "socketFactory can\'t be adjusted in a network interceptor"

    .line 49
    .line 50
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    return-object v0
.end method

.method public withSslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/Interceptor$Chain;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    iget-object v2, v1, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    .line 6
    .line 7
    if-nez v2, :cond_1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v2, Lokhttp3/internal/tls/CertificateChainCleaner;->Companion:Lokhttp3/internal/tls/CertificateChainCleaner$Companion;

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Lokhttp3/internal/tls/CertificateChainCleaner$Companion;->get(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/CertificateChainCleaner;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v1}, Lokhttp3/internal/http/RealInterceptorChain;->getCertificatePinner()Lokhttp3/CertificatePinner;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3, v2}, Lokhttp3/CertificatePinner;->withCertificateChainCleaner$okhttp(Lokhttp3/internal/tls/CertificateChainCleaner;)Lokhttp3/CertificatePinner;

    .line 24
    .line 25
    .line 26
    move-result-object v10

    .line 27
    const v23, 0x3feff

    .line 28
    .line 29
    .line 30
    const/16 v24, 0x0

    .line 31
    .line 32
    move-object/from16 v22, v2

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x0

    .line 41
    const/4 v9, 0x0

    .line 42
    const/4 v11, 0x0

    .line 43
    const/4 v12, 0x0

    .line 44
    const/4 v13, 0x0

    .line 45
    const/4 v14, 0x0

    .line 46
    const/4 v15, 0x0

    .line 47
    const/16 v16, 0x0

    .line 48
    .line 49
    const/16 v17, 0x0

    .line 50
    .line 51
    const/16 v18, 0x0

    .line 52
    .line 53
    const/16 v19, 0x0

    .line 54
    .line 55
    move-object/from16 v20, p1

    .line 56
    .line 57
    move-object/from16 v21, v0

    .line 58
    .line 59
    invoke-static/range {v1 .. v24}, Lokhttp3/internal/http/RealInterceptorChain;->copy$okhttp$default(Lokhttp3/internal/http/RealInterceptorChain;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;ILjava/lang/Object;)Lokhttp3/internal/http/RealInterceptorChain;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0

    .line 64
    :cond_0
    const v23, 0x3ffff

    .line 65
    .line 66
    .line 67
    const/16 v24, 0x0

    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    const/4 v3, 0x0

    .line 71
    const/4 v4, 0x0

    .line 72
    const/4 v5, 0x0

    .line 73
    const/4 v6, 0x0

    .line 74
    const/4 v7, 0x0

    .line 75
    const/4 v8, 0x0

    .line 76
    const/4 v9, 0x0

    .line 77
    const/4 v10, 0x0

    .line 78
    const/4 v11, 0x0

    .line 79
    const/4 v12, 0x0

    .line 80
    const/4 v13, 0x0

    .line 81
    const/4 v14, 0x0

    .line 82
    const/4 v15, 0x0

    .line 83
    const/16 v16, 0x0

    .line 84
    .line 85
    const/16 v17, 0x0

    .line 86
    .line 87
    const/16 v18, 0x0

    .line 88
    .line 89
    const/16 v19, 0x0

    .line 90
    .line 91
    const/16 v20, 0x0

    .line 92
    .line 93
    const/16 v21, 0x0

    .line 94
    .line 95
    const/16 v22, 0x0

    .line 96
    .line 97
    move-object/from16 v1, p0

    .line 98
    .line 99
    invoke-static/range {v1 .. v24}, Lokhttp3/internal/http/RealInterceptorChain;->copy$okhttp$default(Lokhttp3/internal/http/RealInterceptorChain;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;ILjava/lang/Object;)Lokhttp3/internal/http/RealInterceptorChain;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    return-object v0

    .line 104
    :cond_1
    const-string v0, "sslSocketFactory can\'t be adjusted in a network interceptor"

    .line 105
    .line 106
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const/4 v0, 0x0

    .line 110
    return-object v0
.end method

.method public withWriteTimeout(ILjava/util/concurrent/TimeUnit;)Lokhttp3/Interceptor$Chain;
    .locals 25

    .line 1
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object/from16 v1, p0

    .line 5
    .line 6
    iget-object v0, v1, Lokhttp3/internal/http/RealInterceptorChain;->exchange:Lokhttp3/internal/connection/Exchange;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "writeTimeout"

    .line 11
    .line 12
    move/from16 v2, p1

    .line 13
    .line 14
    int-to-long v2, v2

    .line 15
    move-object/from16 v4, p2

    .line 16
    .line 17
    invoke-static {v0, v2, v3, v4}, Lokhttp3/internal/_UtilJvmKt;->checkDuration(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    const v23, 0x1fffdf

    .line 22
    .line 23
    .line 24
    const/16 v24, 0x0

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    const/4 v11, 0x0

    .line 35
    const/4 v12, 0x0

    .line 36
    const/4 v13, 0x0

    .line 37
    const/4 v14, 0x0

    .line 38
    const/4 v15, 0x0

    .line 39
    const/16 v16, 0x0

    .line 40
    .line 41
    const/16 v17, 0x0

    .line 42
    .line 43
    const/16 v18, 0x0

    .line 44
    .line 45
    const/16 v19, 0x0

    .line 46
    .line 47
    const/16 v20, 0x0

    .line 48
    .line 49
    const/16 v21, 0x0

    .line 50
    .line 51
    const/16 v22, 0x0

    .line 52
    .line 53
    invoke-static/range {v1 .. v24}, Lokhttp3/internal/http/RealInterceptorChain;->copy$okhttp$default(Lokhttp3/internal/http/RealInterceptorChain;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;IIILokhttp3/Authenticator;Lokhttp3/Cache;Lokhttp3/CertificatePinner;Lokhttp3/ConnectionPool;Lokhttp3/CookieJar;Lokhttp3/Dns;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lokhttp3/Authenticator;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lokhttp3/internal/tls/CertificateChainCleaner;ILjava/lang/Object;)Lokhttp3/internal/http/RealInterceptorChain;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0

    .line 58
    :cond_0
    const-string v0, "Timeouts can\'t be adjusted in a network interceptor"

    .line 59
    .line 60
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    return-object v0
.end method

.method public writeTimeoutMillis()I
    .locals 0

    .line 1
    iget p0, p0, Lokhttp3/internal/http/RealInterceptorChain;->writeTimeoutMillis:I

    .line 2
    .line 3
    return p0
.end method
