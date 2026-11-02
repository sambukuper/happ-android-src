package org.conscrypt;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
class OpenSSLXECParameterSpec implements AlgorithmParameterSpec {
    public static final String X25519 = "1.3.101.110";
    private final String oid;

    public OpenSSLXECParameterSpec(String str) {
        this.oid = str;
    }

    public String getOid() {
        return this.oid;
    }
}
