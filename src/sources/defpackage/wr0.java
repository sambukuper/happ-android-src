package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wr0 {
    public static final be b = new be(11);
    public static final l71 c = new l71(10);
    public static final LinkedHashMap d = new LinkedHashMap();
    public static final wr0 e;
    public static final wr0 f;
    public static final wr0 g;
    public static final wr0 h;
    public static final wr0 i;
    public static final wr0 j;
    public static final wr0 k;
    public static final wr0 l;
    public static final wr0 m;
    public static final wr0 n;
    public static final wr0 o;
    public static final wr0 p;
    public static final wr0 q;
    public static final wr0 r;
    public static final wr0 s;
    public static final wr0 t;
    public final String a;

    static {
        be.k("SSL_RSA_WITH_NULL_MD5");
        be.k("SSL_RSA_WITH_NULL_SHA");
        be.k("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        be.k("SSL_RSA_WITH_RC4_128_MD5");
        be.k("SSL_RSA_WITH_RC4_128_SHA");
        be.k("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        be.k("SSL_RSA_WITH_DES_CBC_SHA");
        e = be.k("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        be.k("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        be.k("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        be.k("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        be.k("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        be.k("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        be.k("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        be.k("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        be.k("SSL_DH_anon_WITH_RC4_128_MD5");
        be.k("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        be.k("SSL_DH_anon_WITH_DES_CBC_SHA");
        be.k("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        be.k("TLS_KRB5_WITH_DES_CBC_SHA");
        be.k("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        be.k("TLS_KRB5_WITH_RC4_128_SHA");
        be.k("TLS_KRB5_WITH_DES_CBC_MD5");
        be.k("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        be.k("TLS_KRB5_WITH_RC4_128_MD5");
        be.k("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        be.k("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        be.k("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        be.k("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f = be.k("TLS_RSA_WITH_AES_128_CBC_SHA");
        be.k("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        be.k("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        be.k("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        g = be.k("TLS_RSA_WITH_AES_256_CBC_SHA");
        be.k("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        be.k("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        be.k("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        be.k("TLS_RSA_WITH_NULL_SHA256");
        be.k("TLS_RSA_WITH_AES_128_CBC_SHA256");
        be.k("TLS_RSA_WITH_AES_256_CBC_SHA256");
        be.k("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        be.k("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        be.k("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        be.k("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        be.k("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        be.k("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        be.k("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        be.k("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        be.k("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        be.k("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        be.k("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        be.k("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        be.k("TLS_PSK_WITH_RC4_128_SHA");
        be.k("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        be.k("TLS_PSK_WITH_AES_128_CBC_SHA");
        be.k("TLS_PSK_WITH_AES_256_CBC_SHA");
        be.k("TLS_RSA_WITH_SEED_CBC_SHA");
        h = be.k("TLS_RSA_WITH_AES_128_GCM_SHA256");
        i = be.k("TLS_RSA_WITH_AES_256_GCM_SHA384");
        be.k("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        be.k("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        be.k("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        be.k("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        be.k("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        be.k("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        be.k("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        be.k("TLS_FALLBACK_SCSV");
        be.k("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        be.k("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        be.k("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        be.k("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        be.k("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        be.k("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        be.k("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        be.k("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        be.k("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        be.k("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        be.k("TLS_ECDH_RSA_WITH_NULL_SHA");
        be.k("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        be.k("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        be.k("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        be.k("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        be.k("TLS_ECDHE_RSA_WITH_NULL_SHA");
        be.k("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        be.k("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        j = be.k("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        k = be.k("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        be.k("TLS_ECDH_anon_WITH_NULL_SHA");
        be.k("TLS_ECDH_anon_WITH_RC4_128_SHA");
        be.k("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        be.k("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        be.k("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        be.k("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        be.k("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        be.k("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        be.k("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        be.k("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        be.k("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        be.k("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        be.k("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        l = be.k("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        m = be.k("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        be.k("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        be.k("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        n = be.k("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        o = be.k("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        be.k("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        be.k("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        be.k("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        be.k("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        p = be.k("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        q = be.k("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        be.k("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        be.k("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        r = be.k("TLS_AES_128_GCM_SHA256");
        s = be.k("TLS_AES_256_GCM_SHA384");
        t = be.k("TLS_CHACHA20_POLY1305_SHA256");
        be.k("TLS_AES_128_CCM_SHA256");
        be.k("TLS_AES_128_CCM_8_SHA256");
    }

    public wr0(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}
