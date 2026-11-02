package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m13 {
    public static final kz2[] a;
    public static final Map b;

    static {
        kz2 kz2Var = new kz2(kz2.i, _UrlKt.FRAGMENT_ENCODE_SET);
        kb0 kb0Var = kz2.f;
        kz2 kz2Var2 = new kz2(kb0Var, "GET");
        kz2 kz2Var3 = new kz2(kb0Var, "POST");
        kb0 kb0Var2 = kz2.g;
        kz2 kz2Var4 = new kz2(kb0Var2, "/");
        kz2 kz2Var5 = new kz2(kb0Var2, "/index.html");
        kb0 kb0Var3 = kz2.h;
        kz2 kz2Var6 = new kz2(kb0Var3, "http");
        kz2 kz2Var7 = new kz2(kb0Var3, "https");
        kb0 kb0Var4 = kz2.e;
        kz2[] kz2VarArr = {kz2Var, kz2Var2, kz2Var3, kz2Var4, kz2Var5, kz2Var6, kz2Var7, new kz2(kb0Var4, "200"), new kz2(kb0Var4, "204"), new kz2(kb0Var4, "206"), new kz2(kb0Var4, "304"), new kz2(kb0Var4, "400"), new kz2(kb0Var4, "404"), new kz2(kb0Var4, "500"), new kz2("accept-charset", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("accept-encoding", "gzip, deflate"), new kz2("accept-language", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("accept-ranges", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("accept", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("access-control-allow-origin", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("age", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("allow", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("authorization", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("cache-control", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("content-disposition", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("content-encoding", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("content-language", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("content-length", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("content-location", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("content-range", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("content-type", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("cookie", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("date", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("etag", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("expect", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("expires", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("from", _UrlKt.FRAGMENT_ENCODE_SET), new kz2(MetaParams.HOST, _UrlKt.FRAGMENT_ENCODE_SET), new kz2("if-match", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("if-modified-since", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("if-none-match", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("if-range", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("if-unmodified-since", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("last-modified", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("link", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("location", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("max-forwards", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("proxy-authenticate", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("proxy-authorization", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("range", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("referer", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("refresh", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("retry-after", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("server", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("set-cookie", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("strict-transport-security", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("transfer-encoding", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("user-agent", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("vary", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("via", _UrlKt.FRAGMENT_ENCODE_SET), new kz2("www-authenticate", _UrlKt.FRAGMENT_ENCODE_SET)};
        a = kz2VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(kz2VarArr[i].a)) {
                linkedHashMap.put(kz2VarArr[i].a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        b = mapUnmodifiableMap;
    }

    public static void a(kb0 kb0Var) throws IOException {
        kb0Var.getClass();
        int iE = kb0Var.e();
        for (int i = 0; i < iE; i++) {
            byte bJ = kb0Var.j(i);
            if (65 <= bJ && bJ < 91) {
                u52.s("PROTOCOL_ERROR response malformed: mixed case name: ".concat(kb0Var.t()));
                return;
            }
        }
    }
}
