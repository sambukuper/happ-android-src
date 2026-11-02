package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hy5 extends xp2 {
    public int f0;
    public int g0;
    public List h0;
    public List i0;
    public List j0;
    public List k0;

    public static hy5 h() {
        hy5 hy5Var = new hy5();
        hy5Var.g0 = 6;
        List list = Collections.EMPTY_LIST;
        hy5Var.h0 = list;
        hy5Var.i0 = list;
        hy5Var.j0 = list;
        hy5Var.k0 = list;
        return hy5Var;
    }

    @Override // defpackage.up2
    public final d2 b() {
        iy5 iy5VarG = g();
        if (iy5VarG.d()) {
            return iy5VarG;
        }
        throw new xm8();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        iy5 iy5Var = null;
        try {
            try {
                iy5.n0.getClass();
                i(new iy5(iv0Var, r62Var));
                return this;
            } catch (rh3 e) {
                iy5 iy5Var2 = (iy5) e.X;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    iy5Var = iy5Var2;
                    if (iy5Var != null) {
                        i(iy5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (iy5Var != null) {
                i(iy5Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        hy5 hy5VarH = h();
        hy5VarH.i(g());
        return hy5VarH;
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        i((iy5) bq2Var);
        return this;
    }

    public final iy5 g() {
        iy5 iy5Var = new iy5(this);
        int i = this.f0;
        int i2 = (i & 1) != 1 ? 0 : 1;
        iy5Var.f0 = this.g0;
        if ((i & 2) == 2) {
            this.h0 = Collections.unmodifiableList(this.h0);
            i = this.f0 & (-3);
            this.f0 = i;
        }
        iy5Var.g0 = this.h0;
        if ((i & 4) == 4) {
            this.i0 = Collections.unmodifiableList(this.i0);
            i = this.f0 & (-5);
            this.f0 = i;
        }
        iy5Var.h0 = this.i0;
        if ((i & 8) == 8) {
            this.j0 = Collections.unmodifiableList(this.j0);
            i = this.f0 & (-9);
            this.f0 = i;
        }
        iy5Var.i0 = this.j0;
        if ((i & 16) == 16) {
            this.k0 = Collections.unmodifiableList(this.k0);
            this.f0 &= -17;
        }
        iy5Var.j0 = this.k0;
        iy5Var.Z = i2;
        return iy5Var;
    }

    public final void i(iy5 iy5Var) {
        if (iy5Var == iy5.m0) {
            return;
        }
        if ((iy5Var.Z & 1) == 1) {
            int i = iy5Var.f0;
            this.f0 = 1 | this.f0;
            this.g0 = i;
        }
        if (!iy5Var.g0.isEmpty()) {
            if (this.h0.isEmpty()) {
                this.h0 = iy5Var.g0;
                this.f0 &= -3;
            } else {
                if ((this.f0 & 2) != 2) {
                    this.h0 = new ArrayList(this.h0);
                    this.f0 |= 2;
                }
                this.h0.addAll(iy5Var.g0);
            }
        }
        if (!iy5Var.h0.isEmpty()) {
            if (this.i0.isEmpty()) {
                this.i0 = iy5Var.h0;
                this.f0 &= -5;
            } else {
                if ((this.f0 & 4) != 4) {
                    this.i0 = new ArrayList(this.i0);
                    this.f0 |= 4;
                }
                this.i0.addAll(iy5Var.h0);
            }
        }
        if (!iy5Var.i0.isEmpty()) {
            if (this.j0.isEmpty()) {
                this.j0 = iy5Var.i0;
                this.f0 &= -9;
            } else {
                if ((this.f0 & 8) != 8) {
                    this.j0 = new ArrayList(this.j0);
                    this.f0 |= 8;
                }
                this.j0.addAll(iy5Var.i0);
            }
        }
        if (!iy5Var.j0.isEmpty()) {
            if (this.k0.isEmpty()) {
                this.k0 = iy5Var.j0;
                this.f0 &= -17;
            } else {
                if ((this.f0 & 16) != 16) {
                    this.k0 = new ArrayList(this.k0);
                    this.f0 |= 16;
                }
                this.k0.addAll(iy5Var.j0);
            }
        }
        f(iy5Var);
        this.X = this.X.b(iy5Var.Y);
    }
}
