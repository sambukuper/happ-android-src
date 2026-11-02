package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fu3 extends bq2 {
    public static final fu3 l0;
    public static final au3 m0 = new au3((byte) 2);
    public final jb0 X;
    public int Y;
    public cu3 Z;
    public du3 f0;
    public du3 g0;
    public du3 h0;
    public du3 i0;
    public byte j0;
    public int k0;

    static {
        fu3 fu3Var = new fu3();
        l0 = fu3Var;
        fu3Var.Z = cu3.i0;
        du3 du3Var = du3.i0;
        fu3Var.f0 = du3Var;
        fu3Var.g0 = du3Var;
        fu3Var.h0 = du3Var;
        fu3Var.i0 = du3Var;
    }

    public fu3(iv0 iv0Var, r62 r62Var) {
        this.j0 = (byte) -1;
        this.k0 = -1;
        this.Z = cu3.i0;
        du3 du3Var = du3.i0;
        this.f0 = du3Var;
        this.g0 = du3Var;
        this.h0 = du3Var;
        this.i0 = du3Var;
        ib0 ib0Var = new ib0();
        nv0 nv0VarG = nv0.G(ib0Var, 1);
        byte b = 0;
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iN = iv0Var.n();
                    if (iN != 0) {
                        bu3 bu3VarI = null;
                        if (iN == 10) {
                            if ((this.Y & 1) == 1) {
                                cu3 cu3Var = this.Z;
                                cu3Var.getClass();
                                bu3VarI = new bu3(b);
                                bu3VarI.h(cu3Var);
                            }
                            cu3 cu3Var2 = (cu3) iv0Var.g(cu3.j0, r62Var);
                            this.Z = cu3Var2;
                            if (bu3VarI != null) {
                                bu3VarI.h(cu3Var2);
                                this.Z = bu3VarI.f();
                            }
                            this.Y |= 1;
                        } else if (iN == 18) {
                            if ((this.Y & 2) == 2) {
                                du3 du3Var2 = this.f0;
                                du3Var2.getClass();
                                bu3VarI = du3.i(du3Var2);
                            }
                            du3 du3Var3 = (du3) iv0Var.g(du3.j0, r62Var);
                            this.f0 = du3Var3;
                            if (bu3VarI != null) {
                                bu3VarI.i(du3Var3);
                                this.f0 = bu3VarI.g();
                            }
                            this.Y |= 2;
                        } else if (iN == 26) {
                            if ((this.Y & 4) == 4) {
                                du3 du3Var4 = this.g0;
                                du3Var4.getClass();
                                bu3VarI = du3.i(du3Var4);
                            }
                            du3 du3Var5 = (du3) iv0Var.g(du3.j0, r62Var);
                            this.g0 = du3Var5;
                            if (bu3VarI != null) {
                                bu3VarI.i(du3Var5);
                                this.g0 = bu3VarI.g();
                            }
                            this.Y |= 4;
                        } else if (iN == 34) {
                            if ((this.Y & 8) == 8) {
                                du3 du3Var6 = this.h0;
                                du3Var6.getClass();
                                bu3VarI = du3.i(du3Var6);
                            }
                            du3 du3Var7 = (du3) iv0Var.g(du3.j0, r62Var);
                            this.h0 = du3Var7;
                            if (bu3VarI != null) {
                                bu3VarI.i(du3Var7);
                                this.h0 = bu3VarI.g();
                            }
                            this.Y |= 8;
                        } else if (iN == 42) {
                            if ((this.Y & 16) == 16) {
                                du3 du3Var8 = this.i0;
                                du3Var8.getClass();
                                bu3VarI = du3.i(du3Var8);
                            }
                            du3 du3Var9 = (du3) iv0Var.g(du3.j0, r62Var);
                            this.i0 = du3Var9;
                            if (bu3VarI != null) {
                                bu3VarI.i(du3Var9);
                                this.i0 = bu3VarI.g();
                            }
                            this.Y |= 16;
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
        int i = this.k0;
        if (i != -1) {
            return i;
        }
        int iN = (this.Y & 1) == 1 ? nv0.n(1, this.Z) : 0;
        if ((this.Y & 2) == 2) {
            iN += nv0.n(2, this.f0);
        }
        if ((this.Y & 4) == 4) {
            iN += nv0.n(3, this.g0);
        }
        if ((this.Y & 8) == 8) {
            iN += nv0.n(4, this.h0);
        }
        if ((this.Y & 16) == 16) {
            iN += nv0.n(5, this.i0);
        }
        int size = this.X.size() + iN;
        this.k0 = size;
        return size;
    }

    @Override // defpackage.d2
    public final up2 c() {
        return eu3.h();
    }

    @Override // defpackage.ou4
    public final boolean d() {
        byte b = this.j0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.j0 = (byte) 1;
        return true;
    }

    @Override // defpackage.d2
    public final up2 e() {
        eu3 eu3VarH = eu3.h();
        eu3VarH.j(this);
        return eu3VarH;
    }

    @Override // defpackage.d2
    public final void f(nv0 nv0Var) throws IOException {
        b();
        if ((this.Y & 1) == 1) {
            nv0Var.X(1, this.Z);
        }
        if ((this.Y & 2) == 2) {
            nv0Var.X(2, this.f0);
        }
        if ((this.Y & 4) == 4) {
            nv0Var.X(3, this.g0);
        }
        if ((this.Y & 8) == 8) {
            nv0Var.X(4, this.h0);
        }
        if ((this.Y & 16) == 16) {
            nv0Var.X(5, this.i0);
        }
        nv0Var.a0(this.X);
    }

    public final boolean i() {
        return (this.Y & 4) == 4;
    }

    public fu3() {
        this.j0 = (byte) -1;
        this.k0 = -1;
        this.X = jb0.X;
    }

    public fu3(eu3 eu3Var) {
        this.j0 = (byte) -1;
        this.k0 = -1;
        this.X = eu3Var.X;
    }
}
