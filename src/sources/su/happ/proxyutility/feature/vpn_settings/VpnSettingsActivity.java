package su.happ.proxyutility.feature.vpn_settings;

import android.os.Bundle;
import android.os.PowerManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ComponentActivity;
import androidx.databinding.DataBinderMapperImpl;
import com.tencent.mmkv.MMKV;
import defpackage.kz8;
import defpackage.m26;
import defpackage.mz8;
import defpackage.n67;
import defpackage.ng8;
import defpackage.oz8;
import defpackage.qg8;
import defpackage.qz8;
import defpackage.rp7;
import defpackage.rz8;
import defpackage.t46;
import defpackage.uz8;
import defpackage.w6;
import defpackage.y46;
import kotlin.Metadata;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.vpn_settings.VpnSettingsActivity;
import su.happ.proxyutility.ui.SnackbarHostActivity;
import su.happ.proxyutility.ui.foundation.component.HappInputField;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDivider;
import su.happ.proxyutility.ui.foundation.component.HappSnackbarHost;
import su.happ.proxyutility.ui.foundation.component.HappToggleField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/vpn_settings/VpnSettingsActivity;", "Lsu/happ/proxyutility/ui/SnackbarHostActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class VpnSettingsActivity extends SnackbarHostActivity {
    public static final /* synthetic */ int U0 = 0;
    public w6 Q0;
    public final vz7 R0 = new vz7(new ng8((byte) 17));
    public final y5 S0 = new y5(yb6.a.b(uz8.class), new oz8(this, (byte) 1), new oz8(this, (byte) 0), new oz8(this, (byte) 2));
    public final vz7 T0 = new vz7(new kz8(this, 1));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final HappSnackbarHost A() {
        w6 w6Var = this.Q0;
        if (w6Var == null) {
            dh3.T("binding");
            throw null;
        }
        HappSnackbarHost happSnackbarHost = w6Var.w0;
        happSnackbarHost.getClass();
        return happSnackbarHost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MMKV B() {
        return (MMKV) this.R0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final uz8 C() {
        return (uz8) this.S0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void D(boolean z) {
        w6 w6Var = this.Q0;
        if (w6Var == null) {
            dh3.T("binding");
            throw null;
        }
        HappInputField happInputField = w6Var.s0;
        happInputField.getClass();
        rp7.e(happInputField, z);
        w6 w6Var2 = this.Q0;
        if (w6Var2 == null) {
            dh3.T("binding");
            throw null;
        }
        HappSettingsDivider happSettingsDivider = w6Var2.n0;
        happSettingsDivider.getClass();
        rp7.e(happSettingsDivider, z);
        w6 w6Var3 = this.Q0;
        if (w6Var3 == null) {
            dh3.T("binding");
            throw null;
        }
        HappInputField happInputField2 = w6Var3.r0;
        happInputField2.getClass();
        rp7.e(happInputField2, z);
        w6 w6Var4 = this.Q0;
        if (w6Var4 == null) {
            dh3.T("binding");
            throw null;
        }
        HappSettingsDivider happSettingsDivider2 = w6Var4.m0;
        happSettingsDivider2.getClass();
        rp7.e(happSettingsDivider2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: su.happ.proxyutility.feature.vpn_settings.VpnSettingsActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super/*su.happ.proxyutility.ui.BaseActivity*/.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = w6.E0;
        DataBinderMapperImpl dataBinderMapperImpl = x91.a;
        q51 q51Var = null;
        w6 w6Var = (w6) kw8.c(t46.activity_vpn_settings, layoutInflater, (ViewGroup) null);
        w6Var.getClass();
        this.Q0 = w6Var;
        setContentView(((kw8) w6Var).Z);
        mb6.g((qz8) this.T0.getValue());
        w6 w6Var2 = this.Q0;
        if (w6Var2 == null) {
            dh3.T("binding");
            throw null;
        }
        View view = ((kw8) w6Var2).Z;
        view.getClass();
        setBarsParams(view);
        w6 w6Var3 = this.Q0;
        if (w6Var3 == null) {
            dh3.T("binding");
            throw null;
        }
        r(w6Var3.C0);
        setTitle(getString(y46.title_vpn_settings));
        w6 w6Var4 = this.Q0;
        if (w6Var4 == null) {
            dh3.T("binding");
            throw null;
        }
        LinearLayout linearLayout = w6Var4.u0;
        linearLayout.getClass();
        rp7.b(linearLayout);
        w6 w6Var5 = this.Q0;
        if (w6Var5 == null) {
            dh3.T("binding");
            throw null;
        }
        final byte b = 0;
        w6Var5.z0.setChecked(B().c("pref_local_dns_enabled", false));
        w6 w6Var6 = this.Q0;
        if (w6Var6 == null) {
            dh3.T("binding");
            throw null;
        }
        w6Var6.z0.setOnToggleClickListener(new gn2(this) { // from class: lz8
            public final /* synthetic */ VpnSettingsActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object B(Object obj) {
                byte b2 = b;
                dn8 dn8Var = dn8.a;
                VpnSettingsActivity vpnSettingsActivity = this.Y;
                switch (b2) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i2 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_local_dns_enabled", zBooleanValue);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 0), 3);
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        String str = (String) obj;
                        int i3 = VpnSettingsActivity.U0;
                        str.getClass();
                        vpnSettingsActivity.B().q("pref_local_dns_port", str);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 9), 3);
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        int i4 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_dns_from_json", zBooleanValue2);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 10), 3);
                        break;
                    case 3:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        int i5 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_sniffing_enabled", zBooleanValue3);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 11), 3);
                        break;
                    case 4:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        int i6 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_resolve_server_before_start_enabled", zBooleanValue4);
                        vpnSettingsActivity.D(zBooleanValue4);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 13), 3);
                        break;
                    case 5:
                        String str2 = (String) obj;
                        int i7 = VpnSettingsActivity.U0;
                        str2.getClass();
                        vpnSettingsActivity.B().q("pref_resolve_server_before_start_dns_ip", str2);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 1), 3);
                        break;
                    default:
                        String str3 = (String) obj;
                        int i8 = VpnSettingsActivity.U0;
                        str3.getClass();
                        vpnSettingsActivity.B().q("pref_resolve_server_before_start_dns_domain", str3);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 2), 3);
                        break;
                }
                return dn8Var;
            }
        });
        String strI = B().i("pref_local_dns_port");
        if (strI != null) {
            w6 w6Var7 = this.Q0;
            if (w6Var7 == null) {
                dh3.T("binding");
                throw null;
            }
            w6Var7.q0.setText(strI);
        }
        w6 w6Var8 = this.Q0;
        if (w6Var8 == null) {
            dh3.T("binding");
            throw null;
        }
        final byte b2 = 1;
        w6Var8.q0.a(new gn2(this) { // from class: lz8
            public final /* synthetic */ VpnSettingsActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object B(Object obj) {
                byte b3 = b2;
                dn8 dn8Var = dn8.a;
                VpnSettingsActivity vpnSettingsActivity = this.Y;
                switch (b3) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i2 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_local_dns_enabled", zBooleanValue);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 0), 3);
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        String str = (String) obj;
                        int i3 = VpnSettingsActivity.U0;
                        str.getClass();
                        vpnSettingsActivity.B().q("pref_local_dns_port", str);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 9), 3);
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        int i4 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_dns_from_json", zBooleanValue2);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 10), 3);
                        break;
                    case 3:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        int i5 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_sniffing_enabled", zBooleanValue3);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 11), 3);
                        break;
                    case 4:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        int i6 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_resolve_server_before_start_enabled", zBooleanValue4);
                        vpnSettingsActivity.D(zBooleanValue4);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 13), 3);
                        break;
                    case 5:
                        String str2 = (String) obj;
                        int i7 = VpnSettingsActivity.U0;
                        str2.getClass();
                        vpnSettingsActivity.B().q("pref_resolve_server_before_start_dns_ip", str2);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 1), 3);
                        break;
                    default:
                        String str3 = (String) obj;
                        int i8 = VpnSettingsActivity.U0;
                        str3.getClass();
                        vpnSettingsActivity.B().q("pref_resolve_server_before_start_dns_domain", str3);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 2), 3);
                        break;
                }
                return dn8Var;
            }
        });
        w6 w6Var9 = this.Q0;
        if (w6Var9 == null) {
            dh3.T("binding");
            throw null;
        }
        final byte b3 = 2;
        w6Var9.y0.setOnToggleClickListener(new gn2(this) { // from class: lz8
            public final /* synthetic */ VpnSettingsActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object B(Object obj) {
                byte b4 = b3;
                dn8 dn8Var = dn8.a;
                VpnSettingsActivity vpnSettingsActivity = this.Y;
                switch (b4) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i2 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_local_dns_enabled", zBooleanValue);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 0), 3);
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        String str = (String) obj;
                        int i3 = VpnSettingsActivity.U0;
                        str.getClass();
                        vpnSettingsActivity.B().q("pref_local_dns_port", str);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 9), 3);
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        int i4 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_dns_from_json", zBooleanValue2);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 10), 3);
                        break;
                    case 3:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        int i5 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_sniffing_enabled", zBooleanValue3);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 11), 3);
                        break;
                    case 4:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        int i6 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_resolve_server_before_start_enabled", zBooleanValue4);
                        vpnSettingsActivity.D(zBooleanValue4);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 13), 3);
                        break;
                    case 5:
                        String str2 = (String) obj;
                        int i7 = VpnSettingsActivity.U0;
                        str2.getClass();
                        vpnSettingsActivity.B().q("pref_resolve_server_before_start_dns_ip", str2);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 1), 3);
                        break;
                    default:
                        String str3 = (String) obj;
                        int i8 = VpnSettingsActivity.U0;
                        str3.getClass();
                        vpnSettingsActivity.B().q("pref_resolve_server_before_start_dns_domain", str3);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 2), 3);
                        break;
                }
                return dn8Var;
            }
        });
        w6 w6Var10 = this.Q0;
        if (w6Var10 == null) {
            dh3.T("binding");
            throw null;
        }
        w6Var10.y0.setChecked(B().c("pref_dns_from_json", false));
        w6 w6Var11 = this.Q0;
        if (w6Var11 == null) {
            dh3.T("binding");
            throw null;
        }
        final byte b4 = 3;
        w6Var11.B0.setOnToggleClickListener(new gn2(this) { // from class: lz8
            public final /* synthetic */ VpnSettingsActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object B(Object obj) {
                byte b5 = b4;
                dn8 dn8Var = dn8.a;
                VpnSettingsActivity vpnSettingsActivity = this.Y;
                switch (b5) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i2 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_local_dns_enabled", zBooleanValue);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 0), 3);
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        String str = (String) obj;
                        int i3 = VpnSettingsActivity.U0;
                        str.getClass();
                        vpnSettingsActivity.B().q("pref_local_dns_port", str);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 9), 3);
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        int i4 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_dns_from_json", zBooleanValue2);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 10), 3);
                        break;
                    case 3:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        int i5 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_sniffing_enabled", zBooleanValue3);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 11), 3);
                        break;
                    case 4:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        int i6 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_resolve_server_before_start_enabled", zBooleanValue4);
                        vpnSettingsActivity.D(zBooleanValue4);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 13), 3);
                        break;
                    case 5:
                        String str2 = (String) obj;
                        int i7 = VpnSettingsActivity.U0;
                        str2.getClass();
                        vpnSettingsActivity.B().q("pref_resolve_server_before_start_dns_ip", str2);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 1), 3);
                        break;
                    default:
                        String str3 = (String) obj;
                        int i8 = VpnSettingsActivity.U0;
                        str3.getClass();
                        vpnSettingsActivity.B().q("pref_resolve_server_before_start_dns_domain", str3);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 2), 3);
                        break;
                }
                return dn8Var;
            }
        });
        w6 w6Var12 = this.Q0;
        if (w6Var12 == null) {
            dh3.T("binding");
            throw null;
        }
        w6Var12.B0.setChecked(B().c("pref_sniffing_enabled", true));
        String[] stringArray = getResources().getStringArray(m26.mode_value);
        stringArray.getClass();
        String strI2 = B().i("pref_mode");
        if (strI2 == null) {
            strI2 = "VPN";
        }
        w6 w6Var13 = this.Q0;
        if (w6Var13 == null) {
            dh3.T("binding");
            throw null;
        }
        w6Var13.x0.setSelection(eu.v0(strI2, stringArray));
        w6 w6Var14 = this.Q0;
        if (w6Var14 == null) {
            dh3.T("binding");
            throw null;
        }
        w6Var14.x0.setOnSpinnerItemClickListener(new qg8(this, stringArray, b3));
        boolean zC = n67.c().c("pref_resolve_server_before_start_enabled", false);
        w6 w6Var15 = this.Q0;
        if (w6Var15 == null) {
            dh3.T("binding");
            throw null;
        }
        w6Var15.A0.setChecked(zC);
        D(zC);
        w6 w6Var16 = this.Q0;
        if (w6Var16 == null) {
            dh3.T("binding");
            throw null;
        }
        final byte b5 = 4;
        w6Var16.A0.setOnToggleClickListener(new gn2(this) { // from class: lz8
            public final /* synthetic */ VpnSettingsActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object B(Object obj) {
                byte b6 = b5;
                dn8 dn8Var = dn8.a;
                VpnSettingsActivity vpnSettingsActivity = this.Y;
                switch (b6) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i2 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_local_dns_enabled", zBooleanValue);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 0), 3);
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        String str = (String) obj;
                        int i3 = VpnSettingsActivity.U0;
                        str.getClass();
                        vpnSettingsActivity.B().q("pref_local_dns_port", str);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 9), 3);
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        int i4 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_dns_from_json", zBooleanValue2);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 10), 3);
                        break;
                    case 3:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        int i5 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_sniffing_enabled", zBooleanValue3);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 11), 3);
                        break;
                    case 4:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        int i6 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_resolve_server_before_start_enabled", zBooleanValue4);
                        vpnSettingsActivity.D(zBooleanValue4);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 13), 3);
                        break;
                    case 5:
                        String str2 = (String) obj;
                        int i7 = VpnSettingsActivity.U0;
                        str2.getClass();
                        vpnSettingsActivity.B().q("pref_resolve_server_before_start_dns_ip", str2);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 1), 3);
                        break;
                    default:
                        String str3 = (String) obj;
                        int i8 = VpnSettingsActivity.U0;
                        str3.getClass();
                        vpnSettingsActivity.B().q("pref_resolve_server_before_start_dns_domain", str3);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 2), 3);
                        break;
                }
                return dn8Var;
            }
        });
        String strI3 = B().i("pref_resolve_server_before_start_dns_ip");
        if (strI3 != null) {
            w6 w6Var17 = this.Q0;
            if (w6Var17 == null) {
                dh3.T("binding");
                throw null;
            }
            w6Var17.s0.setText(strI3);
        }
        w6 w6Var18 = this.Q0;
        if (w6Var18 == null) {
            dh3.T("binding");
            throw null;
        }
        final byte b6 = 5;
        w6Var18.s0.a(new gn2(this) { // from class: lz8
            public final /* synthetic */ VpnSettingsActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object B(Object obj) {
                byte b7 = b6;
                dn8 dn8Var = dn8.a;
                VpnSettingsActivity vpnSettingsActivity = this.Y;
                switch (b7) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i2 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_local_dns_enabled", zBooleanValue);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 0), 3);
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        String str = (String) obj;
                        int i3 = VpnSettingsActivity.U0;
                        str.getClass();
                        vpnSettingsActivity.B().q("pref_local_dns_port", str);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 9), 3);
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        int i4 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_dns_from_json", zBooleanValue2);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 10), 3);
                        break;
                    case 3:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        int i5 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_sniffing_enabled", zBooleanValue3);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 11), 3);
                        break;
                    case 4:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        int i6 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_resolve_server_before_start_enabled", zBooleanValue4);
                        vpnSettingsActivity.D(zBooleanValue4);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 13), 3);
                        break;
                    case 5:
                        String str2 = (String) obj;
                        int i7 = VpnSettingsActivity.U0;
                        str2.getClass();
                        vpnSettingsActivity.B().q("pref_resolve_server_before_start_dns_ip", str2);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 1), 3);
                        break;
                    default:
                        String str3 = (String) obj;
                        int i8 = VpnSettingsActivity.U0;
                        str3.getClass();
                        vpnSettingsActivity.B().q("pref_resolve_server_before_start_dns_domain", str3);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 2), 3);
                        break;
                }
                return dn8Var;
            }
        });
        String strI4 = B().i("pref_resolve_server_before_start_dns_domain");
        if (strI4 != null) {
            w6 w6Var19 = this.Q0;
            if (w6Var19 == null) {
                dh3.T("binding");
                throw null;
            }
            w6Var19.r0.setText(strI4);
        }
        w6 w6Var20 = this.Q0;
        if (w6Var20 == null) {
            dh3.T("binding");
            throw null;
        }
        final byte b7 = 6;
        w6Var20.r0.a(new gn2(this) { // from class: lz8
            public final /* synthetic */ VpnSettingsActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object B(Object obj) {
                byte b8 = b7;
                dn8 dn8Var = dn8.a;
                VpnSettingsActivity vpnSettingsActivity = this.Y;
                switch (b8) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i2 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_local_dns_enabled", zBooleanValue);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 0), 3);
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        String str = (String) obj;
                        int i3 = VpnSettingsActivity.U0;
                        str.getClass();
                        vpnSettingsActivity.B().q("pref_local_dns_port", str);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 9), 3);
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        int i4 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_dns_from_json", zBooleanValue2);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 10), 3);
                        break;
                    case 3:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        int i5 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_sniffing_enabled", zBooleanValue3);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 11), 3);
                        break;
                    case 4:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        int i6 = VpnSettingsActivity.U0;
                        vpnSettingsActivity.B().p("pref_resolve_server_before_start_enabled", zBooleanValue4);
                        vpnSettingsActivity.D(zBooleanValue4);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 13), 3);
                        break;
                    case 5:
                        String str2 = (String) obj;
                        int i7 = VpnSettingsActivity.U0;
                        str2.getClass();
                        vpnSettingsActivity.B().q("pref_resolve_server_before_start_dns_ip", str2);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 1), 3);
                        break;
                    default:
                        String str3 = (String) obj;
                        int i8 = VpnSettingsActivity.U0;
                        str3.getClass();
                        vpnSettingsActivity.B().q("pref_resolve_server_before_start_dns_domain", str3);
                        jm4.Q(ys0.z(((ComponentActivity) vpnSettingsActivity).X), (u61) null, new mz8(vpnSettingsActivity, null, (byte) 2), 3);
                        break;
                }
                return dn8Var;
            }
        });
        w6 w6Var21 = this.Q0;
        if (w6Var21 == null) {
            dh3.T("binding");
            throw null;
        }
        w6Var21.o0.setOnForwardIconClickListener(new kz8(this, b3));
        w6 w6Var22 = this.Q0;
        if (w6Var22 == null) {
            dh3.T("binding");
            throw null;
        }
        w6Var22.p0.setOnForwardIconClickListener(new kz8(this, b));
        g94 g94Var = ((ComponentActivity) this).X;
        u84 u84VarZ = ys0.z(g94Var);
        nf1 nf1Var = tp1.a;
        hv2 hv2Var = dm4.a;
        jm4.Q(u84VarZ, hv2Var, new mz8(this, q51Var, b5), 2);
        jm4.Q(ys0.z(g94Var), hv2Var, new mz8(this, q51Var, b7), 2);
        jm4.Q(ys0.z(g94Var), hv2Var, new mz8(this, q51Var, (byte) 8), 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: su.happ.proxyutility.feature.vpn_settings.VpnSettingsActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        Object value;
        super/*su.happ.proxyutility.ui.BaseActivity*/.onResume();
        uz8 uz8VarC = C();
        HappApplication happApplication = HappApplication.M0;
        Object systemService = k32.i().getSystemService("power");
        systemService.getClass();
        PowerManager powerManager = (PowerManager) systemService;
        oh7 oh7Var = uz8VarC.c;
        oh7Var.getClass();
        do {
            value = oh7Var.getValue();
            ((rz8) value).getClass();
            HappApplication happApplication2 = HappApplication.M0;
        } while (!oh7Var.k(value, new rz8(!powerManager.isIgnoringBatteryOptimizations(k32.i().getPackageName()))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Toolbar v() {
        w6 w6Var = this.Q0;
        if (w6Var == null) {
            dh3.T("binding");
            throw null;
        }
        Toolbar toolbar = w6Var.C0;
        toolbar.getClass();
        return toolbar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean x() {
        qz8 qz8Var = (qz8) this.T0.getValue();
        HappToggleField happToggleField = qz8Var.X.z0;
        happToggleField.getClass();
        return qz8Var.a(happToggleField);
    }
}
