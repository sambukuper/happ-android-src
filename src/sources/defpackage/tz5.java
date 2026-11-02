package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tz5 extends bq2 {
    public static final tz5 i0;
    public static final au3 j0 = new au3((byte) 26);
    public final jb0 X;
    public int Y;
    public List Z;
    public int f0;
    public byte g0;
    public int h0;

    static {
        tz5 tz5Var = new tz5();
        i0 = tz5Var;
        tz5Var.Z = Collections.EMPTY_LIST;
        tz5Var.f0 = -1;
    }

    public tz5(iv0 iv0Var, r62 r62Var) {
        this.g0 = (byte) -1;
        this.h0 = -1;
        this.Z = Collections.EMPTY_LIST;
        this.f0 = -1;
        ib0 ib0Var = new ib0();
        nv0 nv0VarG = nv0.G(ib0Var, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int iN = iv0Var.n();
                        if (iN != 0) {
                            if (iN == 10) {
                                if (!z2) {
                                    this.Z = new ArrayList();
                                    z2 = true;
                                }
                                this.Z.add(iv0Var.g(nz5.x0, r62Var));
                            } else if (iN == 16) {
                                this.Y |= 1;
                                this.f0 = iv0Var.k();
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
                if (z2) {
                    this.Z = Collections.unmodifiableList(this.Z);
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
            this.Z = Collections.unmodifiableList(this.Z);
        }
        try {
            nv0VarG.R();
        } catch (IOException unused2) {
        } finally {
            this.X = ib0Var.m();
        }
    }

    public static by5 i(tz5 tz5Var) {
        by5 by5Var = new by5((byte) 1);
        by5Var.f0 = Collections.EMPTY_LIST;
        by5Var.g0 = -1;
        by5Var.i(tz5Var);
        return by5Var;
    }

    @Override // defpackage.d2
    public final int b() {
        int i = this.h0;
        if (i != -1) {
            return i;
        }
        int iL = 0;
        for (int i2 = 0; i2 < this.Z.size(); i2++) {
            iL += nv0.n(1, (d2) this.Z.get(i2));
        }
        if ((this.Y & 1) == 1) {
            iL += nv0.l(2, this.f0);
        }
        int size = this.X.size() + iL;
        this.h0 = size;
        return size;
    }

    @Override // defpackage.d2
    public final up2 c() {
        by5 by5Var = new by5((byte) 1);
        by5Var.f0 = Collections.EMPTY_LIST;
        by5Var.g0 = -1;
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
        for (int i = 0; i < this.Z.size(); i++) {
            if (!((nz5) this.Z.get(i)).d()) {
                this.g0 = (byte) 0;
                return false;
            }
        }
        this.g0 = (byte) 1;
        return true;
    }

    @Override // defpackage.d2
    public final up2 e() {
        return i(this);
    }

    @Override // defpackage.d2
    public final void f(nv0 nv0Var) throws IOException {
        b();
        for (int i = 0; i < this.Z.size(); i++) {
            nv0Var.X(1, (d2) this.Z.get(i));
        }
        if ((this.Y & 1) == 1) {
            nv0Var.V(2, this.f0);
        }
        nv0Var.a0(this.X);
    }

    public tz5() {
        this.g0 = (byte) -1;
        this.h0 = -1;
        this.X = jb0.X;
    }

    public tz5(by5 by5Var) {
        this.g0 = (byte) -1;
        this.h0 = -1;
        this.X = by5Var.X;
    }
}
