package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bu3 extends up2 implements ou4 {
    public final /* synthetic */ byte Y;
    public int Z;
    public int f0;
    public int g0;

    public /* synthetic */ bu3(byte b) {
        this.Y = b;
    }

    @Override // defpackage.up2
    public final d2 b() {
        switch (this.Y) {
            case 0:
                cu3 cu3VarF = f();
                if (cu3VarF.d()) {
                    return cu3VarF;
                }
                throw new xm8();
            default:
                du3 du3VarG = g();
                if (du3VarG.d()) {
                    return du3VarG;
                }
                throw new xm8();
        }
    }

    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        du3 du3Var = null;
        cu3 cu3Var = null;
        try {
            try {
                switch (this.Y) {
                    case 0:
                        try {
                            cu3.j0.getClass();
                            h(new cu3(iv0Var));
                            return this;
                        } catch (rh3 e) {
                            cu3 cu3Var2 = (cu3) e.X;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                cu3Var = cu3Var2;
                                if (cu3Var != null) {
                                    h(cu3Var);
                                }
                                throw th;
                            }
                        }
                    default:
                        try {
                            du3.j0.getClass();
                            i(new du3(iv0Var));
                            return this;
                        } catch (rh3 e2) {
                            du3 du3Var2 = (du3) e2.X;
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                du3Var = du3Var2;
                                if (du3Var != null) {
                                    i(du3Var);
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
                bu3 bu3Var = new bu3((byte) 0);
                bu3Var.h(f());
                return bu3Var;
            default:
                bu3 bu3Var2 = new bu3((byte) 1);
                bu3Var2.i(g());
                return bu3Var2;
        }
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        switch (this.Y) {
            case 0:
                h((cu3) bq2Var);
                break;
            default:
                i((du3) bq2Var);
                break;
        }
        return this;
    }

    public cu3 f() {
        cu3 cu3Var = new cu3(this);
        int i = this.Z;
        int i2 = (i & 1) != 1 ? 0 : 1;
        cu3Var.Z = this.f0;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        cu3Var.f0 = this.g0;
        cu3Var.Y = i2;
        return cu3Var;
    }

    public du3 g() {
        du3 du3Var = new du3(this);
        int i = this.Z;
        int i2 = (i & 1) != 1 ? 0 : 1;
        du3Var.Z = this.f0;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        du3Var.f0 = this.g0;
        du3Var.Y = i2;
        return du3Var;
    }

    public void h(cu3 cu3Var) {
        if (cu3Var == cu3.i0) {
            return;
        }
        int i = cu3Var.Y;
        if ((i & 1) == 1) {
            int i2 = cu3Var.Z;
            this.Z = 1 | this.Z;
            this.f0 = i2;
        }
        if ((i & 2) == 2) {
            int i3 = cu3Var.f0;
            this.Z = 2 | this.Z;
            this.g0 = i3;
        }
        this.X = this.X.b(cu3Var.X);
    }

    public void i(du3 du3Var) {
        if (du3Var == du3.i0) {
            return;
        }
        int i = du3Var.Y;
        if ((i & 1) == 1) {
            int i2 = du3Var.Z;
            this.Z = 1 | this.Z;
            this.f0 = i2;
        }
        if ((i & 2) == 2) {
            int i3 = du3Var.f0;
            this.Z = 2 | this.Z;
            this.g0 = i3;
        }
        this.X = this.X.b(du3Var.X);
    }
}
