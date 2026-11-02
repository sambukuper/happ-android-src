package okhttp3;

import defpackage.ba0;
import defpackage.bt;
import defpackage.dh3;
import defpackage.em7;
import defpackage.ge1;
import defpackage.hi5;
import defpackage.i90;
import defpackage.ie2;
import defpackage.j76;
import defpackage.je7;
import defpackage.kb0;
import defpackage.od5;
import defpackage.ra;
import defpackage.sa8;
import defpackage.ta8;
import defpackage.xw3;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal.http1.HeadersReader;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0003'(&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u001c\u0010$\u001a\b\u0018\u00010#R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "Lba0;", "source", _UrlKt.FRAGMENT_ENCODE_SET, "boundary", "<init>", "(Lba0;Ljava/lang/String;)V", "Lokhttp3/ResponseBody;", "response", "(Lokhttp3/ResponseBody;)V", _UrlKt.FRAGMENT_ENCODE_SET, "maxByteCount", "currentPartBytesRemaining", "(J)J", "Lokhttp3/MultipartReader$Part;", "nextPart", "()Lokhttp3/MultipartReader$Part;", "Ldn8;", "close", "()V", "Lba0;", "Ljava/lang/String;", "()Ljava/lang/String;", "Lkb0;", "dashDashBoundary", "Lkb0;", "crlfDashDashBoundary", _UrlKt.FRAGMENT_ENCODE_SET, "partCount", "I", _UrlKt.FRAGMENT_ENCODE_SET, "closed", "Z", "noMoreParts", "Lokhttp3/MultipartReader$PartSource;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "Companion", "PartSource", "Part", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultipartReader implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final od5 afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final kb0 crlfDashDashBoundary;
    private PartSource currentPart;
    private final kb0 dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final ba0 source;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\u0003\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "Lokhttp3/Headers;", "headers", "Lba0;", "body", "<init>", "(Lokhttp3/Headers;Lba0;)V", "Ldn8;", "close", "()V", "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "Lba0;", "()Lba0;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Part implements Closeable {
        private final ba0 body;
        private final Headers headers;

        public Part(Headers headers, ba0 ba0Var) {
            headers.getClass();
            ba0Var.getClass();
            this.headers = headers;
            this.body = ba0Var;
        }

        /* JADX INFO: renamed from: body, reason: from getter */
        public final ba0 getBody() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.body.close();
        }

        /* JADX INFO: renamed from: headers, reason: from getter */
        public final Headers getHeaders() {
            return this.headers;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lje7;", "<init>", "(Lokhttp3/MultipartReader;)V", "Ldn8;", "close", "()V", "Li90;", "sink", _UrlKt.FRAGMENT_ENCODE_SET, "byteCount", "read", "(Li90;J)J", "Lta8;", "timeout", "()Lta8;", "Lta8;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class PartSource implements je7 {
        private final ta8 timeout = new ta8();

        public PartSource() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (dh3.f(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // defpackage.je7
        public long read(i90 sink, long byteCount) {
            sink.getClass();
            if (byteCount < 0) {
                em7.c(ie2.f(byteCount, "byteCount < 0: "));
                return 0L;
            }
            if (!dh3.f(MultipartReader.this.currentPart, this)) {
                bt.i("closed");
                return 0L;
            }
            ta8 timeout = MultipartReader.this.source.getTimeout();
            ta8 ta8Var = this.timeout;
            MultipartReader multipartReader = MultipartReader.this;
            long jTimeoutNanos = timeout.timeoutNanos();
            sa8 sa8Var = ta8.Companion;
            long jTimeoutNanos2 = ta8Var.timeoutNanos();
            long jTimeoutNanos3 = timeout.timeoutNanos();
            sa8Var.getClass();
            if (jTimeoutNanos2 == 0 || (jTimeoutNanos3 != 0 && jTimeoutNanos2 >= jTimeoutNanos3)) {
                jTimeoutNanos2 = jTimeoutNanos3;
            }
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            timeout.timeout(jTimeoutNanos2, timeUnit);
            if (!timeout.hasDeadline()) {
                if (ta8Var.hasDeadline()) {
                    timeout.deadlineNanoTime(ta8Var.deadlineNanoTime());
                }
                try {
                    long jCurrentPartBytesRemaining = multipartReader.currentPartBytesRemaining(byteCount);
                    return jCurrentPartBytesRemaining == 0 ? -1L : multipartReader.source.read(sink, jCurrentPartBytesRemaining);
                } finally {
                    timeout.timeout(jTimeoutNanos, timeUnit);
                    if (ta8Var.hasDeadline()) {
                        timeout.clearDeadline();
                    }
                }
            }
            long jDeadlineNanoTime = timeout.deadlineNanoTime();
            if (ta8Var.hasDeadline()) {
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), ta8Var.deadlineNanoTime()));
            }
            try {
                long jCurrentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(byteCount);
                return jCurrentPartBytesRemaining2 == 0 ? -1L : multipartReader.source.read(sink, jCurrentPartBytesRemaining2);
            } finally {
                timeout.timeout(jTimeoutNanos, timeUnit);
                if (ta8Var.hasDeadline()) {
                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                }
            }
        }

        @Override // defpackage.je7
        /* JADX INFO: renamed from: timeout, reason: from getter */
        public ta8 getTimeout() {
            return this.timeout;
        }
    }

    static {
        kb0 kb0Var = kb0.f0;
        afterBoundaryOptions = hi5.q0(ra.g("\r\n"), ra.g("--"), ra.g(" "), ra.g("\t"));
    }

    public MultipartReader(ba0 ba0Var, String str) throws IOException {
        ba0Var.getClass();
        str.getClass();
        this.source = ba0Var;
        this.boundary = str;
        i90 i90Var = new i90();
        i90Var.d1("--");
        i90Var.d1(str);
        this.dashDashBoundary = i90Var.s(i90Var.Y);
        i90 i90Var2 = new i90();
        i90Var2.d1("\r\n--");
        i90Var2.d1(str);
        this.crlfDashDashBoundary = i90Var2.s(i90Var2.Y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long maxByteCount) throws EOFException {
        long jMin = Math.min(this.source.c().Y, maxByteCount) + 1;
        long jS = this.source.S(jMin, this.crlfDashDashBoundary);
        if (jS != -1) {
            return jS;
        }
        if (this.source.c().Y >= jMin) {
            return Math.min(jMin, maxByteCount);
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: boundary, reason: from getter */
    public final String getBoundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() throws IOException {
        ba0 ba0Var;
        if (this.closed) {
            bt.i("closed");
            return null;
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.q(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.e());
        } else {
            while (true) {
                long jCurrentPartBytesRemaining = currentPartBytesRemaining(8192L);
                ba0Var = this.source;
                if (jCurrentPartBytesRemaining == 0) {
                    break;
                }
                ba0Var.skip(jCurrentPartBytesRemaining);
            }
            ba0Var.skip(this.crlfDashDashBoundary.e());
        }
        boolean z = false;
        while (true) {
            int iH = this.source.H(afterBoundaryOptions);
            if (iH == -1) {
                xw3.k("unexpected characters after boundary");
                return null;
            }
            if (iH == 0) {
                this.partCount++;
                Headers headers = new HeadersReader(this.source).readHeaders();
                PartSource partSource = new PartSource();
                this.currentPart = partSource;
                return new Part(headers, new j76(partSource));
            }
            if (iH == 1) {
                if (z) {
                    xw3.k("unexpected characters after boundary");
                    return null;
                }
                if (this.partCount != 0) {
                    this.noMoreParts = true;
                    return null;
                }
                xw3.k("expected at least 1 part");
                return null;
            }
            if (iH == 2 || iH == 3) {
                z = true;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/MultipartReader$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "Lod5;", "afterBoundaryOptions", "Lod5;", "getAfterBoundaryOptions", "()Lod5;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(ge1 ge1Var) {
            this();
        }

        public final od5 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultipartReader(ResponseBody responseBody) throws IOException {
        String strParameter;
        responseBody.getClass();
        ba0 bodySource = responseBody.getBodySource();
        MediaType mediaType = responseBody.getMediaType();
        if (mediaType != null && (strParameter = mediaType.parameter("boundary")) != null) {
            this(bodySource, strParameter);
        } else {
            xw3.k("expected the Content-Type to have a boundary parameter");
            throw null;
        }
    }
}
