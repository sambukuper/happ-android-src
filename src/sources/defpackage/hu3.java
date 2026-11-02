package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hu3 extends up2 implements ou4 {
    public int Y;
    public int Z;
    public int f0;
    public Object g0;
    public iu3 h0;
    public List i0;
    public List j0;

    public static hu3 g() {
        hu3 hu3Var = new hu3();
        hu3Var.Z = 1;
        hu3Var.g0 = _UrlKt.FRAGMENT_ENCODE_SET;
        hu3Var.h0 = iu3.NONE;
        List list = Collections.EMPTY_LIST;
        hu3Var.i0 = list;
        hu3Var.j0 = list;
        return hu3Var;
    }

    @Override // defpackage.up2
    public final d2 b() {
        ju3 ju3VarF = f();
        if (ju3VarF.d()) {
            return ju3VarF;
        }
        throw new xm8();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        ju3 ju3Var = null;
        try {
            try {
                ju3.p0.getClass();
                h(new ju3(iv0Var));
                return this;
            } catch (rh3 e) {
                ju3 ju3Var2 = (ju3) e.X;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    ju3Var = ju3Var2;
                    if (ju3Var != null) {
                        h(ju3Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (ju3Var != null) {
                h(ju3Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        hu3 hu3VarG = g();
        hu3VarG.h(f());
        return hu3VarG;
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        h((ju3) bq2Var);
        return this;
    }

    public final ju3 f() {
        ju3 ju3Var = new ju3(this);
        int i = this.Y;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ju3Var.Z = this.Z;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ju3Var.f0 = this.f0;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ju3Var.g0 = this.g0;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        ju3Var.h0 = this.h0;
        if ((i & 16) == 16) {
            this.i0 = Collections.unmodifiableList(this.i0);
            i = this.Y & (-17);
            this.Y = i;
        }
        ju3Var.i0 = this.i0;
        if ((i & 32) == 32) {
            this.j0 = Collections.unmodifiableList(this.j0);
            this.Y &= -33;
        }
        ju3Var.k0 = this.j0;
        ju3Var.Y = i2;
        return ju3Var;
    }

    public final void h(ju3 ju3Var) {
        if (ju3Var == ju3.o0) {
            return;
        }
        int i = ju3Var.Y;
        if ((i & 1) == 1) {
            int i2 = ju3Var.Z;
            this.Y = 1 | this.Y;
            this.Z = i2;
        }
        if ((i & 2) == 2) {
            int i3 = ju3Var.f0;
            this.Y = 2 | this.Y;
            this.f0 = i3;
        }
        if ((i & 4) == 4) {
            this.Y |= 4;
            this.g0 = ju3Var.g0;
        }
        if ((i & 8) == 8) {
            iu3 iu3Var = ju3Var.h0;
            iu3Var.getClass();
            this.Y = 8 | this.Y;
            this.h0 = iu3Var;
        }
        if (!ju3Var.i0.isEmpty()) {
            if (this.i0.isEmpty()) {
                this.i0 = ju3Var.i0;
                this.Y &= -17;
            } else {
                if ((this.Y & 16) != 16) {
                    this.i0 = new ArrayList(this.i0);
                    this.Y |= 16;
                }
                this.i0.addAll(ju3Var.i0);
            }
        }
        if (!ju3Var.k0.isEmpty()) {
            if (this.j0.isEmpty()) {
                this.j0 = ju3Var.k0;
                this.Y &= -33;
            } else {
                if ((this.Y & 32) != 32) {
                    this.j0 = new ArrayList(this.j0);
                    this.Y |= 32;
                }
                this.j0.addAll(ju3Var.k0);
            }
        }
        this.X = this.X.b(ju3Var.X);
    }
}
