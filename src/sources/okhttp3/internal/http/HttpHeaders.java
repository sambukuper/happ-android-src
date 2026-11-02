package okhttp3.internal.http;

import defpackage.bt;
import defpackage.dh3;
import defpackage.e02;
import defpackage.i90;
import defpackage.iq0;
import defpackage.kb0;
import defpackage.mm7;
import defpackage.ra;
import defpackage.ti1;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001dH\u0007¢\u0006\u0004\b!\u0010\u001f\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lokhttp3/Headers;", _UrlKt.FRAGMENT_ENCODE_SET, "headerName", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Challenge;", "parseChallenges", "(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", "Li90;", _UrlKt.FRAGMENT_ENCODE_SET, "result", "Ldn8;", "readChallengeHeader", "(Li90;Ljava/util/List;)V", _UrlKt.FRAGMENT_ENCODE_SET, "skipCommasAndWhitespace", "(Li90;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "prefix", "startsWith", "(Li90;B)Z", "readQuotedString", "(Li90;)Ljava/lang/String;", "readToken", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "headers", "receiveHeaders", "(Lokhttp3/CookieJar;Lokhttp3/HttpUrl;Lokhttp3/Headers;)V", "Lokhttp3/Response;", "promisesBody", "(Lokhttp3/Response;)Z", "response", "hasBody", "Lkb0;", "QUOTED_STRING_DELIMITERS", "Lkb0;", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class HttpHeaders {
    private static final kb0 QUOTED_STRING_DELIMITERS;
    private static final kb0 TOKEN_DELIMITERS;

    static {
        kb0 kb0Var = kb0.f0;
        QUOTED_STRING_DELIMITERS = ra.g("\"\\");
        TOKEN_DELIMITERS = ra.g("\t ,=");
    }

    @ti1
    public static final boolean hasBody(Response response) {
        response.getClass();
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        headers.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(headers.name(i))) {
                i90 i90Var = new i90();
                i90Var.d1(headers.value(i));
                try {
                    readChallengeHeader(i90Var, arrayList);
                } catch (EOFException e) {
                    Platform.INSTANCE.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        response.getClass();
        if (dh3.f(response.request().method(), "HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && _UtilJvmKt.headersContentLength(response) == -1 && !"chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6 A[EDGE_INSN: B:59:0x00b6->B:48:0x00b6 BREAK  A[LOOP:2: B:22:0x006c->B:47:0x00b4], SYNTHETIC] */
    private static final void readChallengeHeader(i90 i90Var, List<Challenge> list) throws EOFException {
        String token;
        while (true) {
            String token2 = null;
            while (true) {
                if (token2 == null) {
                    skipCommasAndWhitespace(i90Var);
                    token2 = readToken(i90Var);
                    if (token2 == null) {
                        return;
                    }
                }
                boolean zSkipCommasAndWhitespace = skipCommasAndWhitespace(i90Var);
                String token3 = readToken(i90Var);
                if (token3 == null) {
                    if (i90Var.F()) {
                        list.add(new Challenge(token2, e02.X));
                        return;
                    }
                    return;
                }
                int iSkipAll = _UtilCommonKt.skipAll(i90Var, (byte) 61);
                boolean zSkipCommasAndWhitespace2 = skipCommasAndWhitespace(i90Var);
                if (zSkipCommasAndWhitespace || !(zSkipCommasAndWhitespace2 || i90Var.F())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iSkipAll2 = _UtilCommonKt.skipAll(i90Var, (byte) 61) + iSkipAll;
                    while (true) {
                        if (token3 != null) {
                            if (iSkipAll2 != 0) {
                                break;
                                break;
                            }
                            if (iSkipAll2 <= 1) {
                                return;
                            }
                            if (startsWith(i90Var, (byte) 34)) {
                                token = readQuotedString(i90Var);
                            } else {
                                token = readToken(i90Var);
                            }
                            if (token != null) {
                                return;
                            }
                            if (skipCommasAndWhitespace(i90Var)) {
                            }
                            token3 = null;
                        } else {
                            token3 = readToken(i90Var);
                            if (!skipCommasAndWhitespace(i90Var)) {
                                iSkipAll2 = _UtilCommonKt.skipAll(i90Var, (byte) 61);
                                if (iSkipAll2 != 0) {
                                    break;
                                }
                                if (iSkipAll2 <= 1 || skipCommasAndWhitespace(i90Var)) {
                                    return;
                                }
                                if (startsWith(i90Var, (byte) 34)) {
                                    token = readQuotedString(i90Var);
                                } else {
                                    token = readToken(i90Var);
                                }
                                if (token != null || ((String) linkedHashMap.put(token3, token)) != null) {
                                    return;
                                }
                                if (skipCommasAndWhitespace(i90Var) && !i90Var.F()) {
                                    return;
                                } else {
                                    token3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    list.add(new Challenge(token2, linkedHashMap));
                    token2 = token3;
                } else {
                    Map mapSingletonMap = Collections.singletonMap(null, token3 + mm7.V(iSkipAll, "="));
                    mapSingletonMap.getClass();
                    list.add(new Challenge(token2, (Map<String, String>) mapSingletonMap));
                }
            }
        }
    }

    private static final String readQuotedString(i90 i90Var) throws EOFException {
        if (i90Var.readByte() != 34) {
            bt.q("Failed requirement.");
            return null;
        }
        i90 i90Var2 = new i90();
        while (true) {
            long jD = i90Var.D(QUOTED_STRING_DELIMITERS);
            if (jD == -1) {
                return null;
            }
            if (i90Var.u(jD) == 34) {
                i90Var2.write(i90Var, jD);
                i90Var.readByte();
                return i90Var2.Y();
            }
            if (i90Var.Y == jD + 1) {
                return null;
            }
            i90Var2.write(i90Var, jD);
            i90Var.readByte();
            i90Var2.write(i90Var, 1L);
        }
    }

    private static final String readToken(i90 i90Var) {
        long jD = i90Var.D(TOKEN_DELIMITERS);
        if (jD == -1) {
            jD = i90Var.Y;
        }
        if (jD != 0) {
            return i90Var.X(jD, iq0.a);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        cookieJar.getClass();
        httpUrl.getClass();
        headers.getClass();
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> all = Cookie.INSTANCE.parseAll(httpUrl, headers);
        if (all.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, all);
    }

    private static final boolean skipCommasAndWhitespace(i90 i90Var) {
        boolean z = false;
        while (!i90Var.F()) {
            byte bU = i90Var.u(0L);
            if (bU != 44) {
                if (bU != 32 && bU != 9) {
                    break;
                }
                i90Var.readByte();
            } else {
                i90Var.readByte();
                z = true;
            }
        }
        return z;
    }

    private static final boolean startsWith(i90 i90Var, byte b) {
        return !i90Var.F() && i90Var.u(0L) == b;
    }
}
