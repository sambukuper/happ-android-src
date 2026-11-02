package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ku3 extends bq2 {
    public static final ku3 i0;
    public static final au3 j0 = new au3((byte) 3);
    public final jb0 X;
    public List Y;
    public List Z;
    public int f0;
    public byte g0;
    public int h0;

    static {
        ku3 ku3Var = new ku3();
        i0 = ku3Var;
        List list = Collections.EMPTY_LIST;
        ku3Var.Y = list;
        ku3Var.Z = list;
    }

    public ku3(iv0 iv0Var, r62 r62Var) {
        this.f0 = -1;
        this.g0 = (byte) -1;
        this.h0 = -1;
        List list = Collections.EMPTY_LIST;
        this.Y = list;
        this.Z = list;
        ib0 ib0Var = new ib0();
        nv0 nv0VarG = nv0.G(ib0Var, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = iv0Var.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if ((i & 1) != 1) {
                                this.Y = new ArrayList();
                                i |= 1;
                            }
                            this.Y.add(iv0Var.g(ju3.p0, r62Var));
                        } else if (iN == 40) {
                            if ((i & 2) != 2) {
                                this.Z = new ArrayList();
                                i |= 2;
                            }
                            this.Z.add(Integer.valueOf(iv0Var.k()));
                        } else if (iN == 42) {
                            int iE = iv0Var.e(iv0Var.k());
                            if ((i & 2) != 2 && iv0Var.c() > 0) {
                                this.Z = new ArrayList();
                                i |= 2;
                            }
                            while (iv0Var.c() > 0) {
                                this.Z.add(Integer.valueOf(iv0Var.k()));
                            }
                            iv0Var.d(iE);
                        } else if (!iv0Var.q(iN, nv0VarG)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 1) == 1) {
                        this.Y = Collections.unmodifiableList(this.Y);
                    }
                    if ((i & 2) == 2) {
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
            } catch (rh3 e) {
                e.X = this;
                throw e;
            } catch (IOException e2) {
                rh3 rh3Var = new rh3(e2.getMessage());
                rh3Var.X = this;
                throw rh3Var;
            }
        }
        if ((i & 1) == 1) {
            this.Y = Collections.unmodifiableList(this.Y);
        }
        if ((i & 2) == 2) {
            this.Z = Collections.unmodifiableList(this.Z);
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
        List list;
        int i = this.h0;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int iN = 0;
        for (int i3 = 0; i3 < this.Y.size(); i3++) {
            iN += nv0.n(1, (d2) this.Y.get(i3));
        }
        int iM = 0;
        while (true) {
            int size = this.Z.size();
            list = this.Z;
            if (i2 >= size) {
                break;
            }
            iM += nv0.m(((Integer) list.get(i2)).intValue());
            i2++;
        }
        int iM2 = iN + iM;
        if (!list.isEmpty()) {
            iM2 = iM2 + 1 + nv0.m(iM);
        }
        this.f0 = iM;
        int size2 = this.X.size() + iM2;
        this.h0 = size2;
        return size2;
    }

    @Override // defpackage.d2
    public final up2 c() {
        gu3 gu3Var = new gu3();
        List list = Collections.EMPTY_LIST;
        gu3Var.Z = list;
        gu3Var.f0 = list;
        return gu3Var;
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
        gu3 gu3Var = new gu3();
        List list = Collections.EMPTY_LIST;
        gu3Var.Z = list;
        gu3Var.f0 = list;
        gu3Var.g(this);
        return gu3Var;
    }

    @Override // defpackage.d2
    public final void f(nv0 nv0Var) throws IOException {
        b();
        for (int i = 0; i < this.Y.size(); i++) {
            nv0Var.X(1, (d2) this.Y.get(i));
        }
        if (this.Z.size() > 0) {
            nv0Var.e0(42);
            nv0Var.e0(this.f0);
        }
        for (int i2 = 0; i2 < this.Z.size(); i2++) {
            nv0Var.W(((Integer) this.Z.get(i2)).intValue());
        }
        nv0Var.a0(this.X);
    }

    public ku3() {
        this.f0 = -1;
        this.g0 = (byte) -1;
        this.h0 = -1;
        this.X = jb0.X;
    }

    public ku3(gu3 gu3Var) {
        this.f0 = -1;
        this.g0 = (byte) -1;
        this.h0 = -1;
        this.X = gu3Var.X;
    }
}
