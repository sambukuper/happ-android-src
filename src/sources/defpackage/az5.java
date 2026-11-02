package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class az5 extends yp2 {
    public static final az5 m0;
    public static final au3 n0 = new au3((byte) 17);
    public final jb0 Y;
    public int Z;
    public iz5 f0;
    public gz5 g0;
    public zy5 h0;
    public List i0;
    public List j0;
    public byte k0;
    public int l0;

    static {
        az5 az5Var = new az5();
        m0 = az5Var;
        az5Var.f0 = iz5.g0;
        az5Var.g0 = gz5.g0;
        az5Var.h0 = zy5.m0;
        List list = Collections.EMPTY_LIST;
        az5Var.i0 = list;
        az5Var.j0 = list;
    }

    public az5(iv0 iv0Var, r62 r62Var) {
        this.k0 = (byte) -1;
        this.l0 = -1;
        this.f0 = iz5.g0;
        this.g0 = gz5.g0;
        this.h0 = zy5.m0;
        List list = Collections.EMPTY_LIST;
        this.i0 = list;
        this.j0 = list;
        ib0 ib0Var = new ib0();
        nv0 nv0VarG = nv0.G(ib0Var, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = iv0Var.n();
                    if (iN != 0) {
                        yy5 yy5VarI = null;
                        jy5 jy5Var = null;
                        jy5 jy5Var2 = null;
                        if (iN == 10) {
                            if ((this.Z & 1) == 1) {
                                iz5 iz5Var = this.f0;
                                iz5Var.getClass();
                                jy5Var = new jy5((byte) 3);
                                jy5Var.f0 = s74.Y;
                                jy5Var.l(iz5Var);
                            }
                            iz5 iz5Var2 = (iz5) iv0Var.g(iz5.h0, r62Var);
                            this.f0 = iz5Var2;
                            if (jy5Var != null) {
                                jy5Var.l(iz5Var2);
                                this.f0 = jy5Var.h();
                            }
                            this.Z |= 1;
                        } else if (iN == 18) {
                            if ((this.Z & 2) == 2) {
                                gz5 gz5Var = this.g0;
                                gz5Var.getClass();
                                jy5Var2 = new jy5((byte) 1);
                                jy5Var2.f0 = Collections.EMPTY_LIST;
                                jy5Var2.k(gz5Var);
                            }
                            gz5 gz5Var2 = (gz5) iv0Var.g(gz5.h0, r62Var);
                            this.g0 = gz5Var2;
                            if (jy5Var2 != null) {
                                jy5Var2.k(gz5Var2);
                                this.g0 = jy5Var2.g();
                            }
                            this.Z |= 2;
                        } else if (iN == 26) {
                            if ((this.Z & 4) == 4) {
                                zy5 zy5Var = this.h0;
                                zy5Var.getClass();
                                yy5VarI = yy5.i();
                                yy5VarI.k(zy5Var);
                            }
                            zy5 zy5Var2 = (zy5) iv0Var.g(zy5.n0, r62Var);
                            this.h0 = zy5Var2;
                            if (yy5VarI != null) {
                                yy5VarI.k(zy5Var2);
                                this.h0 = yy5VarI.g();
                            }
                            this.Z |= 4;
                        } else if (iN == 34) {
                            int i2 = (i == true ? 1 : 0) & 8;
                            i = i;
                            if (i2 != 8) {
                                this.i0 = new ArrayList();
                                i = (i == true ? 1 : 0) | 8;
                            }
                            this.i0.add(iv0Var.g(fy5.J0, r62Var));
                        } else if (iN == 42) {
                            int i3 = (i == true ? 1 : 0) & 16;
                            i = i;
                            if (i3 != 16) {
                                this.j0 = new ArrayList();
                                i = (i == true ? 1 : 0) | 16;
                            }
                            this.j0.add(iv0Var.g(cy5.j0, r62Var));
                        } else if (!n(iv0Var, nv0VarG, r62Var, iN)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((i == true ? 1 : 0) & 8) == 8) {
                        this.i0 = Collections.unmodifiableList(this.i0);
                    }
                    if (((i == true ? 1 : 0) & 16) == 16) {
                        this.j0 = Collections.unmodifiableList(this.j0);
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
            } catch (rh3 e) {
                e.X = this;
                throw e;
            } catch (IOException e2) {
                rh3 rh3Var = new rh3(e2.getMessage());
                rh3Var.X = this;
                throw rh3Var;
            }
        }
        if (((i == true ? 1 : 0) & 8) == 8) {
            this.i0 = Collections.unmodifiableList(this.i0);
        }
        if (((i == true ? 1 : 0) & 16) == 16) {
            this.j0 = Collections.unmodifiableList(this.j0);
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
        int iN = (this.Z & 1) == 1 ? nv0.n(1, this.f0) : 0;
        if ((this.Z & 2) == 2) {
            iN += nv0.n(2, this.g0);
        }
        if ((this.Z & 4) == 4) {
            iN += nv0.n(3, this.h0);
        }
        for (int i2 = 0; i2 < this.i0.size(); i2++) {
            iN += nv0.n(4, (d2) this.i0.get(i2));
        }
        for (int i3 = 0; i3 < this.j0.size(); i3++) {
            iN += nv0.n(5, (d2) this.j0.get(i3));
        }
        int size = this.Y.size() + j() + iN;
        this.l0 = size;
        return size;
    }

    @Override // defpackage.d2
    public final up2 c() {
        return yy5.j();
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
        if ((this.Z & 2) == 2 && !this.g0.d()) {
            this.k0 = (byte) 0;
            return false;
        }
        if ((this.Z & 4) == 4 && !this.h0.d()) {
            this.k0 = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.i0.size(); i++) {
            if (!((fy5) this.i0.get(i)).d()) {
                this.k0 = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.j0.size(); i2++) {
            if (!((cy5) this.j0.get(i2)).d()) {
                this.k0 = (byte) 0;
                return false;
            }
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
        yy5 yy5VarJ = yy5.j();
        yy5VarJ.l(this);
        return yy5VarJ;
    }

    @Override // defpackage.d2
    public final void f(nv0 nv0Var) throws IOException {
        b();
        mj0 mj0Var = new mj0(this);
        if ((this.Z & 1) == 1) {
            nv0Var.X(1, this.f0);
        }
        if ((this.Z & 2) == 2) {
            nv0Var.X(2, this.g0);
        }
        if ((this.Z & 4) == 4) {
            nv0Var.X(3, this.h0);
        }
        for (int i = 0; i < this.i0.size(); i++) {
            nv0Var.X(4, (d2) this.i0.get(i));
        }
        for (int i2 = 0; i2 < this.j0.size(); i2++) {
            nv0Var.X(5, (d2) this.j0.get(i2));
        }
        mj0Var.b0(MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE, nv0Var);
        nv0Var.a0(this.Y);
    }

    public az5() {
        this.k0 = (byte) -1;
        this.l0 = -1;
        this.Y = jb0.X;
    }

    public az5(yy5 yy5Var) {
        super(yy5Var);
        this.k0 = (byte) -1;
        this.l0 = -1;
        this.Y = yy5Var.X;
    }
}
