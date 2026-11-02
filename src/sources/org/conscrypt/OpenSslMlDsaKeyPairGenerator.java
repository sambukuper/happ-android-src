package org.conscrypt;

import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class OpenSslMlDsaKeyPairGenerator extends KeyPairGenerator {

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class MlDsa extends MlDsa65 {
        public MlDsa() {
            super("ML-DSA");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class MlDsa44 extends OpenSslMlDsaKeyPairGenerator {
        public MlDsa44() {
            super("ML-DSA-44");
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public KeyPair generateKeyPair() {
            byte[] bArr = new byte[32];
            NativeCrypto.RAND_bytes(bArr);
            byte[] bArrMLDSA44_public_key_from_seed = NativeCrypto.MLDSA44_public_key_from_seed(bArr);
            MlDsaAlgorithm mlDsaAlgorithm = MlDsaAlgorithm.ML_DSA_44;
            return new KeyPair(new OpenSslMlDsaPublicKey(bArrMLDSA44_public_key_from_seed, mlDsaAlgorithm), new OpenSslMlDsaPrivateKey(bArr, mlDsaAlgorithm));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static final class MlDsa87 extends OpenSslMlDsaKeyPairGenerator {
        public MlDsa87() {
            super("ML-DSA-87");
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public KeyPair generateKeyPair() {
            byte[] bArr = new byte[32];
            NativeCrypto.RAND_bytes(bArr);
            byte[] bArrMLDSA87_public_key_from_seed = NativeCrypto.MLDSA87_public_key_from_seed(bArr);
            MlDsaAlgorithm mlDsaAlgorithm = MlDsaAlgorithm.ML_DSA_87;
            return new KeyPair(new OpenSslMlDsaPublicKey(bArrMLDSA87_public_key_from_seed, mlDsaAlgorithm), new OpenSslMlDsaPrivateKey(bArr, mlDsaAlgorithm));
        }
    }

    @Override // java.security.KeyPairGenerator
    public void initialize(int i) throws InvalidParameterException {
        if (i != -1) {
            throw new InvalidParameterException("ML-DSA only supports -1 for bits");
        }
    }

    private OpenSslMlDsaKeyPairGenerator(String str) {
        super(str);
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class MlDsa65 extends OpenSslMlDsaKeyPairGenerator {
        public MlDsa65() {
            super("ML-DSA-65");
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public KeyPair generateKeyPair() {
            byte[] bArr = new byte[32];
            NativeCrypto.RAND_bytes(bArr);
            byte[] bArrMLDSA65_public_key_from_seed = NativeCrypto.MLDSA65_public_key_from_seed(bArr);
            MlDsaAlgorithm mlDsaAlgorithm = MlDsaAlgorithm.ML_DSA_65;
            return new KeyPair(new OpenSslMlDsaPublicKey(bArrMLDSA65_public_key_from_seed, mlDsaAlgorithm), new OpenSslMlDsaPrivateKey(bArr, mlDsaAlgorithm));
        }

        public MlDsa65(String str) {
            super(str);
        }
    }
}
