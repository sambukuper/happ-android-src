package okhttp3;

import java.net.CookieHandler;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lokhttp3/JavaNetCookieJar;", "Lokhttp3/CookieJar;", "Lokhttp3/java/net/cookiejar/JavaNetCookieJar;", "delegate", "<init>", "(Lokhttp3/java/net/cookiejar/JavaNetCookieJar;)V", "Ljava/net/CookieHandler;", "cookieHandler", "(Ljava/net/CookieHandler;)V", "Lokhttp3/HttpUrl;", "url", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Cookie;", "cookies", "Ldn8;", "saveFromResponse", "(Lokhttp3/HttpUrl;Ljava/util/List;)V", "loadForRequest", "(Lokhttp3/HttpUrl;)Ljava/util/List;", "okhttp-urlconnection"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JavaNetCookieJar implements CookieJar {
    private final /* synthetic */ okhttp3.java.net.cookiejar.JavaNetCookieJar $$delegate_0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JavaNetCookieJar(CookieHandler cookieHandler) {
        this(new okhttp3.java.net.cookiejar.JavaNetCookieJar(cookieHandler));
        cookieHandler.getClass();
    }

    @Override // okhttp3.CookieJar
    public List<Cookie> loadForRequest(HttpUrl url) {
        url.getClass();
        return this.$$delegate_0.loadForRequest(url);
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
        url.getClass();
        cookies.getClass();
        this.$$delegate_0.saveFromResponse(url, cookies);
    }

    private JavaNetCookieJar(okhttp3.java.net.cookiejar.JavaNetCookieJar javaNetCookieJar) {
        this.$$delegate_0 = javaNetCookieJar;
    }
}
