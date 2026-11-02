package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lz5 extends bq2 {
    public static final lz5 j0;
    public static final au3 k0 = new au3((byte) 23);
    public final jb0 X;
    public int Y;
    public kz5 Z;
    public nz5 f0;
    public int g0;
    public byte h0;
    public int i0;

    static {
        lz5 lz5Var = new lz5();
        j0 = lz5Var;
        lz5Var.Z = kz5.INV;
        lz5Var.f0 = nz5.w0;
        lz5Var.g0 = 0;
    }

    public lz5(iv0 iv0Var, r62 r62Var) {
        this.h0 = (byte) -1;
        this.i0 = -1;
        kz5 kz5Var = kz5.INV;
        this.Z = kz5Var;
        this.f0 = nz5.w0;
        boolean z = false;
        this.g0 = 0;
        ib0 ib0Var = new ib0();
        nv0 nv0VarG = nv0.G(ib0Var, 1);
        while (!z) {
            try {
                try {
                    int iN = iv0Var.n();
                    if (iN != 0) {
                        mz5 mz5VarR = null;
                        kz5 kz5Var2 = null;
                        if (iN == 8) {
                            int iK = iv0Var.k();
                            if (iK == 0) {
                                kz5Var2 = kz5.IN;
                            } else if (iK == 1) {
                                kz5Var2 = kz5.OUT;
                            } else if (iK == 2) {
                                kz5Var2 = kz5Var;
                            } else if (iK == 3) {
                                kz5Var2 = kz5.STAR;
                            }
                            if (kz5Var2 == null) {
                                nv0VarG.e0(iN);
                                nv0VarG.e0(iK);
                            } else {
                                this.Y |= 1;
                                this.Z = kz5Var2;
                            }
                        } else if (iN == 18) {
                            if ((this.Y & 2) == 2) {
                                nz5 nz5Var = this.f0;
                                nz5Var.getClass();
                                mz5VarR = nz5.r(nz5Var);
                            }
                            nz5 nz5Var2 = (nz5) iv0Var.g(nz5.x0, r62Var);
                            this.f0 = nz5Var2;
                            if (mz5VarR != null) {
                                mz5VarR.i(nz5Var2);
                                this.f0 = mz5VarR.g();
                            }
                            this.Y |= 2;
                        } else if (iN == 24) {
                            this.Y |= 4;
                            this.g0 = iv0Var.k();
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
        int iK = (this.Y & 1) == 1 ? nv0.k(1, this.Z.X) : 0;
        if ((this.Y & 2) == 2) {
            iK += nv0.n(2, this.f0);
        }
        if ((this.Y & 4) == 4) {
            iK += nv0.l(3, this.g0);
        }
        int size = this.X.size() + iK;
        this.i0 = size;
        return size;
    }

    @Override // defpackage.d2
    public final up2 c() {
        jz5 jz5Var = new jz5();
        jz5Var.Z = kz5.INV;
        jz5Var.f0 = nz5.w0;
        return jz5Var;
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
        if ((this.Y & 2) != 2 || this.f0.d()) {
            this.h0 = (byte) 1;
            return true;
        }
        this.h0 = (byte) 0;
        return false;
    }

    @Override // defpackage.d2
    public final up2 e() {
        jz5 jz5Var = new jz5();
        jz5Var.Z = kz5.INV;
        jz5Var.f0 = nz5.w0;
        jz5Var.g(this);
        return jz5Var;
    }

    @Override // defpackage.d2
    public final void f(nv0 nv0Var) throws IOException {
        b();
        if ((this.Y & 1) == 1) {
            nv0Var.U(1, this.Z.X);
        }
        if ((this.Y & 2) == 2) {
            nv0Var.X(2, this.f0);
        }
        if ((this.Y & 4) == 4) {
            nv0Var.V(3, this.g0);
        }
        nv0Var.a0(this.X);
    }

    public lz5() {
        this.h0 = (byte) -1;
        this.i0 = -1;
        this.X = jb0.X;
    }

    public lz5(jz5 jz5Var) {
        this.h0 = (byte) -1;
        this.i0 = -1;
        this.X = jz5Var.X;
    }
}
