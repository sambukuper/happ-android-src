package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.security.KeyStore;
import java.util.concurrent.CancellationException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oe {
    public static final oe a = new oe();
    public static final vz7 b = new vz7(new x((byte) 14));
    public static final vz7 c = new vz7(new x((byte) 15));

    public static SecretKey a() {
        Object rj6Var;
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder("key", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).build());
            rj6Var = keyGenerator.generateKey();
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (rj6Var instanceof rj6) {
            rj6Var = null;
        }
        return (SecretKey) rj6Var;
    }

    public static Cipher b(String str, int i, SecretKey secretKey) {
        vz7 vz7Var = b;
        try {
            ((Cipher) vz7Var.getValue()).init(i, secretKey, new GCMParameterSpec(128, Base64.decode(str, 0)));
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
        }
        Cipher cipher = (Cipher) vz7Var.getValue();
        cipher.getClass();
        return cipher;
    }

    public static SecretKey c() {
        Object rj6Var;
        try {
            KeyStore.Entry entry = ((KeyStore) c.getValue()).getEntry("key", null);
            entry.getClass();
            rj6Var = ((KeyStore.SecretKeyEntry) entry).getSecretKey();
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        return (SecretKey) (rj6Var instanceof rj6 ? null : rj6Var);
    }
}
