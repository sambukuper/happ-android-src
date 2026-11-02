package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zi extends g24 implements sn2 {
    public final /* synthetic */ Object Y;
    public final /* synthetic */ vd7 Z;
    public final /* synthetic */ lj f0;
    public final /* synthetic */ zy0 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(Object obj, vd7 vd7Var, lj ljVar, zy0 zy0Var) {
        super(3);
        this.Y = obj;
        this.Z = vd7Var;
        this.f0 = ljVar;
        this.g0 = zy0Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        ek ekVar = (ek) obj;
        lp2 lp2Var = (lp2) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? lp2Var.f(ekVar) : lp2Var.h(ekVar) ? 4 : 2;
        }
        if (lp2Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            vd7 vd7Var = this.Z;
            boolean zF = lp2Var.f(vd7Var);
            Object obj4 = this.Y;
            boolean zH = zF | lp2Var.h(obj4);
            lj ljVar = this.f0;
            boolean zH2 = zH | lp2Var.h(ljVar);
            Object objK = lp2Var.K();
            be beVar = zz0.a;
            if (zH2 || objK == beVar) {
                objK = new w12(vd7Var, obj4, ljVar, (byte) 2);
                lp2Var.g0(objK);
            }
            u70.b(ekVar, obj4, (gn2) objK, lp2Var);
            s05 s05Var = ljVar.c;
            ekVar.getClass();
            s05Var.l(obj4, ((fk) ekVar).b);
            Object objK2 = lp2Var.K();
            if (objK2 == beVar) {
                objK2 = new ej(ekVar);
                lp2Var.g0(objK2);
            }
            this.g0.F((ej) objK2, obj4, lp2Var, 0);
        } else {
            lp2Var.Q();
        }
        return dn8.a;
    }
}
