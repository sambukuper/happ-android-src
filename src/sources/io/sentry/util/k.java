package io.sentry.util;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final boolean a;
    public static final boolean b;

    static {
        boolean zEquals;
        try {
            zEquals = "The Android Project".equals(System.getProperty("java.vendor"));
            a = zEquals;
        } catch (Throwable unused) {
            a = false;
            zEquals = false;
        }
        if (zEquals) {
            b = false;
            return;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                b = Double.parseDouble(property) >= 9.0d;
            } else {
                b = false;
            }
        } catch (Throwable unused2) {
            b = false;
        }
    }
}
