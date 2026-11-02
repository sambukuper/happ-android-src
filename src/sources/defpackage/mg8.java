package defpackage;

import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.FragmentationType;
import su.happ.proxyutility.feature.settings.TunnelSettingsFragment;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class mg8 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ TunnelSettingsFragment Y;
    public final /* synthetic */ String[] Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ mg8(String[] strArr, TunnelSettingsFragment tunnelSettingsFragment) {
        this.X = (byte) 0;
        this.Z = strArr;
        this.Y = tunnelSettingsFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        String[] strArr = this.Z;
        TunnelSettingsFragment tunnelSettingsFragment = this.Y;
        int iIntValue = ((Integer) obj).intValue();
        switch (b) {
            case 0:
                String str = strArr[iIntValue];
                tunnelSettingsFragment.T().q("pref_fragment_type", str);
                FragmentationType.INSTANCE.getClass();
                FragmentationType fragmentationTypeA = FragmentationType.Companion.a(str);
                if (fragmentationTypeA != null) {
                    TunnelSettingsFragment.R(tunnelSettingsFragment, fragmentationTypeA);
                }
                jm4.Q(ys0.z(((qk2) tunnelSettingsFragment).S0), (u61) null, new pg8(tunnelSettingsFragment, null, (byte) 19), 3);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                tunnelSettingsFragment.T().q("pref_fragment_packets", strArr[iIntValue]);
                jm4.Q(ys0.z(((qk2) tunnelSettingsFragment).S0), (u61) null, new pg8(tunnelSettingsFragment, null, (byte) 20), 3);
                break;
            default:
                tunnelSettingsFragment.T().q("pref_noises_type", strArr[iIntValue]);
                jm4.Q(ys0.z(((qk2) tunnelSettingsFragment).S0), (u61) null, new pg8(tunnelSettingsFragment, null, (byte) 4), 3);
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ mg8(TunnelSettingsFragment tunnelSettingsFragment, String[] strArr, byte b) {
        this.X = b;
        this.Y = tunnelSettingsFragment;
        this.Z = strArr;
    }
}
