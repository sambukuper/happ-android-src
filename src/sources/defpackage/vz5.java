package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vz5 extends yp2 {
    public static final vz5 p0;
    public static final au3 q0 = new au3((byte) 27);
    public final jb0 Y;
    public int Z;
    public int f0;
    public int g0;
    public nz5 h0;
    public int i0;
    public nz5 j0;
    public int k0;
    public List l0;
    public zx5 m0;
    public byte n0;
    public int o0;

    static {
        vz5 vz5Var = new vz5();
        p0 = vz5Var;
        vz5Var.f0 = 0;
        vz5Var.g0 = 0;
        nz5 nz5Var = nz5.w0;
        vz5Var.h0 = nz5Var;
        vz5Var.i0 = 0;
        vz5Var.j0 = nz5Var;
        vz5Var.k0 = 0;
        vz5Var.l0 = Collections.EMPTY_LIST;
        vz5Var.m0 = zx5.r0;
    }

    public vz5(iv0 iv0Var, r62 r62Var) {
        this.n0 = (byte) -1;
        this.o0 = -1;
        boolean z = false;
        this.f0 = 0;
        this.g0 = 0;
        nz5 nz5Var = nz5.w0;
        this.h0 = nz5Var;
        this.i0 = 0;
        this.j0 = nz5Var;
        this.k0 = 0;
        this.l0 = Collections.EMPTY_LIST;
        this.m0 = zx5.r0;
        ib0 ib0Var = new ib0();
        nv0 nv0VarG = nv0.G(ib0Var, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = iv0Var.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.Z |= 1;
                            this.f0 = iv0Var.k();
                        } else if (iN != 16) {
                            xx5 xx5VarG = null;
                            mz5 mz5VarR = null;
                            mz5 mz5VarR2 = null;
                            if (iN == 26) {
                                if ((this.Z & 4) == 4) {
                                    nz5 nz5Var2 = this.h0;
                                    nz5Var2.getClass();
                                    mz5VarR = nz5.r(nz5Var2);
                                }
                                nz5 nz5Var3 = (nz5) iv0Var.g(nz5.x0, r62Var);
                                this.h0 = nz5Var3;
                                if (mz5VarR != null) {
                                    mz5VarR.i(nz5Var3);
                                    this.h0 = mz5VarR.g();
                                }
                                this.Z |= 4;
                            } else if (iN == 34) {
                                if ((this.Z & 16) == 16) {
                                    nz5 nz5Var4 = this.j0;
                                    nz5Var4.getClass();
                                    mz5VarR2 = nz5.r(nz5Var4);
                                }
                                nz5 nz5Var5 = (nz5) iv0Var.g(nz5.x0, r62Var);
                                this.j0 = nz5Var5;
                                if (mz5VarR2 != null) {
                                    mz5VarR2.i(nz5Var5);
                                    this.j0 = mz5VarR2.g();
                                }
                                this.Z |= 16;
                            } else if (iN == 40) {
                                this.Z |= 8;
                                this.i0 = iv0Var.k();
                            } else if (iN == 48) {
                                this.Z |= 32;
                                this.k0 = iv0Var.k();
                            } else if (iN == 58) {
                                int i = (c == true ? 1 : 0) & '@';
                                c = c;
                                if (i != 64) {
                                    this.l0 = new ArrayList();
                                    c = '@';
                                }
                                this.l0.add(iv0Var.g(cy5.j0, r62Var));
                            } else if (iN == 66) {
                                if ((this.Z & 64) == 64) {
                                    zx5 zx5Var = this.m0;
                                    zx5Var.getClass();
                                    xx5VarG = xx5.g();
                                    xx5VarG.h(zx5Var);
                                }
                                zx5 zx5Var2 = (zx5) iv0Var.g(zx5.s0, r62Var);
                                this.m0 = zx5Var2;
                                if (xx5VarG != null) {
                                    xx5VarG.h(zx5Var2);
                                    this.m0 = xx5VarG.f();
                                }
                                this.Z |= 64;
                            } else if (!n(iv0Var, nv0VarG, r62Var, iN)) {
                            }
                        } else {
                            this.Z |= 2;
                            this.g0 = iv0Var.k();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & '@') == 64) {
                        this.l0 = Collections.unmodifiableList(this.l0);
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
        if (((c == true ? 1 : 0) & '@') == 64) {
            this.l0 = Collections.unmodifiableList(this.l0);
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
        return p0;
    }

    @Override // defpackage.d2
    public final int b() {
        int i = this.o0;
        if (i != -1) {
            return i;
        }
        int iL = (this.Z & 1) == 1 ? nv0.l(1, this.f0) : 0;
        if ((this.Z & 2) == 2) {
            iL += nv0.l(2, this.g0);
        }
        if ((this.Z & 4) == 4) {
            iL += nv0.n(3, this.h0);
        }
        if ((this.Z & 16) == 16) {
            iL += nv0.n(4, this.j0);
        }
        if ((this.Z & 8) == 8) {
            iL += nv0.l(5, this.i0);
        }
        if ((this.Z & 32) == 32) {
            iL += nv0.l(6, this.k0);
        }
        for (int i2 = 0; i2 < this.l0.size(); i2++) {
            iL += nv0.n(7, (d2) this.l0.get(i2));
        }
        if ((this.Z & 64) == 64) {
            iL += nv0.n(8, this.m0);
        }
        int size = this.Y.size() + j() + iL;
        this.o0 = size;
        return size;
    }

    @Override // defpackage.d2
    public final up2 c() {
        return uz5.h();
    }

    @Override // defpackage.ou4
    public final boolean d() {
        byte b = this.n0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.Z;
        if ((i & 2) != 2) {
            this.n0 = (byte) 0;
            return false;
        }
        if ((i & 4) == 4 && !this.h0.d()) {
            this.n0 = (byte) 0;
            return false;
        }
        if ((this.Z & 16) == 16 && !this.j0.d()) {
            this.n0 = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.l0.size(); i2++) {
            if (!((cy5) this.l0.get(i2)).d()) {
                this.n0 = (byte) 0;
                return false;
            }
        }
        if ((this.Z & 64) == 64 && !this.m0.d()) {
            this.n0 = (byte) 0;
            return false;
        }
        if (i()) {
            this.n0 = (byte) 1;
            return true;
        }
        this.n0 = (byte) 0;
        return false;
    }

    @Override // defpackage.d2
    public final up2 e() {
        uz5 uz5VarH = uz5.h();
        uz5VarH.i(this);
        return uz5VarH;
    }

    @Override // defpackage.d2
    public final void f(nv0 nv0Var) throws IOException {
        b();
        mj0 mj0Var = new mj0(this);
        if ((this.Z & 1) == 1) {
            nv0Var.V(1, this.f0);
        }
        if ((this.Z & 2) == 2) {
            nv0Var.V(2, this.g0);
        }
        if ((this.Z & 4) == 4) {
            nv0Var.X(3, this.h0);
        }
        if ((this.Z & 16) == 16) {
            nv0Var.X(4, this.j0);
        }
        if ((this.Z & 8) == 8) {
            nv0Var.V(5, this.i0);
        }
        if ((this.Z & 32) == 32) {
            nv0Var.V(6, this.k0);
        }
        for (int i = 0; i < this.l0.size(); i++) {
            nv0Var.X(7, (d2) this.l0.get(i));
        }
        if ((this.Z & 64) == 64) {
            nv0Var.X(8, this.m0);
        }
        mj0Var.b0(MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE, nv0Var);
        nv0Var.a0(this.Y);
    }

    public vz5() {
        this.n0 = (byte) -1;
        this.o0 = -1;
        this.Y = jb0.X;
    }

    public vz5(uz5 uz5Var) {
        super(uz5Var);
        this.n0 = (byte) -1;
        this.o0 = -1;
        this.Y = uz5Var.X;
    }
}
