package defpackage;

import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i53 {
    public static final o53 a;

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
    static {
        Object size = new Size(640, 480);
        Object ef6Var = new ef6(pz2.t0, new ff6(cb7.b));
        h53 h53Var = new h53((byte) 0);
        zx zxVar = i63.x;
        k05 k05Var = h53Var.Y;
        k05Var.o(zxVar, size);
        k05Var.o(er8.P, 1);
        k05Var.o(i63.s, 0);
        k05Var.o(i63.A, ef6Var);
        px1 px1Var = px1.d;
        if (!px1Var.equals(px1Var)) {
            u52.k("ImageAnalysis currently only supports SDR");
        } else {
            k05Var.o(e63.r, px1Var);
            a = new o53(qd5.c(k05Var));
        }
    }
}
