package okhttp3;

import defpackage.ba0;
import defpackage.ge1;
import defpackage.gn2;
import defpackage.gv3;
import defpackage.i90;
import defpackage.ie2;
import defpackage.kb0;
import defpackage.kp5;
import defpackage.qg5;
import defpackage.ti1;
import defpackage.u52;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u0004*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0006H\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010\u0003R\u0018\u0010)\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "<init>", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "T", "Lkotlin/Function1;", "Lba0;", "consumer", _UrlKt.FRAGMENT_ENCODE_SET, "sizeMapper", "consumeSource", "(Lokhttp3/ResponseBody;Lgn2;Lgn2;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "()Ljava/nio/charset/Charset;", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", _UrlKt.FRAGMENT_ENCODE_SET, "contentLength", "()J", "Ljava/io/InputStream;", "byteStream", "()Ljava/io/InputStream;", "source", "()Lba0;", _UrlKt.FRAGMENT_ENCODE_SET, "bytes", "()[B", "Lkb0;", "byteString", "()Lkb0;", "Ljava/io/Reader;", "charStream", "()Ljava/io/Reader;", _UrlKt.FRAGMENT_ENCODE_SET, "string", "()Ljava/lang/String;", "Ldn8;", "close", "reader", "Ljava/io/Reader;", "Companion", "BomAwareReader", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ResponseBody implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ResponseBody EMPTY;
    private Reader reader;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "Lba0;", "source", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lba0;Ljava/nio/charset/Charset;)V", _UrlKt.FRAGMENT_ENCODE_SET, "cbuf", _UrlKt.FRAGMENT_ENCODE_SET, "off", "len", "read", "([CII)I", "Ldn8;", "close", "()V", "Lba0;", "Ljava/nio/charset/Charset;", _UrlKt.FRAGMENT_ENCODE_SET, "closed", "Z", "delegate", "Ljava/io/Reader;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final ba0 source;

        public BomAwareReader(ba0 ba0Var, Charset charset) {
            ba0Var.getClass();
            charset.getClass();
            this.source = ba0Var;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int off, int len) throws IOException {
            cbuf.getClass();
            if (this.closed) {
                u52.s("Stream closed");
                return 0;
            }
            Reader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.Y0(), _UtilJvmKt.readBomAsCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, off, len);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        EMPTY = Companion.create$default(companion, kb0.f0, (MediaType) null, 1, (Object) null);
    }

    private final Charset charset() {
        return Internal.charsetOrUtf8(get$contentType());
    }

    private final <T> T consumeSource(ResponseBody responseBody, gn2 gn2Var, gn2 gn2Var2) throws Throwable {
        Throwable th;
        T t;
        long jContentLength = responseBody.get$contentLength();
        if (jContentLength > 2147483647L) {
            u52.s(ie2.f(jContentLength, "Cannot buffer entire body for content length: "));
            return null;
        }
        ba0 ba0VarSource = responseBody.get$this_asResponseBody();
        try {
            t = (T) gn2Var.B(ba0VarSource);
            if (ba0VarSource != null) {
                try {
                    ba0VarSource.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = null;
        } catch (Throwable th3) {
            if (ba0VarSource != null) {
                try {
                    ba0VarSource.close();
                } catch (Throwable th4) {
                    gv3.g(th3, th4);
                }
            }
            th = th3;
            t = null;
        }
        if (th != null) {
            throw th;
        }
        int iIntValue = ((Number) gn2Var2.B(t)).intValue();
        if (jContentLength == -1 || jContentLength == iIntValue) {
            return t;
        }
        kp5.f(iIntValue, jContentLength);
        return null;
    }

    public static final ResponseBody create(ba0 ba0Var, MediaType mediaType, long j) {
        return INSTANCE.create(ba0Var, mediaType, j);
    }

    public final InputStream byteStream() {
        return get$this_asResponseBody().Y0();
    }

    public final kb0 byteString() throws Throwable {
        Throwable th;
        kb0 kb0VarQ0;
        long jContentLength = get$contentLength();
        if (jContentLength > 2147483647L) {
            u52.s(ie2.f(jContentLength, "Cannot buffer entire body for content length: "));
            return null;
        }
        ba0 ba0VarSource = get$this_asResponseBody();
        try {
            kb0VarQ0 = ba0VarSource.q0();
            try {
                ba0VarSource.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (ba0VarSource != null) {
                try {
                    ba0VarSource.close();
                } catch (Throwable th4) {
                    gv3.g(th3, th4);
                }
            }
            th = th3;
            kb0VarQ0 = null;
        }
        if (th != null) {
            throw th;
        }
        int iE = kb0VarQ0.e();
        if (jContentLength == -1 || jContentLength == iE) {
            return kb0VarQ0;
        }
        kp5.f(iE, jContentLength);
        return null;
    }

    public final byte[] bytes() throws Throwable {
        Throwable th;
        byte[] bArrB;
        long jContentLength = get$contentLength();
        if (jContentLength > 2147483647L) {
            u52.s(ie2.f(jContentLength, "Cannot buffer entire body for content length: "));
            return null;
        }
        ba0 ba0VarSource = get$this_asResponseBody();
        try {
            bArrB = ba0VarSource.B();
            try {
                ba0VarSource.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (ba0VarSource != null) {
                try {
                    ba0VarSource.close();
                } catch (Throwable th4) {
                    gv3.g(th3, th4);
                }
            }
            th = th3;
            bArrB = null;
        }
        if (th != null) {
            throw th;
        }
        int length = bArrB.length;
        if (jContentLength == -1 || jContentLength == length) {
            return bArrB;
        }
        kp5.f(length, jContentLength);
        return null;
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(get$this_asResponseBody(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        _UtilCommonKt.closeQuietly(get$this_asResponseBody());
    }

    /* JADX INFO: renamed from: contentLength */
    public abstract long get$contentLength();

    /* JADX INFO: renamed from: contentType */
    public abstract MediaType get$contentType();

    /* JADX INFO: renamed from: source */
    public abstract ba0 get$this_asResponseBody();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final String string() throws IOException {
        ba0 ba0VarSource = get$this_asResponseBody();
        String th = null;
        try {
            String strK0 = ba0VarSource.k0(_UtilJvmKt.readBomAsCharset(ba0VarSource, charset()));
            try {
                ba0VarSource.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = strK0;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (ba0VarSource != null) {
                try {
                    ba0VarSource.close();
                } catch (Throwable th4) {
                    gv3.g(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\u000b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0007*\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\b\u0010\u0012J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0015J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\b\u0010\u0016J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\rH\u0007¢\u0006\u0004\b\b\u0010\u0017J)\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\b\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lokhttp3/ResponseBody$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/MediaType;", "contentType", "Lokhttp3/ResponseBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "toResponseBody", _UrlKt.FRAGMENT_ENCODE_SET, "([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lkb0;", "(Lkb0;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lba0;", _UrlKt.FRAGMENT_ENCODE_SET, "contentLength", "(Lba0;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;", "asResponseBody", "content", "(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;[B)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;Lkb0;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;JLba0;)Lokhttp3/ResponseBody;", "EMPTY", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(ge1 ge1Var) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, ba0 ba0Var, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(ba0Var, mediaType, j);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            str.getClass();
            qg5 qg5VarChooseCharset = Internal.chooseCharset(mediaType);
            Charset charset = (Charset) qg5VarChooseCharset.X;
            MediaType mediaType2 = (MediaType) qg5VarChooseCharset.Y;
            i90 i90Var = new i90();
            charset.getClass();
            i90Var.b1(str, 0, str.length(), charset);
            return create(i90Var, mediaType2, i90Var.Y);
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, kb0 kb0Var, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(kb0Var, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            bArr.getClass();
            i90 i90Var = new i90();
            i90Var.write(bArr, 0, bArr.length);
            return create(i90Var, mediaType, bArr.length);
        }

        public final ResponseBody create(kb0 kb0Var, MediaType mediaType) {
            kb0Var.getClass();
            i90 i90Var = new i90();
            i90Var.C0(kb0Var);
            return create(i90Var, mediaType, kb0Var.e());
        }

        public final ResponseBody create(final ba0 ba0Var, final MediaType mediaType, final long j) {
            ba0Var.getClass();
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: contentLength, reason: from getter */
                public long get$contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: source, reason: from getter */
                public ba0 get$this_asResponseBody() {
                    return ba0Var;
                }
            };
        }

        @ti1
        public final ResponseBody create(MediaType contentType, String content) {
            content.getClass();
            return create(content, contentType);
        }

        @ti1
        public final ResponseBody create(MediaType contentType, byte[] content) {
            content.getClass();
            return create(content, contentType);
        }

        @ti1
        public final ResponseBody create(MediaType contentType, kb0 content) {
            content.getClass();
            return create(content, contentType);
        }

        @ti1
        public final ResponseBody create(MediaType contentType, long contentLength, ba0 content) {
            content.getClass();
            return create(content, contentType, contentLength);
        }
    }

    public static final ResponseBody create(kb0 kb0Var, MediaType mediaType) {
        return INSTANCE.create(kb0Var, mediaType);
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return INSTANCE.create(str, mediaType);
    }

    @ti1
    public static final ResponseBody create(MediaType mediaType, long j, ba0 ba0Var) {
        return INSTANCE.create(mediaType, j, ba0Var);
    }

    @ti1
    public static final ResponseBody create(MediaType mediaType, kb0 kb0Var) {
        return INSTANCE.create(mediaType, kb0Var);
    }

    @ti1
    public static final ResponseBody create(MediaType mediaType, String str) {
        return INSTANCE.create(mediaType, str);
    }

    @ti1
    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return INSTANCE.create(mediaType, bArr);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return INSTANCE.create(bArr, mediaType);
    }
}
