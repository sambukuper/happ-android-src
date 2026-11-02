package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class db1 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public byte h0;
    public /* synthetic */ boolean i0;
    public final /* synthetic */ ib1 j0;
    public final /* synthetic */ int k0;
    public Object l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db1(ib1 ib1Var, int i, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = ib1Var;
        this.k0 = i;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((db1) n(q51Var, bool)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        int i = this.k0;
        ib1 ib1Var = this.j0;
        switch (b) {
            case 0:
                db1 db1Var = new db1(ib1Var, i, q51Var, (byte) 0);
                db1Var.i0 = ((Boolean) obj).booleanValue();
                return db1Var;
            default:
                db1 db1Var2 = new db1(ib1Var, i, q51Var, (byte) 1);
                db1Var2.i0 = ((Boolean) obj).booleanValue();
                return db1Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
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
    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        Throwable th;
        hh7 u66Var;
        boolean z;
        boolean z2;
        Object obj2;
        int iHashCode;
        byte b = this.g0;
        int iIntValue = this.k0;
        c71 c71Var = c71.X;
        ib1 ib1Var = this.j0;
        switch (b) {
            case 0:
                boolean z3 = this.h0;
                try {
                    if (z3 == 0) {
                        w39.n0(obj);
                        boolean z4 = this.i0;
                        this.i0 = z4;
                        this.h0 = (byte) 1;
                        obj = ib1Var.g(z4, this);
                        z3 = z4;
                        if (obj == c71Var) {
                            return c71Var;
                        }
                    } else {
                        if (z3 != 1) {
                            if (z3 != 2) {
                                bt.i("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            boolean z5 = this.i0;
                            th = (Throwable) this.l0;
                            w39.n0(obj);
                            z3 = z5;
                            iIntValue = ((Number) obj).intValue();
                            th = th;
                            u66Var = new u66(th, iIntValue);
                            z = z3;
                            return new qg5(u66Var, Boolean.valueOf(z));
                        }
                        boolean z6 = this.i0;
                        w39.n0(obj);
                        z3 = z6;
                    }
                    u66Var = (hh7) obj;
                    z = z3;
                    break;
                } catch (Throwable th2) {
                    th = th2;
                    if (z3 != 0) {
                        ja7 ja7VarB = ib1Var.b();
                        this.l0 = th;
                        this.i0 = z3;
                        this.h0 = (byte) 2;
                        Integer numA = ja7VarB.a();
                        if (numA == c71Var) {
                            return c71Var;
                        }
                        obj = numA;
                        th = th;
                        z3 = z3;
                    }
                    u66Var = new u66(th, iIntValue);
                    z = z3;
                    return new qg5(u66Var, Boolean.valueOf(z));
                }
                return new qg5(u66Var, Boolean.valueOf(z));
            default:
                byte b2 = this.h0;
                if (b2 != 0) {
                    if (b2 == 1) {
                        z2 = this.i0;
                        w39.n0(obj);
                    } else {
                        if (b2 != 2) {
                            bt.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.l0;
                        w39.n0(obj);
                    }
                    iIntValue = ((Number) obj).intValue();
                    obj = obj2;
                    if (obj != null) {
                        iHashCode = obj.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    return new v91(iHashCode, iIntValue, obj);
                }
                w39.n0(obj);
                z2 = this.i0;
                this.i0 = z2;
                this.h0 = (byte) 1;
                obj = ((p92) ib1Var.l0.getValue()).a(new ta1(3, (q51) null), this);
                if (obj == c71Var) {
                    return c71Var;
                }
                if (z2) {
                    ja7 ja7VarB2 = ib1Var.b();
                    this.l0 = obj;
                    this.h0 = (byte) 2;
                    Integer numA2 = ja7VarB2.a();
                    if (numA2 == c71Var) {
                        return c71Var;
                    }
                    Object obj3 = obj;
                    obj = numA2;
                    obj2 = obj3;
                    iIntValue = ((Number) obj).intValue();
                    obj = obj2;
                }
                if (obj != null) {
                    iHashCode = obj.hashCode();
                } else {
                    iHashCode = 0;
                }
                return new v91(iHashCode, iIntValue, obj);
        }
    }
}
