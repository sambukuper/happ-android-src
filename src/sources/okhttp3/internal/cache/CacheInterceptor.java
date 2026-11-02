package okhttp3.internal.cache;

import defpackage.ba0;
import defpackage.ge1;
import defpackage.i76;
import defpackage.i90;
import defpackage.j76;
import defpackage.je7;
import defpackage.mm7;
import defpackage.sa7;
import defpackage.ta8;
import defpackage.vr3;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.UnreadableResponseBodyKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¨\u0006\r"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "cacheWritingResponse", "cacheRequest", "Lokhttp3/internal/cache/CacheRequest;", "response", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CacheInterceptor implements Interceptor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    private final Response cacheWritingResponse(final CacheRequest cacheRequest, Response response) throws IOException {
        if (cacheRequest == null) {
            return response;
        }
        sa7 body = cacheRequest.getBody();
        final ba0 bodySource = response.body().getBodySource();
        final i76 i76VarH = vr3.h(body);
        je7 je7Var = new je7() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
            private boolean cacheRequestClosed;

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (!this.cacheRequestClosed && !_UtilJvmKt.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                }
                bodySource.close();
            }

            @Override // defpackage.je7
            public long read(i90 sink, long byteCount) throws IOException {
                sink.getClass();
                try {
                    long j = bodySource.read(sink, byteCount);
                    if (j != -1) {
                        sink.p(i76VarH.c(), sink.Y - j, j);
                        i76VarH.O();
                        return j;
                    }
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        i76VarH.close();
                    }
                    return -1L;
                } catch (IOException e) {
                    if (this.cacheRequestClosed) {
                        throw e;
                    }
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                    throw e;
                }
            }

            @Override // defpackage.je7
            public ta8 timeout() {
                return bodySource.timeout();
            }
        };
        return response.newBuilder().body(new RealResponseBody(Response.header$default(response, "Content-Type", null, 2, null), response.body().getContentLength(), new j76(je7Var))).build();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Throwable {
        chain.getClass();
        Call call = chain.call();
        Cache cache = chain.getCache();
        Response response = cache != null ? cache.get$okhttp(CacheInterceptorKt.requestForCache(chain.request())) : null;
        CacheStrategy cacheStrategyCompute = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), response).compute();
        Request networkRequest = cacheStrategyCompute.getNetworkRequest();
        Response cacheResponse = cacheStrategyCompute.getCacheResponse();
        if (cache != null) {
            cache.trackResponse$okhttp(cacheStrategyCompute);
        }
        if (response != null && cacheResponse == null) {
            _UtilCommonKt.closeQuietly(response.body());
        }
        if (networkRequest == null && cacheResponse == null) {
            Response responseBuild = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
            chain.getEventListener().satisfactionFailure(call, responseBuild);
            return responseBuild;
        }
        if (networkRequest == null) {
            cacheResponse.getClass();
            Response responseBuild2 = cacheResponse.newBuilder().cacheResponse(UnreadableResponseBodyKt.stripBody(cacheResponse)).build();
            chain.getEventListener().cacheHit(call, responseBuild2);
            return responseBuild2;
        }
        if (cacheResponse != null) {
            chain.getEventListener().cacheConditionalHit(call, cacheResponse);
        } else if (cache != null) {
            chain.getEventListener().cacheMiss(call);
        }
        try {
            Response responseProceed = chain.proceed(networkRequest);
            if (responseProceed == null && response != null) {
                _UtilCommonKt.closeQuietly(response.body());
            }
            if (cacheResponse != null) {
                if (responseProceed != null && responseProceed.code() == 304) {
                    Response responseBuild3 = cacheResponse.newBuilder().headers(INSTANCE.combine(cacheResponse.headers(), responseProceed.headers())).sentRequestAtMillis(responseProceed.sentRequestAtMillis()).receivedResponseAtMillis(responseProceed.receivedResponseAtMillis()).cacheResponse(UnreadableResponseBodyKt.stripBody(cacheResponse)).networkResponse(UnreadableResponseBodyKt.stripBody(responseProceed)).build();
                    responseProceed.body().close();
                    cache.getClass();
                    cache.trackConditionalCacheHit$okhttp();
                    cache.update$okhttp(cacheResponse, responseBuild3);
                    chain.getEventListener().cacheHit(call, responseBuild3);
                    return responseBuild3;
                }
                _UtilCommonKt.closeQuietly(cacheResponse.body());
            }
            responseProceed.getClass();
            Response responseBuild4 = responseProceed.newBuilder().cacheResponse(cacheResponse != null ? UnreadableResponseBodyKt.stripBody(cacheResponse) : null).networkResponse(UnreadableResponseBodyKt.stripBody(responseProceed)).build();
            if (cache != null) {
                Request requestRequestForCache = CacheInterceptorKt.requestForCache(networkRequest);
                if (HttpHeaders.promisesBody(responseBuild4) && CacheStrategy.INSTANCE.isCacheable(responseBuild4, requestRequestForCache)) {
                    Response responseCacheWritingResponse = cacheWritingResponse(cache.put$okhttp(responseBuild4.newBuilder().request(requestRequestForCache).build()), responseBuild4);
                    if (cacheResponse != null) {
                        chain.getEventListener().cacheMiss(call);
                    }
                    return responseCacheWritingResponse;
                }
                if (HttpMethod.invalidatesCache(networkRequest.method())) {
                    try {
                        cache.remove$okhttp(networkRequest);
                    } catch (IOException unused) {
                    }
                }
            }
            return responseBuild4;
        } catch (Throwable th) {
            if (response != null) {
                _UtilCommonKt.closeQuietly(response.body());
            }
            throw th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\r"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "combine", "Lokhttp3/Headers;", "cachedHeaders", "networkHeaders", "isEndToEnd", _UrlKt.FRAGMENT_ENCODE_SET, "fieldName", _UrlKt.FRAGMENT_ENCODE_SET, "isContentSpecificHeader", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(ge1 ge1Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Headers combine(Headers cachedHeaders, Headers networkHeaders) {
            Headers.Builder builder = new Headers.Builder();
            int size = cachedHeaders.size();
            for (int i = 0; i < size; i++) {
                String strName = cachedHeaders.name(i);
                String strValue = cachedHeaders.value(i);
                if ((!"Warning".equalsIgnoreCase(strName) || !mm7.Z(strValue, false, "1")) && (isContentSpecificHeader(strName) || !isEndToEnd(strName) || networkHeaders.get(strName) == null)) {
                    builder.addLenient$okhttp(strName, strValue);
                }
            }
            int size2 = networkHeaders.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String strName2 = networkHeaders.name(i2);
                if (!isContentSpecificHeader(strName2) && isEndToEnd(strName2)) {
                    builder.addLenient$okhttp(strName2, networkHeaders.value(i2));
                }
            }
            return builder.build();
        }

        private final boolean isContentSpecificHeader(String fieldName) {
            return "Content-Length".equalsIgnoreCase(fieldName) || "Content-Encoding".equalsIgnoreCase(fieldName) || "Content-Type".equalsIgnoreCase(fieldName);
        }

        private final boolean isEndToEnd(String fieldName) {
            return ("Connection".equalsIgnoreCase(fieldName) || "Keep-Alive".equalsIgnoreCase(fieldName) || "Proxy-Authenticate".equalsIgnoreCase(fieldName) || "Proxy-Authorization".equalsIgnoreCase(fieldName) || "TE".equalsIgnoreCase(fieldName) || "Trailers".equalsIgnoreCase(fieldName) || "Transfer-Encoding".equalsIgnoreCase(fieldName) || "Upgrade".equalsIgnoreCase(fieldName)) ? false : true;
        }

        private Companion() {
        }
    }
}
