package defpackage;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c54 implements dn2 {
    public final /* synthetic */ byte X;
    public final f54 Y;

    public /* synthetic */ c54(f54 f54Var, byte b) {
        this.X = b;
        this.Y = f54Var;
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
    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        f54 f54Var = this.Y;
        switch (b) {
            case 0:
                pk1 pk1Var = pk1.m;
                et4.a.getClass();
                gn2 gn2Var = cl1.F0;
                pk1Var.getClass();
                List list = pk1Var.a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                boolean zA = pk1Var.a(pk1.l);
                x45 x45Var = x45.f0;
                if (zA) {
                    for (v15 v15Var : f54Var.h(pk1Var, gn2Var)) {
                        gn2Var.B(v15Var);
                        ot0 ot0VarE = f54Var.e(v15Var, x45Var);
                        if (ot0VarE != null) {
                            linkedHashSet.add(ot0VarE);
                        }
                    }
                }
                if (pk1Var.a(pk1.i) && !list.contains(lk1.a)) {
                    for (v15 v15Var2 : f54Var.i(pk1Var, gn2Var)) {
                        gn2Var.B(v15Var2);
                        linkedHashSet.addAll(f54Var.b(v15Var2, x45Var));
                    }
                }
                if (pk1Var.a(pk1.j) && !list.contains(lk1.a)) {
                    for (v15 v15Var3 : f54Var.o(pk1Var)) {
                        gn2Var.B(v15Var3);
                        linkedHashSet.addAll(f54Var.f(v15Var3, x45Var));
                    }
                }
                return wv0.Y0(linkedHashSet);
            case 1:
                return f54Var.k();
            case 2:
                return f54Var.i(pk1.p, null);
            case 3:
                return f54Var.o(pk1.q);
            default:
                return f54Var.h(pk1.o, null);
        }
    }
}
