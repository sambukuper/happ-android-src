package su.happ.proxyutility.feature.custom_config;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ComponentActivity;
import com.blacksquircle.ui.editorkit.widget.TextProcessor;
import com.google.gson.a;
import com.tencent.mmkv.MMKV;
import defpackage.e46;
import defpackage.k81;
import defpackage.kw4;
import defpackage.ln7;
import defpackage.r47;
import defpackage.s47;
import defpackage.ss8;
import defpackage.t46;
import defpackage.t47;
import defpackage.v46;
import defpackage.wl7;
import defpackage.x79;
import defpackage.y46;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import su.happ.proxyutility.domain.sub.GuId;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EConfigType;
import su.happ.proxyutility.feature.custom_config.ServerCustomConfigActivity;
import su.happ.proxyutility.ui.SnackbarHostActivity;
import su.happ.proxyutility.ui.foundation.component.HappInputField;
import su.happ.proxyutility.ui.foundation.component.HappSnackbarHost;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/custom_config/ServerCustomConfigActivity;", "Lsu/happ/proxyutility/ui/SnackbarHostActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class ServerCustomConfigActivity extends SnackbarHostActivity {
    public static final /* synthetic */ int X0 = 0;
    public fu6 Q0;
    public final vz7 R0;
    public final vz7 V0;
    public final vz7 S0 = new vz7(new r47((byte) 0));
    public final vz7 T0 = new vz7(new r47((byte) 1));
    public final vz7 U0 = new vz7(new zk3(this, (byte) 18));
    public final r6 W0 = m(new o61(this, (byte) 25), new n6((byte) 2));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ServerCustomConfigActivity() {
        final byte b = 0;
        this.R0 = new vz7(new dn2(this) { // from class: q47
            public final /* synthetic */ ServerCustomConfigActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, su.happ.proxyutility.feature.custom_config.ServerCustomConfigActivity] */
            public final Object invoke() {
                byte b2 = b;
                ?? r4 = this.Y;
                switch (b2) {
                    case 0:
                        fu6 fu6Var = r4.Q0;
                        if (fu6Var != null) {
                            return new k81(fu6Var);
                        }
                        dh3.T("binding");
                        throw null;
                    default:
                        String strI = ((MMKV) r4.S0.getValue()).i("SELECTED_SERVER");
                        String str = strI != null ? strI : null;
                        boolean z = false;
                        if (r4.getIntent().getBooleanExtra("isRunning", false) && !fm7.o0(r4.B())) {
                            if (str == null ? false : dh3.f(r4.B(), str)) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        final byte b2 = 1;
        this.V0 = new vz7(new dn2(this) { // from class: q47
            public final /* synthetic */ ServerCustomConfigActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, su.happ.proxyutility.feature.custom_config.ServerCustomConfigActivity] */
            public final Object invoke() {
                byte b3 = b2;
                ?? r4 = this.Y;
                switch (b3) {
                    case 0:
                        fu6 fu6Var = r4.Q0;
                        if (fu6Var != null) {
                            return new k81(fu6Var);
                        }
                        dh3.T("binding");
                        throw null;
                    default:
                        String strI = ((MMKV) r4.S0.getValue()).i("SELECTED_SERVER");
                        String str = strI != null ? strI : null;
                        boolean z = false;
                        if (r4.getIntent().getBooleanExtra("isRunning", false) && !fm7.o0(r4.B())) {
                            if (str == null ? false : dh3.f(r4.B(), str)) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final HappSnackbarHost A() {
        fu6 fu6Var = this.Q0;
        if (fu6Var != null) {
            return (HappSnackbarHost) fu6Var.h0;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String B() {
        return ((GuId) this.U0.getValue()).b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void C(String str) {
        og7 rj6Var;
        String strValueOf;
        g94 g94Var = ((ComponentActivity) this).X;
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    ServerConfig.Companion companion = ServerConfig.INSTANCE;
                    EConfigType eConfigType = EConfigType.CUSTOM;
                    companion.getClass();
                    ServerConfig serverConfigA = ServerConfig.Companion.a(eConfigType);
                    a aVar = yw2.b;
                    aVar.getClass();
                    serverConfigA.k((XRayConfig) aVar.c(str, new yi8(XRayConfig.class)));
                    XRayConfig fullConfig = serverConfigA.getFullConfig();
                    if (fullConfig == null || (strValueOf = fullConfig.getRemarks()) == null) {
                        strValueOf = String.valueOf(System.currentTimeMillis());
                    }
                    serverConfigA.m(strValueOf);
                    kw4 kw4Var = kw4.a;
                    GuId.Companion.getClass();
                    ((MMKV) this.T0.getValue()).q(kw4.e(GuId.a(), serverConfigA), str);
                    u84 u84VarZ = ys0.z(g94Var);
                    nf1 nf1Var = tp1.a;
                    rj6Var = jm4.Q(u84VarZ, dm4.a, new t47(this, null, (byte) 1), 2);
                    Throwable thA = sj6.a(rj6Var);
                    if (thA != null) {
                        u84 u84VarZ2 = ys0.z(g94Var);
                        nf1 nf1Var2 = tp1.a;
                        jm4.Q(u84VarZ2, dm4.a, new ar6(this, thA, (q51) null, (byte) 2), 2);
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var = new rj6(th);
            }
        }
        u84 u84VarZ3 = ys0.z(g94Var);
        nf1 nf1Var3 = tp1.a;
        jm4.Q(u84VarZ3, dm4.a, new t47(this, null, (byte) 0), 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: su.happ.proxyutility.feature.custom_config.ServerCustomConfigActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void D() {
        XRayConfig rj6Var;
        fu6 fu6Var = this.Q0;
        if (fu6Var == null) {
            dh3.T("binding");
            throw null;
        }
        if (TextUtils.isEmpty(((HappInputField) fu6Var.f0).getText())) {
            pu.M(this, y46.server_name);
            return;
        }
        try {
            a aVar = yw2.b;
            fu6 fu6Var2 = this.Q0;
            if (fu6Var2 == null) {
                dh3.T("binding");
                throw null;
            }
            String string = ((TextProcessor) fu6Var2.Z).getText().toString();
            aVar.getClass();
            rj6Var = (XRayConfig) aVar.c(string, new yi8(XRayConfig.class));
            Throwable thA = sj6.a(rj6Var);
            if (thA != null) {
                String string2 = getString(y46.toast_malformed_json);
                Throwable cause = thA.getCause();
                pu.N(this, string2 + " " + (cause != null ? cause.getMessage() : null), (List) null, 6);
            }
            if (rj6Var instanceof rj6) {
                rj6Var = null;
            }
            XRayConfig xRayConfig = rj6Var;
            if (xRayConfig == null) {
                return;
            }
            kw4 kw4Var = kw4.a;
            ServerConfig serverConfigB = kw4.b(B());
            if (serverConfigB == null) {
                ServerConfig.Companion companion = ServerConfig.INSTANCE;
                EConfigType eConfigType = EConfigType.CUSTOM;
                companion.getClass();
                serverConfigB = ServerConfig.Companion.a(eConfigType);
            }
            fu6 fu6Var3 = this.Q0;
            if (fu6Var3 == null) {
                dh3.T("binding");
                throw null;
            }
            serverConfigB.m(fm7.R0(((HappInputField) fu6Var3.f0).getText()).toString());
            serverConfigB.k(xRayConfig);
            kw4.e(B(), serverConfigB);
            MMKV mmkv = (MMKV) this.T0.getValue();
            String strB = B();
            fu6 fu6Var4 = this.Q0;
            if (fu6Var4 == null) {
                dh3.T("binding");
                throw null;
            }
            mmkv.q(strB, ((TextProcessor) fu6Var4.Z).getText().toString());
            pu.Q(this, y46.toast_success);
            finish();
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: su.happ.proxyutility.feature.custom_config.ServerCustomConfigActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void E() {
        dn8 rj6Var;
        Intent intentAddCategory = new Intent("android.intent.action.GET_CONTENT").setType("*/*").addCategory("android.intent.category.OPENABLE");
        intentAddCategory.getClass();
        try {
            r6 r6Var = this.W0;
            Intent intentCreateChooser = Intent.createChooser(intentAddCategory, getString(y46.title_file_chooser));
            intentCreateChooser.getClass();
            r6Var.h0(intentCreateChooser);
            rj6Var = dn8.a;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        Throwable thA = sj6.a(rj6Var);
        if (thA == null || !(thA instanceof ActivityNotFoundException)) {
            return;
        }
        pu.M(this, y46.toast_require_file_manager);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: su.happ.proxyutility.feature.custom_config.ServerCustomConfigActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        TextProcessor textProcessorB;
        Toolbar toolbarB;
        String strE;
        super/*su.happ.proxyutility.ui.BaseActivity*/.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(t46.activity_server_custom_config, (ViewGroup) null, false);
        int i = e46.cl_main;
        if (((LinearLayout) ln7.b(viewInflate, i)) != null && (textProcessorB = ln7.b(viewInflate, (i = e46.editor))) != null) {
            i = e46.if_remarks;
            HappInputField happInputField = (HappInputField) ln7.b(viewInflate, i);
            if (happInputField != null) {
                i = e46.ll_editor;
                LinearLayout linearLayout = (LinearLayout) ln7.b(viewInflate, i);
                if (linearLayout != null) {
                    i = e46.snackbar_host_root;
                    HappSnackbarHost happSnackbarHost = (HappSnackbarHost) ln7.b(viewInflate, i);
                    if (happSnackbarHost != null && (toolbarB = ln7.b(viewInflate, (i = e46.toolbar))) != null) {
                        LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                        this.Q0 = new fu6(linearLayout2, textProcessorB, happInputField, linearLayout, happSnackbarHost, toolbarB, (byte) 2);
                        setContentView(linearLayout2);
                        mb6.g((k81) this.R0.getValue());
                        fu6 fu6Var = this.Q0;
                        if (fu6Var == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        LinearLayout linearLayout3 = (LinearLayout) fu6Var.Y;
                        linearLayout3.getClass();
                        setBarsParams(linearLayout3);
                        fu6 fu6Var2 = this.Q0;
                        if (fu6Var2 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        r((Toolbar) fu6Var2.i0);
                        fu6 fu6Var3 = this.Q0;
                        if (fu6Var3 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        ((Toolbar) fu6Var3.i0).setTitle(getString(fm7.o0(B()) ? y46.menu_item_import_config_manually : y46.title_server));
                        ss8 ss8Var = ss8.a;
                        if (g33.E()) {
                            c12.e();
                            if (((MMKV) ss8.e.getValue()).getString("pref_http_port", (String) null) == null) {
                                bt.q("Required value was null.");
                                return;
                            }
                        }
                        if ((getResources().getConfiguration().uiMode & 48) == 16) {
                            fu6 fu6Var4 = this.Q0;
                            if (fu6Var4 == null) {
                                dh3.T("binding");
                                throw null;
                            }
                            ((TextProcessor) fu6Var4.Z).setColorScheme(qy1.b);
                        }
                        fu6 fu6Var5 = this.Q0;
                        if (fu6Var5 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        ((TextProcessor) fu6Var5.Z).setLanguage(new k42());
                        fu6 fu6Var6 = this.Q0;
                        if (fu6Var6 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        ((LinearLayout) fu6Var6.g0).setOnClickListener(new s47(this, (byte) 0));
                        kw4 kw4Var = kw4.a;
                        ServerConfig serverConfigB = kw4.b(B());
                        fu6 fu6Var7 = this.Q0;
                        if (serverConfigB == null) {
                            if (fu6Var7 != null) {
                                ((HappInputField) fu6Var7.f0).g0.setText(null);
                                return;
                            } else {
                                dh3.T("binding");
                                throw null;
                            }
                        }
                        if (fu6Var7 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        ((HappInputField) fu6Var7.f0).setText(serverConfigB.getRemarks());
                        String strI = ((MMKV) this.T0.getValue()).i(B());
                        fu6 fu6Var8 = this.Q0;
                        if (fu6Var8 == null) {
                            dh3.T("binding");
                            throw null;
                        }
                        TextProcessor textProcessor = (TextProcessor) fu6Var8.Z;
                        if (strI == null || fm7.o0(strI)) {
                            XRayConfig fullConfig = serverConfigB.getFullConfig();
                            String strH = fullConfig != null ? yw2.d.h(fullConfig) : null;
                            strE = strH == null ? "" : strH;
                        } else {
                            strE = x79.e(strI);
                        }
                        textProcessor.setTextContent(wl7.e0(strE));
                        return;
                    }
                }
            }
        }
        b61.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: su.happ.proxyutility.feature.custom_config.ServerCustomConfigActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(v46.action_server_custom_config, menu);
        MenuItem menuItemFindItem = menu.findItem(e46.save_config);
        MenuItem menuItemFindItem2 = menu.findItem(e46.import_config_custom_local);
        View actionView = menuItemFindItem.getActionView();
        if (actionView != null) {
            actionView.setOnClickListener(new s47(this, (byte) 1));
        }
        if (!fm7.o0(B())) {
            menuItemFindItem2.setVisible(false);
            if (((Boolean) this.V0.getValue()).booleanValue()) {
                menuItemFindItem.setVisible(false);
            }
        }
        return super/*su.happ.proxyutility.ui.BaseActivity*/.onCreateOptionsMenu(menu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: su.happ.proxyutility.feature.custom_config.ServerCustomConfigActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        dn8 rj6Var;
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == e46.save_config) {
            D();
            return true;
        }
        if (itemId != e46.import_config_custom_local) {
            return super/*su.happ.proxyutility.ui.BaseActivity*/.onOptionsItemSelected(menuItem);
        }
        try {
            E();
            rj6Var = dn8.a;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        return !(rj6Var instanceof rj6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Toolbar v() {
        fu6 fu6Var = this.Q0;
        if (fu6Var != null) {
            return (Toolbar) fu6Var.i0;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean x() {
        fu6 fu6Var = this.Q0;
        if (fu6Var != null) {
            return ((HappInputField) fu6Var.f0).requestFocus();
        }
        dh3.T("binding");
        throw null;
    }
}
