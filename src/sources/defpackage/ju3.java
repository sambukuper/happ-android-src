package defpackage;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ju3 extends bq2 {
    public static final ju3 o0;
    public static final au3 p0 = new au3((byte) 4);
    public final jb0 X;
    public int Y;
    public int Z;
    public int f0;
    public Object g0;
    public iu3 h0;
    public List i0;
    public int j0;
    public List k0;
    public int l0;
    public byte m0;
    public int n0;

    static {
        ju3 ju3Var = new ju3();
        o0 = ju3Var;
        ju3Var.Z = 1;
        ju3Var.f0 = 0;
        ju3Var.g0 = _UrlKt.FRAGMENT_ENCODE_SET;
        ju3Var.h0 = iu3.NONE;
        List list = Collections.EMPTY_LIST;
        ju3Var.i0 = list;
        ju3Var.k0 = list;
    }

    public ju3(iv0 iv0Var) {
        this.j0 = -1;
        this.l0 = -1;
        this.m0 = (byte) -1;
        this.n0 = -1;
        this.Z = 1;
        boolean z = false;
        this.f0 = 0;
        this.g0 = _UrlKt.FRAGMENT_ENCODE_SET;
        iu3 iu3Var = iu3.NONE;
        this.h0 = iu3Var;
        List list = Collections.EMPTY_LIST;
        this.i0 = list;
        this.k0 = list;
        ib0 ib0Var = new ib0();
        nv0 nv0VarG = nv0.G(ib0Var, 1);
        int i = 0;
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
                        } else if (iN == 24) {
                            int iK = iv0Var.k();
                            iu3 iu3Var2 = iK != 0 ? iK != 1 ? iK != 2 ? null : iu3.DESC_TO_CLASS_ID : iu3.INTERNAL_TO_CLASS_ID : iu3Var;
                            if (iu3Var2 == null) {
                                nv0VarG.e0(iN);
                                nv0VarG.e0(iK);
                            } else {
                                this.Y |= 8;
                                this.h0 = iu3Var2;
                            }
                        } else if (iN == 32) {
                            if ((i & 16) != 16) {
                                this.i0 = new ArrayList();
                                i |= 16;
                            }
                            this.i0.add(Integer.valueOf(iv0Var.k()));
                        } else if (iN == 34) {
                            int iE = iv0Var.e(iv0Var.k());
                            if ((i & 16) != 16 && iv0Var.c() > 0) {
                                this.i0 = new ArrayList();
                                i |= 16;
                            }
                            while (iv0Var.c() > 0) {
                                this.i0.add(Integer.valueOf(iv0Var.k()));
                            }
                            iv0Var.d(iE);
                        } else if (iN == 40) {
                            if ((i & 32) != 32) {
                                this.k0 = new ArrayList();
                                i |= 32;
                            }
                            this.k0.add(Integer.valueOf(iv0Var.k()));
                        } else if (iN == 42) {
                            int iE2 = iv0Var.e(iv0Var.k());
                            if ((i & 32) != 32 && iv0Var.c() > 0) {
                                this.k0 = new ArrayList();
                                i |= 32;
                            }
                            while (iv0Var.c() > 0) {
                                this.k0.add(Integer.valueOf(iv0Var.k()));
                            }
                            iv0Var.d(iE2);
                        } else if (iN == 50) {
                            mc4 mc4VarF = iv0Var.f();
                            this.Y |= 4;
                            this.g0 = mc4VarF;
                        } else if (!iv0Var.q(iN, nv0VarG)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 16) == 16) {
                        this.i0 = Collections.unmodifiableList(this.i0);
                    }
                    if ((i & 32) == 32) {
                        this.k0 = Collections.unmodifiableList(this.k0);
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
        if ((i & 16) == 16) {
            this.i0 = Collections.unmodifiableList(this.i0);
        }
        if ((i & 32) == 32) {
            this.k0 = Collections.unmodifiableList(this.k0);
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
        List list2;
        jb0 mc4Var;
        int i = this.n0;
        if (i != -1) {
            return i;
        }
        int iL = (this.Y & 1) == 1 ? nv0.l(1, this.Z) : 0;
        if ((this.Y & 2) == 2) {
            iL += nv0.l(2, this.f0);
        }
        if ((this.Y & 8) == 8) {
            iL += nv0.k(3, this.h0.X);
        }
        int i2 = 0;
        int iM = 0;
        while (true) {
            int size = this.i0.size();
            list = this.i0;
            if (i2 >= size) {
                break;
            }
            iM += nv0.m(((Integer) list.get(i2)).intValue());
            i2++;
        }
        int iM2 = iL + iM;
        if (!list.isEmpty()) {
            iM2 = iM2 + 1 + nv0.m(iM);
        }
        this.j0 = iM;
        int i3 = 0;
        int iM3 = 0;
        while (true) {
            int size2 = this.k0.size();
            list2 = this.k0;
            if (i3 >= size2) {
                break;
            }
            iM3 += nv0.m(((Integer) list2.get(i3)).intValue());
            i3++;
        }
        int size3 = iM2 + iM3;
        if (!list2.isEmpty()) {
            size3 = size3 + 1 + nv0.m(iM3);
        }
        this.l0 = iM3;
        if ((this.Y & 4) == 4) {
            Object obj = this.g0;
            if (obj instanceof String) {
                try {
                    mc4Var = new mc4(((String) obj).getBytes("UTF-8"));
                    this.g0 = mc4Var;
                } catch (UnsupportedEncodingException e) {
                    xw3.o("UTF-8 not supported?", e);
                    return 0;
                }
            } else {
                mc4Var = (jb0) obj;
            }
            size3 += mc4Var.size() + nv0.p(mc4Var.size()) + nv0.r(6);
        }
        int size4 = this.X.size() + size3;
        this.n0 = size4;
        return size4;
    }

    @Override // defpackage.d2
    public final up2 c() {
        return hu3.g();
    }

    @Override // defpackage.ou4
    public final boolean d() {
        byte b = this.m0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.m0 = (byte) 1;
        return true;
    }

    @Override // defpackage.d2
    public final up2 e() {
        hu3 hu3VarG = hu3.g();
        hu3VarG.h(this);
        return hu3VarG;
    }

    @Override // defpackage.d2
    public final void f(nv0 nv0Var) throws IOException {
        jb0 mc4Var;
        b();
        if ((this.Y & 1) == 1) {
            nv0Var.V(1, this.Z);
        }
        if ((this.Y & 2) == 2) {
            nv0Var.V(2, this.f0);
        }
        if ((this.Y & 8) == 8) {
            nv0Var.U(3, this.h0.X);
        }
        if (this.i0.size() > 0) {
            nv0Var.e0(34);
            nv0Var.e0(this.j0);
        }
        for (int i = 0; i < this.i0.size(); i++) {
            nv0Var.W(((Integer) this.i0.get(i)).intValue());
        }
        if (this.k0.size() > 0) {
            nv0Var.e0(42);
            nv0Var.e0(this.l0);
        }
        for (int i2 = 0; i2 < this.k0.size(); i2++) {
            nv0Var.W(((Integer) this.k0.get(i2)).intValue());
        }
        if ((this.Y & 4) == 4) {
            Object obj = this.g0;
            if (obj instanceof String) {
                try {
                    mc4Var = new mc4(((String) obj).getBytes("UTF-8"));
                    this.g0 = mc4Var;
                } catch (UnsupportedEncodingException e) {
                    xw3.o("UTF-8 not supported?", e);
                    return;
                }
            } else {
                mc4Var = (jb0) obj;
            }
            nv0Var.g0(6, 2);
            nv0Var.e0(mc4Var.size());
            nv0Var.a0(mc4Var);
        }
        nv0Var.a0(this.X);
    }

    public ju3() {
        this.j0 = -1;
        this.l0 = -1;
        this.m0 = (byte) -1;
        this.n0 = -1;
        this.X = jb0.X;
    }

    public ju3(hu3 hu3Var) {
        this.j0 = -1;
        this.l0 = -1;
        this.m0 = (byte) -1;
        this.n0 = -1;
        this.X = hu3Var.X;
    }
}
