package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class av2 extends m31 {
    public float q0 = -1.0f;
    public int r0 = -1;
    public int s0 = -1;
    public u21 t0 = this.J;
    public int u0 = 0;
    public boolean v0;

    public av2() {
        this.R.clear();
        this.R.add(this.t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.t0;
        }
    }

    @Override // defpackage.m31
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.m31
    public final boolean B() {
        return this.v0;
    }

    @Override // defpackage.m31
    public final void Q(ka4 ka4Var, boolean z) {
        if (this.T == null) {
            return;
        }
        u21 u21Var = this.t0;
        ka4Var.getClass();
        int iN = ka4.n(u21Var);
        if (this.u0 == 1) {
            this.Y = iN;
            this.Z = 0;
            L(this.T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = iN;
        O(this.T.q());
        L(0);
    }

    public final void R(int i) {
        this.t0.l(i);
        this.v0 = true;
    }

    public final void S(int i) {
        u21 u21Var;
        if (this.u0 == i) {
            return;
        }
        this.u0 = i;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.u0 == 1) {
            u21Var = this.I;
            this.t0 = u21Var;
        } else {
            u21Var = this.J;
            this.t0 = u21Var;
        }
        arrayList.add(u21Var);
        u21[] u21VarArr = this.Q;
        int length = u21VarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            u21VarArr[i2] = this.t0;
        }
    }

    @Override // defpackage.m31
    public final void b(ka4 ka4Var, boolean z) {
        n31 n31Var = this.T;
        if (n31Var == null) {
            return;
        }
        Object objI = n31Var.i(2);
        Object objI2 = n31Var.i(4);
        n31 n31Var2 = this.T;
        boolean z2 = n31Var2 != null && n31Var2.p0[0] == 2;
        if (this.u0 == 0) {
            objI = n31Var.i(3);
            objI2 = n31Var.i(5);
            n31 n31Var3 = this.T;
            z2 = n31Var3 != null && n31Var3.p0[1] == 2;
        }
        if (this.v0) {
            u21 u21Var = this.t0;
            if (u21Var.c) {
                ge7 ge7VarK = ka4Var.k(u21Var);
                ka4Var.d(ge7VarK, this.t0.d());
                if (this.r0 != -1) {
                    if (z2) {
                        ka4Var.f(ka4Var.k(objI2), ge7VarK, 0, 5);
                    }
                } else if (this.s0 != -1 && z2) {
                    ge7 ge7VarK2 = ka4Var.k(objI2);
                    ka4Var.f(ge7VarK, ka4Var.k(objI), 0, 5);
                    ka4Var.f(ge7VarK2, ge7VarK, 0, 5);
                }
                this.v0 = false;
                return;
            }
        }
        if (this.r0 != -1) {
            ge7 ge7VarK3 = ka4Var.k(this.t0);
            ka4Var.e(ge7VarK3, ka4Var.k(objI), this.r0, 8);
            if (z2) {
                ka4Var.f(ka4Var.k(objI2), ge7VarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.s0 != -1) {
            ge7 ge7VarK4 = ka4Var.k(this.t0);
            ge7 ge7VarK5 = ka4Var.k(objI2);
            ka4Var.e(ge7VarK4, ge7VarK5, -this.s0, 8);
            if (z2) {
                ka4Var.f(ge7VarK4, ka4Var.k(objI), 0, 5);
                ka4Var.f(ge7VarK5, ge7VarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.q0 != -1.0f) {
            ge7 ge7VarK6 = ka4Var.k(this.t0);
            ge7 ge7VarK7 = ka4Var.k(objI2);
            float f = this.q0;
            zt ztVarL = ka4Var.l();
            ztVarL.d.g(ge7VarK6, -1.0f);
            ztVarL.d.g(ge7VarK7, f);
            ka4Var.c(ztVarL);
        }
    }

    @Override // defpackage.m31
    public final boolean c() {
        return true;
    }

    @Override // defpackage.m31
    public final u21 i(int i) {
        int iB = p61.B(i);
        if (iB != 1) {
            if (iB != 2) {
                if (iB != 3) {
                    if (iB != 4) {
                        return null;
                    }
                }
            }
            if (this.u0 == 0) {
                return this.t0;
            }
            return null;
        }
        if (this.u0 == 1) {
            return this.t0;
        }
        return null;
    }
}
