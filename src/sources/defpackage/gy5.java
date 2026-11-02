package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gy5 extends bq2 {
    public static final gy5 i0;
    public static final au3 j0 = new au3((byte) 9);
    public final jb0 X;
    public int Y;
    public int Z;
    public mc4 f0;
    public byte g0;
    public int h0;

    static {
        gy5 gy5Var = new gy5();
        i0 = gy5Var;
        gy5Var.Z = 0;
        gy5Var.f0 = jb0.X;
    }

    public gy5(iv0 iv0Var) {
        this.g0 = (byte) -1;
        this.h0 = -1;
        boolean z = false;
        this.Z = 0;
        this.f0 = jb0.X;
        ib0 ib0Var = new ib0();
        nv0 nv0VarG = nv0.G(ib0Var, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iN = iv0Var.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.Y |= 1;
                                this.Z = iv0Var.k();
                            } else if (iN == 18) {
                                this.Y |= 2;
                                this.f0 = iv0Var.f();
                            } else if (!iv0Var.q(iN, nv0VarG)) {
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
        int i = this.h0;
        if (i != -1) {
            return i;
        }
        int iL = (this.Y & 1) == 1 ? nv0.l(1, this.Z) : 0;
        if ((this.Y & 2) == 2) {
            mc4 mc4Var = this.f0;
            iL += mc4Var.size() + nv0.p(mc4Var.size()) + nv0.r(2);
        }
        int size = this.X.size() + iL;
        this.h0 = size;
        return size;
    }

    @Override // defpackage.d2
    public final up2 c() {
        wx5 wx5Var = new wx5((byte) 1);
        wx5Var.g0 = jb0.X;
        return wx5Var;
    }

    @Override // defpackage.ou4
    public final boolean d() {
        byte b = this.g0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.Y;
        if ((i & 1) != 1) {
            this.g0 = (byte) 0;
            return false;
        }
        if ((i & 2) == 2) {
            this.g0 = (byte) 1;
            return true;
        }
        this.g0 = (byte) 0;
        return false;
    }

    @Override // defpackage.d2
    public final up2 e() {
        wx5 wx5Var = new wx5((byte) 1);
        wx5Var.g0 = jb0.X;
        wx5Var.i(this);
        return wx5Var;
    }

    @Override // defpackage.d2
    public final void f(nv0 nv0Var) throws IOException {
        b();
        if ((this.Y & 1) == 1) {
            nv0Var.V(1, this.Z);
        }
        if ((this.Y & 2) == 2) {
            mc4 mc4Var = this.f0;
            nv0Var.g0(2, 2);
            nv0Var.e0(mc4Var.size());
            nv0Var.a0(mc4Var);
        }
        nv0Var.a0(this.X);
    }

    public gy5() {
        this.g0 = (byte) -1;
        this.h0 = -1;
        this.X = jb0.X;
    }

    public gy5(wx5 wx5Var) {
        this.g0 = (byte) -1;
        this.h0 = -1;
        this.X = wx5Var.X;
    }
}
