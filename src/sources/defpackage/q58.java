package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q58 {
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q58)) {
            return false;
        }
        n50 n50Var = pz2.q0;
        return n50Var.equals(n50Var) && n50Var.equals(n50Var);
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + pc6.d(Boolean.hashCode(false) * 31, -1.0f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Attached(alwaysMinimize=false, minimizedAlignment=");
        n50 n50Var = pz2.q0;
        sb.append(n50Var);
        sb.append(", expandedAlignment=");
        sb.append(n50Var);
        sb.append(')');
        return sb.toString();
    }
}
