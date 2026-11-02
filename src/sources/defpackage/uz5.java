package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uz5 extends xp2 {
    public int f0;
    public int g0;
    public int h0;
    public nz5 i0;
    public int j0;
    public nz5 k0;
    public int l0;
    public List m0;
    public zx5 n0;

    public static uz5 h() {
        uz5 uz5Var = new uz5();
        nz5 nz5Var = nz5.w0;
        uz5Var.i0 = nz5Var;
        uz5Var.k0 = nz5Var;
        uz5Var.m0 = Collections.EMPTY_LIST;
        uz5Var.n0 = zx5.r0;
        return uz5Var;
    }

    @Override // defpackage.up2
    public final d2 b() {
        vz5 vz5VarG = g();
        if (vz5VarG.d()) {
            return vz5VarG;
        }
        throw new xm8();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        vz5 vz5Var = null;
        try {
            try {
                vz5.q0.getClass();
                i(new vz5(iv0Var, r62Var));
                return this;
            } catch (rh3 e) {
                vz5 vz5Var2 = (vz5) e.X;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    vz5Var = vz5Var2;
                    if (vz5Var != null) {
                        i(vz5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (vz5Var != null) {
                i(vz5Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        uz5 uz5VarH = h();
        uz5VarH.i(g());
        return uz5VarH;
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        i((vz5) bq2Var);
        return this;
    }

    public final vz5 g() {
        vz5 vz5Var = new vz5(this);
        int i = this.f0;
        int i2 = (i & 1) != 1 ? 0 : 1;
        vz5Var.f0 = this.g0;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        vz5Var.g0 = this.h0;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        vz5Var.h0 = this.i0;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        vz5Var.i0 = this.j0;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        vz5Var.j0 = this.k0;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        vz5Var.k0 = this.l0;
        if ((i & 64) == 64) {
            this.m0 = Collections.unmodifiableList(this.m0);
            this.f0 &= -65;
        }
        vz5Var.l0 = this.m0;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        vz5Var.m0 = this.n0;
        vz5Var.Z = i2;
        return vz5Var;
    }

    public final void i(vz5 vz5Var) {
        zx5 zx5Var;
        nz5 nz5Var;
        nz5 nz5Var2;
        if (vz5Var == vz5.p0) {
            return;
        }
        int i = vz5Var.Z;
        if ((i & 1) == 1) {
            int i2 = vz5Var.f0;
            this.f0 = 1 | this.f0;
            this.g0 = i2;
        }
        if ((i & 2) == 2) {
            int i3 = vz5Var.g0;
            this.f0 = 2 | this.f0;
            this.h0 = i3;
        }
        if ((i & 4) == 4) {
            nz5 nz5Var3 = vz5Var.h0;
            if ((this.f0 & 4) != 4 || (nz5Var2 = this.i0) == nz5.w0) {
                this.i0 = nz5Var3;
            } else {
                mz5 mz5VarR = nz5.r(nz5Var2);
                mz5VarR.i(nz5Var3);
                this.i0 = mz5VarR.g();
            }
            this.f0 |= 4;
        }
        int i4 = vz5Var.Z;
        if ((i4 & 8) == 8) {
            int i5 = vz5Var.i0;
            this.f0 = 8 | this.f0;
            this.j0 = i5;
        }
        if ((i4 & 16) == 16) {
            nz5 nz5Var4 = vz5Var.j0;
            if ((this.f0 & 16) != 16 || (nz5Var = this.k0) == nz5.w0) {
                this.k0 = nz5Var4;
            } else {
                mz5 mz5VarR2 = nz5.r(nz5Var);
                mz5VarR2.i(nz5Var4);
                this.k0 = mz5VarR2.g();
            }
            this.f0 |= 16;
        }
        if ((vz5Var.Z & 32) == 32) {
            int i6 = vz5Var.k0;
            this.f0 = 32 | this.f0;
            this.l0 = i6;
        }
        if (!vz5Var.l0.isEmpty()) {
            if (this.m0.isEmpty()) {
                this.m0 = vz5Var.l0;
                this.f0 &= -65;
            } else {
                if ((this.f0 & 64) != 64) {
                    this.m0 = new ArrayList(this.m0);
                    this.f0 |= 64;
                }
                this.m0.addAll(vz5Var.l0);
            }
        }
        if ((vz5Var.Z & 64) == 64) {
            zx5 zx5Var2 = vz5Var.m0;
            if ((this.f0 & 128) != 128 || (zx5Var = this.n0) == zx5.r0) {
                this.n0 = zx5Var2;
            } else {
                xx5 xx5VarG = xx5.g();
                xx5VarG.h(zx5Var);
                xx5VarG.h(zx5Var2);
                this.n0 = xx5VarG.f();
            }
            this.f0 |= 128;
        }
        f(vz5Var);
        this.X = this.X.b(vz5Var.Y);
    }
}
