package su.happ.proxyutility.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.a;
import com.tencent.mmkv.MMKV;
import defpackage.a47;
import defpackage.b47;
import defpackage.c47;
import defpackage.cb8;
import defpackage.e46;
import defpackage.kw4;
import defpackage.ln7;
import defpackage.na2;
import defpackage.ob4;
import defpackage.rf7;
import defpackage.ry2;
import defpackage.ss8;
import defpackage.t46;
import defpackage.ud3;
import defpackage.v46;
import defpackage.wl7;
import defpackage.x37;
import defpackage.x79;
import defpackage.y46;
import defpackage.z37;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import kotlin.Metadata;
import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EConfigNetworkType;
import su.happ.proxyutility.dto.enums.EConfigType;
import su.happ.proxyutility.feature.custom_config.ServerCustomConfigActivity;
import su.happ.proxyutility.ui.ServerActivity;
import su.happ.proxyutility.ui.foundation.component.HappInputField;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDivider;
import su.happ.proxyutility.ui.widget.CustomSpinner;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/ui/ServerActivity;", "Lsu/happ/proxyutility/ui/BaseActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class ServerActivity extends BaseActivity {
    public static final /* synthetic */ int c3 = 0;
    public HappSettingsDivider A1;
    public HappInputField A2;
    public ConstraintLayout B1;
    public HappSettingsDivider B2;
    public EditText C1;
    public HappInputField C2;
    public HappSettingsDivider D1;
    public HappSettingsDivider D2;
    public ConstraintLayout E1;
    public ConstraintLayout E2;
    public EditText F1;
    public EditText F2;
    public HappSettingsDivider G1;
    public ConstraintLayout G2;
    public ConstraintLayout H1;
    public EditText H2;
    public EditText I1;
    public ConstraintLayout I2;
    public ConstraintLayout J1;
    public EditText J2;
    public EditText K1;
    public ConstraintLayout K2;
    public CustomSpinner L1;
    public EditText L2;
    public ConstraintLayout M1;
    public LinearLayout M2;
    public CustomSpinner N1;
    public EditText N2;
    public ConstraintLayout O1;
    public EditText O2;
    public CustomSpinner P1;
    public EditText P2;
    public y5 Q0;
    public ConstraintLayout Q1;
    public ConstraintLayout Q2;
    public EditText R1;
    public EditText R2;
    public ConstraintLayout S1;
    public ConstraintLayout S2;
    public final vz7 T0;
    public CustomSpinner T1;
    public EditText T2;
    public ConstraintLayout U1;
    public ConstraintLayout U2;
    public CustomSpinner V1;
    public EditText V2;
    public ConstraintLayout W1;
    public ConstraintLayout W2;
    public final vz7 X0;
    public CustomSpinner X1;
    public EditText X2;
    public final vz7 Y0;
    public TextView Y1;
    public LinearLayout Y2;
    public final vz7 Z0;
    public HappSettingsDivider Z1;
    public View Z2;
    public final vz7 a1;
    public ConstraintLayout a2;
    public EditText a3;
    public final vz7 b1;
    public TextView b2;
    public ConstraintLayout b3;
    public final vz7 c1;
    public EditText c2;
    public final vz7 d1;
    public HappSettingsDivider d2;
    public final vz7 e1;
    public ConstraintLayout e2;
    public final vz7 f1;
    public TextView f2;
    public final vz7 g1;
    public EditText g2;
    public final vz7 h1;
    public HappSettingsDivider h2;
    public final vz7 i1;
    public HappInputField i2;
    public final vz7 j1;
    public HappSettingsDivider j2;
    public ConstraintLayout k1;
    public HappInputField k2;
    public EditText l1;
    public HappSettingsDivider l2;
    public ConstraintLayout m1;
    public HappInputField m2;
    public EditText n1;
    public HappSettingsDivider n2;
    public ConstraintLayout o1;
    public HappInputField o2;
    public EditText p1;
    public HappSettingsDivider p2;
    public ConstraintLayout q1;
    public LinearLayout q2;
    public EditText r1;
    public EditText r2;
    public ConstraintLayout s1;
    public ConstraintLayout s2;
    public EditText t1;
    public EditText t2;
    public HappSettingsDivider u1;
    public ConstraintLayout u2;
    public ConstraintLayout v1;
    public EditText v2;
    public EditText w1;
    public ConstraintLayout w2;
    public HappSettingsDivider x1;
    public CustomSpinner x2;
    public ConstraintLayout y1;
    public ConstraintLayout y2;
    public EditText z1;
    public EditText z2;
    public final vz7 R0 = new vz7(new w76((byte) 29));
    public final vz7 S0 = new vz7(new a47(this, (byte) 0));
    public EConfigType U0 = EConfigType.VLESS;
    public String V0 = "";
    public final vz7 W0 = new vz7(new a47(this, (byte) 1));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ServerActivity() {
        final byte b = 10;
        this.T0 = new vz7(new dn2(this) { // from class: w37
            public final /* synthetic */ ServerActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, android.content.Context, su.happ.proxyutility.ui.ServerActivity] */
            public final Object invoke() {
                byte b2 = b;
                boolean z = false;
                ?? r4 = this.Y;
                switch (b2) {
                    case 0:
                        int i = ServerActivity.c3;
                        String[] stringArray = r4.getResources().getStringArray(m26.flows);
                        stringArray[0] = "";
                        return stringArray;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        int i2 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.networks);
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        int i3 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_tcp);
                    case 3:
                        int i4 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_kcp_and_quic);
                    case 4:
                        int i5 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.mode_type_grpc);
                    case 5:
                        int i6 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.xhttp_mode);
                    case 6:
                        int i7 = ServerActivity.c3;
                        String[] stringArray2 = r4.getResources().getStringArray(m26.streamsecurityxs);
                        stringArray2[0] = "";
                        return stringArray2;
                    case 7:
                        int i8 = ServerActivity.c3;
                        String[] stringArray3 = r4.getResources().getStringArray(m26.streamsecurityxs_hysteria);
                        stringArray3[0] = "";
                        return stringArray3;
                    case 8:
                        int i9 = ServerActivity.c3;
                        String[] stringArray4 = r4.getResources().getStringArray(m26.streamsecurity_utls);
                        stringArray4[0] = "";
                        return stringArray4;
                    case 9:
                        int i10 = ServerActivity.c3;
                        String[] stringArray5 = r4.getResources().getStringArray(m26.streamsecurity_alpn);
                        stringArray5[0] = "";
                        return stringArray5;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                        String strI = ((MMKV) r4.R0.getValue()).i("SELECTED_SERVER");
                        if (strI == null) {
                            strI = null;
                        }
                        if (r4.getIntent().getBooleanExtra("isRunning", false) && !fm7.o0(r4.C())) {
                            if (strI == null ? false : dh3.f(r4.C(), strI)) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        int i11 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.protocols);
                    case 12:
                        int i12 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.securitys);
                    default:
                        int i13 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.ss_securitys);
                }
            }
        });
        final byte b2 = 11;
        this.X0 = new vz7(new dn2(this) { // from class: w37
            public final /* synthetic */ ServerActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, android.content.Context, su.happ.proxyutility.ui.ServerActivity] */
            public final Object invoke() {
                byte b3 = b2;
                boolean z = false;
                ?? r4 = this.Y;
                switch (b3) {
                    case 0:
                        int i = ServerActivity.c3;
                        String[] stringArray = r4.getResources().getStringArray(m26.flows);
                        stringArray[0] = "";
                        return stringArray;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        int i2 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.networks);
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        int i3 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_tcp);
                    case 3:
                        int i4 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_kcp_and_quic);
                    case 4:
                        int i5 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.mode_type_grpc);
                    case 5:
                        int i6 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.xhttp_mode);
                    case 6:
                        int i7 = ServerActivity.c3;
                        String[] stringArray2 = r4.getResources().getStringArray(m26.streamsecurityxs);
                        stringArray2[0] = "";
                        return stringArray2;
                    case 7:
                        int i8 = ServerActivity.c3;
                        String[] stringArray3 = r4.getResources().getStringArray(m26.streamsecurityxs_hysteria);
                        stringArray3[0] = "";
                        return stringArray3;
                    case 8:
                        int i9 = ServerActivity.c3;
                        String[] stringArray4 = r4.getResources().getStringArray(m26.streamsecurity_utls);
                        stringArray4[0] = "";
                        return stringArray4;
                    case 9:
                        int i10 = ServerActivity.c3;
                        String[] stringArray5 = r4.getResources().getStringArray(m26.streamsecurity_alpn);
                        stringArray5[0] = "";
                        return stringArray5;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                        String strI = ((MMKV) r4.R0.getValue()).i("SELECTED_SERVER");
                        if (strI == null) {
                            strI = null;
                        }
                        if (r4.getIntent().getBooleanExtra("isRunning", false) && !fm7.o0(r4.C())) {
                            if (strI == null ? false : dh3.f(r4.C(), strI)) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        int i11 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.protocols);
                    case 12:
                        int i12 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.securitys);
                    default:
                        int i13 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.ss_securitys);
                }
            }
        });
        final byte b3 = 12;
        this.Y0 = new vz7(new dn2(this) { // from class: w37
            public final /* synthetic */ ServerActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, android.content.Context, su.happ.proxyutility.ui.ServerActivity] */
            public final Object invoke() {
                byte b4 = b3;
                boolean z = false;
                ?? r4 = this.Y;
                switch (b4) {
                    case 0:
                        int i = ServerActivity.c3;
                        String[] stringArray = r4.getResources().getStringArray(m26.flows);
                        stringArray[0] = "";
                        return stringArray;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        int i2 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.networks);
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        int i3 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_tcp);
                    case 3:
                        int i4 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_kcp_and_quic);
                    case 4:
                        int i5 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.mode_type_grpc);
                    case 5:
                        int i6 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.xhttp_mode);
                    case 6:
                        int i7 = ServerActivity.c3;
                        String[] stringArray2 = r4.getResources().getStringArray(m26.streamsecurityxs);
                        stringArray2[0] = "";
                        return stringArray2;
                    case 7:
                        int i8 = ServerActivity.c3;
                        String[] stringArray3 = r4.getResources().getStringArray(m26.streamsecurityxs_hysteria);
                        stringArray3[0] = "";
                        return stringArray3;
                    case 8:
                        int i9 = ServerActivity.c3;
                        String[] stringArray4 = r4.getResources().getStringArray(m26.streamsecurity_utls);
                        stringArray4[0] = "";
                        return stringArray4;
                    case 9:
                        int i10 = ServerActivity.c3;
                        String[] stringArray5 = r4.getResources().getStringArray(m26.streamsecurity_alpn);
                        stringArray5[0] = "";
                        return stringArray5;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                        String strI = ((MMKV) r4.R0.getValue()).i("SELECTED_SERVER");
                        if (strI == null) {
                            strI = null;
                        }
                        if (r4.getIntent().getBooleanExtra("isRunning", false) && !fm7.o0(r4.C())) {
                            if (strI == null ? false : dh3.f(r4.C(), strI)) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        int i11 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.protocols);
                    case 12:
                        int i12 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.securitys);
                    default:
                        int i13 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.ss_securitys);
                }
            }
        });
        final byte b4 = 13;
        this.Z0 = new vz7(new dn2(this) { // from class: w37
            public final /* synthetic */ ServerActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, android.content.Context, su.happ.proxyutility.ui.ServerActivity] */
            public final Object invoke() {
                byte b5 = b4;
                boolean z = false;
                ?? r4 = this.Y;
                switch (b5) {
                    case 0:
                        int i = ServerActivity.c3;
                        String[] stringArray = r4.getResources().getStringArray(m26.flows);
                        stringArray[0] = "";
                        return stringArray;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        int i2 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.networks);
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        int i3 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_tcp);
                    case 3:
                        int i4 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_kcp_and_quic);
                    case 4:
                        int i5 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.mode_type_grpc);
                    case 5:
                        int i6 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.xhttp_mode);
                    case 6:
                        int i7 = ServerActivity.c3;
                        String[] stringArray2 = r4.getResources().getStringArray(m26.streamsecurityxs);
                        stringArray2[0] = "";
                        return stringArray2;
                    case 7:
                        int i8 = ServerActivity.c3;
                        String[] stringArray3 = r4.getResources().getStringArray(m26.streamsecurityxs_hysteria);
                        stringArray3[0] = "";
                        return stringArray3;
                    case 8:
                        int i9 = ServerActivity.c3;
                        String[] stringArray4 = r4.getResources().getStringArray(m26.streamsecurity_utls);
                        stringArray4[0] = "";
                        return stringArray4;
                    case 9:
                        int i10 = ServerActivity.c3;
                        String[] stringArray5 = r4.getResources().getStringArray(m26.streamsecurity_alpn);
                        stringArray5[0] = "";
                        return stringArray5;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                        String strI = ((MMKV) r4.R0.getValue()).i("SELECTED_SERVER");
                        if (strI == null) {
                            strI = null;
                        }
                        if (r4.getIntent().getBooleanExtra("isRunning", false) && !fm7.o0(r4.C())) {
                            if (strI == null ? false : dh3.f(r4.C(), strI)) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        int i11 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.protocols);
                    case 12:
                        int i12 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.securitys);
                    default:
                        int i13 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.ss_securitys);
                }
            }
        });
        final byte b5 = 0;
        this.a1 = new vz7(new dn2(this) { // from class: w37
            public final /* synthetic */ ServerActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, android.content.Context, su.happ.proxyutility.ui.ServerActivity] */
            public final Object invoke() {
                byte b6 = b5;
                boolean z = false;
                ?? r4 = this.Y;
                switch (b6) {
                    case 0:
                        int i = ServerActivity.c3;
                        String[] stringArray = r4.getResources().getStringArray(m26.flows);
                        stringArray[0] = "";
                        return stringArray;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        int i2 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.networks);
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        int i3 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_tcp);
                    case 3:
                        int i4 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_kcp_and_quic);
                    case 4:
                        int i5 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.mode_type_grpc);
                    case 5:
                        int i6 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.xhttp_mode);
                    case 6:
                        int i7 = ServerActivity.c3;
                        String[] stringArray2 = r4.getResources().getStringArray(m26.streamsecurityxs);
                        stringArray2[0] = "";
                        return stringArray2;
                    case 7:
                        int i8 = ServerActivity.c3;
                        String[] stringArray3 = r4.getResources().getStringArray(m26.streamsecurityxs_hysteria);
                        stringArray3[0] = "";
                        return stringArray3;
                    case 8:
                        int i9 = ServerActivity.c3;
                        String[] stringArray4 = r4.getResources().getStringArray(m26.streamsecurity_utls);
                        stringArray4[0] = "";
                        return stringArray4;
                    case 9:
                        int i10 = ServerActivity.c3;
                        String[] stringArray5 = r4.getResources().getStringArray(m26.streamsecurity_alpn);
                        stringArray5[0] = "";
                        return stringArray5;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                        String strI = ((MMKV) r4.R0.getValue()).i("SELECTED_SERVER");
                        if (strI == null) {
                            strI = null;
                        }
                        if (r4.getIntent().getBooleanExtra("isRunning", false) && !fm7.o0(r4.C())) {
                            if (strI == null ? false : dh3.f(r4.C(), strI)) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        int i11 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.protocols);
                    case 12:
                        int i12 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.securitys);
                    default:
                        int i13 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.ss_securitys);
                }
            }
        });
        final byte b6 = 1;
        this.b1 = new vz7(new dn2(this) { // from class: w37
            public final /* synthetic */ ServerActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, android.content.Context, su.happ.proxyutility.ui.ServerActivity] */
            public final Object invoke() {
                byte b7 = b6;
                boolean z = false;
                ?? r4 = this.Y;
                switch (b7) {
                    case 0:
                        int i = ServerActivity.c3;
                        String[] stringArray = r4.getResources().getStringArray(m26.flows);
                        stringArray[0] = "";
                        return stringArray;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        int i2 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.networks);
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        int i3 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_tcp);
                    case 3:
                        int i4 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_kcp_and_quic);
                    case 4:
                        int i5 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.mode_type_grpc);
                    case 5:
                        int i6 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.xhttp_mode);
                    case 6:
                        int i7 = ServerActivity.c3;
                        String[] stringArray2 = r4.getResources().getStringArray(m26.streamsecurityxs);
                        stringArray2[0] = "";
                        return stringArray2;
                    case 7:
                        int i8 = ServerActivity.c3;
                        String[] stringArray3 = r4.getResources().getStringArray(m26.streamsecurityxs_hysteria);
                        stringArray3[0] = "";
                        return stringArray3;
                    case 8:
                        int i9 = ServerActivity.c3;
                        String[] stringArray4 = r4.getResources().getStringArray(m26.streamsecurity_utls);
                        stringArray4[0] = "";
                        return stringArray4;
                    case 9:
                        int i10 = ServerActivity.c3;
                        String[] stringArray5 = r4.getResources().getStringArray(m26.streamsecurity_alpn);
                        stringArray5[0] = "";
                        return stringArray5;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                        String strI = ((MMKV) r4.R0.getValue()).i("SELECTED_SERVER");
                        if (strI == null) {
                            strI = null;
                        }
                        if (r4.getIntent().getBooleanExtra("isRunning", false) && !fm7.o0(r4.C())) {
                            if (strI == null ? false : dh3.f(r4.C(), strI)) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        int i11 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.protocols);
                    case 12:
                        int i12 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.securitys);
                    default:
                        int i13 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.ss_securitys);
                }
            }
        });
        final byte b7 = 2;
        this.c1 = new vz7(new dn2(this) { // from class: w37
            public final /* synthetic */ ServerActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, android.content.Context, su.happ.proxyutility.ui.ServerActivity] */
            public final Object invoke() {
                byte b8 = b7;
                boolean z = false;
                ?? r4 = this.Y;
                switch (b8) {
                    case 0:
                        int i = ServerActivity.c3;
                        String[] stringArray = r4.getResources().getStringArray(m26.flows);
                        stringArray[0] = "";
                        return stringArray;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        int i2 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.networks);
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        int i3 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_tcp);
                    case 3:
                        int i4 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_kcp_and_quic);
                    case 4:
                        int i5 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.mode_type_grpc);
                    case 5:
                        int i6 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.xhttp_mode);
                    case 6:
                        int i7 = ServerActivity.c3;
                        String[] stringArray2 = r4.getResources().getStringArray(m26.streamsecurityxs);
                        stringArray2[0] = "";
                        return stringArray2;
                    case 7:
                        int i8 = ServerActivity.c3;
                        String[] stringArray3 = r4.getResources().getStringArray(m26.streamsecurityxs_hysteria);
                        stringArray3[0] = "";
                        return stringArray3;
                    case 8:
                        int i9 = ServerActivity.c3;
                        String[] stringArray4 = r4.getResources().getStringArray(m26.streamsecurity_utls);
                        stringArray4[0] = "";
                        return stringArray4;
                    case 9:
                        int i10 = ServerActivity.c3;
                        String[] stringArray5 = r4.getResources().getStringArray(m26.streamsecurity_alpn);
                        stringArray5[0] = "";
                        return stringArray5;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                        String strI = ((MMKV) r4.R0.getValue()).i("SELECTED_SERVER");
                        if (strI == null) {
                            strI = null;
                        }
                        if (r4.getIntent().getBooleanExtra("isRunning", false) && !fm7.o0(r4.C())) {
                            if (strI == null ? false : dh3.f(r4.C(), strI)) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        int i11 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.protocols);
                    case 12:
                        int i12 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.securitys);
                    default:
                        int i13 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.ss_securitys);
                }
            }
        });
        final byte b8 = 3;
        this.d1 = new vz7(new dn2(this) { // from class: w37
            public final /* synthetic */ ServerActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, android.content.Context, su.happ.proxyutility.ui.ServerActivity] */
            public final Object invoke() {
                byte b9 = b8;
                boolean z = false;
                ?? r4 = this.Y;
                switch (b9) {
                    case 0:
                        int i = ServerActivity.c3;
                        String[] stringArray = r4.getResources().getStringArray(m26.flows);
                        stringArray[0] = "";
                        return stringArray;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        int i2 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.networks);
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        int i3 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_tcp);
                    case 3:
                        int i4 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_kcp_and_quic);
                    case 4:
                        int i5 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.mode_type_grpc);
                    case 5:
                        int i6 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.xhttp_mode);
                    case 6:
                        int i7 = ServerActivity.c3;
                        String[] stringArray2 = r4.getResources().getStringArray(m26.streamsecurityxs);
                        stringArray2[0] = "";
                        return stringArray2;
                    case 7:
                        int i8 = ServerActivity.c3;
                        String[] stringArray3 = r4.getResources().getStringArray(m26.streamsecurityxs_hysteria);
                        stringArray3[0] = "";
                        return stringArray3;
                    case 8:
                        int i9 = ServerActivity.c3;
                        String[] stringArray4 = r4.getResources().getStringArray(m26.streamsecurity_utls);
                        stringArray4[0] = "";
                        return stringArray4;
                    case 9:
                        int i10 = ServerActivity.c3;
                        String[] stringArray5 = r4.getResources().getStringArray(m26.streamsecurity_alpn);
                        stringArray5[0] = "";
                        return stringArray5;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                        String strI = ((MMKV) r4.R0.getValue()).i("SELECTED_SERVER");
                        if (strI == null) {
                            strI = null;
                        }
                        if (r4.getIntent().getBooleanExtra("isRunning", false) && !fm7.o0(r4.C())) {
                            if (strI == null ? false : dh3.f(r4.C(), strI)) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        int i11 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.protocols);
                    case 12:
                        int i12 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.securitys);
                    default:
                        int i13 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.ss_securitys);
                }
            }
        });
        final byte b9 = 4;
        this.e1 = new vz7(new dn2(this) { // from class: w37
            public final /* synthetic */ ServerActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, android.content.Context, su.happ.proxyutility.ui.ServerActivity] */
            public final Object invoke() {
                byte b10 = b9;
                boolean z = false;
                ?? r4 = this.Y;
                switch (b10) {
                    case 0:
                        int i = ServerActivity.c3;
                        String[] stringArray = r4.getResources().getStringArray(m26.flows);
                        stringArray[0] = "";
                        return stringArray;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        int i2 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.networks);
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        int i3 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_tcp);
                    case 3:
                        int i4 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_kcp_and_quic);
                    case 4:
                        int i5 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.mode_type_grpc);
                    case 5:
                        int i6 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.xhttp_mode);
                    case 6:
                        int i7 = ServerActivity.c3;
                        String[] stringArray2 = r4.getResources().getStringArray(m26.streamsecurityxs);
                        stringArray2[0] = "";
                        return stringArray2;
                    case 7:
                        int i8 = ServerActivity.c3;
                        String[] stringArray3 = r4.getResources().getStringArray(m26.streamsecurityxs_hysteria);
                        stringArray3[0] = "";
                        return stringArray3;
                    case 8:
                        int i9 = ServerActivity.c3;
                        String[] stringArray4 = r4.getResources().getStringArray(m26.streamsecurity_utls);
                        stringArray4[0] = "";
                        return stringArray4;
                    case 9:
                        int i10 = ServerActivity.c3;
                        String[] stringArray5 = r4.getResources().getStringArray(m26.streamsecurity_alpn);
                        stringArray5[0] = "";
                        return stringArray5;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                        String strI = ((MMKV) r4.R0.getValue()).i("SELECTED_SERVER");
                        if (strI == null) {
                            strI = null;
                        }
                        if (r4.getIntent().getBooleanExtra("isRunning", false) && !fm7.o0(r4.C())) {
                            if (strI == null ? false : dh3.f(r4.C(), strI)) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        int i11 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.protocols);
                    case 12:
                        int i12 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.securitys);
                    default:
                        int i13 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.ss_securitys);
                }
            }
        });
        final byte b10 = 5;
        this.f1 = new vz7(new dn2(this) { // from class: w37
            public final /* synthetic */ ServerActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, android.content.Context, su.happ.proxyutility.ui.ServerActivity] */
            public final Object invoke() {
                byte b11 = b10;
                boolean z = false;
                ?? r4 = this.Y;
                switch (b11) {
                    case 0:
                        int i = ServerActivity.c3;
                        String[] stringArray = r4.getResources().getStringArray(m26.flows);
                        stringArray[0] = "";
                        return stringArray;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        int i2 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.networks);
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        int i3 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_tcp);
                    case 3:
                        int i4 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_kcp_and_quic);
                    case 4:
                        int i5 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.mode_type_grpc);
                    case 5:
                        int i6 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.xhttp_mode);
                    case 6:
                        int i7 = ServerActivity.c3;
                        String[] stringArray2 = r4.getResources().getStringArray(m26.streamsecurityxs);
                        stringArray2[0] = "";
                        return stringArray2;
                    case 7:
                        int i8 = ServerActivity.c3;
                        String[] stringArray3 = r4.getResources().getStringArray(m26.streamsecurityxs_hysteria);
                        stringArray3[0] = "";
                        return stringArray3;
                    case 8:
                        int i9 = ServerActivity.c3;
                        String[] stringArray4 = r4.getResources().getStringArray(m26.streamsecurity_utls);
                        stringArray4[0] = "";
                        return stringArray4;
                    case 9:
                        int i10 = ServerActivity.c3;
                        String[] stringArray5 = r4.getResources().getStringArray(m26.streamsecurity_alpn);
                        stringArray5[0] = "";
                        return stringArray5;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                        String strI = ((MMKV) r4.R0.getValue()).i("SELECTED_SERVER");
                        if (strI == null) {
                            strI = null;
                        }
                        if (r4.getIntent().getBooleanExtra("isRunning", false) && !fm7.o0(r4.C())) {
                            if (strI == null ? false : dh3.f(r4.C(), strI)) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        int i11 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.protocols);
                    case 12:
                        int i12 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.securitys);
                    default:
                        int i13 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.ss_securitys);
                }
            }
        });
        final byte b11 = 6;
        this.g1 = new vz7(new dn2(this) { // from class: w37
            public final /* synthetic */ ServerActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, android.content.Context, su.happ.proxyutility.ui.ServerActivity] */
            public final Object invoke() {
                byte b12 = b11;
                boolean z = false;
                ?? r4 = this.Y;
                switch (b12) {
                    case 0:
                        int i = ServerActivity.c3;
                        String[] stringArray = r4.getResources().getStringArray(m26.flows);
                        stringArray[0] = "";
                        return stringArray;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        int i2 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.networks);
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        int i3 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_tcp);
                    case 3:
                        int i4 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_kcp_and_quic);
                    case 4:
                        int i5 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.mode_type_grpc);
                    case 5:
                        int i6 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.xhttp_mode);
                    case 6:
                        int i7 = ServerActivity.c3;
                        String[] stringArray2 = r4.getResources().getStringArray(m26.streamsecurityxs);
                        stringArray2[0] = "";
                        return stringArray2;
                    case 7:
                        int i8 = ServerActivity.c3;
                        String[] stringArray3 = r4.getResources().getStringArray(m26.streamsecurityxs_hysteria);
                        stringArray3[0] = "";
                        return stringArray3;
                    case 8:
                        int i9 = ServerActivity.c3;
                        String[] stringArray4 = r4.getResources().getStringArray(m26.streamsecurity_utls);
                        stringArray4[0] = "";
                        return stringArray4;
                    case 9:
                        int i10 = ServerActivity.c3;
                        String[] stringArray5 = r4.getResources().getStringArray(m26.streamsecurity_alpn);
                        stringArray5[0] = "";
                        return stringArray5;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                        String strI = ((MMKV) r4.R0.getValue()).i("SELECTED_SERVER");
                        if (strI == null) {
                            strI = null;
                        }
                        if (r4.getIntent().getBooleanExtra("isRunning", false) && !fm7.o0(r4.C())) {
                            if (strI == null ? false : dh3.f(r4.C(), strI)) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        int i11 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.protocols);
                    case 12:
                        int i12 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.securitys);
                    default:
                        int i13 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.ss_securitys);
                }
            }
        });
        final byte b12 = 7;
        this.h1 = new vz7(new dn2(this) { // from class: w37
            public final /* synthetic */ ServerActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, android.content.Context, su.happ.proxyutility.ui.ServerActivity] */
            public final Object invoke() {
                byte b13 = b12;
                boolean z = false;
                ?? r4 = this.Y;
                switch (b13) {
                    case 0:
                        int i = ServerActivity.c3;
                        String[] stringArray = r4.getResources().getStringArray(m26.flows);
                        stringArray[0] = "";
                        return stringArray;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        int i2 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.networks);
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        int i3 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_tcp);
                    case 3:
                        int i4 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_kcp_and_quic);
                    case 4:
                        int i5 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.mode_type_grpc);
                    case 5:
                        int i6 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.xhttp_mode);
                    case 6:
                        int i7 = ServerActivity.c3;
                        String[] stringArray2 = r4.getResources().getStringArray(m26.streamsecurityxs);
                        stringArray2[0] = "";
                        return stringArray2;
                    case 7:
                        int i8 = ServerActivity.c3;
                        String[] stringArray3 = r4.getResources().getStringArray(m26.streamsecurityxs_hysteria);
                        stringArray3[0] = "";
                        return stringArray3;
                    case 8:
                        int i9 = ServerActivity.c3;
                        String[] stringArray4 = r4.getResources().getStringArray(m26.streamsecurity_utls);
                        stringArray4[0] = "";
                        return stringArray4;
                    case 9:
                        int i10 = ServerActivity.c3;
                        String[] stringArray5 = r4.getResources().getStringArray(m26.streamsecurity_alpn);
                        stringArray5[0] = "";
                        return stringArray5;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                        String strI = ((MMKV) r4.R0.getValue()).i("SELECTED_SERVER");
                        if (strI == null) {
                            strI = null;
                        }
                        if (r4.getIntent().getBooleanExtra("isRunning", false) && !fm7.o0(r4.C())) {
                            if (strI == null ? false : dh3.f(r4.C(), strI)) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        int i11 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.protocols);
                    case 12:
                        int i12 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.securitys);
                    default:
                        int i13 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.ss_securitys);
                }
            }
        });
        final byte b13 = 8;
        this.i1 = new vz7(new dn2(this) { // from class: w37
            public final /* synthetic */ ServerActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, android.content.Context, su.happ.proxyutility.ui.ServerActivity] */
            public final Object invoke() {
                byte b14 = b13;
                boolean z = false;
                ?? r4 = this.Y;
                switch (b14) {
                    case 0:
                        int i = ServerActivity.c3;
                        String[] stringArray = r4.getResources().getStringArray(m26.flows);
                        stringArray[0] = "";
                        return stringArray;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        int i2 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.networks);
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        int i3 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_tcp);
                    case 3:
                        int i4 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_kcp_and_quic);
                    case 4:
                        int i5 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.mode_type_grpc);
                    case 5:
                        int i6 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.xhttp_mode);
                    case 6:
                        int i7 = ServerActivity.c3;
                        String[] stringArray2 = r4.getResources().getStringArray(m26.streamsecurityxs);
                        stringArray2[0] = "";
                        return stringArray2;
                    case 7:
                        int i8 = ServerActivity.c3;
                        String[] stringArray3 = r4.getResources().getStringArray(m26.streamsecurityxs_hysteria);
                        stringArray3[0] = "";
                        return stringArray3;
                    case 8:
                        int i9 = ServerActivity.c3;
                        String[] stringArray4 = r4.getResources().getStringArray(m26.streamsecurity_utls);
                        stringArray4[0] = "";
                        return stringArray4;
                    case 9:
                        int i10 = ServerActivity.c3;
                        String[] stringArray5 = r4.getResources().getStringArray(m26.streamsecurity_alpn);
                        stringArray5[0] = "";
                        return stringArray5;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                        String strI = ((MMKV) r4.R0.getValue()).i("SELECTED_SERVER");
                        if (strI == null) {
                            strI = null;
                        }
                        if (r4.getIntent().getBooleanExtra("isRunning", false) && !fm7.o0(r4.C())) {
                            if (strI == null ? false : dh3.f(r4.C(), strI)) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        int i11 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.protocols);
                    case 12:
                        int i12 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.securitys);
                    default:
                        int i13 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.ss_securitys);
                }
            }
        });
        final byte b14 = 9;
        this.j1 = new vz7(new dn2(this) { // from class: w37
            public final /* synthetic */ ServerActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, android.content.Context, su.happ.proxyutility.ui.ServerActivity] */
            public final Object invoke() {
                byte b15 = b14;
                boolean z = false;
                ?? r4 = this.Y;
                switch (b15) {
                    case 0:
                        int i = ServerActivity.c3;
                        String[] stringArray = r4.getResources().getStringArray(m26.flows);
                        stringArray[0] = "";
                        return stringArray;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                        int i2 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.networks);
                    case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                        int i3 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_tcp);
                    case 3:
                        int i4 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.header_type_kcp_and_quic);
                    case 4:
                        int i5 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.mode_type_grpc);
                    case 5:
                        int i6 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.xhttp_mode);
                    case 6:
                        int i7 = ServerActivity.c3;
                        String[] stringArray2 = r4.getResources().getStringArray(m26.streamsecurityxs);
                        stringArray2[0] = "";
                        return stringArray2;
                    case 7:
                        int i8 = ServerActivity.c3;
                        String[] stringArray3 = r4.getResources().getStringArray(m26.streamsecurityxs_hysteria);
                        stringArray3[0] = "";
                        return stringArray3;
                    case 8:
                        int i9 = ServerActivity.c3;
                        String[] stringArray4 = r4.getResources().getStringArray(m26.streamsecurity_utls);
                        stringArray4[0] = "";
                        return stringArray4;
                    case 9:
                        int i10 = ServerActivity.c3;
                        String[] stringArray5 = r4.getResources().getStringArray(m26.streamsecurity_alpn);
                        stringArray5[0] = "";
                        return stringArray5;
                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                        String strI = ((MMKV) r4.R0.getValue()).i("SELECTED_SERVER");
                        if (strI == null) {
                            strI = null;
                        }
                        if (r4.getIntent().getBooleanExtra("isRunning", false) && !fm7.o0(r4.C())) {
                            if (strI == null ? false : dh3.f(r4.C(), strI)) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        int i11 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.protocols);
                    case 12:
                        int i12 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.securitys);
                    default:
                        int i13 = ServerActivity.c3;
                        return r4.getResources().getStringArray(m26.ss_securitys);
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: su.happ.proxyutility.ui.ServerActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A(CustomSpinner customSpinner, String[] strArr, View view, t16 t16Var) {
        customSpinner.getClass();
        LayoutInflater layoutInflater = getLayoutInflater();
        layoutInflater.getClass();
        customSpinner.setAdapter((SpinnerAdapter) new rf7(this, layoutInflater, customSpinner, strArr));
        customSpinner.setOnItemSelectedListener(new ry2(view, this, t16Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B(ServerConfig serverConfig) {
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings;
        XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean hysteriaSettings;
        Integer udpIdleTimeout;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings2;
        List reserved;
        List reserved2;
        List reserved3;
        List peers;
        XRayConfig.OutboundBean.OutSettingsBean.WireGuardBean wireGuardBean;
        String preSharedKey;
        EditText editText;
        List peers2;
        XRayConfig.OutboundBean.OutSettingsBean.WireGuardBean wireGuardBean2;
        String flow;
        List vnext;
        XRayConfig.OutboundBean.OutSettingsBean.VnextBean vnextBean;
        List users;
        XRayConfig.OutboundBean.OutSettingsBean.VnextBean.UsersBean usersBean;
        CustomSpinner customSpinner;
        String[] strArr;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings3;
        CustomSpinner customSpinner2;
        CustomSpinner customSpinner3;
        CustomSpinner customSpinner4;
        List servers;
        XRayConfig.OutboundBean.OutSettingsBean.ServersBean serversBean;
        List users2;
        XRayConfig.OutboundBean.OutSettingsBean.ServersBean.SocksUsersBean socksUsersBean;
        XRayConfig.OutboundBean.StreamSettingsBean.XhttpSettingsBean xhttpSettings;
        Object extra;
        XRayConfig.OutboundBean.StreamSettingsBean.XhttpSettingsBean xhttpSettings2;
        Object scMinPostsIntervalMs;
        XRayConfig.OutboundBean.StreamSettingsBean.XhttpSettingsBean xhttpSettings3;
        Object scMaxConcurrentPosts;
        XRayConfig.OutboundBean.StreamSettingsBean.XhttpSettingsBean xhttpSettings4;
        Object scMaxEachPostBytes;
        String strValueOf;
        XRayConfig.OutboundBean outboundBeanG = serverConfig.g();
        if (outboundBeanG == null) {
            return;
        }
        EditText editText2 = this.l1;
        if (editText2 == null) {
            dh3.T("etRemarks");
            throw null;
        }
        editText2.setText(wl7.e0(serverConfig.getRemarks()));
        EditText editText3 = this.n1;
        if (editText3 != null) {
            String strG = outboundBeanG.g();
            if (strG == null) {
                strG = "";
            }
            editText3.setText(wl7.e0(strG));
        }
        EditText editText4 = this.p1;
        if (editText4 != null) {
            Integer numH = outboundBeanG.h();
            if (numH == null || (strValueOf = String.valueOf(numH.intValue())) == null) {
                strValueOf = "443";
            }
            editText4.setText(wl7.e0(strValueOf));
        }
        EditText editText5 = this.r1;
        if (editText5 != null) {
            String strD = outboundBeanG.d();
            if (strD == null) {
                strD = "";
            }
            editText5.setText(wl7.e0(strD));
        }
        EditText editText6 = this.t2;
        if (editText6 != null) {
            XRayConfig.OutboundBean.StreamSettingsBean streamSettings4 = outboundBeanG.getStreamSettings();
            String string = (streamSettings4 == null || (xhttpSettings4 = streamSettings4.getXhttpSettings()) == null || (scMaxEachPostBytes = xhttpSettings4.getScMaxEachPostBytes()) == null) ? null : scMaxEachPostBytes.toString();
            if (string == null) {
                string = "";
            }
            editText6.setText(wl7.e0(string));
        }
        EditText editText7 = this.v2;
        if (editText7 != null) {
            XRayConfig.OutboundBean.StreamSettingsBean streamSettings5 = outboundBeanG.getStreamSettings();
            String string2 = (streamSettings5 == null || (xhttpSettings3 = streamSettings5.getXhttpSettings()) == null || (scMaxConcurrentPosts = xhttpSettings3.getScMaxConcurrentPosts()) == null) ? null : scMaxConcurrentPosts.toString();
            if (string2 == null) {
                string2 = "";
            }
            editText7.setText(wl7.e0(string2));
        }
        EditText editText8 = this.X2;
        if (editText8 != null) {
            XRayConfig.OutboundBean.StreamSettingsBean streamSettings6 = outboundBeanG.getStreamSettings();
            String string3 = (streamSettings6 == null || (xhttpSettings2 = streamSettings6.getXhttpSettings()) == null || (scMinPostsIntervalMs = xhttpSettings2.getScMinPostsIntervalMs()) == null) ? null : scMinPostsIntervalMs.toString();
            if (string3 == null) {
                string3 = "";
            }
            editText8.setText(wl7.e0(string3));
        }
        EditText editText9 = this.V2;
        if (editText9 != null) {
            XRayConfig.OutboundBean.StreamSettingsBean streamSettings7 = outboundBeanG.getStreamSettings();
            String strE = (streamSettings7 == null || (xhttpSettings = streamSettings7.getXhttpSettings()) == null || (extra = xhttpSettings.getExtra()) == null) ? null : x79.e(extra);
            if (strE == null) {
                strE = "";
            }
            editText9.setText(wl7.e0(strE));
        }
        if (serverConfig.getConfigType() == EConfigType.SOCKS) {
            EditText editText10 = this.K1;
            if (editText10 != null) {
                XRayConfig.OutboundBean.OutSettingsBean settings = outboundBeanG.getSettings();
                String user = (settings == null || (servers = settings.getServers()) == null || (serversBean = (XRayConfig.OutboundBean.OutSettingsBean.ServersBean) servers.get(0)) == null || (users2 = serversBean.getUsers()) == null || (socksUsersBean = (XRayConfig.OutboundBean.OutSettingsBean.ServersBean.SocksUsersBean) users2.get(0)) == null) ? null : socksUsersBean.getUser();
                if (user == null) {
                    user = "";
                }
                editText10.setText(wl7.e0(user));
            }
        } else if (serverConfig.getConfigType() == EConfigType.VLESS) {
            EditText editText11 = this.K1;
            if (editText11 != null) {
                String strF = outboundBeanG.f();
                if (strF == null) {
                    strF = "";
                }
                editText11.setText(wl7.e0(strF));
            }
            XRayConfig.OutboundBean.OutSettingsBean settings2 = outboundBeanG.getSettings();
            if (settings2 == null || (flow = settings2.getFlow()) == null) {
                XRayConfig.OutboundBean.OutSettingsBean settings3 = outboundBeanG.getSettings();
                flow = (settings3 == null || (vnext = settings3.getVnext()) == null || (vnextBean = (XRayConfig.OutboundBean.OutSettingsBean.VnextBean) vnext.get(0)) == null || (users = vnextBean.getUsers()) == null || (usersBean = (XRayConfig.OutboundBean.OutSettingsBean.VnextBean.UsersBean) users.get(0)) == null) ? null : usersBean.getFlow();
            }
            if (flow == null) {
                flow = "";
            }
            Object value = this.a1.getValue();
            value.getClass();
            Integer numL = z91.L(flow, (String[]) value);
            if (numL != null && (customSpinner = this.N1) != null) {
                customSpinner.setSelection(numL.intValue());
            }
        } else if (serverConfig.getConfigType() == EConfigType.WIREGUARD) {
            EditText editText12 = this.F2;
            if (editText12 != null) {
                XRayConfig.OutboundBean.OutSettingsBean settings4 = outboundBeanG.getSettings();
                String publicKey = (settings4 == null || (peers2 = settings4.getPeers()) == null || (wireGuardBean2 = (XRayConfig.OutboundBean.OutSettingsBean.WireGuardBean) peers2.get(0)) == null) ? null : wireGuardBean2.getPublicKey();
                if (publicKey == null) {
                    publicKey = "";
                }
                editText12.setText(wl7.e0(publicKey));
            }
            XRayConfig.OutboundBean.OutSettingsBean settings5 = outboundBeanG.getSettings();
            List reserved4 = settings5 != null ? settings5.getReserved() : null;
            EditText editText13 = this.N2;
            if (reserved4 == null) {
                if (editText13 != null) {
                    editText13.setText(wl7.e0("0"));
                }
                EditText editText14 = this.O2;
                if (editText14 != null) {
                    editText14.setText(wl7.e0("0"));
                }
                EditText editText15 = this.P2;
                if (editText15 != null) {
                    editText15.setText(wl7.e0("0"));
                }
            } else {
                if (editText13 != null) {
                    XRayConfig.OutboundBean.OutSettingsBean settings6 = outboundBeanG.getSettings();
                    editText13.setText(wl7.e0(String.valueOf((settings6 == null || (reserved3 = settings6.getReserved()) == null) ? null : (Integer) reserved3.get(0))));
                }
                EditText editText16 = this.O2;
                if (editText16 != null) {
                    XRayConfig.OutboundBean.OutSettingsBean settings7 = outboundBeanG.getSettings();
                    editText16.setText(wl7.e0(String.valueOf((settings7 == null || (reserved2 = settings7.getReserved()) == null) ? null : (Integer) reserved2.get(1))));
                }
                EditText editText17 = this.P2;
                if (editText17 != null) {
                    XRayConfig.OutboundBean.OutSettingsBean settings8 = outboundBeanG.getSettings();
                    editText17.setText(wl7.e0(String.valueOf((settings8 == null || (reserved = settings8.getReserved()) == null) ? null : (Integer) reserved.get(2))));
                }
            }
            XRayConfig.OutboundBean.OutSettingsBean settings9 = outboundBeanG.getSettings();
            if ((settings9 != null ? settings9.getAddress() : null) == null) {
                EditText editText18 = this.R2;
                if (editText18 != null) {
                    editText18.setText(wl7.e0("172.16.0.2/32,2606:4700:110:8f81:d551:a0:532e:a2b3/128"));
                }
            } else {
                XRayConfig.OutboundBean.OutSettingsBean settings10 = outboundBeanG.getSettings();
                Object address = settings10 != null ? settings10.getAddress() : null;
                address.getClass();
                List list = (List) address;
                EditText editText19 = this.R2;
                if (editText19 != null) {
                    editText19.setText(wl7.e0(wv0.y0(list, (CharSequence) null, (String) null, (String) null, (gn2) null, 63)));
                }
            }
            XRayConfig.OutboundBean.OutSettingsBean settings11 = outboundBeanG.getSettings();
            Integer mtu = settings11 != null ? settings11.getMtu() : null;
            EditText editText20 = this.T2;
            if (mtu == null) {
                if (editText20 != null) {
                    editText20.setText(wl7.e0("1420"));
                }
            } else if (editText20 != null) {
                XRayConfig.OutboundBean.OutSettingsBean settings12 = outboundBeanG.getSettings();
                editText20.setText(wl7.e0(String.valueOf(settings12 != null ? settings12.getMtu() : null)));
            }
            XRayConfig.OutboundBean.OutSettingsBean settings13 = outboundBeanG.getSettings();
            if (settings13 != null && (peers = settings13.getPeers()) != null && (wireGuardBean = (XRayConfig.OutboundBean.OutSettingsBean.WireGuardBean) peers.get(0)) != null && (preSharedKey = wireGuardBean.getPreSharedKey()) != null && (editText = this.a3) != null) {
                editText.setText(wl7.e0(preSharedKey));
            }
        } else if (serverConfig.getConfigType() == EConfigType.HYSTERIA) {
            XRayConfig.OutboundBean outboundBean = serverConfig.getOutboundBean();
            XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask = (outboundBean == null || (streamSettings2 = outboundBean.getStreamSettings()) == null) ? null : streamSettings2.getFinalMask();
            if (finalMask == null || (finalMask.getTcp() == null && finalMask.getUdp() == null && finalMask.getQuicParams() == null)) {
                ConstraintLayout constraintLayout = this.s1;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                }
                ConstraintLayout constraintLayout2 = this.v1;
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(0);
                }
                ConstraintLayout constraintLayout3 = this.y1;
                if (constraintLayout3 != null) {
                    constraintLayout3.setVisibility(0);
                }
                ConstraintLayout constraintLayout4 = this.B1;
                if (constraintLayout4 != null) {
                    constraintLayout4.setVisibility(0);
                }
                ConstraintLayout constraintLayout5 = this.E1;
                if (constraintLayout5 != null) {
                    constraintLayout5.setVisibility(0);
                }
                HappSettingsDivider happSettingsDivider = this.u1;
                if (happSettingsDivider != null) {
                    happSettingsDivider.setVisibility(0);
                }
                HappSettingsDivider happSettingsDivider2 = this.x1;
                if (happSettingsDivider2 != null) {
                    happSettingsDivider2.setVisibility(0);
                }
                HappSettingsDivider happSettingsDivider3 = this.A1;
                if (happSettingsDivider3 != null) {
                    happSettingsDivider3.setVisibility(0);
                }
                HappSettingsDivider happSettingsDivider4 = this.D1;
                if (happSettingsDivider4 != null) {
                    happSettingsDivider4.setVisibility(0);
                }
                HappSettingsDivider happSettingsDivider5 = this.G1;
                if (happSettingsDivider5 != null) {
                    happSettingsDivider5.setVisibility(0);
                }
            } else {
                ConstraintLayout constraintLayout6 = this.s1;
                if (constraintLayout6 != null) {
                    constraintLayout6.setVisibility(8);
                }
                ConstraintLayout constraintLayout7 = this.v1;
                if (constraintLayout7 != null) {
                    constraintLayout7.setVisibility(8);
                }
                ConstraintLayout constraintLayout8 = this.y1;
                if (constraintLayout8 != null) {
                    constraintLayout8.setVisibility(8);
                }
                ConstraintLayout constraintLayout9 = this.B1;
                if (constraintLayout9 != null) {
                    constraintLayout9.setVisibility(8);
                }
                ConstraintLayout constraintLayout10 = this.E1;
                if (constraintLayout10 != null) {
                    constraintLayout10.setVisibility(8);
                }
                HappSettingsDivider happSettingsDivider6 = this.u1;
                if (happSettingsDivider6 != null) {
                    happSettingsDivider6.setVisibility(8);
                }
                HappSettingsDivider happSettingsDivider7 = this.x1;
                if (happSettingsDivider7 != null) {
                    happSettingsDivider7.setVisibility(8);
                }
                HappSettingsDivider happSettingsDivider8 = this.A1;
                if (happSettingsDivider8 != null) {
                    happSettingsDivider8.setVisibility(8);
                }
                HappSettingsDivider happSettingsDivider9 = this.D1;
                if (happSettingsDivider9 != null) {
                    happSettingsDivider9.setVisibility(8);
                }
                HappSettingsDivider happSettingsDivider10 = this.G1;
                if (happSettingsDivider10 != null) {
                    happSettingsDivider10.setVisibility(8);
                }
            }
            XRayConfig.OutboundBean outboundBean2 = serverConfig.getOutboundBean();
            if (outboundBean2 != null && (streamSettings = outboundBean2.getStreamSettings()) != null && (hysteriaSettings = streamSettings.getHysteriaSettings()) != null && (udpIdleTimeout = hysteriaSettings.getUdpIdleTimeout()) != null) {
                int iIntValue = udpIdleTimeout.intValue();
                EditText editText21 = this.I1;
                if (editText21 != null) {
                    editText21.setText(wl7.e0(String.valueOf(iIntValue)));
                }
            }
        }
        if (z37.a[serverConfig.getConfigType().ordinal()] == 3) {
            Object value2 = this.Z0.getValue();
            value2.getClass();
            strArr = (String[]) value2;
        } else {
            Object value3 = this.Y0.getValue();
            value3.getClass();
            strArr = (String[]) value3;
        }
        String strF2 = outboundBeanG.f();
        if (strF2 == null) {
            strF2 = "";
        }
        Integer numL2 = z91.L(strF2, strArr);
        if (numL2 != null && (customSpinner4 = this.L1) != null) {
            customSpinner4.setSelection(numL2.intValue());
        }
        XRayConfig.OutboundBean outboundBean3 = serverConfig.getOutboundBean();
        if (outboundBean3 == null || (streamSettings3 = outboundBean3.getStreamSettings()) == null) {
            return;
        }
        Integer numL3 = z91.L(streamSettings3.getSecurity(), E());
        if (numL3 != null) {
            String str = E()[numL3.intValue()];
            CustomSpinner customSpinner5 = this.P1;
            if (customSpinner5 != null) {
                customSpinner5.setSelection(numL3.intValue());
            }
            XRayConfig.OutboundBean.StreamSettingsBean.TlsSettingsBean tlsSettings = streamSettings3.getTlsSettings();
            if (tlsSettings == null) {
                tlsSettings = streamSettings3.getRealitySettings();
            }
            if (tlsSettings != null) {
                ConstraintLayout constraintLayout11 = this.Q1;
                if (constraintLayout11 != null) {
                    constraintLayout11.setVisibility(0);
                }
                View view = this.Z2;
                if (view != null) {
                    view.setVisibility(0);
                }
                EConfigType eConfigType = this.U0;
                EConfigType eConfigType2 = EConfigType.HYSTERIA;
                ConstraintLayout constraintLayout12 = this.S1;
                if (eConfigType == eConfigType2) {
                    if (constraintLayout12 != null) {
                        constraintLayout12.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout13 = this.w2;
                    if (constraintLayout13 != null) {
                        constraintLayout13.setVisibility(8);
                    }
                } else {
                    if (constraintLayout12 != null) {
                        constraintLayout12.setVisibility(0);
                    }
                    ConstraintLayout constraintLayout14 = this.w2;
                    if (constraintLayout14 != null) {
                        constraintLayout14.setVisibility(0);
                    }
                }
                EditText editText22 = this.R1;
                if (editText22 != null) {
                    String serverName = tlsSettings.getServerName();
                    editText22.setText(serverName != null ? wl7.e0(serverName) : null);
                }
                if (tlsSettings.getFingerprint() != null) {
                    Object value4 = this.i1.getValue();
                    value4.getClass();
                    Integer numL4 = z91.L(tlsSettings.getFingerprint(), (String[]) value4);
                    if (numL4 != null && (customSpinner3 = this.T1) != null) {
                        customSpinner3.setSelection(numL4.intValue());
                    }
                }
                if (tlsSettings.getAlpn() != null) {
                    ss8 ss8Var = ss8.a;
                    String strW = mm7.W(wv0.y0(tlsSettings.getAlpn(), (CharSequence) null, (String) null, (String) null, (gn2) null, 63), " ", "", false);
                    Object value5 = this.j1.getValue();
                    value5.getClass();
                    Integer numL5 = z91.L(strW, (String[]) value5);
                    if (numL5 != null && (customSpinner2 = this.x2) != null) {
                        customSpinner2.setSelection(numL5.intValue());
                    }
                }
                if (streamSettings3.getTlsSettings() != null) {
                    ConstraintLayout constraintLayout15 = this.y2;
                    if (constraintLayout15 != null) {
                        constraintLayout15.setVisibility(0);
                    }
                    HappInputField happInputField = this.A2;
                    if (happInputField != null) {
                        happInputField.setVisibility(0);
                    }
                    HappSettingsDivider happSettingsDivider11 = this.B2;
                    if (happSettingsDivider11 != null) {
                        happSettingsDivider11.setVisibility(0);
                    }
                    EditText editText23 = this.z2;
                    if (editText23 != null) {
                        String pinnedPeerCertSha256 = tlsSettings.getPinnedPeerCertSha256();
                        if (pinnedPeerCertSha256 == null) {
                            pinnedPeerCertSha256 = "";
                        }
                        editText23.setText(wl7.e0(pinnedPeerCertSha256));
                    }
                    HappInputField happInputField2 = this.A2;
                    if (happInputField2 != null) {
                        String verifyPeerCertByName = tlsSettings.getVerifyPeerCertByName();
                        if (verifyPeerCertByName == null) {
                            verifyPeerCertByName = "";
                        }
                        happInputField2.setText(verifyPeerCertByName);
                    }
                    HappInputField happInputField3 = this.C2;
                    if (happInputField3 != null) {
                        happInputField3.setVisibility(0);
                    }
                    HappInputField happInputField4 = this.C2;
                    if (happInputField4 != null) {
                        String echConfigList = tlsSettings.getEchConfigList();
                        happInputField4.setText(echConfigList != null ? echConfigList : "");
                    }
                    ConstraintLayout constraintLayout16 = this.E2;
                    if (constraintLayout16 != null) {
                        constraintLayout16.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout17 = this.G2;
                    if (constraintLayout17 != null) {
                        constraintLayout17.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout18 = this.I2;
                    if (constraintLayout18 != null) {
                        constraintLayout18.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout19 = this.K2;
                    if (constraintLayout19 != null) {
                        constraintLayout19.setVisibility(8);
                    }
                } else {
                    ConstraintLayout constraintLayout20 = this.E2;
                    if (constraintLayout20 != null) {
                        constraintLayout20.setVisibility(0);
                    }
                    EditText editText24 = this.F2;
                    if (editText24 != null) {
                        String publicKey2 = tlsSettings.getPublicKey();
                        if (publicKey2 == null) {
                            publicKey2 = "";
                        }
                        editText24.setText(wl7.e0(publicKey2));
                    }
                    ConstraintLayout constraintLayout21 = this.G2;
                    if (constraintLayout21 != null) {
                        constraintLayout21.setVisibility(0);
                    }
                    EditText editText25 = this.H2;
                    if (editText25 != null) {
                        String shortId = tlsSettings.getShortId();
                        if (shortId == null) {
                            shortId = "";
                        }
                        editText25.setText(wl7.e0(shortId));
                    }
                    ConstraintLayout constraintLayout22 = this.I2;
                    if (constraintLayout22 != null) {
                        constraintLayout22.setVisibility(0);
                    }
                    EditText editText26 = this.J2;
                    if (editText26 != null) {
                        String spiderX = tlsSettings.getSpiderX();
                        if (spiderX == null) {
                            spiderX = "";
                        }
                        editText26.setText(wl7.e0(spiderX));
                    }
                    ConstraintLayout constraintLayout23 = this.K2;
                    if (constraintLayout23 != null) {
                        constraintLayout23.setVisibility(0);
                    }
                    EditText editText27 = this.L2;
                    if (editText27 != null) {
                        String mldsa65Verify = tlsSettings.getMldsa65Verify();
                        editText27.setText(wl7.e0(mldsa65Verify != null ? mldsa65Verify : ""));
                    }
                    ConstraintLayout constraintLayout24 = this.y2;
                    if (constraintLayout24 != null) {
                        constraintLayout24.setVisibility(8);
                    }
                    HappInputField happInputField5 = this.A2;
                    if (happInputField5 != null) {
                        happInputField5.setVisibility(8);
                    }
                    HappSettingsDivider happSettingsDivider12 = this.B2;
                    if (happSettingsDivider12 != null) {
                        happSettingsDivider12.setVisibility(8);
                    }
                    HappInputField happInputField6 = this.C2;
                    if (happInputField6 != null) {
                        happInputField6.setVisibility(8);
                    }
                    HappSettingsDivider happSettingsDivider13 = this.D2;
                    if (happSettingsDivider13 != null) {
                        happSettingsDivider13.setVisibility(8);
                    }
                }
            }
            if (streamSettings3.getTlsSettings() == null && streamSettings3.getRealitySettings() == null) {
                ConstraintLayout constraintLayout25 = this.Q1;
                if (constraintLayout25 != null) {
                    constraintLayout25.setVisibility(8);
                }
                View view2 = this.Z2;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                ConstraintLayout constraintLayout26 = this.S1;
                if (constraintLayout26 != null) {
                    constraintLayout26.setVisibility(8);
                }
                ConstraintLayout constraintLayout27 = this.w2;
                if (constraintLayout27 != null) {
                    constraintLayout27.setVisibility(8);
                }
                ConstraintLayout constraintLayout28 = this.y2;
                if (constraintLayout28 != null) {
                    constraintLayout28.setVisibility(8);
                }
                HappInputField happInputField7 = this.A2;
                if (happInputField7 != null) {
                    happInputField7.setVisibility(8);
                }
                HappSettingsDivider happSettingsDivider14 = this.B2;
                if (happSettingsDivider14 != null) {
                    happSettingsDivider14.setVisibility(8);
                }
                HappInputField happInputField8 = this.C2;
                if (happInputField8 != null) {
                    happInputField8.setVisibility(8);
                }
                HappSettingsDivider happSettingsDivider15 = this.D2;
                if (happSettingsDivider15 != null) {
                    happSettingsDivider15.setVisibility(8);
                }
                ConstraintLayout constraintLayout29 = this.E2;
                if (constraintLayout29 != null) {
                    constraintLayout29.setVisibility(8);
                }
                ConstraintLayout constraintLayout30 = this.G2;
                if (constraintLayout30 != null) {
                    constraintLayout30.setVisibility(8);
                }
                ConstraintLayout constraintLayout31 = this.I2;
                if (constraintLayout31 != null) {
                    constraintLayout31.setVisibility(8);
                }
                ConstraintLayout constraintLayout32 = this.K2;
                if (constraintLayout32 != null) {
                    constraintLayout32.setVisibility(8);
                }
            }
        } else {
            View view3 = this.Z2;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            ConstraintLayout constraintLayout33 = this.Q1;
            if (constraintLayout33 != null) {
                constraintLayout33.setVisibility(8);
            }
            ConstraintLayout constraintLayout34 = this.S1;
            if (constraintLayout34 != null) {
                constraintLayout34.setVisibility(8);
            }
            ConstraintLayout constraintLayout35 = this.w2;
            if (constraintLayout35 != null) {
                constraintLayout35.setVisibility(8);
            }
            ConstraintLayout constraintLayout36 = this.y2;
            if (constraintLayout36 != null) {
                constraintLayout36.setVisibility(8);
            }
            HappSettingsDivider happSettingsDivider16 = this.B2;
            if (happSettingsDivider16 != null) {
                happSettingsDivider16.setVisibility(8);
            }
            HappInputField happInputField9 = this.C2;
            if (happInputField9 != null) {
                happInputField9.setVisibility(8);
            }
            HappSettingsDivider happSettingsDivider17 = this.D2;
            if (happSettingsDivider17 != null) {
                happSettingsDivider17.setVisibility(8);
            }
            ConstraintLayout constraintLayout37 = this.E2;
            if (constraintLayout37 != null) {
                constraintLayout37.setVisibility(8);
            }
            ConstraintLayout constraintLayout38 = this.G2;
            if (constraintLayout38 != null) {
                constraintLayout38.setVisibility(8);
            }
            ConstraintLayout constraintLayout39 = this.I2;
            if (constraintLayout39 != null) {
                constraintLayout39.setVisibility(8);
            }
            ConstraintLayout constraintLayout40 = this.K2;
            if (constraintLayout40 != null) {
                constraintLayout40.setVisibility(8);
            }
        }
        Integer numL6 = z91.L(streamSettings3.getNetwork(), D());
        if (numL6 != null) {
            this.V0 = D()[numL6.intValue()];
            CustomSpinner customSpinner6 = this.V1;
            if (customSpinner6 != null) {
                customSpinner6.setSelection(numL6.intValue());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String C() {
        return ((GuId) this.S0.getValue()).b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String[] D() {
        Object value = this.b1.getValue();
        value.getClass();
        return (String[]) value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String[] E() {
        Object value = this.g1.getValue();
        value.getClass();
        return (String[]) value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: su.happ.proxyutility.ui.ServerActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void F(ServerConfig serverConfig) {
        String[] strArrE;
        XRayConfig.OutboundBean outboundBean;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask;
        y5 y5Var = this.Q0;
        if (y5Var == null) {
            dh3.T("binding");
            throw null;
        }
        ((FrameLayout) y5Var.g0).removeAllViews();
        EConfigType eConfigType = this.U0;
        int[] iArr = z37.a;
        final byte b = 1;
        switch (iArr[eConfigType.ordinal()]) {
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                LayoutInflater layoutInflater = getLayoutInflater();
                int i = t46.fragment_server_vmess;
                y5 y5Var2 = this.Q0;
                if (y5Var2 == null) {
                    dh3.T("binding");
                    throw null;
                }
                layoutInflater.inflate(i, (ViewGroup) y5Var2.g0, true);
                break;
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                Intent intentPutExtra = new Intent().putExtra("guid", C()).putExtra("isRunning", ((Boolean) this.T0.getValue()).booleanValue());
                intentPutExtra.getClass();
                startActivity(intentPutExtra.setClass(this, ServerCustomConfigActivity.class));
                finish();
                return;
            case 3:
                LayoutInflater layoutInflater2 = getLayoutInflater();
                int i2 = t46.fragment_server_shadowsocks;
                y5 y5Var3 = this.Q0;
                if (y5Var3 == null) {
                    dh3.T("binding");
                    throw null;
                }
                layoutInflater2.inflate(i2, (ViewGroup) y5Var3.g0, true);
                break;
                break;
            case 4:
                LayoutInflater layoutInflater3 = getLayoutInflater();
                int i3 = t46.fragment_server_socks;
                y5 y5Var4 = this.Q0;
                if (y5Var4 == null) {
                    dh3.T("binding");
                    throw null;
                }
                layoutInflater3.inflate(i3, (ViewGroup) y5Var4.g0, true);
                break;
                break;
            case 5:
                LayoutInflater layoutInflater4 = getLayoutInflater();
                int i4 = t46.fragment_server_vless;
                y5 y5Var5 = this.Q0;
                if (y5Var5 == null) {
                    dh3.T("binding");
                    throw null;
                }
                layoutInflater4.inflate(i4, (ViewGroup) y5Var5.g0, true);
                break;
                break;
            case 6:
                LayoutInflater layoutInflater5 = getLayoutInflater();
                int i5 = t46.fragment_server_trojan;
                y5 y5Var6 = this.Q0;
                if (y5Var6 == null) {
                    dh3.T("binding");
                    throw null;
                }
                layoutInflater5.inflate(i5, (ViewGroup) y5Var6.g0, true);
                break;
                break;
            case 7:
                LayoutInflater layoutInflater6 = getLayoutInflater();
                int i6 = t46.fragment_server_wireguard;
                y5 y5Var7 = this.Q0;
                if (y5Var7 == null) {
                    dh3.T("binding");
                    throw null;
                }
                layoutInflater6.inflate(i6, (ViewGroup) y5Var7.g0, true);
                break;
                break;
            case 8:
                LayoutInflater layoutInflater7 = getLayoutInflater();
                int i7 = t46.fragment_server_hysteria;
                y5 y5Var8 = this.Q0;
                if (y5Var8 == null) {
                    dh3.T("binding");
                    throw null;
                }
                layoutInflater7.inflate(i7, (ViewGroup) y5Var8.g0, true);
                break;
                break;
            default:
                b61.c();
                return;
        }
        ConstraintLayout constraintLayoutFindViewById = findViewById(e46.cl_remarks);
        constraintLayoutFindViewById.getClass();
        this.k1 = constraintLayoutFindViewById;
        View viewFindViewById = findViewById(e46.et_remarks);
        viewFindViewById.getClass();
        this.l1 = (EditText) viewFindViewById;
        this.m1 = findViewById(e46.cl_address);
        this.n1 = (EditText) findViewById(e46.et_address);
        this.o1 = findViewById(e46.cl_port);
        this.p1 = (EditText) findViewById(e46.et_port);
        this.q1 = findViewById(e46.cl_id);
        this.r1 = (EditText) findViewById(e46.et_id);
        this.s1 = findViewById(e46.cl_obfs_password);
        this.t1 = (EditText) findViewById(e46.et_obfs_password);
        this.u1 = (HappSettingsDivider) findViewById(e46.divider_obfs_password);
        this.v1 = findViewById(e46.cl_port_hop);
        this.w1 = (EditText) findViewById(e46.et_port_hop);
        this.x1 = (HappSettingsDivider) findViewById(e46.divider_port_hop);
        this.y1 = findViewById(e46.cl_port_hop_interval);
        this.z1 = (EditText) findViewById(e46.et_port_hop_interval);
        this.A1 = (HappSettingsDivider) findViewById(e46.divider_port_hop_interval);
        this.B1 = findViewById(e46.cl_bandwidth_down);
        this.C1 = (EditText) findViewById(e46.et_bandwidth_down);
        this.D1 = (HappSettingsDivider) findViewById(e46.divider_bandwidth_down);
        this.E1 = findViewById(e46.cl_bandwidth_up);
        this.F1 = (EditText) findViewById(e46.et_bandwidth_up);
        this.G1 = (HappSettingsDivider) findViewById(e46.divider_bandwidth_up);
        this.H1 = findViewById(e46.cl_udp_idle_timeout);
        this.I1 = (EditText) findViewById(e46.et_udp_idle_timeout);
        this.J1 = findViewById(e46.cl_security);
        this.K1 = (EditText) findViewById(e46.et_security);
        this.L1 = (CustomSpinner) findViewById(e46.sp_security);
        this.M1 = findViewById(e46.cl_flow);
        this.N1 = (CustomSpinner) findViewById(e46.sp_flow);
        this.O1 = findViewById(e46.cl_stream_security);
        this.P1 = (CustomSpinner) findViewById(e46.sp_stream_security);
        this.Q1 = findViewById(e46.cl_sni);
        this.R1 = (EditText) findViewById(e46.et_sni);
        this.S1 = findViewById(e46.cl_stream_fingerprint);
        this.T1 = (CustomSpinner) findViewById(e46.sp_stream_fingerprint);
        this.U1 = findViewById(e46.cl_network);
        this.V1 = (CustomSpinner) findViewById(e46.sp_network);
        this.W1 = findViewById(e46.cl_header_type);
        this.Y1 = (TextView) findViewById(e46.tv_header_type);
        this.X1 = (CustomSpinner) findViewById(e46.sp_header_type);
        this.Z1 = (HappSettingsDivider) findViewById(e46.divider_header_type);
        this.a2 = findViewById(e46.cl_request_host);
        this.b2 = (TextView) findViewById(e46.tv_request_host);
        this.c2 = (EditText) findViewById(e46.et_request_host);
        this.d2 = (HappSettingsDivider) findViewById(e46.divider_request_host);
        this.e2 = findViewById(e46.cl_path);
        this.f2 = (TextView) findViewById(e46.tv_path);
        this.g2 = (EditText) findViewById(e46.et_path);
        this.h2 = (HappSettingsDivider) findViewById(e46.divider_path);
        this.i2 = (HappInputField) findViewById(e46.if_mtu);
        this.j2 = (HappSettingsDivider) findViewById(e46.divider_mtu);
        this.k2 = (HappInputField) findViewById(e46.if_tti);
        this.l2 = (HappSettingsDivider) findViewById(e46.divider_tti);
        this.m2 = (HappInputField) findViewById(e46.if_cwnd_multiplier);
        this.n2 = (HappSettingsDivider) findViewById(e46.divider_cwnd_multiplier);
        this.o2 = (HappInputField) findViewById(e46.if_max_sending_window);
        this.p2 = (HappSettingsDivider) findViewById(e46.divider_max_sending_window);
        this.q2 = (LinearLayout) findViewById(e46.ll_final_mask);
        this.r2 = (EditText) findViewById(e46.et_final_mask);
        this.s2 = findViewById(e46.cl_max_each_post_bytes);
        this.t2 = (EditText) findViewById(e46.et_max_each_post_bytes);
        this.u2 = findViewById(e46.cl_max_concurrent_posts);
        this.v2 = (EditText) findViewById(e46.et_max_concurrent_posts);
        this.w2 = findViewById(e46.cl_stream_alpn);
        this.x2 = (CustomSpinner) findViewById(e46.sp_stream_alpn);
        this.E2 = findViewById(e46.cl_public_key);
        this.F2 = (EditText) findViewById(e46.et_public_key);
        this.y2 = findViewById(e46.cl_pcs);
        this.z2 = (EditText) findViewById(e46.et_pcs);
        this.A2 = (HappInputField) findViewById(e46.if_pcn);
        this.B2 = (HappSettingsDivider) findViewById(e46.divider_pcn);
        this.C2 = (HappInputField) findViewById(e46.if_ech_cl);
        this.D2 = (HappSettingsDivider) findViewById(e46.divider_ech_cl);
        this.G2 = findViewById(e46.cl_short_id);
        this.H2 = (EditText) findViewById(e46.et_short_id);
        this.I2 = findViewById(e46.cl_spider_x);
        this.J2 = (EditText) findViewById(e46.et_spider_x);
        this.K2 = findViewById(e46.cl_ml_dsa_65_verify);
        this.L2 = (EditText) findViewById(e46.et_ml_dsa_65_verify);
        this.M2 = (LinearLayout) findViewById(e46.ll_reserved);
        this.N2 = (EditText) findViewById(e46.et_reserved1);
        this.O2 = (EditText) findViewById(e46.et_reserved2);
        this.P2 = (EditText) findViewById(e46.et_reserved3);
        this.Q2 = findViewById(e46.cl_local_address);
        this.R2 = (EditText) findViewById(e46.et_local_address);
        this.S2 = findViewById(e46.cl_local_mtu);
        this.T2 = (EditText) findViewById(e46.et_local_mtu);
        this.U2 = findViewById(e46.cl_extra);
        this.V2 = (EditText) findViewById(e46.et_extra);
        this.W2 = findViewById(e46.cl_min_posts_interval_ms);
        this.X2 = (EditText) findViewById(e46.et_min_posts_interval_ms);
        this.Y2 = (LinearLayout) findViewById(e46.ll_xhttp_additional_param);
        this.Z2 = findViewById(e46.border_stream_security);
        this.a3 = (EditText) findViewById(e46.et_pre_shared_key);
        this.b3 = findViewById(e46.cl_pre_shared_key);
        boolean zY = ue3.y(this);
        y5 y5Var9 = this.Q0;
        if (y5Var9 == null) {
            dh3.T("binding");
            throw null;
        }
        ((ConstraintLayout) y5Var9.Z).setFocusableInTouchMode(zY);
        ConstraintLayout constraintLayout = this.k1;
        if (constraintLayout == null) {
            dh3.T("clRemarks");
            throw null;
        }
        constraintLayout.setFocusableInTouchMode(zY);
        ConstraintLayout constraintLayout2 = this.m1;
        if (constraintLayout2 != null) {
            constraintLayout2.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout3 = this.o1;
        if (constraintLayout3 != null) {
            constraintLayout3.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout4 = this.q1;
        if (constraintLayout4 != null) {
            constraintLayout4.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout5 = this.s1;
        if (constraintLayout5 != null) {
            constraintLayout5.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout6 = this.v1;
        if (constraintLayout6 != null) {
            constraintLayout6.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout7 = this.y1;
        if (constraintLayout7 != null) {
            constraintLayout7.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout8 = this.B1;
        if (constraintLayout8 != null) {
            constraintLayout8.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout9 = this.E1;
        if (constraintLayout9 != null) {
            constraintLayout9.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout10 = this.H1;
        if (constraintLayout10 != null) {
            constraintLayout10.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout11 = this.J1;
        if (constraintLayout11 != null) {
            constraintLayout11.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout12 = this.M1;
        if (constraintLayout12 != null) {
            constraintLayout12.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout13 = this.O1;
        if (constraintLayout13 != null) {
            constraintLayout13.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout14 = this.y2;
        if (constraintLayout14 != null) {
            constraintLayout14.setFocusableInTouchMode(zY);
        }
        HappInputField happInputField = this.A2;
        if (happInputField != null) {
            happInputField.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout15 = this.Q1;
        if (constraintLayout15 != null) {
            constraintLayout15.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout16 = this.S1;
        if (constraintLayout16 != null) {
            constraintLayout16.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout17 = this.U1;
        if (constraintLayout17 != null) {
            constraintLayout17.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout18 = this.W1;
        if (constraintLayout18 != null) {
            constraintLayout18.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout19 = this.a2;
        if (constraintLayout19 != null) {
            constraintLayout19.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout20 = this.e2;
        if (constraintLayout20 != null) {
            constraintLayout20.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout21 = this.s2;
        if (constraintLayout21 != null) {
            constraintLayout21.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout22 = this.u2;
        if (constraintLayout22 != null) {
            constraintLayout22.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout23 = this.w2;
        if (constraintLayout23 != null) {
            constraintLayout23.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout24 = this.E2;
        if (constraintLayout24 != null) {
            constraintLayout24.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout25 = this.G2;
        if (constraintLayout25 != null) {
            constraintLayout25.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout26 = this.I2;
        if (constraintLayout26 != null) {
            constraintLayout26.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout27 = this.K2;
        if (constraintLayout27 != null) {
            constraintLayout27.setFocusableInTouchMode(zY);
        }
        LinearLayout linearLayout = this.M2;
        if (linearLayout != null) {
            linearLayout.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout28 = this.Q2;
        if (constraintLayout28 != null) {
            constraintLayout28.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout29 = this.S2;
        if (constraintLayout29 != null) {
            constraintLayout29.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout30 = this.U2;
        if (constraintLayout30 != null) {
            constraintLayout30.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout31 = this.W2;
        if (constraintLayout31 != null) {
            constraintLayout31.setFocusableInTouchMode(zY);
        }
        ConstraintLayout constraintLayout32 = this.b3;
        if (constraintLayout32 != null) {
            constraintLayout32.setFocusableInTouchMode(zY);
        }
        y5 y5Var10 = this.Q0;
        if (y5Var10 == null) {
            dh3.T("binding");
            throw null;
        }
        ((ConstraintLayout) y5Var10.Z).setOnClickListener(new x37(this, (byte) 1));
        ConstraintLayout constraintLayout33 = this.k1;
        if (constraintLayout33 == null) {
            dh3.T("clRemarks");
            throw null;
        }
        constraintLayout33.setOnClickListener(new x37(this, (byte) 12));
        ConstraintLayout constraintLayout34 = this.m1;
        if (constraintLayout34 != null) {
            constraintLayout34.setOnClickListener(new x37(this, (byte) 23));
        }
        ConstraintLayout constraintLayout35 = this.o1;
        if (constraintLayout35 != null) {
            constraintLayout35.setOnClickListener(new x37(this, (byte) 29));
        }
        ConstraintLayout constraintLayout36 = this.q1;
        final byte b2 = 0;
        if (constraintLayout36 != null) {
            constraintLayout36.setOnClickListener(new View.OnClickListener(this) { // from class: y37
                public final /* synthetic */ ServerActivity Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b3 = b2;
                    ServerActivity serverActivity = this.Y;
                    switch (b3) {
                        case 0:
                            EditText editText = serverActivity.r1;
                            if (editText != null) {
                                editText.requestFocus();
                            }
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                            EditText editText2 = serverActivity.t1;
                            if (editText2 != null) {
                                editText2.requestFocus();
                            }
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                            EditText editText3 = serverActivity.w1;
                            if (editText3 != null) {
                                editText3.requestFocus();
                            }
                            break;
                        case 3:
                            EditText editText4 = serverActivity.z1;
                            if (editText4 != null) {
                                editText4.requestFocus();
                            }
                            break;
                        case 4:
                            EditText editText5 = serverActivity.C1;
                            if (editText5 != null) {
                                editText5.requestFocus();
                            }
                            break;
                        default:
                            EditText editText6 = serverActivity.F1;
                            if (editText6 != null) {
                                editText6.requestFocus();
                            }
                            break;
                    }
                }
            });
        }
        ConstraintLayout constraintLayout37 = this.s1;
        if (constraintLayout37 != null) {
            constraintLayout37.setOnClickListener(new View.OnClickListener(this) { // from class: y37
                public final /* synthetic */ ServerActivity Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b3 = b;
                    ServerActivity serverActivity = this.Y;
                    switch (b3) {
                        case 0:
                            EditText editText = serverActivity.r1;
                            if (editText != null) {
                                editText.requestFocus();
                            }
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                            EditText editText2 = serverActivity.t1;
                            if (editText2 != null) {
                                editText2.requestFocus();
                            }
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                            EditText editText3 = serverActivity.w1;
                            if (editText3 != null) {
                                editText3.requestFocus();
                            }
                            break;
                        case 3:
                            EditText editText4 = serverActivity.z1;
                            if (editText4 != null) {
                                editText4.requestFocus();
                            }
                            break;
                        case 4:
                            EditText editText5 = serverActivity.C1;
                            if (editText5 != null) {
                                editText5.requestFocus();
                            }
                            break;
                        default:
                            EditText editText6 = serverActivity.F1;
                            if (editText6 != null) {
                                editText6.requestFocus();
                            }
                            break;
                    }
                }
            });
        }
        ConstraintLayout constraintLayout38 = this.v1;
        final byte b3 = 2;
        if (constraintLayout38 != null) {
            constraintLayout38.setOnClickListener(new View.OnClickListener(this) { // from class: y37
                public final /* synthetic */ ServerActivity Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b4 = b3;
                    ServerActivity serverActivity = this.Y;
                    switch (b4) {
                        case 0:
                            EditText editText = serverActivity.r1;
                            if (editText != null) {
                                editText.requestFocus();
                            }
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                            EditText editText2 = serverActivity.t1;
                            if (editText2 != null) {
                                editText2.requestFocus();
                            }
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                            EditText editText3 = serverActivity.w1;
                            if (editText3 != null) {
                                editText3.requestFocus();
                            }
                            break;
                        case 3:
                            EditText editText4 = serverActivity.z1;
                            if (editText4 != null) {
                                editText4.requestFocus();
                            }
                            break;
                        case 4:
                            EditText editText5 = serverActivity.C1;
                            if (editText5 != null) {
                                editText5.requestFocus();
                            }
                            break;
                        default:
                            EditText editText6 = serverActivity.F1;
                            if (editText6 != null) {
                                editText6.requestFocus();
                            }
                            break;
                    }
                }
            });
        }
        ConstraintLayout constraintLayout39 = this.y1;
        final byte b4 = 3;
        if (constraintLayout39 != null) {
            constraintLayout39.setOnClickListener(new View.OnClickListener(this) { // from class: y37
                public final /* synthetic */ ServerActivity Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b5 = b4;
                    ServerActivity serverActivity = this.Y;
                    switch (b5) {
                        case 0:
                            EditText editText = serverActivity.r1;
                            if (editText != null) {
                                editText.requestFocus();
                            }
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                            EditText editText2 = serverActivity.t1;
                            if (editText2 != null) {
                                editText2.requestFocus();
                            }
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                            EditText editText3 = serverActivity.w1;
                            if (editText3 != null) {
                                editText3.requestFocus();
                            }
                            break;
                        case 3:
                            EditText editText4 = serverActivity.z1;
                            if (editText4 != null) {
                                editText4.requestFocus();
                            }
                            break;
                        case 4:
                            EditText editText5 = serverActivity.C1;
                            if (editText5 != null) {
                                editText5.requestFocus();
                            }
                            break;
                        default:
                            EditText editText6 = serverActivity.F1;
                            if (editText6 != null) {
                                editText6.requestFocus();
                            }
                            break;
                    }
                }
            });
        }
        ConstraintLayout constraintLayout40 = this.B1;
        final byte b5 = 4;
        if (constraintLayout40 != null) {
            constraintLayout40.setOnClickListener(new View.OnClickListener(this) { // from class: y37
                public final /* synthetic */ ServerActivity Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b6 = b5;
                    ServerActivity serverActivity = this.Y;
                    switch (b6) {
                        case 0:
                            EditText editText = serverActivity.r1;
                            if (editText != null) {
                                editText.requestFocus();
                            }
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                            EditText editText2 = serverActivity.t1;
                            if (editText2 != null) {
                                editText2.requestFocus();
                            }
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                            EditText editText3 = serverActivity.w1;
                            if (editText3 != null) {
                                editText3.requestFocus();
                            }
                            break;
                        case 3:
                            EditText editText4 = serverActivity.z1;
                            if (editText4 != null) {
                                editText4.requestFocus();
                            }
                            break;
                        case 4:
                            EditText editText5 = serverActivity.C1;
                            if (editText5 != null) {
                                editText5.requestFocus();
                            }
                            break;
                        default:
                            EditText editText6 = serverActivity.F1;
                            if (editText6 != null) {
                                editText6.requestFocus();
                            }
                            break;
                    }
                }
            });
        }
        ConstraintLayout constraintLayout41 = this.E1;
        final byte b6 = 5;
        if (constraintLayout41 != null) {
            constraintLayout41.setOnClickListener(new View.OnClickListener(this) { // from class: y37
                public final /* synthetic */ ServerActivity Y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.Y = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b7 = b6;
                    ServerActivity serverActivity = this.Y;
                    switch (b7) {
                        case 0:
                            EditText editText = serverActivity.r1;
                            if (editText != null) {
                                editText.requestFocus();
                            }
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                            EditText editText2 = serverActivity.t1;
                            if (editText2 != null) {
                                editText2.requestFocus();
                            }
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                            EditText editText3 = serverActivity.w1;
                            if (editText3 != null) {
                                editText3.requestFocus();
                            }
                            break;
                        case 3:
                            EditText editText4 = serverActivity.z1;
                            if (editText4 != null) {
                                editText4.requestFocus();
                            }
                            break;
                        case 4:
                            EditText editText5 = serverActivity.C1;
                            if (editText5 != null) {
                                editText5.requestFocus();
                            }
                            break;
                        default:
                            EditText editText6 = serverActivity.F1;
                            if (editText6 != null) {
                                editText6.requestFocus();
                            }
                            break;
                    }
                }
            });
        }
        ConstraintLayout constraintLayout42 = this.H1;
        if (constraintLayout42 != null) {
            constraintLayout42.setOnClickListener(new x37(this, (byte) 2));
        }
        ConstraintLayout constraintLayout43 = this.J1;
        if (constraintLayout43 != null) {
            constraintLayout43.setOnClickListener(new x37(this, (byte) 3));
        }
        ConstraintLayout constraintLayout44 = this.M1;
        if (constraintLayout44 != null) {
            constraintLayout44.setOnClickListener(new x37(this, (byte) 4));
        }
        ConstraintLayout constraintLayout45 = this.O1;
        if (constraintLayout45 != null) {
            constraintLayout45.setOnClickListener(new x37(this, (byte) 5));
        }
        ConstraintLayout constraintLayout46 = this.Q1;
        if (constraintLayout46 != null) {
            constraintLayout46.setOnClickListener(new x37(this, (byte) 6));
        }
        ConstraintLayout constraintLayout47 = this.S1;
        if (constraintLayout47 != null) {
            constraintLayout47.setOnClickListener(new x37(this, (byte) 7));
        }
        ConstraintLayout constraintLayout48 = this.U1;
        if (constraintLayout48 != null) {
            constraintLayout48.setOnClickListener(new x37(this, (byte) 8));
        }
        ConstraintLayout constraintLayout49 = this.W1;
        if (constraintLayout49 != null) {
            constraintLayout49.setOnClickListener(new x37(this, (byte) 9));
        }
        ConstraintLayout constraintLayout50 = this.a2;
        if (constraintLayout50 != null) {
            constraintLayout50.setOnClickListener(new x37(this, (byte) 10));
        }
        ConstraintLayout constraintLayout51 = this.e2;
        if (constraintLayout51 != null) {
            constraintLayout51.setOnClickListener(new x37(this, (byte) 11));
        }
        LinearLayout linearLayout2 = this.q2;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new x37(this, (byte) 13));
        }
        ConstraintLayout constraintLayout52 = this.s2;
        if (constraintLayout52 != null) {
            constraintLayout52.setOnClickListener(new x37(this, (byte) 14));
        }
        ConstraintLayout constraintLayout53 = this.u2;
        if (constraintLayout53 != null) {
            constraintLayout53.setOnClickListener(new x37(this, (byte) 15));
        }
        ConstraintLayout constraintLayout54 = this.w2;
        if (constraintLayout54 != null) {
            constraintLayout54.setOnClickListener(new x37(this, (byte) 16));
        }
        ConstraintLayout constraintLayout55 = this.y2;
        if (constraintLayout55 != null) {
            constraintLayout55.setOnClickListener(new x37(this, (byte) 17));
        }
        ConstraintLayout constraintLayout56 = this.E2;
        if (constraintLayout56 != null) {
            constraintLayout56.setOnClickListener(new x37(this, (byte) 18));
        }
        ConstraintLayout constraintLayout57 = this.G2;
        if (constraintLayout57 != null) {
            constraintLayout57.setOnClickListener(new x37(this, (byte) 19));
        }
        ConstraintLayout constraintLayout58 = this.I2;
        if (constraintLayout58 != null) {
            constraintLayout58.setOnClickListener(new x37(this, (byte) 20));
        }
        ConstraintLayout constraintLayout59 = this.K2;
        if (constraintLayout59 != null) {
            constraintLayout59.setOnClickListener(new x37(this, (byte) 21));
        }
        LinearLayout linearLayout3 = this.M2;
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(new x37(this, (byte) 22));
        }
        ConstraintLayout constraintLayout60 = this.Q2;
        if (constraintLayout60 != null) {
            constraintLayout60.setOnClickListener(new x37(this, (byte) 24));
        }
        ConstraintLayout constraintLayout61 = this.S2;
        if (constraintLayout61 != null) {
            constraintLayout61.setOnClickListener(new x37(this, (byte) 25));
        }
        ConstraintLayout constraintLayout62 = this.U2;
        if (constraintLayout62 != null) {
            constraintLayout62.setOnClickListener(new x37(this, (byte) 26));
        }
        ConstraintLayout constraintLayout63 = this.W2;
        if (constraintLayout63 != null) {
            constraintLayout63.setOnClickListener(new x37(this, (byte) 27));
        }
        ConstraintLayout constraintLayout64 = this.b3;
        if (constraintLayout64 != null) {
            constraintLayout64.setOnClickListener(new x37(this, (byte) 28));
        }
        HappInputField happInputField2 = this.k2;
        if (happInputField2 != null) {
            happInputField2.setFilters(new InputFilter[]{new ud3(1, Integer.valueOf(XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax))});
        }
        EditText editText = this.I1;
        if (editText != null) {
            editText.setFilters(new ud3[]{new ud3(1, Integer.valueOf(XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMax))});
        }
        y5 y5Var11 = this.Q0;
        if (y5Var11 == null) {
            dh3.T("binding");
            throw null;
        }
        ((ConstraintLayout) y5Var11.Z).setVisibility(serverConfig == null ? 0 : 8);
        if (serverConfig != null) {
            ConstraintLayout constraintLayout65 = this.k1;
            if (constraintLayout65 == null) {
                dh3.T("clRemarks");
                throw null;
            }
            constraintLayout65.requestFocus();
        }
        EditText editText2 = this.r2;
        if (editText2 != null) {
            String strE = (serverConfig == null || (outboundBean = serverConfig.getOutboundBean()) == null || (streamSettings = outboundBean.getStreamSettings()) == null || (finalMask = streamSettings.getFinalMask()) == null) ? null : x79.e(finalMask);
            if (strE == null) {
                strE = "";
            }
            editText2.setText(wl7.e0(strE));
        }
        CustomSpinner customSpinner = this.V1;
        if (customSpinner != null) {
            LayoutInflater layoutInflater8 = getLayoutInflater();
            layoutInflater8.getClass();
            customSpinner.setAdapter((SpinnerAdapter) new rf7(this, layoutInflater8, customSpinner, D()));
            customSpinner.setOnItemSelectedListener(new b47(this, serverConfig));
        }
        CustomSpinner customSpinner2 = this.P1;
        if (customSpinner2 != null) {
            LayoutInflater layoutInflater9 = getLayoutInflater();
            layoutInflater9.getClass();
            if (this.U0 == EConfigType.HYSTERIA) {
                Object value = this.h1.getValue();
                value.getClass();
                strArrE = (String[]) value;
            } else {
                strArrE = E();
            }
            customSpinner2.setAdapter((SpinnerAdapter) new rf7(this, layoutInflater9, customSpinner2, strArrE));
            customSpinner2.setOnItemSelectedListener(new ob4(this, (byte) 4));
        }
        CustomSpinner customSpinner3 = this.N1;
        if (customSpinner3 != null) {
            Object value2 = this.a1.getValue();
            value2.getClass();
            A(customSpinner3, (String[]) value2, this.M1, null);
        }
        CustomSpinner customSpinner4 = this.T1;
        if (customSpinner4 != null) {
            Object value3 = this.i1.getValue();
            value3.getClass();
            A(customSpinner4, (String[]) value3, this.S1, null);
        }
        CustomSpinner customSpinner5 = this.x2;
        if (customSpinner5 != null) {
            Object value4 = this.j1.getValue();
            value4.getClass();
            A(customSpinner5, (String[]) value4, this.w2, null);
        }
        CustomSpinner customSpinner6 = this.X1;
        if (customSpinner6 != null) {
            String[] strArrJ = J(this.V0);
            if (strArrJ == null) {
                strArrJ = new String[]{"- - -"};
            }
            A(customSpinner6, strArrJ, this.W1, null);
        }
        CustomSpinner customSpinner7 = this.L1;
        if (customSpinner7 != null) {
            int i8 = iArr[this.U0.ordinal()];
            if (i8 == 1) {
                Object value5 = this.Y0.getValue();
                value5.getClass();
                A(customSpinner7, (String[]) value5, this.J1, null);
            } else if (i8 == 3) {
                Object value6 = this.Z0.getValue();
                value6.getClass();
                A(customSpinner7, (String[]) value6, this.J1, null);
            }
        }
        if (serverConfig != null) {
            B(serverConfig);
            return;
        }
        EditText editText3 = this.l1;
        if (editText3 == null) {
            dh3.T("etRemarks");
            throw null;
        }
        editText3.setText((CharSequence) null);
        EditText editText4 = this.n1;
        if (editText4 != null) {
            editText4.setText((CharSequence) null);
        }
        EditText editText5 = this.p1;
        if (editText5 != null) {
            editText5.setText(wl7.e0("443"));
        }
        EditText editText6 = this.r1;
        if (editText6 != null) {
            editText6.setText((CharSequence) null);
        }
        EditText editText7 = this.t1;
        if (editText7 != null) {
            editText7.setText((CharSequence) null);
        }
        EditText editText8 = this.w1;
        if (editText8 != null) {
            editText8.setText((CharSequence) null);
        }
        EditText editText9 = this.z1;
        if (editText9 != null) {
            editText9.setText((CharSequence) null);
        }
        EditText editText10 = this.C1;
        if (editText10 != null) {
            editText10.setText((CharSequence) null);
        }
        EditText editText11 = this.F1;
        if (editText11 != null) {
            editText11.setText((CharSequence) null);
        }
        EditText editText12 = this.I1;
        if (editText12 != null) {
            editText12.setText((CharSequence) null);
        }
        CustomSpinner customSpinner8 = this.L1;
        if (customSpinner8 != null) {
            customSpinner8.setSelection(0);
        }
        CustomSpinner customSpinner9 = this.V1;
        if (customSpinner9 != null) {
            customSpinner9.setSelection(0);
        }
        CustomSpinner customSpinner10 = this.X1;
        if (customSpinner10 != null) {
            customSpinner10.setSelection(0);
        }
        EditText editText13 = this.c2;
        if (editText13 != null) {
            editText13.setText((CharSequence) null);
        }
        EditText editText14 = this.g2;
        if (editText14 != null) {
            editText14.setText((CharSequence) null);
        }
        EditText editText15 = this.t2;
        if (editText15 != null) {
            editText15.setText(wl7.e0(""));
        }
        EditText editText16 = this.v2;
        if (editText16 != null) {
            editText16.setText(wl7.e0(""));
        }
        CustomSpinner customSpinner11 = this.P1;
        if (customSpinner11 != null) {
            customSpinner11.setSelection(0);
        }
        EditText editText17 = this.R1;
        if (editText17 != null) {
            editText17.setText((CharSequence) null);
        }
        CustomSpinner customSpinner12 = this.N1;
        if (customSpinner12 != null) {
            customSpinner12.setSelection(0);
        }
        EditText editText18 = this.F2;
        if (editText18 != null) {
            editText18.setText((CharSequence) null);
        }
        EditText editText19 = this.N2;
        if (editText19 != null) {
            editText19.setText(wl7.e0("0"));
        }
        EditText editText20 = this.O2;
        if (editText20 != null) {
            editText20.setText(wl7.e0("0"));
        }
        EditText editText21 = this.P2;
        if (editText21 != null) {
            editText21.setText(wl7.e0("0"));
        }
        EditText editText22 = this.R2;
        if (editText22 != null) {
            editText22.setText(wl7.e0("172.16.0.2/32,2606:4700:110:8f81:d551:a0:532e:a2b3/128"));
        }
        EditText editText23 = this.T2;
        if (editText23 != null) {
            editText23.setText(wl7.e0("1420"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:117:0x019a  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:157:0x0225  */
    /* JADX WARN: Code duplicated, block: B:90:0x0141  */
    public final boolean G(XRayConfig.OutboundBean.StreamSettingsBean streamSettingsBean, int i, ServerConfig serverConfig) throws na2 {
        Editable text;
        String string;
        String string2;
        EditText editText;
        Editable text2;
        String string3;
        String string4;
        String str;
        XRayConfig.OutboundBean outboundBean;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings;
        XRayConfig.OutboundBean.OutSettingsBean settings;
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean rj6Var;
        String string5;
        String string6;
        String string7;
        Editable text3;
        Editable text4;
        Editable text5;
        String string8;
        Editable text6;
        Editable text7;
        Editable text8;
        String string9;
        String string10;
        Editable text9;
        String string11;
        String string12;
        Integer numB0;
        Editable text10;
        String string13;
        String string14;
        XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean hysteriaSettings;
        Editable text11;
        String string15;
        String text12;
        EditText editText2 = this.R1;
        if (editText2 == null || (text = editText2.getText()) == null || (string = text.toString()) == null || (string2 = fm7.R0(string).toString()) == null || (editText = this.z2) == null || (text2 = editText.getText()) == null || (string3 = text2.toString()) == null || (string4 = fm7.R0(string3).toString()) == null) {
            return false;
        }
        HappInputField happInputField = this.A2;
        String string16 = null;
        String string17 = (happInputField == null || (text12 = happInputField.getText()) == null) ? null : fm7.R0(text12).toString();
        CustomSpinner customSpinner = this.P1;
        if (customSpinner == null || (str = (String) eu.u0(customSpinner.getSelectedItemPosition(), E())) == null || (outboundBean = serverConfig.getOutboundBean()) == null || (streamSettings = outboundBean.getStreamSettings()) == null || (settings = serverConfig.getOutboundBean().getSettings()) == null) {
            return false;
        }
        EditText editText3 = this.n1;
        settings.m((editText3 == null || (text11 = editText3.getText()) == null || (string15 = text11.toString()) == null) ? null : fm7.R0(string15).toString());
        settings.s(Integer.valueOf(i));
        EditText editText4 = this.r1;
        if (editText4 != null && (text10 = editText4.getText()) != null && (string13 = text10.toString()) != null && (string14 = fm7.R0(string13).toString()) != null && (hysteriaSettings = streamSettingsBean.getHysteriaSettings()) != null) {
            hysteriaSettings.c(string14);
        }
        XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean hysteriaSettings2 = streamSettingsBean.getHysteriaSettings();
        if (hysteriaSettings2 != null) {
            EditText editText5 = this.I1;
            hysteriaSettings2.d((editText5 == null || (text9 = editText5.getText()) == null || (string11 = text9.toString()) == null || (string12 = fm7.R0(string11).toString()) == null || (numB0 = mm7.b0(string12)) == null) ? null : Integer.valueOf(x97.n(numB0.intValue(), 2, XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMax)));
        }
        try {
            EditText editText6 = this.r2;
            if (editText6 == null || (text8 = editText6.getText()) == null || (string9 = text8.toString()) == null || (string10 = fm7.R0(string9).toString()) == null) {
                rj6Var = null;
            } else {
                if (string10.length() <= 0) {
                    string10 = null;
                }
                if (string10 != null) {
                    kw4 kw4Var = kw4.a;
                    a aVarG = kw4.g();
                    aVarG.getClass();
                    rj6Var = (XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean) aVarG.c(string10, new yi8(XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean.class));
                } else {
                    rj6Var = null;
                }
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (sj6.a(rj6Var) != null) {
            throw new na2();
        }
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMaskBean = rj6Var;
        if (finalMaskBean == null || (finalMaskBean.getTcp() == null && finalMaskBean.getUdp() == null && finalMaskBean.getQuicParams() == null)) {
            streamSettingsBean.o(new XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean(null, null, 7));
            ArrayList arrayList = new ArrayList();
            EditText editText7 = this.w1;
            if (editText7 == null || (text7 = editText7.getText()) == null) {
                string5 = null;
            } else {
                if (fm7.o0(text7)) {
                    text7 = null;
                }
                if (text7 != null) {
                    string5 = text7.toString();
                } else {
                    string5 = null;
                }
            }
            EditText editText8 = this.z1;
            if (editText8 == null || (text6 = editText8.getText()) == null) {
                string6 = null;
            } else {
                if (fm7.o0(text6)) {
                    text6 = null;
                }
                if (text6 != null) {
                    string6 = text6.toString();
                } else {
                    string6 = null;
                }
            }
            if (string5 != null || string6 != null) {
                arrayList.add(new XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean("udphop", XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean.UdpMaskSettingBean.a(null, null, null, string6, string5, 287)));
            }
            EditText editText9 = this.t1;
            if (editText9 != null && (text5 = editText9.getText()) != null && (string8 = text5.toString()) != null) {
                String str2 = !fm7.o0(string8) ? string8 : null;
                if (str2 != null) {
                    arrayList.add(new XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean("salamander", XRayConfig.OutboundBean.StreamSettingsBean.UdpMasksBean.UdpMaskSettingBean.a(str2, null, null, null, null, 509)));
                }
            }
            if (!arrayList.isEmpty()) {
                XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask = streamSettingsBean.getFinalMask();
                finalMask.getClass();
                finalMask.f(arrayList);
            }
            EditText editText10 = this.C1;
            if (editText10 == null || (text4 = editText10.getText()) == null) {
                string7 = null;
            } else {
                if (fm7.o0(text4)) {
                    text4 = null;
                }
                if (text4 != null) {
                    string7 = text4.toString();
                } else {
                    string7 = null;
                }
            }
            EditText editText11 = this.F1;
            if (editText11 != null && (text3 = editText11.getText()) != null) {
                if (fm7.o0(text3)) {
                    text3 = null;
                }
                if (text3 != null) {
                    string16 = text3.toString();
                }
            }
            if (string7 != null || string16 != null) {
                XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMask2 = streamSettingsBean.getFinalMask();
                finalMask2.getClass();
                finalMask2.d(new XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean(string16, string7));
            }
        } else {
            streamSettingsBean.o(finalMaskBean);
        }
        cb8.a(streamSettings, str, string2, null, string4, string17, "h3", null, null, null, null, null);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: su.happ.proxyutility.ui.ServerActivity */
    /* JADX WARN: Code duplicated, block: B:147:0x026a  */
    /* JADX WARN: Code duplicated, block: B:149:0x0273  */
    /* JADX WARN: Code duplicated, block: B:150:0x0278  */
    /* JADX WARN: Code duplicated, block: B:153:0x028c  */
    /* JADX WARN: Code duplicated, block: B:154:0x0291  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void H() {
        XRayConfig.OutboundBean outboundBean;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings;
        dn8 rj6Var;
        List peers;
        XRayConfig.OutboundBean.OutSettingsBean.WireGuardBean wireGuardBean;
        XRayConfig.OutboundBean.OutSettingsBean settings;
        List servers;
        XRayConfig.OutboundBean.OutSettingsBean.ServersBean serversBean;
        EditText editText;
        Editable text;
        EditText editText2;
        Editable text2;
        XRayConfig.OutboundBean.OutSettingsBean settings2;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettings2;
        Boolean rj6Var2;
        EditText editText3 = this.l1;
        if (editText3 == null) {
            dh3.T("etRemarks");
            throw null;
        }
        if (TextUtils.isEmpty(editText3.getText().toString())) {
            x79.h(this, y46.server_name);
            return;
        }
        EditText editText4 = this.n1;
        if (TextUtils.isEmpty(String.valueOf(editText4 != null ? editText4.getText() : null))) {
            x79.h(this, y46.server_address);
            return;
        }
        ss8 ss8Var = ss8.a;
        EditText editText5 = this.p1;
        int iC = ss8.C(0, String.valueOf(editText5 != null ? editText5.getText() : null));
        if (iC <= 0) {
            x79.h(this, y46.server_port);
            return;
        }
        kw4 kw4Var = kw4.a;
        ServerConfig serverConfigB = kw4.b(C());
        if (serverConfigB == null) {
            ServerConfig.Companion companion = ServerConfig.INSTANCE;
            EConfigType eConfigType = this.U0;
            companion.getClass();
            serverConfigB = ServerConfig.Companion.a(eConfigType);
        }
        EditText editText6 = this.r1;
        if (TextUtils.isEmpty(String.valueOf(editText6 != null ? editText6.getText() : null))) {
            switch (z37.a[serverConfigB.getConfigType().ordinal()]) {
                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                case 5:
                    x79.h(this, y46.server_id);
                    return;
                case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                case 4:
                    break;
                case 3:
                case 6:
                case 8:
                    x79.h(this, y46.server_id3);
                    return;
                case 7:
                    x79.h(this, y46.server_secret_key);
                    return;
                default:
                    b61.c();
                    return;
            }
        }
        CustomSpinner customSpinner = this.P1;
        if (customSpinner != null && serverConfigB.getConfigType() == EConfigType.TROJAN && TextUtils.isEmpty(E()[customSpinner.getSelectedItemPosition()])) {
            x79.h(this, y46.server_stream_security);
            return;
        }
        EditText editText7 = this.l1;
        if (editText7 == null) {
            dh3.T("etRemarks");
            throw null;
        }
        serverConfigB.m(fm7.R0(editText7.getText().toString()).toString());
        XRayConfig.OutboundBean outboundBean2 = serverConfigB.getOutboundBean();
        if (outboundBean2 != null && (streamSettings2 = outboundBean2.getStreamSettings()) != null && serverConfigB.getConfigType() == EConfigType.HYSTERIA) {
            try {
                rj6Var2 = Boolean.valueOf(G(streamSettings2, iC, serverConfigB));
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var2 = new rj6(th);
            }
            Throwable thA = sj6.a(rj6Var2);
            if (thA != null && (thA instanceof na2)) {
                x79.h(this, y46.toast_invalid_final_mask);
                return;
            } else if (!(rj6Var2 instanceof rj6) && !rj6Var2.booleanValue()) {
                return;
            }
        }
        XRayConfig.OutboundBean outboundBean3 = serverConfigB.getOutboundBean();
        if (outboundBean3 != null && (settings2 = outboundBean3.getSettings()) != null) {
            settings2.w();
            EditText editText8 = this.n1;
            settings2.m(fm7.R0(String.valueOf(editText8 != null ? editText8.getText() : null)).toString());
            settings2.s(Integer.valueOf(iC));
            EditText editText9 = this.r1;
            settings2.q(fm7.R0(String.valueOf(editText9 != null ? editText9.getText() : null)).toString());
            if (serverConfigB.getConfigType() == EConfigType.VMESS) {
                Object value = this.Y0.getValue();
                value.getClass();
                String[] strArr = (String[]) value;
                CustomSpinner customSpinner2 = this.L1;
                settings2.v(strArr[customSpinner2 != null ? customSpinner2.getSelectedItemPosition() : 0]);
            } else if (serverConfigB.getConfigType() == EConfigType.VLESS) {
                EditText editText10 = this.K1;
                settings2.o(fm7.R0(String.valueOf(editText10 != null ? editText10.getText() : null)).toString());
                Object value2 = this.a1.getValue();
                value2.getClass();
                String[] strArr2 = (String[]) value2;
                CustomSpinner customSpinner3 = this.N1;
                settings2.p(strArr2[customSpinner3 != null ? customSpinner3.getSelectedItemPosition() : 0]);
            }
        }
        XRayConfig.OutboundBean outboundBean4 = serverConfigB.getOutboundBean();
        if (outboundBean4 != null && (settings = outboundBean4.getSettings()) != null && (servers = settings.getServers()) != null && (serversBean = (XRayConfig.OutboundBean.OutSettingsBean.ServersBean) servers.get(0)) != null) {
            EditText editText11 = this.n1;
            serversBean.g(fm7.R0(String.valueOf(editText11 != null ? editText11.getText() : null)).toString());
            serversBean.k(iC);
            if (serverConfigB.getConfigType() == EConfigType.SHADOWSOCKS) {
                EditText editText12 = this.r1;
                serversBean.j(fm7.R0(String.valueOf(editText12 != null ? editText12.getText() : null)).toString());
                Object value3 = this.Z0.getValue();
                value3.getClass();
                String[] strArr3 = (String[]) value3;
                CustomSpinner customSpinner4 = this.L1;
                serversBean.i(strArr3[customSpinner4 != null ? customSpinner4.getSelectedItemPosition() : 0]);
            } else if (serverConfigB.getConfigType() == EConfigType.SOCKS) {
                EditText editText13 = this.K1;
                if (TextUtils.isEmpty(editText13 != null ? editText13.getText() : null)) {
                    EditText editText14 = this.r1;
                    if (TextUtils.isEmpty(editText14 != null ? editText14.getText() : null)) {
                        serversBean.l(null);
                    } else {
                        XRayConfig.OutboundBean.OutSettingsBean.ServersBean.SocksUsersBean socksUsersBean = new XRayConfig.OutboundBean.OutSettingsBean.ServersBean.SocksUsersBean();
                        editText = this.K1;
                        if (editText != null) {
                            text = editText.getText();
                        } else {
                            text = null;
                        }
                        socksUsersBean.d(fm7.R0(String.valueOf(text)).toString());
                        editText2 = this.r1;
                        if (editText2 != null) {
                            text2 = editText2.getText();
                        } else {
                            text2 = null;
                        }
                        socksUsersBean.c(fm7.R0(String.valueOf(text2)).toString());
                        serversBean.l(i21.K(socksUsersBean));
                    }
                } else {
                    XRayConfig.OutboundBean.OutSettingsBean.ServersBean.SocksUsersBean socksUsersBean2 = new XRayConfig.OutboundBean.OutSettingsBean.ServersBean.SocksUsersBean();
                    editText = this.K1;
                    if (editText != null) {
                        text = editText.getText();
                    } else {
                        text = null;
                    }
                    socksUsersBean2.d(fm7.R0(String.valueOf(text)).toString());
                    editText2 = this.r1;
                    if (editText2 != null) {
                        text2 = editText2.getText();
                    } else {
                        text2 = null;
                    }
                    socksUsersBean2.c(fm7.R0(String.valueOf(text2)).toString());
                    serversBean.l(i21.K(socksUsersBean2));
                }
            } else if (serverConfigB.getConfigType() == EConfigType.TROJAN) {
                EditText editText15 = this.r1;
                serversBean.j(fm7.R0(String.valueOf(editText15 != null ? editText15.getText() : null)).toString());
            }
        }
        XRayConfig.OutboundBean outboundBean5 = serverConfigB.getOutboundBean();
        XRayConfig.OutboundBean.OutSettingsBean settings3 = outboundBean5 != null ? outboundBean5.getSettings() : null;
        if (settings3 != null && (peers = settings3.getPeers()) != null && ((XRayConfig.OutboundBean.OutSettingsBean.WireGuardBean) peers.get(0)) != null) {
            EditText editText16 = this.r1;
            settings3.u(fm7.R0(String.valueOf(editText16 != null ? editText16.getText() : null)).toString());
            List peers2 = settings3.getPeers();
            if (peers2 != null && (wireGuardBean = (XRayConfig.OutboundBean.OutSettingsBean.WireGuardBean) peers2.get(0)) != null) {
                EditText editText17 = this.F2;
                wireGuardBean.f(fm7.R0(String.valueOf(editText17 != null ? editText17.getText() : null)).toString());
                EditText editText18 = this.a3;
                wireGuardBean.e(fm7.R0(String.valueOf(editText18 != null ? editText18.getText() : null)).toString());
                ss8 ss8Var2 = ss8.a;
                EditText editText19 = this.n1;
                wireGuardBean.d(ss8.m(fm7.R0(String.valueOf(editText19 != null ? editText19.getText() : null)).toString()) + ":" + iC);
            }
            ss8 ss8Var3 = ss8.a;
            EditText editText20 = this.N2;
            int iC2 = ss8.C(0, String.valueOf(editText20 != null ? editText20.getText() : null));
            EditText editText21 = this.O2;
            int iC3 = ss8.C(0, String.valueOf(editText21 != null ? editText21.getText() : null));
            EditText editText22 = this.P2;
            int iC4 = ss8.C(0, String.valueOf(editText22 != null ? editText22.getText() : null));
            if (iC2 > 0 || iC3 > 0 || iC4 > 0) {
                settings3.t(i21.L(new Integer[]{Integer.valueOf(iC2), Integer.valueOf(iC3), Integer.valueOf(iC4)}));
            } else {
                settings3.t(null);
            }
            EditText editText23 = this.R2;
            String strValueOf = String.valueOf(editText23 != null ? editText23.getText() : null);
            kc6 kc6Var = x79.a;
            Pattern patternCompile = Pattern.compile("\\s+");
            patternCompile.getClass();
            String strReplaceAll = patternCompile.matcher(strValueOf).replaceAll("");
            strReplaceAll.getClass();
            settings3.m(fm7.F0(strReplaceAll, new String[]{","}, 6));
            EditText editText24 = this.T2;
            settings3.r(Integer.valueOf(ss8.C(0, String.valueOf(editText24 != null ? editText24.getText() : null))));
        }
        if (serverConfigB.getConfigType() != EConfigType.HYSTERIA && (outboundBean = serverConfigB.getOutboundBean()) != null && (streamSettings = outboundBean.getStreamSettings()) != null) {
            try {
                I(streamSettings);
                rj6Var = dn8.a;
            } catch (Throwable th2) {
                if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                    throw th2;
                }
                rj6Var = new rj6(th2);
            }
            Throwable thA2 = sj6.a(rj6Var);
            if (thA2 != null) {
                if (thA2 instanceof na2) {
                    x79.h(this, y46.toast_invalid_final_mask);
                    return;
                } else if (thA2 instanceof fr3) {
                    x79.h(this, y46.toast_invalid_xhttp_extra);
                    return;
                }
            }
        }
        if (fm7.o0(serverConfigB.getSubscriptionId())) {
            vz7 vz7Var = this.W0;
            SubId subId = (SubId) vz7Var.getValue();
            String strD = subId != null ? subId.d() : null;
            if (strD != null && (!fm7.o0(strD))) {
                SubId subId2 = (SubId) vz7Var.getValue();
                String strD2 = subId2 != null ? subId2.d() : null;
                SubId subId3 = strD2 != null ? new SubId(strD2) : null;
                if (subId3 == null) {
                    bt.q("Required value was null.");
                    return;
                }
                serverConfigB.n(subId3.d());
            }
        }
        kw4 kw4Var2 = kw4.a;
        kw4.e(C(), serverConfigB);
        x79.h(this, y46.toast_success);
        finish();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    public final void I(XRayConfig.OutboundBean.StreamSettingsBean streamSettingsBean) throws na2 {
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean rj6Var;
        XRayConfig.OutboundBean.StreamSettingsBean streamSettingsBean2;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        String str;
        Editable text;
        String string;
        String string2;
        Editable text2;
        String string3;
        String string4;
        Editable text3;
        String string5;
        String string6;
        Editable text4;
        String string7;
        String string8;
        String[] strArrJ;
        String text5;
        Integer numB0;
        int iIntValue;
        String text6;
        Integer numB1;
        String text7;
        Integer numB2;
        String text8;
        Integer numB3;
        Editable text9;
        String string9;
        Editable text10;
        String string10;
        Editable text11;
        String string11;
        Editable text12;
        String string12;
        String text13;
        String text14;
        Editable text15;
        String string13;
        Editable text16;
        String string14;
        Editable text17;
        String string15;
        Editable text18;
        String string16;
        EditText editText;
        Editable text19;
        Editable text20;
        String string17;
        String string18;
        String str2 = null;
        try {
            EditText editText2 = this.r2;
            if (editText2 == null || (text20 = editText2.getText()) == null || (string17 = text20.toString()) == null || (string18 = fm7.R0(string17).toString()) == null) {
                rj6Var = null;
            } else {
                if (string18.length() <= 0) {
                    string18 = null;
                }
                if (string18 != null) {
                    kw4 kw4Var = kw4.a;
                    a aVarG = kw4.g();
                    aVarG.getClass();
                    rj6Var = (XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean) aVarG.c(string18, new yi8(XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean.class));
                } else {
                    rj6Var = null;
                }
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (sj6.a(rj6Var) != null) {
            throw new na2();
        }
        XRayConfig.OutboundBean.StreamSettingsBean.FinalMaskBean finalMaskBean = rj6Var;
        if (finalMaskBean == null && ((editText = this.r2) == null || (text19 = editText.getText()) == null || !fm7.o0(text19))) {
            streamSettingsBean2 = streamSettingsBean;
        } else {
            streamSettingsBean2 = streamSettingsBean;
            streamSettingsBean2.o(finalMaskBean);
        }
        CustomSpinner customSpinner = this.V1;
        if (customSpinner != null) {
            int selectedItemPosition = customSpinner.getSelectedItemPosition();
            CustomSpinner customSpinner2 = this.X1;
            Integer numValueOf4 = customSpinner2 != null ? Integer.valueOf(customSpinner2.getSelectedItemPosition()) : null;
            EditText editText3 = this.c2;
            String string19 = (editText3 == null || (text18 = editText3.getText()) == null || (string16 = text18.toString()) == null) ? null : fm7.R0(string16).toString();
            EditText editText4 = this.g2;
            String string20 = (editText4 == null || (text17 = editText4.getText()) == null || (string15 = text17.toString()) == null) ? null : fm7.R0(string15).toString();
            EditText editText5 = this.R1;
            String string21 = (editText5 == null || (text16 = editText5.getText()) == null || (string14 = text16.toString()) == null) ? null : fm7.R0(string14).toString();
            CustomSpinner customSpinner3 = this.P1;
            if (customSpinner3 != null) {
                int selectedItemPosition2 = customSpinner3.getSelectedItemPosition();
                CustomSpinner customSpinner4 = this.T1;
                Integer numValueOf5 = customSpinner4 != null ? Integer.valueOf(customSpinner4.getSelectedItemPosition()) : null;
                CustomSpinner customSpinner5 = this.x2;
                Integer numValueOf6 = customSpinner5 != null ? Integer.valueOf(customSpinner5.getSelectedItemPosition()) : null;
                EditText editText6 = this.z2;
                String string22 = (editText6 == null || (text15 = editText6.getText()) == null || (string13 = text15.toString()) == null) ? null : fm7.R0(string13).toString();
                HappInputField happInputField = this.A2;
                String string23 = (happInputField == null || (text14 = happInputField.getText()) == null) ? null : fm7.R0(text14).toString();
                HappInputField happInputField2 = this.C2;
                String string24 = (happInputField2 == null || (text13 = happInputField2.getText()) == null) ? null : fm7.R0(text13).toString();
                EditText editText7 = this.F2;
                String string25 = (editText7 == null || (text12 = editText7.getText()) == null || (string12 = text12.toString()) == null) ? null : fm7.R0(string12).toString();
                EditText editText8 = this.H2;
                String string26 = (editText8 == null || (text11 = editText8.getText()) == null || (string11 = text11.toString()) == null) ? null : fm7.R0(string11).toString();
                EditText editText9 = this.J2;
                String string27 = (editText9 == null || (text10 = editText9.getText()) == null || (string10 = text10.toString()) == null) ? null : fm7.R0(string10).toString();
                EditText editText10 = this.L2;
                String string28 = (editText10 == null || (text9 = editText10.getText()) == null || (string9 = text9.toString()) == null) ? null : fm7.R0(string9).toString();
                HappInputField happInputField3 = this.i2;
                if (happInputField3 == null || (text8 = happInputField3.getText()) == null || (numB3 = mm7.b0(text8)) == null) {
                    numValueOf = null;
                } else {
                    int iIntValue2 = numB3.intValue();
                    if (iIntValue2 < 21) {
                        iIntValue2 = 21;
                    }
                    numValueOf = Integer.valueOf(iIntValue2);
                }
                HappInputField happInputField4 = this.k2;
                Integer numValueOf7 = (happInputField4 == null || (text7 = happInputField4.getText()) == null || (numB2 = mm7.b0(text7)) == null) ? null : Integer.valueOf(x97.n(numB2.intValue(), 10, XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax));
                HappInputField happInputField5 = this.m2;
                if (happInputField5 == null || (text6 = happInputField5.getText()) == null || (numB1 = mm7.b0(text6)) == null) {
                    numValueOf2 = null;
                } else {
                    int iIntValue3 = numB1.intValue();
                    if (iIntValue3 < 1) {
                        iIntValue3 = 1;
                    }
                    numValueOf2 = Integer.valueOf(iIntValue3);
                }
                HappInputField happInputField6 = this.o2;
                if (happInputField6 == null || (text5 = happInputField6.getText()) == null || (numB0 = mm7.b0(text5)) == null) {
                    numValueOf3 = null;
                } else {
                    int iIntValue4 = numB0.intValue();
                    if (numValueOf != null && iIntValue4 < (iIntValue = numValueOf.intValue())) {
                        iIntValue4 = iIntValue;
                    }
                    numValueOf3 = Integer.valueOf(iIntValue4);
                }
                String str3 = (numValueOf4 == null || (strArrJ = J(D()[selectedItemPosition])) == null) ? null : strArrJ[numValueOf4.intValue()];
                String str4 = D()[selectedItemPosition];
                EditText editText11 = this.V2;
                String str5 = (editText11 == null || (text4 = editText11.getText()) == null || (string7 = text4.toString()) == null || (string8 = fm7.R0(string7).toString()) == null || string8.length() <= 0) ? null : string8;
                EditText editText12 = this.t2;
                String str6 = (editText12 == null || (text3 = editText12.getText()) == null || (string5 = text3.toString()) == null || (string6 = fm7.R0(string5).toString()) == null || fm7.o0(string6)) ? null : string6;
                EditText editText13 = this.v2;
                String str7 = (editText13 == null || (text2 = editText13.getText()) == null || (string3 = text2.toString()) == null || (string4 = fm7.R0(string3).toString()) == null || fm7.o0(string4)) ? null : string4;
                EditText editText14 = this.X2;
                String strN = (string21 == null || !(fm7.o0(string21) ^ true)) ? XRayConfig.OutboundBean.StreamSettingsBean.n(streamSettingsBean2, str4, str3, string19, string20, string20, str3, string20, string19, str6, str7, (editText14 == null || (text = editText14.getText()) == null || (string = text.toString()) == null || (string2 = fm7.R0(string).toString()) == null || fm7.o0(string2)) ? null : string2, str5, finalMaskBean, numValueOf, numValueOf7, numValueOf2, numValueOf3, null, 131072) : string21;
                String str8 = E()[selectedItemPosition2];
                if (numValueOf5 != null) {
                    Object value = this.i1.getValue();
                    value.getClass();
                    str = ((String[]) value)[numValueOf5.intValue()];
                } else {
                    str = null;
                }
                if (numValueOf6 != null) {
                    Object value2 = this.j1.getValue();
                    value2.getClass();
                    str2 = ((String[]) value2)[numValueOf6.intValue()];
                }
                str8.getClass();
                strN.getClass();
                cb8.a(streamSettingsBean, str8, strN, str, string22, string23, str2, string25, string26, string27, string28, string24);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String[] J(String str) {
        if (dh3.f(str, EConfigNetworkType.TCP.getType())) {
            Object value = this.c1.getValue();
            value.getClass();
            return (String[]) value;
        }
        if (dh3.f(str, EConfigNetworkType.KCP.getType())) {
            Object value2 = this.d1.getValue();
            value2.getClass();
            return (String[]) value2;
        }
        if (dh3.f(str, EConfigNetworkType.GRPC.getType())) {
            Object value3 = this.e1.getValue();
            value3.getClass();
            return (String[]) value3;
        }
        if (!dh3.f(str, EConfigNetworkType.XHTTP.getType())) {
            return null;
        }
        Object value4 = this.f1.getValue();
        value4.getClass();
        return (String[]) value4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: su.happ.proxyutility.ui.ServerActivity */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final void onCreate(Bundle bundle) {
        Toolbar toolbarB;
        EConfigType configType;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(t46.activity_server, (ViewGroup) null, false);
        int i = e46.cl_protocol;
        ConstraintLayout constraintLayoutB = ln7.b(viewInflate, i);
        if (constraintLayoutB != null) {
            i = e46.container_config;
            FrameLayout frameLayout = (FrameLayout) ln7.b(viewInflate, i);
            if (frameLayout != null) {
                i = e46.fl_protocol;
                if (((FrameLayout) ln7.b(viewInflate, i)) != null) {
                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                    i = e46.scroll_settings;
                    if (ln7.b(viewInflate, i) != null) {
                        i = e46.spinner_protocol;
                        CustomSpinner customSpinner = (CustomSpinner) ln7.b(viewInflate, i);
                        if (customSpinner != null) {
                            i = e46.textView8;
                            if (((TextView) ln7.b(viewInflate, i)) != null && (toolbarB = ln7.b(viewInflate, (i = e46.toolbar))) != null) {
                                this.Q0 = new y5(linearLayout, constraintLayoutB, frameLayout, customSpinner, toolbarB, (byte) 1);
                                setContentView(linearLayout);
                                y5 y5Var = this.Q0;
                                if (y5Var == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                LinearLayout linearLayout2 = (LinearLayout) y5Var.Y;
                                linearLayout2.getClass();
                                setBarsParams(linearLayout2);
                                y5 y5Var2 = this.Q0;
                                if (y5Var2 == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                r((Toolbar) y5Var2.f0);
                                setTitle(getString(fm7.o0(C()) ? y46.menu_item_import_config_manually : y46.title_server));
                                this.V0 = D()[0];
                                String str = E()[0];
                                kw4 kw4Var = kw4.a;
                                ServerConfig serverConfigB = kw4.b(C());
                                if (serverConfigB == null || (configType = serverConfigB.getConfigType()) == null) {
                                    configType = this.U0;
                                }
                                this.U0 = configType;
                                F(serverConfigB);
                                y5 y5Var3 = this.Q0;
                                if (y5Var3 == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                CustomSpinner customSpinner2 = (CustomSpinner) y5Var3.h0;
                                LayoutInflater layoutInflater = getLayoutInflater();
                                layoutInflater.getClass();
                                y5 y5Var4 = this.Q0;
                                if (y5Var4 == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                CustomSpinner customSpinner3 = (CustomSpinner) y5Var4.h0;
                                Object value = this.X0.getValue();
                                value.getClass();
                                customSpinner2.setAdapter((SpinnerAdapter) new rf7(this, layoutInflater, customSpinner3, (String[]) value));
                                y5 y5Var5 = this.Q0;
                                if (y5Var5 == null) {
                                    dh3.T("binding");
                                    throw null;
                                }
                                ((CustomSpinner) y5Var5.h0).setSelection(this.U0.ordinal());
                                y5 y5Var6 = this.Q0;
                                if (y5Var6 != null) {
                                    ((CustomSpinner) y5Var6.h0).setOnItemSelectedListener(new c47(this, serverConfigB));
                                    return;
                                } else {
                                    dh3.T("binding");
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
        }
        b61.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(v46.action_server, menu);
        MenuItem menuItemFindItem = menu.findItem(e46.save_config);
        View actionView = menuItemFindItem.getActionView();
        if (actionView != null) {
            actionView.setOnClickListener(new x37(this, (byte) 0));
        }
        if (!fm7.o0(C()) && ((Boolean) this.T0.getValue()).booleanValue()) {
            menuItemFindItem.setVisible(false);
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != e46.save_config) {
            return super.onOptionsItemSelected(menuItem);
        }
        H();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final Toolbar v() {
        y5 y5Var = this.Q0;
        if (y5Var != null) {
            return (Toolbar) y5Var.f0;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final boolean x() {
        y5 y5Var = this.Q0;
        if (y5Var != null) {
            return ((ConstraintLayout) y5Var.Z).requestFocus();
        }
        dh3.T("binding");
        throw null;
    }
}
