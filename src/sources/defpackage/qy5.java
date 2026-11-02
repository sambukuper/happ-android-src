package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qy5 extends yp2 {
    public static final qy5 j0;
    public static final au3 k0 = new au3((byte) 13);
    public final jb0 Y;
    public int Z;
    public int f0;
    public List g0;
    public byte h0;
    public int i0;

    static {
        qy5 qy5Var = new qy5();
        j0 = qy5Var;
        qy5Var.f0 = 0;
        qy5Var.g0 = Collections.EMPTY_LIST;
    }

    public qy5(iv0 iv0Var, r62 r62Var) {
        this.h0 = (byte) -1;
        this.i0 = -1;
        boolean z = false;
        this.f0 = 0;
        this.g0 = Collections.EMPTY_LIST;
        ib0 ib0Var = new ib0();
        nv0 nv0VarG = nv0.G(ib0Var, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iN = iv0Var.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.Z |= 1;
                                this.f0 = iv0Var.k();
                            } else if (iN == 18) {
                                if ((c & 2) != 2) {
                                    this.g0 = new ArrayList();
                                    c = 2;
                                }
                                this.g0.add(iv0Var.g(cy5.j0, r62Var));
                            } else if (!n(iv0Var, nv0VarG, r62Var, iN)) {
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
                if ((c & 2) == 2) {
                    this.g0 = Collections.unmodifiableList(this.g0);
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
        if ((c & 2) == 2) {
            this.g0 = Collections.unmodifiableList(this.g0);
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
        return j0;
    }

    @Override // defpackage.d2
    public final int b() {
        int i = this.i0;
        if (i != -1) {
            return i;
        }
        int iL = (this.Z & 1) == 1 ? nv0.l(1, this.f0) : 0;
        for (int i2 = 0; i2 < this.g0.size(); i2++) {
            iL += nv0.n(2, (d2) this.g0.get(i2));
        }
        int size = this.Y.size() + j() + iL;
        this.i0 = size;
        return size;
    }

    @Override // defpackage.d2
    public final up2 c() {
        py5 py5Var = new py5();
        py5Var.h0 = Collections.EMPTY_LIST;
        return py5Var;
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
        for (int i = 0; i < this.g0.size(); i++) {
            if (!((cy5) this.g0.get(i)).d()) {
                this.h0 = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.h0 = (byte) 1;
            return true;
        }
        this.h0 = (byte) 0;
        return false;
    }

    @Override // defpackage.d2
    public final up2 e() {
        py5 py5Var = new py5();
        py5Var.h0 = Collections.EMPTY_LIST;
        py5Var.h(this);
        return py5Var;
    }

    @Override // defpackage.d2
    public final void f(nv0 nv0Var) throws IOException {
        b();
        mj0 mj0Var = new mj0(this);
        if ((this.Z & 1) == 1) {
            nv0Var.V(1, this.f0);
        }
        for (int i = 0; i < this.g0.size(); i++) {
            nv0Var.X(2, (d2) this.g0.get(i));
        }
        mj0Var.b0(MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE, nv0Var);
        nv0Var.a0(this.Y);
    }

    public qy5() {
        this.h0 = (byte) -1;
        this.i0 = -1;
        this.Y = jb0.X;
    }

    public qy5(py5 py5Var) {
        super(py5Var);
        this.h0 = (byte) -1;
        this.i0 = -1;
        this.Y = py5Var.X;
    }
}
