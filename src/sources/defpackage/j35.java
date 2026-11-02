package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j35 extends no2 implements gn2 {
    public static final j35 X = new j35(1, i21.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        Context applicationContext = ((Context) obj).getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && w79.i(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new h21(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return g21.a;
    }
}
