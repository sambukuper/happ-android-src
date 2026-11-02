package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jy5 extends up2 implements ou4 {
    public final /* synthetic */ byte Y;
    public int Z;
    public List f0;

    public /* synthetic */ jy5(byte b) {
        this.Y = b;
    }

    @Override // defpackage.up2
    public final d2 b() {
        switch (this.Y) {
            case 0:
                ky5 ky5VarF = f();
                if (ky5VarF.d()) {
                    return ky5VarF;
                }
                throw new xm8();
            case 1:
                gz5 gz5VarG = g();
                if (gz5VarG.d()) {
                    return gz5VarG;
                }
                throw new xm8();
            case 2:
                a06 a06VarI = i();
                if (a06VarI.d()) {
                    return a06VarI;
                }
                throw new xm8();
            default:
                iz5 iz5VarH = h();
                if (iz5VarH.d()) {
                    return iz5VarH;
                }
                throw new xm8();
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x007a  */
    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        iz5 iz5Var = null;
        ky5 ky5Var = null;
        gz5 gz5Var = null;
        a06 a06Var = null;
        try {
            try {
                try {
                    switch (this.Y) {
                        case 0:
                            try {
                                try {
                                    ky5.h0.getClass();
                                    j(new ky5(iv0Var, r62Var));
                                    return this;
                                } catch (rh3 e) {
                                    ky5 ky5Var2 = (ky5) e.X;
                                    try {
                                        throw e;
                                    } catch (Throwable th) {
                                        th = th;
                                        ky5Var = ky5Var2;
                                        if (ky5Var != null) {
                                            j(ky5Var);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (ky5Var != null) {
                                    j(ky5Var);
                                }
                                throw th;
                            }
                        case 1:
                            try {
                                gz5.h0.getClass();
                                k(new gz5(iv0Var, r62Var));
                                return this;
                            } catch (rh3 e2) {
                                gz5 gz5Var2 = (gz5) e2.X;
                                try {
                                    throw e2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    gz5Var = gz5Var2;
                                    if (gz5Var != null) {
                                        k(gz5Var);
                                    }
                                    throw th;
                                }
                            }
                        case 2:
                            try {
                                a06.h0.getClass();
                                m(new a06(iv0Var, r62Var));
                                return this;
                            } catch (rh3 e3) {
                                a06 a06Var2 = (a06) e3.X;
                                try {
                                    throw e3;
                                } catch (Throwable th4) {
                                    th = th4;
                                    a06Var = a06Var2;
                                    if (a06Var != null) {
                                        m(a06Var);
                                    }
                                    throw th;
                                }
                            }
                        default:
                            try {
                                iz5.h0.getClass();
                                l(new iz5(iv0Var));
                                return this;
                            } catch (rh3 e4) {
                                iz5 iz5Var2 = (iz5) e4.X;
                                try {
                                    throw e4;
                                } catch (Throwable th5) {
                                    th = th5;
                                    iz5Var = iz5Var2;
                                    if (iz5Var != null) {
                                        l(iz5Var);
                                    }
                                    throw th;
                                }
                            }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    public final Object clone() {
        switch (this.Y) {
            case 0:
                jy5 jy5Var = new jy5((byte) 0);
                jy5Var.f0 = Collections.EMPTY_LIST;
                jy5Var.j(f());
                return jy5Var;
            case 1:
                jy5 jy5Var2 = new jy5((byte) 1);
                jy5Var2.f0 = Collections.EMPTY_LIST;
                jy5Var2.k(g());
                return jy5Var2;
            case 2:
                jy5 jy5Var3 = new jy5((byte) 2);
                jy5Var3.f0 = Collections.EMPTY_LIST;
                jy5Var3.m(i());
                return jy5Var3;
            default:
                jy5 jy5Var4 = new jy5((byte) 3);
                jy5Var4.f0 = s74.Y;
                jy5Var4.l(h());
                return jy5Var4;
        }
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        switch (this.Y) {
            case 0:
                j((ky5) bq2Var);
                break;
            case 1:
                k((gz5) bq2Var);
                break;
            case 2:
                m((a06) bq2Var);
                break;
            default:
                l((iz5) bq2Var);
                break;
        }
        return this;
    }

    public ky5 f() {
        ky5 ky5Var = new ky5(this);
        if ((this.Z & 1) == 1) {
            this.f0 = Collections.unmodifiableList(this.f0);
            this.Z &= -2;
        }
        ky5Var.Y = this.f0;
        return ky5Var;
    }

    public gz5 g() {
        gz5 gz5Var = new gz5(this);
        if ((this.Z & 1) == 1) {
            this.f0 = Collections.unmodifiableList(this.f0);
            this.Z &= -2;
        }
        gz5Var.Y = this.f0;
        return gz5Var;
    }

    public iz5 h() {
        iz5 iz5Var = new iz5(this);
        if ((this.Z & 1) == 1) {
            this.f0 = ((t74) this.f0).C();
            this.Z &= -2;
        }
        iz5Var.Y = (t74) this.f0;
        return iz5Var;
    }

    public a06 i() {
        a06 a06Var = new a06(this);
        if ((this.Z & 1) == 1) {
            this.f0 = Collections.unmodifiableList(this.f0);
            this.Z &= -2;
        }
        a06Var.Y = this.f0;
        return a06Var;
    }

    public void j(ky5 ky5Var) {
        if (ky5Var == ky5.g0) {
            return;
        }
        if (!ky5Var.Y.isEmpty()) {
            if (this.f0.isEmpty()) {
                this.f0 = ky5Var.Y;
                this.Z &= -2;
            } else {
                if ((this.Z & 1) != 1) {
                    this.f0 = new ArrayList(this.f0);
                    this.Z |= 1;
                }
                this.f0.addAll(ky5Var.Y);
            }
        }
        this.X = this.X.b(ky5Var.X);
    }

    public void k(gz5 gz5Var) {
        if (gz5Var == gz5.g0) {
            return;
        }
        if (!gz5Var.Y.isEmpty()) {
            if (this.f0.isEmpty()) {
                this.f0 = gz5Var.Y;
                this.Z &= -2;
            } else {
                if ((this.Z & 1) != 1) {
                    this.f0 = new ArrayList(this.f0);
                    this.Z |= 1;
                }
                this.f0.addAll(gz5Var.Y);
            }
        }
        this.X = this.X.b(gz5Var.X);
    }

    public void l(iz5 iz5Var) {
        if (iz5Var == iz5.g0) {
            return;
        }
        if (!iz5Var.Y.isEmpty()) {
            if (((t74) this.f0).isEmpty()) {
                this.f0 = iz5Var.Y;
                this.Z &= -2;
            } else {
                if ((this.Z & 1) != 1) {
                    this.f0 = new s74((t74) this.f0);
                    this.Z |= 1;
                }
                ((t74) this.f0).addAll(iz5Var.Y);
            }
        }
        this.X = this.X.b(iz5Var.X);
    }

    public void m(a06 a06Var) {
        if (a06Var == a06.g0) {
            return;
        }
        if (!a06Var.Y.isEmpty()) {
            if (this.f0.isEmpty()) {
                this.f0 = a06Var.Y;
                this.Z &= -2;
            } else {
                if ((this.Z & 1) != 1) {
                    this.f0 = new ArrayList(this.f0);
                    this.Z |= 1;
                }
                this.f0.addAll(a06Var.Y);
            }
        }
        this.X = this.X.b(a06Var.X);
    }
}
