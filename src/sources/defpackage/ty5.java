package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ty5 extends bq2 {
    public static final ty5 n0;
    public static final au3 o0 = new au3((byte) 14);
    public final jb0 X;
    public int Y;
    public int Z;
    public int f0;
    public sy5 g0;
    public nz5 h0;
    public int i0;
    public List j0;
    public List k0;
    public byte l0;
    public int m0;

    static {
        ty5 ty5Var = new ty5();
        n0 = ty5Var;
        ty5Var.Z = 0;
        ty5Var.f0 = 0;
        ty5Var.g0 = sy5.TRUE;
        ty5Var.h0 = nz5.w0;
        ty5Var.i0 = 0;
        List list = Collections.EMPTY_LIST;
        ty5Var.j0 = list;
        ty5Var.k0 = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ty5(iv0 iv0Var, r62 r62Var) {
        sy5 sy5Var;
        this.l0 = (byte) -1;
        this.m0 = -1;
        boolean z = false;
        this.Z = 0;
        this.f0 = 0;
        sy5 sy5Var2 = sy5.TRUE;
        this.g0 = sy5Var2;
        this.h0 = nz5.w0;
        this.i0 = 0;
        List list = Collections.EMPTY_LIST;
        this.j0 = list;
        this.k0 = list;
        ib0 ib0Var = new ib0();
        nv0 nv0VarG = nv0.G(ib0Var, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iN = iv0Var.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.Y |= 1;
                                this.Z = iv0Var.k();
                            } else if (iN != 16) {
                                Object objR = null;
                                if (iN == 24) {
                                    int iK = iv0Var.k();
                                    if (iK != 0) {
                                        if (iK == 1) {
                                            objR = sy5.FALSE;
                                        } else if (iK == 2) {
                                            objR = sy5.NULL;
                                        }
                                        sy5Var = objR;
                                    } else {
                                        sy5Var = sy5Var2;
                                    }
                                    if (sy5Var == 0) {
                                        nv0VarG.e0(iN);
                                        nv0VarG.e0(iK);
                                    } else {
                                        this.Y |= 4;
                                        this.g0 = sy5Var;
                                    }
                                } else if (iN == 34) {
                                    if ((this.Y & 8) == 8) {
                                        nz5 nz5Var = this.h0;
                                        nz5Var.getClass();
                                        objR = nz5.r(nz5Var);
                                    }
                                    mz5 mz5Var = objR;
                                    nz5 nz5Var2 = (nz5) iv0Var.g(nz5.x0, r62Var);
                                    this.h0 = nz5Var2;
                                    if (mz5Var != 0) {
                                        mz5Var.i(nz5Var2);
                                        this.h0 = mz5Var.g();
                                    }
                                    this.Y |= 8;
                                } else if (iN != 40) {
                                    au3 au3Var = o0;
                                    if (iN == 50) {
                                        if ((i & 32) != 32) {
                                            this.j0 = new ArrayList();
                                            i |= 32;
                                        }
                                        this.j0.add(iv0Var.g(au3Var, r62Var));
                                    } else if (iN == 58) {
                                        if ((i & 64) != 64) {
                                            this.k0 = new ArrayList();
                                            i |= 64;
                                        }
                                        this.k0.add(iv0Var.g(au3Var, r62Var));
                                    } else if (!iv0Var.q(iN, nv0VarG)) {
                                    }
                                } else {
                                    this.Y |= 16;
                                    this.i0 = iv0Var.k();
                                }
                            } else {
                                this.Y |= 2;
                                this.f0 = iv0Var.k();
                            }
                        }
                        z = true;
                    } catch (IOException e) {
                        rh3 rh3Var = new rh3(e.getMessage());
                        rh3Var.X = this;
                        throw rh3Var;
                    }
                } catch (rh3 e2) {
                    e2.X = this;
                    throw e2;
                }
            } catch (Throwable th) {
                if ((i & 32) == 32) {
                    this.j0 = Collections.unmodifiableList(this.j0);
                }
                if ((i & 64) == 64) {
                    this.k0 = Collections.unmodifiableList(this.k0);
                }
                try {
                    nv0VarG.R();
                } catch (IOException unused) {
                } finally {
                    this.X = ib0Var.m();
                }
                throw th;
            }
        }
        if ((i & 32) == 32) {
            this.j0 = Collections.unmodifiableList(this.j0);
        }
        if ((i & 64) == 64) {
            this.k0 = Collections.unmodifiableList(this.k0);
        }
        try {
            nv0VarG.R();
        } catch (IOException unused2) {
        } finally {
            this.X = ib0Var.m();
        }
    }

    @Override // defpackage.d2
    public final int b() {
        int i = this.m0;
        if (i != -1) {
            return i;
        }
        int iL = (this.Y & 1) == 1 ? nv0.l(1, this.Z) : 0;
        if ((this.Y & 2) == 2) {
            iL += nv0.l(2, this.f0);
        }
        if ((this.Y & 4) == 4) {
            iL += nv0.k(3, this.g0.X);
        }
        if ((this.Y & 8) == 8) {
            iL += nv0.n(4, this.h0);
        }
        if ((this.Y & 16) == 16) {
            iL += nv0.l(5, this.i0);
        }
        for (int i2 = 0; i2 < this.j0.size(); i2++) {
            iL += nv0.n(6, (d2) this.j0.get(i2));
        }
        for (int i3 = 0; i3 < this.k0.size(); i3++) {
            iL += nv0.n(7, (d2) this.k0.get(i3));
        }
        int size = this.X.size() + iL;
        this.m0 = size;
        return size;
    }

    @Override // defpackage.d2
    public final up2 c() {
        return ry5.g();
    }

    @Override // defpackage.ou4
    public final boolean d() {
        byte b = this.l0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.Y & 8) == 8 && !this.h0.d()) {
            this.l0 = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.j0.size(); i++) {
            if (!((ty5) this.j0.get(i)).d()) {
                this.l0 = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.k0.size(); i2++) {
            if (!((ty5) this.k0.get(i2)).d()) {
                this.l0 = (byte) 0;
                return false;
            }
        }
        this.l0 = (byte) 1;
        return true;
    }

    @Override // defpackage.d2
    public final up2 e() {
        ry5 ry5VarG = ry5.g();
        ry5VarG.h(this);
        return ry5VarG;
    }

    @Override // defpackage.d2
    public final void f(nv0 nv0Var) throws IOException {
        b();
        if ((this.Y & 1) == 1) {
            nv0Var.V(1, this.Z);
        }
        if ((this.Y & 2) == 2) {
            nv0Var.V(2, this.f0);
        }
        if ((this.Y & 4) == 4) {
            nv0Var.U(3, this.g0.X);
        }
        if ((this.Y & 8) == 8) {
            nv0Var.X(4, this.h0);
        }
        if ((this.Y & 16) == 16) {
            nv0Var.V(5, this.i0);
        }
        for (int i = 0; i < this.j0.size(); i++) {
            nv0Var.X(6, (d2) this.j0.get(i));
        }
        for (int i2 = 0; i2 < this.k0.size(); i2++) {
            nv0Var.X(7, (d2) this.k0.get(i2));
        }
        nv0Var.a0(this.X);
    }

    public ty5() {
        this.l0 = (byte) -1;
        this.m0 = -1;
        this.X = jb0.X;
    }

    public ty5(ry5 ry5Var) {
        this.l0 = (byte) -1;
        this.m0 = -1;
        this.X = ry5Var.X;
    }
}
