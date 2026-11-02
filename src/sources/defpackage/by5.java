package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class by5 extends up2 implements ou4 {
    public final /* synthetic */ byte Y;
    public int Z;
    public List f0;
    public int g0;

    public /* synthetic */ by5(byte b) {
        this.Y = b;
    }

    @Override // defpackage.up2
    public final d2 b() {
        switch (this.Y) {
            case 0:
                cy5 cy5VarF = f();
                if (cy5VarF.d()) {
                    return cy5VarF;
                }
                throw new xm8();
            default:
                tz5 tz5VarG = g();
                if (tz5VarG.d()) {
                    return tz5VarG;
                }
                throw new xm8();
        }
    }

    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        tz5 tz5Var = null;
        cy5 cy5Var = null;
        try {
            try {
                switch (this.Y) {
                    case 0:
                        try {
                            cy5.j0.getClass();
                            h(new cy5(iv0Var, r62Var));
                            return this;
                        } catch (rh3 e) {
                            cy5 cy5Var2 = (cy5) e.X;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                cy5Var = cy5Var2;
                                if (cy5Var != null) {
                                    h(cy5Var);
                                }
                                throw th;
                            }
                        }
                    default:
                        try {
                            tz5.j0.getClass();
                            i(new tz5(iv0Var, r62Var));
                            return this;
                        } catch (rh3 e2) {
                            tz5 tz5Var2 = (tz5) e2.X;
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                tz5Var = tz5Var2;
                                if (tz5Var != null) {
                                    i(tz5Var);
                                }
                                throw th;
                            }
                        }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final Object clone() {
        switch (this.Y) {
            case 0:
                by5 by5Var = new by5((byte) 0);
                by5Var.f0 = Collections.EMPTY_LIST;
                by5Var.h(f());
                return by5Var;
            default:
                by5 by5Var2 = new by5((byte) 1);
                by5Var2.f0 = Collections.EMPTY_LIST;
                by5Var2.g0 = -1;
                by5Var2.i(g());
                return by5Var2;
        }
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        switch (this.Y) {
            case 0:
                h((cy5) bq2Var);
                break;
            default:
                i((tz5) bq2Var);
                break;
        }
        return this;
    }

    public cy5 f() {
        cy5 cy5Var = new cy5(this);
        int i = this.Z;
        int i2 = (i & 1) != 1 ? 0 : 1;
        cy5Var.Z = this.g0;
        if ((i & 2) == 2) {
            this.f0 = Collections.unmodifiableList(this.f0);
            this.Z &= -3;
        }
        cy5Var.f0 = this.f0;
        cy5Var.Y = i2;
        return cy5Var;
    }

    public tz5 g() {
        tz5 tz5Var = new tz5(this);
        int i = this.Z;
        if ((i & 1) == 1) {
            this.f0 = Collections.unmodifiableList(this.f0);
            this.Z &= -2;
        }
        tz5Var.Z = this.f0;
        int i2 = (i & 2) != 2 ? 0 : 1;
        tz5Var.f0 = this.g0;
        tz5Var.Y = i2;
        return tz5Var;
    }

    public void h(cy5 cy5Var) {
        if (cy5Var == cy5.i0) {
            return;
        }
        if ((cy5Var.Y & 1) == 1) {
            int i = cy5Var.Z;
            this.Z = 1 | this.Z;
            this.g0 = i;
        }
        if (!cy5Var.f0.isEmpty()) {
            if (this.f0.isEmpty()) {
                this.f0 = cy5Var.f0;
                this.Z &= -3;
            } else {
                if ((this.Z & 2) != 2) {
                    this.f0 = new ArrayList(this.f0);
                    this.Z |= 2;
                }
                this.f0.addAll(cy5Var.f0);
            }
        }
        this.X = this.X.b(cy5Var.X);
    }

    public void i(tz5 tz5Var) {
        if (tz5Var == tz5.i0) {
            return;
        }
        if (!tz5Var.Z.isEmpty()) {
            if (this.f0.isEmpty()) {
                this.f0 = tz5Var.Z;
                this.Z &= -2;
            } else {
                if ((this.Z & 1) != 1) {
                    this.f0 = new ArrayList(this.f0);
                    this.Z |= 1;
                }
                this.f0.addAll(tz5Var.Z);
            }
        }
        if ((tz5Var.Y & 1) == 1) {
            int i = tz5Var.f0;
            this.Z |= 2;
            this.g0 = i;
        }
        this.X = this.X.b(tz5Var.X);
    }
}
