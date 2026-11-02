package su.happ.proxyutility.feature.reset_settings;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.bf6;
import defpackage.h6;
import defpackage.t46;
import defpackage.y46;
import defpackage.ze6;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.reset_settings.ResetSettingsActivity;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/feature/reset_settings/ResetSettingsActivity;", "Lsu/happ/proxyutility/ui/BaseActivity;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class ResetSettingsActivity extends BaseActivity {
    public static final /* synthetic */ int T0 = 0;
    public h6 Q0;
    public final vz7 R0 = new vz7(new w76((byte) 4));
    public final vz7 S0 = new vz7(new ze6(this, (byte) 0));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: su.happ.proxyutility.feature.reset_settings.ResetSettingsActivity */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = t46.activity_reset_settings;
        DataBinderMapperImpl dataBinderMapperImpl = x91.a;
        setContentView(i);
        final byte b = 0;
        kw8 kw8VarA = x91.a((ViewGroup) getWindow().getDecorView().findViewById(R.id.content), 0, i);
        kw8VarA.getClass();
        h6 h6Var = (h6) kw8VarA;
        this.Q0 = h6Var;
        View view = ((kw8) h6Var).Z;
        view.getClass();
        setBarsParams(view);
        h6 h6Var2 = this.Q0;
        if (h6Var2 == null) {
            dh3.T("binding");
            throw null;
        }
        r(h6Var2.o0);
        setTitle(getString(y46.title_reset));
        mb6.g((bf6) this.S0.getValue());
        h6 h6Var3 = this.Q0;
        if (h6Var3 == null) {
            dh3.T("binding");
            throw null;
        }
        h6Var3.n0.setOnClickListener(new View.OnClickListener(this) { // from class: ye6
            public final /* synthetic */ ResetSettingsActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r2v0, types: [android.content.Context, su.happ.proxyutility.feature.reset_settings.ResetSettingsActivity, su.happ.proxyutility.ui.BaseActivity] */
            /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context, su.happ.proxyutility.feature.reset_settings.ResetSettingsActivity, su.happ.proxyutility.ui.BaseActivity] */
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
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (b) {
                    case 0:
                        int i2 = ResetSettingsActivity.T0;
                        int i3 = y46.dialog_reset_title;
                        ?? r2 = this.Y;
                        be.m((BaseActivity) r2, r2.getString(i3), r2.getString(y46.dialog_reset_user_settings_description), (String) null, r2.getString(R.string.ok), r2.getString(R.string.cancel), (Integer) null, new w76((byte) 6), new w76((byte) 7), 402);
                        break;
                    default:
                        int i4 = ResetSettingsActivity.T0;
                        int i5 = y46.dialog_reset_title;
                        ?? r3 = this.Y;
                        be.m((BaseActivity) r3, r3.getString(i5), r3.getString(y46.dialog_reset_settings_description), (String) null, r3.getString(R.string.ok), r3.getString(R.string.cancel), (Integer) null, new ze6(r3, (byte) 1), new w76((byte) 5), 402);
                        break;
                }
            }
        });
        h6 h6Var4 = this.Q0;
        if (h6Var4 == null) {
            dh3.T("binding");
            throw null;
        }
        final byte b2 = 1;
        h6Var4.m0.setOnClickListener(new View.OnClickListener(this) { // from class: ye6
            public final /* synthetic */ ResetSettingsActivity Y;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.Y = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r2v0, types: [android.content.Context, su.happ.proxyutility.feature.reset_settings.ResetSettingsActivity, su.happ.proxyutility.ui.BaseActivity] */
            /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context, su.happ.proxyutility.feature.reset_settings.ResetSettingsActivity, su.happ.proxyutility.ui.BaseActivity] */
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
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (b2) {
                    case 0:
                        int i2 = ResetSettingsActivity.T0;
                        int i3 = y46.dialog_reset_title;
                        ?? r2 = this.Y;
                        be.m((BaseActivity) r2, r2.getString(i3), r2.getString(y46.dialog_reset_user_settings_description), (String) null, r2.getString(R.string.ok), r2.getString(R.string.cancel), (Integer) null, new w76((byte) 6), new w76((byte) 7), 402);
                        break;
                    default:
                        int i4 = ResetSettingsActivity.T0;
                        int i5 = y46.dialog_reset_title;
                        ?? r3 = this.Y;
                        be.m((BaseActivity) r3, r3.getString(i5), r3.getString(y46.dialog_reset_settings_description), (String) null, r3.getString(R.string.ok), r3.getString(R.string.cancel), (Integer) null, new ze6(r3, (byte) 1), new w76((byte) 5), 402);
                        break;
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final Toolbar v() {
        h6 h6Var = this.Q0;
        if (h6Var == null) {
            dh3.T("binding");
            throw null;
        }
        Toolbar toolbar = h6Var.o0;
        toolbar.getClass();
        return toolbar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // su.happ.proxyutility.ui.BaseActivity
    public final boolean x() {
        return ((bf6) this.S0.getValue()).X.n0.requestFocus();
    }
}
