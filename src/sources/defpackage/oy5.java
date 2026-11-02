package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oy5 extends bq2 {
    public static final oy5 l0;
    public static final au3 m0 = new au3((byte) 12);
    public final jb0 X;
    public int Y;
    public my5 Z;
    public List f0;
    public ty5 g0;
    public ny5 h0;
    public ly5 i0;
    public byte j0;
    public int k0;

    static {
        oy5 oy5Var = new oy5();
        l0 = oy5Var;
        oy5Var.Z = my5.RETURNS_CONSTANT;
        oy5Var.f0 = Collections.EMPTY_LIST;
        oy5Var.g0 = ty5.n0;
        oy5Var.h0 = ny5.AT_MOST_ONCE;
        oy5Var.i0 = ly5.CONCLUSION_CONDITION;
    }

    public oy5(iv0 iv0Var, r62 r62Var) {
        this.j0 = (byte) -1;
        this.k0 = -1;
        my5 my5Var = my5.RETURNS_CONSTANT;
        this.Z = my5Var;
        this.f0 = Collections.EMPTY_LIST;
        this.g0 = ty5.n0;
        ny5 ny5Var = ny5.AT_MOST_ONCE;
        this.h0 = ny5Var;
        ly5 ly5Var = ly5.CONCLUSION_CONDITION;
        this.i0 = ly5Var;
        ib0 ib0Var = new ib0();
        nv0 nv0VarG = nv0.G(ib0Var, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iN = iv0Var.n();
                    if (iN != 0) {
                        ly5 ly5Var2 = null;
                        my5 my5Var2 = null;
                        ry5 ry5VarG = null;
                        ny5 ny5Var2 = null;
                        if (iN == 8) {
                            int iK = iv0Var.k();
                            if (iK == 0) {
                                my5Var2 = my5Var;
                            } else if (iK == 1) {
                                my5Var2 = my5.CALLS;
                            } else if (iK == 2) {
                                my5Var2 = my5.RETURNS_NOT_NULL;
                            } else if (iK == 3) {
                                my5Var2 = my5.RETURNS_RESULT_OF;
                            }
                            if (my5Var2 == null) {
                                nv0VarG.e0(iN);
                                nv0VarG.e0(iK);
                            } else {
                                this.Y |= 1;
                                this.Z = my5Var2;
                            }
                        } else if (iN == 18) {
                            int i = (c == true ? 1 : 0) & 2;
                            c = c;
                            if (i != 2) {
                                this.f0 = new ArrayList();
                                c = 2;
                            }
                            this.f0.add(iv0Var.g(ty5.o0, r62Var));
                        } else if (iN == 26) {
                            if ((this.Y & 2) == 2) {
                                ty5 ty5Var = this.g0;
                                ty5Var.getClass();
                                ry5VarG = ry5.g();
                                ry5VarG.h(ty5Var);
                            }
                            ty5 ty5Var2 = (ty5) iv0Var.g(ty5.o0, r62Var);
                            this.g0 = ty5Var2;
                            if (ry5VarG != null) {
                                ry5VarG.h(ty5Var2);
                                this.g0 = ry5VarG.f();
                            }
                            this.Y |= 2;
                        } else if (iN == 32) {
                            int iK2 = iv0Var.k();
                            if (iK2 == 0) {
                                ny5Var2 = ny5Var;
                            } else if (iK2 == 1) {
                                ny5Var2 = ny5.EXACTLY_ONCE;
                            } else if (iK2 == 2) {
                                ny5Var2 = ny5.AT_LEAST_ONCE;
                            }
                            if (ny5Var2 == null) {
                                nv0VarG.e0(iN);
                                nv0VarG.e0(iK2);
                            } else {
                                this.Y |= 4;
                                this.h0 = ny5Var2;
                            }
                        } else if (iN == 40) {
                            int iK3 = iv0Var.k();
                            if (iK3 == 0) {
                                ly5Var2 = ly5Var;
                            } else if (iK3 == 1) {
                                ly5Var2 = ly5.RETURNS_CONDITION;
                            } else if (iK3 == 2) {
                                ly5Var2 = ly5.HOLDSIN_CONDITION;
                            }
                            if (ly5Var2 == null) {
                                nv0VarG.e0(iN);
                                nv0VarG.e0(iK3);
                            } else {
                                this.Y |= 8;
                                this.i0 = ly5Var2;
                            }
                        } else if (!iv0Var.q(iN, nv0VarG)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & 2) == 2) {
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
            } catch (rh3 e) {
                e.X = this;
                throw e;
            } catch (IOException e2) {
                rh3 rh3Var = new rh3(e2.getMessage());
                rh3Var.X = this;
                throw rh3Var;
            }
        }
        if (((c == true ? 1 : 0) & 2) == 2) {
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
        int i = this.k0;
        if (i != -1) {
            return i;
        }
        int iK = (this.Y & 1) == 1 ? nv0.k(1, this.Z.X) : 0;
        for (int i2 = 0; i2 < this.f0.size(); i2++) {
            iK += nv0.n(2, (d2) this.f0.get(i2));
        }
        if ((this.Y & 2) == 2) {
            iK += nv0.n(3, this.g0);
        }
        if ((this.Y & 4) == 4) {
            iK += nv0.k(4, this.h0.X);
        }
        if ((this.Y & 8) == 8) {
            iK += nv0.k(5, this.i0.X);
        }
        int size = this.X.size() + iK;
        this.k0 = size;
        return size;
    }

    @Override // defpackage.d2
    public final up2 c() {
        return eu3.i();
    }

    @Override // defpackage.ou4
    public final boolean d() {
        byte b = this.j0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f0.size(); i++) {
            if (!((ty5) this.f0.get(i)).d()) {
                this.j0 = (byte) 0;
                return false;
            }
        }
        if ((this.Y & 2) != 2 || this.g0.d()) {
            this.j0 = (byte) 1;
            return true;
        }
        this.j0 = (byte) 0;
        return false;
    }

    @Override // defpackage.d2
    public final up2 e() {
        eu3 eu3VarI = eu3.i();
        eu3VarI.k(this);
        return eu3VarI;
    }

    @Override // defpackage.d2
    public final void f(nv0 nv0Var) throws IOException {
        b();
        if ((this.Y & 1) == 1) {
            nv0Var.U(1, this.Z.X);
        }
        for (int i = 0; i < this.f0.size(); i++) {
            nv0Var.X(2, (d2) this.f0.get(i));
        }
        if ((this.Y & 2) == 2) {
            nv0Var.X(3, this.g0);
        }
        if ((this.Y & 4) == 4) {
            nv0Var.U(4, this.h0.X);
        }
        if ((this.Y & 8) == 8) {
            nv0Var.U(5, this.i0.X);
        }
        nv0Var.a0(this.X);
    }

    public oy5() {
        this.j0 = (byte) -1;
        this.k0 = -1;
        this.X = jb0.X;
    }

    public oy5(eu3 eu3Var) {
        this.j0 = (byte) -1;
        this.k0 = -1;
        this.X = eu3Var.X;
    }
}
