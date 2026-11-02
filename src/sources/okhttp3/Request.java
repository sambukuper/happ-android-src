package okhttp3;

import defpackage.bt;
import defpackage.dh3;
import defpackage.em7;
import defpackage.ge1;
import defpackage.i21;
import defpackage.i90;
import defpackage.kp5;
import defpackage.mm7;
import defpackage.oi0;
import defpackage.pc6;
import defpackage.qg5;
import defpackage.ti1;
import defpackage.u52;
import defpackage.yb6;
import defpackage.zc1;
import defpackage.zu3;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.EmptyTags;
import okhttp3.internal.IsProbablyUtf8Kt;
import okhttp3.internal.Tags;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http.GzipRequestBody;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001?B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0004\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0010J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\t\u0010\u0014J\u001e\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0015\u0018\u0001*\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0015*\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u0018\u0010\u001bJ\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0018\u0010\u0017J%\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00152\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001c¢\u0006\u0004\b\u0018\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b$\u0010%J\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010+\u001a\u00020(H\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010#J\u0019\u0010/\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b/\u00100R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b\u0007\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b\u000b\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b\t\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0007¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b\r\u0010'R\u0019\u00105\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b5\u0010!R\u001a\u00107\u001a\u0002068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0011\u0010=\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0011\u0010+\u001a\u00020(8G¢\u0006\u0006\u001a\u0004\b+\u0010*¨\u0006@"}, d2 = {"Lokhttp3/Request;", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Request$Builder;", "builder", "<init>", "(Lokhttp3/Request$Builder;)V", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/Headers;", "headers", _UrlKt.FRAGMENT_ENCODE_SET, "method", "Lokhttp3/RequestBody;", "body", "(Lokhttp3/HttpUrl;Lokhttp3/Headers;Ljava/lang/String;Lokhttp3/RequestBody;)V", "shellEscape", "(Ljava/lang/String;)Ljava/lang/String;", "name", "header", _UrlKt.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;)Ljava/util/List;", "T", "reifiedTag", "()Ljava/lang/Object;", "tag", "Lzu3;", "type", "(Lzu3;)Ljava/lang/Object;", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "newBuilder", "()Lokhttp3/Request$Builder;", "-deprecated_url", "()Lokhttp3/HttpUrl;", "-deprecated_method", "()Ljava/lang/String;", "-deprecated_headers", "()Lokhttp3/Headers;", "-deprecated_body", "()Lokhttp3/RequestBody;", "Lokhttp3/CacheControl;", "-deprecated_cacheControl", "()Lokhttp3/CacheControl;", "cacheControl", "toString", _UrlKt.FRAGMENT_ENCODE_SET, "includeBody", "toCurl", "(Z)Ljava/lang/String;", "Lokhttp3/HttpUrl;", "Ljava/lang/String;", "Lokhttp3/Headers;", "Lokhttp3/RequestBody;", "cacheUrlOverride", "Lokhttp3/internal/Tags;", "tags", "Lokhttp3/internal/Tags;", "getTags$okhttp", "()Lokhttp3/internal/Tags;", "lazyCacheControl", "Lokhttp3/CacheControl;", "isHttps", "()Z", "Builder", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Request {
    private final RequestBody body;
    private final HttpUrl cacheUrlOverride;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Tags tags;
    private final HttpUrl url;

    public Request(Builder builder) {
        builder.getClass();
        HttpUrl url = builder.getUrl();
        if (url == null) {
            bt.i("url == null");
            throw null;
        }
        this.url = url;
        this.method = builder.getMethod();
        this.headers = builder.getHeaders().build();
        this.body = builder.getBody();
        this.cacheUrlOverride = builder.getCacheUrlOverride();
        this.tags = builder.getTags();
    }

    private final String shellEscape(String str) {
        return oi0.o(new StringBuilder("'"), mm7.W(str, "'", "'\\''", false), '\'');
    }

    public static /* synthetic */ String toCurl$default(Request request, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return request.toCurl(z);
    }

    @ti1
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name and from getter */
    public final RequestBody getBody() {
        return this.body;
    }

    @ti1
    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m145deprecated_cacheControl() {
        return cacheControl();
    }

    @ti1
    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name and from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    @ti1
    /* JADX INFO: renamed from: -deprecated_method, reason: not valid java name and from getter */
    public final String getMethod() {
        return this.method;
    }

    @ti1
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name and from getter */
    public final HttpUrl getUrl() {
        return this.url;
    }

    public final RequestBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.INSTANCE.parse(this.headers);
        this.lazyCacheControl = cacheControl2;
        return cacheControl2;
    }

    /* JADX INFO: renamed from: cacheUrlOverride, reason: from getter */
    public final HttpUrl getCacheUrlOverride() {
        return this.cacheUrlOverride;
    }

    /* JADX INFO: renamed from: getTags$okhttp, reason: from getter */
    public final Tags getTags() {
        return this.tags;
    }

    public final String header(String name) {
        name.getClass();
        return this.headers.get(name);
    }

    public final List<String> headers(String name) {
        name.getClass();
        return this.headers.values(name);
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final String method() {
        return this.method;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final <T> T reifiedTag() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public final <T> T tag(zu3 type) {
        type.getClass();
        return (T) zc1.M(type).cast(this.tags.get(type));
    }

    public final String toCurl(boolean includeBody) throws IOException {
        RequestBody requestBody;
        MediaType mediaTypeContentType;
        StringBuilder sb = new StringBuilder("curl " + shellEscape(this.url.getUrl()));
        RequestBody requestBody2 = this.body;
        String string = (requestBody2 == null || (mediaTypeContentType = requestBody2.contentType()) == null) ? null : mediaTypeContentType.toString();
        if (!dh3.f(this.method, (!includeBody || this.body == null) ? "GET" : "POST")) {
            sb.append(" \\\n  -X " + shellEscape(this.method));
        }
        for (qg5 qg5Var : this.headers) {
            String str = (String) qg5Var.X;
            String str2 = (String) qg5Var.Y;
            if (string == null || !mm7.S(str, "Content-Type")) {
                StringBuilder sb2 = new StringBuilder(" \\\n  -H ");
                sb2.append(shellEscape(str + ": " + str2));
                sb.append(sb2.toString());
            }
        }
        if (string != null) {
            sb.append(" \\\n  -H " + shellEscape("Content-Type: ".concat(string)));
        }
        if (includeBody && (requestBody = this.body) != null) {
            i90 i90Var = new i90();
            requestBody.writeTo(i90Var);
            if (IsProbablyUtf8Kt.isProbablyUtf8$default(i90Var, 0L, 1, null)) {
                sb.append(" \\\n  --data " + shellEscape(i90Var.Y()));
            } else {
                sb.append(" \\\n  --data-binary " + shellEscape(i90Var.s(i90Var.Y).f()));
            }
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (qg5 qg5Var : this.headers) {
                int i2 = i + 1;
                if (i < 0) {
                    i21.X();
                    throw null;
                }
                qg5 qg5Var2 = qg5Var;
                String str = (String) qg5Var2.X;
                String str2 = (String) qg5Var2.Y;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (_UtilCommonKt.isSensitiveHeader(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        if (!dh3.f(this.tags, EmptyTags.INSTANCE)) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.append('}');
        return sb.toString();
    }

    public final HttpUrl url() {
        return this.url;
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\u000bJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\fH\u0016¢\u0006\u0004\b\b\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010 J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b#\u0010 J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010 J!\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b%\u0010&J&\u0010(\u001a\u00020\u0000\"\n\b\u0000\u0010'\u0018\u0001*\u00020\u00012\b\u0010(\u001a\u0004\u0018\u00018\u0000H\u0087\b¢\u0006\u0004\b)\u0010*J/\u0010(\u001a\u00020\u0000\"\b\b\u0000\u0010'*\u00020\u00012\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\b\u0010(\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b(\u0010-J\u0019\u0010(\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b(\u0010*J/\u0010(\u001a\u00020\u0000\"\u0004\b\u0000\u0010'2\u000e\u0010,\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000.2\b\u0010(\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b(\u0010/J\u0017\u00100\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b0\u0010\tJ\r\u00101\u001a\u00020\u0000¢\u0006\u0004\b1\u0010\u001bJ\u000f\u00102\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\nH\u0002¢\u0006\u0004\b4\u00105R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010%\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u0015\u001a\u00020@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u00100\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00106\u001a\u0004\bK\u00108\"\u0004\bL\u0010:R\"\u0010N\u001a\u00020M8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006T"}, d2 = {"Lokhttp3/Request$Builder;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "Lokhttp3/Request;", "request", "(Lokhttp3/Request;)V", "Lokhttp3/HttpUrl;", "url", "(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;", _UrlKt.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;)Lokhttp3/Request$Builder;", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/Request$Builder;", "name", "value", "header", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;", "addHeader", "removeHeader", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;)Lokhttp3/Request$Builder;", "Lokhttp3/CacheControl;", "cacheControl", "(Lokhttp3/CacheControl;)Lokhttp3/Request$Builder;", "get", "()Lokhttp3/Request$Builder;", "head", "Lokhttp3/RequestBody;", "body", "post", "(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;", "delete", "put", "patch", "query", "method", "(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;", "T", "tag", "reifiedTag", "(Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Lzu3;", "type", "(Lzu3;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Ljava/lang/Class;", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "cacheUrlOverride", "gzip", "build", "()Lokhttp3/Request;", "canonicalUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Lokhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "Ljava/lang/String;", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/Headers$Builder;", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "Lokhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "getCacheUrlOverride$okhttp", "setCacheUrlOverride$okhttp", "Lokhttp3/internal/Tags;", "tags", "Lokhttp3/internal/Tags;", "getTags$okhttp", "()Lokhttp3/internal/Tags;", "setTags$okhttp", "(Lokhttp3/internal/Tags;)V", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class Builder {
        private RequestBody body;
        private HttpUrl cacheUrlOverride;
        private Headers.Builder headers;
        private String method;
        private Tags tags;
        private HttpUrl url;

        public Builder(Request request) {
            request.getClass();
            this.tags = EmptyTags.INSTANCE;
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            this.tags = request.getTags();
            this.headers = request.headers().newBuilder();
            this.cacheUrlOverride = request.getCacheUrlOverride();
        }

        private final String canonicalUrl(String url) {
            if (mm7.Z(url, true, "ws:")) {
                return "http:".concat(url.substring(3));
            }
            return mm7.Z(url, true, "wss:") ? "https:".concat(url.substring(4)) : url;
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i, Object obj) {
            if (obj != null) {
                u52.k("Super calls with default arguments not supported in this target, function: delete");
                return null;
            }
            if ((i & 1) != 0) {
                requestBody = RequestBody.EMPTY;
            }
            return builder.delete(requestBody);
        }

        public Builder addHeader(String name, String value) {
            name.getClass();
            value.getClass();
            this.headers.add(name, value);
            return this;
        }

        public Request build() {
            return new Request(this);
        }

        public Builder cacheControl(CacheControl cacheControl) {
            cacheControl.getClass();
            String string = cacheControl.toString();
            return string.length() == 0 ? removeHeader("Cache-Control") : header("Cache-Control", string);
        }

        public final Builder cacheUrlOverride(HttpUrl cacheUrlOverride) {
            this.cacheUrlOverride = cacheUrlOverride;
            return this;
        }

        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        public Builder get() {
            return method("GET", null);
        }

        /* JADX INFO: renamed from: getBody$okhttp, reason: from getter */
        public final RequestBody getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: getCacheUrlOverride$okhttp, reason: from getter */
        public final HttpUrl getCacheUrlOverride() {
            return this.cacheUrlOverride;
        }

        /* JADX INFO: renamed from: getHeaders$okhttp, reason: from getter */
        public final Headers.Builder getHeaders() {
            return this.headers;
        }

        /* JADX INFO: renamed from: getMethod$okhttp, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        /* JADX INFO: renamed from: getTags$okhttp, reason: from getter */
        public final Tags getTags() {
            return this.tags;
        }

        /* JADX INFO: renamed from: getUrl$okhttp, reason: from getter */
        public final HttpUrl getUrl() {
            return this.url;
        }

        public final Builder gzip() {
            RequestBody requestBody = this.body;
            if (requestBody == null) {
                bt.i("cannot gzip a request that has no body");
                return null;
            }
            String str = this.headers.get("Content-Encoding");
            if (str != null) {
                kp5.h(oi0.l("Content-Encoding already set: ", str));
                return null;
            }
            this.headers.add("Content-Encoding", "gzip");
            this.body = new GzipRequestBody(requestBody);
            return this;
        }

        public Builder head() {
            return method("HEAD", null);
        }

        public Builder header(String name, String value) {
            name.getClass();
            value.getClass();
            this.headers.set(name, value);
            return this;
        }

        public Builder headers(Headers headers) {
            headers.getClass();
            this.headers = headers.newBuilder();
            return this;
        }

        public Builder method(String method, RequestBody body) {
            method.getClass();
            if (method.length() <= 0) {
                bt.q("method.isEmpty() == true");
                return null;
            }
            if (body == null) {
                if (HttpMethod.requiresRequestBody(method)) {
                    em7.c(pc6.p("method ", method, " must have a request body."));
                    return null;
                }
            } else if (!HttpMethod.permitsRequestBody(method)) {
                em7.c(pc6.p("method ", method, " must not have a request body."));
                return null;
            }
            this.method = method;
            this.body = body;
            return this;
        }

        public Builder patch(RequestBody body) {
            body.getClass();
            return method("PATCH", body);
        }

        public Builder post(RequestBody body) {
            body.getClass();
            return method("POST", body);
        }

        public Builder put(RequestBody body) {
            body.getClass();
            return method("PUT", body);
        }

        public Builder query(RequestBody body) {
            body.getClass();
            return method("QUERY", body);
        }

        public final <T> Builder reifiedTag(T tag) {
            throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
        }

        public Builder removeHeader(String name) {
            name.getClass();
            this.headers.removeAll(name);
            return this;
        }

        public final void setBody$okhttp(RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setCacheUrlOverride$okhttp(HttpUrl httpUrl) {
            this.cacheUrlOverride = httpUrl;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            builder.getClass();
            this.headers = builder;
        }

        public final void setMethod$okhttp(String str) {
            str.getClass();
            this.method = str;
        }

        public final void setTags$okhttp(Tags tags) {
            tags.getClass();
            this.tags = tags;
        }

        public final void setUrl$okhttp(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        public <T> Builder tag(Class<? super T> type, T tag) {
            type.getClass();
            return tag(yb6.a.b(type), tag);
        }

        public Builder url(URL url) {
            url.getClass();
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            String string = url.toString();
            string.getClass();
            return url(companion.get(string));
        }

        public Builder delete(RequestBody body) {
            return method("DELETE", body);
        }

        public final <T> Builder tag(zu3 type, T tag) {
            type.getClass();
            this.tags = this.tags.plus(type, tag);
            return this;
        }

        public Builder tag(Object tag) {
            return tag(yb6.a.b(Object.class), tag);
        }

        public Builder url(String url) {
            url.getClass();
            return url(HttpUrl.INSTANCE.get(canonicalUrl(url)));
        }

        public Builder url(HttpUrl url) {
            url.getClass();
            this.url = url;
            return this;
        }

        public Builder() {
            this.tags = EmptyTags.INSTANCE;
            this.method = "GET";
            this.headers = new Headers.Builder();
        }
    }

    public final Headers headers() {
        return this.headers;
    }

    public final <T> T tag(Class<? extends T> type) {
        type.getClass();
        return (T) tag(yb6.a.b(type));
    }

    public final Object tag() {
        return tag(yb6.a.b(Object.class));
    }

    public /* synthetic */ Request(HttpUrl httpUrl, Headers headers, String str, RequestBody requestBody, int i, ge1 ge1Var) {
        this(httpUrl, (i & 2) != 0 ? Headers.INSTANCE.of(new String[0]) : headers, (i & 4) != 0 ? "\u0000" : str, (i & 8) != 0 ? null : requestBody);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Request(HttpUrl httpUrl, Headers headers, String str, RequestBody requestBody) {
        httpUrl.getClass();
        headers.getClass();
        str.getClass();
        Builder builderHeaders = new Builder().url(httpUrl).headers(headers);
        if (str.equals("\u0000")) {
            if (requestBody != null) {
                str = "POST";
            } else {
                str = "GET";
            }
        }
        this(builderHeaders.method(str, requestBody));
    }

    public final String toCurl() {
        return toCurl$default(this, false, 1, null);
    }
}
