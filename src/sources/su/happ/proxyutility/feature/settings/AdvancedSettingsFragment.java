package su.happ.proxyutility.feature.settings;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.mmkv.MMKV;
import defpackage.e46;
import defpackage.ln7;
import defpackage.m7;
import defpackage.n67;
import defpackage.r7;
import defpackage.rp7;
import defpackage.ss8;
import defpackage.t46;
import defpackage.uk2;
import defpackage.y46;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.settings.AdvancedSettingsFragment;
import su.happ.proxyutility.ui.SnackbarHostActivity;
import su.happ.proxyutility.ui.foundation.component.HappForwardField;
import su.happ.proxyutility.ui.foundation.component.HappInfoField;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDivider;
import su.happ.proxyutility.ui.foundation.component.HappSettingsTitle;
import su.happ.proxyutility.ui.foundation.component.HappToggleField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/settings/AdvancedSettingsFragment;", "Lqk2;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class AdvancedSettingsFragment extends qk2 {
    public final vz7 d1 = new vz7(new x((byte) 2));
    public final vz7 e1 = new vz7(new x((byte) 3));
    public uk2 f1;
    public q7 g1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void R(boolean z) {
        S().m0.setDescription(z ? p(y46.title_pref_proxy_sharing_enabled_warning) : null);
        rp7.g(14, S().Y, z, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final uk2 S() {
        uk2 uk2Var = this.f1;
        if (uk2Var != null) {
            return uk2Var;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void T() {
        HappInfoField happInfoField = S().h0;
        String str = "";
        if (((MMKV) this.d1.getValue()).c("pref_proxy_sharing_enabled", false)) {
            ss8 ss8Var = ss8.a;
            String strL = ss8.l();
            if (strL != null) {
                str = strL;
            }
        }
        happInfoField.setInfo(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y(Bundle bundle) {
        super.y(bundle);
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build();
        SnackbarHostActivity snackbarHostActivityI = i();
        SnackbarHostActivity snackbarHostActivity = snackbarHostActivityI instanceof SettingsActivity ? (SettingsActivity) snackbarHostActivityI : null;
        if (snackbarHostActivity != null) {
            this.g1 = new q7(this, (byte) 0);
            Object systemService = snackbarHostActivity.getSystemService(ConnectivityManager.class);
            systemService.getClass();
            q7 q7Var = this.g1;
            q7Var.getClass();
            ((ConnectivityManager) systemService).requestNetwork(networkRequestBuild, (ConnectivityManager.NetworkCallback) q7Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        final byte b = 0;
        View viewInflate = layoutInflater.inflate(t46.fragment_advanced_settings, viewGroup, false);
        int i = e46.cl_allow_connection_from_lan_block;
        LinearLayout linearLayout = (LinearLayout) ln7.b(viewInflate, i);
        q51 q51Var = null;
        if (linearLayout != null) {
            i = e46.divider_advanced;
            if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                i = e46.divider_allow_connection_from_lan_enabled;
                if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                    i = e46.divider_auto_start_vpn;
                    if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                        i = e46.divider_current_ip;
                        if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                            i = e46.divider_ping;
                            if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                                i = e46.divider_socks_port;
                                if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                                    i = e46.divider_subscription;
                                    if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                                        i = e46.forward_ping;
                                        HappForwardField happForwardField = (HappForwardField) ln7.b(viewInflate, i);
                                        if (happForwardField != null) {
                                            i = e46.forward_subscription;
                                            HappForwardField happForwardField2 = (HappForwardField) ln7.b(viewInflate, i);
                                            if (happForwardField2 != null) {
                                                i = e46.forward_vpn;
                                                HappForwardField happForwardField3 = (HappForwardField) ln7.b(viewInflate, i);
                                                if (happForwardField3 != null) {
                                                    i = e46.if_current_ip;
                                                    HappInfoField happInfoField = (HappInfoField) ln7.b(viewInflate, i);
                                                    if (happInfoField != null) {
                                                        i = e46.if_http_port;
                                                        HappInfoField happInfoField2 = (HappInfoField) ln7.b(viewInflate, i);
                                                        if (happInfoField2 != null) {
                                                            i = e46.if_socks_port;
                                                            HappInfoField happInfoField3 = (HappInfoField) ln7.b(viewInflate, i);
                                                            if (happInfoField3 != null) {
                                                                LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                                                                i = e46.ll_allow_connection_from_lan;
                                                                LinearLayout linearLayout3 = (LinearLayout) ln7.b(viewInflate, i);
                                                                if (linearLayout3 != null) {
                                                                    i = e46.title_category;
                                                                    if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null) {
                                                                        i = e46.toggle_allow_connection_from_lan_enabled;
                                                                        HappToggleField happToggleField = (HappToggleField) ln7.b(viewInflate, i);
                                                                        if (happToggleField != null) {
                                                                            i = e46.toggle_auto_start_vpn;
                                                                            HappToggleField happToggleField2 = (HappToggleField) ln7.b(viewInflate, i);
                                                                            if (happToggleField2 != null) {
                                                                                this.f1 = new uk2(linearLayout2, linearLayout, happForwardField, happForwardField2, happForwardField3, happInfoField, happInfoField2, happInfoField3, linearLayout2, linearLayout3, happToggleField, happToggleField2);
                                                                                LinearLayout linearLayout4 = S().k0;
                                                                                linearLayout4.getClass();
                                                                                rp7.b(linearLayout4);
                                                                                rp7.b(S().l0);
                                                                                SettingsActivity settingsActivityI = i();
                                                                                SettingsActivity settingsActivity = settingsActivityI instanceof SettingsActivity ? settingsActivityI : null;
                                                                                if (settingsActivity != null) {
                                                                                    S().g0.setOnForwardIconClickListener(new m7(settingsActivity, b));
                                                                                    final byte b2 = 1;
                                                                                    S().f0.setOnForwardIconClickListener(new m7(settingsActivity, b2));
                                                                                    S().Z.setOnForwardIconClickListener(new m7(settingsActivity, (byte) 2));
                                                                                    S().m0.setOnToggleClickListener(new gn2(this) { // from class: n7
                                                                                        public final /* synthetic */ AdvancedSettingsFragment Y;

                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                        {
                                                                                            this.Y = this;
                                                                                        }

                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                        public final Object B(Object obj) {
                                                                                            byte b3 = b;
                                                                                            dn8 dn8Var = dn8.a;
                                                                                            AdvancedSettingsFragment advancedSettingsFragment = this.Y;
                                                                                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                                                                            switch (b3) {
                                                                                                case 0:
                                                                                                    ((MMKV) advancedSettingsFragment.d1.getValue()).p("pref_proxy_sharing_enabled", zBooleanValue);
                                                                                                    advancedSettingsFragment.R(zBooleanValue);
                                                                                                    advancedSettingsFragment.T();
                                                                                                    jm4.Q(ys0.z(((qk2) advancedSettingsFragment).S0), (u61) null, new r7(advancedSettingsFragment, null, (byte) 1), 3);
                                                                                                    break;
                                                                                                default:
                                                                                                    ((MMKV) advancedSettingsFragment.d1.getValue()).p("pref_auto_start_vpn", zBooleanValue);
                                                                                                    if (zBooleanValue) {
                                                                                                        be.m(advancedSettingsFragment.M(), advancedSettingsFragment.p(y46.warning_text), advancedSettingsFragment.p(y46.dialog_autostart_request), (String) null, (String) null, (String) null, (Integer) null, new o7(advancedSettingsFragment, (byte) 0), new x(advancedSettingsFragment), 242);
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            return dn8Var;
                                                                                        }
                                                                                    });
                                                                                    vz7 vz7Var = this.d1;
                                                                                    boolean z = ((MMKV) vz7Var.getValue()).getBoolean("pref_proxy_sharing_enabled", false);
                                                                                    S().m0.setChecked(z);
                                                                                    R(z);
                                                                                    T();
                                                                                    S().j0.setInfo(String.valueOf(n67.d()));
                                                                                    S().i0.setInfo(String.valueOf(n67.b()));
                                                                                    S().n0.setOnToggleClickListener(new gn2(this) { // from class: n7
                                                                                        public final /* synthetic */ AdvancedSettingsFragment Y;

                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                        {
                                                                                            this.Y = this;
                                                                                        }

                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                        public final Object B(Object obj) {
                                                                                            byte b3 = b2;
                                                                                            dn8 dn8Var = dn8.a;
                                                                                            AdvancedSettingsFragment advancedSettingsFragment = this.Y;
                                                                                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                                                                            switch (b3) {
                                                                                                case 0:
                                                                                                    ((MMKV) advancedSettingsFragment.d1.getValue()).p("pref_proxy_sharing_enabled", zBooleanValue);
                                                                                                    advancedSettingsFragment.R(zBooleanValue);
                                                                                                    advancedSettingsFragment.T();
                                                                                                    jm4.Q(ys0.z(((qk2) advancedSettingsFragment).S0), (u61) null, new r7(advancedSettingsFragment, null, (byte) 1), 3);
                                                                                                    break;
                                                                                                default:
                                                                                                    ((MMKV) advancedSettingsFragment.d1.getValue()).p("pref_auto_start_vpn", zBooleanValue);
                                                                                                    if (zBooleanValue) {
                                                                                                        be.m(advancedSettingsFragment.M(), advancedSettingsFragment.p(y46.warning_text), advancedSettingsFragment.p(y46.dialog_autostart_request), (String) null, (String) null, (String) null, (Integer) null, new o7(advancedSettingsFragment, (byte) 0), new x(advancedSettingsFragment), 242);
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            return dn8Var;
                                                                                        }
                                                                                    });
                                                                                    S().n0.setChecked(((MMKV) vz7Var.getValue()).getBoolean("pref_auto_start_vpn", false));
                                                                                }
                                                                                jm4.Q(ys0.z(((qk2) this).S0), (u61) null, new r7(this, q51Var, b), 3);
                                                                                LinearLayout linearLayout5 = S().X;
                                                                                linearLayout5.getClass();
                                                                                return linearLayout5;
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
