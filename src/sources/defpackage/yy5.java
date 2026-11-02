package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yy5 extends xp2 {
    public final /* synthetic */ byte f0;
    public int g0;
    public List h0;
    public List i0;
    public Object j0;
    public bq2 k0;
    public bq2 l0;

    public /* synthetic */ yy5(byte b) {
        this.f0 = b;
    }

    public static yy5 i() {
        yy5 yy5Var = new yy5((byte) 0);
        List list = Collections.EMPTY_LIST;
        yy5Var.h0 = list;
        yy5Var.i0 = list;
        yy5Var.j0 = list;
        yy5Var.k0 = tz5.i0;
        yy5Var.l0 = a06.g0;
        return yy5Var;
    }

    public static yy5 j() {
        yy5 yy5Var = new yy5((byte) 1);
        yy5Var.j0 = iz5.g0;
        yy5Var.k0 = gz5.g0;
        yy5Var.l0 = zy5.m0;
        List list = Collections.EMPTY_LIST;
        yy5Var.h0 = list;
        yy5Var.i0 = list;
        return yy5Var;
    }

    @Override // defpackage.up2
    public final d2 b() {
        switch (this.f0) {
            case 0:
                zy5 zy5VarG = g();
                if (zy5VarG.d()) {
                    return zy5VarG;
                }
                throw new xm8();
            default:
                az5 az5VarH = h();
                if (az5VarH.d()) {
                    return az5VarH;
                }
                throw new xm8();
        }
    }

    @Override // defpackage.up2
    public final up2 c(iv0 iv0Var, r62 r62Var) throws Throwable {
        az5 az5Var = null;
        zy5 zy5Var = null;
        try {
            try {
                switch (this.f0) {
                    case 0:
                        try {
                            zy5.n0.getClass();
                            k(new zy5(iv0Var, r62Var));
                            return this;
                        } catch (rh3 e) {
                            zy5 zy5Var2 = (zy5) e.X;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                zy5Var = zy5Var2;
                                if (zy5Var != null) {
                                    k(zy5Var);
                                }
                                throw th;
                            }
                        }
                    default:
                        try {
                            az5.n0.getClass();
                            l(new az5(iv0Var, r62Var));
                            return this;
                        } catch (rh3 e2) {
                            az5 az5Var2 = (az5) e2.X;
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                az5Var = az5Var2;
                                if (az5Var != null) {
                                    l(az5Var);
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
        switch (this.f0) {
            case 0:
                yy5 yy5VarI = i();
                yy5VarI.k(g());
                return yy5VarI;
            default:
                yy5 yy5VarJ = j();
                yy5VarJ.l(h());
                return yy5VarJ;
        }
    }

    @Override // defpackage.up2
    public final /* bridge */ /* synthetic */ up2 e(bq2 bq2Var) {
        switch (this.f0) {
            case 0:
                k((zy5) bq2Var);
                break;
            default:
                l((az5) bq2Var);
                break;
        }
        return this;
    }

    public zy5 g() {
        int i;
        zy5 zy5Var = new zy5(this);
        int i2 = this.g0;
        if ((i2 & 1) == 1) {
            this.h0 = Collections.unmodifiableList(this.h0);
            i = this.g0 & (-2);
            this.g0 = i;
        } else {
            i = i2;
        }
        zy5Var.f0 = this.h0;
        if ((i & 2) == 2) {
            this.i0 = Collections.unmodifiableList(this.i0);
            i = this.g0 & (-3);
            this.g0 = i;
        }
        zy5Var.g0 = this.i0;
        if ((i & 4) == 4) {
            this.j0 = Collections.unmodifiableList((List) this.j0);
            this.g0 &= -5;
        }
        zy5Var.h0 = (List) this.j0;
        int i3 = (i2 & 8) != 8 ? 0 : 1;
        zy5Var.i0 = (tz5) this.k0;
        if ((i2 & 16) == 16) {
            i3 |= 2;
        }
        zy5Var.j0 = (a06) this.l0;
        zy5Var.Z = i3;
        return zy5Var;
    }

    public az5 h() {
        az5 az5Var = new az5(this);
        int i = this.g0;
        int i2 = (i & 1) != 1 ? 0 : 1;
        az5Var.f0 = (iz5) this.j0;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        az5Var.g0 = (gz5) this.k0;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        az5Var.h0 = (zy5) this.l0;
        if ((i & 8) == 8) {
            this.h0 = Collections.unmodifiableList(this.h0);
            i = this.g0 & (-9);
            this.g0 = i;
        }
        az5Var.i0 = this.h0;
        if ((i & 16) == 16) {
            this.i0 = Collections.unmodifiableList(this.i0);
            this.g0 &= -17;
        }
        az5Var.j0 = this.i0;
        az5Var.Z = i2;
        return az5Var;
    }

    public void k(zy5 zy5Var) {
        a06 a06Var;
        tz5 tz5Var;
        if (zy5Var == zy5.m0) {
            return;
        }
        if (!zy5Var.f0.isEmpty()) {
            if (this.h0.isEmpty()) {
                this.h0 = zy5Var.f0;
                this.g0 &= -2;
            } else {
                if ((this.g0 & 1) != 1) {
                    this.h0 = new ArrayList(this.h0);
                    this.g0 |= 1;
                }
                this.h0.addAll(zy5Var.f0);
            }
        }
        if (!zy5Var.g0.isEmpty()) {
            if (this.i0.isEmpty()) {
                this.i0 = zy5Var.g0;
                this.g0 &= -3;
            } else {
                if ((this.g0 & 2) != 2) {
                    this.i0 = new ArrayList(this.i0);
                    this.g0 |= 2;
                }
                this.i0.addAll(zy5Var.g0);
            }
        }
        if (!zy5Var.h0.isEmpty()) {
            if (((List) this.j0).isEmpty()) {
                this.j0 = zy5Var.h0;
                this.g0 &= -5;
            } else {
                if ((this.g0 & 4) != 4) {
                    this.j0 = new ArrayList((List) this.j0);
                    this.g0 |= 4;
                }
                ((List) this.j0).addAll(zy5Var.h0);
            }
        }
        if ((zy5Var.Z & 1) == 1) {
            tz5 tz5Var2 = zy5Var.i0;
            if ((this.g0 & 8) != 8 || (tz5Var = (tz5) this.k0) == tz5.i0) {
                this.k0 = tz5Var2;
            } else {
                by5 by5VarI = tz5.i(tz5Var);
                by5VarI.i(tz5Var2);
                this.k0 = by5VarI.g();
            }
            this.g0 |= 8;
        }
        if ((zy5Var.Z & 2) == 2) {
            a06 a06Var2 = zy5Var.j0;
            if ((this.g0 & 16) != 16 || (a06Var = (a06) this.l0) == a06.g0) {
                this.l0 = a06Var2;
            } else {
                jy5 jy5Var = new jy5((byte) 2);
                jy5Var.f0 = Collections.EMPTY_LIST;
                jy5Var.m(a06Var);
                jy5Var.m(a06Var2);
                this.l0 = jy5Var.i();
            }
            this.g0 |= 16;
        }
        f(zy5Var);
        this.X = this.X.b(zy5Var.Y);
    }

    public void l(az5 az5Var) {
        zy5 zy5Var;
        gz5 gz5Var;
        iz5 iz5Var;
        if (az5Var == az5.m0) {
            return;
        }
        if ((az5Var.Z & 1) == 1) {
            iz5 iz5Var2 = az5Var.f0;
            if ((this.g0 & 1) != 1 || (iz5Var = (iz5) this.j0) == iz5.g0) {
                this.j0 = iz5Var2;
            } else {
                jy5 jy5Var = new jy5((byte) 3);
                jy5Var.f0 = s74.Y;
                jy5Var.l(iz5Var);
                jy5Var.l(iz5Var2);
                this.j0 = jy5Var.h();
            }
            this.g0 |= 1;
        }
        if ((az5Var.Z & 2) == 2) {
            gz5 gz5Var2 = az5Var.g0;
            if ((this.g0 & 2) != 2 || (gz5Var = (gz5) this.k0) == gz5.g0) {
                this.k0 = gz5Var2;
            } else {
                jy5 jy5Var2 = new jy5((byte) 1);
                jy5Var2.f0 = Collections.EMPTY_LIST;
                jy5Var2.k(gz5Var);
                jy5Var2.k(gz5Var2);
                this.k0 = jy5Var2.g();
            }
            this.g0 |= 2;
        }
        if ((az5Var.Z & 4) == 4) {
            zy5 zy5Var2 = az5Var.h0;
            if ((this.g0 & 4) != 4 || (zy5Var = (zy5) this.l0) == zy5.m0) {
                this.l0 = zy5Var2;
            } else {
                yy5 yy5VarI = i();
                yy5VarI.k(zy5Var);
                yy5VarI.k(zy5Var2);
                this.l0 = yy5VarI.g();
            }
            this.g0 |= 4;
        }
        if (!az5Var.i0.isEmpty()) {
            if (this.h0.isEmpty()) {
                this.h0 = az5Var.i0;
                this.g0 &= -9;
            } else {
                if ((this.g0 & 8) != 8) {
                    this.h0 = new ArrayList(this.h0);
                    this.g0 |= 8;
                }
                this.h0.addAll(az5Var.i0);
            }
        }
        if (!az5Var.j0.isEmpty()) {
            if (this.i0.isEmpty()) {
                this.i0 = az5Var.j0;
                this.g0 &= -17;
            } else {
                if ((this.g0 & 16) != 16) {
                    this.i0 = new ArrayList(this.i0);
                    this.g0 |= 16;
                }
                this.i0.addAll(az5Var.j0);
            }
        }
        f(az5Var);
        this.X = this.X.b(az5Var.Y);
    }
}
