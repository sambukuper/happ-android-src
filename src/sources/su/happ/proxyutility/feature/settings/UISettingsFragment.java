package su.happ.proxyutility.feature.settings;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.tencent.mmkv.MMKV;
import defpackage.e46;
import defpackage.em2;
import defpackage.ln7;
import defpackage.ng8;
import defpackage.qg8;
import defpackage.t46;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.language.LanguageActivitySettings;
import su.happ.proxyutility.feature.settings.UISettingsFragment;
import su.happ.proxyutility.feature.ui_settings.UISettingsActivity;
import su.happ.proxyutility.ui.foundation.component.HappForwardField;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDivider;
import su.happ.proxyutility.ui.foundation.component.HappSettingsTitle;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/settings/UISettingsFragment;", "Lqk2;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class UISettingsFragment extends qk2 {
    public final vz7 d1 = new vz7(new ng8((byte) 3));
    public em2 e1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final em2 R() {
        em2 em2Var = this.e1;
        if (em2Var != null) {
            return em2Var;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Integer numB0;
        layoutInflater.getClass();
        final byte b = 0;
        View viewInflate = layoutInflater.inflate(t46.fragment_ui_settings, viewGroup, false);
        int i = e46.divider_app_appearance;
        if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
            i = e46.divider_language;
            if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                i = e46.forward_language;
                HappForwardField happForwardField = (HappForwardField) ln7.b(viewInflate, i);
                if (happForwardField != null) {
                    i = e46.forward_ui_settings;
                    HappForwardField happForwardField2 = (HappForwardField) ln7.b(viewInflate, i);
                    if (happForwardField2 != null) {
                        i = e46.spinner_ui_mode_night;
                        HappSpinnerField happSpinnerField = (HappSpinnerField) ln7.b(viewInflate, i);
                        if (happSpinnerField != null) {
                            i = e46.title_category;
                            if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null) {
                                this.e1 = new em2((LinearLayout) viewInflate, happForwardField, happForwardField2, happSpinnerField);
                                String strJ = ((MMKV) this.d1.getValue()).j("pref_ui_mode_night", "0");
                                R().f0.setSelection((strJ == null || (numB0 = mm7.b0(strJ)) == null) ? 0 : numB0.intValue());
                                FragmentActivity fragmentActivityI = i();
                                SettingsActivity settingsActivity = fragmentActivityI instanceof SettingsActivity ? (SettingsActivity) fragmentActivityI : null;
                                final byte b2 = 1;
                                if (settingsActivity != null) {
                                    R().f0.setOnSpinnerItemClickListener(new qg8(this, settingsActivity, (byte) 1));
                                }
                                R().Y.setOnForwardIconClickListener(new dn2(this) { // from class: kk8
                                    public final /* synthetic */ UISettingsFragment Y;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    {
                                        this.Y = this;
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    public final Object invoke() {
                                        byte b3 = b;
                                        dn8 dn8Var = dn8.a;
                                        UISettingsFragment uISettingsFragment = this.Y;
                                        switch (b3) {
                                            case 0:
                                                uISettingsFragment.N().startActivity(new Intent(uISettingsFragment.N(), (Class<?>) LanguageActivitySettings.class));
                                                break;
                                            default:
                                                uISettingsFragment.N().startActivity(new Intent(uISettingsFragment.N(), (Class<?>) UISettingsActivity.class));
                                                break;
                                        }
                                        return dn8Var;
                                    }
                                });
                                R().Z.setOnForwardIconClickListener(new dn2(this) { // from class: kk8
                                    public final /* synthetic */ UISettingsFragment Y;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    {
                                        this.Y = this;
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    public final Object invoke() {
                                        byte b3 = b2;
                                        dn8 dn8Var = dn8.a;
                                        UISettingsFragment uISettingsFragment = this.Y;
                                        switch (b3) {
                                            case 0:
                                                uISettingsFragment.N().startActivity(new Intent(uISettingsFragment.N(), (Class<?>) LanguageActivitySettings.class));
                                                break;
                                            default:
                                                uISettingsFragment.N().startActivity(new Intent(uISettingsFragment.N(), (Class<?>) UISettingsActivity.class));
                                                break;
                                        }
                                        return dn8Var;
                                    }
                                });
                                LinearLayout linearLayout = R().X;
                                linearLayout.getClass();
                                return linearLayout;
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
