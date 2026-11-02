package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class b16 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ c16 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b16(c16 c16Var) {
        this.a = c16Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        NetworkCapabilities networkCapabilities;
        Integer rj6Var;
        String rj6Var2;
        network.getClass();
        super.onAvailable(network);
        c16 c16Var = this.a;
        ConnectivityManager connectivityManager = (ConnectivityManager) c16Var.d.getValue();
        if (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null || !networkCapabilities.hasTransport(4)) {
            return;
        }
        c16Var.f = network;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                rj6Var = Integer.valueOf(networkCapabilities.getOwnerUid());
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var = new rj6(th);
            }
            if (rj6Var instanceof rj6) {
                rj6Var = -1;
            }
            int iIntValue = rj6Var.intValue();
            if (iIntValue != -1) {
                try {
                    String[] packagesForUid = c16Var.a.getPackageManager().getPackagesForUid(iIntValue);
                    rj6Var2 = (packagesForUid == null || packagesForUid.length == 0) ? null : packagesForUid[0];
                } catch (Throwable th2) {
                    if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                        throw th2;
                    }
                    rj6Var2 = new rj6(th2);
                }
                c16Var.e = rj6Var2 instanceof rj6 ? null : rj6Var2;
            }
        }
        ss8 ss8Var = ss8.a;
        ss8.t();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        super.onLost(network);
        c16 c16Var = this.a;
        if (network.equals(c16Var.f)) {
            c16Var.f = null;
            c16Var.e = null;
        }
    }
}
