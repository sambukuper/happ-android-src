package defpackage;

import android.view.View;
import android.widget.EditText;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.ServerActivity;
import su.happ.proxyutility.ui.widget.CustomSpinner;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class x37 implements View.OnClickListener {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ServerActivity Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ x37(ServerActivity serverActivity, byte b) {
        this.X = b;
        this.Y = serverActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.X;
        ServerActivity serverActivity = this.Y;
        switch (b) {
            case 0:
                int i = ServerActivity.c3;
                serverActivity.H();
                return;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                y5 y5Var = serverActivity.Q0;
                if (y5Var != null) {
                    ((CustomSpinner) y5Var.h0).performClick();
                    return;
                } else {
                    dh3.T("binding");
                    throw null;
                }
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                EditText editText = serverActivity.I1;
                if (editText != null) {
                    editText.requestFocus();
                    return;
                }
                return;
            case 3:
                EditText editText2 = serverActivity.K1;
                if (editText2 != null) {
                    editText2.requestFocus();
                }
                CustomSpinner customSpinner = serverActivity.L1;
                if (customSpinner != null) {
                    customSpinner.performClick();
                    return;
                }
                return;
            case 4:
                CustomSpinner customSpinner2 = serverActivity.N1;
                if (customSpinner2 != null) {
                    customSpinner2.performClick();
                    return;
                }
                return;
            case 5:
                CustomSpinner customSpinner3 = serverActivity.P1;
                if (customSpinner3 != null) {
                    customSpinner3.performClick();
                    return;
                }
                return;
            case 6:
                EditText editText3 = serverActivity.R1;
                if (editText3 != null) {
                    editText3.requestFocus();
                    return;
                }
                return;
            case 7:
                CustomSpinner customSpinner4 = serverActivity.T1;
                if (customSpinner4 != null) {
                    customSpinner4.performClick();
                    return;
                }
                return;
            case 8:
                CustomSpinner customSpinner5 = serverActivity.V1;
                if (customSpinner5 != null) {
                    customSpinner5.performClick();
                    return;
                }
                return;
            case 9:
                CustomSpinner customSpinner6 = serverActivity.X1;
                if (customSpinner6 != null) {
                    customSpinner6.performClick();
                    return;
                }
                return;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                EditText editText4 = serverActivity.c2;
                if (editText4 != null) {
                    editText4.requestFocus();
                    return;
                }
                return;
            case 11:
                EditText editText5 = serverActivity.g2;
                if (editText5 != null) {
                    editText5.requestFocus();
                    return;
                }
                return;
            case 12:
                EditText editText6 = serverActivity.l1;
                if (editText6 != null) {
                    editText6.requestFocus();
                    return;
                } else {
                    dh3.T("etRemarks");
                    throw null;
                }
            case 13:
                EditText editText7 = serverActivity.r2;
                if (editText7 != null) {
                    editText7.requestFocus();
                    return;
                }
                return;
            case 14:
                EditText editText8 = serverActivity.t2;
                if (editText8 != null) {
                    editText8.requestFocus();
                    return;
                }
                return;
            case 15:
                EditText editText9 = serverActivity.v2;
                if (editText9 != null) {
                    editText9.requestFocus();
                    return;
                }
                return;
            case 16:
                CustomSpinner customSpinner7 = serverActivity.x2;
                if (customSpinner7 != null) {
                    customSpinner7.performClick();
                    return;
                }
                return;
            case 17:
                EditText editText10 = serverActivity.z2;
                if (editText10 != null) {
                    editText10.requestFocus();
                    return;
                }
                return;
            case 18:
                EditText editText11 = serverActivity.F2;
                if (editText11 != null) {
                    editText11.requestFocus();
                    return;
                }
                return;
            case 19:
                EditText editText12 = serverActivity.H2;
                if (editText12 != null) {
                    editText12.requestFocus();
                    return;
                }
                return;
            case 20:
                EditText editText13 = serverActivity.J2;
                if (editText13 != null) {
                    editText13.requestFocus();
                    return;
                }
                return;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                EditText editText14 = serverActivity.L2;
                if (editText14 != null) {
                    editText14.requestFocus();
                    return;
                }
                return;
            case 22:
                EditText editText15 = serverActivity.N2;
                if (editText15 != null) {
                    editText15.requestFocus();
                    return;
                }
                return;
            case 23:
                EditText editText16 = serverActivity.n1;
                if (editText16 != null) {
                    editText16.requestFocus();
                    return;
                }
                return;
            case 24:
                EditText editText17 = serverActivity.R2;
                if (editText17 != null) {
                    editText17.requestFocus();
                    return;
                }
                return;
            case 25:
                EditText editText18 = serverActivity.T2;
                if (editText18 != null) {
                    editText18.requestFocus();
                    return;
                }
                return;
            case 26:
                EditText editText19 = serverActivity.V2;
                if (editText19 != null) {
                    editText19.requestFocus();
                    return;
                }
                return;
            case 27:
                EditText editText20 = serverActivity.X2;
                if (editText20 != null) {
                    editText20.requestFocus();
                    return;
                }
                return;
            case 28:
                EditText editText21 = serverActivity.a3;
                if (editText21 != null) {
                    editText21.requestFocus();
                    return;
                }
                return;
            default:
                EditText editText22 = serverActivity.p1;
                if (editText22 != null) {
                    editText22.requestFocus();
                    return;
                }
                return;
        }
    }
}
