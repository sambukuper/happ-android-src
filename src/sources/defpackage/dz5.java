package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dz5 extends up2 implements ou4 {
    public int Y;
    public int Z;
    public int f0;
    public ez5 g0;

    @Override // defpackage.up2
    public final d2 b() {
        fz5 fz5VarF = f();
        if (fz5VarF.d()) {
            return fz5VarF;
        }
        throw new xm8();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        fz5 fz5Var = null;
        try {
            try {
                fz5.k0.getClass();
                g(new fz5(iv0Var));
                return this;
            } catch (rh3 e) {
                fz5 fz5Var2 = (fz5) e.X;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    fz5Var = fz5Var2;
                    if (fz5Var != null) {
                        g(fz5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (fz5Var != null) {
                g(fz5Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        dz5 dz5Var = new dz5();
        dz5Var.Z = -1;
        dz5Var.g0 = ez5.PACKAGE;
        dz5Var.g(f());
        return dz5Var;
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        g((fz5) bq2Var);
        return this;
    }

    public final fz5 f() {
        fz5 fz5Var = new fz5(this);
        int i = this.Y;
        int i2 = (i & 1) != 1 ? 0 : 1;
        fz5Var.Z = this.Z;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        fz5Var.f0 = this.f0;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        fz5Var.g0 = this.g0;
        fz5Var.Y = i2;
        return fz5Var;
    }

    public final void g(fz5 fz5Var) {
        if (fz5Var == fz5.j0) {
            return;
        }
        int i = fz5Var.Y;
        if ((i & 1) == 1) {
            int i2 = fz5Var.Z;
            this.Y = 1 | this.Y;
            this.Z = i2;
        }
        if ((i & 2) == 2) {
            int i3 = fz5Var.f0;
            this.Y = 2 | this.Y;
            this.f0 = i3;
        }
        if ((i & 4) == 4) {
            ez5 ez5Var = fz5Var.g0;
            ez5Var.getClass();
            this.Y = 4 | this.Y;
            this.g0 = ez5Var;
        }
        this.X = this.X.b(fz5Var.X);
    }
}
