package okhttp3.logging;

import defpackage.ba0;
import defpackage.bw0;
import defpackage.dh3;
import defpackage.dv2;
import defpackage.ge1;
import defpackage.i90;
import defpackage.ie2;
import defpackage.l22;
import defpackage.m02;
import defpackage.oc;
import defpackage.pc6;
import defpackage.ti1;
import defpackage.zc1;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.IsProbablyUtf8Kt;
import okhttp3.internal.UnreadableResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\t\u0018\u0000 22\u00020\u0001:\u0003342B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\n2\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0018\"\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010!\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010*\u001a\u00020\u00142\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00140,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u00100\u001a\u0004\b!\u0010 \"\u0004\b\u001c\u00101¨\u00065"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "Lokhttp3/Headers;", "headers", _UrlKt.FRAGMENT_ENCODE_SET, "i", "Ldn8;", "logHeader", "(Lokhttp3/Headers;I)V", _UrlKt.FRAGMENT_ENCODE_SET, "bodyHasUnknownEncoding", "(Lokhttp3/Headers;)Z", "Lokhttp3/Response;", "response", "bodyIsStreaming", "(Lokhttp3/Response;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "name", "redactHeader", "(Ljava/lang/String;)V", _UrlKt.FRAGMENT_ENCODE_SET, "redactQueryParams", "([Ljava/lang/String;)V", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "level", "setLevel", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)Lokhttp3/logging/HttpLoggingInterceptor;", "-deprecated_level", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "getLevel", "Lokhttp3/Interceptor$Chain;", "chain", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lokhttp3/HttpUrl;", "url", "redactUrl$logging_interceptor", "(Lokhttp3/HttpUrl;)Ljava/lang/String;", "redactUrl", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", _UrlKt.FRAGMENT_ENCODE_SET, "headersToRedact", "Ljava/util/Set;", "queryParamsNameToRedact", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "Companion", "Level", "Logger", "logging-interceptor"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;
    private volatile Set<String> queryParamsNameToRedact;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "logging-interceptor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY;

        private static final /* synthetic */ l22 $ENTRIES = zc1.E(values());

        public static l22 getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "message", "Ldn8;", "log", "(Ljava/lang/String;)V", "Companion", "logging-interceptor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Logger {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DefaultLogger", "logging-interceptor"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion$DefaultLogger;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "<init>", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "message", "Ldn8;", "log", "(Ljava/lang/String;)V", "logging-interceptor"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(String message) {
                    message.getClass();
                    Platform.log$default(Platform.INSTANCE.get(), message, 0, null, 6, null);
                }
            }

            private Companion() {
            }
        }

        void log(String message);
    }

    public HttpLoggingInterceptor(Logger logger) {
        logger.getClass();
        this.logger = logger;
        m02 m02Var = m02.X;
        this.headersToRedact = m02Var;
        this.queryParamsNameToRedact = m02Var;
        this.level = Level.NONE;
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        return (str == null || str.equalsIgnoreCase("identity") || str.equalsIgnoreCase("gzip")) ? false : true;
    }

    private final boolean bodyIsStreaming(Response response) {
        MediaType mediaType = response.body().getMediaType();
        return mediaType != null && dh3.f(mediaType.type(), "text") && dh3.f(mediaType.subtype(), "event-stream");
    }

    private final void logHeader(Headers headers, int i) {
        String strValue = this.headersToRedact.contains(headers.name(i)) ? "██" : headers.value(i);
        this.logger.log(headers.name(i) + ": " + strValue);
    }

    @ti1
    /* JADX INFO: renamed from: -deprecated_level, reason: not valid java name and from getter */
    public final Level getLevel() {
        return this.level;
    }

    public final Level getLevel() {
        return this.level;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0284  */
    /* JADX WARN: Code duplicated, block: B:83:0x0296  */
    /* JADX WARN: Code duplicated, block: B:86:0x02be  */
    /* JADX WARN: Code duplicated, block: B:89:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x031d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0328 A[LOOP:1: B:93:0x0326->B:94:0x0328, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:81:0x0284, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:86:0x02be, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x02fb, please report this as an issue */
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Exception {
        String str;
        String str2;
        long jNanoTime;
        Response responseProceed;
        long contentLength;
        String str3;
        StringBuilder sb;
        Headers headers;
        int size;
        int i;
        Long lValueOf;
        chain.getClass();
        Level level = this.level;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z = true;
        boolean z2 = level == Level.BODY;
        if (!z2 && level != Level.HEADERS) {
            z = false;
        }
        RequestBody requestBodyBody = request.body();
        Connection connection = chain.connection();
        StringBuilder sb2 = new StringBuilder("--> ");
        sb2.append(request.method());
        sb2.append(' ');
        sb2.append(redactUrl$logging_interceptor(request.url()));
        sb2.append(connection != null ? " " + connection.getProtocol() : _UrlKt.FRAGMENT_ENCODE_SET);
        String string = sb2.toString();
        if (!z && requestBodyBody != null) {
            string = string + " (" + requestBodyBody.contentLength() + "-byte body)";
        }
        this.logger.log(string);
        Long lValueOf2 = null;
        try {
            if (z) {
                Headers headers2 = request.headers();
                if (requestBodyBody != null) {
                    MediaType mediaType = requestBodyBody.get$contentType();
                    if (mediaType != null && headers2.get("Content-Type") == null) {
                        this.logger.log("Content-Type: " + mediaType);
                    }
                    if (requestBodyBody.contentLength() != -1 && headers2.get("Content-Length") == null) {
                        this.logger.log("Content-Length: " + requestBodyBody.contentLength());
                    }
                } else {
                    z2 = z2;
                    z = z;
                }
                int size2 = headers2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    logHeader(headers2, i2);
                }
                if (!z2 || requestBodyBody == null) {
                    str = "Content-Encoding";
                    str2 = _UrlKt.FRAGMENT_ENCODE_SET;
                    this.logger.log("--> END " + request.method());
                } else if (bodyHasUnknownEncoding(request.headers())) {
                    this.logger.log("--> END " + request.method() + " (encoded body omitted)");
                } else if (requestBodyBody.isDuplex()) {
                    this.logger.log("--> END " + request.method() + " (duplex request body omitted)");
                } else if (requestBodyBody.isOneShot()) {
                    this.logger.log("--> END " + request.method() + " (one-shot body omitted)");
                } else {
                    i90 i90Var = new i90();
                    requestBodyBody.writeTo(i90Var);
                    if ("gzip".equalsIgnoreCase(headers2.get("Content-Encoding"))) {
                        lValueOf = Long.valueOf(i90Var.Y);
                        dv2 dv2Var = new dv2(i90Var);
                        try {
                            i90Var = new i90();
                            i90Var.M(dv2Var);
                            dv2Var.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                oc.h(dv2Var, th);
                                throw th2;
                            }
                        }
                    } else {
                        lValueOf = null;
                    }
                    Charset charsetCharsetOrUtf8 = Internal.charsetOrUtf8(requestBodyBody.get$contentType());
                    this.logger.log(_UrlKt.FRAGMENT_ENCODE_SET);
                    str = "Content-Encoding";
                    boolean zIsProbablyUtf8 = IsProbablyUtf8Kt.isProbablyUtf8(i90Var, 16L);
                    Logger logger = this.logger;
                    if (zIsProbablyUtf8) {
                        str2 = _UrlKt.FRAGMENT_ENCODE_SET;
                        if (lValueOf != null) {
                            logger.log("--> END " + request.method() + " (" + i90Var.Y + "-byte, " + lValueOf.longValue() + "-gzipped-byte body)");
                        } else {
                            logger.log(i90Var.k0(charsetCharsetOrUtf8));
                            this.logger.log("--> END " + request.method() + " (" + requestBodyBody.contentLength() + "-byte body)");
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder("--> END ");
                        sb3.append(request.method());
                        sb3.append(" (binary ");
                        str2 = _UrlKt.FRAGMENT_ENCODE_SET;
                        sb3.append(requestBodyBody.contentLength());
                        sb3.append("-byte body omitted)");
                        logger.log(sb3.toString());
                    }
                }
                jNanoTime = System.nanoTime();
                responseProceed = chain.proceed(request);
                long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
                ResponseBody responseBodyBody = responseProceed.body();
                responseBodyBody.getClass();
                contentLength = responseBodyBody.getContentLength();
                if (contentLength != -1) {
                    str3 = contentLength + "-byte";
                } else {
                    str3 = "unknown-length";
                }
                Logger logger2 = this.logger;
                sb = new StringBuilder("<-- " + responseProceed.code());
                if (responseProceed.message().length() > 0) {
                    sb.append(" " + responseProceed.message());
                }
                sb.append(" " + redactUrl$logging_interceptor(responseProceed.request().url()) + " (" + jNanoTime2 + "ms");
                if (!z) {
                    sb.append(", " + str3 + " body");
                }
                sb.append(")");
                logger2.log(sb.toString());
                if (z) {
                    headers = responseProceed.headers();
                    size = headers.size();
                    for (i = 0; i < size; i++) {
                        logHeader(headers, i);
                    }
                    if (!z2 && HttpHeaders.promisesBody(responseProceed)) {
                        if (bodyHasUnknownEncoding(responseProceed.headers())) {
                            this.logger.log("<-- END HTTP (encoded body omitted)");
                            return responseProceed;
                        }
                        if (bodyIsStreaming(responseProceed)) {
                            this.logger.log("<-- END HTTP (streaming)");
                            return responseProceed;
                        }
                        if (responseBodyBody instanceof UnreadableResponseBody) {
                            this.logger.log("<-- END HTTP (unreadable body)");
                            return responseProceed;
                        }
                        ba0 bodySource = responseBodyBody.getBodySource();
                        bodySource.request(Long.MAX_VALUE);
                        long jNanoTime3 = (System.nanoTime() - jNanoTime) / 1000000;
                        i90 i90VarC = bodySource.c();
                        if ("gzip".equalsIgnoreCase(headers.get(str))) {
                            lValueOf2 = Long.valueOf(i90VarC.Y);
                            dv2 dv2Var2 = new dv2(i90VarC.m());
                            try {
                                i90VarC = new i90();
                                i90VarC.M(dv2Var2);
                                dv2Var2.close();
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    oc.h(dv2Var2, th3);
                                    throw th4;
                                }
                            }
                        }
                        Charset charsetCharsetOrUtf9 = Internal.charsetOrUtf8(responseBodyBody.getMediaType());
                        if (!IsProbablyUtf8Kt.isProbablyUtf8(i90VarC, 16L)) {
                            this.logger.log(str2);
                            Logger logger3 = this.logger;
                            StringBuilder sbS = pc6.s(jNanoTime3, "<-- END HTTP (", "ms, binary ");
                            sbS.append(i90VarC.Y);
                            sbS.append("-byte body omitted)");
                            logger3.log(sbS.toString());
                            return responseProceed;
                        }
                        if (contentLength != 0) {
                            this.logger.log(str2);
                            this.logger.log(i90VarC.m().k0(charsetCharsetOrUtf9));
                        }
                        Logger logger4 = this.logger;
                        StringBuilder sb4 = new StringBuilder(ie2.g(i90VarC.Y, "-byte", pc6.s(jNanoTime3, "<-- END HTTP (", "ms, ")));
                        if (lValueOf2 != null) {
                            sb4.append(", " + lValueOf2.longValue() + "-gzipped-byte");
                        }
                        sb4.append(" body)");
                        logger4.log(sb4.toString());
                        return responseProceed;
                    }
                    this.logger.log("<-- END HTTP");
                }
                return responseProceed;
            }
            z2 = z2;
            z = z;
            responseProceed = chain.proceed(request);
            long jNanoTime4 = (System.nanoTime() - jNanoTime) / 1000000;
            ResponseBody responseBodyBody2 = responseProceed.body();
            responseBodyBody2.getClass();
            contentLength = responseBodyBody2.getContentLength();
            if (contentLength != -1) {
                str3 = contentLength + "-byte";
            } else {
                str3 = "unknown-length";
            }
            Logger logger5 = this.logger;
            sb = new StringBuilder("<-- " + responseProceed.code());
            if (responseProceed.message().length() > 0) {
                sb.append(" " + responseProceed.message());
            }
            sb.append(" " + redactUrl$logging_interceptor(responseProceed.request().url()) + " (" + jNanoTime4 + "ms");
            if (!z) {
                sb.append(", " + str3 + " body");
            }
            sb.append(")");
            logger5.log(sb.toString());
            if (z) {
                headers = responseProceed.headers();
                size = headers.size();
                while (i < size) {
                    logHeader(headers, i);
                }
                if (!z2) {
                }
                this.logger.log("<-- END HTTP");
            }
            return responseProceed;
        } catch (Exception e) {
            this.logger.log(("<-- HTTP FAILED: " + e + '.').concat(" " + redactUrl$logging_interceptor(request.url()) + " (" + ((System.nanoTime() - jNanoTime) / 1000000) + "ms)"));
            throw e;
        }
        str = "Content-Encoding";
        str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        jNanoTime = System.nanoTime();
    }

    public final void level(Level level) {
        level.getClass();
        this.level = level;
    }

    public final void redactHeader(String name) {
        name.getClass();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeSet treeSet = new TreeSet(comparator);
        bw0.d0(treeSet, this.headersToRedact);
        treeSet.add(name);
        this.headersToRedact = treeSet;
    }

    public final void redactQueryParams(String... name) {
        name.getClass();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeSet treeSet = new TreeSet(comparator);
        bw0.d0(treeSet, this.queryParamsNameToRedact);
        bw0.e0(treeSet, name);
        this.queryParamsNameToRedact = treeSet;
    }

    public final String redactUrl$logging_interceptor(HttpUrl url) {
        url.getClass();
        if (this.queryParamsNameToRedact.isEmpty() || url.querySize() == 0) {
            return url.getUrl();
        }
        HttpUrl.Builder builderQuery = url.newBuilder().query(null);
        int iQuerySize = url.querySize();
        for (int i = 0; i < iQuerySize; i++) {
            String strQueryParameterName = url.queryParameterName(i);
            builderQuery.addEncodedQueryParameter(strQueryParameterName, this.queryParamsNameToRedact.contains(strQueryParameterName) ? "██" : url.queryParameterValue(i));
        }
        return builderQuery.toString();
    }

    public final HttpLoggingInterceptor setLevel(Level level) {
        level.getClass();
        this.level = level;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i, ge1 ge1Var) {
        this((i & 1) != 0 ? Logger.DEFAULT : logger);
    }
}
