package defpackage;

import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.l;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ck4 implements f91 {
    public final b6 X;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ck4(b6 b6Var) {
        b6Var.getClass();
        this.X = b6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean a(ck4 ck4Var, int i) {
        l lVarI = ck4Var.X.A0.I(i);
        aw7 aw7Var = lVarI instanceof aw7 ? (aw7) lVarI : null;
        if (aw7Var == null) {
            return false;
        }
        zv7 zv7Var = aw7Var.w;
        si3 si3Var = (si3) zv7Var.X;
        if (zv7Var.o()) {
            return si3Var.w0.requestFocus();
        }
        return zv7Var.n() ? si3Var.v0.requestFocus() : si3Var.h0.requestFocus();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b() {
        l lVarI = this.X.A0.I(0);
        aw7 aw7Var = lVarI instanceof aw7 ? (aw7) lVarI : null;
        if (aw7Var == null) {
            return false;
        }
        return ((si3) aw7Var.w.X).h0.requestFocus();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    public final void d() {
        boolean zY = ue3.y(hi5.a0(this));
        b6 b6Var = this.X;
        b6Var.E0.setFocusableInTouchMode(zY);
        b6Var.C0.setFocusableInTouchMode(zY);
        b6Var.i0.setFocusableInTouchMode(zY);
        b6Var.n0.setFocusableInTouchMode(zY);
        b6Var.f0.setFocusableInTouchMode(zY);
        b6Var.g0.setFocusableInTouchMode(zY);
        AppCompatButton appCompatButton = b6Var.o0;
        if (appCompatButton != null) {
            appCompatButton.setFocusableInTouchMode(zY);
        }
        b6Var.Y.setFocusableInTouchMode(zY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        b6 b6Var = this.X;
        x97.U(b6Var.E0, new am4(this, (byte) 0));
        x97.U(b6Var.C0, new am4(this, (byte) 1));
        x97.U(b6Var.n0, new am4(this, (byte) 2));
        x97.U(b6Var.f0, new am4(this, (byte) 3));
        x97.U(b6Var.g0, new am4(this, (byte) 4));
        x97.U(b6Var.i0, new am4(this, (byte) 5));
        AppCompatButton appCompatButton = b6Var.o0;
        if (appCompatButton != null) {
            x97.U(appCompatButton, new am4(this, (byte) 6));
        }
        x97.U(b6Var.Y, new am4(this, (byte) 7));
        x97.U(b6Var.y0, new am4(this, (byte) 8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ov8 q() {
        return this.X;
    }
}
