package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.preference.ListPreference;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EConfigType;
import su.happ.proxyutility.feature.ping.PingSettingsActivity;
import su.happ.proxyutility.feature.ui_settings.UISettingsActivity;
import su.happ.proxyutility.ui.ServerActivity;
import su.happ.proxyutility.ui.foundation.component.HappInputField;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDivider;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;
import su.happ.proxyutility.ui.foundation.component.HappTextView;
import su.happ.proxyutility.ui.widget.ReselectableDropDownPreference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ob4 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ob4(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v15, types: [android.content.Context, su.happ.proxyutility.feature.ui_settings.UISettingsActivity, su.happ.proxyutility.ui.BaseActivity] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.content.Context, su.happ.proxyutility.feature.ping.PingSettingsActivity] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.content.Context, su.happ.proxyutility.ui.ServerActivity] */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        qw1 qw1Var;
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                if (i == -1 || (qw1Var = ((ListPopupWindow) obj).Z) == null) {
                    return;
                }
                qw1Var.setListSelectionHidden(false);
                return;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                ?? r1 = (PingSettingsActivity) obj;
                d6 d6Var = r1.Q0;
                if (i >= 0) {
                    if (d6Var == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    LinearLayout linearLayout = (LinearLayout) d6Var.Y;
                    linearLayout.getClass();
                    linearLayout.setForeground(null);
                    r1.A().l(i, "pref_ping_result");
                    qe4.L0((Context) r1, "su.happ.proxyutility.action.service", 5, "");
                    return;
                }
                if (d6Var == null) {
                    dh3.T("binding");
                    throw null;
                }
                HappSpinnerField happSpinnerField = (HappSpinnerField) d6Var.k0;
                if (d6Var == null) {
                    dh3.T("binding");
                    throw null;
                }
                LinearLayout linearLayout2 = (LinearLayout) d6Var.Y;
                linearLayout2.getClass();
                Resources resources = r1.getResources();
                resources.getClass();
                a38.b(happSpinnerField, linearLayout2, resources);
                return;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                ReselectableDropDownPreference reselectableDropDownPreference = (ReselectableDropDownPreference) obj;
                Spinner spinner = reselectableDropDownPreference.o0;
                view.getClass();
                if (i < 0 || i >= spinner.getCount()) {
                    return;
                }
                String string = ((ListPreference) reselectableDropDownPreference).k0[i].toString();
                String str = dh3.f(string, ((ListPreference) reselectableDropDownPreference).l0) ? null : string;
                if (!TextUtils.equals(((ListPreference) reselectableDropDownPreference).l0, str) || !((ListPreference) reselectableDropDownPreference).n0) {
                    ((ListPreference) reselectableDropDownPreference).l0 = str;
                    ((ListPreference) reselectableDropDownPreference).n0 = true;
                }
                spinner.setSelection(spinner.getCount());
                return;
            case 3:
                ((SearchView) obj).o(i);
                return;
            case 4:
                ?? r2 = (ServerActivity) obj;
                if (i < 0) {
                    ConstraintLayout constraintLayout = r2.O1;
                    if (constraintLayout != null) {
                        y5 y5Var = r2.Q0;
                        if (y5Var == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        LinearLayout linearLayout3 = (LinearLayout) y5Var.Y;
                        linearLayout3.getClass();
                        Resources resources2 = r2.getResources();
                        resources2.getClass();
                        a38.b(constraintLayout, linearLayout3, resources2);
                        return;
                    }
                    return;
                }
                y5 y5Var2 = r2.Q0;
                if (y5Var2 == null) {
                    dh3.T("binding");
                    throw null;
                }
                LinearLayout linearLayout4 = (LinearLayout) y5Var2.Y;
                linearLayout4.getClass();
                linearLayout4.setForeground(null);
                String str2 = r2.E()[i];
                boolean zO0 = fm7.o0(r2.E()[i]);
                View view2 = r2.Z2;
                if (zO0) {
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout2 = r2.Q1;
                    if (constraintLayout2 != null) {
                        constraintLayout2.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout3 = r2.S1;
                    if (constraintLayout3 != null) {
                        constraintLayout3.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout4 = r2.w2;
                    if (constraintLayout4 != null) {
                        constraintLayout4.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout5 = r2.y2;
                    if (constraintLayout5 != null) {
                        constraintLayout5.setVisibility(8);
                    }
                    HappInputField happInputField = r2.A2;
                    if (happInputField != null) {
                        happInputField.setVisibility(8);
                    }
                    HappSettingsDivider happSettingsDivider = r2.B2;
                    if (happSettingsDivider != null) {
                        happSettingsDivider.setVisibility(8);
                    }
                    HappInputField happInputField2 = r2.C2;
                    if (happInputField2 != null) {
                        happInputField2.setVisibility(8);
                    }
                    HappSettingsDivider happSettingsDivider2 = r2.D2;
                    if (happSettingsDivider2 != null) {
                        happSettingsDivider2.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout6 = r2.E2;
                    if (constraintLayout6 != null) {
                        constraintLayout6.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout7 = r2.G2;
                    if (constraintLayout7 != null) {
                        constraintLayout7.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout8 = r2.I2;
                    if (constraintLayout8 != null) {
                        constraintLayout8.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout9 = r2.K2;
                    if (constraintLayout9 != null) {
                        constraintLayout9.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ConstraintLayout constraintLayout10 = r2.Q1;
                if (constraintLayout10 != null) {
                    constraintLayout10.setVisibility(0);
                }
                EConfigType eConfigType = r2.U0;
                EConfigType eConfigType2 = EConfigType.HYSTERIA;
                ConstraintLayout constraintLayout11 = r2.S1;
                if (eConfigType == eConfigType2) {
                    if (constraintLayout11 != null) {
                        constraintLayout11.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout12 = r2.w2;
                    if (constraintLayout12 != null) {
                        constraintLayout12.setVisibility(8);
                    }
                } else {
                    if (constraintLayout11 != null) {
                        constraintLayout11.setVisibility(0);
                    }
                    ConstraintLayout constraintLayout13 = r2.w2;
                    if (constraintLayout13 != null) {
                        constraintLayout13.setVisibility(0);
                    }
                }
                boolean zF = dh3.f(r2.E()[i], XRayConfig.TLS);
                ConstraintLayout constraintLayout14 = r2.y2;
                if (zF) {
                    if (constraintLayout14 != null) {
                        constraintLayout14.setVisibility(0);
                    }
                    HappInputField happInputField3 = r2.A2;
                    if (happInputField3 != null) {
                        happInputField3.setVisibility(0);
                    }
                    HappSettingsDivider happSettingsDivider3 = r2.B2;
                    if (happSettingsDivider3 != null) {
                        happSettingsDivider3.setVisibility(0);
                    }
                    HappInputField happInputField4 = r2.C2;
                    if (happInputField4 != null) {
                        happInputField4.setVisibility(0);
                    }
                    HappSettingsDivider happSettingsDivider4 = r2.D2;
                    if (happSettingsDivider4 != null) {
                        happSettingsDivider4.setVisibility(0);
                    }
                    ConstraintLayout constraintLayout15 = r2.E2;
                    if (constraintLayout15 != null) {
                        constraintLayout15.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout16 = r2.G2;
                    if (constraintLayout16 != null) {
                        constraintLayout16.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout17 = r2.I2;
                    if (constraintLayout17 != null) {
                        constraintLayout17.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout18 = r2.K2;
                    if (constraintLayout18 != null) {
                        constraintLayout18.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (constraintLayout14 != null) {
                    constraintLayout14.setVisibility(8);
                }
                HappInputField happInputField5 = r2.A2;
                if (happInputField5 != null) {
                    happInputField5.setVisibility(8);
                }
                HappSettingsDivider happSettingsDivider5 = r2.B2;
                if (happSettingsDivider5 != null) {
                    happSettingsDivider5.setVisibility(8);
                }
                HappInputField happInputField6 = r2.C2;
                if (happInputField6 != null) {
                    happInputField6.setVisibility(8);
                }
                HappSettingsDivider happSettingsDivider6 = r2.D2;
                if (happSettingsDivider6 != null) {
                    happSettingsDivider6.setVisibility(8);
                }
                ConstraintLayout constraintLayout19 = r2.w2;
                if (constraintLayout19 != null) {
                    constraintLayout19.setVisibility(8);
                }
                ConstraintLayout constraintLayout20 = r2.E2;
                if (constraintLayout20 != null) {
                    constraintLayout20.setVisibility(0);
                }
                ConstraintLayout constraintLayout21 = r2.G2;
                if (constraintLayout21 != null) {
                    constraintLayout21.setVisibility(0);
                }
                ConstraintLayout constraintLayout22 = r2.I2;
                if (constraintLayout22 != null) {
                    constraintLayout22.setVisibility(0);
                }
                ConstraintLayout constraintLayout23 = r2.K2;
                if (constraintLayout23 != null) {
                    constraintLayout23.setVisibility(0);
                    return;
                }
                return;
            case 5:
                rf7 rf7Var = (rf7) obj;
                rf7Var.f0 = 0;
                rf7Var.g0 = 0;
                return;
            default:
                ?? r3 = (UISettingsActivity) obj;
                y5 y5Var3 = r3.Q0;
                if (i >= 0) {
                    if (y5Var3 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    LinearLayout linearLayout5 = (LinearLayout) y5Var3.Y;
                    linearLayout5.getClass();
                    linearLayout5.setForeground(null);
                    r3.A().l(i, "pref_font_size");
                    vz7 vz7Var = HappTextView.o0;
                    aj2.X.getClass();
                    HappTextView.p0 = k32.g(i);
                    r3.y();
                    return;
                }
                if (y5Var3 == null) {
                    dh3.T("binding");
                    throw null;
                }
                HappSpinnerField happSpinnerField2 = (HappSpinnerField) y5Var3.Z;
                if (y5Var3 == null) {
                    dh3.T("binding");
                    throw null;
                }
                LinearLayout linearLayout6 = (LinearLayout) y5Var3.Y;
                linearLayout6.getClass();
                Resources resources3 = r3.getResources();
                resources3.getClass();
                a38.b(happSpinnerField2, linearLayout6, resources3);
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
                return;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                d6 d6Var = ((PingSettingsActivity) obj).Q0;
                if (d6Var == null) {
                    dh3.T("binding");
                    throw null;
                }
                LinearLayout linearLayout = (LinearLayout) d6Var.Y;
                linearLayout.getClass();
                linearLayout.setForeground(null);
                return;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
            case 3:
                return;
            case 4:
                y5 y5Var = ((ServerActivity) obj).Q0;
                if (y5Var == null) {
                    dh3.T("binding");
                    throw null;
                }
                LinearLayout linearLayout2 = (LinearLayout) y5Var.Y;
                linearLayout2.getClass();
                linearLayout2.setForeground(null);
                return;
            case 5:
                rf7 rf7Var = (rf7) obj;
                rf7Var.f0 = 0;
                rf7Var.g0 = 0;
                return;
            default:
                y5 y5Var2 = ((UISettingsActivity) obj).Q0;
                if (y5Var2 == null) {
                    dh3.T("binding");
                    throw null;
                }
                LinearLayout linearLayout3 = (LinearLayout) y5Var2.Y;
                linearLayout3.getClass();
                linearLayout3.setForeground(null);
                return;
        }
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    private final void c(AdapterView adapterView) {
    }
}
