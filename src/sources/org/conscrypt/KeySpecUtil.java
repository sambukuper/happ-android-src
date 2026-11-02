package org.conscrypt;

import java.lang.reflect.InvocationTargetException;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class KeySpecUtil {
    private KeySpecUtil() {
    }

    public static <T extends KeySpec> T makeRawKeySpec(byte[] bArr, Class<T> cls) throws InvalidKeySpecException {
        try {
            T tNewInstance = cls.getConstructor(byte[].class).newInstance(bArr);
            if (((EncodedKeySpec) tNewInstance).getFormat().equalsIgnoreCase("raw")) {
                return tNewInstance;
            }
            throw new InvalidKeySpecException("EncodedKeySpec class must be raw format");
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new InvalidKeySpecException("Can't process KeySpec class ".concat(cls.getName()), e);
        }
    }
}
