package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import androidx.activity.ComponentActivity;
import com.tencent.mmkv.MMKV;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EIpType;
import su.happ.proxyutility.feature.settings.SettingsActivity;
import su.happ.proxyutility.feature.settings.TunnelSettingsFragment;
import su.happ.proxyutility.feature.settings.UISettingsFragment;
import su.happ.proxyutility.feature.vpn_settings.VpnSettingsActivity;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class qg8 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ qg8(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Z = obj;
        this.Y = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        byte b = this.X;
        Object obj = this.Y;
        Object obj2 = this.Z;
        switch (b) {
            case 0:
                SettingsActivity settingsActivity = (SettingsActivity) obj;
                TunnelSettingsFragment tunnelSettingsFragment = (TunnelSettingsFragment) obj2;
                if (i >= 0) {
                    settingsActivity.B().setForeground(null);
                    tunnelSettingsFragment.T().q("pref_ip_type", ((EIpType) EIpType.a().get(i)).getValue());
                    jm4.Q(ys0.z(tunnelSettingsFragment.h()), (u61) null, new pg8(tunnelSettingsFragment, null, (byte) 14), 3);
                    return;
                } else {
                    HappSpinnerField happSpinnerField = tunnelSettingsFragment.S().F0;
                    RelativeLayout relativeLayoutB = settingsActivity.B();
                    Resources resourcesO = tunnelSettingsFragment.o();
                    resourcesO.getClass();
                    a38.b(happSpinnerField, relativeLayoutB, resourcesO);
                    return;
                }
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                SettingsActivity settingsActivity2 = (SettingsActivity) obj;
                UISettingsFragment uISettingsFragment = (UISettingsFragment) obj2;
                if (i < 0) {
                    HappSpinnerField happSpinnerField2 = uISettingsFragment.R().f0;
                    RelativeLayout relativeLayoutB2 = settingsActivity2.B();
                    Resources resourcesO2 = uISettingsFragment.o();
                    resourcesO2.getClass();
                    a38.b(happSpinnerField2, relativeLayoutB2, resourcesO2);
                    return;
                }
                settingsActivity2.B().setForeground(null);
                ((MMKV) uISettingsFragment.d1.getValue()).q("pref_ui_mode_night", String.valueOf(i));
                ss8 ss8Var = ss8.a;
                ss8.F();
                uISettingsFragment.M().y();
                return;
            default:
                ComponentActivity componentActivity = (VpnSettingsActivity) obj2;
                w6 w6Var = componentActivity.Q0;
                if (i >= 0) {
                    if (w6Var == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    View view2 = ((kw8) w6Var).Z;
                    view2.getClass();
                    view2.setForeground(null);
                    componentActivity.B().q("pref_mode", ((String[]) obj)[i]);
                    jm4.Q(ys0.z(componentActivity.h()), (u61) null, new mz8(componentActivity, null, (byte) 12), 3);
                    return;
                }
                if (w6Var == null) {
                    dh3.T("binding");
                    throw null;
                }
                HappSpinnerField happSpinnerField3 = w6Var.x0;
                happSpinnerField3.getClass();
                w6 w6Var2 = componentActivity.Q0;
                if (w6Var2 == null) {
                    dh3.T("binding");
                    throw null;
                }
                View view3 = ((kw8) w6Var2).Z;
                view3.getClass();
                Resources resources = componentActivity.getResources();
                resources.getClass();
                a38.b(happSpinnerField3, view3, resources);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                ((SettingsActivity) obj).B().setForeground(null);
                return;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                ((SettingsActivity) obj).B().setForeground(null);
                return;
            default:
                w6 w6Var = ((VpnSettingsActivity) this.Z).Q0;
                if (w6Var == null) {
                    dh3.T("binding");
                    throw null;
                }
                View view = ((kw8) w6Var).Z;
                view.getClass();
                view.setForeground(null);
                return;
        }
    }
}
