package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ka4 {
    public static boolean q = false;
    public final gu5 d;
    public final lr m;
    public zt p;
    public int a = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
    public boolean b = false;
    public int c = 0;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public ge7[] n = new ge7[XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax];
    public int o = 0;
    public zt[] g = new zt[32];

    public ka4() {
        s();
        lr lrVar = new lr((byte) 13, false);
        lrVar.Y = new er5();
        lrVar.Z = new er5();
        lrVar.f0 = new ge7[32];
        this.m = lrVar;
        gu5 gu5Var = new gu5(lrVar);
        gu5Var.f = new ge7[128];
        gu5Var.g = new ge7[128];
        gu5Var.h = 0;
        gu5Var.i = new zz2((Object) gu5Var, (byte) 24);
        this.d = gu5Var;
        this.p = new zt(lrVar);
    }

    public static int n(Object obj) {
        ge7 ge7Var = ((u21) obj).i;
        if (ge7Var != null) {
            return (int) (ge7Var.g0 + 0.5f);
        }
        return 0;
    }

    public final ge7 a(int i) {
        er5 er5Var = (er5) this.m.Z;
        int i2 = er5Var.b;
        Object obj = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = er5Var.a;
            Object obj2 = objArr[i3];
            objArr[i3] = null;
            er5Var.b = i3;
            obj = obj2;
        }
        ge7 ge7Var = (ge7) obj;
        if (ge7Var == null) {
            ge7Var = new ge7(i);
            ge7Var.n0 = i;
        } else {
            ge7Var.c();
            ge7Var.n0 = i;
        }
        int i4 = this.o;
        int i5 = this.a;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.a = i6;
            this.n = (ge7[]) Arrays.copyOf(this.n, i6);
        }
        ge7[] ge7VarArr = this.n;
        int i7 = this.o;
        this.o = i7 + 1;
        ge7VarArr[i7] = ge7Var;
        return ge7Var;
    }

    public final void b(ge7 ge7Var, ge7 ge7Var2, int i, float f, ge7 ge7Var3, ge7 ge7Var4, int i2, int i3) {
        zt ztVarL = l();
        if (ge7Var2 == ge7Var3) {
            ztVarL.d.g(ge7Var, 1.0f);
            ztVarL.d.g(ge7Var4, 1.0f);
            ztVarL.d.g(ge7Var2, -2.0f);
        } else {
            mt mtVar = ztVarL.d;
            if (f == 0.5f) {
                mtVar.g(ge7Var, 1.0f);
                ztVarL.d.g(ge7Var2, -1.0f);
                ztVarL.d.g(ge7Var3, -1.0f);
                ztVarL.d.g(ge7Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    ztVarL.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                mtVar.g(ge7Var, -1.0f);
                ztVarL.d.g(ge7Var2, 1.0f);
                ztVarL.b = i;
            } else if (f >= 1.0f) {
                mtVar.g(ge7Var4, -1.0f);
                ztVarL.d.g(ge7Var3, 1.0f);
                ztVarL.b = -i2;
            } else {
                float f2 = 1.0f - f;
                mtVar.g(ge7Var, f2 * 1.0f);
                ztVarL.d.g(ge7Var2, f2 * (-1.0f));
                ztVarL.d.g(ge7Var3, (-1.0f) * f);
                ztVarL.d.g(ge7Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    ztVarL.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            ztVarL.a(this, i3);
        }
        c(ztVarL);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f5  */
    public final void c(zt ztVar) {
        boolean z;
        boolean z2;
        ge7 ge7VarF;
        if (this.k + 1 >= this.l || this.j + 1 >= this.f) {
            o();
        }
        if (ztVar.e) {
            z = false;
        } else {
            ArrayList arrayList = ztVar.c;
            if (this.g.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iD = ztVar.d.d();
                    for (int i = 0; i < iD; i++) {
                        ge7 ge7VarE = ztVar.d.e(i);
                        if (ge7VarE.Z != -1 || ge7VarE.h0) {
                            arrayList.add(ge7VarE);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            ge7 ge7Var = (ge7) arrayList.get(i2);
                            if (ge7Var.h0) {
                                ztVar.h(this, ge7Var, true);
                            } else {
                                ztVar.i(this, this.g[ge7Var.Z], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (ztVar.a != null && ztVar.d.d() == 0) {
                    ztVar.e = true;
                    this.b = true;
                }
            }
            if (ztVar.e()) {
                return;
            }
            float f = ztVar.b;
            float f2 = 0.0f;
            if (f < 0.0f) {
                ztVar.b = f * (-1.0f);
                mt mtVar = ztVar.d;
                int i3 = mtVar.h;
                for (int i4 = 0; i3 != -1 && i4 < mtVar.a; i4++) {
                    float[] fArr = mtVar.g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = mtVar.f[i3];
                }
            }
            int iD2 = ztVar.d.d();
            float f3 = 0.0f;
            float f4 = 0.0f;
            ge7 ge7Var2 = null;
            ge7 ge7Var3 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < iD2) {
                float f5 = ztVar.d.f(i5);
                ge7 ge7VarE2 = ztVar.d.e(i5);
                float f6 = f2;
                if (ge7VarE2.n0 == 1) {
                    if (ge7Var2 == null) {
                        if (ge7VarE2.m0 <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        ge7Var2 = ge7VarE2;
                        f3 = f5;
                    } else {
                        if (f3 > f5) {
                            if (ge7VarE2.m0 > 1) {
                                z4 = false;
                            }
                            ge7Var2 = ge7VarE2;
                            f3 = f5;
                        } else if (z4 || ge7VarE2.m0 > 1) {
                        }
                        z4 = true;
                        ge7Var2 = ge7VarE2;
                        f3 = f5;
                    }
                } else if (ge7Var2 == null && f5 < f6) {
                    if (ge7Var3 == null) {
                        if (ge7VarE2.m0 <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        ge7Var3 = ge7VarE2;
                        f4 = f5;
                    } else {
                        if (f4 > f5) {
                            if (ge7VarE2.m0 > 1) {
                                z5 = false;
                            }
                            ge7Var3 = ge7VarE2;
                            f4 = f5;
                        } else if (z5 || ge7VarE2.m0 > 1) {
                        }
                        z5 = true;
                        ge7Var3 = ge7VarE2;
                        f4 = f5;
                    }
                }
                i5++;
                f2 = f6;
            }
            float f7 = f2;
            if (ge7Var2 == null) {
                ge7Var2 = ge7Var3;
            }
            if (ge7Var2 == null) {
                z2 = true;
            } else {
                ztVar.g(ge7Var2);
                z2 = false;
            }
            if (ztVar.d.d() == 0) {
                ztVar.e = true;
            }
            if (z2) {
                if (this.j + 1 >= this.f) {
                    o();
                }
                ge7 ge7VarA = a(3);
                int i6 = this.c + 1;
                this.c = i6;
                this.j++;
                ge7VarA.Y = i6;
                lr lrVar = this.m;
                ((ge7[]) lrVar.f0)[i6] = ge7VarA;
                ztVar.a = ge7VarA;
                int i7 = this.k;
                h(ztVar);
                if (this.k == i7 + 1) {
                    zt ztVar2 = this.p;
                    ztVar2.a = null;
                    ztVar2.d.b();
                    for (int i8 = 0; i8 < ztVar.d.d(); i8++) {
                        ztVar2.d.a(ztVar.d.e(i8), ztVar.d.f(i8), true);
                    }
                    r(this.p);
                    if (ge7VarA.Z == -1) {
                        if (ztVar.a == ge7VarA && (ge7VarF = ztVar.f(null, ge7VarA)) != null) {
                            ztVar.g(ge7VarF);
                        }
                        if (!ztVar.e) {
                            ztVar.a.e(this, ztVar);
                        }
                        ((er5) lrVar.Y).c(ztVar);
                        this.k--;
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            ge7 ge7Var4 = ztVar.a;
            if (ge7Var4 == null) {
                return;
            }
            if (ge7Var4.n0 != 1 && ztVar.b < f7) {
                return;
            }
        }
        if (z) {
            return;
        }
        h(ztVar);
    }

    public final void d(ge7 ge7Var, int i) {
        int i2 = ge7Var.Z;
        if (i2 == -1) {
            ge7Var.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                ge7 ge7Var2 = ((ge7[]) this.m.f0)[i3];
            }
            return;
        }
        if (i2 == -1) {
            zt ztVarL = l();
            ztVarL.a = ge7Var;
            float f = i;
            ge7Var.g0 = f;
            ztVarL.b = f;
            ztVarL.e = true;
            c(ztVarL);
            return;
        }
        zt ztVar = this.g[i2];
        if (ztVar.e) {
            ztVar.b = i;
            return;
        }
        if (ztVar.d.d() == 0) {
            ztVar.e = true;
            ztVar.b = i;
            return;
        }
        zt ztVarL2 = l();
        if (i < 0) {
            ztVarL2.b = i * (-1);
            ztVarL2.d.g(ge7Var, 1.0f);
        } else {
            ztVarL2.b = i;
            ztVarL2.d.g(ge7Var, -1.0f);
        }
        c(ztVarL2);
    }

    public final void e(ge7 ge7Var, ge7 ge7Var2, int i, int i2) {
        if (i2 == 8 && ge7Var2.h0 && ge7Var.Z == -1) {
            ge7Var.d(this, ge7Var2.g0 + i);
            return;
        }
        zt ztVarL = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            ztVarL.b = i;
        }
        mt mtVar = ztVarL.d;
        if (z) {
            mtVar.g(ge7Var, 1.0f);
            ztVarL.d.g(ge7Var2, -1.0f);
        } else {
            mtVar.g(ge7Var, -1.0f);
            ztVarL.d.g(ge7Var2, 1.0f);
        }
        if (i2 != 8) {
            ztVarL.a(this, i2);
        }
        c(ztVarL);
    }

    public final void f(ge7 ge7Var, ge7 ge7Var2, int i, int i2) {
        zt ztVarL = l();
        ge7 ge7VarM = m();
        ge7VarM.f0 = 0;
        ztVarL.b(ge7Var, ge7Var2, ge7VarM, i);
        if (i2 != 8) {
            ztVarL.d.g(j(i2), (int) (ztVarL.d.c(ge7VarM) * (-1.0f)));
        }
        c(ztVarL);
    }

    public final void g(ge7 ge7Var, ge7 ge7Var2, int i, int i2) {
        zt ztVarL = l();
        ge7 ge7VarM = m();
        ge7VarM.f0 = 0;
        ztVarL.c(ge7Var, ge7Var2, ge7VarM, i);
        if (i2 != 8) {
            ztVarL.d.g(j(i2), (int) (ztVarL.d.c(ge7VarM) * (-1.0f)));
        }
        c(ztVarL);
    }

    public final void h(zt ztVar) {
        int i;
        if (ztVar.e) {
            ztVar.a.d(this, ztVar.b);
        } else {
            zt[] ztVarArr = this.g;
            int i2 = this.k;
            ztVarArr[i2] = ztVar;
            ge7 ge7Var = ztVar.a;
            ge7Var.Z = i2;
            this.k = i2 + 1;
            ge7Var.e(this, ztVar);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                zt ztVar2 = this.g[i3];
                if (ztVar2 != null && ztVar2.e) {
                    ztVar2.a.d(this, ztVar2.b);
                    ((er5) this.m.Y).c(ztVar2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        zt[] ztVarArr2 = this.g;
                        int i6 = i4 - 1;
                        zt ztVar3 = ztVarArr2[i4];
                        ztVarArr2[i6] = ztVar3;
                        ge7 ge7Var2 = ztVar3.a;
                        if (ge7Var2.Z == i4) {
                            ge7Var2.Z = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.k; i++) {
            zt ztVar = this.g[i];
            ztVar.a.g0 = ztVar.b;
        }
    }

    public final ge7 j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        ge7 ge7VarA = a(4);
        float[] fArr = ge7VarA.j0;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        ge7VarA.Y = i2;
        ge7VarA.f0 = i;
        ((ge7[]) this.m.f0)[i2] = ge7VarA;
        gu5 gu5Var = this.d;
        gu5Var.i.Y = ge7VarA;
        Arrays.fill(fArr, 0.0f);
        fArr[ge7VarA.f0] = 1.0f;
        gu5Var.j(ge7VarA);
        return ge7VarA;
    }

    public final ge7 k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof u21)) {
            return null;
        }
        u21 u21Var = (u21) obj;
        ge7 ge7Var = u21Var.i;
        if (ge7Var == null) {
            u21Var.k();
            ge7Var = u21Var.i;
        }
        int i = ge7Var.Y;
        lr lrVar = this.m;
        if (i != -1 && i <= this.c && ((ge7[]) lrVar.f0)[i] != null) {
            return ge7Var;
        }
        if (i != -1) {
            ge7Var.c();
        }
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        ge7Var.Y = i2;
        ge7Var.n0 = 1;
        ((ge7[]) lrVar.f0)[i2] = ge7Var;
        return ge7Var;
    }

    public final zt l() {
        Object obj;
        lr lrVar = this.m;
        er5 er5Var = (er5) lrVar.Y;
        int i = er5Var.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = er5Var.a;
            obj = objArr[i2];
            objArr[i2] = null;
            er5Var.b = i2;
        } else {
            obj = null;
        }
        zt ztVar = (zt) obj;
        if (ztVar == null) {
            return new zt(lrVar);
        }
        ztVar.a = null;
        ztVar.d.b();
        ztVar.b = 0.0f;
        ztVar.e = false;
        return ztVar;
    }

    public final ge7 m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        ge7 ge7VarA = a(3);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        ge7VarA.Y = i;
        ((ge7[]) this.m.f0)[i] = ge7VarA;
        return ge7VarA;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (zt[]) Arrays.copyOf(this.g, i);
        lr lrVar = this.m;
        lrVar.f0 = (ge7[]) Arrays.copyOf((ge7[]) lrVar.f0, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        gu5 gu5Var = this.d;
        if (gu5Var.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(gu5Var);
            return;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.g[i].e) {
                q(gu5Var);
                return;
            }
        }
        i();
    }

    public final void q(gu5 gu5Var) {
        for (int i = 0; i < this.k; i++) {
            zt ztVar = this.g[i];
            int i2 = 1;
            if (ztVar.a.n0 != 1) {
                float f = 0.0f;
                if (ztVar.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.k) {
                            zt ztVar2 = this.g[i6];
                            if (ztVar2.a.n0 != i2 && !ztVar2.e && ztVar2.b < f) {
                                int iD = ztVar2.d.d();
                                int i8 = 0;
                                while (i8 < iD) {
                                    ge7 ge7VarE = ztVar2.d.e(i8);
                                    float fC = ztVar2.d.c(ge7VarE);
                                    if (fC > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = ge7VarE.i0[i9] / fC;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = ge7VarE.Y;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            zt ztVar3 = this.g[i4];
                            ztVar3.a.Z = -1;
                            ztVar3.g(((ge7[]) this.m.f0)[i5]);
                            ge7 ge7Var = ztVar3.a;
                            ge7Var.Z = i4;
                            ge7Var.e(this, ztVar3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.j / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                    break;
                }
            }
        }
        r(gu5Var);
        i();
    }

    public final void r(zt ztVar) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.j; i2++) {
            this.i[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.j * 2) {
                return;
            }
            ge7 ge7Var = ztVar.a;
            if (ge7Var != null) {
                this.i[ge7Var.Y] = true;
            }
            ge7 ge7VarD = ztVar.d(this.i);
            if (ge7VarD != null) {
                boolean[] zArr = this.i;
                int i4 = ge7VarD.Y;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (ge7VarD != null) {
                float f = Float.MAX_VALUE;
                int i5 = i;
                int i6 = -1;
                while (i5 < this.k) {
                    zt ztVar2 = this.g[i5];
                    if (ztVar2.a.n0 != 1 && !ztVar2.e) {
                        mt mtVar = ztVar2.d;
                        int i7 = mtVar.h;
                        if (i7 == -1) {
                            z = false;
                            break;
                        }
                        int i8 = i;
                        while (true) {
                            if (i7 == -1 || i8 >= mtVar.a) {
                                z = false;
                                break;
                            } else if (mtVar.e[i7] == ge7VarD.Y) {
                                z = true;
                                break;
                            } else {
                                i7 = mtVar.f[i7];
                                i8++;
                            }
                        }
                        if (z) {
                            float fC = ztVar2.d.c(ge7VarD);
                            if (fC < 0.0f) {
                                float f2 = (-ztVar2.b) / fC;
                                if (f2 < f) {
                                    i6 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    i5++;
                    i = 0;
                }
                if (i6 > -1) {
                    zt ztVar3 = this.g[i6];
                    ztVar3.a.Z = -1;
                    ztVar3.g(ge7VarD);
                    ge7 ge7Var2 = ztVar3.a;
                    ge7Var2.Z = i6;
                    ge7Var2.e(this, ztVar3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            zt ztVar = this.g[i];
            if (ztVar != null) {
                ((er5) this.m.Y).c(ztVar);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        lr lrVar;
        int i = 0;
        while (true) {
            lrVar = this.m;
            ge7[] ge7VarArr = (ge7[]) lrVar.f0;
            if (i >= ge7VarArr.length) {
                break;
            }
            ge7 ge7Var = ge7VarArr[i];
            if (ge7Var != null) {
                ge7Var.c();
            }
            i++;
        }
        er5 er5Var = (er5) lrVar.Z;
        ge7[] ge7VarArr2 = this.n;
        int length = this.o;
        er5Var.getClass();
        if (length > ge7VarArr2.length) {
            length = ge7VarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            ge7 ge7Var2 = ge7VarArr2[i2];
            int i3 = er5Var.b;
            Object[] objArr = er5Var.a;
            if (i3 < objArr.length) {
                objArr[i3] = ge7Var2;
                er5Var.b = i3 + 1;
            }
        }
        this.o = 0;
        Arrays.fill((ge7[]) lrVar.f0, (Object) null);
        this.c = 0;
        gu5 gu5Var = this.d;
        gu5Var.h = 0;
        gu5Var.b = 0.0f;
        this.j = 1;
        for (int i4 = 0; i4 < this.k; i4++) {
            zt ztVar = this.g[i4];
        }
        s();
        this.k = 0;
        this.p = new zt(lrVar);
    }
}
