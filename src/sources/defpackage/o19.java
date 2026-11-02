package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class o19 extends n19 {
    public fe3 s;
    public fe3 t;
    public fe3 u;

    public o19(w19 w19Var, WindowInsets windowInsets) {
        super(w19Var, windowInsets);
        this.s = null;
        this.t = null;
        this.u = null;
    }

    @Override // defpackage.t19
    public fe3 j() {
        fe3 fe3Var = this.t;
        if (fe3Var != null) {
            return fe3Var;
        }
        fe3 fe3VarD = fe3.d(this.c.getMandatorySystemGestureInsets());
        this.t = fe3VarD;
        return fe3VarD;
    }

    @Override // defpackage.t19
    public fe3 l() {
        fe3 fe3Var = this.s;
        if (fe3Var != null) {
            return fe3Var;
        }
        fe3 fe3VarD = fe3.d(this.c.getSystemGestureInsets());
        this.s = fe3VarD;
        return fe3VarD;
    }

    @Override // defpackage.t19
    public fe3 n() {
        fe3 fe3Var = this.u;
        if (fe3Var != null) {
            return fe3Var;
        }
        fe3 fe3VarD = fe3.d(this.c.getTappableElementInsets());
        this.u = fe3VarD;
        return fe3VarD;
    }

    @Override // defpackage.l19, defpackage.t19
    public w19 q(int i, int i2, int i3, int i4) {
        return w19.g(null, this.c.inset(i, i2, i3, i4));
    }

    @Override // defpackage.m19, defpackage.t19
    public void x(fe3 fe3Var) {
    }
}
