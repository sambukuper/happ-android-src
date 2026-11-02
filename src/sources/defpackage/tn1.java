package defpackage;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tn1 extends jv0 {
    public final /* synthetic */ un1 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn1(un1 un1Var) {
        super(1);
        this.Z = un1Var;
    }

    @Override // defpackage.jv0
    public final w19 f(w19 w19Var, List list) {
        un1 un1Var = this.Z;
        if (!un1Var.s0) {
            View childAt = un1Var.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, un1Var.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, un1Var.getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return w19Var.a.q(iMax, iMax2, iMax3, iMax4);
            }
        }
        return w19Var;
    }

    @Override // defpackage.jv0
    public final xd6 g(c19 c19Var, xd6 xd6Var) {
        un1 un1Var = this.Z;
        if (!un1Var.s0) {
            View childAt = un1Var.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, un1Var.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, un1Var.getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                fe3 fe3VarC = fe3.c(iMax, iMax2, iMax3, iMax4);
                int i = fe3VarC.a;
                fe3 fe3Var = (fe3) xd6Var.Y;
                int i2 = fe3VarC.b;
                int i3 = fe3VarC.c;
                int i4 = fe3VarC.d;
                return new xd6(w19.e(fe3Var, i, i2, i3, i4), w19.e((fe3) xd6Var.Z, i, i2, i3, i4), (byte) 26);
            }
        }
        return xd6Var;
    }
}
