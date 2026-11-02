package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.a;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e5 extends ak2 {
    public final /* synthetic */ byte l0 = 0;
    public final /* synthetic */ View m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.m0 = actionMenuItemView;
    }

    @Override // defpackage.ak2
    public final v87 b() {
        g5 g5Var;
        byte b = this.l0;
        View view = this.m0;
        switch (b) {
            case 0:
                f5 f5Var = ((ActionMenuItemView) view).s0;
                if (f5Var == null || (g5Var = ((h5) f5Var).a.v0) == null) {
                    return null;
                }
                return g5Var.a();
            default:
                g5 g5Var2 = ((i5) view).i0.u0;
                if (g5Var2 == null) {
                    return null;
                }
                return g5Var2.a();
        }
    }

    @Override // defpackage.ak2
    public final boolean c() {
        v87 v87VarB;
        byte b = this.l0;
        View view = this.m0;
        switch (b) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                mt4 mt4Var = actionMenuItemView.q0;
                return mt4Var != null && mt4Var.a(actionMenuItemView.n0) && (v87VarB = b()) != null && v87VarB.a();
            default:
                ((i5) view).i0.l();
                return true;
        }
    }

    @Override // defpackage.ak2
    public boolean d() {
        switch (this.l0) {
            case 1:
                a aVar = ((i5) this.m0).i0;
                if (aVar.w0 != null) {
                    return false;
                }
                aVar.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(i5 i5Var, i5 i5Var2) {
        super(i5Var2);
        this.m0 = i5Var;
    }
}
