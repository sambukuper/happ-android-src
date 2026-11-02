package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oz5 extends xp2 {
    public int f0;
    public int g0;
    public int h0;
    public List i0;
    public nz5 j0;
    public int k0;
    public nz5 l0;
    public int m0;
    public List n0;
    public List o0;
    public List p0;

    public static oz5 h() {
        oz5 oz5Var = new oz5();
        oz5Var.g0 = 6;
        List list = Collections.EMPTY_LIST;
        oz5Var.i0 = list;
        nz5 nz5Var = nz5.w0;
        oz5Var.j0 = nz5Var;
        oz5Var.l0 = nz5Var;
        oz5Var.n0 = list;
        oz5Var.o0 = list;
        oz5Var.p0 = list;
        return oz5Var;
    }

    @Override // defpackage.up2
    public final d2 b() {
        pz5 pz5VarG = g();
        if (pz5VarG.d()) {
            return pz5VarG;
        }
        throw new xm8();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        pz5 pz5Var = null;
        try {
            try {
                pz5.s0.getClass();
                i(new pz5(iv0Var, r62Var));
                return this;
            } catch (rh3 e) {
                pz5 pz5Var2 = (pz5) e.X;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    pz5Var = pz5Var2;
                    if (pz5Var != null) {
                        i(pz5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (pz5Var != null) {
                i(pz5Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        oz5 oz5VarH = h();
        oz5VarH.i(g());
        return oz5VarH;
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        i((pz5) bq2Var);
        return this;
    }

    public final pz5 g() {
        int i;
        pz5 pz5Var = new pz5(this);
        int i2 = this.f0;
        int i3 = (i2 & 1) != 1 ? 0 : 1;
        pz5Var.f0 = this.g0;
        if ((i2 & 2) == 2) {
            i3 |= 2;
        }
        pz5Var.g0 = this.h0;
        if ((i2 & 4) == 4) {
            this.i0 = Collections.unmodifiableList(this.i0);
            i = this.f0 & (-5);
            this.f0 = i;
        } else {
            i = i2;
        }
        pz5Var.h0 = this.i0;
        if ((i2 & 8) == 8) {
            i3 |= 4;
        }
        pz5Var.i0 = this.j0;
        if ((i2 & 16) == 16) {
            i3 |= 8;
        }
        pz5Var.j0 = this.k0;
        if ((i2 & 32) == 32) {
            i3 |= 16;
        }
        pz5Var.k0 = this.l0;
        if ((i2 & 64) == 64) {
            i3 |= 32;
        }
        pz5Var.l0 = this.m0;
        if ((i & 128) == 128) {
            this.n0 = Collections.unmodifiableList(this.n0);
            i = this.f0 & (-129);
            this.f0 = i;
        }
        pz5Var.m0 = this.n0;
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            this.o0 = Collections.unmodifiableList(this.o0);
            i = this.f0 & (-257);
            this.f0 = i;
        }
        pz5Var.n0 = this.o0;
        if ((i & 512) == 512) {
            this.p0 = Collections.unmodifiableList(this.p0);
            this.f0 &= -513;
        }
        pz5Var.o0 = this.p0;
        pz5Var.Z = i3;
        return pz5Var;
    }

    public final void i(pz5 pz5Var) {
        nz5 nz5Var;
        nz5 nz5Var2;
        if (pz5Var == pz5.r0) {
            return;
        }
        int i = pz5Var.Z;
        if ((i & 1) == 1) {
            int i2 = pz5Var.f0;
            this.f0 = 1 | this.f0;
            this.g0 = i2;
        }
        if ((i & 2) == 2) {
            int i3 = pz5Var.g0;
            this.f0 = 2 | this.f0;
            this.h0 = i3;
        }
        if (!pz5Var.h0.isEmpty()) {
            if (this.i0.isEmpty()) {
                this.i0 = pz5Var.h0;
                this.f0 &= -5;
            } else {
                if ((this.f0 & 4) != 4) {
                    this.i0 = new ArrayList(this.i0);
                    this.f0 |= 4;
                }
                this.i0.addAll(pz5Var.h0);
            }
        }
        if ((pz5Var.Z & 4) == 4) {
            nz5 nz5Var3 = pz5Var.i0;
            if ((this.f0 & 8) != 8 || (nz5Var2 = this.j0) == nz5.w0) {
                this.j0 = nz5Var3;
            } else {
                mz5 mz5VarR = nz5.r(nz5Var2);
                mz5VarR.i(nz5Var3);
                this.j0 = mz5VarR.g();
            }
            this.f0 |= 8;
        }
        int i4 = pz5Var.Z;
        if ((i4 & 8) == 8) {
            int i5 = pz5Var.j0;
            this.f0 |= 16;
            this.k0 = i5;
        }
        if ((i4 & 16) == 16) {
            nz5 nz5Var4 = pz5Var.k0;
            if ((this.f0 & 32) != 32 || (nz5Var = this.l0) == nz5.w0) {
                this.l0 = nz5Var4;
            } else {
                mz5 mz5VarR2 = nz5.r(nz5Var);
                mz5VarR2.i(nz5Var4);
                this.l0 = mz5VarR2.g();
            }
            this.f0 |= 32;
        }
        if ((pz5Var.Z & 32) == 32) {
            int i6 = pz5Var.l0;
            this.f0 |= 64;
            this.m0 = i6;
        }
        if (!pz5Var.m0.isEmpty()) {
            if (this.n0.isEmpty()) {
                this.n0 = pz5Var.m0;
                this.f0 &= -129;
            } else {
                if ((this.f0 & 128) != 128) {
                    this.n0 = new ArrayList(this.n0);
                    this.f0 |= 128;
                }
                this.n0.addAll(pz5Var.m0);
            }
        }
        if (!pz5Var.n0.isEmpty()) {
            if (this.o0.isEmpty()) {
                this.o0 = pz5Var.n0;
                this.f0 &= -257;
            } else {
                if ((this.f0 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                    this.o0 = new ArrayList(this.o0);
                    this.f0 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                this.o0.addAll(pz5Var.n0);
            }
        }
        if (!pz5Var.o0.isEmpty()) {
            if (this.p0.isEmpty()) {
                this.p0 = pz5Var.o0;
                this.f0 &= -513;
            } else {
                if ((this.f0 & 512) != 512) {
                    this.p0 = new ArrayList(this.p0);
                    this.f0 |= 512;
                }
                this.p0.addAll(pz5Var.o0);
            }
        }
        f(pz5Var);
        this.X = this.X.b(pz5Var.Y);
    }
}
