package org.conscrypt;

import defpackage.u52;
import defpackage.xw3;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class OpenSslCompositeMlDsaKeyFactory extends KeyFactorySpi {
    private final CompositeMlDsaAlgorithm algorithm;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa44EcdsaP256Sha256 extends OpenSslCompositeMlDsaKeyFactory {
        public Mldsa44EcdsaP256Sha256() {
            super(CompositeMlDsaAlgorithm.MLDSA44_ECDSA_P256_SHA256);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa44Ed25519Sha512 extends OpenSslCompositeMlDsaKeyFactory {
        public Mldsa44Ed25519Sha512() {
            super(CompositeMlDsaAlgorithm.MLDSA44_ED25519_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa44Rsa2048Pkcs15Sha256 extends OpenSslCompositeMlDsaKeyFactory {
        public Mldsa44Rsa2048Pkcs15Sha256() {
            super(CompositeMlDsaAlgorithm.MLDSA44_RSA2048_PKCS15_SHA256);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa44Rsa2048PssSha256 extends OpenSslCompositeMlDsaKeyFactory {
        public Mldsa44Rsa2048PssSha256() {
            super(CompositeMlDsaAlgorithm.MLDSA44_RSA2048_PSS_SHA256);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa65EcdsaP256Sha512 extends OpenSslCompositeMlDsaKeyFactory {
        public Mldsa65EcdsaP256Sha512() {
            super(CompositeMlDsaAlgorithm.MLDSA65_ECDSA_P256_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa65EcdsaP384Sha512 extends OpenSslCompositeMlDsaKeyFactory {
        public Mldsa65EcdsaP384Sha512() {
            super(CompositeMlDsaAlgorithm.MLDSA65_ECDSA_P384_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa65Ed25519Sha512 extends OpenSslCompositeMlDsaKeyFactory {
        public Mldsa65Ed25519Sha512() {
            super(CompositeMlDsaAlgorithm.MLDSA65_ED25519_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa65Rsa3072Pkcs15Sha512 extends OpenSslCompositeMlDsaKeyFactory {
        public Mldsa65Rsa3072Pkcs15Sha512() {
            super(CompositeMlDsaAlgorithm.MLDSA65_RSA3072_PKCS15_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa65Rsa3072PssSha512 extends OpenSslCompositeMlDsaKeyFactory {
        public Mldsa65Rsa3072PssSha512() {
            super(CompositeMlDsaAlgorithm.MLDSA65_RSA3072_PSS_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa65Rsa4096Pkcs15Sha512 extends OpenSslCompositeMlDsaKeyFactory {
        public Mldsa65Rsa4096Pkcs15Sha512() {
            super(CompositeMlDsaAlgorithm.MLDSA65_RSA4096_PKCS15_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa65Rsa4096PssSha512 extends OpenSslCompositeMlDsaKeyFactory {
        public Mldsa65Rsa4096PssSha512() {
            super(CompositeMlDsaAlgorithm.MLDSA65_RSA4096_PSS_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa87EcdsaP384Sha512 extends OpenSslCompositeMlDsaKeyFactory {
        public Mldsa87EcdsaP384Sha512() {
            super(CompositeMlDsaAlgorithm.MLDSA87_ECDSA_P384_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa87EcdsaP521Sha512 extends OpenSslCompositeMlDsaKeyFactory {
        public Mldsa87EcdsaP521Sha512() {
            super(CompositeMlDsaAlgorithm.MLDSA87_ECDSA_P521_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa87Rsa3072PssSha512 extends OpenSslCompositeMlDsaKeyFactory {
        public Mldsa87Rsa3072PssSha512() {
            super(CompositeMlDsaAlgorithm.MLDSA87_RSA3072_PSS_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa87Rsa4096PssSha512 extends OpenSslCompositeMlDsaKeyFactory {
        public Mldsa87Rsa4096PssSha512() {
            super(CompositeMlDsaAlgorithm.MLDSA87_RSA4096_PSS_SHA512);
        }
    }

    private OpenSslCompositeMlDsaKeyFactory(CompositeMlDsaAlgorithm compositeMlDsaAlgorithm) {
        this.algorithm = compositeMlDsaAlgorithm;
    }

    private byte[] parsePkcs8(byte[] bArr) throws Throwable {
        long j;
        long jAsn1_read_sequence;
        long j2 = 0;
        try {
            long jAsn1_read_init = NativeCrypto.asn1_read_init(bArr);
            try {
                jAsn1_read_sequence = NativeCrypto.asn1_read_sequence(jAsn1_read_init);
                try {
                    long jAsn1_read_uint64 = NativeCrypto.asn1_read_uint64(jAsn1_read_sequence);
                    if (jAsn1_read_uint64 != 0) {
                        throw new InvalidKeySpecException("Invalid PKCS#8 version: " + jAsn1_read_uint64);
                    }
                    long jAsn1_read_sequence2 = NativeCrypto.asn1_read_sequence(jAsn1_read_sequence);
                    if (!NativeCrypto.asn1_read_oid_raw(jAsn1_read_sequence2).equals(this.algorithm.getOid())) {
                        throw new InvalidKeySpecException("Incorrect Algorithm OID");
                    }
                    byte[] bArrAsn1_read_octetstring = NativeCrypto.asn1_read_octetstring(jAsn1_read_sequence);
                    if (bArrAsn1_read_octetstring == null || bArrAsn1_read_octetstring.length <= 32) {
                        throw new InvalidKeySpecException("Invalid PKCS#8 encoding: key too short");
                    }
                    NativeCrypto.asn1_read_free(jAsn1_read_init);
                    NativeCrypto.asn1_read_free(jAsn1_read_sequence);
                    NativeCrypto.asn1_read_free(jAsn1_read_sequence2);
                    return bArrAsn1_read_octetstring;
                } catch (IOException e) {
                    e = e;
                    j = 0;
                    j2 = jAsn1_read_init;
                    try {
                        throw new InvalidKeySpecException("Failed to decode PKCS8 structure", e);
                    } catch (Throwable th) {
                        th = th;
                        NativeCrypto.asn1_read_free(j2);
                        NativeCrypto.asn1_read_free(jAsn1_read_sequence);
                        NativeCrypto.asn1_read_free(j);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = 0;
                    j2 = jAsn1_read_init;
                    NativeCrypto.asn1_read_free(j2);
                    NativeCrypto.asn1_read_free(jAsn1_read_sequence);
                    NativeCrypto.asn1_read_free(j);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                jAsn1_read_sequence = 0;
                j2 = jAsn1_read_init;
                j = 0;
            } catch (Throwable th3) {
                th = th3;
                jAsn1_read_sequence = 0;
                j2 = jAsn1_read_init;
                j = 0;
            }
        } catch (IOException e3) {
            e = e3;
            j = 0;
            jAsn1_read_sequence = 0;
        } catch (Throwable th4) {
            th = th4;
            j = 0;
            jAsn1_read_sequence = 0;
        }
    }

    private byte[] parseSubjectPublicKeyInfo(byte[] bArr) throws Throwable {
        long j;
        long jAsn1_read_sequence;
        long j2 = 0;
        try {
            long jAsn1_read_init = NativeCrypto.asn1_read_init(bArr);
            try {
                jAsn1_read_sequence = NativeCrypto.asn1_read_sequence(jAsn1_read_init);
                try {
                    long jAsn1_read_sequence2 = NativeCrypto.asn1_read_sequence(jAsn1_read_sequence);
                    if (!NativeCrypto.asn1_read_oid_raw(jAsn1_read_sequence2).equals(this.algorithm.getOid())) {
                        throw new InvalidKeySpecException("Incorrect Algorithm OID");
                    }
                    byte[] bArrAsn1_read_bitstring_payload = NativeCrypto.asn1_read_bitstring_payload(jAsn1_read_sequence, 0);
                    if (bArrAsn1_read_bitstring_payload == null || bArrAsn1_read_bitstring_payload.length <= 1312) {
                        throw new InvalidKeySpecException("Invalid X.509 SPKI encoding: key too short");
                    }
                    NativeCrypto.asn1_read_free(jAsn1_read_init);
                    NativeCrypto.asn1_read_free(jAsn1_read_sequence);
                    NativeCrypto.asn1_read_free(jAsn1_read_sequence2);
                    return bArrAsn1_read_bitstring_payload;
                } catch (IOException e) {
                    e = e;
                    j = 0;
                    j2 = jAsn1_read_init;
                    try {
                        throw new InvalidKeySpecException("Failed to decode X.509 structure", e);
                    } catch (Throwable th) {
                        th = th;
                        NativeCrypto.asn1_read_free(j2);
                        NativeCrypto.asn1_read_free(jAsn1_read_sequence);
                        NativeCrypto.asn1_read_free(j);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = 0;
                    j2 = jAsn1_read_init;
                    NativeCrypto.asn1_read_free(j2);
                    NativeCrypto.asn1_read_free(jAsn1_read_sequence);
                    NativeCrypto.asn1_read_free(j);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                jAsn1_read_sequence = 0;
                j2 = jAsn1_read_init;
                j = 0;
            } catch (Throwable th3) {
                th = th3;
                jAsn1_read_sequence = 0;
                j2 = jAsn1_read_init;
                j = 0;
            }
        } catch (IOException e3) {
            e = e3;
            j = 0;
            jAsn1_read_sequence = 0;
        } catch (Throwable th4) {
            th = th4;
            j = 0;
            jAsn1_read_sequence = 0;
        }
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec == null) {
            xw3.t("keySpec == null");
            return null;
        }
        if (!(keySpec instanceof EncodedKeySpec)) {
            xw3.t("Unsupported KeySpec");
            return null;
        }
        EncodedKeySpec encodedKeySpec = (EncodedKeySpec) keySpec;
        if (encodedKeySpec.getFormat().equalsIgnoreCase("raw")) {
            return new OpenSslCompositeMlDsaPrivateKey(encodedKeySpec.getEncoded(), this.algorithm);
        }
        if (encodedKeySpec.getFormat().equals("PKCS#8")) {
            return new OpenSslCompositeMlDsaPrivateKey(parsePkcs8(encodedKeySpec.getEncoded()), this.algorithm);
        }
        throw new InvalidKeySpecException("Unsupported key format: " + encodedKeySpec.getFormat() + ". Only raw and PKCS#8 keys are supported.");
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec == null) {
            xw3.t("keySpec == null");
            return null;
        }
        if (!(keySpec instanceof EncodedKeySpec)) {
            xw3.t("Unsupported KeySpec");
            return null;
        }
        EncodedKeySpec encodedKeySpec = (EncodedKeySpec) keySpec;
        if (AddressUtils.asciiEqualsIgnoreCase(encodedKeySpec.getFormat(), "raw")) {
            return new OpenSslCompositeMlDsaPublicKey(encodedKeySpec.getEncoded(), this.algorithm);
        }
        if (encodedKeySpec.getFormat().equals("X.509")) {
            return new OpenSslCompositeMlDsaPublicKey(parseSubjectPublicKeyInfo(encodedKeySpec.getEncoded()), this.algorithm);
        }
        throw new InvalidKeySpecException("Unsupported key format: " + encodedKeySpec.getFormat() + ". Only raw and X.509 keys are supported.");
    }

    @Override // java.security.KeyFactorySpi
    public <T extends KeySpec> T engineGetKeySpec(Key key, Class<T> cls) throws InvalidKeySpecException {
        if (key == null) {
            xw3.t("Key null");
            return null;
        }
        if (cls == null) {
            xw3.t("keySpec null");
            return null;
        }
        if (key instanceof OpenSslCompositeMlDsaPublicKey) {
            OpenSslCompositeMlDsaPublicKey openSslCompositeMlDsaPublicKey = (OpenSslCompositeMlDsaPublicKey) key;
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(openSslCompositeMlDsaPublicKey.getEncoded());
            }
            if (EncodedKeySpec.class.isAssignableFrom(cls)) {
                return (T) KeySpecUtil.makeRawKeySpec(openSslCompositeMlDsaPublicKey.getRaw(), cls);
            }
        } else if (key instanceof OpenSslCompositeMlDsaPrivateKey) {
            OpenSslCompositeMlDsaPrivateKey openSslCompositeMlDsaPrivateKey = (OpenSslCompositeMlDsaPrivateKey) key;
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (EncodedKeySpec.class.isAssignableFrom(cls)) {
                return (T) KeySpecUtil.makeRawKeySpec(openSslCompositeMlDsaPrivateKey.getRaw(), cls);
            }
        }
        throw new InvalidKeySpecException("Unsupported keySpec: ".concat(cls.getName()));
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof OpenSslCompositeMlDsaPublicKey) || (key instanceof OpenSslCompositeMlDsaPrivateKey)) {
            return key;
        }
        u52.u("Unsupported key");
        return null;
    }

    public CompositeMlDsaAlgorithm getAlgorithm() {
        return this.algorithm;
    }
}
