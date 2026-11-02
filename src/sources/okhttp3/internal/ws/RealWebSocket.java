package okhttp3.internal.ws;

import defpackage.bt;
import defpackage.dn8;
import defpackage.ea6;
import defpackage.em7;
import defpackage.hr5;
import defpackage.i21;
import defpackage.je7;
import defpackage.kb0;
import defpackage.oh;
import defpackage.oi0;
import defpackage.p61;
import defpackage.ra;
import defpackage.sa7;
import defpackage.ul4;
import defpackage.xw3;
import defpackage.yd7;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.BufferedSocket;
import okhttp3.internal.connection.BufferedSocketKt;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\u0018\u0000 \u0085\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\b\u0086\u0001\u0087\u0001\u0088\u0001\u0085\u0001BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#J%\u0010*\u001a\u00020\u00182\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u001c\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020)¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0018¢\u0006\u0004\b0\u0010\u001aJ\r\u00101\u001a\u00020\u0018¢\u0006\u0004\b1\u0010\u001aJ\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u000202¢\u0006\u0004\b5\u00104J\r\u00106\u001a\u000202¢\u0006\u0004\b6\u00104J\u0017\u00108\u001a\u00020\u00182\u0006\u00107\u001a\u00020%H\u0016¢\u0006\u0004\b8\u00109J\u0017\u00108\u001a\u00020\u00182\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b8\u0010<J\u0017\u0010>\u001a\u00020\u00182\u0006\u0010=\u001a\u00020:H\u0016¢\u0006\u0004\b>\u0010<J\u0017\u0010?\u001a\u00020\u00182\u0006\u0010=\u001a\u00020:H\u0016¢\u0006\u0004\b?\u0010<J\u001f\u0010B\u001a\u00020\u00182\u0006\u0010@\u001a\u0002022\u0006\u0010A\u001a\u00020%H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020)2\u0006\u00107\u001a\u00020%H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010D\u001a\u00020)2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\bD\u0010FJ\u0015\u0010G\u001a\u00020)2\u0006\u0010=\u001a\u00020:¢\u0006\u0004\bG\u0010FJ!\u0010H\u001a\u00020)2\u0006\u0010@\u001a\u0002022\b\u0010A\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\bH\u0010IJ'\u0010H\u001a\u00020)2\u0006\u0010@\u001a\u0002022\b\u0010A\u001a\u0004\u0018\u00010%2\u0006\u0010J\u001a\u00020\f¢\u0006\u0004\bH\u0010KJ\u000f\u0010M\u001a\u00020)H\u0000¢\u0006\u0004\bL\u0010/J\u000f\u0010O\u001a\u00020\u0018H\u0000¢\u0006\u0004\bN\u0010\u001aJ/\u0010T\u001a\u00020\u00182\n\u0010R\u001a\u00060Pj\u0002`Q2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010S\u001a\u00020)¢\u0006\u0004\bT\u0010UJ\u0013\u0010V\u001a\u00020)*\u00020\u000eH\u0002¢\u0006\u0004\bV\u0010WJ\u001f\u0010D\u001a\u00020)2\u0006\u0010X\u001a\u00020:2\u0006\u0010Y\u001a\u000202H\u0002¢\u0006\u0004\bD\u0010ZJ\u000f\u0010[\u001a\u00020\u0018H\u0002¢\u0006\u0004\b[\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\\R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010]\u001a\u0004\b^\u0010_R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010`R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010aR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010bR\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010aR\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010aR\u0014\u0010c\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR$\u0010f\u001a\u0004\u0018\u00010e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0018\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010p\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010v\u001a\u00020u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010dR\u0018\u0010(\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010xR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020:0y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020|0y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010{R\u0016\u0010\u0016\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010aR\u0016\u0010~\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0019\u0010\u0080\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010\u0082\u0001\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010dR\u0018\u0010\u0083\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u007fR\u0017\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b3\u0010\u0081\u0001R\u0017\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b5\u0010\u0081\u0001R\u0017\u00106\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b6\u0010\u0081\u0001R\u0018\u0010\u0084\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u007f¨\u0006\u0089\u0001"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "Lokhttp3/internal/concurrent/Lockable;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/Request;", "originalRequest", "Lokhttp3/WebSocketListener;", "listener", "Ljava/util/Random;", "random", _UrlKt.FRAGMENT_ENCODE_SET, "pingIntervalMillis", "Lokhttp3/internal/ws/WebSocketExtensions;", "extensions", "minimumDeflateSize", "webSocketCloseTimeout", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;JJ)V", "request", "()Lokhttp3/Request;", "queueSize", "()J", "Ldn8;", "cancel", "()V", "Lokhttp3/OkHttpClient;", "client", "connect", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Response;", "response", "Lyd7;", "checkUpgradeSuccess$okhttp", "(Lokhttp3/Response;)Lyd7;", "checkUpgradeSuccess", _UrlKt.FRAGMENT_ENCODE_SET, "name", "Lokhttp3/internal/connection/BufferedSocket;", "socket", _UrlKt.FRAGMENT_ENCODE_SET, "initReaderAndWriter", "(Ljava/lang/String;Lokhttp3/internal/connection/BufferedSocket;Z)V", "loopReader", "(Lokhttp3/Response;)V", "processNextFrame", "()Z", "finishReader", "tearDown", _UrlKt.FRAGMENT_ENCODE_SET, "sentPingCount", "()I", "receivedPingCount", "receivedPongCount", "text", "onReadMessage", "(Ljava/lang/String;)V", "Lkb0;", "bytes", "(Lkb0;)V", "payload", "onReadPing", "onReadPong", "code", "reason", "onReadClose", "(ILjava/lang/String;)V", "send", "(Ljava/lang/String;)Z", "(Lkb0;)Z", "pong", "close", "(ILjava/lang/String;)Z", "cancelAfterCloseMillis", "(ILjava/lang/String;J)Z", "writeOneFrame$okhttp", "writeOneFrame", "writePingFrame$okhttp", "writePingFrame", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "isWriter", "failWebSocket", "(Ljava/lang/Exception;Lokhttp3/Response;Z)V", "isValid", "(Lokhttp3/internal/ws/WebSocketExtensions;)Z", "data", "formatOpcode", "(Lkb0;I)Z", "runWriter", "Lokhttp3/Request;", "Lokhttp3/WebSocketListener;", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "Ljava/util/Random;", "J", "Lokhttp3/internal/ws/WebSocketExtensions;", "key", "Ljava/lang/String;", "Lokhttp3/Call;", "call", "Lokhttp3/Call;", "getCall$okhttp", "()Lokhttp3/Call;", "setCall$okhttp", "(Lokhttp3/Call;)V", "Lokhttp3/internal/concurrent/Task;", "writerTask", "Lokhttp3/internal/concurrent/Task;", "Lokhttp3/internal/ws/WebSocketReader;", "reader", "Lokhttp3/internal/ws/WebSocketReader;", "Lokhttp3/internal/ws/WebSocketWriter;", "writer", "Lokhttp3/internal/ws/WebSocketWriter;", "Lokhttp3/internal/concurrent/TaskQueue;", "taskQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "Lyd7;", "Ljava/util/ArrayDeque;", "pongQueue", "Ljava/util/ArrayDeque;", _UrlKt.FRAGMENT_ENCODE_SET, "messageAndCloseQueue", "enqueuedClose", "Z", "receivedCloseCode", "I", "receivedCloseReason", "failed", "awaitingPong", "Companion", "Message", "Close", "WriterTask", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback, Lockable {
    public static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private boolean awaitingPong;
    private Call call;
    private boolean enqueuedClose;
    private WebSocketExtensions extensions;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private String name;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<kb0> pongQueue;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private yd7 socket;
    private TaskQueue taskQueue;
    private final long webSocketCloseTimeout;
    private WebSocketWriter writer;
    private Task writerTask;
    private static final List<Protocol> ONLY_HTTP1 = i21.K(Protocol.HTTP_1_1);

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "code", "Lkb0;", "reason", _UrlKt.FRAGMENT_ENCODE_SET, "cancelAfterCloseMillis", "<init>", "(ILkb0;J)V", "I", "getCode", "()I", "Lkb0;", "getReason", "()Lkb0;", "J", "getCancelAfterCloseMillis", "()J", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final kb0 reason;

        public Close(int i, kb0 kb0Var, long j) {
            this.code = i;
            this.reason = kb0Var;
            this.cancelAfterCloseMillis = j;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        public final kb0 getReason() {
            return this.reason;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "formatOpcode", "Lkb0;", "data", "<init>", "(ILkb0;)V", "I", "getFormatOpcode", "()I", "Lkb0;", "getData", "()Lkb0;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Message {
        private final kb0 data;
        private final int formatOpcode;

        public Message(int i, kb0 kb0Var) {
            kb0Var.getClass();
            this.formatOpcode = i;
            this.data = kb0Var;
        }

        public final kb0 getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "<init>", "(Lokhttp3/internal/ws/RealWebSocket;)V", "runOnce", _UrlKt.FRAGMENT_ENCODE_SET, "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class WriterTask extends Task {
        public WriterTask() {
            super(RealWebSocket.this.name + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                return RealWebSocket.this.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (IOException e) {
                RealWebSocket.failWebSocket$default(RealWebSocket.this, e, null, true, 2, null);
                return -1L;
            }
        }
    }

    public RealWebSocket(TaskRunner taskRunner, Request request, WebSocketListener webSocketListener, Random random, long j, WebSocketExtensions webSocketExtensions, long j2, long j3) {
        taskRunner.getClass();
        request.getClass();
        webSocketListener.getClass();
        random.getClass();
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random;
        this.pingIntervalMillis = j;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j2;
        this.webSocketCloseTimeout = j3;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (!"GET".equals(request.method())) {
            xw3.z(request.method(), "Request must be GET: ");
            throw null;
        }
        kb0 kb0Var = kb0.f0;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.key = ra.l(bArr).a();
    }

    public static /* synthetic */ void failWebSocket$default(RealWebSocket realWebSocket, Exception exc, Response response, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            response = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        realWebSocket.failWebSocket(exc, response, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dn8 failWebSocket$lambda$0$0(ea6 ea6Var) {
        _UtilCommonKt.closeQuietly((Closeable) ea6Var.X);
        return dn8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dn8 finishReader$lambda$0$0(WebSocketWriter webSocketWriter) {
        _UtilCommonKt.closeQuietly(webSocketWriter);
        return dn8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long initReaderAndWriter$lambda$0$0(RealWebSocket realWebSocket, long j) {
        realWebSocket.writePingFrame$okhttp();
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (webSocketExtensions.unknownValues || webSocketExtensions.clientMaxWindowBits != null) {
            return false;
        }
        Integer num = webSocketExtensions.serverMaxWindowBits;
        if (num == null) {
            return true;
        }
        int iIntValue = num.intValue();
        return 8 <= iIntValue && iIntValue < 16;
    }

    private final void runWriter() {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            em7.e(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return;
        }
        Task task = this.writerTask;
        if (task != null) {
            TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
        }
    }

    private final synchronized boolean send(kb0 data, int formatOpcode) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + ((long) data.e()) > MAX_QUEUE_SIZE) {
                close(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, null);
                return false;
            }
            this.queueSize += (long) data.e();
            this.messageAndCloseQueue.add(new Message(formatOpcode, data));
            runWriter();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dn8 writeOneFrame$lambda$0$0(RealWebSocket realWebSocket) {
        realWebSocket.cancel();
        return dn8.a;
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        Call call = this.call;
        call.getClass();
        call.cancel();
    }

    public final yd7 checkUpgradeSuccess$okhttp(Response response) throws IOException {
        response.getClass();
        if (response.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
        }
        String strHeader$default = Response.header$default(response, "Connection", null, 2, null);
        if (!"Upgrade".equalsIgnoreCase(strHeader$default)) {
            throw new ProtocolException(p61.l('\'', "Expected 'Connection' header value 'Upgrade' but was '", strHeader$default));
        }
        String strHeader$default2 = Response.header$default(response, "Upgrade", null, 2, null);
        if (!"websocket".equalsIgnoreCase(strHeader$default2)) {
            throw new ProtocolException(p61.l('\'', "Expected 'Upgrade' header value 'websocket' but was '", strHeader$default2));
        }
        String strHeader$default3 = Response.header$default(response, "Sec-WebSocket-Accept", null, 2, null);
        kb0 kb0Var = kb0.f0;
        String strA = ra.g(this.key + WebSocketProtocol.ACCEPT_MAGIC).d("SHA-1").a();
        if (strA.equals(strHeader$default3)) {
            yd7 socket = response.getSocket();
            if (socket != null) {
                return socket;
            }
            xw3.k("Web Socket socket missing: bad interceptor?");
            return null;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA + "' but was '" + strHeader$default3 + '\'');
    }

    public final synchronized boolean close(int code, String reason, long cancelAfterCloseMillis) {
        kb0 kb0VarG;
        try {
            WebSocketProtocol.INSTANCE.validateCloseCode(code);
            if (reason != null) {
                kb0 kb0Var = kb0.f0;
                kb0VarG = ra.g(reason);
                if (kb0VarG.X.length > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: ".concat(reason).toString());
                }
            } else {
                kb0VarG = null;
            }
            if (!this.failed && !this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new Close(code, kb0VarG, cancelAfterCloseMillis));
                runWriter();
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void connect(OkHttpClient client) {
        client.getClass();
        if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
            failWebSocket$default(this, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, false, 6, null);
            return;
        }
        OkHttpClient okHttpClientBuild = client.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request requestBuild = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        RealCall realCall = new RealCall(okHttpClientBuild, requestBuild, true);
        this.call = realCall;
        realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket.connect.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e) {
                call.getClass();
                e.getClass();
                RealWebSocket.failWebSocket$default(RealWebSocket.this, e, null, false, 6, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws Throwable {
                je7 source;
                sa7 sink;
                call.getClass();
                response.getClass();
                try {
                    yd7 yd7VarCheckUpgradeSuccess$okhttp = RealWebSocket.this.checkUpgradeSuccess$okhttp(response);
                    WebSocketExtensions webSocketExtensions = WebSocketExtensions.INSTANCE.parse(response.headers());
                    RealWebSocket.this.extensions = webSocketExtensions;
                    if (!RealWebSocket.this.isValid(webSocketExtensions)) {
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        synchronized (realWebSocket) {
                            realWebSocket.messageAndCloseQueue.clear();
                            realWebSocket.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    RealWebSocket.this.initReaderAndWriter(_UtilJvmKt.okHttpName + " WebSocket " + requestBuild.url().redact(), BufferedSocketKt.asBufferedSocket(yd7VarCheckUpgradeSuccess$okhttp), true);
                    RealWebSocket.this.loopReader(response);
                } catch (IOException e) {
                    RealWebSocket.failWebSocket$default(RealWebSocket.this, e, response, false, 4, null);
                    _UtilCommonKt.closeQuietly(response);
                    yd7 socket = response.getSocket();
                    if (socket != null && (sink = socket.getSink()) != null) {
                        _UtilCommonKt.closeQuietly(sink);
                    }
                    yd7 socket2 = response.getSocket();
                    if (socket2 == null || (source = socket2.getSource()) == null) {
                        return;
                    }
                    _UtilCommonKt.closeQuietly(source);
                }
            }
        });
    }

    public final void failWebSocket(Exception e, Response response, boolean isWriter) {
        WebSocketWriter webSocketWriter;
        e.getClass();
        ea6 ea6Var = new ea6();
        synchronized (this) {
            try {
                if (this.failed) {
                    return;
                }
                byte b = 1;
                this.failed = true;
                yd7 yd7Var = this.socket;
                WebSocketWriter webSocketWriter2 = this.writer;
                ea6Var.X = webSocketWriter2;
                this.writer = null;
                if (!isWriter && webSocketWriter2 != null) {
                    TaskQueue.execute$default(this.taskQueue, this.name + " writer close", 0L, false, new ul4(ea6Var, b), 2, null);
                }
                this.taskQueue.shutdown();
                try {
                    this.listener.onFailure(this, e, response);
                } finally {
                    if (yd7Var != null) {
                        yd7Var.cancel();
                    }
                    if (isWriter && (webSocketWriter = (WebSocketWriter) ea6Var.X) != null) {
                        _UtilCommonKt.closeQuietly(webSocketWriter);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finishReader() {
        int i;
        String str;
        WebSocketReader webSocketReader;
        boolean z;
        synchronized (this) {
            try {
                i = this.receivedCloseCode;
                str = this.receivedCloseReason;
                webSocketReader = this.reader;
                this.reader = null;
                if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                    WebSocketWriter webSocketWriter = this.writer;
                    if (webSocketWriter != null) {
                        this.writer = null;
                        TaskQueue.execute$default(this.taskQueue, this.name + " writer close", 0L, false, new hr5(webSocketWriter, (byte) 4), 2, null);
                    }
                    this.taskQueue.shutdown();
                }
                z = (this.failed || this.writer != null || this.receivedCloseCode == -1) ? false : true;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            WebSocketListener webSocketListener = this.listener;
            str.getClass();
            webSocketListener.onClosed(this, i, str);
        }
        if (webSocketReader != null) {
            _UtilCommonKt.closeQuietly(webSocketReader);
        }
    }

    /* JADX INFO: renamed from: getCall$okhttp, reason: from getter */
    public final Call getCall() {
        return this.call;
    }

    /* JADX INFO: renamed from: getListener$okhttp, reason: from getter */
    public final WebSocketListener getListener() {
        return this.listener;
    }

    public final void initReaderAndWriter(String name, BufferedSocket socket, boolean client) {
        name.getClass();
        socket.getClass();
        WebSocketExtensions webSocketExtensions = this.extensions;
        webSocketExtensions.getClass();
        synchronized (this) {
            try {
                this.name = name;
                this.socket = socket;
                this.writer = new WebSocketWriter(client, socket.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(client), this.minimumDeflateSize);
                this.writerTask = new WriterTask();
                long j = this.pingIntervalMillis;
                if (j != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                    this.taskQueue.schedule(name.concat(" ping"), nanos, new oh(this, nanos, (byte) 2));
                }
                if (!this.messageAndCloseQueue.isEmpty()) {
                    runWriter();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.reader = new WebSocketReader(client, socket.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!client));
    }

    public final void loopReader(Response response) throws Throwable {
        Throwable th;
        RealWebSocket realWebSocket;
        response.getClass();
        try {
            this.listener.onOpen(this, response);
            while (this.receivedCloseCode == -1) {
                WebSocketReader webSocketReader = this.reader;
                webSocketReader.getClass();
                webSocketReader.processNextFrame();
            }
            finishReader();
        } catch (Exception e) {
            realWebSocket = this;
            try {
                failWebSocket$default(realWebSocket, e, null, false, 6, null);
                realWebSocket.finishReader();
            } catch (Throwable th2) {
                th = th2;
                realWebSocket.finishReader();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            realWebSocket = this;
            realWebSocket.finishReader();
            throw th;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int code, String reason) {
        reason.getClass();
        if (code == -1) {
            bt.q("Failed requirement.");
            return;
        }
        synchronized (this) {
            if (this.receivedCloseCode != -1) {
                throw new IllegalStateException("already closed");
            }
            this.receivedCloseCode = code;
            this.receivedCloseReason = reason;
        }
        this.listener.onClosing(this, code, reason);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(String text) throws IOException {
        text.getClass();
        this.listener.onMessage(this, text);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(kb0 payload) {
        try {
            payload.getClass();
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(payload);
                runWriter();
                this.receivedPingCount++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(kb0 payload) {
        payload.getClass();
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(kb0 payload) {
        try {
            payload.getClass();
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(payload);
                runWriter();
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean processNextFrame() throws IOException {
        try {
            WebSocketReader webSocketReader = this.reader;
            webSocketReader.getClass();
            webSocketReader.processNextFrame();
            return this.receivedCloseCode == -1;
        } catch (Exception e) {
            failWebSocket$default(this, e, null, false, 6, null);
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.WebSocket
    /* JADX INFO: renamed from: request, reason: from getter */
    public Request getOriginalRequest() {
        return this.originalRequest;
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void setCall$okhttp(Call call) {
        this.call = call;
    }

    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    public final boolean writeOneFrame$okhttp() throws IOException {
        String str;
        int i;
        WebSocketWriter webSocketWriter;
        synchronized (this) {
            try {
                boolean z = false;
                if (this.failed) {
                    return false;
                }
                WebSocketWriter webSocketWriter2 = this.writer;
                kb0 kb0VarPoll = this.pongQueue.poll();
                Object obj = null;
                if (kb0VarPoll == null) {
                    Object objPoll = this.messageAndCloseQueue.poll();
                    if (objPoll instanceof Close) {
                        i = this.receivedCloseCode;
                        str = this.receivedCloseReason;
                        if (i != -1) {
                            webSocketWriter = this.writer;
                            this.writer = null;
                            if (webSocketWriter != null && this.reader == null) {
                                z = true;
                            }
                            this.taskQueue.shutdown();
                        } else {
                            long cancelAfterCloseMillis = ((Close) objPoll).getCancelAfterCloseMillis();
                            TaskQueue.execute$default(this.taskQueue, this.name + " cancel", TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis), false, new hr5(this, (byte) 3), 4, null);
                            webSocketWriter = null;
                        }
                    } else {
                        if (objPoll == null) {
                            return false;
                        }
                        str = null;
                        i = -1;
                        webSocketWriter = null;
                    }
                    obj = objPoll;
                } else {
                    str = null;
                    i = -1;
                    webSocketWriter = null;
                }
                try {
                    if (kb0VarPoll != null) {
                        webSocketWriter2.getClass();
                        webSocketWriter2.writePong(kb0VarPoll);
                    } else if (obj instanceof Message) {
                        webSocketWriter2.getClass();
                        webSocketWriter2.writeMessageFrame(((Message) obj).getFormatOpcode(), ((Message) obj).getData());
                        synchronized (this) {
                            this.queueSize -= (long) ((Message) obj).getData().e();
                        }
                    } else {
                        if (!(obj instanceof Close)) {
                            throw new AssertionError();
                        }
                        webSocketWriter2.getClass();
                        webSocketWriter2.writeClose(((Close) obj).getCode(), ((Close) obj).getReason());
                        if (z) {
                            WebSocketListener webSocketListener = this.listener;
                            str.getClass();
                            webSocketListener.onClosed(this, i, str);
                        }
                    }
                    if (webSocketWriter != null) {
                        _UtilCommonKt.closeQuietly(webSocketWriter);
                    }
                    return true;
                } catch (Throwable th) {
                    if (webSocketWriter != null) {
                        _UtilCommonKt.closeQuietly(webSocketWriter);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void writePingFrame$okhttp() {
        synchronized (this) {
            try {
                if (this.failed) {
                    return;
                }
                WebSocketWriter webSocketWriter = this.writer;
                if (webSocketWriter == null) {
                    return;
                }
                int i = this.awaitingPong ? this.sentPingCount : -1;
                this.sentPingCount++;
                this.awaitingPong = true;
                if (i != -1) {
                    StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                    sb.append(this.pingIntervalMillis);
                    sb.append("ms (after ");
                    failWebSocket$default(this, new SocketTimeoutException(oi0.n(sb, i - 1, " successful ping/pongs)")), null, true, 2, null);
                    return;
                }
                try {
                    webSocketWriter.writePing(kb0.f0);
                } catch (IOException e) {
                    failWebSocket$default(this, e, null, true, 2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(kb0 bytes) throws IOException {
        bytes.getClass();
        this.listener.onMessage(this, bytes);
    }

    @Override // okhttp3.WebSocket
    public boolean send(kb0 bytes) {
        bytes.getClass();
        return send(bytes, 2);
    }

    @Override // okhttp3.WebSocket
    public boolean send(String text) {
        text.getClass();
        kb0 kb0Var = kb0.f0;
        return send(ra.g(text), 1);
    }

    @Override // okhttp3.WebSocket
    public boolean close(int code, String reason) {
        return close(code, reason, this.webSocketCloseTimeout);
    }
}
