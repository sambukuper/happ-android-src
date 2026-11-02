package su.happ.proxyutility.feature.about_settings;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ComponentActivity;
import defpackage.ak7;
import defpackage.e46;
import defpackage.i;
import defpackage.ln7;
import defpackage.p;
import defpackage.q;
import defpackage.s;
import defpackage.s24;
import defpackage.ss8;
import defpackage.t46;
import defpackage.w;
import defpackage.y;
import defpackage.y46;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import libxray.Libxray;
import su.happ.proxyutility.dto.ProviderId;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.about_settings.AboutSettingsActivity;
import su.happ.proxyutility.ui.BaseActivity;
import su.happ.proxyutility.ui.foundation.component.HappForwardField;
import su.happ.proxyutility.ui.foundation.component.HappInfoField;
import su.happ.proxyutility.ui.foundation.component.HappSettingsDivider;
import su.happ.proxyutility.ui.foundation.component.HappSettingsTitle;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/about_settings/AboutSettingsActivity;", "Lsu/happ/proxyutility/ui/BaseActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class AboutSettingsActivity extends BaseActivity {
    public static final /* synthetic */ int T0 = 0;
    public t5 Q0;
    public final y5 R0 = new y5(yb6.a.b(y.class), new q(this, (byte) 1), new q(this, (byte) 0), new q(this, (byte) 2));
    public final vz7 S0 = new vz7(new i(this, (byte) 3));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r20v0, resolved type: su.happ.proxyutility.feature.about_settings.AboutSettingsActivity */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final void onCreate(Bundle bundle) {
        Toolbar toolbarB;
        super.onCreate(bundle);
        final byte b = 0;
        View viewInflate = getLayoutInflater().inflate(t46.activity_about_settings, (ViewGroup) null, false);
        int i = e46.cl_about_block_3;
        if (((LinearLayout) ln7.b(viewInflate, i)) != null) {
            i = e46.divider_android_version;
            if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                i = e46.divider_email;
                if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                    i = e46.divider_licenses;
                    if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                        i = e46.divider_model_name;
                        if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                            i = e46.divider_policy;
                            if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                                i = e46.divider_terms;
                                if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                                    i = e46.divider_xray_version;
                                    if (((HappSettingsDivider) ln7.b(viewInflate, i)) != null) {
                                        i = e46.ff_libraries;
                                        HappForwardField happForwardField = (HappForwardField) ln7.b(viewInflate, i);
                                        if (happForwardField != null) {
                                            i = e46.ff_policy;
                                            HappForwardField happForwardField2 = (HappForwardField) ln7.b(viewInflate, i);
                                            if (happForwardField2 != null) {
                                                i = e46.ff_terms;
                                                HappForwardField happForwardField3 = (HappForwardField) ln7.b(viewInflate, i);
                                                if (happForwardField3 != null) {
                                                    i = e46.if_android_version;
                                                    HappInfoField happInfoField = (HappInfoField) ln7.b(viewInflate, i);
                                                    if (happInfoField != null) {
                                                        i = e46.if_app_version;
                                                        HappInfoField happInfoField2 = (HappInfoField) ln7.b(viewInflate, i);
                                                        if (happInfoField2 != null) {
                                                            i = e46.if_email;
                                                            HappInfoField happInfoField3 = (HappInfoField) ln7.b(viewInflate, i);
                                                            if (happInfoField3 != null) {
                                                                i = e46.if_hwid;
                                                                HappInfoField happInfoField4 = (HappInfoField) ln7.b(viewInflate, i);
                                                                if (happInfoField4 != null) {
                                                                    i = e46.if_model_name;
                                                                    HappInfoField happInfoField5 = (HappInfoField) ln7.b(viewInflate, i);
                                                                    if (happInfoField5 != null) {
                                                                        i = e46.if_telegram;
                                                                        HappInfoField happInfoField6 = (HappInfoField) ln7.b(viewInflate, i);
                                                                        if (happInfoField6 != null) {
                                                                            i = e46.if_xray_version;
                                                                            HappInfoField happInfoField7 = (HappInfoField) ln7.b(viewInflate, i);
                                                                            if (happInfoField7 != null) {
                                                                                i = e46.ll_about_block_1;
                                                                                if (((LinearLayout) ln7.b(viewInflate, i)) != null) {
                                                                                    i = e46.ll_about_block_2;
                                                                                    if (((LinearLayout) ln7.b(viewInflate, i)) != null) {
                                                                                        i = e46.ll_main;
                                                                                        if (((LinearLayout) ln7.b(viewInflate, i)) != null) {
                                                                                            i = e46.scroll_view;
                                                                                            ScrollView scrollView = (ScrollView) ln7.b(viewInflate, i);
                                                                                            if (scrollView != null) {
                                                                                                i = e46.title_device;
                                                                                                if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null) {
                                                                                                    i = e46.title_links;
                                                                                                    if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null) {
                                                                                                        i = e46.title_server;
                                                                                                        if (((HappSettingsTitle) ln7.b(viewInflate, i)) != null && (toolbarB = ln7.b(viewInflate, (i = e46.toolbar))) != null) {
                                                                                                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                                                                            this.Q0 = new t5(linearLayout, happForwardField, happForwardField2, happForwardField3, happInfoField, happInfoField2, happInfoField3, happInfoField4, happInfoField5, happInfoField6, happInfoField7, scrollView, toolbarB);
                                                                                                            setContentView(linearLayout);
                                                                                                            t5 t5Var = this.Q0;
                                                                                                            if (t5Var == null) {
                                                                                                                dh3.T("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            LinearLayout linearLayout2 = (LinearLayout) t5Var.X;
                                                                                                            linearLayout2.getClass();
                                                                                                            setBarsParams(linearLayout2);
                                                                                                            t5 t5Var2 = this.Q0;
                                                                                                            if (t5Var2 == null) {
                                                                                                                dh3.T("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            r((Toolbar) t5Var2.o0);
                                                                                                            setTitle(getString(y46.about_title));
                                                                                                            mb6.g((s) this.S0.getValue());
                                                                                                            y yVar = (y) this.R0.getValue();
                                                                                                            ak7 ak7Var = (ak7) ((vc4) ((s24) yVar.c.getValue()).a.getValue()).a.getValue();
                                                                                                            ak7Var.getClass();
                                                                                                            String string = ak7Var.a.getString("current_provider_id", null);
                                                                                                            if (string != null) {
                                                                                                                ProviderId.Companion companion = ProviderId.INSTANCE;
                                                                                                            } else {
                                                                                                                string = null;
                                                                                                            }
                                                                                                            yb6.a.b(vc4.class).E();
                                                                                                            ov6 ov6Var = yVar.b;
                                                                                                            ((w) yVar.d.X.getValue()).getClass();
                                                                                                            ov6Var.b(new w(string));
                                                                                                            t5 t5Var3 = this.Q0;
                                                                                                            if (t5Var3 == null) {
                                                                                                                dh3.T("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            HappInfoField happInfoField8 = (HappInfoField) t5Var3.m0;
                                                                                                            String coreVersion = Libxray.getCoreVersion();
                                                                                                            coreVersion.getClass();
                                                                                                            happInfoField8.setInfo(coreVersion);
                                                                                                            t5 t5Var4 = this.Q0;
                                                                                                            if (t5Var4 == null) {
                                                                                                                dh3.T("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            ((HappInfoField) t5Var4.h0).setInfo("4.9.0(1721)");
                                                                                                            t5 t5Var5 = this.Q0;
                                                                                                            if (t5Var5 == null) {
                                                                                                                dh3.T("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            ((HappForwardField) t5Var5.f0).setOnForwardIconClickListener(new i(this, (byte) 0));
                                                                                                            t5 t5Var6 = this.Q0;
                                                                                                            if (t5Var6 == null) {
                                                                                                                dh3.T("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            final byte b2 = 1;
                                                                                                            ((HappForwardField) t5Var6.Y).setOnForwardIconClickListener(new i(this, (byte) 1));
                                                                                                            t5 t5Var7 = this.Q0;
                                                                                                            if (t5Var7 == null) {
                                                                                                                dh3.T("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            ((HappForwardField) t5Var7.Z).setOnForwardIconClickListener(new i(this, (byte) 2));
                                                                                                            t5 t5Var8 = this.Q0;
                                                                                                            if (t5Var8 == null) {
                                                                                                                dh3.T("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            ((HappInfoField) t5Var8.i0).setOnClickListener(new View.OnClickListener(this) { // from class: j
                                                                                                                public final /* synthetic */ AboutSettingsActivity Y;

                                                                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                                {
                                                                                                                    this.Y = this;
                                                                                                                }

                                                                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                                /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context, su.happ.proxyutility.feature.about_settings.AboutSettingsActivity] */
                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    sj6 rj6Var;
                                                                                                                    byte b3 = b;
                                                                                                                    ?? r2 = this.Y;
                                                                                                                    switch (b3) {
                                                                                                                        case 0:
                                                                                                                            int i2 = AboutSettingsActivity.T0;
                                                                                                                            try {
                                                                                                                                ss8 ss8Var = ss8.a;
                                                                                                                                ss8.B(r2, ((w) ((y) r2.R0.getValue()).d.X.getValue()).Z);
                                                                                                                                return;
                                                                                                                            } catch (Throwable th) {
                                                                                                                                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            }
                                                                                                                        default:
                                                                                                                            y5 y5Var = r2.R0;
                                                                                                                            int i3 = AboutSettingsActivity.T0;
                                                                                                                            try {
                                                                                                                                ss8 ss8Var2 = ss8.a;
                                                                                                                                rj6Var = new sj6(ss8.B(r2, ((w) ((y) y5Var.getValue()).d.X.getValue()).f0));
                                                                                                                                break;
                                                                                                                            } catch (Throwable th2) {
                                                                                                                                if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                                                                                                                                    throw th2;
                                                                                                                                }
                                                                                                                                rj6Var = new rj6(th2);
                                                                                                                            }
                                                                                                                            if (sj6.a(rj6Var) != null) {
                                                                                                                                try {
                                                                                                                                    ss8 ss8Var3 = ss8.a;
                                                                                                                                    ss8.B(r2, ((w) ((y) y5Var.getValue()).d.X.getValue()).g0);
                                                                                                                                    return;
                                                                                                                                } catch (Throwable th3) {
                                                                                                                                    if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                                                                                                                                        throw th3;
                                                                                                                                    }
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            t5 t5Var9 = this.Q0;
                                                                                                            if (t5Var9 == null) {
                                                                                                                dh3.T("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            ((HappInfoField) t5Var9.l0).setInfo("t.me/happ_support_bot");
                                                                                                            t5 t5Var10 = this.Q0;
                                                                                                            if (t5Var10 == null) {
                                                                                                                dh3.T("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            ((HappInfoField) t5Var10.l0).setOnClickListener(new View.OnClickListener(this) { // from class: j
                                                                                                                public final /* synthetic */ AboutSettingsActivity Y;

                                                                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                                {
                                                                                                                    this.Y = this;
                                                                                                                }

                                                                                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                                                                                /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context, su.happ.proxyutility.feature.about_settings.AboutSettingsActivity] */
                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view) {
                                                                                                                    sj6 rj6Var;
                                                                                                                    byte b3 = b2;
                                                                                                                    ?? r2 = this.Y;
                                                                                                                    switch (b3) {
                                                                                                                        case 0:
                                                                                                                            int i2 = AboutSettingsActivity.T0;
                                                                                                                            try {
                                                                                                                                ss8 ss8Var = ss8.a;
                                                                                                                                ss8.B(r2, ((w) ((y) r2.R0.getValue()).d.X.getValue()).Z);
                                                                                                                                return;
                                                                                                                            } catch (Throwable th) {
                                                                                                                                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                                return;
                                                                                                                            }
                                                                                                                        default:
                                                                                                                            y5 y5Var = r2.R0;
                                                                                                                            int i3 = AboutSettingsActivity.T0;
                                                                                                                            try {
                                                                                                                                ss8 ss8Var2 = ss8.a;
                                                                                                                                rj6Var = new sj6(ss8.B(r2, ((w) ((y) y5Var.getValue()).d.X.getValue()).f0));
                                                                                                                                break;
                                                                                                                            } catch (Throwable th2) {
                                                                                                                                if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                                                                                                                                    throw th2;
                                                                                                                                }
                                                                                                                                rj6Var = new rj6(th2);
                                                                                                                            }
                                                                                                                            if (sj6.a(rj6Var) != null) {
                                                                                                                                try {
                                                                                                                                    ss8 ss8Var3 = ss8.a;
                                                                                                                                    ss8.B(r2, ((w) ((y) y5Var.getValue()).d.X.getValue()).g0);
                                                                                                                                    return;
                                                                                                                                } catch (Throwable th3) {
                                                                                                                                    if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                                                                                                                                        throw th3;
                                                                                                                                    }
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            return;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            ss8 ss8Var = ss8.a;
                                                                                                            String strJ = ss8.j(this);
                                                                                                            t5 t5Var11 = this.Q0;
                                                                                                            if (t5Var11 == null) {
                                                                                                                dh3.T("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            HappInfoField happInfoField9 = (HappInfoField) t5Var11.g0;
                                                                                                            String str = Build.VERSION.RELEASE;
                                                                                                            str.getClass();
                                                                                                            happInfoField9.setInfo(str);
                                                                                                            t5 t5Var12 = this.Q0;
                                                                                                            if (t5Var12 == null) {
                                                                                                                dh3.T("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            HappInfoField happInfoField10 = (HappInfoField) t5Var12.k0;
                                                                                                            String str2 = Build.MODEL;
                                                                                                            str2.getClass();
                                                                                                            happInfoField10.setInfo(str2);
                                                                                                            t5 t5Var13 = this.Q0;
                                                                                                            if (t5Var13 == null) {
                                                                                                                dh3.T("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            ((HappInfoField) t5Var13.j0).setInfo(strJ);
                                                                                                            jm4.Q(ys0.z(((ComponentActivity) this).X), (u61) null, new p(this, null, (byte) 1), 3);
                                                                                                            return;
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
    public final Toolbar v() {
        t5 t5Var = this.Q0;
        if (t5Var != null) {
            return (Toolbar) t5Var.o0;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final boolean x() {
        s sVar = (s) this.S0.getValue();
        return sVar.a((HappInfoField) sVar.X.m0);
    }
}
