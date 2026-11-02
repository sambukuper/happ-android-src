package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sz5 extends yp2 {
    public static final sz5 p0;
    public static final au3 q0 = new au3((byte) 25);
    public final jb0 Y;
    public int Z;
    public int f0;
    public int g0;
    public boolean h0;
    public rz5 i0;
    public List j0;
    public List k0;
    public int l0;
    public List m0;
    public byte n0;
    public int o0;

    static {
        sz5 sz5Var = new sz5();
        p0 = sz5Var;
        sz5Var.f0 = 0;
        sz5Var.g0 = 0;
        sz5Var.h0 = false;
        sz5Var.i0 = rz5.INV;
        List list = Collections.EMPTY_LIST;
        sz5Var.j0 = list;
        sz5Var.k0 = list;
        sz5Var.m0 = list;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    public sz5(iv0 iv0Var, r62 r62Var) {
        this.l0 = -1;
        this.n0 = (byte) -1;
        this.o0 = -1;
        this.f0 = 0;
        this.g0 = 0;
        this.h0 = false;
        rz5 rz5Var = rz5.INV;
        this.i0 = rz5Var;
        List list = Collections.EMPTY_LIST;
        this.j0 = list;
        this.k0 = list;
        this.m0 = list;
        ib0 ib0Var = new ib0();
        nv0 nv0VarG = nv0.G(ib0Var, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iN = iv0Var.n();
                        if (iN == 0) {
                            z = true;
                        } else if (iN == 8) {
                            this.Z |= 1;
                            this.f0 = iv0Var.k();
                        } else if (iN == 16) {
                            this.Z |= 2;
                            this.g0 = iv0Var.k();
                        } else if (iN == 24) {
                            this.Z |= 4;
                            this.h0 = iv0Var.l() != 0;
                        } else if (iN == 32) {
                            int iK = iv0Var.k();
                            rz5 rz5Var2 = iK != 0 ? iK != 1 ? iK != 2 ? null : rz5Var : rz5.OUT : rz5.IN;
                            if (rz5Var2 == null) {
                                nv0VarG.e0(iN);
                                nv0VarG.e0(iK);
                            } else {
                                this.Z |= 8;
                                this.i0 = rz5Var2;
                            }
                        } else if (iN == 42) {
                            if ((i & 16) != 16) {
                                this.j0 = new ArrayList();
                                i |= 16;
                            }
                            this.j0.add(iv0Var.g(nz5.x0, r62Var));
                        } else if (iN == 48) {
                            if ((i & 32) != 32) {
                                this.k0 = new ArrayList();
                                i |= 32;
                            }
                            this.k0.add(Integer.valueOf(iv0Var.k()));
                        } else if (iN == 50) {
                            int iE = iv0Var.e(iv0Var.k());
                            if ((i & 32) != 32 && iv0Var.c() > 0) {
                                this.k0 = new ArrayList();
                                i |= 32;
                            }
                            while (iv0Var.c() > 0) {
                                this.k0.add(Integer.valueOf(iv0Var.k()));
                            }
                            iv0Var.d(iE);
                        } else if (iN == 802) {
                            if ((i & 64) != 64) {
                                this.m0 = new ArrayList();
                                i |= 64;
                            }
                            this.m0.add(iv0Var.g(cy5.j0, r62Var));
                        } else if (!n(iv0Var, nv0VarG, r62Var, iN)) {
                            z = true;
                        }
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
                if ((i & 16) == 16) {
                    this.j0 = Collections.unmodifiableList(this.j0);
                }
                if ((i & 32) == 32) {
                    this.k0 = Collections.unmodifiableList(this.k0);
                }
                if ((i & 64) == 64) {
                    this.m0 = Collections.unmodifiableList(this.m0);
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
        }
        if ((i & 16) == 16) {
            this.j0 = Collections.unmodifiableList(this.j0);
        }
        if ((i & 32) == 32) {
            this.k0 = Collections.unmodifiableList(this.k0);
        }
        if ((i & 64) == 64) {
            this.m0 = Collections.unmodifiableList(this.m0);
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
        List list;
        int i = this.o0;
        if (i != -1) {
            return i;
        }
        int iL = (this.Z & 1) == 1 ? nv0.l(1, this.f0) : 0;
        if ((this.Z & 2) == 2) {
            iL += nv0.l(2, this.g0);
        }
        if ((this.Z & 4) == 4) {
            iL += nv0.r(3) + 1;
        }
        if ((this.Z & 8) == 8) {
            iL += nv0.k(4, this.i0.X);
        }
        for (int i2 = 0; i2 < this.j0.size(); i2++) {
            iL += nv0.n(5, (d2) this.j0.get(i2));
        }
        int i3 = 0;
        int iM = 0;
        while (true) {
            int size = this.k0.size();
            list = this.k0;
            if (i3 >= size) {
                break;
            }
            iM += nv0.m(((Integer) list.get(i3)).intValue());
            i3++;
        }
        int iN = iL + iM;
        if (!list.isEmpty()) {
            iN = iN + 1 + nv0.m(iM);
        }
        this.l0 = iM;
        for (int i4 = 0; i4 < this.m0.size(); i4++) {
            iN += nv0.n(100, (d2) this.m0.get(i4));
        }
        int size2 = this.Y.size() + j() + iN;
        this.o0 = size2;
        return size2;
    }

    @Override // defpackage.d2
    public final up2 c() {
        return qz5.h();
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
        if ((i & 1) != 1) {
            this.n0 = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.n0 = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.j0.size(); i2++) {
            if (!((nz5) this.j0.get(i2)).d()) {
                this.n0 = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.m0.size(); i3++) {
            if (!((cy5) this.m0.get(i3)).d()) {
                this.n0 = (byte) 0;
                return false;
            }
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
        qz5 qz5VarH = qz5.h();
        qz5VarH.i(this);
        return qz5VarH;
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
            boolean z = this.h0;
            nv0Var.g0(3, 0);
            nv0Var.Z(z ? 1 : 0);
        }
        if ((this.Z & 8) == 8) {
            nv0Var.U(4, this.i0.X);
        }
        for (int i = 0; i < this.j0.size(); i++) {
            nv0Var.X(5, (d2) this.j0.get(i));
        }
        if (this.k0.size() > 0) {
            nv0Var.e0(50);
            nv0Var.e0(this.l0);
        }
        for (int i2 = 0; i2 < this.k0.size(); i2++) {
            nv0Var.W(((Integer) this.k0.get(i2)).intValue());
        }
        for (int i3 = 0; i3 < this.m0.size(); i3++) {
            nv0Var.X(100, (d2) this.m0.get(i3));
        }
        mj0Var.b0(XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax, nv0Var);
        nv0Var.a0(this.Y);
    }

    public sz5() {
        this.l0 = -1;
        this.n0 = (byte) -1;
        this.o0 = -1;
        this.Y = jb0.X;
    }

    public sz5(qz5 qz5Var) {
        super(qz5Var);
        this.l0 = -1;
        this.n0 = (byte) -1;
        this.o0 = -1;
        this.Y = qz5Var.X;
    }
}
