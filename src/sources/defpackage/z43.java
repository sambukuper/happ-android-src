package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z43 {
    public static final js5 c = new js5("|S||P|");
    public static final js5 d = new js5("|S|id");
    public static final String[] e = {"*", "FCM", "GCM", _UrlKt.FRAGMENT_ENCODE_SET};
    public final ak3 a;
    public final String b;

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public z43(xa2 xa2Var) {
        xa2Var.a();
        this.a = new ak3(xa2Var.a, "com.google.android.gms.appid");
        xa2Var.a();
        uc2 uc2Var = xa2Var.c;
        String str = uc2Var.e;
        if (str == null) {
            xa2Var.a();
            str = uc2Var.b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.b = str;
    }
}
