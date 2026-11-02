package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c00 extends jx4 {
    public t98 q0;
    public final /* synthetic */ d00 r0;

    public c00(d00 d00Var) {
        this.r0 = d00Var;
    }

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
    @Override // defpackage.jx4
    public final void Q0() {
        d00 d00Var = this.r0;
        d00Var.X = this;
        if (d00Var.Y != null) {
            p0 p0Var = new p0(this, d00Var, (byte) 5);
            LayoutNode layoutNodeZ = yn0.Z(this);
            int i = layoutNodeZ.Y;
            u86 rectManager = q34.a(layoutNodeZ).getRectManager();
            u98 u98Var = rectManager.d;
            u98Var.getClass();
            vz4 vz4Var = u98Var.a;
            t98 t98Var = new t98(u98Var, i, this, p0Var);
            Object objB = vz4Var.b(i);
            if (objB == null) {
                vz4Var.h(i, t98Var);
                objB = t98Var;
            }
            t98 t98Var2 = (t98) objB;
            if (t98Var2 != t98Var) {
                while (true) {
                    t98 t98Var3 = t98Var2.d;
                    if (t98Var3 == null) {
                        break;
                    } else {
                        t98Var2 = t98Var3;
                    }
                }
                t98Var2.d = t98Var;
            }
            LayoutNode layoutNodeZ2 = yn0.Z(this.X);
            if (layoutNodeZ2.i0 != -4) {
                ne neVar = rectManager.c;
                int iD = rectManager.d(layoutNodeZ2);
                long[] jArr = (long[]) neVar.c;
                int i2 = iD + 2;
                jArr[i2] = (jArr[i2] & 8070450532247928831L) | (-8070450532247928832L);
            }
            rectManager.f = true;
            rectManager.j();
            this.q0 = t98Var;
        }
    }

    @Override // defpackage.jx4
    public final void R0() {
        d00 d00Var = this.r0;
        if (d00Var.X == this) {
            d00Var.X = null;
        }
        t98 t98Var = this.q0;
        if (t98Var != null) {
            t98Var.b();
        }
        this.q0 = null;
    }
}
