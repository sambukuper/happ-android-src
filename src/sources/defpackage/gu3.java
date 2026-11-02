package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gu3 extends up2 implements ou4 {
    public int Y;
    public List Z;
    public List f0;

    @Override // defpackage.up2
    public final d2 b() {
        ku3 ku3VarF = f();
        if (ku3VarF.d()) {
            return ku3VarF;
        }
        throw new xm8();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        ku3 ku3Var = null;
        try {
            try {
                ku3.j0.getClass();
                g(new ku3(iv0Var, r62Var));
                return this;
            } catch (rh3 e) {
                ku3 ku3Var2 = (ku3) e.X;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    ku3Var = ku3Var2;
                    if (ku3Var != null) {
                        g(ku3Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (ku3Var != null) {
                g(ku3Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        gu3 gu3Var = new gu3();
        List list = Collections.EMPTY_LIST;
        gu3Var.Z = list;
        gu3Var.f0 = list;
        gu3Var.g(f());
        return gu3Var;
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        g((ku3) bq2Var);
        return this;
    }

    public final ku3 f() {
        ku3 ku3Var = new ku3(this);
        int i = this.Y;
        if ((i & 1) == 1) {
            this.Z = Collections.unmodifiableList(this.Z);
            i = this.Y & (-2);
            this.Y = i;
        }
        ku3Var.Y = this.Z;
        if ((i & 2) == 2) {
            this.f0 = Collections.unmodifiableList(this.f0);
            this.Y &= -3;
        }
        ku3Var.Z = this.f0;
        return ku3Var;
    }

    public final void g(ku3 ku3Var) {
        if (ku3Var == ku3.i0) {
            return;
        }
        if (!ku3Var.Y.isEmpty()) {
            if (this.Z.isEmpty()) {
                this.Z = ku3Var.Y;
                this.Y &= -2;
            } else {
                if ((this.Y & 1) != 1) {
                    this.Z = new ArrayList(this.Z);
                    this.Y |= 1;
                }
                this.Z.addAll(ku3Var.Y);
            }
        }
        if (!ku3Var.Z.isEmpty()) {
            if (this.f0.isEmpty()) {
                this.f0 = ku3Var.Z;
                this.Y &= -3;
            } else {
                if ((this.Y & 2) != 2) {
                    this.f0 = new ArrayList(this.f0);
                    this.Y |= 2;
                }
                this.f0.addAll(ku3Var.Z);
            }
        }
        this.X = this.X.b(ku3Var.X);
    }
}
