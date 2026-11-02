package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eu3 extends up2 implements ou4 {
    public final /* synthetic */ byte Y;
    public int Z;
    public Serializable f0;
    public Object g0;
    public bq2 h0;
    public Serializable i0;
    public Serializable j0;

    public /* synthetic */ eu3(byte b) {
        this.Y = b;
    }

    public static eu3 h() {
        eu3 eu3Var = new eu3((byte) 0);
        eu3Var.f0 = cu3.i0;
        du3 du3Var = du3.i0;
        eu3Var.g0 = du3Var;
        eu3Var.h0 = du3Var;
        eu3Var.i0 = du3Var;
        eu3Var.j0 = du3Var;
        return eu3Var;
    }

    public static eu3 i() {
        eu3 eu3Var = new eu3((byte) 1);
        eu3Var.f0 = my5.RETURNS_CONSTANT;
        eu3Var.g0 = Collections.EMPTY_LIST;
        eu3Var.h0 = ty5.n0;
        eu3Var.i0 = ny5.AT_MOST_ONCE;
        eu3Var.j0 = ly5.CONCLUSION_CONDITION;
        return eu3Var;
    }

    @Override // defpackage.up2
    public final d2 b() {
        switch (this.Y) {
            case 0:
                fu3 fu3VarF = f();
                if (fu3VarF.d()) {
                    return fu3VarF;
                }
                throw new xm8();
            default:
                oy5 oy5VarG = g();
                if (oy5VarG.d()) {
                    return oy5VarG;
                }
                throw new xm8();
        }
    }

    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        oy5 oy5Var = null;
        fu3 fu3Var = null;
        try {
            try {
                switch (this.Y) {
                    case 0:
                        try {
                            fu3.m0.getClass();
                            j(new fu3(iv0Var, r62Var));
                            return this;
                        } catch (rh3 e) {
                            fu3 fu3Var2 = (fu3) e.X;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                fu3Var = fu3Var2;
                                if (fu3Var != null) {
                                    j(fu3Var);
                                }
                                throw th;
                            }
                        }
                    default:
                        try {
                            oy5.m0.getClass();
                            k(new oy5(iv0Var, r62Var));
                            return this;
                        } catch (rh3 e2) {
                            oy5 oy5Var2 = (oy5) e2.X;
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                oy5Var = oy5Var2;
                                if (oy5Var != null) {
                                    k(oy5Var);
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
                eu3 eu3VarH = h();
                eu3VarH.j(f());
                return eu3VarH;
            default:
                eu3 eu3VarI = i();
                eu3VarI.k(g());
                return eu3VarI;
        }
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        switch (this.Y) {
            case 0:
                j((fu3) bq2Var);
                break;
            default:
                k((oy5) bq2Var);
                break;
        }
        return this;
    }

    public fu3 f() {
        fu3 fu3Var = new fu3(this);
        int i = this.Z;
        int i2 = (i & 1) != 1 ? 0 : 1;
        fu3Var.Z = (cu3) this.f0;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        fu3Var.f0 = (du3) this.g0;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        fu3Var.g0 = (du3) this.h0;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        fu3Var.h0 = (du3) this.i0;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        fu3Var.i0 = (du3) this.j0;
        fu3Var.Y = i2;
        return fu3Var;
    }

    public oy5 g() {
        oy5 oy5Var = new oy5(this);
        int i = this.Z;
        int i2 = (i & 1) != 1 ? 0 : 1;
        oy5Var.Z = (my5) this.f0;
        if ((i & 2) == 2) {
            this.g0 = Collections.unmodifiableList((List) this.g0);
            this.Z &= -3;
        }
        oy5Var.f0 = (List) this.g0;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        oy5Var.g0 = (ty5) this.h0;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        oy5Var.h0 = (ny5) this.i0;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        oy5Var.i0 = (ly5) this.j0;
        oy5Var.Y = i2;
        return oy5Var;
    }

    public void j(fu3 fu3Var) {
        du3 du3Var;
        du3 du3Var2;
        du3 du3Var3;
        du3 du3Var4;
        cu3 cu3Var;
        if (fu3Var == fu3.l0) {
            return;
        }
        if ((fu3Var.Y & 1) == 1) {
            cu3 cu3Var2 = fu3Var.Z;
            if ((this.Z & 1) != 1 || (cu3Var = (cu3) this.f0) == cu3.i0) {
                this.f0 = cu3Var2;
            } else {
                bu3 bu3Var = new bu3((byte) 0);
                bu3Var.h(cu3Var);
                bu3Var.h(cu3Var2);
                this.f0 = bu3Var.f();
            }
            this.Z |= 1;
        }
        if ((fu3Var.Y & 2) == 2) {
            du3 du3Var5 = fu3Var.f0;
            if ((this.Z & 2) != 2 || (du3Var4 = (du3) this.g0) == du3.i0) {
                this.g0 = du3Var5;
            } else {
                bu3 bu3VarI = du3.i(du3Var4);
                bu3VarI.i(du3Var5);
                this.g0 = bu3VarI.g();
            }
            this.Z |= 2;
        }
        if (fu3Var.i()) {
            du3 du3Var6 = fu3Var.g0;
            if ((this.Z & 4) != 4 || (du3Var3 = (du3) this.h0) == du3.i0) {
                this.h0 = du3Var6;
            } else {
                bu3 bu3VarI2 = du3.i(du3Var3);
                bu3VarI2.i(du3Var6);
                this.h0 = bu3VarI2.g();
            }
            this.Z |= 4;
        }
        if ((fu3Var.Y & 8) == 8) {
            du3 du3Var7 = fu3Var.h0;
            if ((this.Z & 8) != 8 || (du3Var2 = (du3) this.i0) == du3.i0) {
                this.i0 = du3Var7;
            } else {
                bu3 bu3VarI3 = du3.i(du3Var2);
                bu3VarI3.i(du3Var7);
                this.i0 = bu3VarI3.g();
            }
            this.Z |= 8;
        }
        if ((fu3Var.Y & 16) == 16) {
            du3 du3Var8 = fu3Var.i0;
            if ((this.Z & 16) != 16 || (du3Var = (du3) this.j0) == du3.i0) {
                this.j0 = du3Var8;
            } else {
                bu3 bu3VarI4 = du3.i(du3Var);
                bu3VarI4.i(du3Var8);
                this.j0 = bu3VarI4.g();
            }
            this.Z |= 16;
        }
        this.X = this.X.b(fu3Var.X);
    }

    public void k(oy5 oy5Var) {
        ty5 ty5Var;
        if (oy5Var == oy5.l0) {
            return;
        }
        if ((oy5Var.Y & 1) == 1) {
            my5 my5Var = oy5Var.Z;
            my5Var.getClass();
            this.Z = 1 | this.Z;
            this.f0 = my5Var;
        }
        if (!oy5Var.f0.isEmpty()) {
            if (((List) this.g0).isEmpty()) {
                this.g0 = oy5Var.f0;
                this.Z &= -3;
            } else {
                if ((this.Z & 2) != 2) {
                    this.g0 = new ArrayList((List) this.g0);
                    this.Z |= 2;
                }
                ((List) this.g0).addAll(oy5Var.f0);
            }
        }
        if ((oy5Var.Y & 2) == 2) {
            ty5 ty5Var2 = oy5Var.g0;
            if ((this.Z & 4) != 4 || (ty5Var = (ty5) this.h0) == ty5.n0) {
                this.h0 = ty5Var2;
            } else {
                ry5 ry5VarG = ry5.g();
                ry5VarG.h(ty5Var);
                ry5VarG.h(ty5Var2);
                this.h0 = ry5VarG.f();
            }
            this.Z |= 4;
        }
        if ((oy5Var.Y & 4) == 4) {
            ny5 ny5Var = oy5Var.h0;
            ny5Var.getClass();
            this.Z |= 8;
            this.i0 = ny5Var;
        }
        if ((oy5Var.Y & 8) == 8) {
            ly5 ly5Var = oy5Var.i0;
            ly5Var.getClass();
            this.Z |= 16;
            this.j0 = ly5Var;
        }
        this.X = this.X.b(oy5Var.X);
    }
}
