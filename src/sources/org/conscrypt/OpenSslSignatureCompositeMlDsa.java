package org.conscrypt;

import defpackage.bt;
import defpackage.u52;
import defpackage.xw3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class OpenSslSignatureCompositeMlDsa extends SignatureSpi {
    private final CompositeMlDsaAlgorithm algorithm;
    private OpenSSLMessageDigestJDK messageDigest;
    private OpenSslCompositeMlDsaPrivateKey signKey;
    private OpenSslCompositeMlDsaPublicKey verifyKey;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa44EcdsaP256Sha256 extends OpenSslSignatureCompositeMlDsa {
        public Mldsa44EcdsaP256Sha256() {
            super(CompositeMlDsaAlgorithm.MLDSA44_ECDSA_P256_SHA256);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa44Ed25519Sha512 extends OpenSslSignatureCompositeMlDsa {
        public Mldsa44Ed25519Sha512() {
            super(CompositeMlDsaAlgorithm.MLDSA44_ED25519_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa44Rsa2048Pkcs15Sha256 extends OpenSslSignatureCompositeMlDsa {
        public Mldsa44Rsa2048Pkcs15Sha256() {
            super(CompositeMlDsaAlgorithm.MLDSA44_RSA2048_PKCS15_SHA256);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa44Rsa2048PssSha256 extends OpenSslSignatureCompositeMlDsa {
        public Mldsa44Rsa2048PssSha256() {
            super(CompositeMlDsaAlgorithm.MLDSA44_RSA2048_PSS_SHA256);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa65EcdsaP256Sha512 extends OpenSslSignatureCompositeMlDsa {
        public Mldsa65EcdsaP256Sha512() {
            super(CompositeMlDsaAlgorithm.MLDSA65_ECDSA_P256_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa65EcdsaP384Sha512 extends OpenSslSignatureCompositeMlDsa {
        public Mldsa65EcdsaP384Sha512() {
            super(CompositeMlDsaAlgorithm.MLDSA65_ECDSA_P384_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa65Ed25519Sha512 extends OpenSslSignatureCompositeMlDsa {
        public Mldsa65Ed25519Sha512() {
            super(CompositeMlDsaAlgorithm.MLDSA65_ED25519_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa65Rsa3072Pkcs15Sha512 extends OpenSslSignatureCompositeMlDsa {
        public Mldsa65Rsa3072Pkcs15Sha512() {
            super(CompositeMlDsaAlgorithm.MLDSA65_RSA3072_PKCS15_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa65Rsa3072PssSha512 extends OpenSslSignatureCompositeMlDsa {
        public Mldsa65Rsa3072PssSha512() {
            super(CompositeMlDsaAlgorithm.MLDSA65_RSA3072_PSS_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa65Rsa4096Pkcs15Sha512 extends OpenSslSignatureCompositeMlDsa {
        public Mldsa65Rsa4096Pkcs15Sha512() {
            super(CompositeMlDsaAlgorithm.MLDSA65_RSA4096_PKCS15_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa65Rsa4096PssSha512 extends OpenSslSignatureCompositeMlDsa {
        public Mldsa65Rsa4096PssSha512() {
            super(CompositeMlDsaAlgorithm.MLDSA65_RSA4096_PSS_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa87EcdsaP384Sha512 extends OpenSslSignatureCompositeMlDsa {
        public Mldsa87EcdsaP384Sha512() {
            super(CompositeMlDsaAlgorithm.MLDSA87_ECDSA_P384_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa87EcdsaP521Sha512 extends OpenSslSignatureCompositeMlDsa {
        public Mldsa87EcdsaP521Sha512() {
            super(CompositeMlDsaAlgorithm.MLDSA87_ECDSA_P521_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa87Rsa3072PssSha512 extends OpenSslSignatureCompositeMlDsa {
        public Mldsa87Rsa3072PssSha512() {
            super(CompositeMlDsaAlgorithm.MLDSA87_RSA3072_PSS_SHA512);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class Mldsa87Rsa4096PssSha512 extends OpenSslSignatureCompositeMlDsa {
        public Mldsa87Rsa4096PssSha512() {
            super(CompositeMlDsaAlgorithm.MLDSA87_RSA4096_PSS_SHA512);
        }
    }

    private OpenSslSignatureCompositeMlDsa(CompositeMlDsaAlgorithm compositeMlDsaAlgorithm) {
        this.algorithm = compositeMlDsaAlgorithm;
    }

    private byte[] createMessageRepresentative() throws SignatureException {
        Charset charset = StandardCharsets.US_ASCII;
        byte[] bytes = "CompositeAlgorithmSignatures2025".getBytes(charset);
        byte[] bytes2 = this.algorithm.getLabel().getBytes(charset);
        OpenSSLMessageDigestJDK openSSLMessageDigestJDK = this.messageDigest;
        if (openSSLMessageDigestJDK == null) {
            throw new SignatureException("Not initialized");
        }
        byte[] bArrEngineDigest = openSSLMessageDigestJDK.engineDigest();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(bytes);
            byteArrayOutputStream.write(bytes2);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(bArrEngineDigest);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new SignatureException("Failed to create message representative", e);
        }
    }

    private void resetDigest() {
        try {
            String preHashAlgorithm = this.algorithm.getPreHashAlgorithm();
            int iHashCode = preHashAlgorithm.hashCode();
            if (iHashCode != -1523887726) {
                if (iHashCode == -1523884971 && preHashAlgorithm.equals("SHA-512")) {
                    this.messageDigest = new OpenSSLMessageDigestJDK.SHA512();
                    return;
                }
            } else if (preHashAlgorithm.equals("SHA-256")) {
                this.messageDigest = new OpenSSLMessageDigestJDK.SHA256();
                return;
            }
            throw new IllegalStateException("Unsupported pre-hash algorithm: " + this.algorithm.getPreHashAlgorithm());
        } catch (NoSuchAlgorithmException e) {
            xw3.o("Failed to create message digest", e);
        }
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof OpenSslCompositeMlDsaPrivateKey)) {
            u52.u("Require OpenSslCompositeMlDsaPrivateKey");
            return;
        }
        OpenSslCompositeMlDsaPrivateKey openSslCompositeMlDsaPrivateKey = (OpenSslCompositeMlDsaPrivateKey) privateKey;
        if (openSslCompositeMlDsaPrivateKey.getCompositeMlDsaAlgorithm() == this.algorithm) {
            this.signKey = openSslCompositeMlDsaPrivateKey;
            this.verifyKey = null;
            resetDigest();
        } else {
            StringBuilder sb = new StringBuilder("Algorithm mismatch: expected ");
            sb.append(this.algorithm);
            CompositeMlDsaAlgorithm compositeMlDsaAlgorithm = openSslCompositeMlDsaPrivateKey.getCompositeMlDsaAlgorithm();
            sb.append(", got ");
            sb.append(compositeMlDsaAlgorithm);
            throw new InvalidKeyException(sb.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof OpenSslCompositeMlDsaPublicKey)) {
            u52.u("Require OpenSslCompositeMlDsaPublicKey");
            return;
        }
        OpenSslCompositeMlDsaPublicKey openSslCompositeMlDsaPublicKey = (OpenSslCompositeMlDsaPublicKey) publicKey;
        if (openSslCompositeMlDsaPublicKey.getCompositeMlDsaAlgorithm() == this.algorithm) {
            this.verifyKey = openSslCompositeMlDsaPublicKey;
            this.signKey = null;
            resetDigest();
        } else {
            StringBuilder sb = new StringBuilder("Algorithm mismatch: expected ");
            sb.append(this.algorithm);
            CompositeMlDsaAlgorithm compositeMlDsaAlgorithm = openSslCompositeMlDsaPublicKey.getCompositeMlDsaAlgorithm();
            sb.append(", got ");
            sb.append(compositeMlDsaAlgorithm);
            throw new InvalidKeyException(sb.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException, IOException {
        byte[] bArrEngineSign;
        SignatureSpi sha512ecdsa;
        SignatureSpi sha512rsa;
        if (this.signKey == null) {
            throw new SignatureException("No key provided");
        }
        byte[] bArrCreateMessageRepresentative = createMessageRepresentative();
        NativeRef.EVP_MD_CTX evp_md_ctx = new NativeRef.EVP_MD_CTX(NativeCrypto.EVP_MD_CTX_create());
        NativeCrypto.EVP_PKEY_CTX_set1_signature_context_string(NativeCrypto.EVP_DigestSignInit(evp_md_ctx, 0L, this.signKey.getMlDsaPrivateKey().getOpenSSLKey().getNativeRef()), this.algorithm.getLabel().getBytes(StandardCharsets.US_ASCII));
        byte[] bArrEVP_DigestSign = NativeCrypto.EVP_DigestSign(evp_md_ctx, bArrCreateMessageRepresentative, 0, bArrCreateMessageRepresentative.length);
        String classicAlgorithm = this.algorithm.getClassicAlgorithm();
        classicAlgorithm.getClass();
        switch (classicAlgorithm) {
            case "Ed25519":
                OpenSslSignatureEdDsa openSslSignatureEdDsa = new OpenSslSignatureEdDsa();
                try {
                    openSslSignatureEdDsa.engineInitSign(this.signKey.getClassicPrivateKey());
                    openSslSignatureEdDsa.engineUpdate(bArrCreateMessageRepresentative, 0, bArrCreateMessageRepresentative.length);
                    bArrEngineSign = openSslSignatureEdDsa.engineSign();
                    break;
                } catch (InvalidKeyException e) {
                    throw new SignatureException("Failed to initialize Ed25519 signature", e);
                }
                break;
            case "EC":
                String classicSignatureDigest = this.algorithm.getClassicSignatureDigest();
                if (classicSignatureDigest == null) {
                    bt.i("Classic signature digest is null");
                    return null;
                }
                if (classicSignatureDigest.equals("SHA-256")) {
                    sha512ecdsa = new OpenSSLSignature.SHA256ECDSA();
                } else if (classicSignatureDigest.equals("SHA-384")) {
                    sha512ecdsa = new OpenSSLSignature.SHA384ECDSA();
                } else {
                    if (!classicSignatureDigest.equals("SHA-512")) {
                        bt.i("Unsupported digest: ".concat(classicSignatureDigest));
                        return null;
                    }
                    sha512ecdsa = new OpenSSLSignature.SHA512ECDSA();
                }
                try {
                    sha512ecdsa.engineInitSign(this.signKey.getClassicPrivateKey());
                    sha512ecdsa.engineUpdate(bArrCreateMessageRepresentative, 0, bArrCreateMessageRepresentative.length);
                    bArrEngineSign = sha512ecdsa.engineSign();
                } catch (InvalidKeyException e2) {
                    throw new SignatureException("Failed to initialize EC signature", e2);
                }
                break;
                break;
            case "RSA":
                String classicSignatureDigest2 = this.algorithm.getClassicSignatureDigest();
                if (classicSignatureDigest2 == null) {
                    bt.i("Classic signature digest is null");
                    return null;
                }
                if (this.algorithm.isPss()) {
                    if (classicSignatureDigest2.equals("SHA-256")) {
                        sha512rsa = new OpenSSLSignature.SHA256RSAPSS();
                    } else if (classicSignatureDigest2.equals("SHA-384")) {
                        sha512rsa = new OpenSSLSignature.SHA384RSAPSS();
                    } else {
                        if (!classicSignatureDigest2.equals("SHA-512")) {
                            bt.i("Unsupported digest: ".concat(classicSignatureDigest2));
                            return null;
                        }
                        sha512rsa = new OpenSSLSignature.SHA512RSAPSS();
                    }
                } else if (classicSignatureDigest2.equals("SHA-256")) {
                    sha512rsa = new OpenSSLSignature.SHA256RSA();
                } else if (classicSignatureDigest2.equals("SHA-384")) {
                    sha512rsa = new OpenSSLSignature.SHA384RSA();
                } else {
                    if (!classicSignatureDigest2.equals("SHA-512")) {
                        bt.i("Unsupported digest: ".concat(classicSignatureDigest2));
                        return null;
                    }
                    sha512rsa = new OpenSSLSignature.SHA512RSA();
                }
                try {
                    sha512rsa.engineInitSign(this.signKey.getClassicPrivateKey());
                    sha512rsa.engineUpdate(bArrCreateMessageRepresentative, 0, bArrCreateMessageRepresentative.length);
                    bArrEngineSign = sha512rsa.engineSign();
                } catch (InvalidKeyException e3) {
                    throw new SignatureException("Failed to initialize RSA signature", e3);
                }
                break;
                break;
            default:
                bt.p(this.algorithm.getClassicAlgorithm(), "Unsupported classic algorithm: ");
                return null;
        }
        byte[] bArr = new byte[bArrEVP_DigestSign.length + bArrEngineSign.length];
        System.arraycopy(bArrEVP_DigestSign, 0, bArr, 0, bArrEVP_DigestSign.length);
        System.arraycopy(bArrEngineSign, 0, bArr, bArrEVP_DigestSign.length, bArrEngineSign.length);
        return bArr;
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) throws SignatureException {
        OpenSSLMessageDigestJDK openSSLMessageDigestJDK = this.messageDigest;
        if (openSSLMessageDigestJDK == null) {
            throw new SignatureException("Not initialized");
        }
        openSSLMessageDigestJDK.engineUpdate(b);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException, IOException {
        int i;
        boolean zEngineVerify;
        SignatureSpi sha512ecdsa;
        SignatureSpi sha512rsa;
        if (this.verifyKey == null) {
            throw new SignatureException("No verify key provided");
        }
        byte[] bArrCreateMessageRepresentative = createMessageRepresentative();
        if (this.algorithm.getMlDsaAlgorithm().equals(MlDsaAlgorithm.ML_DSA_44)) {
            i = 2420;
        } else if (this.algorithm.getMlDsaAlgorithm().equals(MlDsaAlgorithm.ML_DSA_65)) {
            i = 3309;
        } else {
            if (!this.algorithm.getMlDsaAlgorithm().equals(MlDsaAlgorithm.ML_DSA_87)) {
                bt.p(this.algorithm.getMlDsaAlgorithm(), "Unsupported ML-DSA algorithm: ");
                return false;
            }
            i = 4627;
        }
        if (bArr.length <= i) {
            return false;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i, bArr.length);
        NativeRef.EVP_MD_CTX evp_md_ctx = new NativeRef.EVP_MD_CTX(NativeCrypto.EVP_MD_CTX_create());
        NativeCrypto.EVP_PKEY_CTX_set1_signature_context_string(NativeCrypto.EVP_DigestVerifyInit(evp_md_ctx, 0L, this.verifyKey.getMlDsaPublicKey().getOpenSSLKey().getNativeRef()), this.algorithm.getLabel().getBytes(StandardCharsets.US_ASCII));
        boolean zEVP_DigestVerify = NativeCrypto.EVP_DigestVerify(evp_md_ctx, bArrCopyOfRange, 0, bArrCopyOfRange.length, bArrCreateMessageRepresentative, 0, bArrCreateMessageRepresentative.length);
        String classicAlgorithm = this.algorithm.getClassicAlgorithm();
        classicAlgorithm.getClass();
        switch (classicAlgorithm) {
            case "Ed25519":
                OpenSslSignatureEdDsa openSslSignatureEdDsa = new OpenSslSignatureEdDsa();
                try {
                    openSslSignatureEdDsa.engineInitVerify(this.verifyKey.getClassicPublicKey());
                    openSslSignatureEdDsa.engineUpdate(bArrCreateMessageRepresentative, 0, bArrCreateMessageRepresentative.length);
                    zEngineVerify = openSslSignatureEdDsa.engineVerify(bArrCopyOfRange2);
                    break;
                } catch (InvalidKeyException e) {
                    throw new SignatureException("Failed to initialize Ed25519 signature", e);
                }
                break;
            case "EC":
                String classicSignatureDigest = this.algorithm.getClassicSignatureDigest();
                if (classicSignatureDigest == null) {
                    bt.i("Classic signature digest is null");
                    return false;
                }
                if (classicSignatureDigest.equals("SHA-256")) {
                    sha512ecdsa = new OpenSSLSignature.SHA256ECDSA();
                } else if (classicSignatureDigest.equals("SHA-384")) {
                    sha512ecdsa = new OpenSSLSignature.SHA384ECDSA();
                } else {
                    if (!classicSignatureDigest.equals("SHA-512")) {
                        bt.i("Unsupported digest: ".concat(classicSignatureDigest));
                        return false;
                    }
                    sha512ecdsa = new OpenSSLSignature.SHA512ECDSA();
                }
                try {
                    sha512ecdsa.engineInitVerify(this.verifyKey.getClassicPublicKey());
                    sha512ecdsa.engineUpdate(bArrCreateMessageRepresentative, 0, bArrCreateMessageRepresentative.length);
                    zEngineVerify = sha512ecdsa.engineVerify(bArrCopyOfRange2);
                } catch (InvalidKeyException e2) {
                    throw new SignatureException("Failed to initialize EC signature", e2);
                }
                break;
                break;
            case "RSA":
                String classicSignatureDigest2 = this.algorithm.getClassicSignatureDigest();
                if (classicSignatureDigest2 == null) {
                    bt.i("Classic signature digest is null");
                    return false;
                }
                if (this.algorithm.isPss()) {
                    if (classicSignatureDigest2.equals("SHA-256")) {
                        sha512rsa = new OpenSSLSignature.SHA256RSAPSS();
                    } else if (classicSignatureDigest2.equals("SHA-384")) {
                        sha512rsa = new OpenSSLSignature.SHA384RSAPSS();
                    } else {
                        if (!classicSignatureDigest2.equals("SHA-512")) {
                            bt.i("Unsupported digest: ".concat(classicSignatureDigest2));
                            return false;
                        }
                        sha512rsa = new OpenSSLSignature.SHA512RSAPSS();
                    }
                } else if (classicSignatureDigest2.equals("SHA-256")) {
                    sha512rsa = new OpenSSLSignature.SHA256RSA();
                } else if (classicSignatureDigest2.equals("SHA-384")) {
                    sha512rsa = new OpenSSLSignature.SHA384RSA();
                } else {
                    if (!classicSignatureDigest2.equals("SHA-512")) {
                        bt.i("Unsupported digest: ".concat(classicSignatureDigest2));
                        return false;
                    }
                    sha512rsa = new OpenSSLSignature.SHA512RSA();
                }
                try {
                    sha512rsa.engineInitVerify(this.verifyKey.getClassicPublicKey());
                    sha512rsa.engineUpdate(bArrCreateMessageRepresentative, 0, bArrCreateMessageRepresentative.length);
                    zEngineVerify = sha512rsa.engineVerify(bArrCopyOfRange2);
                } catch (InvalidKeyException e3) {
                    throw new SignatureException("Failed to initialize RSA signature", e3);
                }
                break;
                break;
            default:
                bt.p(this.algorithm.getClassicAlgorithm(), "Unsupported classic algorithm: ");
                return false;
        }
        return zEVP_DigestVerify && zEngineVerify;
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        OpenSSLMessageDigestJDK openSSLMessageDigestJDK = this.messageDigest;
        if (openSSLMessageDigestJDK != null) {
            openSSLMessageDigestJDK.engineUpdate(bArr, i, i2);
            return;
        }
        throw new SignatureException("Not initialized");
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
    }
}
