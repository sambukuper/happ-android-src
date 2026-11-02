package okhttp3.internal;

import kotlin.Metadata;
import okhttp3.Response;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"stripBody", "Lokhttp3/Response;", "okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UnreadableResponseBodyKt {
    public static final Response stripBody(Response response) {
        response.getClass();
        return response.newBuilder().body(new UnreadableResponseBody(response.body().getMediaType(), response.body().getContentLength())).build();
    }
}
