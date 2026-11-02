package su.happ.proxyutility.feature.inbound_auth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ComponentActivity;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.g93;
import defpackage.i93;
import defpackage.j93;
import defpackage.l93;
import defpackage.m93;
import defpackage.q93;
import defpackage.rp7;
import defpackage.t46;
import defpackage.v93;
import defpackage.y46;
import defpackage.z5;
import defpackage.z93;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.InboundAuthMode;
import su.happ.proxyutility.feature.inbound_auth.InboundAuthActivity;
import su.happ.proxyutility.ui.SnackbarHostActivity;
import su.happ.proxyutility.ui.foundation.component.HappSnackbarHost;
import su.happ.proxyutility.ui.foundation.component.HappSpinnerField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/inbound_auth/InboundAuthActivity;", "Lsu/happ/proxyutility/ui/SnackbarHostActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class InboundAuthActivity extends SnackbarHostActivity {
    public static final /* synthetic */ int T0 = 0;
    public z5 Q0;
    public final y5 R0 = new y5(yb6.a.b(z93.class), new j93(this, (byte) 1), new j93(this, (byte) 0), new j93(this, (byte) 2));
    public final vz7 S0 = new vz7(new tb2(this, (byte) 10));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final HappSnackbarHost A() {
        z5 z5Var = this.Q0;
        if (z5Var == null) {
            dh3.T("binding");
            throw null;
        }
        HappSnackbarHost happSnackbarHost = z5Var.v0;
        happSnackbarHost.getClass();
        return happSnackbarHost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final z93 B() {
        return (z93) this.R0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: su.happ.proxyutility.feature.inbound_auth.InboundAuthActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void C(q93 q93Var, boolean z) {
        CharSequence string;
        CharSequence string2;
        m93 m93Var = q93Var.a;
        InboundAuthMode inboundAuthMode = m93Var.b;
        m93 m93Var2 = q93Var.c;
        String str = m93Var2.a;
        InboundAuthMode inboundAuthMode2 = m93Var2.b;
        InboundAuthMode inboundAuthMode3 = m93Var.b;
        InboundAuthMode inboundAuthMode4 = InboundAuthMode.MANUAL;
        boolean z2 = inboundAuthMode3 == inboundAuthMode4;
        Integer numB0 = mm7.b0(m93Var.a);
        int iIntValue = numB0 != null ? numB0.intValue() : Integer.parseInt("10808");
        z5 z5Var = this.Q0;
        if (z5Var == null) {
            dh3.T("binding");
            throw null;
        }
        z5Var.y0.setSelection(inboundAuthMode.ordinal());
        z5 z5Var2 = this.Q0;
        if (z5Var2 == null) {
            dh3.T("binding");
            throw null;
        }
        AppCompatTextView appCompatTextView = z5Var2.w0;
        int[] iArr = g93.a;
        int i = iArr[inboundAuthMode.ordinal()];
        if (i == 1) {
            string = getString(y46.inbound_authorization_socks_description_auto, Integer.valueOf(iIntValue));
        } else if (i == 2) {
            string = getString(y46.inbound_authorization_socks_description_manual, Integer.valueOf(iIntValue));
        } else if (i == 3) {
            string = getString(y46.inbound_authorization_socks_description_from_json, Integer.valueOf(iIntValue));
        } else {
            if (i != 4) {
                b61.c();
                return;
            }
            string = getString(y46.inbound_authorization_description_disable);
        }
        appCompatTextView.setText(string);
        z5 z5Var3 = this.Q0;
        if (z5Var3 == null) {
            dh3.T("binding");
            throw null;
        }
        z5Var3.r0.setText(m93Var.a);
        z5 z5Var4 = this.Q0;
        if (z5Var4 == null) {
            dh3.T("binding");
            throw null;
        }
        z5Var4.s0.setText(m93Var.c);
        z5 z5Var5 = this.Q0;
        if (z5Var5 == null) {
            dh3.T("binding");
            throw null;
        }
        z5Var5.s0.setInputEnabled(z2);
        z5 z5Var6 = this.Q0;
        if (z5Var6 == null) {
            dh3.T("binding");
            throw null;
        }
        z5Var6.q0.setText(m93Var.d);
        z5 z5Var7 = this.Q0;
        if (z5Var7 == null) {
            dh3.T("binding");
            throw null;
        }
        z5Var7.q0.setInputEnabled(z2);
        boolean z3 = q93Var.b;
        boolean z4 = inboundAuthMode2 == inboundAuthMode4 && z3;
        Integer numB1 = mm7.b0(str);
        int iIntValue2 = numB1 != null ? numB1.intValue() : Integer.parseInt("10809");
        z5 z5Var8 = this.Q0;
        if (z5Var8 == null) {
            dh3.T("binding");
            throw null;
        }
        LinearLayout linearLayout = z5Var8.t0;
        linearLayout.getClass();
        rp7.g(12, linearLayout, z3, z);
        z5 z5Var9 = this.Q0;
        if (z5Var9 == null) {
            dh3.T("binding");
            throw null;
        }
        z5Var9.z0.setChecked(z3);
        z5 z5Var10 = this.Q0;
        if (z5Var10 == null) {
            dh3.T("binding");
            throw null;
        }
        z5Var10.x0.setSelection(inboundAuthMode2.ordinal());
        z5 z5Var11 = this.Q0;
        if (z5Var11 == null) {
            dh3.T("binding");
            throw null;
        }
        z5Var11.x0.setEnabled(z3);
        z5 z5Var12 = this.Q0;
        if (z5Var12 == null) {
            dh3.T("binding");
            throw null;
        }
        AppCompatTextView appCompatTextView2 = z5Var12.m0;
        int i2 = iArr[inboundAuthMode2.ordinal()];
        if (i2 == 1) {
            string2 = getString(y46.inbound_authorization_http_description_auto, Integer.valueOf(iIntValue2));
        } else if (i2 == 2) {
            string2 = getString(y46.inbound_authorization_http_description_manual, Integer.valueOf(iIntValue2));
        } else if (i2 == 3) {
            string2 = getString(y46.inbound_authorization_http_description_from_json, Integer.valueOf(iIntValue2));
        } else {
            if (i2 != 4) {
                b61.c();
                return;
            }
            string2 = getString(y46.inbound_authorization_description_disable);
        }
        appCompatTextView2.setText(string2);
        z5 z5Var13 = this.Q0;
        if (z5Var13 == null) {
            dh3.T("binding");
            throw null;
        }
        z5Var13.o0.setText(str);
        z5 z5Var14 = this.Q0;
        if (z5Var14 == null) {
            dh3.T("binding");
            throw null;
        }
        z5Var14.p0.setText(m93Var2.c);
        z5 z5Var15 = this.Q0;
        if (z5Var15 == null) {
            dh3.T("binding");
            throw null;
        }
        z5Var15.p0.setInputEnabled(z4);
        z5 z5Var16 = this.Q0;
        if (z5Var16 == null) {
            dh3.T("binding");
            throw null;
        }
        z5Var16.n0.setText(m93Var2.d);
        z5 z5Var17 = this.Q0;
        if (z5Var17 != null) {
            z5Var17.n0.setInputEnabled(z4);
        } else {
            dh3.T("binding");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r31v0, resolved type: su.happ.proxyutility.feature.inbound_auth.InboundAuthActivity */
    /* JADX WARN: Code duplicated, block: B:27:0x0130  */
    /* JADX WARN: Code duplicated, block: B:36:0x0170  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        Object value;
        q93 q93Var;
        final byte b;
        Object value2;
        q93 q93Var2;
        InboundAuthMode inboundAuthMode;
        InboundAuthMode inboundAuthMode2;
        super/*su.happ.proxyutility.ui.BaseActivity*/.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = z5.B0;
        DataBinderMapperImpl dataBinderMapperImpl = x91.a;
        q51 q51Var = null;
        z5 z5Var = (z5) kw8.c(t46.activity_inbound_auth, layoutInflater, (ViewGroup) null);
        z5Var.getClass();
        this.Q0 = z5Var;
        setContentView(((kw8) z5Var).Z);
        mb6.g((l93) this.S0.getValue());
        z5 z5Var2 = this.Q0;
        if (z5Var2 == null) {
            dh3.T("binding");
            throw null;
        }
        View view = ((kw8) z5Var2).Z;
        view.getClass();
        setBarsParams(view);
        z5 z5Var3 = this.Q0;
        if (z5Var3 == null) {
            dh3.T("binding");
            throw null;
        }
        r(z5Var3.A0);
        setTitle(getString(y46.inbound_authorization_title));
        g94 g94Var = ((ComponentActivity) this).X;
        u84 u84VarZ = ys0.z(g94Var);
        nf1 nf1Var = tp1.a;
        hv2 hv2Var = dm4.a;
        final byte b2 = 1;
        final byte b3 = 2;
        jm4.Q(u84VarZ, hv2Var, new i93(this, q51Var, b2), 2);
        final byte b4 = 3;
        jm4.Q(ys0.z(g94Var), hv2Var, new i93(this, q51Var, b4), 2);
        jm4.Q(ys0.z(g94Var), hv2Var.h0, new i93(this, q51Var, (byte) 5), 2);
        z93 z93VarB = B();
        oh7 oh7Var = z93VarB.e;
        final byte b5 = 0;
        jm4.Q(zw8.a(z93VarB), (u61) null, new v93(z93VarB, q51Var, b5), 3);
        jm4.Q(zw8.a(z93VarB), (u61) null, new v93(z93VarB, q51Var, b2), 3);
        String strI = z93VarB.e().i("pref_socks_port");
        String str = strI == null ? "" : strI;
        oh7Var.getClass();
        do {
            value = oh7Var.getValue();
            q93Var = (q93) value;
            q93Var.getClass();
            b = 6;
        } while (!oh7Var.k(value, q93.a(q93Var, m93.a(q93Var.a, str, null, null, null, 14), false, null, 6)));
        String strI2 = z93VarB.e().i("pref_http_port");
        String str2 = strI2 == null ? "" : strI2;
        do {
            value2 = oh7Var.getValue();
            q93Var2 = (q93) value2;
            q93Var2.getClass();
        } while (!oh7Var.k(value2, q93.a(q93Var2, null, false, m93.a(q93Var2.c, str2, null, null, null, 14), 3)));
        int iE = z93VarB.e().e(-1, "pref_socks_auth_mode");
        Integer numValueOf = Integer.valueOf(iE);
        if (iE == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            inboundAuthMode = (InboundAuthMode) InboundAuthMode.b().get(numValueOf.intValue());
            if (inboundAuthMode == null) {
                InboundAuthMode.INSTANCE.getClass();
                inboundAuthMode = InboundAuthMode.f5default;
            }
        } else {
            InboundAuthMode.INSTANCE.getClass();
            inboundAuthMode = InboundAuthMode.f5default;
        }
        z93VarB.j(inboundAuthMode);
        z93VarB.h(z93VarB.e().b("pref_http_auth_enabled"));
        int iE2 = z93VarB.e().e(-1, "pref_http_auth_mode");
        Integer numValueOf2 = Integer.valueOf(iE2);
        if (iE2 == -1) {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            inboundAuthMode2 = (InboundAuthMode) InboundAuthMode.b().get(numValueOf2.intValue());
            if (inboundAuthMode2 == null) {
                InboundAuthMode.INSTANCE.getClass();
                inboundAuthMode2 = InboundAuthMode.f5default;
            }
        } else {
            InboundAuthMode.INSTANCE.getClass();
            inboundAuthMode2 = InboundAuthMode.f5default;
        }
        z93VarB.i(inboundAuthMode2);
        if (z93VarB.e().b("pref_proxy_sharing_enabled")) {
            tu0 tu0VarA = zw8.a(z93VarB);
            nf1 nf1Var2 = tp1.a;
            jm4.Q(tu0VarA, dm4.a, new v93(z93VarB, q51Var, b3), 2);
        }
        C((q93) B().f.X.getValue(), false);
        z5 z5Var4 = this.Q0;
        if (z5Var4 == null) {
            dh3.T("binding");
            throw null;
        }
        z5Var4.r0.a(new d0(1, B(), z93.class, "updateSocksPort", "updateSocksPort(Ljava/lang/String;)V", 0, (byte) 13));
        z5 z5Var5 = this.Q0;
        if (z5Var5 == null) {
            dh3.T("binding");
            throw null;
        }
        HappSpinnerField happSpinnerField = z5Var5.y0;
        happSpinnerField.getClass();
        z5 z5Var6 = this.Q0;
        if (z5Var6 == null) {
            dh3.T("binding");
            throw null;
        }
        View view2 = ((kw8) z5Var6).Z;
        view2.getClass();
        i21.O(happSpinnerField, view2, new gn2(this) { // from class: f93
            public final /* synthetic */ InboundAuthActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object B(Object obj) {
                Object value3;
                q93 q93Var3;
                Object value4;
                q93 q93Var4;
                Object value5;
                q93 q93Var5;
                Object value6;
                q93 q93Var6;
                byte b6 = b5;
                byte b7 = 6;
                q51 q51Var2 = null;
                dn8 dn8Var = dn8.a;
                InboundAuthActivity inboundAuthActivity = this.Y;
                switch (b6) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        int i2 = InboundAuthActivity.T0;
                        inboundAuthActivity.B().j((InboundAuthMode) InboundAuthMode.b().get(iIntValue));
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        String str3 = (String) obj;
                        int i3 = InboundAuthActivity.T0;
                        str3.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).a.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB2 = inboundAuthActivity.B();
                            oh7 oh7Var2 = z93VarB2.e;
                            oh7Var2.getClass();
                            do {
                                value3 = oh7Var2.getValue();
                                q93Var3 = (q93) value3;
                                q93Var3.getClass();
                            } while (!oh7Var2.k(value3, q93.a(q93Var3, m93.a(q93Var3.a, null, null, str3, null, 11), false, null, 6)));
                            z93VarB2.e().q("pref_socks_auth_manual_user", str3);
                            jm4.Q(zw8.a(z93VarB2), (u61) null, new v93(z93VarB2, q51Var2, (byte) 10), 3);
                        }
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        String str4 = (String) obj;
                        int i4 = InboundAuthActivity.T0;
                        str4.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).a.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB3 = inboundAuthActivity.B();
                            oh7 oh7Var3 = z93VarB3.e;
                            oh7Var3.getClass();
                            do {
                                value4 = oh7Var3.getValue();
                                q93Var4 = (q93) value4;
                                q93Var4.getClass();
                            } while (!oh7Var3.k(value4, q93.a(q93Var4, m93.a(q93Var4.a, null, null, null, str4, 7), false, null, 6)));
                            z93VarB3.e().q("pref_socks_auth_manual_pass", str4);
                            jm4.Q(zw8.a(z93VarB3), (u61) null, new v93(z93VarB3, q51Var2, (byte) 8), 3);
                        }
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i5 = InboundAuthActivity.T0;
                        inboundAuthActivity.B().h(zBooleanValue);
                        break;
                    case 4:
                        int iIntValue2 = ((Integer) obj).intValue();
                        int i6 = InboundAuthActivity.T0;
                        inboundAuthActivity.B().i((InboundAuthMode) InboundAuthMode.b().get(iIntValue2));
                        break;
                    case 5:
                        String str5 = (String) obj;
                        int i7 = InboundAuthActivity.T0;
                        str5.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).c.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB4 = inboundAuthActivity.B();
                            oh7 oh7Var4 = z93VarB4.e;
                            oh7Var4.getClass();
                            do {
                                value5 = oh7Var4.getValue();
                                q93Var5 = (q93) value5;
                                q93Var5.getClass();
                            } while (!oh7Var4.k(value5, q93.a(q93Var5, null, false, m93.a(q93Var5.c, null, null, str5, null, 11), 3)));
                            z93VarB4.e().q("pref_http_auth_manual_user", str5);
                            jm4.Q(zw8.a(z93VarB4), (u61) null, new v93(z93VarB4, q51Var2, b7), 3);
                        }
                        break;
                    default:
                        String str6 = (String) obj;
                        int i8 = InboundAuthActivity.T0;
                        str6.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).c.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB5 = inboundAuthActivity.B();
                            oh7 oh7Var5 = z93VarB5.e;
                            oh7Var5.getClass();
                            do {
                                value6 = oh7Var5.getValue();
                                q93Var6 = (q93) value6;
                                q93Var6.getClass();
                            } while (!oh7Var5.k(value6, q93.a(q93Var6, null, false, m93.a(q93Var6.c, null, null, null, str6, 7), 3)));
                            z93VarB5.e().q("pref_http_auth_manual_pass", str6);
                            jm4.Q(zw8.a(z93VarB5), (u61) null, new v93(z93VarB5, q51Var2, (byte) 4), 3);
                        }
                        break;
                }
                return dn8Var;
            }
        });
        z5 z5Var7 = this.Q0;
        if (z5Var7 == null) {
            dh3.T("binding");
            throw null;
        }
        z5Var7.s0.a(new gn2(this) { // from class: f93
            public final /* synthetic */ InboundAuthActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object B(Object obj) {
                Object value3;
                q93 q93Var3;
                Object value4;
                q93 q93Var4;
                Object value5;
                q93 q93Var5;
                Object value6;
                q93 q93Var6;
                byte b6 = b2;
                byte b7 = 6;
                q51 q51Var2 = null;
                dn8 dn8Var = dn8.a;
                InboundAuthActivity inboundAuthActivity = this.Y;
                switch (b6) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        int i2 = InboundAuthActivity.T0;
                        inboundAuthActivity.B().j((InboundAuthMode) InboundAuthMode.b().get(iIntValue));
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        String str3 = (String) obj;
                        int i3 = InboundAuthActivity.T0;
                        str3.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).a.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB2 = inboundAuthActivity.B();
                            oh7 oh7Var2 = z93VarB2.e;
                            oh7Var2.getClass();
                            do {
                                value3 = oh7Var2.getValue();
                                q93Var3 = (q93) value3;
                                q93Var3.getClass();
                            } while (!oh7Var2.k(value3, q93.a(q93Var3, m93.a(q93Var3.a, null, null, str3, null, 11), false, null, 6)));
                            z93VarB2.e().q("pref_socks_auth_manual_user", str3);
                            jm4.Q(zw8.a(z93VarB2), (u61) null, new v93(z93VarB2, q51Var2, (byte) 10), 3);
                        }
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        String str4 = (String) obj;
                        int i4 = InboundAuthActivity.T0;
                        str4.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).a.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB3 = inboundAuthActivity.B();
                            oh7 oh7Var3 = z93VarB3.e;
                            oh7Var3.getClass();
                            do {
                                value4 = oh7Var3.getValue();
                                q93Var4 = (q93) value4;
                                q93Var4.getClass();
                            } while (!oh7Var3.k(value4, q93.a(q93Var4, m93.a(q93Var4.a, null, null, null, str4, 7), false, null, 6)));
                            z93VarB3.e().q("pref_socks_auth_manual_pass", str4);
                            jm4.Q(zw8.a(z93VarB3), (u61) null, new v93(z93VarB3, q51Var2, (byte) 8), 3);
                        }
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i5 = InboundAuthActivity.T0;
                        inboundAuthActivity.B().h(zBooleanValue);
                        break;
                    case 4:
                        int iIntValue2 = ((Integer) obj).intValue();
                        int i6 = InboundAuthActivity.T0;
                        inboundAuthActivity.B().i((InboundAuthMode) InboundAuthMode.b().get(iIntValue2));
                        break;
                    case 5:
                        String str5 = (String) obj;
                        int i7 = InboundAuthActivity.T0;
                        str5.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).c.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB4 = inboundAuthActivity.B();
                            oh7 oh7Var4 = z93VarB4.e;
                            oh7Var4.getClass();
                            do {
                                value5 = oh7Var4.getValue();
                                q93Var5 = (q93) value5;
                                q93Var5.getClass();
                            } while (!oh7Var4.k(value5, q93.a(q93Var5, null, false, m93.a(q93Var5.c, null, null, str5, null, 11), 3)));
                            z93VarB4.e().q("pref_http_auth_manual_user", str5);
                            jm4.Q(zw8.a(z93VarB4), (u61) null, new v93(z93VarB4, q51Var2, b7), 3);
                        }
                        break;
                    default:
                        String str6 = (String) obj;
                        int i8 = InboundAuthActivity.T0;
                        str6.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).c.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB5 = inboundAuthActivity.B();
                            oh7 oh7Var5 = z93VarB5.e;
                            oh7Var5.getClass();
                            do {
                                value6 = oh7Var5.getValue();
                                q93Var6 = (q93) value6;
                                q93Var6.getClass();
                            } while (!oh7Var5.k(value6, q93.a(q93Var6, null, false, m93.a(q93Var6.c, null, null, null, str6, 7), 3)));
                            z93VarB5.e().q("pref_http_auth_manual_pass", str6);
                            jm4.Q(zw8.a(z93VarB5), (u61) null, new v93(z93VarB5, q51Var2, (byte) 4), 3);
                        }
                        break;
                }
                return dn8Var;
            }
        });
        z5 z5Var8 = this.Q0;
        if (z5Var8 == null) {
            dh3.T("binding");
            throw null;
        }
        z5Var8.q0.a(new gn2(this) { // from class: f93
            public final /* synthetic */ InboundAuthActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object B(Object obj) {
                Object value3;
                q93 q93Var3;
                Object value4;
                q93 q93Var4;
                Object value5;
                q93 q93Var5;
                Object value6;
                q93 q93Var6;
                byte b6 = b3;
                byte b7 = 6;
                q51 q51Var2 = null;
                dn8 dn8Var = dn8.a;
                InboundAuthActivity inboundAuthActivity = this.Y;
                switch (b6) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        int i2 = InboundAuthActivity.T0;
                        inboundAuthActivity.B().j((InboundAuthMode) InboundAuthMode.b().get(iIntValue));
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        String str3 = (String) obj;
                        int i3 = InboundAuthActivity.T0;
                        str3.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).a.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB2 = inboundAuthActivity.B();
                            oh7 oh7Var2 = z93VarB2.e;
                            oh7Var2.getClass();
                            do {
                                value3 = oh7Var2.getValue();
                                q93Var3 = (q93) value3;
                                q93Var3.getClass();
                            } while (!oh7Var2.k(value3, q93.a(q93Var3, m93.a(q93Var3.a, null, null, str3, null, 11), false, null, 6)));
                            z93VarB2.e().q("pref_socks_auth_manual_user", str3);
                            jm4.Q(zw8.a(z93VarB2), (u61) null, new v93(z93VarB2, q51Var2, (byte) 10), 3);
                        }
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        String str4 = (String) obj;
                        int i4 = InboundAuthActivity.T0;
                        str4.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).a.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB3 = inboundAuthActivity.B();
                            oh7 oh7Var3 = z93VarB3.e;
                            oh7Var3.getClass();
                            do {
                                value4 = oh7Var3.getValue();
                                q93Var4 = (q93) value4;
                                q93Var4.getClass();
                            } while (!oh7Var3.k(value4, q93.a(q93Var4, m93.a(q93Var4.a, null, null, null, str4, 7), false, null, 6)));
                            z93VarB3.e().q("pref_socks_auth_manual_pass", str4);
                            jm4.Q(zw8.a(z93VarB3), (u61) null, new v93(z93VarB3, q51Var2, (byte) 8), 3);
                        }
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i5 = InboundAuthActivity.T0;
                        inboundAuthActivity.B().h(zBooleanValue);
                        break;
                    case 4:
                        int iIntValue2 = ((Integer) obj).intValue();
                        int i6 = InboundAuthActivity.T0;
                        inboundAuthActivity.B().i((InboundAuthMode) InboundAuthMode.b().get(iIntValue2));
                        break;
                    case 5:
                        String str5 = (String) obj;
                        int i7 = InboundAuthActivity.T0;
                        str5.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).c.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB4 = inboundAuthActivity.B();
                            oh7 oh7Var4 = z93VarB4.e;
                            oh7Var4.getClass();
                            do {
                                value5 = oh7Var4.getValue();
                                q93Var5 = (q93) value5;
                                q93Var5.getClass();
                            } while (!oh7Var4.k(value5, q93.a(q93Var5, null, false, m93.a(q93Var5.c, null, null, str5, null, 11), 3)));
                            z93VarB4.e().q("pref_http_auth_manual_user", str5);
                            jm4.Q(zw8.a(z93VarB4), (u61) null, new v93(z93VarB4, q51Var2, b7), 3);
                        }
                        break;
                    default:
                        String str6 = (String) obj;
                        int i8 = InboundAuthActivity.T0;
                        str6.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).c.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB5 = inboundAuthActivity.B();
                            oh7 oh7Var5 = z93VarB5.e;
                            oh7Var5.getClass();
                            do {
                                value6 = oh7Var5.getValue();
                                q93Var6 = (q93) value6;
                                q93Var6.getClass();
                            } while (!oh7Var5.k(value6, q93.a(q93Var6, null, false, m93.a(q93Var6.c, null, null, null, str6, 7), 3)));
                            z93VarB5.e().q("pref_http_auth_manual_pass", str6);
                            jm4.Q(zw8.a(z93VarB5), (u61) null, new v93(z93VarB5, q51Var2, (byte) 4), 3);
                        }
                        break;
                }
                return dn8Var;
            }
        });
        z5 z5Var9 = this.Q0;
        if (z5Var9 == null) {
            dh3.T("binding");
            throw null;
        }
        z5Var9.z0.setOnToggleClickListener(new gn2(this) { // from class: f93
            public final /* synthetic */ InboundAuthActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object B(Object obj) {
                Object value3;
                q93 q93Var3;
                Object value4;
                q93 q93Var4;
                Object value5;
                q93 q93Var5;
                Object value6;
                q93 q93Var6;
                byte b6 = b4;
                byte b7 = 6;
                q51 q51Var2 = null;
                dn8 dn8Var = dn8.a;
                InboundAuthActivity inboundAuthActivity = this.Y;
                switch (b6) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        int i2 = InboundAuthActivity.T0;
                        inboundAuthActivity.B().j((InboundAuthMode) InboundAuthMode.b().get(iIntValue));
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        String str3 = (String) obj;
                        int i3 = InboundAuthActivity.T0;
                        str3.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).a.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB2 = inboundAuthActivity.B();
                            oh7 oh7Var2 = z93VarB2.e;
                            oh7Var2.getClass();
                            do {
                                value3 = oh7Var2.getValue();
                                q93Var3 = (q93) value3;
                                q93Var3.getClass();
                            } while (!oh7Var2.k(value3, q93.a(q93Var3, m93.a(q93Var3.a, null, null, str3, null, 11), false, null, 6)));
                            z93VarB2.e().q("pref_socks_auth_manual_user", str3);
                            jm4.Q(zw8.a(z93VarB2), (u61) null, new v93(z93VarB2, q51Var2, (byte) 10), 3);
                        }
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        String str4 = (String) obj;
                        int i4 = InboundAuthActivity.T0;
                        str4.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).a.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB3 = inboundAuthActivity.B();
                            oh7 oh7Var3 = z93VarB3.e;
                            oh7Var3.getClass();
                            do {
                                value4 = oh7Var3.getValue();
                                q93Var4 = (q93) value4;
                                q93Var4.getClass();
                            } while (!oh7Var3.k(value4, q93.a(q93Var4, m93.a(q93Var4.a, null, null, null, str4, 7), false, null, 6)));
                            z93VarB3.e().q("pref_socks_auth_manual_pass", str4);
                            jm4.Q(zw8.a(z93VarB3), (u61) null, new v93(z93VarB3, q51Var2, (byte) 8), 3);
                        }
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i5 = InboundAuthActivity.T0;
                        inboundAuthActivity.B().h(zBooleanValue);
                        break;
                    case 4:
                        int iIntValue2 = ((Integer) obj).intValue();
                        int i6 = InboundAuthActivity.T0;
                        inboundAuthActivity.B().i((InboundAuthMode) InboundAuthMode.b().get(iIntValue2));
                        break;
                    case 5:
                        String str5 = (String) obj;
                        int i7 = InboundAuthActivity.T0;
                        str5.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).c.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB4 = inboundAuthActivity.B();
                            oh7 oh7Var4 = z93VarB4.e;
                            oh7Var4.getClass();
                            do {
                                value5 = oh7Var4.getValue();
                                q93Var5 = (q93) value5;
                                q93Var5.getClass();
                            } while (!oh7Var4.k(value5, q93.a(q93Var5, null, false, m93.a(q93Var5.c, null, null, str5, null, 11), 3)));
                            z93VarB4.e().q("pref_http_auth_manual_user", str5);
                            jm4.Q(zw8.a(z93VarB4), (u61) null, new v93(z93VarB4, q51Var2, b7), 3);
                        }
                        break;
                    default:
                        String str6 = (String) obj;
                        int i8 = InboundAuthActivity.T0;
                        str6.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).c.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB5 = inboundAuthActivity.B();
                            oh7 oh7Var5 = z93VarB5.e;
                            oh7Var5.getClass();
                            do {
                                value6 = oh7Var5.getValue();
                                q93Var6 = (q93) value6;
                                q93Var6.getClass();
                            } while (!oh7Var5.k(value6, q93.a(q93Var6, null, false, m93.a(q93Var6.c, null, null, null, str6, 7), 3)));
                            z93VarB5.e().q("pref_http_auth_manual_pass", str6);
                            jm4.Q(zw8.a(z93VarB5), (u61) null, new v93(z93VarB5, q51Var2, (byte) 4), 3);
                        }
                        break;
                }
                return dn8Var;
            }
        });
        z5 z5Var10 = this.Q0;
        if (z5Var10 == null) {
            dh3.T("binding");
            throw null;
        }
        z5Var10.o0.a(new d0(1, B(), z93.class, "updateHttpPort", "updateHttpPort(Ljava/lang/String;)V", 0, (byte) 14));
        z5 z5Var11 = this.Q0;
        if (z5Var11 == null) {
            dh3.T("binding");
            throw null;
        }
        HappSpinnerField happSpinnerField2 = z5Var11.x0;
        happSpinnerField2.getClass();
        z5 z5Var12 = this.Q0;
        if (z5Var12 == null) {
            dh3.T("binding");
            throw null;
        }
        View view3 = ((kw8) z5Var12).Z;
        view3.getClass();
        final byte b6 = 4;
        i21.O(happSpinnerField2, view3, new gn2(this) { // from class: f93
            public final /* synthetic */ InboundAuthActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object B(Object obj) {
                Object value3;
                q93 q93Var3;
                Object value4;
                q93 q93Var4;
                Object value5;
                q93 q93Var5;
                Object value6;
                q93 q93Var6;
                byte b7 = b6;
                byte b8 = 6;
                q51 q51Var2 = null;
                dn8 dn8Var = dn8.a;
                InboundAuthActivity inboundAuthActivity = this.Y;
                switch (b7) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        int i2 = InboundAuthActivity.T0;
                        inboundAuthActivity.B().j((InboundAuthMode) InboundAuthMode.b().get(iIntValue));
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        String str3 = (String) obj;
                        int i3 = InboundAuthActivity.T0;
                        str3.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).a.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB2 = inboundAuthActivity.B();
                            oh7 oh7Var2 = z93VarB2.e;
                            oh7Var2.getClass();
                            do {
                                value3 = oh7Var2.getValue();
                                q93Var3 = (q93) value3;
                                q93Var3.getClass();
                            } while (!oh7Var2.k(value3, q93.a(q93Var3, m93.a(q93Var3.a, null, null, str3, null, 11), false, null, 6)));
                            z93VarB2.e().q("pref_socks_auth_manual_user", str3);
                            jm4.Q(zw8.a(z93VarB2), (u61) null, new v93(z93VarB2, q51Var2, (byte) 10), 3);
                        }
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        String str4 = (String) obj;
                        int i4 = InboundAuthActivity.T0;
                        str4.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).a.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB3 = inboundAuthActivity.B();
                            oh7 oh7Var3 = z93VarB3.e;
                            oh7Var3.getClass();
                            do {
                                value4 = oh7Var3.getValue();
                                q93Var4 = (q93) value4;
                                q93Var4.getClass();
                            } while (!oh7Var3.k(value4, q93.a(q93Var4, m93.a(q93Var4.a, null, null, null, str4, 7), false, null, 6)));
                            z93VarB3.e().q("pref_socks_auth_manual_pass", str4);
                            jm4.Q(zw8.a(z93VarB3), (u61) null, new v93(z93VarB3, q51Var2, (byte) 8), 3);
                        }
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i5 = InboundAuthActivity.T0;
                        inboundAuthActivity.B().h(zBooleanValue);
                        break;
                    case 4:
                        int iIntValue2 = ((Integer) obj).intValue();
                        int i6 = InboundAuthActivity.T0;
                        inboundAuthActivity.B().i((InboundAuthMode) InboundAuthMode.b().get(iIntValue2));
                        break;
                    case 5:
                        String str5 = (String) obj;
                        int i7 = InboundAuthActivity.T0;
                        str5.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).c.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB4 = inboundAuthActivity.B();
                            oh7 oh7Var4 = z93VarB4.e;
                            oh7Var4.getClass();
                            do {
                                value5 = oh7Var4.getValue();
                                q93Var5 = (q93) value5;
                                q93Var5.getClass();
                            } while (!oh7Var4.k(value5, q93.a(q93Var5, null, false, m93.a(q93Var5.c, null, null, str5, null, 11), 3)));
                            z93VarB4.e().q("pref_http_auth_manual_user", str5);
                            jm4.Q(zw8.a(z93VarB4), (u61) null, new v93(z93VarB4, q51Var2, b8), 3);
                        }
                        break;
                    default:
                        String str6 = (String) obj;
                        int i8 = InboundAuthActivity.T0;
                        str6.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).c.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB5 = inboundAuthActivity.B();
                            oh7 oh7Var5 = z93VarB5.e;
                            oh7Var5.getClass();
                            do {
                                value6 = oh7Var5.getValue();
                                q93Var6 = (q93) value6;
                                q93Var6.getClass();
                            } while (!oh7Var5.k(value6, q93.a(q93Var6, null, false, m93.a(q93Var6.c, null, null, null, str6, 7), 3)));
                            z93VarB5.e().q("pref_http_auth_manual_pass", str6);
                            jm4.Q(zw8.a(z93VarB5), (u61) null, new v93(z93VarB5, q51Var2, (byte) 4), 3);
                        }
                        break;
                }
                return dn8Var;
            }
        });
        z5 z5Var13 = this.Q0;
        if (z5Var13 == null) {
            dh3.T("binding");
            throw null;
        }
        final byte b7 = 5;
        z5Var13.p0.a(new gn2(this) { // from class: f93
            public final /* synthetic */ InboundAuthActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object B(Object obj) {
                Object value3;
                q93 q93Var3;
                Object value4;
                q93 q93Var4;
                Object value5;
                q93 q93Var5;
                Object value6;
                q93 q93Var6;
                byte b8 = b7;
                byte b9 = 6;
                q51 q51Var2 = null;
                dn8 dn8Var = dn8.a;
                InboundAuthActivity inboundAuthActivity = this.Y;
                switch (b8) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        int i2 = InboundAuthActivity.T0;
                        inboundAuthActivity.B().j((InboundAuthMode) InboundAuthMode.b().get(iIntValue));
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        String str3 = (String) obj;
                        int i3 = InboundAuthActivity.T0;
                        str3.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).a.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB2 = inboundAuthActivity.B();
                            oh7 oh7Var2 = z93VarB2.e;
                            oh7Var2.getClass();
                            do {
                                value3 = oh7Var2.getValue();
                                q93Var3 = (q93) value3;
                                q93Var3.getClass();
                            } while (!oh7Var2.k(value3, q93.a(q93Var3, m93.a(q93Var3.a, null, null, str3, null, 11), false, null, 6)));
                            z93VarB2.e().q("pref_socks_auth_manual_user", str3);
                            jm4.Q(zw8.a(z93VarB2), (u61) null, new v93(z93VarB2, q51Var2, (byte) 10), 3);
                        }
                        break;
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        String str4 = (String) obj;
                        int i4 = InboundAuthActivity.T0;
                        str4.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).a.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB3 = inboundAuthActivity.B();
                            oh7 oh7Var3 = z93VarB3.e;
                            oh7Var3.getClass();
                            do {
                                value4 = oh7Var3.getValue();
                                q93Var4 = (q93) value4;
                                q93Var4.getClass();
                            } while (!oh7Var3.k(value4, q93.a(q93Var4, m93.a(q93Var4.a, null, null, null, str4, 7), false, null, 6)));
                            z93VarB3.e().q("pref_socks_auth_manual_pass", str4);
                            jm4.Q(zw8.a(z93VarB3), (u61) null, new v93(z93VarB3, q51Var2, (byte) 8), 3);
                        }
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i5 = InboundAuthActivity.T0;
                        inboundAuthActivity.B().h(zBooleanValue);
                        break;
                    case 4:
                        int iIntValue2 = ((Integer) obj).intValue();
                        int i6 = InboundAuthActivity.T0;
                        inboundAuthActivity.B().i((InboundAuthMode) InboundAuthMode.b().get(iIntValue2));
                        break;
                    case 5:
                        String str5 = (String) obj;
                        int i7 = InboundAuthActivity.T0;
                        str5.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).c.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB4 = inboundAuthActivity.B();
                            oh7 oh7Var4 = z93VarB4.e;
                            oh7Var4.getClass();
                            do {
                                value5 = oh7Var4.getValue();
                                q93Var5 = (q93) value5;
                                q93Var5.getClass();
                            } while (!oh7Var4.k(value5, q93.a(q93Var5, null, false, m93.a(q93Var5.c, null, null, str5, null, 11), 3)));
                            z93VarB4.e().q("pref_http_auth_manual_user", str5);
                            jm4.Q(zw8.a(z93VarB4), (u61) null, new v93(z93VarB4, q51Var2, b9), 3);
                        }
                        break;
                    default:
                        String str6 = (String) obj;
                        int i8 = InboundAuthActivity.T0;
                        str6.getClass();
                        if (((q93) inboundAuthActivity.B().f.X.getValue()).c.b == InboundAuthMode.MANUAL) {
                            z93 z93VarB5 = inboundAuthActivity.B();
                            oh7 oh7Var5 = z93VarB5.e;
                            oh7Var5.getClass();
                            do {
                                value6 = oh7Var5.getValue();
                                q93Var6 = (q93) value6;
                                q93Var6.getClass();
                            } while (!oh7Var5.k(value6, q93.a(q93Var6, null, false, m93.a(q93Var6.c, null, null, null, str6, 7), 3)));
                            z93VarB5.e().q("pref_http_auth_manual_pass", str6);
                            jm4.Q(zw8.a(z93VarB5), (u61) null, new v93(z93VarB5, q51Var2, (byte) 4), 3);
                        }
                        break;
                }
                return dn8Var;
            }
        });
        z5 z5Var14 = this.Q0;
        if (z5Var14 != null) {
            z5Var14.n0.a(new gn2(this) { // from class: f93
                public final /* synthetic */ InboundAuthActivity Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object B(Object obj) {
                    Object value3;
                    q93 q93Var3;
                    Object value4;
                    q93 q93Var4;
                    Object value5;
                    q93 q93Var5;
                    Object value6;
                    q93 q93Var6;
                    byte b8 = b;
                    byte b9 = 6;
                    q51 q51Var2 = null;
                    dn8 dn8Var = dn8.a;
                    InboundAuthActivity inboundAuthActivity = this.Y;
                    switch (b8) {
                        case 0:
                            int iIntValue = ((Integer) obj).intValue();
                            int i2 = InboundAuthActivity.T0;
                            inboundAuthActivity.B().j((InboundAuthMode) InboundAuthMode.b().get(iIntValue));
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                            String str3 = (String) obj;
                            int i3 = InboundAuthActivity.T0;
                            str3.getClass();
                            if (((q93) inboundAuthActivity.B().f.X.getValue()).a.b == InboundAuthMode.MANUAL) {
                                z93 z93VarB2 = inboundAuthActivity.B();
                                oh7 oh7Var2 = z93VarB2.e;
                                oh7Var2.getClass();
                                do {
                                    value3 = oh7Var2.getValue();
                                    q93Var3 = (q93) value3;
                                    q93Var3.getClass();
                                } while (!oh7Var2.k(value3, q93.a(q93Var3, m93.a(q93Var3.a, null, null, str3, null, 11), false, null, 6)));
                                z93VarB2.e().q("pref_socks_auth_manual_user", str3);
                                jm4.Q(zw8.a(z93VarB2), (u61) null, new v93(z93VarB2, q51Var2, (byte) 10), 3);
                            }
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                            String str4 = (String) obj;
                            int i4 = InboundAuthActivity.T0;
                            str4.getClass();
                            if (((q93) inboundAuthActivity.B().f.X.getValue()).a.b == InboundAuthMode.MANUAL) {
                                z93 z93VarB3 = inboundAuthActivity.B();
                                oh7 oh7Var3 = z93VarB3.e;
                                oh7Var3.getClass();
                                do {
                                    value4 = oh7Var3.getValue();
                                    q93Var4 = (q93) value4;
                                    q93Var4.getClass();
                                } while (!oh7Var3.k(value4, q93.a(q93Var4, m93.a(q93Var4.a, null, null, null, str4, 7), false, null, 6)));
                                z93VarB3.e().q("pref_socks_auth_manual_pass", str4);
                                jm4.Q(zw8.a(z93VarB3), (u61) null, new v93(z93VarB3, q51Var2, (byte) 8), 3);
                            }
                            break;
                        case 3:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            int i5 = InboundAuthActivity.T0;
                            inboundAuthActivity.B().h(zBooleanValue);
                            break;
                        case 4:
                            int iIntValue2 = ((Integer) obj).intValue();
                            int i6 = InboundAuthActivity.T0;
                            inboundAuthActivity.B().i((InboundAuthMode) InboundAuthMode.b().get(iIntValue2));
                            break;
                        case 5:
                            String str5 = (String) obj;
                            int i7 = InboundAuthActivity.T0;
                            str5.getClass();
                            if (((q93) inboundAuthActivity.B().f.X.getValue()).c.b == InboundAuthMode.MANUAL) {
                                z93 z93VarB4 = inboundAuthActivity.B();
                                oh7 oh7Var4 = z93VarB4.e;
                                oh7Var4.getClass();
                                do {
                                    value5 = oh7Var4.getValue();
                                    q93Var5 = (q93) value5;
                                    q93Var5.getClass();
                                } while (!oh7Var4.k(value5, q93.a(q93Var5, null, false, m93.a(q93Var5.c, null, null, str5, null, 11), 3)));
                                z93VarB4.e().q("pref_http_auth_manual_user", str5);
                                jm4.Q(zw8.a(z93VarB4), (u61) null, new v93(z93VarB4, q51Var2, b9), 3);
                            }
                            break;
                        default:
                            String str6 = (String) obj;
                            int i8 = InboundAuthActivity.T0;
                            str6.getClass();
                            if (((q93) inboundAuthActivity.B().f.X.getValue()).c.b == InboundAuthMode.MANUAL) {
                                z93 z93VarB5 = inboundAuthActivity.B();
                                oh7 oh7Var5 = z93VarB5.e;
                                oh7Var5.getClass();
                                do {
                                    value6 = oh7Var5.getValue();
                                    q93Var6 = (q93) value6;
                                    q93Var6.getClass();
                                } while (!oh7Var5.k(value6, q93.a(q93Var6, null, false, m93.a(q93Var6.c, null, null, null, str6, 7), 3)));
                                z93VarB5.e().q("pref_http_auth_manual_pass", str6);
                                jm4.Q(zw8.a(z93VarB5), (u61) null, new v93(z93VarB5, q51Var2, (byte) 4), 3);
                            }
                            break;
                    }
                    return dn8Var;
                }
            });
        } else {
            dh3.T("binding");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Toolbar v() {
        z5 z5Var = this.Q0;
        if (z5Var == null) {
            dh3.T("binding");
            throw null;
        }
        Toolbar toolbar = z5Var.A0;
        toolbar.getClass();
        return toolbar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean x() {
        l93 l93Var = (l93) this.S0.getValue();
        HappSpinnerField happSpinnerField = l93Var.X.y0;
        happSpinnerField.getClass();
        return l93Var.a(happSpinnerField);
    }
}
