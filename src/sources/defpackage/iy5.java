package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class iy5 extends yp2 {
    public static final iy5 m0;
    public static final au3 n0 = new au3((byte) 10);
    public final jb0 Y;
    public int Z;
    public int f0;
    public List g0;
    public List h0;
    public List i0;
    public List j0;
    public byte k0;
    public int l0;

    static {
        iy5 iy5Var = new iy5();
        m0 = iy5Var;
        iy5Var.f0 = 6;
        List list = Collections.EMPTY_LIST;
        iy5Var.g0 = list;
        iy5Var.h0 = list;
        iy5Var.i0 = list;
        iy5Var.j0 = list;
    }

    public iy5(iv0 iv0Var, r62 r62Var) {
        this.k0 = (byte) -1;
        this.l0 = -1;
        this.f0 = 6;
        List list = Collections.EMPTY_LIST;
        this.g0 = list;
        this.h0 = list;
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
                        if (iN == 8) {
                            this.Z |= 1;
                            this.f0 = iv0Var.k();
                        } else if (iN == 18) {
                            if ((i & 2) != 2) {
                                this.g0 = new ArrayList();
                                i |= 2;
                            }
                            this.g0.add(iv0Var.g(vz5.q0, r62Var));
                        } else if (iN == 26) {
                            if ((i & 16) != 16) {
                                this.j0 = new ArrayList();
                                i |= 16;
                            }
                            this.j0.add(iv0Var.g(cy5.j0, r62Var));
                        } else if (iN == 248) {
                            if ((i & 4) != 4) {
                                this.h0 = new ArrayList();
                                i |= 4;
                            }
                            this.h0.add(Integer.valueOf(iv0Var.k()));
                        } else if (iN == 250) {
                            int iE = iv0Var.e(iv0Var.k());
                            if ((i & 4) != 4 && iv0Var.c() > 0) {
                                this.h0 = new ArrayList();
                                i |= 4;
                            }
                            while (iv0Var.c() > 0) {
                                this.h0.add(Integer.valueOf(iv0Var.k()));
                            }
                            iv0Var.d(iE);
                        } else if (iN == 258) {
                            if ((i & 8) != 8) {
                                this.i0 = new ArrayList();
                                i |= 8;
                            }
                            this.i0.add(iv0Var.g(gy5.j0, r62Var));
                        } else if (!n(iv0Var, nv0VarG, r62Var, iN)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 2) == 2) {
                        this.g0 = Collections.unmodifiableList(this.g0);
                    }
                    if ((i & 16) == 16) {
                        this.j0 = Collections.unmodifiableList(this.j0);
                    }
                    if ((i & 4) == 4) {
                        this.h0 = Collections.unmodifiableList(this.h0);
                    }
                    if ((i & 8) == 8) {
                        this.i0 = Collections.unmodifiableList(this.i0);
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
        if ((i & 2) == 2) {
            this.g0 = Collections.unmodifiableList(this.g0);
        }
        if ((i & 16) == 16) {
            this.j0 = Collections.unmodifiableList(this.j0);
        }
        if ((i & 4) == 4) {
            this.h0 = Collections.unmodifiableList(this.h0);
        }
        if ((i & 8) == 8) {
            this.i0 = Collections.unmodifiableList(this.i0);
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
        List list;
        int i = this.l0;
        if (i != -1) {
            return i;
        }
        int iL = (this.Z & 1) == 1 ? nv0.l(1, this.f0) : 0;
        for (int i2 = 0; i2 < this.g0.size(); i2++) {
            iL += nv0.n(2, (d2) this.g0.get(i2));
        }
        for (int i3 = 0; i3 < this.j0.size(); i3++) {
            iL += nv0.n(3, (d2) this.j0.get(i3));
        }
        int i4 = 0;
        int iM = 0;
        while (true) {
            int size = this.h0.size();
            list = this.h0;
            if (i4 >= size) {
                break;
            }
            iM += nv0.m(((Integer) list.get(i4)).intValue());
            i4++;
        }
        int size2 = (list.size() * 2) + iL + iM;
        for (int i5 = 0; i5 < this.i0.size(); i5++) {
            size2 += nv0.n(32, (d2) this.i0.get(i5));
        }
        int size3 = this.Y.size() + j() + size2;
        this.l0 = size3;
        return size3;
    }

    @Override // defpackage.d2
    public final up2 c() {
        return hy5.h();
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
        for (int i = 0; i < this.g0.size(); i++) {
            if (!((vz5) this.g0.get(i)).d()) {
                this.k0 = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.i0.size(); i2++) {
            if (!((gy5) this.i0.get(i2)).d()) {
                this.k0 = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.j0.size(); i3++) {
            if (!((cy5) this.j0.get(i3)).d()) {
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
        hy5 hy5VarH = hy5.h();
        hy5VarH.i(this);
        return hy5VarH;
    }

    @Override // defpackage.d2
    public final void f(nv0 nv0Var) throws IOException {
        b();
        mj0 mj0Var = new mj0(this);
        if ((this.Z & 1) == 1) {
            nv0Var.V(1, this.f0);
        }
        for (int i = 0; i < this.g0.size(); i++) {
            nv0Var.X(2, (d2) this.g0.get(i));
        }
        for (int i2 = 0; i2 < this.j0.size(); i2++) {
            nv0Var.X(3, (d2) this.j0.get(i2));
        }
        for (int i3 = 0; i3 < this.h0.size(); i3++) {
            nv0Var.V(31, ((Integer) this.h0.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.i0.size(); i4++) {
            nv0Var.X(32, (d2) this.i0.get(i4));
        }
        mj0Var.b0(19000, nv0Var);
        nv0Var.a0(this.Y);
    }

    public iy5() {
        this.k0 = (byte) -1;
        this.l0 = -1;
        this.Y = jb0.X;
    }

    public iy5(hy5 hy5Var) {
        super(hy5Var);
        this.k0 = (byte) -1;
        this.l0 = -1;
        this.Y = hy5Var.X;
    }
}
