package org.conscrypt;

import defpackage.xw3;
import io.sentry.util.c;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class OpenSslCompositeMlDsaPublicKey implements PublicKey {
    private final CompositeMlDsaAlgorithm algorithm;
    private final PublicKey classicPublicKey;
    private final byte[] classicRawKey;
    private final OpenSslMlDsaPublicKey mlDsaPublicKey;

    public OpenSslCompositeMlDsaPublicKey(byte[] bArr, CompositeMlDsaAlgorithm compositeMlDsaAlgorithm) throws InvalidKeySpecException, IllegalArgumentException {
        this.algorithm = compositeMlDsaAlgorithm;
        int iPublicKeySize = compositeMlDsaAlgorithm.getMlDsaAlgorithm().publicKeySize();
        byte[] bArrCopyOf = Arrays.copyOf(bArr, iPublicKeySize);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, iPublicKeySize, bArr.length);
        this.mlDsaPublicKey = new OpenSslMlDsaPublicKey(bArrCopyOf, compositeMlDsaAlgorithm.getMlDsaAlgorithm());
        this.classicPublicKey = createClassicPublicKey(compositeMlDsaAlgorithm, bArrCopyOfRange);
        this.classicRawKey = bArrCopyOfRange;
    }

    private static PublicKey createClassicPublicKey(CompositeMlDsaAlgorithm compositeMlDsaAlgorithm, byte[] bArr) throws InvalidKeySpecException, IllegalArgumentException {
        if (compositeMlDsaAlgorithm.getClassicAlgorithm().equals("Ed25519")) {
            if (bArr.length == 32) {
                return new OpenSslEdDsaPublicKey(bArr);
            }
            xw3.h(bArr.length, "Invalid Ed25519 public key length: ");
            return null;
        }
        if (compositeMlDsaAlgorithm.getClassicAlgorithm().equals("RSA")) {
            try {
                return OpenSSLKey.getPublicKey(new X509EncodedKeySpec(NativeCrypto.wrap_RSA_public_key_x509(bArr)), 6);
            } catch (InvalidKeySpecException e) {
                throw new IllegalArgumentException(e);
            }
        }
        if (compositeMlDsaAlgorithm.getClassicAlgorithm().equals("EC")) {
            return OpenSSLKey.getPublicKey(new X509EncodedKeySpec(NativeCrypto.wrap_EC_public_key_x509(bArr, compositeMlDsaAlgorithm.getEcCurve())), 408);
        }
        c.a(compositeMlDsaAlgorithm.getClassicAlgorithm(), "Unsupported classic algorithm: ");
        return null;
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
        if (!(obj instanceof OpenSslCompositeMlDsaPublicKey)) {
            return false;
        }
        OpenSslCompositeMlDsaPublicKey openSslCompositeMlDsaPublicKey = (OpenSslCompositeMlDsaPublicKey) obj;
        return this.algorithm == openSslCompositeMlDsaPublicKey.algorithm && MessageDigest.isEqual(getRaw(), openSslCompositeMlDsaPublicKey.getRaw());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm.getName();
    }

    public PublicKey getClassicPublicKey() {
        return this.classicPublicKey;
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
                    jAsn1_write_sequence2 = NativeCrypto.asn1_write_sequence(jAsn1_write_sequence);
                    NativeCrypto.asn1_write_oid_raw(jAsn1_write_sequence2, this.algorithm.getOid());
                    NativeCrypto.asn1_write_flush(jAsn1_write_sequence);
                    NativeCrypto.asn1_write_bitstring(jAsn1_write_sequence, getRaw());
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
                        throw new IllegalStateException("Failed to encode public key", e);
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
        return "X.509";
    }

    public OpenSslMlDsaPublicKey getMlDsaPublicKey() {
        return this.mlDsaPublicKey;
    }

    public byte[] getRaw() {
        byte[] raw = this.mlDsaPublicKey.getRaw();
        byte[] bArr = new byte[raw.length + this.classicRawKey.length];
        System.arraycopy(raw, 0, bArr, 0, raw.length);
        byte[] bArr2 = this.classicRawKey;
        System.arraycopy(bArr2, 0, bArr, raw.length, bArr2.length);
        return bArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getRaw());
    }
}
