package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cy5 extends bq2 {
    public static final cy5 i0;
    public static final au3 j0 = new au3((byte) 5);
    public final jb0 X;
    public int Y;
    public int Z;
    public List f0;
    public byte g0;
    public int h0;

    static {
        cy5 cy5Var = new cy5();
        i0 = cy5Var;
        cy5Var.Z = 0;
        cy5Var.f0 = Collections.EMPTY_LIST;
    }

    public cy5(iv0 iv0Var, r62 r62Var) {
        this.g0 = (byte) -1;
        this.h0 = -1;
        boolean z = false;
        this.Z = 0;
        this.f0 = Collections.EMPTY_LIST;
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
                                this.Y |= 1;
                                this.Z = iv0Var.k();
                            } else if (iN == 18) {
                                if ((c & 2) != 2) {
                                    this.f0 = new ArrayList();
                                    c = 2;
                                }
                                this.f0.add(iv0Var.g(ay5.j0, r62Var));
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
                if ((c & 2) == 2) {
                    this.f0 = Collections.unmodifiableList(this.f0);
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
        if ((c & 2) == 2) {
            this.f0 = Collections.unmodifiableList(this.f0);
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
        for (int i2 = 0; i2 < this.f0.size(); i2++) {
            iL += nv0.n(2, (d2) this.f0.get(i2));
        }
        int size = this.X.size() + iL;
        this.h0 = size;
        return size;
    }

    @Override // defpackage.d2
    public final up2 c() {
        by5 by5Var = new by5((byte) 0);
        by5Var.f0 = Collections.EMPTY_LIST;
        return by5Var;
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
        if ((this.Y & 1) != 1) {
            this.g0 = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f0.size(); i++) {
            if (!((ay5) this.f0.get(i)).d()) {
                this.g0 = (byte) 0;
                return false;
            }
        }
        this.g0 = (byte) 1;
        return true;
    }

    @Override // defpackage.d2
    public final up2 e() {
        by5 by5Var = new by5((byte) 0);
        by5Var.f0 = Collections.EMPTY_LIST;
        by5Var.h(this);
        return by5Var;
    }

    @Override // defpackage.d2
    public final void f(nv0 nv0Var) throws IOException {
        b();
        if ((this.Y & 1) == 1) {
            nv0Var.V(1, this.Z);
        }
        for (int i = 0; i < this.f0.size(); i++) {
            nv0Var.X(2, (d2) this.f0.get(i));
        }
        nv0Var.a0(this.X);
    }

    public cy5() {
        this.g0 = (byte) -1;
        this.h0 = -1;
        this.X = jb0.X;
    }

    public cy5(by5 by5Var) {
        this.g0 = (byte) -1;
        this.h0 = -1;
        this.X = by5Var.X;
    }
}
