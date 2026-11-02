package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h33 {
    public static final String a;
    public static final boolean b;
    public static final boolean c;

    static {
        try {
            a = System.getProperty("ICUDebug");
        } catch (SecurityException unused) {
        }
        String str = a;
        boolean z = false;
        boolean z2 = str != null;
        b = z2;
        if (z2 && (str.equals(_UrlKt.FRAGMENT_ENCODE_SET) || str.indexOf("help") != -1)) {
            z = true;
        }
        c = z;
        if (z2) {
            System.out.println("\nICUDebug=" + str);
        }
    }

    public static boolean a(String str) {
        boolean z = false;
        if (b) {
            z = a.indexOf(str) != -1;
            if (c) {
                System.out.println("\nICUDebug.enabled(" + str + ") = " + z);
            }
        }
        return z;
    }
}
