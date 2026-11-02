package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fz5 extends bq2 {
    public static final fz5 j0;
    public static final au3 k0 = new au3((byte) 20);
    public final jb0 X;
    public int Y;
    public int Z;
    public int f0;
    public ez5 g0;
    public byte h0;
    public int i0;

    static {
        fz5 fz5Var = new fz5();
        j0 = fz5Var;
        fz5Var.Z = -1;
        fz5Var.f0 = 0;
        fz5Var.g0 = ez5.PACKAGE;
    }

    public fz5(iv0 iv0Var) {
        this.h0 = (byte) -1;
        this.i0 = -1;
        this.Z = -1;
        boolean z = false;
        this.f0 = 0;
        ez5 ez5Var = ez5.PACKAGE;
        this.g0 = ez5Var;
        ib0 ib0Var = new ib0();
        nv0 nv0VarG = nv0.G(ib0Var, 1);
        while (!z) {
            try {
                try {
                    int iN = iv0Var.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.Y |= 1;
                            this.Z = iv0Var.k();
                        } else if (iN == 16) {
                            this.Y |= 2;
                            this.f0 = iv0Var.k();
                        } else if (iN == 24) {
                            int iK = iv0Var.k();
                            ez5 ez5Var2 = iK != 0 ? iK != 1 ? iK != 2 ? null : ez5.LOCAL : ez5Var : ez5.CLASS;
                            if (ez5Var2 == null) {
                                nv0VarG.e0(iN);
                                nv0VarG.e0(iK);
                            } else {
                                this.Y |= 4;
                                this.g0 = ez5Var2;
                            }
                        } else if (!iv0Var.q(iN, nv0VarG)) {
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
                try {
                    nv0VarG.R();
                } catch (IOException unused) {
                } finally {
                    this.X = ib0Var.m();
                }
                throw th;
            }
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
        int i = this.i0;
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
        int size = this.X.size() + iL;
        this.i0 = size;
        return size;
    }

    @Override // defpackage.d2
    public final up2 c() {
        dz5 dz5Var = new dz5();
        dz5Var.Z = -1;
        dz5Var.g0 = ez5.PACKAGE;
        return dz5Var;
    }

    @Override // defpackage.ou4
    public final boolean d() {
        byte b = this.h0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.Y & 2) == 2) {
            this.h0 = (byte) 1;
            return true;
        }
        this.h0 = (byte) 0;
        return false;
    }

    @Override // defpackage.d2
    public final up2 e() {
        dz5 dz5Var = new dz5();
        dz5Var.Z = -1;
        dz5Var.g0 = ez5.PACKAGE;
        dz5Var.g(this);
        return dz5Var;
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
        nv0Var.a0(this.X);
    }

    public fz5() {
        this.h0 = (byte) -1;
        this.i0 = -1;
        this.X = jb0.X;
    }

    public fz5(dz5 dz5Var) {
        this.h0 = (byte) -1;
        this.i0 = -1;
        this.X = dz5Var.X;
    }
}
