package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class y77 extends ConnectivityManager.NetworkCallback {
    public static final y77 a = new y77();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public static NetworkCapabilities d;
    public static boolean e;
    public static Boolean f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean a(NetworkRequest networkRequest, NetworkCapabilities networkCapabilities) {
        Boolean bool = f;
        bool.getClass();
        return !bool.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b() {
        ArrayList<qg5> arrayList = new ArrayList();
        synchronized (b) {
            try {
                if (e && f != null) {
                    for (Map.Entry entry : c.entrySet()) {
                        gn2 gn2Var = (gn2) entry.getKey();
                        NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                        y77 y77Var = a;
                        NetworkCapabilities networkCapabilities = d;
                        y77Var.getClass();
                        arrayList.add(new qg5(gn2Var, a(networkRequest, networkCapabilities) ? v31.a : new w31(7)));
                    }
                    for (qg5 qg5Var : arrayList) {
                        ((gn2) qg5Var.X).B((x31) qg5Var.Y);
                    }
                    return;
                }
                lh4 lh4VarP0 = lh4.P0();
                int i = k39.a;
                lh4VarP0.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        lh4 lh4VarP0 = lh4.P0();
        int i = k39.a;
        lh4VarP0.getClass();
        synchronized (b) {
            if (dh3.f(f, Boolean.valueOf(z))) {
                return;
            }
            f = Boolean.valueOf(z);
            b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        lh4 lh4VarP0 = lh4.P0();
        int i = k39.a;
        lh4VarP0.getClass();
        synchronized (b) {
            d = networkCapabilities;
            e = true;
        }
        b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        lh4 lh4VarP0 = lh4.P0();
        int i = k39.a;
        lh4VarP0.getClass();
        synchronized (b) {
            d = null;
            Iterator it = c.keySet().iterator();
            while (it.hasNext()) {
                ((gn2) it.next()).B(new w31(7));
            }
        }
    }
}
