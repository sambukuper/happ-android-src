package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n08 extends ne3 {
    public gn2 t0;
    public c29 u0;

    @Override // defpackage.ie3, defpackage.jx4
    public final void Q0() {
        View viewS = ys0.S(this);
        WeakHashMap weakHashMap = c29.w;
        c29 c29VarC = hw7.c(viewS);
        c29VarC.a(viewS);
        v09 v09Var = (v09) this.t0.B(c29VarC);
        if (!dh3.f(v09Var, this.s0)) {
            this.s0 = v09Var;
            Z0();
        }
        this.u0 = c29VarC;
        super.Q0();
    }

    @Override // defpackage.ie3, defpackage.jx4
    public final void R0() {
        View viewS = ys0.S(this);
        c29 c29Var = this.u0;
        if (c29Var != null) {
            int i = c29Var.u - 1;
            c29Var.u = i;
            if (i == 0) {
                WeakHashMap weakHashMap = cw8.a;
                uv8.c(viewS, null);
                c19.a(viewS, null);
                viewS.removeOnAttachStateChangeListener(c29Var.v);
            }
        }
        super.R0();
    }
}
