package su.happ.proxyutility.feature.settings;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.e46;
import defpackage.ln7;
import defpackage.rk2;
import defpackage.t46;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.report.ReportActivity;
import su.happ.proxyutility.feature.settings.AboutSettingsFragment;
import su.happ.proxyutility.ui.foundation.component.HappForwardField;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDivider;
import su.happ.proxyutility.ui.foundation.component.HappSettingsTitle;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/settings/AboutSettingsFragment;", "Lqk2;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class AboutSettingsFragment extends qk2 {
    public rk2 d1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final rk2 R() {
        rk2 rk2Var = this.d1;
        if (rk2Var != null) {
            return rk2Var;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        final byte b = 0;
        View viewInflate = layoutInflater.inflate(t46.fragment_about_settings, viewGroup, false);
        int i = e46.divider_faq;
        if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
            i = e46.divider_url_schemes;
            if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                i = e46.forward_about;
                HappForwardField happForwardField = (HappForwardField) ln7.b(viewInflate, i);
                if (happForwardField != null) {
                    i = e46.forward_faq;
                    HappForwardField happForwardField2 = (HappForwardField) ln7.b(viewInflate, i);
                    if (happForwardField2 != null) {
                        i = e46.forward_url_schemes;
                        HappForwardField happForwardField3 = (HappForwardField) ln7.b(viewInflate, i);
                        if (happForwardField3 != null) {
                            i = e46.title_category;
                            if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null) {
                                this.d1 = new rk2((LinearLayout) viewInflate, happForwardField, happForwardField2, happForwardField3);
                                R().Z.setOnForwardIconClickListener(new u(this, (byte) 0));
                                R().Z.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: v
                                    public final /* synthetic */ AboutSettingsFragment Y;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    {
                                        this.Y = this;
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // android.view.View.OnLongClickListener
                                    public final boolean onLongClick(View view) {
                                        byte b2 = b;
                                        AboutSettingsFragment aboutSettingsFragment = this.Y;
                                        switch (b2) {
                                            case 0:
                                                be.m(aboutSettingsFragment.M(), aboutSettingsFragment.p(y46.report_dialog_title), (String) null, (String) null, aboutSettingsFragment.p(y46.yes), aboutSettingsFragment.p(y46.no), (Integer) null, new u(aboutSettingsFragment, (byte) 3), dh3.c, 410);
                                                break;
                                            default:
                                                aboutSettingsFragment.N().startActivity(new Intent(aboutSettingsFragment.N(), (Class<?>) ReportActivity.class));
                                                break;
                                        }
                                        return true;
                                    }
                                });
                                final byte b2 = 1;
                                R().f0.setOnForwardIconClickListener(new u(this, (byte) 1));
                                R().Y.setOnForwardIconClickListener(new u(this, (byte) 2));
                                R().Y.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: v
                                    public final /* synthetic */ AboutSettingsFragment Y;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    {
                                        this.Y = this;
                                    }

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // android.view.View.OnLongClickListener
                                    public final boolean onLongClick(View view) {
                                        byte b3 = b2;
                                        AboutSettingsFragment aboutSettingsFragment = this.Y;
                                        switch (b3) {
                                            case 0:
                                                be.m(aboutSettingsFragment.M(), aboutSettingsFragment.p(y46.report_dialog_title), (String) null, (String) null, aboutSettingsFragment.p(y46.yes), aboutSettingsFragment.p(y46.no), (Integer) null, new u(aboutSettingsFragment, (byte) 3), dh3.c, 410);
                                                break;
                                            default:
                                                aboutSettingsFragment.N().startActivity(new Intent(aboutSettingsFragment.N(), (Class<?>) ReportActivity.class));
                                                break;
                                        }
                                        return true;
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
