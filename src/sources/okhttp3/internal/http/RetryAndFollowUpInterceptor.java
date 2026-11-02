package okhttp3.internal.http;

import defpackage.d02;
import defpackage.dh3;
import defpackage.wv0;
import defpackage.xw3;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.UnreadableResponseBodyKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\tH\u0002J$\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\"\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "recover", _UrlKt.FRAGMENT_ENCODE_SET, "e", "Ljava/io/IOException;", "call", "Lokhttp3/internal/connection/RealCall;", "userRequest", "Lokhttp3/Request;", "requestIsOneShot", "isRecoverable", "requestSendStarted", "followUpRequest", "userResponse", "exchange", "Lokhttp3/internal/connection/Exchange;", "buildRedirectRequest", "method", _UrlKt.FRAGMENT_ENCODE_SET, "retryAfter", _UrlKt.FRAGMENT_ENCODE_SET, "defaultDelay", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RetryAndFollowUpInterceptor implements Interceptor {
    private static final int MAX_FOLLOW_UPS = 20;

    private final Request buildRedirectRequest(Response userResponse, String method, Interceptor.Chain chain) {
        String strHeader$default;
        HttpUrl httpUrlResolve;
        if (!chain.getFollowRedirects() || (strHeader$default = Response.header$default(userResponse, "Location", null, 2, null)) == null || (httpUrlResolve = userResponse.request().url().resolve(strHeader$default)) == null) {
            return null;
        }
        if (!dh3.f(httpUrlResolve.scheme(), userResponse.request().url().scheme()) && !chain.getFollowSslRedirects()) {
            return null;
        }
        Request.Builder builderNewBuilder = userResponse.request().newBuilder();
        if (HttpMethod.permitsRequestBody(method)) {
            if (HttpMethod.INSTANCE.redirectsToGet(method, userResponse.code())) {
                builderNewBuilder.method("GET", null);
                builderNewBuilder.removeHeader("Transfer-Encoding");
                builderNewBuilder.removeHeader("Content-Length");
                builderNewBuilder.removeHeader("Content-Type");
            } else {
                builderNewBuilder.method(method, userResponse.request().body());
            }
        }
        if (!_UtilJvmKt.canReuseConnectionFor(userResponse.request().url(), httpUrlResolve)) {
            builderNewBuilder.removeHeader("Authorization");
        }
        return builderNewBuilder.url(httpUrlResolve).build();
    }

    private final Request followUpRequest(Response userResponse, Exchange exchange, Interceptor.Chain chain) throws IOException {
        RealConnection connection$okhttp;
        Route route = (exchange == null || (connection$okhttp = exchange.getConnection$okhttp()) == null) ? null : connection$okhttp.route();
        int iCode = userResponse.code();
        String strMethod = userResponse.request().method();
        if (iCode != 307 && iCode != 308) {
            if (iCode == 401) {
                return chain.getAuthenticator().authenticate(route, userResponse);
            }
            if (iCode == 421) {
                RequestBody requestBodyBody = userResponse.request().body();
                if ((requestBodyBody != null && requestBodyBody.isOneShot()) || exchange == null || !exchange.isCoalescedConnection$okhttp()) {
                    return null;
                }
                exchange.getConnection$okhttp().noCoalescedConnections$okhttp();
                return userResponse.request();
            }
            if (iCode == 503) {
                Response responsePriorResponse = userResponse.priorResponse();
                if ((responsePriorResponse == null || responsePriorResponse.code() != 503) && retryAfter(userResponse, Integer.MAX_VALUE) == 0) {
                    return userResponse.request();
                }
                return null;
            }
            if (iCode == 407) {
                route.getClass();
                if (route.proxy().type() == Proxy.Type.HTTP) {
                    return chain.getProxyAuthenticator().authenticate(route, userResponse);
                }
                xw3.k("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                return null;
            }
            if (iCode == 408) {
                if (!chain.getRetryOnConnectionFailure()) {
                    return null;
                }
                RequestBody requestBodyBody2 = userResponse.request().body();
                if (requestBodyBody2 != null && requestBodyBody2.isOneShot()) {
                    return null;
                }
                Response responsePriorResponse2 = userResponse.priorResponse();
                if ((responsePriorResponse2 == null || responsePriorResponse2.code() != 408) && retryAfter(userResponse, 0) <= 0) {
                    return userResponse.request();
                }
                return null;
            }
            switch (iCode) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return buildRedirectRequest(userResponse, strMethod, chain);
    }

    private final boolean isRecoverable(IOException e, boolean requestSendStarted) {
        if (e instanceof ProtocolException) {
            return false;
        }
        if (e instanceof InterruptedIOException) {
            return (e instanceof SocketTimeoutException) && !requestSendStarted;
        }
        return (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean recover(IOException e, RealCall call, Interceptor.Chain chain, Request userRequest) {
        boolean z = e instanceof ConnectionShutdownException;
        boolean z2 = !z;
        if (chain.getRetryOnConnectionFailure()) {
            return (z || !requestIsOneShot(e, userRequest)) && isRecoverable(e, z2) && call.retryAfterFailure();
        }
        return false;
    }

    private final boolean requestIsOneShot(IOException e, Request userRequest) {
        RequestBody requestBodyBody = userRequest.body();
        return (requestBodyBody != null && requestBodyBody.isOneShot()) || (e instanceof FileNotFoundException);
    }

    private final int retryAfter(Response userResponse, int defaultDelay) {
        String strHeader$default = Response.header$default(userResponse, "Retry-After", null, 2, null);
        if (strHeader$default == null) {
            return defaultDelay;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        patternCompile.getClass();
        if (!patternCompile.matcher(strHeader$default).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strHeader$default);
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Throwable {
        chain.getClass();
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.getRequest();
        RealCall call = realInterceptorChain.getCall();
        boolean z = false;
        List listI0 = d02.X;
        int i = 0;
        Response responseBuild = null;
        while (true) {
            boolean z2 = true;
            while (true) {
                call.enterNetworkInterceptorExchange(request, z2, realInterceptorChain);
                try {
                    if (call.getCanceled()) {
                        throw new IOException("Canceled");
                    }
                    try {
                    } catch (IOException e) {
                        boolean zRecover = recover(e, call, chain, request);
                        call.getEventListener().retryDecision(call, e, zRecover);
                        if (!zRecover) {
                            throw _UtilCommonKt.withSuppressed(e, listI0);
                        }
                        listI0 = wv0.I0(listI0, e);
                        call.exitNetworkInterceptorExchange$okhttp(true);
                        z2 = false;
                    }
                } catch (Throwable th) {
                    th = th;
                    z = true;
                }
                call.exitNetworkInterceptorExchange$okhttp(z);
                throw th;
            }
            responseBuild = realInterceptorChain.proceed(request).newBuilder().request(request).priorResponse(responseBuild != null ? UnreadableResponseBodyKt.stripBody(responseBuild) : null).build();
            Exchange interceptorScopedExchange = call.getInterceptorScopedExchange();
            Request requestFollowUpRequest = followUpRequest(responseBuild, interceptorScopedExchange, chain);
            try {
                if (requestFollowUpRequest == null) {
                    if (interceptorScopedExchange != null && interceptorScopedExchange.getIsDuplex()) {
                        call.timeoutEarlyExit();
                    }
                    call.getEventListener().followUpDecision(call, responseBuild, null);
                    call.exitNetworkInterceptorExchange$okhttp(false);
                    return responseBuild;
                }
                RequestBody requestBodyBody = requestFollowUpRequest.body();
                if (requestBodyBody != null && requestBodyBody.isOneShot()) {
                    call.getEventListener().followUpDecision(call, responseBuild, null);
                    call.exitNetworkInterceptorExchange$okhttp(false);
                    return responseBuild;
                }
                _UtilCommonKt.closeQuietly(responseBuild.body());
                i++;
                if (i > MAX_FOLLOW_UPS) {
                    call.getEventListener().followUpDecision(call, responseBuild, null);
                    throw new ProtocolException("Too many follow-up requests: " + i);
                }
                call.getEventListener().followUpDecision(call, responseBuild, requestFollowUpRequest);
                call.exitNetworkInterceptorExchange$okhttp(true);
                request = requestFollowUpRequest;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
