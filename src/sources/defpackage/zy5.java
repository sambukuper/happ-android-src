package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zy5 extends yp2 {
    public static final zy5 m0;
    public static final au3 n0 = new au3((byte) 16);
    public final jb0 Y;
    public int Z;
    public List f0;
    public List g0;
    public List h0;
    public tz5 i0;
    public a06 j0;
    public byte k0;
    public int l0;

    static {
        zy5 zy5Var = new zy5();
        m0 = zy5Var;
        List list = Collections.EMPTY_LIST;
        zy5Var.f0 = list;
        zy5Var.g0 = list;
        zy5Var.h0 = list;
        zy5Var.i0 = tz5.i0;
        zy5Var.j0 = a06.g0;
    }

    public zy5(iv0 iv0Var, r62 r62Var) {
        this.k0 = (byte) -1;
        this.l0 = -1;
        List list = Collections.EMPTY_LIST;
        this.f0 = list;
        this.g0 = list;
        this.h0 = list;
        this.i0 = tz5.i0;
        this.j0 = a06.g0;
        ib0 ib0Var = new ib0();
        nv0 nv0VarG = nv0.G(ib0Var, 1);
        boolean z = false;
        int i = 0;
        while (true) {
            byte b = 2;
            if (z) {
                break;
            }
            try {
                try {
                    int iN = iv0Var.n();
                    if (iN != 0) {
                        if (iN == 26) {
                            int i2 = (i == true ? 1 : 0) & 1;
                            i = i;
                            if (i2 != 1) {
                                this.f0 = new ArrayList();
                                i = (i == true ? 1 : 0) | 1;
                            }
                            this.f0.add(iv0Var.g(vy5.B0, r62Var));
                        } else if (iN == 34) {
                            int i3 = (i == true ? 1 : 0) & 2;
                            i = i;
                            if (i3 != 2) {
                                this.g0 = new ArrayList();
                                i = (i == true ? 1 : 0) | 2;
                            }
                            this.g0.add(iv0Var.g(cz5.H0, r62Var));
                        } else if (iN != 42) {
                            jy5 jy5Var = null;
                            by5 by5VarI = null;
                            if (iN == 242) {
                                if ((this.Z & 1) == 1) {
                                    tz5 tz5Var = this.i0;
                                    tz5Var.getClass();
                                    by5VarI = tz5.i(tz5Var);
                                }
                                tz5 tz5Var2 = (tz5) iv0Var.g(tz5.j0, r62Var);
                                this.i0 = tz5Var2;
                                if (by5VarI != null) {
                                    by5VarI.i(tz5Var2);
                                    this.i0 = by5VarI.g();
                                }
                                this.Z |= 1;
                            } else if (iN == 258) {
                                if ((this.Z & 2) == 2) {
                                    a06 a06Var = this.j0;
                                    a06Var.getClass();
                                    jy5Var = new jy5(b);
                                    jy5Var.f0 = Collections.EMPTY_LIST;
                                    jy5Var.m(a06Var);
                                }
                                a06 a06Var2 = (a06) iv0Var.g(a06.h0, r62Var);
                                this.j0 = a06Var2;
                                if (jy5Var != null) {
                                    jy5Var.m(a06Var2);
                                    this.j0 = jy5Var.i();
                                }
                                this.Z |= 2;
                            } else if (!n(iv0Var, nv0VarG, r62Var, iN)) {
                            }
                        } else {
                            int i4 = (i == true ? 1 : 0) & 4;
                            i = i;
                            if (i4 != 4) {
                                this.h0 = new ArrayList();
                                i = (i == true ? 1 : 0) | 4;
                            }
                            this.h0.add(iv0Var.g(pz5.s0, r62Var));
                        }
                    }
                    z = true;
                } catch (rh3 e) {
                    e.X = this;
                    throw e;
                } catch (IOException e2) {
                    rh3 rh3Var = new rh3(e2.getMessage());
                    rh3Var.X = this;
                    throw rh3Var;
                }
            } catch (Throwable th) {
                if (((i == true ? 1 : 0) & 1) == 1) {
                    this.f0 = Collections.unmodifiableList(this.f0);
                }
                if (((i == true ? 1 : 0) & 2) == 2) {
                    this.g0 = Collections.unmodifiableList(this.g0);
                }
                if (((i == true ? 1 : 0) & 4) == 4) {
                    this.h0 = Collections.unmodifiableList(this.h0);
                }
                try {
                    nv0VarG.R();
                } catch (IOException unused) {
                } finally {
                    this.Y = ib0Var.m();
                }
                m();
                throw th;
            }
        }
        if (((i == true ? 1 : 0) & 1) == 1) {
            this.f0 = Collections.unmodifiableList(this.f0);
        }
        if (((i == true ? 1 : 0) & 2) == 2) {
            this.g0 = Collections.unmodifiableList(this.g0);
        }
        if (((i == true ? 1 : 0) & 4) == 4) {
            this.h0 = Collections.unmodifiableList(this.h0);
        }
        try {
            nv0VarG.R();
        } catch (IOException unused2) {
        } finally {
            this.Y = ib0Var.m();
        }
        m();
    }

    @Override // defpackage.ou4
    public final d2 a() {
        return m0;
    }

    @Override // defpackage.d2
    public final int b() {
        int i = this.l0;
        if (i != -1) {
            return i;
        }
        int iN = 0;
        for (int i2 = 0; i2 < this.f0.size(); i2++) {
            iN += nv0.n(3, (d2) this.f0.get(i2));
        }
        for (int i3 = 0; i3 < this.g0.size(); i3++) {
            iN += nv0.n(4, (d2) this.g0.get(i3));
        }
        for (int i4 = 0; i4 < this.h0.size(); i4++) {
            iN += nv0.n(5, (d2) this.h0.get(i4));
        }
        if ((this.Z & 1) == 1) {
            iN += nv0.n(30, this.i0);
        }
        if ((this.Z & 2) == 2) {
            iN += nv0.n(32, this.j0);
        }
        int size = this.Y.size() + j() + iN;
        this.l0 = size;
        return size;
    }

    @Override // defpackage.d2
    public final up2 c() {
        return yy5.i();
    }

    @Override // defpackage.ou4
    public final boolean d() {
        byte b = this.k0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f0.size(); i++) {
            if (!((vy5) this.f0.get(i)).d()) {
                this.k0 = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.g0.size(); i2++) {
            if (!((cz5) this.g0.get(i2)).d()) {
                this.k0 = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.h0.size(); i3++) {
            if (!((pz5) this.h0.get(i3)).d()) {
                this.k0 = (byte) 0;
                return false;
            }
        }
        if ((this.Z & 1) == 1 && !this.i0.d()) {
            this.k0 = (byte) 0;
            return false;
        }
        if (i()) {
            this.k0 = (byte) 1;
            return true;
        }
        this.k0 = (byte) 0;
        return false;
    }

    @Override // defpackage.d2
    public final up2 e() {
        yy5 yy5VarI = yy5.i();
        yy5VarI.k(this);
        return yy5VarI;
    }

    @Override // defpackage.d2
    public final void f(nv0 nv0Var) throws IOException {
        b();
        mj0 mj0Var = new mj0(this);
        for (int i = 0; i < this.f0.size(); i++) {
            nv0Var.X(3, (d2) this.f0.get(i));
        }
        for (int i2 = 0; i2 < this.g0.size(); i2++) {
            nv0Var.X(4, (d2) this.g0.get(i2));
        }
        for (int i3 = 0; i3 < this.h0.size(); i3++) {
            nv0Var.X(5, (d2) this.h0.get(i3));
        }
        if ((this.Z & 1) == 1) {
            nv0Var.X(30, this.i0);
        }
        if ((this.Z & 2) == 2) {
            nv0Var.X(32, this.j0);
        }
        mj0Var.b0(MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE, nv0Var);
        nv0Var.a0(this.Y);
    }

    public zy5() {
        this.k0 = (byte) -1;
        this.l0 = -1;
        this.Y = jb0.X;
    }

    public zy5(yy5 yy5Var) {
        super(yy5Var);
        this.k0 = (byte) -1;
        this.l0 = -1;
        this.Y = yy5Var.X;
    }
}
