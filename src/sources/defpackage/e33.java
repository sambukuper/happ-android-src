package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.security.AccessControlException;
import java.security.AccessController;
import java.util.MissingResourceException;
import java.util.Properties;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e33 {
    public static final Properties a;

    static {
        Properties properties = new Properties();
        a = properties;
        try {
            InputStream resourceAsStream = System.getSecurityManager() != null ? (InputStream) AccessController.doPrivileged(new ws0((byte) 1)) : g33.class.getResourceAsStream("/com/ibm/icu/ICUConfig.properties");
            if (resourceAsStream != null) {
                try {
                    properties.load(resourceAsStream);
                } finally {
                    resourceAsStream.close();
                }
            }
        } catch (IOException | MissingResourceException unused) {
        }
    }

    public static String a(String str, String str2) {
        String property;
        if (System.getSecurityManager() != null) {
            try {
                property = (String) AccessController.doPrivileged(new d33(str, (byte) 0));
            } catch (AccessControlException unused) {
                property = null;
            }
        } else {
            property = System.getProperty(str);
        }
        return (property == null || property.equals(_UrlKt.FRAGMENT_ENCODE_SET)) ? a.getProperty(str, str2) : property;
    }
}
