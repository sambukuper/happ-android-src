package okhttp3.java.net.cookiejar;

import defpackage.d02;
import defpackage.e02;
import defpackage.fm7;
import defpackage.mm7;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Lokhttp3/java/net/cookiejar/JavaNetCookieJar;", "Lokhttp3/CookieJar;", "Ljava/net/CookieHandler;", "cookieHandler", "<init>", "(Ljava/net/CookieHandler;)V", "Lokhttp3/HttpUrl;", "url", _UrlKt.FRAGMENT_ENCODE_SET, "header", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Cookie;", "decodeHeaderAsJavaNetCookies", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Ljava/util/List;", "cookies", "Ldn8;", "saveFromResponse", "(Lokhttp3/HttpUrl;Ljava/util/List;)V", "loadForRequest", "(Lokhttp3/HttpUrl;)Ljava/util/List;", "Ljava/net/CookieHandler;", "okhttp-java-net-cookiejar"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JavaNetCookieJar implements CookieJar {
    private final CookieHandler cookieHandler;

    public JavaNetCookieJar(CookieHandler cookieHandler) {
        cookieHandler.getClass();
        this.cookieHandler = cookieHandler;
    }

    private final List<Cookie> decodeHeaderAsJavaNetCookies(HttpUrl url, String header) {
        ArrayList arrayList = new ArrayList();
        int length = header.length();
        int i = 0;
        while (i < length) {
            int iDelimiterOffset = _UtilCommonKt.delimiterOffset(header, ";,", i, length);
            int iDelimiterOffset2 = _UtilCommonKt.delimiterOffset(header, '=', i, iDelimiterOffset);
            String strTrimSubstring = _UtilCommonKt.trimSubstring(header, i, iDelimiterOffset2);
            if (!mm7.Z(strTrimSubstring, false, "$")) {
                String strTrimSubstring2 = iDelimiterOffset2 < iDelimiterOffset ? _UtilCommonKt.trimSubstring(header, iDelimiterOffset2 + 1, iDelimiterOffset) : _UrlKt.FRAGMENT_ENCODE_SET;
                if (mm7.Z(strTrimSubstring2, false, "\"") && mm7.R(strTrimSubstring2, false, "\"") && strTrimSubstring2.length() >= 2) {
                    strTrimSubstring2 = strTrimSubstring2.substring(1, strTrimSubstring2.length() - 1);
                }
                arrayList.add(new Cookie.Builder().name(strTrimSubstring).value(fm7.R0(strTrimSubstring2).toString()).domain(url.host()).build());
            }
            i = iDelimiterOffset + 1;
        }
        return arrayList;
    }

    @Override // okhttp3.CookieJar
    public List<Cookie> loadForRequest(HttpUrl url) {
        d02 d02Var = d02.X;
        url.getClass();
        try {
            Map<String, List<String>> map = this.cookieHandler.get(url.uri(), e02.X);
            map.getClass();
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if ("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                    value.getClass();
                    if (!value.isEmpty()) {
                        for (String str : value) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            str.getClass();
                            arrayList.addAll(decodeHeaderAsJavaNetCookies(url, str));
                        }
                    }
                }
            }
            if (arrayList == null) {
                return d02Var;
            }
            List<Cookie> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
            return listUnmodifiableList;
        } catch (IOException e) {
            Platform platform = Platform.INSTANCE.get();
            StringBuilder sb = new StringBuilder("Loading cookies failed for ");
            HttpUrl httpUrlResolve = url.resolve("/...");
            httpUrlResolve.getClass();
            sb.append(httpUrlResolve);
            platform.log(sb.toString(), 5, e);
            return d02Var;
        }
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
        url.getClass();
        cookies.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<Cookie> it = cookies.iterator();
        while (it.hasNext()) {
            arrayList.add(Internal.cookieToString(it.next(), true));
        }
        Map<String, List<String>> mapSingletonMap = Collections.singletonMap("Set-Cookie", arrayList);
        mapSingletonMap.getClass();
        try {
            this.cookieHandler.put(url.uri(), mapSingletonMap);
        } catch (IOException e) {
            Platform platform = Platform.INSTANCE.get();
            StringBuilder sb = new StringBuilder("Saving cookies failed for ");
            HttpUrl httpUrlResolve = url.resolve("/...");
            httpUrlResolve.getClass();
            sb.append(httpUrlResolve);
            platform.log(sb.toString(), 5, e);
        }
    }
}
