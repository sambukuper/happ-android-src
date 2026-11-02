package org.conscrypt;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class OpenSslCompositeMlDsaPrivateKey implements PrivateKey {
    private static final int ML_DSA_SEED_LENGTH = 32;
    private final CompositeMlDsaAlgorithm algorithm;
    private final PrivateKey classicPrivateKey;
    private final byte[] classicRawKey;
    private final OpenSslMlDsaPrivateKey mlDsaPrivateKey;

    public OpenSslCompositeMlDsaPrivateKey(byte[] bArr, CompositeMlDsaAlgorithm compositeMlDsaAlgorithm) throws InvalidKeySpecException {
        this.algorithm = compositeMlDsaAlgorithm;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 32);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 32, bArr.length);
        this.mlDsaPrivateKey = new OpenSslMlDsaPrivateKey(bArrCopyOf, compositeMlDsaAlgorithm.getMlDsaAlgorithm());
        this.classicPrivateKey = createClassicPrivateKey(compositeMlDsaAlgorithm, bArrCopyOfRange);
        this.classicRawKey = bArrCopyOfRange;
    }

    private static PrivateKey createClassicPrivateKey(CompositeMlDsaAlgorithm compositeMlDsaAlgorithm, byte[] bArr) throws InvalidKeySpecException {
        if (compositeMlDsaAlgorithm.getClassicAlgorithm().equals("Ed25519")) {
            if (bArr.length == 32) {
                return new OpenSslEdDsaPrivateKey(bArr);
            }
            throw new InvalidKeySpecException("Invalid Ed25519 private key length: " + bArr.length);
        }
        if (compositeMlDsaAlgorithm.getClassicAlgorithm().equals("RSA")) {
            return OpenSSLKey.getPrivateKey(new PKCS8EncodedKeySpec(NativeCrypto.wrap_RSA_private_key_pkcs8(bArr)), 6);
        }
        if (compositeMlDsaAlgorithm.getClassicAlgorithm().equals("EC")) {
            return OpenSSLKey.getPrivateKey(new PKCS8EncodedKeySpec(NativeCrypto.wrap_EC_private_key_pkcs8(bArr)), 408);
        }
        throw new InvalidKeySpecException("Unsupported classic algorithm: " + compositeMlDsaAlgorithm.getClassicAlgorithm());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new UnsupportedOperationException("serialization not supported");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw new UnsupportedOperationException("serialization not supported");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OpenSslCompositeMlDsaPrivateKey)) {
            return false;
        }
        OpenSslCompositeMlDsaPrivateKey openSslCompositeMlDsaPrivateKey = (OpenSslCompositeMlDsaPrivateKey) obj;
        return this.algorithm == openSslCompositeMlDsaPrivateKey.algorithm && MessageDigest.isEqual(getRaw(), openSslCompositeMlDsaPrivateKey.getRaw());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm.getName();
    }

    public PrivateKey getClassicPrivateKey() {
        return this.classicPrivateKey;
    }

    public CompositeMlDsaAlgorithm getCompositeMlDsaAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() throws Throwable {
        long jAsn1_write_init;
        long jAsn1_write_sequence;
        long j;
        long jAsn1_write_sequence2 = 0;
        try {
            jAsn1_write_init = NativeCrypto.asn1_write_init();
            try {
                jAsn1_write_sequence = NativeCrypto.asn1_write_sequence(jAsn1_write_init);
                try {
                    NativeCrypto.asn1_write_uint64(jAsn1_write_sequence, 0L);
                    jAsn1_write_sequence2 = NativeCrypto.asn1_write_sequence(jAsn1_write_sequence);
                    NativeCrypto.asn1_write_oid_raw(jAsn1_write_sequence2, this.algorithm.getOid());
                    NativeCrypto.asn1_write_flush(jAsn1_write_sequence);
                    NativeCrypto.asn1_write_octetstring(jAsn1_write_sequence, getRaw());
                    byte[] bArrAsn1_write_finish = NativeCrypto.asn1_write_finish(jAsn1_write_init);
                    NativeCrypto.asn1_write_free(jAsn1_write_sequence2);
                    NativeCrypto.asn1_write_free(jAsn1_write_sequence);
                    NativeCrypto.asn1_write_free(jAsn1_write_init);
                    return bArrAsn1_write_finish;
                } catch (IOException e) {
                    e = e;
                    j = jAsn1_write_sequence2;
                    jAsn1_write_sequence2 = jAsn1_write_init;
                    try {
                        NativeCrypto.asn1_write_cleanup(jAsn1_write_sequence2);
                        throw new IllegalStateException("Failed to encode composite ML-DSA private key", e);
                    } catch (Throwable th) {
                        th = th;
                        long j2 = j;
                        jAsn1_write_init = jAsn1_write_sequence2;
                        jAsn1_write_sequence2 = j2;
                        NativeCrypto.asn1_write_free(jAsn1_write_sequence2);
                        NativeCrypto.asn1_write_free(jAsn1_write_sequence);
                        NativeCrypto.asn1_write_free(jAsn1_write_init);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    NativeCrypto.asn1_write_free(jAsn1_write_sequence2);
                    NativeCrypto.asn1_write_free(jAsn1_write_sequence);
                    NativeCrypto.asn1_write_free(jAsn1_write_init);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                jAsn1_write_sequence = 0;
                jAsn1_write_sequence2 = jAsn1_write_init;
                j = 0;
            } catch (Throwable th3) {
                th = th3;
                jAsn1_write_sequence = 0;
            }
        } catch (IOException e3) {
            e = e3;
            j = 0;
            jAsn1_write_sequence = 0;
        } catch (Throwable th4) {
            th = th4;
            jAsn1_write_init = 0;
            jAsn1_write_sequence = 0;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public OpenSslMlDsaPrivateKey getMlDsaPrivateKey() {
        return this.mlDsaPrivateKey;
    }

    public byte[] getRaw() {
        byte[] seed = this.mlDsaPrivateKey.getSeed();
        byte[] bArr = new byte[seed.length + this.classicRawKey.length];
        System.arraycopy(seed, 0, bArr, 0, seed.length);
        byte[] bArr2 = this.classicRawKey;
        System.arraycopy(bArr2, 0, bArr, seed.length, bArr2.length);
        return bArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getRaw());
    }
}
