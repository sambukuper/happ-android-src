package defpackage;

import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.settings.AdvancedSettingsFragment;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class p7 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public final /* synthetic */ AdvancedSettingsFragment h0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p7(AdvancedSettingsFragment advancedSettingsFragment, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.h0 = advancedSettingsFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                n((q51) obj2, (b71) obj).q(dn8Var);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                n((q51) obj2, (b71) obj).q(dn8Var);
                break;
            default:
                n((q51) obj2, (dn8) obj).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        AdvancedSettingsFragment advancedSettingsFragment = this.h0;
        switch (b) {
            case 0:
                return new p7(advancedSettingsFragment, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new p7(advancedSettingsFragment, q51Var, (byte) 1);
            default:
                return new p7(advancedSettingsFragment, q51Var, (byte) 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        AdvancedSettingsFragment advancedSettingsFragment = this.h0;
        switch (b) {
            case 0:
                w39.n0(obj);
                advancedSettingsFragment.T();
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                w39.n0(obj);
                advancedSettingsFragment.T();
                break;
            default:
                w39.n0(obj);
                pu.O(advancedSettingsFragment.M(), y46.warning_settings_after_tunnel_restart);
                break;
        }
        return dn8Var;
    }
}
