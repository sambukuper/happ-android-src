package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wz5 extends up2 implements ou4 {
    public int Y;
    public int Z;
    public int f0;
    public xz5 g0;
    public int h0;
    public int i0;
    public yz5 j0;

    @Override // defpackage.up2
    public final d2 b() {
        zz5 zz5VarF = f();
        if (zz5VarF.d()) {
            return zz5VarF;
        }
        throw new xm8();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        zz5 zz5Var = null;
        try {
            try {
                zz5.n0.getClass();
                g(new zz5(iv0Var));
                return this;
            } catch (rh3 e) {
                zz5 zz5Var2 = (zz5) e.X;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    zz5Var = zz5Var2;
                    if (zz5Var != null) {
                        g(zz5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (zz5Var != null) {
                g(zz5Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        wz5 wz5Var = new wz5();
        wz5Var.g0 = xz5.ERROR;
        wz5Var.j0 = yz5.LANGUAGE_VERSION;
        wz5Var.g(f());
        return wz5Var;
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        g((zz5) bq2Var);
        return this;
    }

    public final zz5 f() {
        zz5 zz5Var = new zz5(this);
        int i = this.Y;
        int i2 = (i & 1) != 1 ? 0 : 1;
        zz5Var.Z = this.Z;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        zz5Var.f0 = this.f0;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        zz5Var.g0 = this.g0;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        zz5Var.h0 = this.h0;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        zz5Var.i0 = this.i0;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        zz5Var.j0 = this.j0;
        zz5Var.Y = i2;
        return zz5Var;
    }

    public final void g(zz5 zz5Var) {
        if (zz5Var == zz5.m0) {
            return;
        }
        int i = zz5Var.Y;
        if ((i & 1) == 1) {
            int i2 = zz5Var.Z;
            this.Y = 1 | this.Y;
            this.Z = i2;
        }
        if ((i & 2) == 2) {
            int i3 = zz5Var.f0;
            this.Y = 2 | this.Y;
            this.f0 = i3;
        }
        if ((i & 4) == 4) {
            xz5 xz5Var = zz5Var.g0;
            xz5Var.getClass();
            this.Y = 4 | this.Y;
            this.g0 = xz5Var;
        }
        int i4 = zz5Var.Y;
        if ((i4 & 8) == 8) {
            int i5 = zz5Var.h0;
            this.Y = 8 | this.Y;
            this.h0 = i5;
        }
        if ((i4 & 16) == 16) {
            int i6 = zz5Var.i0;
            this.Y = 16 | this.Y;
            this.i0 = i6;
        }
        if ((i4 & 32) == 32) {
            yz5 yz5Var = zz5Var.j0;
            yz5Var.getClass();
            this.Y = 32 | this.Y;
            this.j0 = yz5Var;
        }
        this.X = this.X.b(zz5Var.X);
    }
}
