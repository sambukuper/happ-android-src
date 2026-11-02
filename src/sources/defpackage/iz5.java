package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class iz5 extends bq2 {
    public static final iz5 g0;
    public static final au3 h0 = new au3((byte) 21);
    public final jb0 X;
    public t74 Y;
    public byte Z;
    public int f0;

    static {
        iz5 iz5Var = new iz5();
        g0 = iz5Var;
        iz5Var.Y = s74.Y;
    }

    public iz5(iv0 iv0Var) {
        this.Z = (byte) -1;
        this.f0 = -1;
        this.Y = s74.Y;
        ib0 ib0Var = new ib0();
        nv0 nv0VarG = nv0.G(ib0Var, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iN = iv0Var.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            mc4 mc4VarF = iv0Var.f();
                            if (!z2) {
                                this.Y = new s74();
                                z2 = true;
                            }
                            this.Y.D(mc4VarF);
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
                if (z2) {
                    this.Y = this.Y.C();
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
        if (z2) {
            this.Y = this.Y.C();
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
        int i = this.f0;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int size = 0;
        while (true) {
            int size2 = this.Y.size();
            t74 t74Var = this.Y;
            if (i2 >= size2) {
                int size3 = this.X.size() + t74Var.size() + size;
                this.f0 = size3;
                return size3;
            }
            jb0 jb0VarU = t74Var.u(i2);
            size += jb0VarU.size() + nv0.p(jb0VarU.size());
            i2++;
        }
    }

    @Override // defpackage.d2
    public final up2 c() {
        jy5 jy5Var = new jy5((byte) 3);
        jy5Var.f0 = s74.Y;
        return jy5Var;
    }

    @Override // defpackage.ou4
    public final boolean d() {
        byte b = this.Z;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.Z = (byte) 1;
        return true;
    }

    @Override // defpackage.d2
    public final up2 e() {
        jy5 jy5Var = new jy5((byte) 3);
        jy5Var.f0 = s74.Y;
        jy5Var.l(this);
        return jy5Var;
    }

    @Override // defpackage.d2
    public final void f(nv0 nv0Var) throws IOException {
        b();
        for (int i = 0; i < this.Y.size(); i++) {
            jb0 jb0VarU = this.Y.u(i);
            nv0Var.g0(1, 2);
            nv0Var.e0(jb0VarU.size());
            nv0Var.a0(jb0VarU);
        }
        nv0Var.a0(this.X);
    }

    public iz5() {
        this.Z = (byte) -1;
        this.f0 = -1;
        this.X = jb0.X;
    }

    public iz5(jy5 jy5Var) {
        this.Z = (byte) -1;
        this.f0 = -1;
        this.X = jy5Var.X;
    }
}
