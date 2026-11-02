package okhttp3.internal.connection;

import defpackage.bk2;
import defpackage.bt;
import defpackage.ck2;
import defpackage.dh3;
import defpackage.i90;
import defpackage.j76;
import defpackage.je7;
import defpackage.sa7;
import defpackage.xw3;
import defpackage.yd7;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002LMB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b(\u0010)J\r\u0010+\u001a\u00020*¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\f¢\u0006\u0004\b-\u0010\u0019J\r\u0010.\u001a\u00020\f¢\u0006\u0004\b.\u0010\u0019J\r\u0010/\u001a\u00020\f¢\u0006\u0004\b/\u0010\u0019J?\u00105\u001a\u0004\u0018\u00010\n2\b\b\u0002\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u00020\u00132\b\b\u0002\u00104\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\f¢\u0006\u0004\b7\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R$\u0010@\u001a\u00020\u00132\u0006\u0010?\u001a\u00020\u00138\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR$\u0010D\u001a\u00020\u00132\u0006\u0010?\u001a\u00020\u00138\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\u0014\u0010I\u001a\u00020F8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010C¨\u0006N"}, d2 = {"Lokhttp3/internal/connection/Exchange;", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/connection/RealCall;", "call", "Lokhttp3/internal/connection/ExchangeFinder;", "finder", "Lokhttp3/internal/http/ExchangeCodec;", "codec", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/internal/connection/ExchangeFinder;Lokhttp3/internal/http/ExchangeCodec;)V", "Ljava/io/IOException;", "e", "Ldn8;", "trackFailure", "(Ljava/io/IOException;)V", "Lokhttp3/Request;", "request", "writeRequestHeaders", "(Lokhttp3/Request;)V", _UrlKt.FRAGMENT_ENCODE_SET, "duplex", "Lsa7;", "createRequestBody", "(Lokhttp3/Request;Z)Lsa7;", "flushRequest", "()V", "finishRequest", "responseHeadersStart", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lokhttp3/Response$Builder;", "Lokhttp3/Response;", "response", "responseHeadersEnd", "(Lokhttp3/Response;)V", "Lokhttp3/ResponseBody;", "openResponseBody", "(Lokhttp3/Response;)Lokhttp3/ResponseBody;", "Lokhttp3/Headers;", "peekTrailers", "()Lokhttp3/Headers;", "Lyd7;", "upgradeToSocket", "()Lyd7;", "noNewExchangesOnConnection", "cancel", "detachWithViolence", _UrlKt.FRAGMENT_ENCODE_SET, "bytesRead", "isSocket", "responseDone", "requestDone", "bodyComplete", "(JZZZLjava/io/IOException;)Ljava/io/IOException;", "noRequestBody", "Lokhttp3/internal/connection/RealCall;", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "Lokhttp3/internal/connection/ExchangeFinder;", "getFinder$okhttp", "()Lokhttp3/internal/connection/ExchangeFinder;", "Lokhttp3/internal/http/ExchangeCodec;", "value", "isDuplex", "Z", "isDuplex$okhttp", "()Z", "hasFailure", "getHasFailure$okhttp", "Lokhttp3/internal/connection/RealConnection;", "getConnection$okhttp", "()Lokhttp3/internal/connection/RealConnection;", "connection", "isCoalescedConnection$okhttp", "isCoalescedConnection", "RequestBodySink", "ResponseBodySource", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Exchange {
    private final RealCall call;
    private final ExchangeCodec codec;
    private final ExchangeFinder finder;
    private boolean hasFailure;
    private boolean isDuplex;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/connection/Exchange$RequestBodySink;", "Lbk2;", "Lsa7;", "delegate", _UrlKt.FRAGMENT_ENCODE_SET, "contentLength", _UrlKt.FRAGMENT_ENCODE_SET, "isSocket", "<init>", "(Lokhttp3/internal/connection/Exchange;Lsa7;JZ)V", "Ljava/io/IOException;", "e", "complete", "(Ljava/io/IOException;)Ljava/io/IOException;", "Li90;", "source", "byteCount", "Ldn8;", "write", "(Li90;J)V", "flush", "()V", "close", "J", "Z", "completed", "bytesReceived", "invokeStartEvent", "closed", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class RequestBodySink extends bk2 {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        private final boolean isSocket;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, sa7 sa7Var, long j, boolean z) {
            super(sa7Var);
            sa7Var.getClass();
            this.this$0 = exchange;
            this.contentLength = j;
            this.isSocket = z;
            this.invokeStartEvent = z;
        }

        private final IOException complete(IOException e) {
            if (this.completed) {
                return e;
            }
            this.completed = true;
            return Exchange.bodyComplete$default(this.this$0, this.bytesReceived, this.isSocket, false, true, e, 4, null);
        }

        @Override // defpackage.bk2, defpackage.sa7, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j = this.contentLength;
            if (j != -1 && this.bytesReceived != j) {
                xw3.k("unexpected end of stream");
                return;
            }
            try {
                super.close();
                complete(null);
            } catch (IOException e) {
                IOException iOExceptionComplete = complete(e);
                iOExceptionComplete.getClass();
                throw iOExceptionComplete;
            }
        }

        @Override // defpackage.bk2, defpackage.sa7, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                IOException iOExceptionComplete = complete(e);
                iOExceptionComplete.getClass();
                throw iOExceptionComplete;
            }
        }

        @Override // defpackage.bk2, defpackage.sa7
        public void write(i90 source, long byteCount) throws IOException {
            source.getClass();
            if (this.closed) {
                bt.i("closed");
                return;
            }
            long j = this.contentLength;
            if (j != -1 && this.bytesReceived + byteCount > j) {
                throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + byteCount));
            }
            try {
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.this$0.getCall().getEventListener().requestBodyStart(this.this$0.getCall());
                }
                super.write(source, byteCount);
                this.bytesReceived += byteCount;
            } catch (IOException e) {
                IOException iOExceptionComplete = complete(e);
                iOExceptionComplete.getClass();
                throw iOExceptionComplete;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/connection/Exchange$ResponseBodySource;", "Lck2;", "Lje7;", "delegate", _UrlKt.FRAGMENT_ENCODE_SET, "contentLength", _UrlKt.FRAGMENT_ENCODE_SET, "isSocket", "<init>", "(Lokhttp3/internal/connection/Exchange;Lje7;JZ)V", "Li90;", "sink", "byteCount", "read", "(Li90;J)J", "Ldn8;", "close", "()V", "Ljava/io/IOException;", "e", "complete", "(Ljava/io/IOException;)Ljava/io/IOException;", "J", "Z", "bytesReceived", "invokeStartEvent", "completed", "closed", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ResponseBodySource extends ck2 {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        private final boolean isSocket;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, je7 je7Var, long j, boolean z) {
            super(je7Var);
            je7Var.getClass();
            this.this$0 = exchange;
            this.contentLength = j;
            this.isSocket = z;
            this.invokeStartEvent = true;
            if (j == 0) {
                complete(null);
            }
        }

        @Override // defpackage.ck2, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                complete(null);
            } catch (IOException e) {
                IOException iOExceptionComplete = complete(e);
                iOExceptionComplete.getClass();
                throw iOExceptionComplete;
            }
        }

        public final IOException complete(IOException e) {
            if (this.completed) {
                return e;
            }
            this.completed = true;
            if (e == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.this$0.getCall().getEventListener().responseBodyStart(this.this$0.getCall());
            }
            return Exchange.bodyComplete$default(this.this$0, this.bytesReceived, this.isSocket, true, false, e, 8, null);
        }

        @Override // defpackage.ck2, defpackage.je7
        public long read(i90 sink, long byteCount) throws IOException {
            sink.getClass();
            if (this.closed) {
                bt.i("closed");
                return 0L;
            }
            try {
                long j = delegate().read(sink, byteCount);
                if (this.invokeStartEvent) {
                    this.invokeStartEvent = false;
                    this.this$0.getCall().getEventListener().responseBodyStart(this.this$0.getCall());
                }
                if (j == -1) {
                    complete(null);
                    return -1L;
                }
                long j2 = this.bytesReceived + j;
                long j3 = this.contentLength;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j2);
                }
                this.bytesReceived = j2;
                if (this.this$0.codec.isResponseComplete()) {
                    complete(null);
                }
                return j;
            } catch (IOException e) {
                IOException iOExceptionComplete = complete(e);
                iOExceptionComplete.getClass();
                throw iOExceptionComplete;
            }
        }
    }

    public Exchange(RealCall realCall, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
        realCall.getClass();
        exchangeFinder.getClass();
        exchangeCodec.getClass();
        this.call = realCall;
        this.finder = exchangeFinder;
        this.codec = exchangeCodec;
    }

    public static /* synthetic */ IOException bodyComplete$default(Exchange exchange, long j, boolean z, boolean z2, boolean z3, IOException iOException, int i, Object obj) {
        if ((i & 1) != 0) {
            j = -1;
        }
        return exchange.bodyComplete(j, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, iOException);
    }

    private final void trackFailure(IOException e) {
        this.hasFailure = true;
        this.codec.getCarrier().trackFailure(this.call, e);
    }

    public final IOException bodyComplete(long bytesRead, boolean isSocket, boolean responseDone, boolean requestDone, IOException e) {
        if (e != null) {
            trackFailure(e);
        }
        if (requestDone) {
            RealCall realCall = this.call;
            if (e != null) {
                realCall.getEventListener().requestFailed(this.call, e);
            } else {
                realCall.getEventListener().requestBodyEnd(this.call, bytesRead);
            }
        }
        if (responseDone) {
            RealCall realCall2 = this.call;
            if (e != null) {
                realCall2.getEventListener().responseFailed(this.call, e);
            } else {
                realCall2.getEventListener().responseBodyEnd(this.call, bytesRead);
            }
        }
        RealCall realCall3 = this.call;
        boolean z = false;
        if (requestDone && !isSocket) {
            z = true;
        }
        return realCall3.messageDone$okhttp(this, z, (!responseDone || isSocket) ? z : true, responseDone && isSocket != 0, (requestDone && isSocket) ? true : z, e);
    }

    public final void cancel() {
        this.codec.cancel();
    }

    public final sa7 createRequestBody(Request request, boolean duplex) throws IOException {
        request.getClass();
        this.isDuplex = duplex;
        RequestBody requestBodyBody = request.body();
        requestBodyBody.getClass();
        long jContentLength = requestBodyBody.contentLength();
        this.call.getEventListener().requestBodyStart(this.call);
        return new RequestBodySink(this, this.codec.createRequestBody(request, jContentLength), jContentLength, false);
    }

    public final void detachWithViolence() {
        this.codec.cancel();
        this.call.messageDone$okhttp(this, true, true, true, true, null);
    }

    public final void finishRequest() throws IOException {
        try {
            this.codec.finishRequest();
        } catch (IOException e) {
            this.call.getEventListener().requestFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public final void flushRequest() throws IOException {
        try {
            this.codec.flushRequest();
        } catch (IOException e) {
            this.call.getEventListener().requestFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: getCall$okhttp, reason: from getter */
    public final RealCall getCall() {
        return this.call;
    }

    public final RealConnection getConnection$okhttp() {
        ExchangeCodec.Carrier carrier = this.codec.getCarrier();
        RealConnection realConnection = carrier instanceof RealConnection ? (RealConnection) carrier : null;
        if (realConnection != null) {
            return realConnection;
        }
        bt.i("no connection for CONNECT tunnels");
        return null;
    }

    /* JADX INFO: renamed from: getFinder$okhttp, reason: from getter */
    public final ExchangeFinder getFinder() {
        return this.finder;
    }

    /* JADX INFO: renamed from: getHasFailure$okhttp, reason: from getter */
    public final boolean getHasFailure() {
        return this.hasFailure;
    }

    public final boolean isCoalescedConnection$okhttp() {
        return !dh3.f(this.finder.getRoutePlanner().getAddress().url().host(), this.codec.getCarrier().getRoute().address().url().host());
    }

    /* JADX INFO: renamed from: isDuplex$okhttp, reason: from getter */
    public final boolean getIsDuplex() {
        return this.isDuplex;
    }

    public final void noNewExchangesOnConnection() {
        this.codec.getCarrier().noNewExchanges();
    }

    public final void noRequestBody() {
        RealCall.messageDone$okhttp$default(this.call, this, true, false, false, false, null, 28, null);
    }

    public final ResponseBody openResponseBody(Response response) throws IOException {
        Exchange exchange;
        response.getClass();
        try {
            String strHeader$default = Response.header$default(response, "Content-Type", null, 2, null);
            long jReportedContentLength = this.codec.reportedContentLength(response);
            exchange = this;
            try {
                return new RealResponseBody(strHeader$default, jReportedContentLength, new j76(new ResponseBodySource(exchange, this.codec.openResponseBodySource(response), jReportedContentLength, false)));
            } catch (IOException e) {
                e = e;
                IOException iOException = e;
                exchange.call.getEventListener().responseFailed(exchange.call, iOException);
                exchange.trackFailure(iOException);
                throw iOException;
            }
        } catch (IOException e2) {
            e = e2;
            exchange = this;
        }
    }

    public final Headers peekTrailers() throws IOException {
        return this.codec.peekTrailers();
    }

    public final Response.Builder readResponseHeaders(boolean expectContinue) throws IOException {
        try {
            Response.Builder responseHeaders = this.codec.readResponseHeaders(expectContinue);
            if (responseHeaders == null) {
                return responseHeaders;
            }
            responseHeaders.initExchange$okhttp(this);
            return responseHeaders;
        } catch (IOException e) {
            this.call.getEventListener().responseFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public final void responseHeadersEnd(Response response) {
        response.getClass();
        this.call.getEventListener().responseHeadersEnd(this.call, response);
    }

    public final void responseHeadersStart() {
        this.call.getEventListener().responseHeadersStart(this.call);
    }

    public final yd7 upgradeToSocket() throws SocketException {
        this.call.upgradeToSocket();
        ExchangeCodec.Carrier carrier = this.codec.getCarrier();
        carrier.getClass();
        ((RealConnection) carrier).useAsSocket$okhttp();
        return new yd7() { // from class: okhttp3.internal.connection.Exchange.upgradeToSocket.1
            private final RequestBodySink sink;
            private final ResponseBodySource source;

            {
                this.sink = new RequestBodySink(Exchange.this, Exchange.this.codec.getSocket().getSink(), -1L, true);
                this.source = new ResponseBodySource(Exchange.this, Exchange.this.codec.getSocket().getSource(), -1L, true);
            }

            @Override // defpackage.yd7
            public void cancel() {
                Exchange.this.cancel();
            }

            @Override // defpackage.yd7
            public RequestBodySink getSink() {
                return this.sink;
            }

            @Override // defpackage.yd7
            public ResponseBodySource getSource() {
                return this.source;
            }
        };
    }

    public final void writeRequestHeaders(Request request) throws IOException {
        request.getClass();
        try {
            this.call.getEventListener().requestHeadersStart(this.call);
            this.codec.writeRequestHeaders(request);
            this.call.getEventListener().requestHeadersEnd(this.call, request);
        } catch (IOException e) {
            this.call.getEventListener().requestFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }
}
