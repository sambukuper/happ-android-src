package okhttp3.internal.http;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/http/HttpMethod;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "invalidatesCache", _UrlKt.FRAGMENT_ENCODE_SET, "method", _UrlKt.FRAGMENT_ENCODE_SET, "requiresRequestBody", "permitsRequestBody", "redirectsToGet", "responseCode", _UrlKt.FRAGMENT_ENCODE_SET, "isCacheable", "requestMethod", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean invalidatesCache(String method) {
        method.getClass();
        return method.equals("POST") || method.equals("PATCH") || method.equals("PUT") || method.equals("DELETE") || method.equals("MOVE");
    }

    public static final boolean permitsRequestBody(String method) {
        method.getClass();
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }

    public static final boolean requiresRequestBody(String method) {
        method.getClass();
        return method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("QUERY") || method.equals("REPORT");
    }

    public final boolean isCacheable(String requestMethod) {
        requestMethod.getClass();
        return requestMethod.equals("GET") || requestMethod.equals("QUERY");
    }

    public final boolean redirectsToGet(String method, int responseCode) {
        method.getClass();
        if (responseCode == 303) {
            return !method.equals("PROPFIND");
        }
        return (responseCode == 307 || responseCode == 308 || method.equals("PROPFIND") || method.equals("QUERY")) ? false : true;
    }
}
