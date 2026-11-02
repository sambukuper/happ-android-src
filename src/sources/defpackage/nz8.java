package defpackage;

import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import su.happ.proxyutility.feature.vpn_settings.VpnSettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class nz8 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ VpnSettingsActivity i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nz8(VpnSettingsActivity vpnSettingsActivity, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = vpnSettingsActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                n((q51) obj2, (rz8) obj).q(dn8Var);
                break;
            default:
                n((q51) obj2, (sz8) obj).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        VpnSettingsActivity vpnSettingsActivity = this.i0;
        switch (b) {
            case 0:
                nz8 nz8Var = new nz8(vpnSettingsActivity, q51Var, (byte) 0);
                nz8Var.h0 = obj;
                return nz8Var;
            default:
                nz8 nz8Var2 = new nz8(vpnSettingsActivity, q51Var, (byte) 1);
                nz8Var2.h0 = obj;
                return nz8Var2;
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
        VpnSettingsActivity vpnSettingsActivity = this.i0;
        Object obj2 = this.h0;
        switch (b) {
            case 0:
                rz8 rz8Var = (rz8) obj2;
                w39.n0(obj);
                w6 w6Var = vpnSettingsActivity.Q0;
                if (w6Var == null) {
                    dh3.T("binding");
                    throw null;
                }
                LinearLayout linearLayout = w6Var.t0;
                linearLayout.getClass();
                linearLayout.setVisibility(rz8Var.a ? 0 : 8);
                w6 w6Var2 = vpnSettingsActivity.Q0;
                if (w6Var2 == null) {
                    dh3.T("binding");
                    throw null;
                }
                AppCompatTextView appCompatTextView = w6Var2.D0;
                appCompatTextView.getClass();
                appCompatTextView.setVisibility(rz8Var.a ? 0 : 8);
                return dn8Var;
            default:
                sz8 sz8Var = (sz8) obj2;
                w39.n0(obj);
                int i = VpnSettingsActivity.U0;
                if (sz8Var != null) {
                    pu.O(vpnSettingsActivity, y46.warning_settings_after_tunnel_restart);
                    return dn8Var;
                }
                b61.c();
                return null;
        }
    }
}
