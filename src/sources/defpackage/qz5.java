package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qz5 extends xp2 {
    public int f0;
    public int g0;
    public int h0;
    public boolean i0;
    public rz5 j0;
    public List k0;
    public List l0;
    public List m0;

    public static qz5 h() {
        qz5 qz5Var = new qz5();
        qz5Var.j0 = rz5.INV;
        List list = Collections.EMPTY_LIST;
        qz5Var.k0 = list;
        qz5Var.l0 = list;
        qz5Var.m0 = list;
        return qz5Var;
    }

    @Override // defpackage.up2
    public final d2 b() {
        sz5 sz5VarG = g();
        if (sz5VarG.d()) {
            return sz5VarG;
        }
        throw new xm8();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        sz5 sz5Var = null;
        try {
            try {
                sz5.q0.getClass();
                i(new sz5(iv0Var, r62Var));
                return this;
            } catch (rh3 e) {
                sz5 sz5Var2 = (sz5) e.X;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    sz5Var = sz5Var2;
                    if (sz5Var != null) {
                        i(sz5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (sz5Var != null) {
                i(sz5Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        qz5 qz5VarH = h();
        qz5VarH.i(g());
        return qz5VarH;
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        i((sz5) bq2Var);
        return this;
    }

    public final sz5 g() {
        sz5 sz5Var = new sz5(this);
        int i = this.f0;
        int i2 = (i & 1) != 1 ? 0 : 1;
        sz5Var.f0 = this.g0;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        sz5Var.g0 = this.h0;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        sz5Var.h0 = this.i0;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        sz5Var.i0 = this.j0;
        if ((i & 16) == 16) {
            this.k0 = Collections.unmodifiableList(this.k0);
            i = this.f0 & (-17);
            this.f0 = i;
        }
        sz5Var.j0 = this.k0;
        if ((i & 32) == 32) {
            this.l0 = Collections.unmodifiableList(this.l0);
            i = this.f0 & (-33);
            this.f0 = i;
        }
        sz5Var.k0 = this.l0;
        if ((i & 64) == 64) {
            this.m0 = Collections.unmodifiableList(this.m0);
            this.f0 &= -65;
        }
        sz5Var.m0 = this.m0;
        sz5Var.Z = i2;
        return sz5Var;
    }

    public final void i(sz5 sz5Var) {
        if (sz5Var == sz5.p0) {
            return;
        }
        int i = sz5Var.Z;
        if ((i & 1) == 1) {
            int i2 = sz5Var.f0;
            this.f0 = 1 | this.f0;
            this.g0 = i2;
        }
        if ((i & 2) == 2) {
            int i3 = sz5Var.g0;
            this.f0 = 2 | this.f0;
            this.h0 = i3;
        }
        if ((i & 4) == 4) {
            boolean z = sz5Var.h0;
            this.f0 = 4 | this.f0;
            this.i0 = z;
        }
        if ((i & 8) == 8) {
            rz5 rz5Var = sz5Var.i0;
            rz5Var.getClass();
            this.f0 = 8 | this.f0;
            this.j0 = rz5Var;
        }
        if (!sz5Var.j0.isEmpty()) {
            if (this.k0.isEmpty()) {
                this.k0 = sz5Var.j0;
                this.f0 &= -17;
            } else {
                if ((this.f0 & 16) != 16) {
                    this.k0 = new ArrayList(this.k0);
                    this.f0 |= 16;
                }
                this.k0.addAll(sz5Var.j0);
            }
        }
        if (!sz5Var.k0.isEmpty()) {
            if (this.l0.isEmpty()) {
                this.l0 = sz5Var.k0;
                this.f0 &= -33;
            } else {
                if ((this.f0 & 32) != 32) {
                    this.l0 = new ArrayList(this.l0);
                    this.f0 |= 32;
                }
                this.l0.addAll(sz5Var.k0);
            }
        }
        if (!sz5Var.m0.isEmpty()) {
            if (this.m0.isEmpty()) {
                this.m0 = sz5Var.m0;
                this.f0 &= -65;
            } else {
                if ((this.f0 & 64) != 64) {
                    this.m0 = new ArrayList(this.m0);
                    this.f0 |= 64;
                }
                this.m0.addAll(sz5Var.m0);
            }
        }
        f(sz5Var);
        this.X = this.X.b(sz5Var.Y);
    }
}
