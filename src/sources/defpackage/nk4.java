package defpackage;

import android.R;
import androidx.fragment.app.FragmentActivity;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.feature.main.MainViewModel;
import su.happ.proxyutility.ui.SnackbarHostActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class nk4 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public final /* synthetic */ MainActivity h0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk4(MainActivity mainActivity, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.h0 = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                n(q51Var, b71Var).q(dn8Var);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                n(q51Var, b71Var).q(dn8Var);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                n(q51Var, b71Var).q(dn8Var);
                break;
            case 3:
                n(q51Var, b71Var).q(dn8Var);
                break;
            default:
                n(q51Var, b71Var).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        MainActivity mainActivity = this.h0;
        switch (b) {
            case 0:
                return new nk4(mainActivity, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new nk4(mainActivity, q51Var, (byte) 1);
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                return new nk4(mainActivity, q51Var, (byte) 2);
            case 3:
                return new nk4(mainActivity, q51Var, (byte) 3);
            default:
                return new nk4(mainActivity, q51Var, (byte) 4);
        }
    }

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
    public final Object q(Object obj) {
        byte b = this.g0;
        FragmentActivity fragmentActivity = this.h0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                w39.n0(obj);
                m51 m51Var = ko1.B1;
                km4.l0(fragmentActivity.n(), jo1.Z, (String) null);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                w39.n0(obj);
                String string = fragmentActivity.getString(y46.toast_success);
                string.getClass();
                pu.R(fragmentActivity, string);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                w39.n0(obj);
                int i = y46.send_to_tv_failed_to_receive;
                SnackbarHostActivity snackbarHostActivity = this.h0;
                be.m(snackbarHostActivity, (String) null, snackbarHostActivity.getString(i), (String) null, snackbarHostActivity.getString(R.string.ok), (String) null, (Integer) null, (dn2) null, (dn2) null, 2006);
                break;
            case 3:
                w39.n0(obj);
                MainViewModel mainViewModelG = fragmentActivity.G();
                jm4.Q(zw8.a(mainViewModelG), (u61) null, new xn4(mainViewModelG, null, (byte) 1), 3);
                break;
            default:
                w39.n0(obj);
                ea6 ea6Var = new ea6();
                ea6Var.X = new mo1();
                ea6Var.X = new mo1();
                MainActivity mainActivity = this.h0;
                u84 u84VarZ = ys0.z(mainActivity.h());
                nf1 nf1Var = tp1.a;
                jm4.Q(u84VarZ, dm4.a, new co((Object) ea6Var, (Object) mainActivity, (Object) mainActivity, (q51) null, (byte) 6), 2);
                break;
        }
        return dn8Var;
    }
}
