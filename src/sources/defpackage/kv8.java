package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kv8 extends k09 {
    public si1 k;
    public w20 l;

    @Override // defpackage.mi1
    public final void a(mi1 mi1Var) {
        float f;
        float f2;
        float f3;
        int i;
        if (p61.B(this.j) == 3) {
            m31 m31Var = this.b;
            l(m31Var.J, m31Var.L, 1);
            return;
        }
        zo1 zo1Var = this.e;
        if (zo1Var.c && !zo1Var.j && this.d == 3) {
            m31 m31Var2 = this.b;
            int i2 = m31Var2.s;
            if (i2 == 2) {
                n31 n31Var = m31Var2.T;
                if (n31Var != null) {
                    zo1 zo1Var2 = n31Var.e.e;
                    if (zo1Var2.j) {
                        zo1Var.d((int) ((zo1Var2.g * m31Var2.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                zo1 zo1Var3 = m31Var2.d.e;
                if (zo1Var3.j) {
                    int i3 = m31Var2.X;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = zo1Var3.g * m31Var2.W;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = zo1Var3.g;
                            f2 = m31Var2.W;
                        }
                        zo1Var.d(i);
                    } else {
                        f = zo1Var3.g;
                        f2 = m31Var2.W;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    zo1Var.d(i);
                }
            }
        }
        si1 si1Var = this.h;
        boolean z = si1Var.c;
        ArrayList arrayList = si1Var.l;
        if (z) {
            si1 si1Var2 = this.i;
            boolean z2 = si1Var2.c;
            ArrayList arrayList2 = si1Var2.l;
            if (z2) {
                if (si1Var.j && si1Var2.j && zo1Var.j) {
                    return;
                }
                if (!zo1Var.j && this.d == 3) {
                    m31 m31Var3 = this.b;
                    if (m31Var3.r == 0 && !m31Var3.y()) {
                        si1 si1Var3 = (si1) arrayList.get(0);
                        si1 si1Var4 = (si1) arrayList2.get(0);
                        int i4 = si1Var3.g + si1Var.f;
                        int i5 = si1Var4.g + si1Var2.f;
                        si1Var.d(i4);
                        si1Var2.d(i5);
                        zo1Var.d(i5 - i4);
                        return;
                    }
                }
                if (!zo1Var.j && this.d == 3 && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    si1 si1Var5 = (si1) arrayList.get(0);
                    int i6 = (((si1) arrayList2.get(0)).g + si1Var2.f) - (si1Var5.g + si1Var.f);
                    int i7 = zo1Var.m;
                    if (i6 < i7) {
                        zo1Var.d(i6);
                    } else {
                        zo1Var.d(i7);
                    }
                }
                if (zo1Var.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    si1 si1Var6 = (si1) arrayList.get(0);
                    si1 si1Var7 = (si1) arrayList2.get(0);
                    int i8 = si1Var6.g;
                    int i9 = si1Var.f + i8;
                    int i10 = si1Var7.g;
                    int i11 = si1Var2.f + i10;
                    float f4 = this.b.e0;
                    if (si1Var6 == si1Var7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    si1Var.d((int) ((((i10 - i8) - zo1Var.g) * f4) + i8 + 0.5f));
                    si1Var2.d(si1Var.g + zo1Var.g);
                }
            }
        }
    }

    @Override // defpackage.k09
    public final void d() {
        m31 m31Var;
        n31 n31Var;
        n31 n31Var2;
        n31 n31Var3;
        si1 si1Var = this.k;
        m31 m31Var2 = this.b;
        boolean z = m31Var2.a;
        zo1 zo1Var = this.e;
        if (z) {
            zo1Var.d(m31Var2.k());
        }
        boolean z2 = zo1Var.j;
        ArrayList arrayList = zo1Var.k;
        ArrayList arrayList2 = zo1Var.l;
        si1 si1Var2 = this.i;
        si1 si1Var3 = this.h;
        if (!z2) {
            m31 m31Var3 = this.b;
            this.d = m31Var3.p0[1];
            if (m31Var3.E) {
                this.l = new w20(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (n31Var3 = this.b.T) != null && n31Var3.p0[1] == 1) {
                    int iK = (n31Var3.k() - this.b.J.e()) - this.b.L.e();
                    k09.b(si1Var3, n31Var3.e.h, this.b.J.e());
                    k09.b(si1Var2, n31Var3.e.i, -this.b.L.e());
                    zo1Var.d(iK);
                    return;
                }
                if (i == 1) {
                    zo1Var.d(this.b.k());
                }
            }
        } else if (this.d == 4 && (n31Var = (m31Var = this.b).T) != null && n31Var.p0[1] == 1) {
            k09.b(si1Var3, n31Var.e.h, m31Var.J.e());
            k09.b(si1Var2, n31Var.e.i, -this.b.L.e());
            return;
        }
        boolean z3 = zo1Var.j;
        if (z3) {
            m31 m31Var4 = this.b;
            if (m31Var4.a) {
                u21[] u21VarArr = m31Var4.Q;
                u21 u21Var = u21VarArr[2];
                u21 u21Var2 = u21Var.f;
                if (u21Var2 != null && u21VarArr[3].f != null) {
                    boolean zY = m31Var4.y();
                    m31 m31Var5 = this.b;
                    if (zY) {
                        si1Var3.f = m31Var5.Q[2].e();
                        si1Var2.f = -this.b.Q[3].e();
                    } else {
                        si1 si1VarH = k09.h(m31Var5.Q[2]);
                        if (si1VarH != null) {
                            k09.b(si1Var3, si1VarH, this.b.Q[2].e());
                        }
                        si1 si1VarH2 = k09.h(this.b.Q[3]);
                        if (si1VarH2 != null) {
                            k09.b(si1Var2, si1VarH2, -this.b.Q[3].e());
                        }
                        si1Var3.b = true;
                        si1Var2.b = true;
                    }
                    m31 m31Var6 = this.b;
                    if (m31Var6.E) {
                        k09.b(si1Var, si1Var3, m31Var6.a0);
                        return;
                    }
                    return;
                }
                if (u21Var2 != null) {
                    si1 si1VarH3 = k09.h(u21Var);
                    if (si1VarH3 != null) {
                        k09.b(si1Var3, si1VarH3, this.b.Q[2].e());
                        k09.b(si1Var2, si1Var3, zo1Var.g);
                        m31 m31Var7 = this.b;
                        if (m31Var7.E) {
                            k09.b(si1Var, si1Var3, m31Var7.a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                u21 u21Var3 = u21VarArr[3];
                if (u21Var3.f != null) {
                    si1 si1VarH4 = k09.h(u21Var3);
                    if (si1VarH4 != null) {
                        k09.b(si1Var2, si1VarH4, -this.b.Q[3].e());
                        k09.b(si1Var3, si1Var2, -zo1Var.g);
                    }
                    m31 m31Var8 = this.b;
                    if (m31Var8.E) {
                        k09.b(si1Var, si1Var3, m31Var8.a0);
                        return;
                    }
                    return;
                }
                u21 u21Var4 = u21VarArr[4];
                if (u21Var4.f != null) {
                    si1 si1VarH5 = k09.h(u21Var4);
                    if (si1VarH5 != null) {
                        k09.b(si1Var, si1VarH5, 0);
                        k09.b(si1Var3, si1Var, -this.b.a0);
                        k09.b(si1Var2, si1Var3, zo1Var.g);
                        return;
                    }
                    return;
                }
                if ((m31Var4 instanceof xz2) || m31Var4.T == null || m31Var4.i(7).f != null) {
                    return;
                }
                m31 m31Var9 = this.b;
                k09.b(si1Var3, m31Var9.T.e.h, m31Var9.s());
                k09.b(si1Var2, si1Var3, zo1Var.g);
                m31 m31Var10 = this.b;
                if (m31Var10.E) {
                    k09.b(si1Var, si1Var3, m31Var10.a0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != 3) {
            zo1Var.b(this);
        } else {
            m31 m31Var11 = this.b;
            int i2 = m31Var11.s;
            if (i2 == 2) {
                n31 n31Var4 = m31Var11.T;
                if (n31Var4 != null) {
                    zo1 zo1Var2 = n31Var4.e.e;
                    arrayList2.add(zo1Var2);
                    zo1Var2.k.add(zo1Var);
                    zo1Var.b = true;
                    arrayList.add(si1Var3);
                    arrayList.add(si1Var2);
                }
            } else if (i2 == 3 && !m31Var11.y()) {
                m31 m31Var12 = this.b;
                if (m31Var12.r != 3) {
                    zo1 zo1Var3 = m31Var12.d.e;
                    arrayList2.add(zo1Var3);
                    zo1Var3.k.add(zo1Var);
                    zo1Var.b = true;
                    arrayList.add(si1Var3);
                    arrayList.add(si1Var2);
                }
            }
        }
        m31 m31Var13 = this.b;
        u21[] u21VarArr2 = m31Var13.Q;
        u21 u21Var5 = u21VarArr2[2];
        u21 u21Var6 = u21Var5.f;
        if (u21Var6 != null && u21VarArr2[3].f != null) {
            boolean zY2 = m31Var13.y();
            m31 m31Var14 = this.b;
            if (zY2) {
                si1Var3.f = m31Var14.Q[2].e();
                si1Var2.f = -this.b.Q[3].e();
            } else {
                si1 si1VarH6 = k09.h(m31Var14.Q[2]);
                si1 si1VarH7 = k09.h(this.b.Q[3]);
                if (si1VarH6 != null) {
                    si1VarH6.b(this);
                }
                if (si1VarH7 != null) {
                    si1VarH7.b(this);
                }
                this.j = 4;
            }
            if (this.b.E) {
                c(si1Var, si1Var3, 1, this.l);
            }
        } else if (u21Var6 != null) {
            si1 si1VarH8 = k09.h(u21Var5);
            if (si1VarH8 != null) {
                k09.b(si1Var3, si1VarH8, this.b.Q[2].e());
                c(si1Var2, si1Var3, 1, zo1Var);
                if (this.b.E) {
                    c(si1Var, si1Var3, 1, this.l);
                }
                if (this.d == 3) {
                    m31 m31Var15 = this.b;
                    if (m31Var15.W > 0.0f) {
                        y03 y03Var = m31Var15.d;
                        if (y03Var.d == 3) {
                            y03Var.e.k.add(zo1Var);
                            arrayList2.add(this.b.d.e);
                            zo1Var.a = this;
                        }
                    }
                }
            }
        } else {
            u21 u21Var7 = u21VarArr2[3];
            if (u21Var7.f != null) {
                si1 si1VarH9 = k09.h(u21Var7);
                if (si1VarH9 != null) {
                    k09.b(si1Var2, si1VarH9, -this.b.Q[3].e());
                    c(si1Var3, si1Var2, -1, zo1Var);
                    if (this.b.E) {
                        c(si1Var, si1Var3, 1, this.l);
                    }
                }
            } else {
                u21 u21Var8 = u21VarArr2[4];
                if (u21Var8.f != null) {
                    si1 si1VarH10 = k09.h(u21Var8);
                    if (si1VarH10 != null) {
                        k09.b(si1Var, si1VarH10, 0);
                        c(si1Var3, si1Var, -1, this.l);
                        c(si1Var2, si1Var3, 1, zo1Var);
                    }
                } else if (!(m31Var13 instanceof xz2) && (n31Var2 = m31Var13.T) != null) {
                    k09.b(si1Var3, n31Var2.e.h, m31Var13.s());
                    c(si1Var2, si1Var3, 1, zo1Var);
                    if (this.b.E) {
                        c(si1Var, si1Var3, 1, this.l);
                    }
                    if (this.d == 3) {
                        m31 m31Var16 = this.b;
                        if (m31Var16.W > 0.0f) {
                            y03 y03Var2 = m31Var16.d;
                            if (y03Var2.d == 3) {
                                y03Var2.e.k.add(zo1Var);
                                arrayList2.add(this.b.d.e);
                                zo1Var.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            zo1Var.c = true;
        }
    }

    @Override // defpackage.k09
    public final void e() {
        si1 si1Var = this.h;
        if (si1Var.j) {
            this.b.Z = si1Var.g;
        }
    }

    @Override // defpackage.k09
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.k09
    public final boolean k() {
        return this.d != 3 || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        si1 si1Var = this.h;
        si1Var.c();
        si1Var.j = false;
        si1 si1Var2 = this.i;
        si1Var2.c();
        si1Var2.j = false;
        si1 si1Var3 = this.k;
        si1Var3.c();
        si1Var3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.h0;
    }
}
