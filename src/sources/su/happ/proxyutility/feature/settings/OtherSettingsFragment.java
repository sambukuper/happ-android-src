package su.happ.proxyutility.feature.settings;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.tencent.mmkv.MMKV;
import defpackage.dw4;
import defpackage.e46;
import defpackage.ln7;
import defpackage.rl2;
import defpackage.t46;
import defpackage.wd5;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.logs.settings.LogsSettingsActivity;
import su.happ.proxyutility.feature.reset_settings.ResetSettingsActivity;
import su.happ.proxyutility.feature.settings.OtherSettingsFragment;
import su.happ.proxyutility.feature.statistics.StatisticsSettingsActivity;
import su.happ.proxyutility.ui.foundation.component.HappForwardField;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDivider;
import su.happ.proxyutility.ui.foundation.component.HappSettingsTitle;
import su.happ.proxyutility.ui.foundation.component.HappTextView;
import su.happ.proxyutility.ui.foundation.component.HappToggleField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/settings/OtherSettingsFragment;", "Lqk2;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class OtherSettingsFragment extends qk2 {
    public final vz7 d1 = new vz7(new dw4((byte) 14));
    public rl2 e1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final rl2 R() {
        rl2 rl2Var = this.e1;
        if (rl2Var != null) {
            return rl2Var;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        final byte b = 0;
        View viewInflate = layoutInflater.inflate(t46.fragment_other_settings, viewGroup, false);
        int i = e46.check_update_progress_bar;
        ProgressBar progressBar = (ProgressBar) ln7.b(viewInflate, i);
        if (progressBar != null) {
            i = e46.check_update_text;
            if (((HappTextView) ln7.b(viewInflate, i)) != null) {
                i = e46.divider_beta_version_enabled;
                HappSettingsDivider happSettingsDivider = (HappSettingsDivider) ln7.b(viewInflate, i);
                if (happSettingsDivider != null) {
                    i = e46.divider_check_update;
                    HappSettingsDivider happSettingsDivider2 = (HappSettingsDivider) ln7.b(viewInflate, i);
                    if (happSettingsDivider2 != null) {
                        i = e46.divider_logs;
                        if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                            i = e46.divider_statistic;
                            if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                                i = e46.forward_logs;
                                HappForwardField happForwardField = (HappForwardField) ln7.b(viewInflate, i);
                                if (happForwardField != null) {
                                    i = e46.forward_reset;
                                    HappForwardField happForwardField2 = (HappForwardField) ln7.b(viewInflate, i);
                                    if (happForwardField2 != null) {
                                        i = e46.forward_statistic;
                                        HappForwardField happForwardField3 = (HappForwardField) ln7.b(viewInflate, i);
                                        if (happForwardField3 != null) {
                                            i = e46.ll_check_update;
                                            LinearLayout linearLayout = (LinearLayout) ln7.b(viewInflate, i);
                                            if (linearLayout != null) {
                                                i = e46.title_category;
                                                if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null) {
                                                    i = e46.toggle_beta_version_enabled;
                                                    HappToggleField happToggleField = (HappToggleField) ln7.b(viewInflate, i);
                                                    if (happToggleField != null) {
                                                        this.e1 = new rl2((LinearLayout) viewInflate, progressBar, happSettingsDivider, happSettingsDivider2, happForwardField, happForwardField2, happForwardField3, linearLayout, happToggleField);
                                                        R().k0.setVisibility(0);
                                                        R().Z.setVisibility(0);
                                                        R().j0.setVisibility(0);
                                                        R().f0.setVisibility(0);
                                                        R().k0.setOnToggleClickListener(new vj2(this, (byte) 22));
                                                        R().k0.setChecked(((MMKV) this.d1.getValue()).getBoolean("pref_beta_version", false));
                                                        R().j0.setOnClickListener(new View.OnClickListener(this) { // from class: vd5
                                                            public final /* synthetic */ OtherSettingsFragment Y;

                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                            {
                                                                this.Y = this;
                                                            }

                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                byte b2 = b;
                                                                OtherSettingsFragment otherSettingsFragment = this.Y;
                                                                switch (b2) {
                                                                    case 0:
                                                                        otherSettingsFragment.R().j0.setClickable(false);
                                                                        ((p67) otherSettingsFragment.M().W0.getValue()).f(i67.a);
                                                                        break;
                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                        otherSettingsFragment.N().startActivity(new Intent(otherSettingsFragment.N(), (Class<?>) StatisticsSettingsActivity.class));
                                                                        break;
                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                                                        otherSettingsFragment.N().startActivity(new Intent(otherSettingsFragment.N(), (Class<?>) LogsSettingsActivity.class));
                                                                        break;
                                                                    default:
                                                                        otherSettingsFragment.N().startActivity(new Intent(otherSettingsFragment.N(), (Class<?>) ResetSettingsActivity.class));
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        final byte b2 = 1;
                                                        R().i0.setOnClickListener(new View.OnClickListener(this) { // from class: vd5
                                                            public final /* synthetic */ OtherSettingsFragment Y;

                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                            {
                                                                this.Y = this;
                                                            }

                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                byte b3 = b2;
                                                                OtherSettingsFragment otherSettingsFragment = this.Y;
                                                                switch (b3) {
                                                                    case 0:
                                                                        otherSettingsFragment.R().j0.setClickable(false);
                                                                        ((p67) otherSettingsFragment.M().W0.getValue()).f(i67.a);
                                                                        break;
                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                        otherSettingsFragment.N().startActivity(new Intent(otherSettingsFragment.N(), (Class<?>) StatisticsSettingsActivity.class));
                                                                        break;
                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                                                        otherSettingsFragment.N().startActivity(new Intent(otherSettingsFragment.N(), (Class<?>) LogsSettingsActivity.class));
                                                                        break;
                                                                    default:
                                                                        otherSettingsFragment.N().startActivity(new Intent(otherSettingsFragment.N(), (Class<?>) ResetSettingsActivity.class));
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        final byte b3 = 2;
                                                        R().g0.setOnClickListener(new View.OnClickListener(this) { // from class: vd5
                                                            public final /* synthetic */ OtherSettingsFragment Y;

                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                            {
                                                                this.Y = this;
                                                            }

                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                byte b4 = b3;
                                                                OtherSettingsFragment otherSettingsFragment = this.Y;
                                                                switch (b4) {
                                                                    case 0:
                                                                        otherSettingsFragment.R().j0.setClickable(false);
                                                                        ((p67) otherSettingsFragment.M().W0.getValue()).f(i67.a);
                                                                        break;
                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                        otherSettingsFragment.N().startActivity(new Intent(otherSettingsFragment.N(), (Class<?>) StatisticsSettingsActivity.class));
                                                                        break;
                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                                                        otherSettingsFragment.N().startActivity(new Intent(otherSettingsFragment.N(), (Class<?>) LogsSettingsActivity.class));
                                                                        break;
                                                                    default:
                                                                        otherSettingsFragment.N().startActivity(new Intent(otherSettingsFragment.N(), (Class<?>) ResetSettingsActivity.class));
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        final byte b4 = 3;
                                                        R().h0.setOnClickListener(new View.OnClickListener(this) { // from class: vd5
                                                            public final /* synthetic */ OtherSettingsFragment Y;

                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                            {
                                                                this.Y = this;
                                                            }

                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                byte b5 = b4;
                                                                OtherSettingsFragment otherSettingsFragment = this.Y;
                                                                switch (b5) {
                                                                    case 0:
                                                                        otherSettingsFragment.R().j0.setClickable(false);
                                                                        ((p67) otherSettingsFragment.M().W0.getValue()).f(i67.a);
                                                                        break;
                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                                                        otherSettingsFragment.N().startActivity(new Intent(otherSettingsFragment.N(), (Class<?>) StatisticsSettingsActivity.class));
                                                                        break;
                                                                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                                                                        otherSettingsFragment.N().startActivity(new Intent(otherSettingsFragment.N(), (Class<?>) LogsSettingsActivity.class));
                                                                        break;
                                                                    default:
                                                                        otherSettingsFragment.N().startActivity(new Intent(otherSettingsFragment.N(), (Class<?>) ResetSettingsActivity.class));
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        u84 u84VarZ = ys0.z(((qk2) this).S0);
                                                        nf1 nf1Var = tp1.a;
                                                        jm4.Q(u84VarZ, dm4.a, new wd5(this, null, (byte) 1), 2);
                                                        LinearLayout linearLayout2 = R().X;
                                                        linearLayout2.getClass();
                                                        return linearLayout2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        b61.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
