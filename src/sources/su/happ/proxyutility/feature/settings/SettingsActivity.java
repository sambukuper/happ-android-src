package su.happ.proxyutility.feature.settings;

import android.R;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import defpackage.a67;
import defpackage.b67;
import defpackage.c67;
import defpackage.e46;
import defpackage.ln7;
import defpackage.m7;
import defpackage.p67;
import defpackage.ss8;
import defpackage.t46;
import defpackage.u57;
import defpackage.v57;
import defpackage.w57;
import defpackage.y46;
import defpackage.z57;
import defpackage.za3;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.SnackbarHostActivity;
import su.happ.proxyutility.ui.foundation.component.HappSnackbarHost;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/settings/SettingsActivity;", "Lsu/happ/proxyutility/ui/SnackbarHostActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class SettingsActivity extends SnackbarHostActivity {
    public static final /* synthetic */ int e1 = 0;
    public t6 Q0;
    public final vz7 R0 = new vz7(new m7(this, 3));
    public final vz7 S0 = new vz7(new m7(this, 4));
    public final vz7 T0 = new vz7(new m7(this, 5));
    public final vz7 U0 = new vz7(new m7(this, 6));
    public final vz7 V0 = new vz7(new m7(this, 7));
    public final y5 W0;
    public final y5 X0;
    public final vz7 Y0;
    public final vz7 Z0;
    public final vz7 a1;
    public final vz7 b1;
    public final vz7 c1;
    public final SettingsActivity$msgReceiver$1 d1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v12, types: [su.happ.proxyutility.feature.settings.SettingsActivity$msgReceiver$1] */
    public SettingsActivity() {
        a67 a67Var = new a67(this, (byte) 0);
        zb6 zb6Var = yb6.a;
        this.W0 = new y5(zb6Var.b(p67.class), new a67(this, (byte) 1), a67Var, new a67(this, (byte) 2));
        this.X0 = new y5(zb6Var.b(za3.class), new a67(this, (byte) 4), new a67(this, (byte) 3), new a67(this, (byte) 5));
        this.Y0 = new vz7(new m7(this, (byte) 8));
        this.Z0 = new vz7(new m7(this, (byte) 9));
        this.a1 = new vz7(new m7(this, (byte) 10));
        this.b1 = new vz7(new m7(this, (byte) 11));
        this.c1 = new vz7(new m7(this, (byte) 12));
        this.d1 = new BroadcastReceiver() { // from class: su.happ.proxyutility.feature.settings.SettingsActivity$msgReceiver$1
            public static final /* synthetic */ int b = 0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("key", 0)) : null;
                SnackbarHostActivity snackbarHostActivity = this.a;
                if (numValueOf != null && numValueOf.intValue() == 1) {
                    ss8 ss8Var = ss8.a;
                    String strJ = ss8.j(snackbarHostActivity);
                    be.m(snackbarHostActivity, snackbarHostActivity.getString(y46.report_sending_title), snackbarHostActivity.getString(y46.report_sending_hwid, strJ), (String) null, snackbarHostActivity.getString(R.string.ok), (String) null, Integer.valueOf(t46.dialog_alert_report), new a23(snackbarHostActivity, strJ, (byte) 18), (dn2) null, 1360);
                } else if (numValueOf != null && numValueOf.intValue() == 2) {
                    pu.M(snackbarHostActivity, y46.report_sending_failure);
                }
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final HappSnackbarHost A() {
        t6 t6Var = this.Q0;
        if (t6Var != null) {
            return (HappSnackbarHost) t6Var.l0;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RelativeLayout B() {
        t6 t6Var = this.Q0;
        if (t6Var == null) {
            dh3.T("binding");
            throw null;
        }
        RelativeLayout relativeLayout = (RelativeLayout) t6Var.Y;
        relativeLayout.getClass();
        return relativeLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: su.happ.proxyutility.feature.settings.SettingsActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        FragmentContainerView fragmentContainerViewB;
        FragmentContainerView fragmentContainerViewB2;
        FragmentContainerView fragmentContainerViewB3;
        FragmentContainerView fragmentContainerViewB4;
        FragmentContainerView fragmentContainerViewB5;
        NestedScrollView nestedScrollViewB;
        Toolbar toolbarB;
        super/*su.happ.proxyutility.ui.BaseActivity*/.onCreate(bundle);
        byte b = 0;
        View viewInflate = getLayoutInflater().inflate(t46.activity_settings, (ViewGroup) null, false);
        int i = e46.composeView;
        ComposeView composeViewB = ln7.b(viewInflate, i);
        if (composeViewB != null && (fragmentContainerViewB = ln7.b(viewInflate, (i = e46.fragment_about_settings))) != null && (fragmentContainerViewB2 = ln7.b(viewInflate, (i = e46.fragment_advanced_settings))) != null && (fragmentContainerViewB3 = ln7.b(viewInflate, (i = e46.fragment_other_settings))) != null && (fragmentContainerViewB4 = ln7.b(viewInflate, (i = e46.fragment_tunnel_settings))) != null && (fragmentContainerViewB5 = ln7.b(viewInflate, (i = e46.fragment_ui_settings))) != null && (nestedScrollViewB = ln7.b(viewInflate, (i = e46.scroll_settings))) != null) {
            i = e46.snackbar_host_root;
            HappSnackbarHost happSnackbarHost = (HappSnackbarHost) ln7.b(viewInflate, i);
            if (happSnackbarHost != null && (toolbarB = ln7.b(viewInflate, (i = e46.toolbar))) != null) {
                RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                this.Q0 = new t6(relativeLayout, composeViewB, fragmentContainerViewB, fragmentContainerViewB2, fragmentContainerViewB3, fragmentContainerViewB4, fragmentContainerViewB5, nestedScrollViewB, happSnackbarHost, toolbarB);
                setContentView(relativeLayout);
                t6 t6Var = this.Q0;
                if (t6Var == null) {
                    dh3.T("binding");
                    throw null;
                }
                RelativeLayout relativeLayout2 = (RelativeLayout) t6Var.Y;
                relativeLayout2.getClass();
                setBarsParams(relativeLayout2);
                t6 t6Var2 = this.Q0;
                if (t6Var2 == null) {
                    dh3.T("binding");
                    throw null;
                }
                r((Toolbar) t6Var2.m0);
                t6 t6Var3 = this.Q0;
                if (t6Var3 == null) {
                    dh3.T("binding");
                    throw null;
                }
                ((ComposeView) t6Var3.Z).setContent(new zy0(1346634616, true, new u57(this, b)));
                ue3.I(this, this.d1, new IntentFilter("su.happ.proxyutility.action.activity"), (Integer) null);
                setTitle(getString(y46.title_settings));
                return;
            }
        }
        b61.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: su.happ.proxyutility.feature.settings.SettingsActivity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        super/*androidx.appcompat.app.AppCompatActivity*/.onDestroy();
        unregisterReceiver(this.d1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onStart() {
        super/*androidx.appcompat.app.AppCompatActivity*/.onStart();
        mb6.g((c67) this.Y0.getValue());
        mb6.g((b67) this.Z0.getValue());
        mb6.g((w57) this.a1.getValue());
        mb6.g((z57) this.b1.getValue());
        mb6.g((v57) this.c1.getValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Toolbar v() {
        t6 t6Var = this.Q0;
        if (t6Var != null) {
            return (Toolbar) t6Var.m0;
        }
        dh3.T("binding");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean x() {
        c67 c67Var = (c67) this.Y0.getValue();
        return c67Var.a(c67Var.Y.Y);
    }
}
