package okhttp3.internal.connection;

import defpackage.bt;
import defpackage.dh3;
import defpackage.g00;
import defpackage.ge1;
import defpackage.gm7;
import defpackage.o7;
import defpackage.ta8;
import defpackage.u52;
import defpackage.xv0;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.ConnectionSpec;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.ech.EchRetryPlan;
import okhttp3.internal.ech.EchUntrustedException;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 p2\u00020\u00012\u00020\u0002:\u0001pB\u009f\u0001\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020\"2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0011\u0010+\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b+\u0010,J'\u0010.\u001a\u0004\u0018\u00010\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020'0\u00152\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u000200H\u0016¢\u0006\u0004\b3\u00102J\u000f\u00105\u001a\u000200H\u0000¢\u0006\u0004\b4\u00102J%\u00107\u001a\u00020\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020'0\u00152\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b6\u0010/J/\u0010<\u001a\u0004\u0018\u00010\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020'0\u00152\u0006\u0010&\u001a\u00020%2\u0006\u00109\u001a\u000208H\u0000¢\u0006\u0004\b:\u0010;J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J!\u0010B\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\"H\u0016¢\u0006\u0004\bD\u0010$J\u000f\u0010E\u001a\u00020\"H\u0016¢\u0006\u0004\bE\u0010$J\u000f\u0010F\u001a\u00020\u0001H\u0016¢\u0006\u0004\bF\u0010GJ\r\u0010H\u001a\u00020\"¢\u0006\u0004\bH\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010IR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010JR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010KR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010KR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010KR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010KR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010KR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010LR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010MR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010NR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010O\u001a\u0004\bP\u0010QR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010R\u001a\u0004\bS\u0010TR\u0014\u0010\u0017\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010KR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010UR\u001a\u0010\u001a\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010K\u001a\u0004\bV\u0010WR\u001a\u0010\u001b\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010L\u001a\u0004\bX\u0010YR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010ZR\u0016\u0010[\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010LR\u0018\u0010]\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R$\u0010_\u001a\u0004\u0018\u00010\\8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010^\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u0018\u0010e\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010h\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010k\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010m\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010o\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010Y¨\u0006q"}, d2 = {"Lokhttp3/internal/connection/ConnectPlan;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", _UrlKt.FRAGMENT_ENCODE_SET, "readTimeoutMillis", "writeTimeoutMillis", "socketConnectTimeoutMillis", "socketReadTimeoutMillis", "pingIntervalMillis", _UrlKt.FRAGMENT_ENCODE_SET, "retryOnConnectionFailure", "Lokhttp3/internal/connection/RealCall;", "call", "Lokhttp3/internal/connection/RealRoutePlanner;", "routePlanner", "Lokhttp3/Route;", "route", _UrlKt.FRAGMENT_ENCODE_SET, "routes", "attempt", "Lokhttp3/Request;", "tunnelRequest", "connectionSpecIndex", "isTlsFallback", "Lokhttp3/internal/ech/EchRetryPlan;", "echRetryPlan", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;IIIIIZLokhttp3/internal/connection/RealCall;Lokhttp3/internal/connection/RealRoutePlanner;Lokhttp3/Route;Ljava/util/List;ILokhttp3/Request;IZLokhttp3/internal/ech/EchRetryPlan;)V", "copy", "(Lokhttp3/Route;ILokhttp3/Request;IZLokhttp3/internal/ech/EchRetryPlan;)Lokhttp3/internal/connection/ConnectPlan;", "Ldn8;", "connectSocket", "()V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "Lokhttp3/ConnectionSpec;", "connectionSpec", "connectTls", "(Ljavax/net/ssl/SSLSocket;Lokhttp3/ConnectionSpec;)V", "createTunnel", "()Lokhttp3/Request;", "connectionSpecs", "nextCompatibleConnectionSpec", "(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lokhttp3/internal/connection/ConnectPlan;", "Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "connectTcp", "()Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "connectTlsEtc", "connectTunnel$okhttp", "connectTunnel", "planWithCurrentOrInitialConnectionSpec$okhttp", "planWithCurrentOrInitialConnectionSpec", "Ljavax/net/ssl/SSLException;", "sslException", "nextConnectionSpec$okhttp", "(Ljava/util/List;Ljavax/net/ssl/SSLSocket;Ljavax/net/ssl/SSLException;)Lokhttp3/internal/connection/ConnectPlan;", "nextConnectionSpec", "Lokhttp3/internal/connection/RealConnection;", "handleSuccess", "()Lokhttp3/internal/connection/RealConnection;", "Ljava/io/IOException;", "e", "trackFailure", "(Lokhttp3/internal/connection/RealCall;Ljava/io/IOException;)V", "noNewExchanges", "cancel", "retry", "()Lokhttp3/internal/connection/RoutePlanner$Plan;", "closeQuietly", "Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/connection/RealConnectionPool;", "I", "Z", "Lokhttp3/internal/connection/RealCall;", "Lokhttp3/internal/connection/RealRoutePlanner;", "Lokhttp3/Route;", "getRoute", "()Lokhttp3/Route;", "Ljava/util/List;", "getRoutes$okhttp", "()Ljava/util/List;", "Lokhttp3/Request;", "getConnectionSpecIndex$okhttp", "()I", "isTlsFallback$okhttp", "()Z", "Lokhttp3/internal/ech/EchRetryPlan;", "canceled", "Ljava/net/Socket;", "rawSocket", "Ljava/net/Socket;", "javaNetSocket", "getJavaNetSocket$okhttp", "()Ljava/net/Socket;", "setJavaNetSocket$okhttp", "(Ljava/net/Socket;)V", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Handshake;", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/Protocol;", "Lokhttp3/internal/connection/BufferedSocket;", "socket", "Lokhttp3/internal/connection/BufferedSocket;", "connection", "Lokhttp3/internal/connection/RealConnection;", "isReady", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConnectPlan implements RoutePlanner.Plan, ExchangeCodec.Carrier {
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private final int attempt;
    private final RealCall call;
    private volatile boolean canceled;
    private RealConnection connection;
    private final RealConnectionPool connectionPool;
    private final int connectionSpecIndex;
    private final EchRetryPlan echRetryPlan;
    private Handshake handshake;
    private final boolean isTlsFallback;
    private Socket javaNetSocket;
    private final int pingIntervalMillis;
    private Protocol protocol;
    private Socket rawSocket;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final Route route;
    private final RealRoutePlanner routePlanner;
    private final List<Route> routes;
    private BufferedSocket socket;
    private final int socketConnectTimeoutMillis;
    private final int socketReadTimeoutMillis;
    private final TaskRunner taskRunner;
    private final Request tunnelRequest;
    private final int writeTimeoutMillis;

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
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ConnectPlan(TaskRunner taskRunner, RealConnectionPool realConnectionPool, int i, int i2, int i3, int i4, int i5, boolean z, RealCall realCall, RealRoutePlanner realRoutePlanner, Route route, List<Route> list, int i6, Request request, int i7, boolean z2, EchRetryPlan echRetryPlan) {
        taskRunner.getClass();
        realConnectionPool.getClass();
        realCall.getClass();
        realRoutePlanner.getClass();
        route.getClass();
        this.taskRunner = taskRunner;
        this.connectionPool = realConnectionPool;
        this.readTimeoutMillis = i;
        this.writeTimeoutMillis = i2;
        this.socketConnectTimeoutMillis = i3;
        this.socketReadTimeoutMillis = i4;
        this.pingIntervalMillis = i5;
        this.retryOnConnectionFailure = z;
        this.call = realCall;
        this.routePlanner = realRoutePlanner;
        this.route = route;
        this.routes = list;
        this.attempt = i6;
        this.tunnelRequest = request;
        this.connectionSpecIndex = i7;
        this.isTlsFallback = z2;
        this.echRetryPlan = echRetryPlan;
    }

    private final void connectSocket() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = getRoute().proxy().type();
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = getRoute().address().socketFactory().createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(getRoute().proxy());
        }
        this.rawSocket = socketCreateSocket;
        if (this.canceled) {
            u52.s("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.socketReadTimeoutMillis);
        try {
            Platform.INSTANCE.get().connectSocket(socketCreateSocket, getRoute().socketAddress(), this.socketConnectTimeoutMillis);
            try {
                this.socket = BufferedSocketKt.asBufferedSocket(socketCreateSocket);
            } catch (NullPointerException e) {
                if (dh3.f(e.getMessage(), NPE_THROW_WITH_NULL)) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + getRoute().socketAddress());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private final void connectTls(SSLSocket sslSocket, ConnectionSpec connectionSpec) throws IOException {
        Address address = getRoute().address();
        try {
            if (connectionSpec.supportsTlsExtensions()) {
                Platform.INSTANCE.get().configureTlsExtensions(sslSocket, address.url().host(), address.protocols(), getRoute().getEchConfigList());
            }
            sslSocket.startHandshake();
            SSLSession session = sslSocket.getSession();
            Handshake.Companion companion = Handshake.INSTANCE;
            session.getClass();
            Handshake handshake = companion.get(session);
            HostnameVerifier hostnameVerifier = address.hostnameVerifier();
            hostnameVerifier.getClass();
            if (hostnameVerifier.verify(address.url().host(), session)) {
                CertificatePinner certificatePinner = address.certificatePinner();
                certificatePinner.getClass();
                Handshake handshake2 = new Handshake(handshake.tlsVersion(), handshake.cipherSuite(), handshake.localCertificates(), new g00((Object) certificatePinner, (Object) handshake, (Object) address, (byte) 4));
                this.handshake = handshake2;
                certificatePinner.check$okhttp(address.url().host(), new o7((Object) handshake2, (byte) 23));
                String selectedProtocol = connectionSpec.supportsTlsExtensions() ? Platform.INSTANCE.get().getSelectedProtocol(sslSocket) : null;
                this.javaNetSocket = sslSocket;
                this.socket = BufferedSocketKt.asBufferedSocket(sslSocket);
                this.protocol = selectedProtocol != null ? Protocol.INSTANCE.get(selectedProtocol) : Protocol.HTTP_1_1;
                Platform.INSTANCE.get().afterHandshake(sslSocket);
                return;
            }
            List<Certificate> listPeerCertificates = handshake.peerCertificates();
            if (listPeerCertificates.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified (no certificates)");
            }
            Certificate certificate = listPeerCertificates.get(0);
            certificate.getClass();
            X509Certificate x509Certificate = (X509Certificate) certificate;
            throw new SSLPeerUnverifiedException(gm7.O("\n            |Hostname " + address.url().host() + " not verified:\n            |    certificate: " + CertificatePinner.INSTANCE.pin(x509Certificate) + "\n            |    DN: " + x509Certificate.getSubjectDN().getName() + "\n            |    subjectAltNames: " + OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate) + "\n            "));
        } catch (Throwable th) {
            Platform.INSTANCE.get().afterHandshake(sslSocket);
            _UtilJvmKt.closeQuietly(sslSocket);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List connectTls$lambda$0(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        CertificateChainCleaner certificateChainCleaner$okhttp = certificatePinner.getCertificateChainCleaner();
        certificateChainCleaner$okhttp.getClass();
        return certificateChainCleaner$okhttp.clean(handshake.peerCertificates(), address.url().host());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List connectTls$lambda$1(Handshake handshake) {
        List<Certificate> listPeerCertificates = handshake.peerCertificates();
        ArrayList arrayList = new ArrayList(xv0.Z(listPeerCertificates, 10));
        for (Certificate certificate : listPeerCertificates) {
            certificate.getClass();
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    private final ConnectPlan copy(Route route, int attempt, Request tunnelRequest, int connectionSpecIndex, boolean isTlsFallback, EchRetryPlan echRetryPlan) {
        return new ConnectPlan(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.call, this.routePlanner, route, this.routes, attempt, tunnelRequest, connectionSpecIndex, isTlsFallback, echRetryPlan);
    }

    public static /* synthetic */ ConnectPlan copy$default(ConnectPlan connectPlan, Route route, int i, Request request, int i2, boolean z, EchRetryPlan echRetryPlan, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            route = connectPlan.getRoute();
        }
        if ((i3 & 2) != 0) {
            i = connectPlan.attempt;
        }
        if ((i3 & 4) != 0) {
            request = connectPlan.tunnelRequest;
        }
        if ((i3 & 8) != 0) {
            i2 = connectPlan.connectionSpecIndex;
        }
        if ((i3 & 16) != 0) {
            z = connectPlan.isTlsFallback;
        }
        if ((i3 & 32) != 0) {
            echRetryPlan = connectPlan.echRetryPlan;
        }
        boolean z2 = z;
        EchRetryPlan echRetryPlan2 = echRetryPlan;
        return connectPlan.copy(route, i, request, i2, z2, echRetryPlan2);
    }

    private final Request createTunnel() throws IOException {
        Request request = this.tunnelRequest;
        request.getClass();
        String str = "CONNECT " + _UtilJvmKt.toHostHeader(getRoute().address().url(), true) + " HTTP/1.1";
        while (true) {
            BufferedSocket bufferedSocket = this.socket;
            if (bufferedSocket == null) {
                dh3.T("socket");
                throw null;
            }
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, bufferedSocket);
            BufferedSocket bufferedSocket2 = this.socket;
            if (bufferedSocket2 == null) {
                dh3.T("socket");
                throw null;
            }
            ta8 ta8VarTimeout = bufferedSocket2.getSource().getTimeout();
            long j = this.readTimeoutMillis;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ta8VarTimeout.timeout(j, timeUnit);
            BufferedSocket bufferedSocket3 = this.socket;
            if (bufferedSocket3 == null) {
                dh3.T("socket");
                throw null;
            }
            bufferedSocket3.getSink().timeout().timeout(this.writeTimeoutMillis, timeUnit);
            http1ExchangeCodec.writeRequest(request.headers(), str);
            http1ExchangeCodec.finishRequest();
            Response.Builder responseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            responseHeaders.getClass();
            Response responseBuild = responseHeaders.request(request).build();
            http1ExchangeCodec.skipConnectBody(responseBuild);
            int iCode = responseBuild.code();
            if (iCode != 200) {
                if (iCode == 407) {
                    Request requestAuthenticate = getRoute().address().proxyAuthenticator().authenticate(getRoute(), responseBuild);
                    if (requestAuthenticate == null) {
                        u52.s("Failed to authenticate with proxy");
                        return null;
                    }
                    if ("close".equalsIgnoreCase(Response.header$default(responseBuild, "Connection", null, 2, null))) {
                        return requestAuthenticate;
                    }
                    request = requestAuthenticate;
                } else {
                    u52.h(responseBuild.code(), "Unexpected response code for CONNECT: ");
                }
            }
            return null;
        }
    }

    private final ConnectPlan nextCompatibleConnectionSpec(List<ConnectionSpec> connectionSpecs, SSLSocket sslSocket) {
        int i = this.connectionSpecIndex + 1;
        int size = connectionSpecs.size();
        for (int i2 = i; i2 < size; i2++) {
            if (connectionSpecs.get(i2).isCompatible(sslSocket)) {
                return copy$default(this, null, 0, null, i2, this.connectionSpecIndex != -1, null, 39, null);
            }
        }
        return null;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    /* JADX INFO: renamed from: cancel */
    public void mo167cancel() {
        this.canceled = true;
        Socket socket = this.rawSocket;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
    }

    public final void closeQuietly() {
        Socket socket = this.javaNetSocket;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:? A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: connectTcp */
    public RoutePlanner.ConnectResult getResult() throws Throwable {
        ConnectPlan connectPlan;
        ConnectPlan connectPlan2;
        Throwable th;
        Socket socket;
        Socket socket2;
        if (this.rawSocket != null) {
            bt.i("TCP already connected");
            return null;
        }
        this.call.getPlansToCancel$okhttp().add(this);
        boolean z = false;
        try {
            try {
                this.call.getEventListener().connectStart(this.call, getRoute().socketAddress(), getRoute().proxy());
                this.connectionPool.getConnectionListener().connectStart(getRoute(), this.call);
                connectSocket();
                z = true;
                connectPlan2 = this;
                try {
                    RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(connectPlan2, null, null, 6, null);
                    connectPlan2.call.getPlansToCancel$okhttp().remove(connectPlan2);
                    return connectResult;
                } catch (IOException e) {
                    e = e;
                    IOException iOException = e;
                    if (connectPlan2.getRoute().address().proxy() == null && connectPlan2.getRoute().proxy().type() != Proxy.Type.DIRECT) {
                        connectPlan2.getRoute().address().proxySelector().connectFailed(connectPlan2.getRoute().address().url().uri(), connectPlan2.getRoute().proxy().address(), iOException);
                    }
                    connectPlan2.call.getEventListener().connectFailed(connectPlan2.call, connectPlan2.getRoute().socketAddress(), connectPlan2.getRoute().proxy(), null, iOException);
                    connectPlan2.connectionPool.getConnectionListener().connectFailed(connectPlan2.getRoute(), connectPlan2.call, iOException);
                    ConnectPlan connectPlan3 = connectPlan2;
                    try {
                        RoutePlanner.ConnectResult connectResult2 = new RoutePlanner.ConnectResult(connectPlan3, null, iOException, 2, null);
                        connectPlan2.call.getPlansToCancel$okhttp().remove(connectPlan2);
                        if (!z && (socket2 = connectPlan2.rawSocket) != null) {
                            _UtilJvmKt.closeQuietly(socket2);
                        }
                        return connectResult2;
                    } catch (Throwable th2) {
                        th = th2;
                        connectPlan = connectPlan3;
                        th = th;
                        connectPlan.call.getPlansToCancel$okhttp().remove(connectPlan);
                        if (z) {
                            throw th;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                connectPlan.call.getPlansToCancel$okhttp().remove(connectPlan);
                if (z || (socket = connectPlan.rawSocket) == null) {
                    throw th;
                }
                _UtilJvmKt.closeQuietly(socket);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            connectPlan2 = this;
        } catch (Throwable th4) {
            th = th4;
            connectPlan = this;
            th = th;
            connectPlan.call.getPlansToCancel$okhttp().remove(connectPlan);
            if (z) {
                throw th;
            }
            throw th;
        }
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: connectTlsEtc */
    public RoutePlanner.ConnectResult mo172connectTlsEtc() throws Throwable {
        IOException iOException;
        Socket socket = this.rawSocket;
        if (socket == null) {
            bt.q("TCP not connected");
            return null;
        }
        if (getIsReady()) {
            bt.i("already connected");
            return null;
        }
        List<ConnectionSpec> listConnectionSpecs = getRoute().address().connectionSpecs();
        this.call.getPlansToCancel$okhttp().add(this);
        boolean z = false;
        try {
            try {
                if (this.tunnelRequest != null) {
                    RoutePlanner.ConnectResult connectResultConnectTunnel$okhttp = connectTunnel$okhttp();
                    if (connectResultConnectTunnel$okhttp.getNextPlan() != null || connectResultConnectTunnel$okhttp.getThrowable() != null) {
                        this.call.getPlansToCancel$okhttp().remove(this);
                        Socket socket2 = this.javaNetSocket;
                        if (socket2 != null) {
                            _UtilJvmKt.closeQuietly(socket2);
                        }
                        _UtilJvmKt.closeQuietly(socket);
                        return connectResultConnectTunnel$okhttp;
                    }
                }
                if (getRoute().address().sslSocketFactory() != null) {
                    BufferedSocket bufferedSocket = this.socket;
                    if (bufferedSocket == null) {
                        dh3.T("socket");
                        throw null;
                    }
                    if (bufferedSocket.getSource().c().F()) {
                        BufferedSocket bufferedSocket2 = this.socket;
                        if (bufferedSocket2 == null) {
                            dh3.T("socket");
                            throw null;
                        }
                        if (bufferedSocket2.getSink().c().F()) {
                            this.call.getEventListener().secureConnectStart(this.call);
                            Socket socketCreateSocket = getRoute().address().sslSocketFactory().createSocket(socket, getRoute().address().url().host(), getRoute().address().url().port(), true);
                            socketCreateSocket.getClass();
                            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                            ConnectPlan connectPlanPlanWithCurrentOrInitialConnectionSpec$okhttp = planWithCurrentOrInitialConnectionSpec$okhttp(listConnectionSpecs, sSLSocket);
                            ConnectionSpec connectionSpec = listConnectionSpecs.get(connectPlanPlanWithCurrentOrInitialConnectionSpec$okhttp.connectionSpecIndex);
                            connectionSpec.apply$okhttp(sSLSocket, connectPlanPlanWithCurrentOrInitialConnectionSpec$okhttp.isTlsFallback);
                            try {
                                connectTls(sSLSocket, connectionSpec);
                                this.call.getEventListener().secureConnectEnd(this.call, this.handshake);
                            } catch (SSLException e) {
                                connectPlanPlanWithCurrentOrInitialConnectionSpec$okhttp.nextConnectionSpec$okhttp(listConnectionSpecs, sSLSocket, e);
                                throw e;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.javaNetSocket = socket;
                List<Protocol> listProtocols = getRoute().address().protocols();
                Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                if (!listProtocols.contains(protocol)) {
                    protocol = Protocol.HTTP_1_1;
                }
                this.protocol = protocol;
                TaskRunner taskRunner = this.taskRunner;
                RealConnectionPool realConnectionPool = this.connectionPool;
                Route route = getRoute();
                Socket socket3 = this.javaNetSocket;
                socket3.getClass();
                Handshake handshake = this.handshake;
                Protocol protocol2 = this.protocol;
                protocol2.getClass();
                BufferedSocket bufferedSocket3 = this.socket;
                if (bufferedSocket3 == null) {
                    dh3.T("socket");
                    throw null;
                }
                RealConnection realConnection = new RealConnection(taskRunner, realConnectionPool, route, socket, socket3, handshake, protocol2, bufferedSocket3, this.pingIntervalMillis, this.connectionPool.getConnectionListener());
                this.connection = realConnection;
                realConnection.start();
                this.call.getEventListener().connectEnd(this.call, getRoute().socketAddress(), getRoute().proxy(), this.protocol);
                try {
                    RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(this, null, null, 6, null);
                    this.call.getPlansToCancel$okhttp().remove(this);
                    return connectResult;
                } catch (IOException e2) {
                    iOException = e2;
                    z = true;
                    this.call.getEventListener().connectFailed(this.call, getRoute().socketAddress(), getRoute().proxy(), null, iOException);
                    this.connectionPool.getConnectionListener().connectFailed(getRoute(), this.call, iOException);
                    RoutePlanner.ConnectResult connectResult2 = new RoutePlanner.ConnectResult(this, null, iOException);
                    this.call.getPlansToCancel$okhttp().remove(this);
                    if (!z) {
                        Socket socket4 = this.javaNetSocket;
                        if (socket4 != null) {
                            _UtilJvmKt.closeQuietly(socket4);
                        }
                        _UtilJvmKt.closeQuietly(socket);
                    }
                    return connectResult2;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    this.call.getPlansToCancel$okhttp().remove(this);
                    if (!z) {
                        Socket socket5 = this.javaNetSocket;
                        if (socket5 != null) {
                            _UtilJvmKt.closeQuietly(socket5);
                        }
                        _UtilJvmKt.closeQuietly(socket);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            iOException = e3;
        }
    }

    public final RoutePlanner.ConnectResult connectTunnel$okhttp() throws IOException {
        Request requestCreateTunnel = createTunnel();
        if (requestCreateTunnel == null) {
            return new RoutePlanner.ConnectResult(this, null, null, 6, null);
        }
        Socket socket = this.rawSocket;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
        int i = this.attempt + 1;
        if (i < 21) {
            this.call.getEventListener().connectEnd(this.call, getRoute().socketAddress(), getRoute().proxy(), null);
            return new RoutePlanner.ConnectResult(this, copy$default(this, null, i, requestCreateTunnel, 0, false, null, 57, null), null, 4, null);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        this.call.getEventListener().connectFailed(this.call, getRoute().socketAddress(), getRoute().proxy(), null, protocolException);
        this.connectionPool.getConnectionListener().connectFailed(getRoute(), this.call, protocolException);
        return new RoutePlanner.ConnectResult(this, null, protocolException, 2, null);
    }

    /* JADX INFO: renamed from: getConnectionSpecIndex$okhttp, reason: from getter */
    public final int getConnectionSpecIndex() {
        return this.connectionSpecIndex;
    }

    /* JADX INFO: renamed from: getJavaNetSocket$okhttp, reason: from getter */
    public final Socket getJavaNetSocket() {
        return this.javaNetSocket;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public Route getRoute() {
        return this.route;
    }

    public final List<Route> getRoutes$okhttp() {
        return this.routes;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: handleSuccess */
    public RealConnection mo168handleSuccess() {
        this.call.getClient().getRouteDatabase().connected(getRoute());
        RealConnection realConnection = this.connection;
        realConnection.getClass();
        realConnection.getConnectionListener().connectEnd(realConnection, getRoute(), this.call);
        ReusePlan reusePlanPlanReusePooledConnection$okhttp = this.routePlanner.planReusePooledConnection$okhttp(this, this.routes);
        if (reusePlanPlanReusePooledConnection$okhttp != null) {
            return reusePlanPlanReusePooledConnection$okhttp.getConnection();
        }
        synchronized (realConnection) {
            this.connectionPool.put(realConnection);
            this.call.acquireConnectionNoEvents(realConnection);
        }
        this.call.getEventListener().connectionAcquired(this.call, realConnection);
        realConnection.getConnectionListener().connectionAcquired(realConnection, this.call);
        return realConnection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: isReady */
    public boolean getIsReady() {
        return this.protocol != null;
    }

    /* JADX INFO: renamed from: isTlsFallback$okhttp, reason: from getter */
    public final boolean getIsTlsFallback() {
        return this.isTlsFallback;
    }

    public final ConnectPlan nextConnectionSpec$okhttp(List<ConnectionSpec> connectionSpecs, SSLSocket sslSocket, SSLException sslException) throws EchUntrustedException {
        connectionSpecs.getClass();
        sslSocket.getClass();
        sslException.getClass();
        if (this.echRetryPlan != null) {
            return null;
        }
        EchRetryPlan echRetryPlan = Platform.INSTANCE.get().echRetryPlan(sslException);
        if (echRetryPlan == null) {
            if (this.retryOnConnectionFailure && RetryTlsHandshakeKt.attemptAnotherConnectionSpec(sslException)) {
                return nextCompatibleConnectionSpec(connectionSpecs, sslSocket);
            }
            return null;
        }
        HostnameVerifier hostnameVerifier = getRoute().address().hostnameVerifier();
        hostnameVerifier.getClass();
        if (hostnameVerifier.verify(echRetryPlan.getPublicName(), sslSocket.getSession())) {
            return copy$default(this, new Route(getRoute().address(), getRoute().proxy(), getRoute().socketAddress(), echRetryPlan.getConfigList()), 0, null, 0, false, echRetryPlan, 30, null);
        }
        throw new EchUntrustedException("public_name '" + echRetryPlan.getPublicName() + "' not verified", sslException);
    }

    public final ConnectPlan planWithCurrentOrInitialConnectionSpec$okhttp(List<ConnectionSpec> connectionSpecs, SSLSocket sslSocket) throws IOException {
        connectionSpecs.getClass();
        sslSocket.getClass();
        if (this.connectionSpecIndex != -1) {
            return this;
        }
        ConnectPlan connectPlanNextCompatibleConnectionSpec = nextCompatibleConnectionSpec(connectionSpecs, sslSocket);
        if (connectPlanNextCompatibleConnectionSpec != null) {
            return connectPlanNextCompatibleConnectionSpec;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.isTlsFallback);
        sb.append(", modes=");
        sb.append(connectionSpecs);
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String string = Arrays.toString(enabledProtocols);
        string.getClass();
        sb.append(", supported protocols=");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: retry */
    public RoutePlanner.Plan mo169retry() {
        return new ConnectPlan(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.call, this.routePlanner, getRoute(), this.routes, this.attempt, this.tunnelRequest, this.connectionSpecIndex, this.isTlsFallback, this.echRetryPlan);
    }

    public final void setJavaNetSocket$okhttp(Socket socket) {
        this.javaNetSocket = socket;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public void trackFailure(RealCall call, IOException e) {
        call.getClass();
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public void noNewExchanges() {
    }

    public /* synthetic */ ConnectPlan(TaskRunner taskRunner, RealConnectionPool realConnectionPool, int i, int i2, int i3, int i4, int i5, boolean z, RealCall realCall, RealRoutePlanner realRoutePlanner, Route route, List list, int i6, Request request, int i7, boolean z2, EchRetryPlan echRetryPlan, int i8, ge1 ge1Var) {
        this(taskRunner, realConnectionPool, i, i2, i3, i4, i5, z, realCall, realRoutePlanner, route, list, i6, request, i7, z2, (i8 & DnsOverHttps.MAX_RESPONSE_SIZE) != 0 ? null : echRetryPlan);
    }
}
