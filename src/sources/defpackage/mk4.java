package defpackage;

import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class mk4 extends uy7 implements rn2 {
    public final /* synthetic */ MainActivity g0;
    public final /* synthetic */ String h0;
    public final /* synthetic */ SubscriptionItem i0;
    public final /* synthetic */ boolean j0;
    public final /* synthetic */ boolean k0;
    public final /* synthetic */ String l0;
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ boolean n0;
    public final /* synthetic */ g83 o0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk4(MainActivity mainActivity, String str, SubscriptionItem subscriptionItem, boolean z, boolean z2, String str2, boolean z3, boolean z4, g83 g83Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = mainActivity;
        this.h0 = str;
        this.i0 = subscriptionItem;
        this.j0 = z;
        this.k0 = z2;
        this.l0 = str2;
        this.m0 = z3;
        this.n0 = z4;
        this.o0 = g83Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        mk4 mk4VarN = n((q51) obj2, (b71) obj);
        dn8 dn8Var = dn8.a;
        mk4VarN.q(dn8Var);
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new mk4(this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, this.o0, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.Context, java.lang.Object, su.happ.proxyutility.feature.main.MainActivity, su.happ.proxyutility.ui.BaseActivity] */
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
        w39.n0(obj);
        m51 m51Var = ko1.B1;
        km4.x(this.g0.n());
        final ?? r1 = this.g0;
        final String str = this.h0;
        final SubscriptionItem subscriptionItem = this.i0;
        final boolean z = this.j0;
        final boolean z2 = this.k0;
        final String str2 = this.l0;
        final boolean z3 = this.m0;
        final boolean z4 = this.n0;
        final g83 g83Var = this.o0;
        dn2 dn2Var = new dn2() { // from class: kk4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final Object invoke() {
                MainActivity mainActivity = r1;
                u84 u84VarH = i21.H(mainActivity);
                nf1 nf1Var = tp1.a;
                jm4.Q(u84VarH, dm4.a, new lk4(mainActivity, str, subscriptionItem, z, z2, str2, z3, z4, g83Var, null), 2);
                return dn8.a;
            }
        };
        r1.getClass();
        be.m((BaseActivity) r1, r1.getString(y46.warning_text), r1.getString(y46.handshake_error_message), (String) null, r1.getString(y46.yes), r1.getString(y46.no), (Integer) null, dn2Var, (dn2) null, 1170);
        return dn8.a;
    }
}
