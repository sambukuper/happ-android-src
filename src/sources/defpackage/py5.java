package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class py5 extends xp2 {
    public int f0;
    public int g0;
    public List h0;

    @Override // defpackage.up2
    public final d2 b() {
        qy5 qy5VarG = g();
        if (qy5VarG.d()) {
            return qy5VarG;
        }
        throw new xm8();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        qy5 qy5Var = null;
        try {
            try {
                qy5.k0.getClass();
                h(new qy5(iv0Var, r62Var));
                return this;
            } catch (rh3 e) {
                qy5 qy5Var2 = (qy5) e.X;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    qy5Var = qy5Var2;
                    if (qy5Var != null) {
                        h(qy5Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (qy5Var != null) {
                h(qy5Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        py5 py5Var = new py5();
        py5Var.h0 = Collections.EMPTY_LIST;
        py5Var.h(g());
        return py5Var;
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        h((qy5) bq2Var);
        return this;
    }

    public final qy5 g() {
        qy5 qy5Var = new qy5(this);
        int i = this.f0;
        int i2 = (i & 1) != 1 ? 0 : 1;
        qy5Var.f0 = this.g0;
        if ((i & 2) == 2) {
            this.h0 = Collections.unmodifiableList(this.h0);
            this.f0 &= -3;
        }
        qy5Var.g0 = this.h0;
        qy5Var.Z = i2;
        return qy5Var;
    }

    public final void h(qy5 qy5Var) {
        if (qy5Var == qy5.j0) {
            return;
        }
        if ((qy5Var.Z & 1) == 1) {
            int i = qy5Var.f0;
            this.f0 = 1 | this.f0;
            this.g0 = i;
        }
        if (!qy5Var.g0.isEmpty()) {
            if (this.h0.isEmpty()) {
                this.h0 = qy5Var.g0;
                this.f0 &= -3;
            } else {
                if ((this.f0 & 2) != 2) {
                    this.h0 = new ArrayList(this.h0);
                    this.f0 |= 2;
                }
                this.h0.addAll(qy5Var.g0);
            }
        }
        f(qy5Var);
        this.X = this.X.b(qy5Var.Y);
    }
}
