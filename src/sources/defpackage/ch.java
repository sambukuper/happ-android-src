package defpackage;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ch implements q38 {
    public final View a;
    public final gn2 b;
    public final dn2 c;
    public final m15 d = new m15();
    public final xd7 e = new xd7(new xg(this, 0));
    public final xg f = new xg(this, 1);
    public final xg g = new xg(this, 2);
    public ActionMode h;
    public j0 i;
    public Runnable j;

    public ch(View view, gn2 gn2Var, dn2 dn2Var) {
        this.a = view;
        this.b = gn2Var;
        this.c = dn2Var;
    }

    @Override // defpackage.q38
    public final Object a(h38 h38Var, uy7 uy7Var) {
        q51 q51Var = null;
        da daVar = new da(this, h38Var, q51Var, (byte) 2);
        m15 m15Var = this.d;
        m15Var.getClass();
        Object objN = gv3.n(new kg3(f15.X, m15Var, daVar, q51Var, (byte) 1), uy7Var);
        return objN == c71.X ? objN : dn8.a;
    }
}
