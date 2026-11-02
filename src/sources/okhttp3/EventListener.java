package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\b&\u0018\u0000 ^2\u00020\u0001:\u0003_^`B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\bJ!\u0010'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J1\u0010+\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00132\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J9\u0010/\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00132\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b5\u00104J\u0017\u00106\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b6\u0010\bJ\u001f\u00109\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b;\u0010\bJ\u001f\u0010>\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bB\u0010\bJ\u001f\u0010E\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bG\u0010\bJ\u001f\u0010H\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\bH\u0010?J\u001f\u0010I\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\bI\u0010AJ\u0017\u0010J\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bJ\u0010\bJ\u001f\u0010K\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\bK\u0010AJ\u0017\u0010L\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bL\u0010\bJ\u001f\u0010M\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bM\u0010FJ\u001f\u0010N\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bN\u0010FJ\u0017\u0010O\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bO\u0010\bJ\u001f\u0010Q\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010P\u001a\u00020CH\u0016¢\u0006\u0004\bQ\u0010FJ'\u0010U\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010R\u001a\u00020-2\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJ)\u0010Y\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010W\u001a\u00020C2\b\u0010X\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\bY\u0010ZJ\u0018\u0010\\\u001a\u00020\u00002\u0006\u0010[\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\\\u0010]¨\u0006a"}, d2 = {"Lokhttp3/EventListener;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "Lokhttp3/Call;", "call", "Ldn8;", "callStart", "(Lokhttp3/Call;)V", "Lokhttp3/Dispatcher;", "dispatcher", "dispatcherQueueStart", "(Lokhttp3/Call;Lokhttp3/Dispatcher;)V", "dispatcherQueueEnd", "Lokhttp3/HttpUrl;", "url", "proxySelectStart", "(Lokhttp3/Call;Lokhttp3/HttpUrl;)V", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/net/Proxy;", "proxies", "proxySelectEnd", "(Lokhttp3/Call;Lokhttp3/HttpUrl;Ljava/util/List;)V", _UrlKt.FRAGMENT_ENCODE_SET, "domainName", "dnsStart", "(Lokhttp3/Call;Ljava/lang/String;)V", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "(Lokhttp3/Call;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "connectStart", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "secureConnectStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "(Lokhttp3/Call;Lokhttp3/Handshake;)V", "Lokhttp3/Protocol;", "protocol", "connectEnd", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V", "Ljava/io/IOException;", "ioe", "connectFailed", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V", "Lokhttp3/Connection;", "connection", "connectionAcquired", "(Lokhttp3/Call;Lokhttp3/Connection;)V", "connectionReleased", "requestHeadersStart", "Lokhttp3/Request;", "request", "requestHeadersEnd", "(Lokhttp3/Call;Lokhttp3/Request;)V", "requestBodyStart", _UrlKt.FRAGMENT_ENCODE_SET, "byteCount", "requestBodyEnd", "(Lokhttp3/Call;J)V", "requestFailed", "(Lokhttp3/Call;Ljava/io/IOException;)V", "responseHeadersStart", "Lokhttp3/Response;", "response", "responseHeadersEnd", "(Lokhttp3/Call;Lokhttp3/Response;)V", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", "canceled", "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "exception", _UrlKt.FRAGMENT_ENCODE_SET, "retry", "retryDecision", "(Lokhttp3/Call;Ljava/io/IOException;Z)V", "networkResponse", "nextRequest", "followUpDecision", "(Lokhttp3/Call;Lokhttp3/Response;Lokhttp3/Request;)V", "other", "plus", "(Lokhttp3/EventListener;)Lokhttp3/EventListener;", "Companion", "Factory", "AggregateEventListener", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class EventListener {
    public static final EventListener NONE = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0014H\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010$\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0015H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010\nJ!\u0010)\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J1\u0010-\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00152\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J9\u00101\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00152\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b7\u00106J\u0017\u00108\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b8\u0010\nJ\u001f\u0010;\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010\nJ\u001f\u0010@\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bD\u0010\nJ\u001f\u0010G\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bI\u0010\nJ\u001f\u0010J\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bJ\u0010AJ\u001f\u0010K\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\bK\u0010CJ\u0017\u0010L\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bL\u0010\nJ\u001f\u0010M\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\bM\u0010CJ\u0017\u0010N\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bN\u0010\nJ\u001f\u0010O\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bO\u0010HJ\u001f\u0010P\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bP\u0010HJ\u0017\u0010Q\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bQ\u0010\nJ\u001f\u0010S\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010R\u001a\u00020EH\u0016¢\u0006\u0004\bS\u0010HJ'\u0010W\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010T\u001a\u00020/2\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ)\u0010[\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020E2\b\u0010Z\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b[\u0010\\R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010]\u001a\u0004\b^\u0010_¨\u0006`"}, d2 = {"Lokhttp3/EventListener$AggregateEventListener;", "Lokhttp3/EventListener;", _UrlKt.FRAGMENT_ENCODE_SET, "eventListeners", "<init>", "([Lokhttp3/EventListener;)V", "Lokhttp3/Call;", "call", "Ldn8;", "callStart", "(Lokhttp3/Call;)V", "Lokhttp3/Dispatcher;", "dispatcher", "dispatcherQueueStart", "(Lokhttp3/Call;Lokhttp3/Dispatcher;)V", "dispatcherQueueEnd", "Lokhttp3/HttpUrl;", "url", "proxySelectStart", "(Lokhttp3/Call;Lokhttp3/HttpUrl;)V", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/net/Proxy;", "proxies", "proxySelectEnd", "(Lokhttp3/Call;Lokhttp3/HttpUrl;Ljava/util/List;)V", _UrlKt.FRAGMENT_ENCODE_SET, "domainName", "dnsStart", "(Lokhttp3/Call;Ljava/lang/String;)V", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "(Lokhttp3/Call;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "connectStart", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "secureConnectStart", "Lokhttp3/Handshake;", "handshake", "secureConnectEnd", "(Lokhttp3/Call;Lokhttp3/Handshake;)V", "Lokhttp3/Protocol;", "protocol", "connectEnd", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V", "Ljava/io/IOException;", "ioe", "connectFailed", "(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V", "Lokhttp3/Connection;", "connection", "connectionAcquired", "(Lokhttp3/Call;Lokhttp3/Connection;)V", "connectionReleased", "requestHeadersStart", "Lokhttp3/Request;", "request", "requestHeadersEnd", "(Lokhttp3/Call;Lokhttp3/Request;)V", "requestBodyStart", _UrlKt.FRAGMENT_ENCODE_SET, "byteCount", "requestBodyEnd", "(Lokhttp3/Call;J)V", "requestFailed", "(Lokhttp3/Call;Ljava/io/IOException;)V", "responseHeadersStart", "Lokhttp3/Response;", "response", "responseHeadersEnd", "(Lokhttp3/Call;Lokhttp3/Response;)V", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", "canceled", "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "exception", _UrlKt.FRAGMENT_ENCODE_SET, "retry", "retryDecision", "(Lokhttp3/Call;Ljava/io/IOException;Z)V", "networkResponse", "nextRequest", "followUpDecision", "(Lokhttp3/Call;Lokhttp3/Response;Lokhttp3/Request;)V", "[Lokhttp3/EventListener;", "getEventListeners", "()[Lokhttp3/EventListener;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AggregateEventListener extends EventListener {
        private final EventListener[] eventListeners;

        public AggregateEventListener(EventListener[] eventListenerArr) {
            eventListenerArr.getClass();
            this.eventListeners = eventListenerArr;
        }

        @Override // okhttp3.EventListener
        public void cacheConditionalHit(Call call, Response cachedResponse) {
            call.getClass();
            cachedResponse.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.cacheConditionalHit(call, cachedResponse);
            }
        }

        @Override // okhttp3.EventListener
        public void cacheHit(Call call, Response response) {
            call.getClass();
            response.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.cacheHit(call, response);
            }
        }

        @Override // okhttp3.EventListener
        public void cacheMiss(Call call) {
            call.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.cacheMiss(call);
            }
        }

        @Override // okhttp3.EventListener
        public void callEnd(Call call) {
            call.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.callEnd(call);
            }
        }

        @Override // okhttp3.EventListener
        public void callFailed(Call call, IOException ioe) {
            call.getClass();
            ioe.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.callFailed(call, ioe);
            }
        }

        @Override // okhttp3.EventListener
        public void callStart(Call call) {
            call.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.callStart(call);
            }
        }

        @Override // okhttp3.EventListener
        public void canceled(Call call) {
            call.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.canceled(call);
            }
        }

        @Override // okhttp3.EventListener
        public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
            call.getClass();
            inetSocketAddress.getClass();
            proxy.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.connectEnd(call, inetSocketAddress, proxy, protocol);
            }
        }

        @Override // okhttp3.EventListener
        public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
            call.getClass();
            inetSocketAddress.getClass();
            proxy.getClass();
            ioe.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.connectFailed(call, inetSocketAddress, proxy, protocol, ioe);
            }
        }

        @Override // okhttp3.EventListener
        public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
            call.getClass();
            inetSocketAddress.getClass();
            proxy.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.connectStart(call, inetSocketAddress, proxy);
            }
        }

        @Override // okhttp3.EventListener
        public void connectionAcquired(Call call, Connection connection) {
            call.getClass();
            connection.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.connectionAcquired(call, connection);
            }
        }

        @Override // okhttp3.EventListener
        public void connectionReleased(Call call, Connection connection) {
            call.getClass();
            connection.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.connectionReleased(call, connection);
            }
        }

        @Override // okhttp3.EventListener
        public void dispatcherQueueEnd(Call call, Dispatcher dispatcher) {
            call.getClass();
            dispatcher.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.dispatcherQueueEnd(call, dispatcher);
            }
        }

        @Override // okhttp3.EventListener
        public void dispatcherQueueStart(Call call, Dispatcher dispatcher) {
            call.getClass();
            dispatcher.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.dispatcherQueueStart(call, dispatcher);
            }
        }

        @Override // okhttp3.EventListener
        public void dnsEnd(Call call, String domainName, List<InetAddress> inetAddressList) {
            call.getClass();
            domainName.getClass();
            inetAddressList.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.dnsEnd(call, domainName, inetAddressList);
            }
        }

        @Override // okhttp3.EventListener
        public void dnsStart(Call call, String domainName) {
            call.getClass();
            domainName.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.dnsStart(call, domainName);
            }
        }

        @Override // okhttp3.EventListener
        public void followUpDecision(Call call, Response networkResponse, Request nextRequest) {
            call.getClass();
            networkResponse.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.followUpDecision(call, networkResponse, nextRequest);
            }
        }

        public final EventListener[] getEventListeners() {
            return this.eventListeners;
        }

        @Override // okhttp3.EventListener
        public void proxySelectEnd(Call call, HttpUrl url, List<Proxy> proxies) {
            call.getClass();
            url.getClass();
            proxies.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.proxySelectEnd(call, url, proxies);
            }
        }

        @Override // okhttp3.EventListener
        public void proxySelectStart(Call call, HttpUrl url) {
            call.getClass();
            url.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.proxySelectStart(call, url);
            }
        }

        @Override // okhttp3.EventListener
        public void requestBodyEnd(Call call, long byteCount) {
            call.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.requestBodyEnd(call, byteCount);
            }
        }

        @Override // okhttp3.EventListener
        public void requestBodyStart(Call call) {
            call.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.requestBodyStart(call);
            }
        }

        @Override // okhttp3.EventListener
        public void requestFailed(Call call, IOException ioe) {
            call.getClass();
            ioe.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.requestFailed(call, ioe);
            }
        }

        @Override // okhttp3.EventListener
        public void requestHeadersEnd(Call call, Request request) {
            call.getClass();
            request.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.requestHeadersEnd(call, request);
            }
        }

        @Override // okhttp3.EventListener
        public void requestHeadersStart(Call call) {
            call.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.requestHeadersStart(call);
            }
        }

        @Override // okhttp3.EventListener
        public void responseBodyEnd(Call call, long byteCount) {
            call.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.responseBodyEnd(call, byteCount);
            }
        }

        @Override // okhttp3.EventListener
        public void responseBodyStart(Call call) {
            call.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.responseBodyStart(call);
            }
        }

        @Override // okhttp3.EventListener
        public void responseFailed(Call call, IOException ioe) {
            call.getClass();
            ioe.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.responseFailed(call, ioe);
            }
        }

        @Override // okhttp3.EventListener
        public void responseHeadersEnd(Call call, Response response) {
            call.getClass();
            response.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.responseHeadersEnd(call, response);
            }
        }

        @Override // okhttp3.EventListener
        public void responseHeadersStart(Call call) {
            call.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.responseHeadersStart(call);
            }
        }

        @Override // okhttp3.EventListener
        public void retryDecision(Call call, IOException exception, boolean retry) {
            call.getClass();
            exception.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.retryDecision(call, exception, retry);
            }
        }

        @Override // okhttp3.EventListener
        public void satisfactionFailure(Call call, Response response) {
            call.getClass();
            response.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.satisfactionFailure(call, response);
            }
        }

        @Override // okhttp3.EventListener
        public void secureConnectEnd(Call call, Handshake handshake) {
            call.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.secureConnectEnd(call, handshake);
            }
        }

        @Override // okhttp3.EventListener
        public void secureConnectStart(Call call) {
            call.getClass();
            for (EventListener eventListener : this.eventListeners) {
                eventListener.secureConnectStart(call);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lokhttp3/EventListener$Factory;", _UrlKt.FRAGMENT_ENCODE_SET, "create", "Lokhttp3/EventListener;", "call", "Lokhttp3/Call;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        EventListener create(Call call);
    }

    public void cacheConditionalHit(Call call, Response cachedResponse) {
        call.getClass();
        cachedResponse.getClass();
    }

    public void cacheHit(Call call, Response response) {
        call.getClass();
        response.getClass();
    }

    public void cacheMiss(Call call) {
        call.getClass();
    }

    public void callEnd(Call call) {
        call.getClass();
    }

    public void callFailed(Call call, IOException ioe) {
        call.getClass();
        ioe.getClass();
    }

    public void callStart(Call call) {
        call.getClass();
    }

    public void canceled(Call call) {
        call.getClass();
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        ioe.getClass();
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
    }

    public void connectionAcquired(Call call, Connection connection) {
        call.getClass();
        connection.getClass();
    }

    public void connectionReleased(Call call, Connection connection) {
        call.getClass();
        connection.getClass();
    }

    public void dispatcherQueueEnd(Call call, Dispatcher dispatcher) {
        call.getClass();
        dispatcher.getClass();
    }

    public void dispatcherQueueStart(Call call, Dispatcher dispatcher) {
        call.getClass();
        dispatcher.getClass();
    }

    public void dnsEnd(Call call, String domainName, List<InetAddress> inetAddressList) {
        call.getClass();
        domainName.getClass();
        inetAddressList.getClass();
    }

    public void dnsStart(Call call, String domainName) {
        call.getClass();
        domainName.getClass();
    }

    public void followUpDecision(Call call, Response networkResponse, Request nextRequest) {
        call.getClass();
        networkResponse.getClass();
    }

    public final EventListener plus(EventListener other) {
        other.getClass();
        EventListener eventListener = NONE;
        if (this == eventListener) {
            return other;
        }
        EventListener[] eventListeners = this instanceof AggregateEventListener ? ((AggregateEventListener) this).getEventListeners() : new EventListener[]{this};
        if (other == eventListener) {
            return this;
        }
        EventListener[] eventListeners2 = other instanceof AggregateEventListener ? ((AggregateEventListener) other).getEventListeners() : new EventListener[]{other};
        eventListeners.getClass();
        eventListeners2.getClass();
        int length = eventListeners.length;
        int length2 = eventListeners2.length;
        Object[] objArrCopyOf = Arrays.copyOf(eventListeners, length + length2);
        System.arraycopy(eventListeners2, 0, objArrCopyOf, length, length2);
        return new AggregateEventListener((EventListener[]) objArrCopyOf);
    }

    public void proxySelectEnd(Call call, HttpUrl url, List<Proxy> proxies) {
        call.getClass();
        url.getClass();
        proxies.getClass();
    }

    public void proxySelectStart(Call call, HttpUrl url) {
        call.getClass();
        url.getClass();
    }

    public void requestBodyEnd(Call call, long byteCount) {
        call.getClass();
    }

    public void requestBodyStart(Call call) {
        call.getClass();
    }

    public void requestFailed(Call call, IOException ioe) {
        call.getClass();
        ioe.getClass();
    }

    public void requestHeadersEnd(Call call, Request request) {
        call.getClass();
        request.getClass();
    }

    public void requestHeadersStart(Call call) {
        call.getClass();
    }

    public void responseBodyEnd(Call call, long byteCount) {
        call.getClass();
    }

    public void responseBodyStart(Call call) {
        call.getClass();
    }

    public void responseFailed(Call call, IOException ioe) {
        call.getClass();
        ioe.getClass();
    }

    public void responseHeadersEnd(Call call, Response response) {
        call.getClass();
        response.getClass();
    }

    public void responseHeadersStart(Call call) {
        call.getClass();
    }

    public void retryDecision(Call call, IOException exception, boolean retry) {
        call.getClass();
        exception.getClass();
    }

    public void satisfactionFailure(Call call, Response response) {
        call.getClass();
        response.getClass();
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        call.getClass();
    }

    public void secureConnectStart(Call call) {
        call.getClass();
    }
}
