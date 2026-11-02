package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y35 {
    public static final /* synthetic */ int a = 0;

    static {
        lh4.a1("NetworkStateTracker");
    }

    public static final x35 a(ConnectivityManager connectivityManager, boolean z) {
        boolean z2;
        boolean zHasCapability;
        connectivityManager.getClass();
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                zHasCapability = networkCapabilities != null ? networkCapabilities.hasCapability(16) : false;
            } catch (SecurityException unused) {
                lh4.P0().getClass();
            }
            z2 = z;
            try {
                return new x35(z3, zHasCapability, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true, z2);
            } catch (SecurityException unused2) {
                lh4.P0().getClass();
                return new x35(false, false, false, true, z2);
            }
        } catch (SecurityException unused3) {
            z2 = z;
        }
    }
}
