package io.sentry.android.core;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.b5;
import io.sentry.s5;
import io.sentry.v4;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends ConnectivityManager.NetworkCallback {
    public final n0 a;
    public NetworkCapabilities b = null;
    public long c = 0;
    public final b5 d;

    public f1(n0 n0Var, b5 b5Var) {
        this.a = n0Var;
        io.sentry.util.b.s(b5Var, "SentryDateProvider is required");
        this.d = b5Var;
    }

    public static io.sentry.g a(String str) {
        io.sentry.g gVar = new io.sentry.g();
        gVar.g0 = "system";
        gVar.i0 = "network.event";
        gVar.d(str, "action");
        gVar.k0 = s5.INFO;
        return gVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        v4.b().a(a("NETWORK_AVAILABLE"), new io.sentry.n0());
        this.b = null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        e1 e1Var;
        long jD = this.d.a().d();
        NetworkCapabilities networkCapabilities2 = this.b;
        long j = this.c;
        n0 n0Var = this.a;
        if (networkCapabilities2 == null) {
            e1Var = new e1(networkCapabilities, n0Var, jD);
        } else {
            e1 e1Var2 = new e1(networkCapabilities2, n0Var, j);
            e1Var = new e1(networkCapabilities, n0Var, jD);
            int iAbs = Math.abs(e1Var2.c - e1Var.c);
            int i = e1Var.a;
            int i2 = e1Var2.a;
            int iAbs2 = Math.abs(i2 - i);
            int i3 = e1Var.b;
            int i4 = e1Var2.b;
            int iAbs3 = Math.abs(i4 - i3);
            boolean z = ((double) Math.abs(e1Var2.d - e1Var.d)) / 1000000.0d < 5000.0d;
            boolean z2 = z || iAbs <= 5;
            boolean z3 = z || ((double) iAbs2) <= Math.max(1000.0d, ((double) Math.abs(i2)) * 0.1d);
            boolean z4 = z || ((double) iAbs3) <= Math.max(1000.0d, ((double) Math.abs(i4)) * 0.1d);
            if (e1Var2.e == e1Var.e && e1Var2.f.equals(e1Var.f) && z2 && z3 && z4) {
                e1Var = null;
            }
        }
        if (e1Var == null) {
            return;
        }
        this.b = networkCapabilities;
        this.c = jD;
        io.sentry.g gVarA = a("NETWORK_CAPABILITIES_CHANGED");
        gVarA.d(Integer.valueOf(e1Var.a), "download_bandwidth");
        gVarA.d(Integer.valueOf(e1Var.b), "upload_bandwidth");
        gVarA.d(Boolean.valueOf(e1Var.e), "vpn_active");
        gVarA.d(e1Var.f, "network_type");
        int i5 = e1Var.c;
        if (i5 != 0) {
            gVarA.d(Integer.valueOf(i5), "signal_strength");
        }
        io.sentry.n0 n0Var2 = new io.sentry.n0();
        n0Var2.d(e1Var, "android:networkCapabilities");
        v4.b().a(gVarA, n0Var2);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        v4.b().a(a("NETWORK_LOST"), new io.sentry.n0());
        this.b = null;
    }
}
