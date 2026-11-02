package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentContainerView;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.inbound_auth.InboundAuthActivity;
import su.happ.proxyutility.feature.ping.PingSettingsActivity;
import su.happ.proxyutility.feature.settings.AboutSettingsFragment;
import su.happ.proxyutility.feature.settings.AdvancedSettingsFragment;
import su.happ.proxyutility.feature.settings.OtherSettingsFragment;
import su.happ.proxyutility.feature.settings.SettingsActivity;
import su.happ.proxyutility.feature.settings.TunnelSettingsFragment;
import su.happ.proxyutility.feature.settings.UISettingsFragment;
import su.happ.proxyutility.feature.subscription_settings.SubscriptionSettingsActivity;
import su.happ.proxyutility.feature.vpn_settings.VpnSettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class m7 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ SettingsActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ m7(SettingsActivity settingsActivity, byte b) {
        this.X = b;
        this.Y = settingsActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.content.Context, su.happ.proxyutility.feature.settings.SettingsActivity] */
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        ?? r4 = this.Y;
        switch (b) {
            case 0:
                r4.startActivity(new Intent((Context) r4, (Class<?>) VpnSettingsActivity.class));
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                r4.startActivity(new Intent((Context) r4, (Class<?>) SubscriptionSettingsActivity.class));
                return dn8Var;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                r4.startActivity(new Intent((Context) r4, (Class<?>) PingSettingsActivity.class));
                return dn8Var;
            case 3:
                t6 t6Var = r4.Q0;
                if (t6Var != null) {
                    return ((UISettingsFragment) ((FragmentContainerView) t6Var.j0).getFragment()).R();
                }
                dh3.T("binding");
                throw null;
            case 4:
                t6 t6Var2 = r4.Q0;
                if (t6Var2 != null) {
                    return ((TunnelSettingsFragment) ((FragmentContainerView) t6Var2.i0).getFragment()).S();
                }
                dh3.T("binding");
                throw null;
            case 5:
                t6 t6Var3 = r4.Q0;
                if (t6Var3 != null) {
                    return ((AdvancedSettingsFragment) ((FragmentContainerView) t6Var3.g0).getFragment()).S();
                }
                dh3.T("binding");
                throw null;
            case 6:
                t6 t6Var4 = r4.Q0;
                if (t6Var4 != null) {
                    return ((OtherSettingsFragment) ((FragmentContainerView) t6Var4.h0).getFragment()).R();
                }
                dh3.T("binding");
                throw null;
            case 7:
                t6 t6Var5 = r4.Q0;
                if (t6Var5 != null) {
                    return ((AboutSettingsFragment) ((FragmentContainerView) t6Var5.f0).getFragment()).R();
                }
                dh3.T("binding");
                throw null;
            case 8:
                t6 t6Var6 = r4.Q0;
                if (t6Var6 != null) {
                    return new c67(r4, t6Var6, (em2) r4.R0.getValue());
                }
                dh3.T("binding");
                throw null;
            case 9:
                t6 t6Var7 = r4.Q0;
                if (t6Var7 != null) {
                    return new b67(r4, t6Var7, (dm2) r4.S0.getValue());
                }
                dh3.T("binding");
                throw null;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                t6 t6Var8 = r4.Q0;
                if (t6Var8 != null) {
                    return new w57(r4, t6Var8, (uk2) r4.T0.getValue());
                }
                dh3.T("binding");
                throw null;
            case 11:
                t6 t6Var9 = r4.Q0;
                if (t6Var9 != null) {
                    return new z57(r4, t6Var9, (rl2) r4.U0.getValue());
                }
                dh3.T("binding");
                throw null;
            case 12:
                t6 t6Var10 = r4.Q0;
                if (t6Var10 != null) {
                    return new v57(r4, t6Var10, (rk2) r4.V0.getValue());
                }
                dh3.T("binding");
                throw null;
            default:
                r4.startActivity(new Intent((Context) r4, (Class<?>) InboundAuthActivity.class));
                return dn8Var;
        }
    }
}
