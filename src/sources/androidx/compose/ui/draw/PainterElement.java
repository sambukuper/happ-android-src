package androidx.compose.ui.draw;

import defpackage.dh3;
import defpackage.g60;
import defpackage.jx4;
import defpackage.nr4;
import defpackage.og5;
import defpackage.p50;
import defpackage.pc6;
import defpackage.pz2;
import defpackage.qx4;
import defpackage.ua7;
import defpackage.y41;
import defpackage.z68;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Lqx4;", "Landroidx/compose/ui/draw/PainterNode;", "Log5;", "painter", "Log5;", "getPainter", "()Log5;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class PainterElement extends qx4 {
    public final g60 X;
    private final og5 painter;

    public PainterElement(og5 og5Var, g60 g60Var) {
        this.painter = og5Var;
        this.X = g60Var;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new PainterNode(this.painter, this.X);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        PainterNode painterNode = (PainterNode) jx4Var;
        painterNode.getClass();
        boolean zA = ua7.a(painterNode.getPainter().h(), this.painter.h());
        painterNode.d1(this.painter);
        painterNode.q0 = this.X;
        if (!zA) {
            nr4.E(painterNode);
        }
        z68.W(painterNode);
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
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        if (!dh3.f(this.painter, painterElement.painter)) {
            return false;
        }
        p50 p50Var = pz2.i0;
        return p50Var.equals(p50Var) && Float.compare(1.0f, 1.0f) == 0 && dh3.f(this.X, painterElement.X);
    }

    public final int hashCode() {
        int iD = pc6.d((y41.a.hashCode() + ((Float.hashCode(0.0f) + (Float.hashCode(0.0f) * 31) + pc6.f(this.painter.hashCode() * 31, 31, true)) * 31)) * 31, 1.0f, 31);
        g60 g60Var = this.X;
        return iD + (g60Var == null ? 0 : g60Var.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=true, alignment=" + pz2.i0 + ", contentScale=" + y41.a + ", alpha=1.0, colorFilter=" + this.X + ")";
    }
}
