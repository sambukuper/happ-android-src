package defpackage;

import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.ui.SnackbarHostActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class tk4 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public final /* synthetic */ MainActivity h0;
    public final /* synthetic */ SubscriptionItem i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tk4(MainActivity mainActivity, SubscriptionItem subscriptionItem, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.h0 = mainActivity;
        this.i0 = subscriptionItem;
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
            default:
                n(q51Var, b71Var).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        SubscriptionItem subscriptionItem = this.i0;
        MainActivity mainActivity = this.h0;
        switch (b) {
            case 0:
                return new tk4(mainActivity, subscriptionItem, q51Var, (byte) 0);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                return new tk4(mainActivity, subscriptionItem, q51Var, (byte) 1);
            default:
                return new tk4(mainActivity, subscriptionItem, q51Var, (byte) 2);
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
        dn8 dn8Var = dn8.a;
        SubscriptionItem subscriptionItem = this.i0;
        SnackbarHostActivity snackbarHostActivity = this.h0;
        switch (b) {
            case 0:
                w39.n0(obj);
                String string = snackbarHostActivity.getString(y46.toast_success_sub_update, subscriptionItem.getRemarks());
                string.getClass();
                pu.R(snackbarHostActivity, string);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                w39.n0(obj);
                String string2 = snackbarHostActivity.getString(y46.toast_success_sub_update, subscriptionItem.getRemarks());
                string2.getClass();
                pu.R(snackbarHostActivity, string2);
                break;
            default:
                w39.n0(obj);
                String string3 = snackbarHostActivity.getString(y46.toast_success_sub_add, subscriptionItem.getRemarks());
                string3.getClass();
                pu.R(snackbarHostActivity, string3);
                break;
        }
        return dn8Var;
    }
}
