package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ry5 extends up2 implements ou4 {
    public int Y;
    public int Z;
    public int f0;
    public sy5 g0;
    public nz5 h0;
    public int i0;
    public List j0;
    public List k0;

    public static ry5 g() {
        ry5 ry5Var = new ry5();
        ry5Var.g0 = sy5.TRUE;
        ry5Var.h0 = nz5.w0;
        List list = Collections.EMPTY_LIST;
        ry5Var.j0 = list;
        ry5Var.k0 = list;
        return ry5Var;
    }

    @Override // defpackage.up2
    public final d2 b() {
        ty5 ty5VarF = f();
        if (ty5VarF.d()) {
            return ty5VarF;
        }
        throw new xm8();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        ty5 ty5Var = null;
        try {
            try {
                ty5.o0.getClass();
                h(new ty5(iv0Var, r62Var));
                return this;
            } catch (rh3 e) {
                ty5 ty5Var2 = (ty5) e.X;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    ty5Var = ty5Var2;
                    if (ty5Var != null) {
                        h(ty5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (ty5Var != null) {
                h(ty5Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        ry5 ry5VarG = g();
        ry5VarG.h(f());
        return ry5VarG;
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        h((ty5) bq2Var);
        return this;
    }

    public final ty5 f() {
        ty5 ty5Var = new ty5(this);
        int i = this.Y;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ty5Var.Z = this.Z;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ty5Var.f0 = this.f0;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ty5Var.g0 = this.g0;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        ty5Var.h0 = this.h0;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        ty5Var.i0 = this.i0;
        if ((i & 32) == 32) {
            this.j0 = Collections.unmodifiableList(this.j0);
            i = this.Y & (-33);
            this.Y = i;
        }
        ty5Var.j0 = this.j0;
        if ((i & 64) == 64) {
            this.k0 = Collections.unmodifiableList(this.k0);
            this.Y &= -65;
        }
        ty5Var.k0 = this.k0;
        ty5Var.Y = i2;
        return ty5Var;
    }

    public final void h(ty5 ty5Var) {
        nz5 nz5Var;
        if (ty5Var == ty5.n0) {
            return;
        }
        int i = ty5Var.Y;
        if ((i & 1) == 1) {
            int i2 = ty5Var.Z;
            this.Y = 1 | this.Y;
            this.Z = i2;
        }
        if ((i & 2) == 2) {
            int i3 = ty5Var.f0;
            this.Y = 2 | this.Y;
            this.f0 = i3;
        }
        if ((i & 4) == 4) {
            sy5 sy5Var = ty5Var.g0;
            sy5Var.getClass();
            this.Y = 4 | this.Y;
            this.g0 = sy5Var;
        }
        if ((ty5Var.Y & 8) == 8) {
            nz5 nz5Var2 = ty5Var.h0;
            if ((this.Y & 8) != 8 || (nz5Var = this.h0) == nz5.w0) {
                this.h0 = nz5Var2;
            } else {
                mz5 mz5VarR = nz5.r(nz5Var);
                mz5VarR.i(nz5Var2);
                this.h0 = mz5VarR.g();
            }
            this.Y |= 8;
        }
        if ((ty5Var.Y & 16) == 16) {
            int i4 = ty5Var.i0;
            this.Y = 16 | this.Y;
            this.i0 = i4;
        }
        if (!ty5Var.j0.isEmpty()) {
            if (this.j0.isEmpty()) {
                this.j0 = ty5Var.j0;
                this.Y &= -33;
            } else {
                if ((this.Y & 32) != 32) {
                    this.j0 = new ArrayList(this.j0);
                    this.Y |= 32;
                }
                this.j0.addAll(ty5Var.j0);
            }
        }
        if (!ty5Var.k0.isEmpty()) {
            if (this.k0.isEmpty()) {
                this.k0 = ty5Var.k0;
                this.Y &= -65;
            } else {
                if ((this.Y & 64) != 64) {
                    this.k0 = new ArrayList(this.k0);
                    this.Y |= 64;
                }
                this.k0.addAll(ty5Var.k0);
            }
        }
        this.X = this.X.b(ty5Var.X);
    }
}
