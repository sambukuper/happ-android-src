package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wx5 extends up2 implements ou4 {
    public final /* synthetic */ byte Y;
    public int Z;
    public int f0;
    public Object g0;

    public /* synthetic */ wx5(byte b) {
        this.Y = b;
    }

    @Override // defpackage.up2
    public final d2 b() {
        switch (this.Y) {
            case 0:
                ay5 ay5VarF = f();
                if (ay5VarF.d()) {
                    return ay5VarF;
                }
                throw new xm8();
            default:
                gy5 gy5VarG = g();
                if (gy5VarG.d()) {
                    return gy5VarG;
                }
                throw new xm8();
        }
    }

    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        gy5 gy5Var = null;
        ay5 ay5Var = null;
        try {
            try {
                switch (this.Y) {
                    case 0:
                        try {
                            ay5.j0.getClass();
                            h(new ay5(iv0Var, r62Var));
                            return this;
                        } catch (rh3 e) {
                            ay5 ay5Var2 = (ay5) e.X;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                ay5Var = ay5Var2;
                                if (ay5Var != null) {
                                    h(ay5Var);
                                }
                                throw th;
                            }
                        }
                    default:
                        try {
                            gy5.j0.getClass();
                            i(new gy5(iv0Var));
                            return this;
                        } catch (rh3 e2) {
                            gy5 gy5Var2 = (gy5) e2.X;
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                gy5Var = gy5Var2;
                                if (gy5Var != null) {
                                    i(gy5Var);
                                }
                                throw th;
                            }
                        }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final Object clone() {
        switch (this.Y) {
            case 0:
                wx5 wx5Var = new wx5((byte) 0);
                wx5Var.g0 = zx5.r0;
                wx5Var.h(f());
                return wx5Var;
            default:
                wx5 wx5Var2 = new wx5((byte) 1);
                wx5Var2.g0 = jb0.X;
                wx5Var2.i(g());
                return wx5Var2;
        }
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        switch (this.Y) {
            case 0:
                h((ay5) bq2Var);
                break;
            default:
                i((gy5) bq2Var);
                break;
        }
        return this;
    }

    public ay5 f() {
        ay5 ay5Var = new ay5(this);
        int i = this.Z;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ay5Var.Z = this.f0;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ay5Var.f0 = (zx5) this.g0;
        ay5Var.Y = i2;
        return ay5Var;
    }

    public gy5 g() {
        gy5 gy5Var = new gy5(this);
        int i = this.Z;
        int i2 = (i & 1) != 1 ? 0 : 1;
        gy5Var.Z = this.f0;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        gy5Var.f0 = (mc4) this.g0;
        gy5Var.Y = i2;
        return gy5Var;
    }

    public void h(ay5 ay5Var) {
        zx5 zx5Var;
        if (ay5Var == ay5.i0) {
            return;
        }
        int i = ay5Var.Y;
        if ((i & 1) == 1) {
            int i2 = ay5Var.Z;
            this.Z = 1 | this.Z;
            this.f0 = i2;
        }
        if ((i & 2) == 2) {
            zx5 zx5Var2 = ay5Var.f0;
            if ((this.Z & 2) != 2 || (zx5Var = (zx5) this.g0) == zx5.r0) {
                this.g0 = zx5Var2;
            } else {
                xx5 xx5VarG = xx5.g();
                xx5VarG.h(zx5Var);
                xx5VarG.h(zx5Var2);
                this.g0 = xx5VarG.f();
            }
            this.Z |= 2;
        }
        this.X = this.X.b(ay5Var.X);
    }

    public void i(gy5 gy5Var) {
        if (gy5Var == gy5.i0) {
            return;
        }
        int i = gy5Var.Y;
        if ((i & 1) == 1) {
            int i2 = gy5Var.Z;
            this.Z = 1 | this.Z;
            this.f0 = i2;
        }
        if ((i & 2) == 2) {
            mc4 mc4Var = gy5Var.f0;
            mc4Var.getClass();
            this.Z = 2 | this.Z;
            this.g0 = mc4Var;
        }
        this.X = this.X.b(gy5Var.X);
    }
}
