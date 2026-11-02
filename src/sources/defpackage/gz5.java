package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gz5 extends bq2 {
    public static final gz5 g0;
    public static final au3 h0 = new au3((byte) 19);
    public final jb0 X;
    public List Y;
    public byte Z;
    public int f0;

    static {
        gz5 gz5Var = new gz5();
        g0 = gz5Var;
        gz5Var.Y = Collections.EMPTY_LIST;
    }

    public gz5(iv0 iv0Var, r62 r62Var) {
        this.Z = (byte) -1;
        this.f0 = -1;
        this.Y = Collections.EMPTY_LIST;
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
                            if (!z2) {
                                this.Y = new ArrayList();
                                z2 = true;
                            }
                            this.Y.add(iv0Var.g(fz5.k0, r62Var));
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
                    this.Y = Collections.unmodifiableList(this.Y);
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
            this.Y = Collections.unmodifiableList(this.Y);
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
        int iN = 0;
        for (int i2 = 0; i2 < this.Y.size(); i2++) {
            iN += nv0.n(1, (d2) this.Y.get(i2));
        }
        int size = this.X.size() + iN;
        this.f0 = size;
        return size;
    }

    @Override // defpackage.d2
    public final up2 c() {
        jy5 jy5Var = new jy5((byte) 1);
        jy5Var.f0 = Collections.EMPTY_LIST;
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
        for (int i = 0; i < this.Y.size(); i++) {
            if (!((fz5) this.Y.get(i)).d()) {
                this.Z = (byte) 0;
                return false;
            }
        }
        this.Z = (byte) 1;
        return true;
    }

    @Override // defpackage.d2
    public final up2 e() {
        jy5 jy5Var = new jy5((byte) 1);
        jy5Var.f0 = Collections.EMPTY_LIST;
        jy5Var.k(this);
        return jy5Var;
    }

    @Override // defpackage.d2
    public final void f(nv0 nv0Var) throws IOException {
        b();
        for (int i = 0; i < this.Y.size(); i++) {
            nv0Var.X(1, (d2) this.Y.get(i));
        }
        nv0Var.a0(this.X);
    }

    public gz5() {
        this.Z = (byte) -1;
        this.f0 = -1;
        this.X = jb0.X;
    }

    public gz5(jy5 jy5Var) {
        this.Z = (byte) -1;
        this.f0 = -1;
        this.X = jy5Var.X;
    }
}
