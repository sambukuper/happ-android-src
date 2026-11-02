package defpackage;

import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.settings.SettingsActivity;
import su.happ.proxyutility.feature.settings.TunnelSettingsFragment;
import su.happ.proxyutility.ui.ServerActivity;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ry2 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ byte X;
    public final /* synthetic */ KeyEvent.Callback Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ry2(View view, ServerActivity serverActivity, gn2 gn2Var) {
        this.X = (byte) 1;
        this.Y = view;
        this.f0 = serverActivity;
        this.Z = gn2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.content.Context, su.happ.proxyutility.ui.ServerActivity] */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        byte b = this.X;
        Object obj = this.Z;
        Object obj2 = this.f0;
        Object obj3 = this.Y;
        switch (b) {
            case 0:
                View view2 = (View) obj3;
                if (i >= 0) {
                    view2.getClass();
                    view2.setForeground(null);
                    ((gn2) obj).B(Integer.valueOf(i));
                    return;
                } else {
                    HappSpinnerField happSpinnerField = (HappSpinnerField) obj2;
                    Resources resources = happSpinnerField.getResources();
                    resources.getClass();
                    a38.b(happSpinnerField, view2, resources);
                    return;
                }
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                ?? r4 = (ServerActivity) obj2;
                if (i >= 0) {
                    y5 y5Var = r4.Q0;
                    if (y5Var == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    LinearLayout linearLayout = (LinearLayout) y5Var.Y;
                    linearLayout.getClass();
                    linearLayout.setForeground(null);
                    gn2 gn2Var = (gn2) obj;
                    if (gn2Var != null) {
                        gn2Var.B(Integer.valueOf(i));
                        return;
                    }
                    return;
                }
                View view3 = (View) obj3;
                if (view3 != null) {
                    y5 y5Var2 = r4.Q0;
                    if (y5Var2 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    LinearLayout linearLayout2 = (LinearLayout) y5Var2.Y;
                    linearLayout2.getClass();
                    Resources resources2 = r4.getResources();
                    resources2.getClass();
                    a38.b(view3, linearLayout2, resources2);
                    return;
                }
                return;
            default:
                SettingsActivity settingsActivity = (SettingsActivity) obj3;
                TunnelSettingsFragment tunnelSettingsFragment = (TunnelSettingsFragment) obj2;
                if (i >= 0) {
                    settingsActivity.B().setForeground(null);
                    tunnelSettingsFragment.T().q("pref_mux_xudp_quic", ((String[]) obj)[i]);
                    jm4.Q(ys0.z(tunnelSettingsFragment.h()), (u61) null, new pg8(tunnelSettingsFragment, null, (byte) 11), 3);
                    return;
                } else {
                    HappSpinnerField happSpinnerField2 = tunnelSettingsFragment.S().D0;
                    RelativeLayout relativeLayoutB = settingsActivity.B();
                    Resources resourcesO = tunnelSettingsFragment.o();
                    resourcesO.getClass();
                    a38.b(happSpinnerField2, relativeLayoutB, resourcesO);
                    return;
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                View view = (View) obj;
                view.getClass();
                view.setForeground(null);
                return;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                y5 y5Var = ((ServerActivity) this.f0).Q0;
                if (y5Var == null) {
                    dh3.T("binding");
                    throw null;
                }
                LinearLayout linearLayout = (LinearLayout) y5Var.Y;
                linearLayout.getClass();
                linearLayout.setForeground(null);
                return;
            default:
                ((SettingsActivity) obj).B().setForeground(null);
                return;
        }
    }

    public /* synthetic */ ry2(Object obj, KeyEvent.Callback callback, Object obj2, byte b) {
        this.X = b;
        this.f0 = obj;
        this.Y = callback;
        this.Z = obj2;
    }
}
