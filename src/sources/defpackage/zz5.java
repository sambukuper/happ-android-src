package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zz5 extends bq2 {
    public static final zz5 m0;
    public static final au3 n0 = new au3((byte) 28);
    public final jb0 X;
    public int Y;
    public int Z;
    public int f0;
    public xz5 g0;
    public int h0;
    public int i0;
    public yz5 j0;
    public byte k0;
    public int l0;

    static {
        zz5 zz5Var = new zz5();
        m0 = zz5Var;
        zz5Var.Z = 0;
        zz5Var.f0 = 0;
        zz5Var.g0 = xz5.ERROR;
        zz5Var.h0 = 0;
        zz5Var.i0 = 0;
        zz5Var.j0 = yz5.LANGUAGE_VERSION;
    }

    public zz5(iv0 iv0Var) {
        this.k0 = (byte) -1;
        this.l0 = -1;
        boolean z = false;
        this.Z = 0;
        this.f0 = 0;
        xz5 xz5Var = xz5.ERROR;
        this.g0 = xz5Var;
        this.h0 = 0;
        this.i0 = 0;
        yz5 yz5Var = yz5.LANGUAGE_VERSION;
        this.j0 = yz5Var;
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
                        } else if (iN != 16) {
                            yz5 yz5Var2 = null;
                            xz5 xz5Var2 = null;
                            if (iN == 24) {
                                int iK = iv0Var.k();
                                if (iK == 0) {
                                    xz5Var2 = xz5.WARNING;
                                } else if (iK == 1) {
                                    xz5Var2 = xz5Var;
                                } else if (iK == 2) {
                                    xz5Var2 = xz5.HIDDEN;
                                }
                                if (xz5Var2 == null) {
                                    nv0VarG.e0(iN);
                                    nv0VarG.e0(iK);
                                } else {
                                    this.Y |= 4;
                                    this.g0 = xz5Var2;
                                }
                            } else if (iN == 32) {
                                this.Y |= 8;
                                this.h0 = iv0Var.k();
                            } else if (iN == 40) {
                                this.Y |= 16;
                                this.i0 = iv0Var.k();
                            } else if (iN == 48) {
                                int iK2 = iv0Var.k();
                                if (iK2 == 0) {
                                    yz5Var2 = yz5Var;
                                } else if (iK2 == 1) {
                                    yz5Var2 = yz5.COMPILER_VERSION;
                                } else if (iK2 == 2) {
                                    yz5Var2 = yz5.API_VERSION;
                                }
                                if (yz5Var2 == null) {
                                    nv0VarG.e0(iN);
                                    nv0VarG.e0(iK2);
                                } else {
                                    this.Y |= 32;
                                    this.j0 = yz5Var2;
                                }
                            } else if (!iv0Var.q(iN, nv0VarG)) {
                            }
                        } else {
                            this.Y |= 2;
                            this.f0 = iv0Var.k();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    try {
                        nv0VarG.R();
                    } catch (IOException unused) {
                    } finally {
                        this.X = ib0Var.m();
                    }
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
        try {
            nv0VarG.R();
        } catch (IOException unused2) {
        } finally {
            this.X = ib0Var.m();
        }
    }

    @Override // defpackage.d2
    public final int b() {
        int i = this.l0;
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
            iL += nv0.l(4, this.h0);
        }
        if ((this.Y & 16) == 16) {
            iL += nv0.l(5, this.i0);
        }
        if ((this.Y & 32) == 32) {
            iL += nv0.k(6, this.j0.X);
        }
        int size = this.X.size() + iL;
        this.l0 = size;
        return size;
    }

    @Override // defpackage.d2
    public final up2 c() {
        wz5 wz5Var = new wz5();
        wz5Var.g0 = xz5.ERROR;
        wz5Var.j0 = yz5.LANGUAGE_VERSION;
        return wz5Var;
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
        this.k0 = (byte) 1;
        return true;
    }

    @Override // defpackage.d2
    public final up2 e() {
        wz5 wz5Var = new wz5();
        wz5Var.g0 = xz5.ERROR;
        wz5Var.j0 = yz5.LANGUAGE_VERSION;
        wz5Var.g(this);
        return wz5Var;
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
            nv0Var.V(4, this.h0);
        }
        if ((this.Y & 16) == 16) {
            nv0Var.V(5, this.i0);
        }
        if ((this.Y & 32) == 32) {
            nv0Var.U(6, this.j0.X);
        }
        nv0Var.a0(this.X);
    }

    public zz5() {
        this.k0 = (byte) -1;
        this.l0 = -1;
        this.X = jb0.X;
    }

    public zz5(wz5 wz5Var) {
        this.k0 = (byte) -1;
        this.l0 = -1;
        this.X = wz5Var.X;
    }
}
