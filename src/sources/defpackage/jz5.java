package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jz5 extends up2 implements ou4 {
    public int Y;
    public kz5 Z;
    public nz5 f0;
    public int g0;

    @Override // defpackage.up2
    public final d2 b() {
        lz5 lz5VarF = f();
        if (lz5VarF.d()) {
            return lz5VarF;
        }
        throw new xm8();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        lz5 lz5Var = null;
        try {
            try {
                lz5.k0.getClass();
                g(new lz5(iv0Var, r62Var));
                return this;
            } catch (rh3 e) {
                lz5 lz5Var2 = (lz5) e.X;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    lz5Var = lz5Var2;
                    if (lz5Var != null) {
                        g(lz5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (lz5Var != null) {
                g(lz5Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        jz5 jz5Var = new jz5();
        jz5Var.Z = kz5.INV;
        jz5Var.f0 = nz5.w0;
        jz5Var.g(f());
        return jz5Var;
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        g((lz5) bq2Var);
        return this;
    }

    public final lz5 f() {
        lz5 lz5Var = new lz5(this);
        int i = this.Y;
        int i2 = (i & 1) != 1 ? 0 : 1;
        lz5Var.Z = this.Z;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        lz5Var.f0 = this.f0;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        lz5Var.g0 = this.g0;
        lz5Var.Y = i2;
        return lz5Var;
    }

    public final void g(lz5 lz5Var) {
        nz5 nz5Var;
        if (lz5Var == lz5.j0) {
            return;
        }
        if ((lz5Var.Y & 1) == 1) {
            kz5 kz5Var = lz5Var.Z;
            kz5Var.getClass();
            this.Y = 1 | this.Y;
            this.Z = kz5Var;
        }
        if ((lz5Var.Y & 2) == 2) {
            nz5 nz5Var2 = lz5Var.f0;
            if ((this.Y & 2) != 2 || (nz5Var = this.f0) == nz5.w0) {
                this.f0 = nz5Var2;
            } else {
                mz5 mz5VarR = nz5.r(nz5Var);
                mz5VarR.i(nz5Var2);
                this.f0 = mz5VarR.g();
            }
            this.Y |= 2;
        }
        if ((lz5Var.Y & 4) == 4) {
            int i = lz5Var.g0;
            this.Y = 4 | this.Y;
            this.g0 = i;
        }
        this.X = this.X.b(lz5Var.X);
    }
}
