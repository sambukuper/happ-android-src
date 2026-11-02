package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ww0 implements ze2 {
    public final /* synthetic */ x90 X;
    public final /* synthetic */ int Y;

    public ww0(x90 x90Var, int i) {
        this.X = x90Var;
        this.Y = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
    @Override // defpackage.ze2
    public final Object l(Object obj, q51 q51Var) {
        vw0 vw0Var;
        Object obj2;
        if (q51Var instanceof vw0) {
            vw0Var = (vw0) q51Var;
            int i = vw0Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                vw0Var.h0 = i - Integer.MIN_VALUE;
            } else {
                vw0Var = new vw0(this, q51Var);
            }
        } else {
            vw0Var = new vw0(this, q51Var);
        }
        Object obj3 = vw0Var.f0;
        int i2 = vw0Var.h0;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        if (i2 == 0) {
            w39.n0(obj3);
            pb3 pb3Var = new pb3(this.Y, obj);
            vw0Var.h0 = 1;
            if (this.X.a(vw0Var, pb3Var) != c71Var) {
            }
        }
        if (i2 == 1) {
            w39.n0(obj3);
        } else {
            if (i2 != 2) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj3);
        }
        vw0Var.h0 = 2;
        s61 s61VarW = vw0Var.w();
        u70.I(s61VarW);
        q51 q51VarH = mb6.H(vw0Var);
        np1 np1Var = q51VarH instanceof np1 ? (np1) q51VarH : null;
        if (np1Var == null) {
            obj2 = dn8Var;
        } else {
            u61 u61Var = np1Var.f0;
            if (op1.c(u61Var, s61VarW)) {
                np1Var.h0 = dn8Var;
                np1Var.Z = 1;
                u61Var.a1(s61VarW, np1Var);
            } else {
                g79 g79Var = new g79(g79.Z);
                s61 s61VarB0 = s61VarW.B0(g79Var);
                np1Var.h0 = dn8Var;
                np1Var.Z = 1;
                u61Var.a1(s61VarB0, np1Var);
                if (g79Var.Y) {
                    d42 d42VarA = j98.a();
                    kt ktVar = d42VarA.g0;
                    if (!(ktVar != null ? ktVar.isEmpty() : true)) {
                        if (d42VarA.Z >= 4294967296L) {
                            np1Var.h0 = dn8Var;
                            np1Var.Z = 1;
                            d42VarA.e1(np1Var);
                        } else {
                            d42VarA.f1(true);
                            try {
                                np1Var.run();
                                do {
                                } while (d42VarA.h1());
                            } catch (Throwable th) {
                                try {
                                    np1Var.h(th);
                                } catch (Throwable th2) {
                                    d42VarA.d1(true);
                                    throw th2;
                                }
                            }
                            d42VarA.d1(true);
                        }
                    }
                    obj2 = dn8Var;
                }
            }
            obj2 = c71Var;
        }
        if (obj2 != c71Var) {
            obj2 = dn8Var;
        }
        return obj2 == c71Var ? c71Var : dn8Var;
    }
}
