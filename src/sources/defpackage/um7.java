package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lum7;", "Lqx4;", "Lvm7;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class um7 extends qx4 {
    public final ot1 X;

    public um7(ot1 ot1Var) {
        this.X = ot1Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new vm7(pu.A, this.X);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        vm7 vm7Var = (vm7) jx4Var;
        sf sfVar = pu.A;
        if (!dh3.f(vm7Var.r0, sfVar)) {
            vm7Var.r0 = sfVar;
            if (vm7Var.s0) {
                vm7Var.a1();
            }
        }
        vm7Var.q0 = this.X;
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um7)) {
            return false;
        }
        um7 um7Var = (um7) obj;
        sf sfVar = pu.A;
        return sfVar.equals(sfVar) && dh3.f(this.X, um7Var.X);
    }

    public final int hashCode() {
        int iF = pc6.f(1022 * 31, 31, false);
        ot1 ot1Var = this.X;
        return iF + (ot1Var != null ? ot1Var.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + pu.A + ", overrideDescendants=false, touchBoundsExpansion=" + this.X + ")";
    }
}
