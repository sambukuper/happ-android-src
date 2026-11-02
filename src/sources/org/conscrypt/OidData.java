package org.conscrypt;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
final class OidData {
    private static final Map<String, String> OID_TO_NAME_MAP;

    static {
        HashMap map = new HashMap();
        OID_TO_NAME_MAP = map;
        map.put("1.2.840.113549.1.1.2", "MD2withRSA");
        map.put("1.2.840.113549.1.1.4", "MD5withRSA");
        map.put("1.2.840.113549.1.1.5", "SHA1withRSA");
        map.put("1.2.840.10040.4.3", "SHA1withDSA");
        map.put("1.2.840.10045.4.1", "SHA1withECDSA");
        map.put("1.2.840.113549.1.1.10", "RSASSA-PSS");
        map.put("1.2.840.113549.1.1.14", "SHA224withRSA");
        map.put("1.2.840.113549.1.1.11", "SHA256withRSA");
        map.put("1.2.840.113549.1.1.12", "SHA384withRSA");
        map.put("1.2.840.113549.1.1.13", "SHA512withRSA");
        map.put("2.16.840.1.101.3.4.3.1", "SHA224withDSA");
        map.put("2.16.840.1.101.3.4.3.2", "SHA256withDSA");
        map.put("1.2.840.10045.4.3.1", "SHA224withECDSA");
        map.put("1.2.840.10045.4.3.2", "SHA256withECDSA");
        map.put("1.2.840.10045.4.3.3", "SHA384withECDSA");
        map.put("1.2.840.10045.4.3.4", "SHA512withECDSA");
        map.put("1.3.101.112", "Ed25519");
        map.put("2.16.840.1.101.3.4.3.17", "ML-DSA-44");
        map.put("2.16.840.1.101.3.4.3.18", "ML-DSA-65");
        map.put("2.16.840.1.101.3.4.3.19", "ML-DSA-87");
    }

    private OidData() {
    }

    public static String oidToAlgorithmName(String str) {
        return OID_TO_NAME_MAP.get(str);
    }
}
