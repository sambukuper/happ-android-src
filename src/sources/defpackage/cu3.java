package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cu3 extends bq2 {
    public static final cu3 i0;
    public static final au3 j0 = new au3((byte) 0);
    public final jb0 X;
    public int Y;
    public int Z;
    public int f0;
    public byte g0;
    public int h0;

    static {
        cu3 cu3Var = new cu3();
        i0 = cu3Var;
        cu3Var.Z = 0;
        cu3Var.f0 = 0;
    }

    public cu3(iv0 iv0Var) {
        this.g0 = (byte) -1;
        this.h0 = -1;
        boolean z = false;
        this.Z = 0;
        this.f0 = 0;
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
                        } else if (!iv0Var.q(iN, nv0VarG)) {
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
        int i = this.h0;
        if (i != -1) {
            return i;
        }
        int iL = (this.Y & 1) == 1 ? nv0.l(1, this.Z) : 0;
        if ((this.Y & 2) == 2) {
            iL += nv0.l(2, this.f0);
        }
        int size = this.X.size() + iL;
        this.h0 = size;
        return size;
    }

    @Override // defpackage.d2
    public final up2 c() {
        return new bu3((byte) 0);
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
        this.g0 = (byte) 1;
        return true;
    }

    @Override // defpackage.d2
    public final up2 e() {
        bu3 bu3Var = new bu3((byte) 0);
        bu3Var.h(this);
        return bu3Var;
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
        nv0Var.a0(this.X);
    }

    public cu3() {
        this.g0 = (byte) -1;
        this.h0 = -1;
        this.X = jb0.X;
    }

    public cu3(bu3 bu3Var) {
        this.g0 = (byte) -1;
        this.h0 = -1;
        this.X = bu3Var.X;
    }
}
