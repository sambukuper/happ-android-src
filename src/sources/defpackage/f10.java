package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f10 extends xz2 {
    public int s0;
    public boolean t0;
    public int u0;
    public boolean v0;

    @Override // defpackage.m31
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.m31
    public final boolean B() {
        return this.v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.r0;
            if (i4 >= i) {
                break;
            }
            m31 m31Var = this.q0[i4];
            if ((this.t0 || m31Var.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && !m31Var.A()) || (((i3 = this.s0) == 2 || i3 == 3) && !m31Var.B()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.r0; i5++) {
            m31 m31Var2 = this.q0[i5];
            if (this.t0 || m31Var2.c()) {
                if (!z2) {
                    int i6 = this.s0;
                    if (i6 == 0) {
                        iMax = m31Var2.i(2).d();
                    } else if (i6 == 1) {
                        iMax = m31Var2.i(4).d();
                    } else if (i6 == 2) {
                        iMax = m31Var2.i(3).d();
                    } else if (i6 == 3) {
                        iMax = m31Var2.i(5).d();
                    }
                    z2 = true;
                }
                int i7 = this.s0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, m31Var2.i(2).d());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, m31Var2.i(4).d());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, m31Var2.i(3).d());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, m31Var2.i(5).d());
                }
            }
        }
        int i8 = iMax + this.u0;
        int i9 = this.s0;
        if (i9 == 0 || i9 == 1) {
            J(i8, i8);
        } else {
            K(i8, i8);
        }
        this.v0 = true;
        return true;
    }

    public final int U() {
        int i = this.s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.m31
    public final void b(ka4 ka4Var, boolean z) {
        boolean z2;
        int i;
        int i2;
        u21[] u21VarArr = this.Q;
        u21 u21Var = this.I;
        u21VarArr[0] = u21Var;
        int i3 = 2;
        u21 u21Var2 = this.J;
        u21VarArr[2] = u21Var2;
        u21 u21Var3 = this.K;
        u21VarArr[1] = u21Var3;
        u21 u21Var4 = this.L;
        u21VarArr[3] = u21Var4;
        for (u21 u21Var5 : u21VarArr) {
            u21Var5.i = ka4Var.k(u21Var5);
        }
        int i4 = this.s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        u21 u21Var6 = u21VarArr[i4];
        if (!this.v0) {
            T();
        }
        if (this.v0) {
            this.v0 = false;
            int i5 = this.s0;
            if (i5 == 0 || i5 == 1) {
                ka4Var.d(u21Var.i, this.Y);
                ka4Var.d(u21Var3.i, this.Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    ka4Var.d(u21Var2.i, this.Z);
                    ka4Var.d(u21Var4.i, this.Z);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.r0) {
                z2 = false;
                break;
            }
            m31 m31Var = this.q0[i6];
            if ((this.t0 || m31Var.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && m31Var.p0[0] == 3 && m31Var.I.f != null && m31Var.K.f != null) || ((i2 == 2 || i2 == 3) && m31Var.p0[1] == 3 && m31Var.J.f != null && m31Var.L.f != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = u21Var.g() || u21Var3.g();
        boolean z4 = u21Var2.g() || u21Var4.g();
        int i7 = !(!z2 && (((i = this.s0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.r0) {
            m31 m31Var2 = this.q0[i8];
            if (this.t0 || m31Var2.c()) {
                ge7 ge7VarK = ka4Var.k(m31Var2.Q[this.s0]);
                u21[] u21VarArr2 = m31Var2.Q;
                int i9 = this.s0;
                u21 u21Var7 = u21VarArr2[i9];
                u21Var7.i = ge7VarK;
                u21 u21Var8 = u21Var7.f;
                int i10 = (u21Var8 == null || u21Var8.d != this) ? 0 : u21Var7.g;
                if (i9 == 0 || i9 == i3) {
                    ge7 ge7Var = u21Var6.i;
                    int i11 = this.u0 - i10;
                    zt ztVarL = ka4Var.l();
                    ge7 ge7VarM = ka4Var.m();
                    ge7VarM.f0 = 0;
                    ztVarL.c(ge7Var, ge7VarK, ge7VarM, i11);
                    ka4Var.c(ztVarL);
                } else {
                    ge7 ge7Var2 = u21Var6.i;
                    int i12 = this.u0 + i10;
                    zt ztVarL2 = ka4Var.l();
                    ge7 ge7VarM2 = ka4Var.m();
                    ge7VarM2.f0 = 0;
                    ztVarL2.b(ge7Var2, ge7VarK, ge7VarM2, i12);
                    ka4Var.c(ztVarL2);
                }
                ka4Var.e(u21Var6.i, ge7VarK, this.u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.s0;
        if (i13 == 0) {
            ka4Var.e(u21Var3.i, u21Var.i, 0, 8);
            ka4Var.e(u21Var.i, this.T.K.i, 0, 4);
            ka4Var.e(u21Var.i, this.T.I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            ka4Var.e(u21Var.i, u21Var3.i, 0, 8);
            ka4Var.e(u21Var.i, this.T.I.i, 0, 4);
            ka4Var.e(u21Var.i, this.T.K.i, 0, 0);
        } else if (i13 == 2) {
            ka4Var.e(u21Var4.i, u21Var2.i, 0, 8);
            ka4Var.e(u21Var2.i, this.T.L.i, 0, 4);
            ka4Var.e(u21Var2.i, this.T.J.i, 0, 0);
        } else if (i13 == 3) {
            ka4Var.e(u21Var2.i, u21Var4.i, 0, 8);
            ka4Var.e(u21Var2.i, this.T.J.i, 0, 4);
            ka4Var.e(u21Var2.i, this.T.L.i, 0, 0);
        }
    }

    @Override // defpackage.m31
    public final boolean c() {
        return true;
    }

    @Override // defpackage.m31
    public final String toString() {
        String strP = oi0.p(new StringBuilder("[Barrier] "), this.h0, " {");
        for (int i = 0; i < this.r0; i++) {
            m31 m31Var = this.q0[i];
            if (i > 0) {
                strP = strP.concat(", ");
            }
            strP = strP + m31Var.h0;
        }
        return strP.concat("}");
    }
}
