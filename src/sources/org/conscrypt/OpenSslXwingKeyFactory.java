package org.conscrypt;

import defpackage.u52;
import defpackage.xw3;
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
public final class OpenSslXwingKeyFactory extends KeyFactorySpi {
    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec == null) {
            xw3.t("keySpec == null");
            return null;
        }
        if (keySpec instanceof EncodedKeySpec) {
            return new OpenSslXwingPrivateKey((EncodedKeySpec) keySpec);
        }
        throw new InvalidKeySpecException("Currently only EncodedKeySpec is supported; was ".concat(keySpec.getClass().getName()));
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec == null) {
            xw3.t("keySpec == null");
            return null;
        }
        if (keySpec instanceof EncodedKeySpec) {
            return new OpenSslXwingPublicKey((EncodedKeySpec) keySpec);
        }
        throw new InvalidKeySpecException("Currently only EncodedKeySpec is supported; was ".concat(keySpec.getClass().getName()));
    }

    @Override // java.security.KeyFactorySpi
    public <T extends KeySpec> T engineGetKeySpec(Key key, Class<T> cls) throws InvalidKeySpecException {
        if (key == null) {
            xw3.t("key == null");
            return null;
        }
        if (cls == null) {
            xw3.t("keySpec == null");
            return null;
        }
        try {
            Key keyEngineTranslateKey = engineTranslateKey(key);
            if (keyEngineTranslateKey instanceof OpenSslXwingPublicKey) {
                OpenSslXwingPublicKey openSslXwingPublicKey = (OpenSslXwingPublicKey) keyEngineTranslateKey;
                if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                    return new X509EncodedKeySpec(keyEngineTranslateKey.getEncoded());
                }
                if (EncodedKeySpec.class.isAssignableFrom(cls)) {
                    return (T) KeySpecUtil.makeRawKeySpec(openSslXwingPublicKey.getRaw(), cls);
                }
            } else if (keyEngineTranslateKey instanceof OpenSslXwingPrivateKey) {
                OpenSslXwingPrivateKey openSslXwingPrivateKey = (OpenSslXwingPrivateKey) keyEngineTranslateKey;
                if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                    return new PKCS8EncodedKeySpec(keyEngineTranslateKey.getEncoded());
                }
                if (EncodedKeySpec.class.isAssignableFrom(cls)) {
                    return (T) KeySpecUtil.makeRawKeySpec(openSslXwingPrivateKey.getRaw(), cls);
                }
            }
            throw new InvalidKeySpecException("Unsupported key type and key spec combination; key=" + keyEngineTranslateKey.getClass().getName() + ", keySpec=" + cls.getName());
        } catch (InvalidKeyException e) {
            throw new InvalidKeySpecException("Unsupported key class: " + key.getClass(), e);
        }
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key == null) {
            u52.u("key == null");
            return null;
        }
        if ((key instanceof OpenSslXwingPublicKey) || (key instanceof OpenSslXwingPrivateKey)) {
            return key;
        }
        if ((key instanceof PrivateKey) && key.getFormat().equals("PKCS#8")) {
            byte[] encoded = key.getEncoded();
            if (encoded == null) {
                u52.u("Key does not support encoding");
                return null;
            }
            try {
                return engineGeneratePrivate(new PKCS8EncodedKeySpec(encoded));
            } catch (InvalidKeySpecException e) {
                xw3.q(e);
                return null;
            }
        }
        if (!(key instanceof PublicKey) || !key.getFormat().equals("X.509")) {
            u52.u("Key is not a XWING key");
            return null;
        }
        byte[] encoded2 = key.getEncoded();
        if (encoded2 == null) {
            u52.u("Key does not support encoding");
            return null;
        }
        try {
            return engineGeneratePublic(new X509EncodedKeySpec(encoded2));
        } catch (InvalidKeySpecException e2) {
            xw3.q(e2);
            return null;
        }
    }
}
