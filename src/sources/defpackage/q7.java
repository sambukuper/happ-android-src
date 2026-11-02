package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import su.happ.proxyutility.feature.settings.AdvancedSettingsFragment;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q7 extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ byte a;
    public final Object b;

    public q7(zw2 zw2Var) {
        this.a = (byte) 1;
        this.b = zw2Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.a) {
            case 0:
                network.getClass();
                super.onAvailable(network);
                AdvancedSettingsFragment advancedSettingsFragment = (AdvancedSettingsFragment) this.b;
                u84 u84VarZ = ys0.z(advancedSettingsFragment.getH0());
                nf1 nf1Var = tp1.a;
                jm4.Q(u84VarZ, dm4.a, new p7(advancedSettingsFragment, null, (byte) 0), 2);
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        switch (this.a) {
            case 2:
                network.getClass();
                if (network.equals(((z35) this.b).f.getActiveNetwork())) {
                    lh4 lh4VarP0 = lh4.P0();
                    int i = y35.a;
                    lh4VarP0.getClass();
                    z35 z35Var = (z35) this.b;
                    Object objA = z35Var.e;
                    if (objA == null) {
                        objA = z35Var.a();
                    }
                    x35 x35Var = (x35) objA;
                    z35 z35Var2 = (z35) this.b;
                    synchronized (z35Var2.g) {
                        if (z35Var2.h == z) {
                            return;
                        }
                        z35Var2.h = z;
                        ((z35) this.b).b(new x35(x35Var.a, x35Var.b, x35Var.c, x35Var.d, z));
                        return;
                    }
                }
                return;
            default:
                super.onBlockedStatusChanged(network, z);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case 1:
                network.getClass();
                networkCapabilities.getClass();
                lh4 lh4VarP0 = lh4.P0();
                int i = k39.a;
                lh4VarP0.getClass();
                ((zw2) this.b).B(v31.a);
                break;
            case 2:
                network.getClass();
                networkCapabilities.getClass();
                lh4 lh4VarP1 = lh4.P0();
                int i2 = y35.a;
                networkCapabilities.toString();
                lh4VarP1.getClass();
                z35 z35Var = (z35) this.b;
                z35Var.b(y35.a(z35Var.f, z35Var.h));
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        byte b = this.a;
        Object obj = this.b;
        network.getClass();
        switch (b) {
            case 0:
                super.onLost(network);
                AdvancedSettingsFragment advancedSettingsFragment = (AdvancedSettingsFragment) obj;
                u84 u84VarZ = ys0.z(advancedSettingsFragment.getH0());
                nf1 nf1Var = tp1.a;
                jm4.Q(u84VarZ, dm4.a, new p7(advancedSettingsFragment, null, (byte) 1), 2);
                break;
            case 1:
                lh4 lh4VarP0 = lh4.P0();
                int i = k39.a;
                lh4VarP0.getClass();
                ((zw2) obj).B(new w31(7));
                break;
            default:
                lh4 lh4VarP1 = lh4.P0();
                int i2 = y35.a;
                lh4VarP1.getClass();
                ((z35) obj).b(new x35(false, false, false, false, false));
                break;
        }
    }

    public /* synthetic */ q7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
