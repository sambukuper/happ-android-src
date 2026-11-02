package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xx5 extends up2 implements ou4 {
    public int Y;
    public yx5 Z;
    public long f0;
    public float g0;
    public double h0;
    public int i0;
    public int j0;
    public int k0;
    public cy5 l0;
    public List m0;
    public int n0;
    public int o0;

    public static xx5 g() {
        xx5 xx5Var = new xx5();
        xx5Var.Z = yx5.BYTE;
        xx5Var.l0 = cy5.i0;
        xx5Var.m0 = Collections.EMPTY_LIST;
        return xx5Var;
    }

    @Override // defpackage.up2
    public final d2 b() {
        zx5 zx5VarF = f();
        if (zx5VarF.d()) {
            return zx5VarF;
        }
        throw new xm8();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        zx5 zx5Var = null;
        try {
            try {
                zx5.s0.getClass();
                h(new zx5(iv0Var, r62Var));
                return this;
            } catch (rh3 e) {
                zx5 zx5Var2 = (zx5) e.X;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    zx5Var = zx5Var2;
                    if (zx5Var != null) {
                        h(zx5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (zx5Var != null) {
                h(zx5Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        xx5 xx5VarG = g();
        xx5VarG.h(f());
        return xx5VarG;
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        h((zx5) bq2Var);
        return this;
    }

    public final zx5 f() {
        zx5 zx5Var = new zx5(this);
        int i = this.Y;
        int i2 = (i & 1) != 1 ? 0 : 1;
        zx5Var.Z = this.Z;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        zx5Var.f0 = this.f0;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        zx5Var.g0 = this.g0;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        zx5Var.h0 = this.h0;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        zx5Var.i0 = this.i0;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        zx5Var.j0 = this.j0;
        if ((i & 64) == 64) {
            i2 |= 64;
        }
        zx5Var.k0 = this.k0;
        if ((i & 128) == 128) {
            i2 |= 128;
        }
        zx5Var.l0 = this.l0;
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            this.m0 = Collections.unmodifiableList(this.m0);
            this.Y &= -257;
        }
        zx5Var.m0 = this.m0;
        if ((i & 512) == 512) {
            i2 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        zx5Var.n0 = this.n0;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        zx5Var.o0 = this.o0;
        zx5Var.Y = i2;
        return zx5Var;
    }

    public final void h(zx5 zx5Var) {
        cy5 cy5Var;
        if (zx5Var == zx5.r0) {
            return;
        }
        if ((zx5Var.Y & 1) == 1) {
            yx5 yx5Var = zx5Var.Z;
            yx5Var.getClass();
            this.Y = 1 | this.Y;
            this.Z = yx5Var;
        }
        int i = zx5Var.Y;
        if ((i & 2) == 2) {
            long j = zx5Var.f0;
            this.Y |= 2;
            this.f0 = j;
        }
        if ((i & 4) == 4) {
            float f = zx5Var.g0;
            this.Y = 4 | this.Y;
            this.g0 = f;
        }
        if ((i & 8) == 8) {
            double d = zx5Var.h0;
            this.Y |= 8;
            this.h0 = d;
        }
        if ((i & 16) == 16) {
            int i2 = zx5Var.i0;
            this.Y = 16 | this.Y;
            this.i0 = i2;
        }
        if ((i & 32) == 32) {
            int i3 = zx5Var.j0;
            this.Y = 32 | this.Y;
            this.j0 = i3;
        }
        if ((i & 64) == 64) {
            int i4 = zx5Var.k0;
            this.Y = 64 | this.Y;
            this.k0 = i4;
        }
        if ((i & 128) == 128) {
            cy5 cy5Var2 = zx5Var.l0;
            if ((this.Y & 128) != 128 || (cy5Var = this.l0) == cy5.i0) {
                this.l0 = cy5Var2;
            } else {
                by5 by5Var = new by5((byte) 0);
                by5Var.f0 = Collections.EMPTY_LIST;
                by5Var.h(cy5Var);
                by5Var.h(cy5Var2);
                this.l0 = by5Var.f();
            }
            this.Y |= 128;
        }
        if (!zx5Var.m0.isEmpty()) {
            if (this.m0.isEmpty()) {
                this.m0 = zx5Var.m0;
                this.Y &= -257;
            } else {
                if ((this.Y & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                    this.m0 = new ArrayList(this.m0);
                    this.Y |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                this.m0.addAll(zx5Var.m0);
            }
        }
        int i5 = zx5Var.Y;
        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            int i6 = zx5Var.n0;
            this.Y |= 512;
            this.n0 = i6;
        }
        if ((i5 & 512) == 512) {
            int i7 = zx5Var.o0;
            this.Y |= 1024;
            this.o0 = i7;
        }
        this.X = this.X.b(zx5Var.X);
    }
}
