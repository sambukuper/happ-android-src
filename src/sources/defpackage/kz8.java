package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.excluded_routes.ExcludedRoutesActivity;
import su.happ.proxyutility.feature.vpn_settings.VpnSettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class kz8 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ VpnSettingsActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ kz8(VpnSettingsActivity vpnSettingsActivity, byte b) {
        this.X = b;
        this.Y = vpnSettingsActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.content.Context, su.happ.proxyutility.feature.vpn_settings.VpnSettingsActivity] */
    public final Object invoke() {
        byte b = this.X;
        ?? r6 = this.Y;
        switch (b) {
            case 0:
                int i = VpnSettingsActivity.U0;
                r6.startActivity(new Intent((Context) r6, (Class<?>) ExcludedRoutesActivity.class));
                return dn8.a;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                w6 w6Var = r6.Q0;
                if (w6Var != null) {
                    return new qz8(w6Var);
                }
                dh3.T("binding");
                throw null;
            default:
                int i2 = VpnSettingsActivity.U0;
                r6.C();
                be beVar = b50.b;
                b50 b50Var = b50.c;
                if (b50Var == null) {
                    synchronized (beVar) {
                        b50Var = b50.c;
                        if (b50Var == null) {
                            b50Var = new b50();
                            b50.c = b50Var;
                        }
                        break;
                    }
                }
                HappApplication happApplication = HappApplication.M0;
                HappApplication happApplicationI = k32.i();
                List<ApplicationInfo> installedApplications = happApplicationI.getPackageManager().getInstalledApplications(0);
                installedApplications.getClass();
                Iterator<ApplicationInfo> it = installedApplications.iterator();
                while (it.hasNext()) {
                    if (b50Var.a.contains(it.next().packageName) && b50.d(happApplicationI, false, false)) {
                        HappApplication happApplication2 = HappApplication.M0;
                        b50.d(k32.i(), true, true);
                        return dn8.a;
                    }
                }
                HappApplication happApplication3 = HappApplication.M0;
                k32.i().startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", k32.i().getPackageName(), null)).setFlags(268435456));
                return dn8.a;
        }
    }
}
