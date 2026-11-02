package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t71 extends g24 implements rn2 {
    public final /* synthetic */ ce8 Y;
    public final /* synthetic */ ta2 Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ zy0 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t71(ce8 ce8Var, ta2 ta2Var, Object obj, zy0 zy0Var) {
        super(2);
        this.Y = ce8Var;
        this.Z = ta2Var;
        this.f0 = obj;
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
    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        Object objC;
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            ug8 ug8Var = ys0.j0;
            ce8 ce8Var = this.Y;
            boolean zG = ce8Var.g();
            be beVar = zz0.a;
            if (zG) {
                lp2Var.W(1666827533);
                lp2Var.p(false);
                objC = ce8Var.c();
            } else {
                lp2Var.W(1666573488);
                boolean zF = lp2Var.f(ce8Var);
                objC = lp2Var.K();
                if (zF || objC == beVar) {
                    dd7 dd7VarD = yn0.D();
                    gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
                    dd7 dd7VarP = yn0.P(dd7VarD);
                    try {
                        Object objC2 = ce8Var.c();
                        yn0.c0(dd7VarD, dd7VarP, gn2VarE);
                        lp2Var.g0(objC2);
                        objC = objC2;
                    } catch (Throwable th) {
                        yn0.c0(dd7VarD, dd7VarP, gn2VarE);
                        throw th;
                    }
                }
                lp2Var.p(false);
            }
            lp2Var.W(1378811975);
            Object obj3 = this.f0;
            float f = dh3.f(objC, obj3) ? 1.0f : 0.0f;
            lp2Var.p(false);
            Float fValueOf = Float.valueOf(f);
            boolean zF2 = lp2Var.f(ce8Var);
            Object objK = lp2Var.K();
            if (zF2 || objK == beVar) {
                objK = rd7.b(new s71(ce8Var, (byte) 0));
                lp2Var.g0(objK);
            }
            Object value = ((lh7) objK).getValue();
            lp2Var.W(1378811975);
            float f2 = dh3.f(value, obj3) ? 1.0f : 0.0f;
            lp2Var.p(false);
            Float fValueOf2 = Float.valueOf(f2);
            boolean zF3 = lp2Var.f(ce8Var);
            Object objK2 = lp2Var.K();
            if (zF3 || objK2 == beVar) {
                objK2 = rd7.b(new s71(ce8Var, (byte) 1));
                lp2Var.g0(objK2);
            }
            lp2Var.W(955869654);
            lp2Var.p(false);
            yd8 yd8VarH = rq7.h(ce8Var, fValueOf, fValueOf2, this.Z, ug8Var, lp2Var, 0);
            boolean zF4 = lp2Var.f(yd8VarH);
            Object objK3 = lp2Var.K();
            if (zF4 || objK3 == beVar) {
                objK3 = new wi(yd8VarH, (byte) 4);
                lp2Var.g0(objK3);
            }
            kx4 kx4VarI = jm4.I(hx4.X, (gn2) objK3);
            xr4 xr4VarC = g80.c(pz2.Z, false);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarI);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, xr4VarC);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            pn7.j(lp2Var, Integer.valueOf(iHashCode));
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            this.g0.x(obj3, lp2Var, 0);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        return dn8.a;
    }
}
