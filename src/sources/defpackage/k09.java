package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k09 implements mi1 {
    public int a;
    public m31 b;
    public br6 c;
    public int d;
    public final zo1 e = new zo1(this);
    public int f = 0;
    public boolean g = false;
    public final si1 h = new si1(this);
    public final si1 i = new si1(this);
    public int j = 1;

    public k09(m31 m31Var) {
        this.b = m31Var;
    }

    public static void b(si1 si1Var, si1 si1Var2, int i) {
        si1Var.l.add(si1Var2);
        si1Var.f = i;
        si1Var2.k.add(si1Var);
    }

    public static si1 h(u21 u21Var) {
        u21 u21Var2 = u21Var.f;
        if (u21Var2 == null) {
            return null;
        }
        m31 m31Var = u21Var2.d;
        int iB = p61.B(u21Var2.e);
        if (iB == 1) {
            return m31Var.d.h;
        }
        if (iB == 2) {
            return m31Var.e.h;
        }
        if (iB == 3) {
            return m31Var.d.i;
        }
        if (iB == 4) {
            return m31Var.e.i;
        }
        if (iB != 5) {
            return null;
        }
        return m31Var.e.k;
    }

    public static si1 i(u21 u21Var, int i) {
        u21 u21Var2 = u21Var.f;
        if (u21Var2 == null) {
            return null;
        }
        m31 m31Var = u21Var2.d;
        k09 k09Var = i == 0 ? m31Var.d : m31Var.e;
        int iB = p61.B(u21Var2.e);
        if (iB == 1 || iB == 2) {
            return k09Var.h;
        }
        if (iB == 3 || iB == 4) {
            return k09Var.i;
        }
        return null;
    }

    public final void c(si1 si1Var, si1 si1Var2, int i, zo1 zo1Var) {
        si1Var.l.add(si1Var2);
        si1Var.l.add(this.e);
        si1Var.h = i;
        si1Var.i = zo1Var;
        si1Var2.k.add(si1Var);
        zo1Var.k.add(si1Var);
    }

    public void d() {
        m31 m31Var;
        n31 n31Var;
        int i;
        n31 n31Var2;
        n31 n31Var3;
        int i2;
        m31 m31Var2 = this.b;
        boolean z = m31Var2.a;
        zo1 zo1Var = this.e;
        if (z) {
            zo1Var.d(m31Var2.q());
        }
        boolean z2 = zo1Var.j;
        ArrayList arrayList = zo1Var.k;
        ArrayList arrayList2 = zo1Var.l;
        si1 si1Var = this.i;
        si1 si1Var2 = this.h;
        if (!z2) {
            m31 m31Var3 = this.b;
            int i3 = m31Var3.p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (n31Var3 = m31Var3.T) != null && ((i2 = n31Var3.p0[0]) == 1 || i2 == 4)) {
                    int iQ = (n31Var3.q() - this.b.I.e()) - this.b.K.e();
                    b(si1Var2, n31Var3.d.h, this.b.I.e());
                    b(si1Var, n31Var3.d.i, -this.b.K.e());
                    zo1Var.d(iQ);
                    return;
                }
                if (i3 == 1) {
                    zo1Var.d(m31Var3.q());
                }
            }
        } else if (this.d == 4 && (n31Var = (m31Var = this.b).T) != null && ((i = n31Var.p0[0]) == 1 || i == 4)) {
            b(si1Var2, n31Var.d.h, m31Var.I.e());
            b(si1Var, n31Var.d.i, -this.b.K.e());
            return;
        }
        if (zo1Var.j) {
            m31 m31Var4 = this.b;
            if (m31Var4.a) {
                u21[] u21VarArr = m31Var4.Q;
                u21 u21Var = u21VarArr[0];
                u21 u21Var2 = u21Var.f;
                if (u21Var2 != null && u21VarArr[1].f != null) {
                    boolean zX = m31Var4.x();
                    m31 m31Var5 = this.b;
                    if (zX) {
                        si1Var2.f = m31Var5.Q[0].e();
                        si1Var.f = -this.b.Q[1].e();
                        return;
                    }
                    si1 si1VarH = h(m31Var5.Q[0]);
                    if (si1VarH != null) {
                        b(si1Var2, si1VarH, this.b.Q[0].e());
                    }
                    si1 si1VarH2 = h(this.b.Q[1]);
                    if (si1VarH2 != null) {
                        b(si1Var, si1VarH2, -this.b.Q[1].e());
                    }
                    si1Var2.b = true;
                    si1Var.b = true;
                    return;
                }
                if (u21Var2 != null) {
                    si1 si1VarH3 = h(u21Var);
                    if (si1VarH3 != null) {
                        b(si1Var2, si1VarH3, this.b.Q[0].e());
                        b(si1Var, si1Var2, zo1Var.g);
                        return;
                    }
                    return;
                }
                u21 u21Var3 = u21VarArr[1];
                if (u21Var3.f != null) {
                    si1 si1VarH4 = h(u21Var3);
                    if (si1VarH4 != null) {
                        b(si1Var, si1VarH4, -this.b.Q[1].e());
                        b(si1Var2, si1Var, -zo1Var.g);
                        return;
                    }
                    return;
                }
                if ((m31Var4 instanceof xz2) || m31Var4.T == null || m31Var4.i(7).f != null) {
                    return;
                }
                m31 m31Var6 = this.b;
                b(si1Var2, m31Var6.T.d.h, m31Var6.r());
                b(si1Var, si1Var2, zo1Var.g);
                return;
            }
        }
        if (this.d == 3) {
            m31 m31Var7 = this.b;
            int i4 = m31Var7.r;
            if (i4 == 2) {
                n31 n31Var4 = m31Var7.T;
                if (n31Var4 != null) {
                    zo1 zo1Var2 = n31Var4.e.e;
                    arrayList2.add(zo1Var2);
                    zo1Var2.k.add(zo1Var);
                    zo1Var.b = true;
                    arrayList.add(si1Var2);
                    arrayList.add(si1Var);
                }
            } else if (i4 == 3) {
                if (m31Var7.s == 3) {
                    si1Var2.a = this;
                    si1Var.a = this;
                    kv8 kv8Var = m31Var7.e;
                    kv8Var.h.a = this;
                    kv8Var.i.a = this;
                    zo1Var.a = this;
                    if (m31Var7.y()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(zo1Var);
                        kv8 kv8Var2 = this.b.e;
                        kv8Var2.e.a = this;
                        arrayList2.add(kv8Var2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(zo1Var);
                        this.b.e.i.k.add(zo1Var);
                    } else {
                        boolean zX2 = this.b.x();
                        m31 m31Var8 = this.b;
                        if (zX2) {
                            m31Var8.e.e.l.add(zo1Var);
                            arrayList.add(this.b.e.e);
                        } else {
                            m31Var8.e.e.l.add(zo1Var);
                        }
                    }
                } else {
                    zo1 zo1Var3 = m31Var7.e.e;
                    arrayList2.add(zo1Var3);
                    zo1Var3.k.add(zo1Var);
                    this.b.e.h.k.add(zo1Var);
                    this.b.e.i.k.add(zo1Var);
                    zo1Var.b = true;
                    arrayList.add(si1Var2);
                    arrayList.add(si1Var);
                    si1Var2.l.add(zo1Var);
                    si1Var.l.add(zo1Var);
                }
            }
        }
        m31 m31Var9 = this.b;
        u21[] u21VarArr2 = m31Var9.Q;
        u21 u21Var4 = u21VarArr2[0];
        u21 u21Var5 = u21Var4.f;
        if (u21Var5 != null && u21VarArr2[1].f != null) {
            boolean zX3 = m31Var9.x();
            m31 m31Var10 = this.b;
            if (zX3) {
                si1Var2.f = m31Var10.Q[0].e();
                si1Var.f = -this.b.Q[1].e();
                return;
            }
            si1 si1VarH5 = h(m31Var10.Q[0]);
            si1 si1VarH6 = h(this.b.Q[1]);
            if (si1VarH5 != null) {
                si1VarH5.b(this);
            }
            if (si1VarH6 != null) {
                si1VarH6.b(this);
            }
            this.j = 4;
            return;
        }
        if (u21Var5 != null) {
            si1 si1VarH7 = h(u21Var4);
            if (si1VarH7 != null) {
                b(si1Var2, si1VarH7, this.b.Q[0].e());
                c(si1Var, si1Var2, 1, zo1Var);
                return;
            }
            return;
        }
        u21 u21Var6 = u21VarArr2[1];
        if (u21Var6.f != null) {
            si1 si1VarH8 = h(u21Var6);
            if (si1VarH8 != null) {
                b(si1Var, si1VarH8, -this.b.Q[1].e());
                c(si1Var2, si1Var, -1, zo1Var);
                return;
            }
            return;
        }
        if ((m31Var9 instanceof xz2) || (n31Var2 = m31Var9.T) == null) {
            return;
        }
        b(si1Var2, n31Var2.d.h, m31Var9.r());
        c(si1Var, si1Var2, 1, zo1Var);
    }

    public void e() {
        m31 m31Var = this.b;
        int i = ((av2) m31Var).u0;
        si1 si1Var = this.h;
        if (i == 1) {
            m31Var.Y = si1Var.g;
        } else {
            m31Var.Z = si1Var.g;
        }
    }

    public void f() {
        this.h.c();
    }

    public final int g(int i, int i2) {
        m31 m31Var = this.b;
        if (i2 == 0) {
            int i3 = m31Var.v;
            int iMax = Math.max(m31Var.u, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = m31Var.y;
            int iMax2 = Math.max(m31Var.x, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        zo1 zo1Var = this.e;
        if (zo1Var.j) {
            return zo1Var.g;
        }
        return 0L;
    }

    public boolean k() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    public final void l(u21 u21Var, u21 u21Var2, int i) {
        zo1 zo1Var;
        float f;
        int i2;
        int i3;
        si1 si1VarH = h(u21Var);
        si1 si1VarH2 = h(u21Var2);
        if (si1VarH.j && si1VarH2.j) {
            int iE = u21Var.e() + si1VarH.g;
            int iE2 = si1VarH2.g - u21Var2.e();
            int i4 = iE2 - iE;
            zo1 zo1Var2 = this.e;
            if (!zo1Var2.j && this.d == 3) {
                int i5 = this.a;
                if (i5 == 0) {
                    zo1Var2.d(g(i4, i));
                } else if (i5 == 1) {
                    zo1Var2.d(Math.min(g(zo1Var2.m, i), i4));
                } else if (i5 == 2) {
                    m31 m31Var = this.b;
                    n31 n31Var = m31Var.T;
                    if (n31Var != null) {
                        zo1 zo1Var3 = (i == 0 ? n31Var.d : n31Var.e).e;
                        if (zo1Var3.j) {
                            zo1Var2.d(g((int) ((zo1Var3.g * (i == 0 ? m31Var.w : m31Var.z)) + 0.5f), i));
                        }
                    }
                } else if (i5 == 3) {
                    m31 m31Var2 = this.b;
                    k09 k09Var = m31Var2.d;
                    if (k09Var.d == 3 && k09Var.a == 3) {
                        kv8 kv8Var = m31Var2.e;
                        if (kv8Var.d != 3 || kv8Var.a != 3) {
                            if (i == 0) {
                                k09Var = m31Var2.e;
                            }
                            zo1Var = k09Var.e;
                            if (zo1Var.j) {
                                f = m31Var2.W;
                                i2 = zo1Var.g;
                                if (i == 1) {
                                    i3 = (int) ((i2 / f) + 0.5f);
                                } else {
                                    i3 = (int) ((f * i2) + 0.5f);
                                }
                                zo1Var2.d(i3);
                            }
                        }
                    } else {
                        if (i == 0) {
                            k09Var = m31Var2.e;
                        }
                        zo1Var = k09Var.e;
                        if (zo1Var.j) {
                            f = m31Var2.W;
                            i2 = zo1Var.g;
                            if (i == 1) {
                                i3 = (int) ((i2 / f) + 0.5f);
                            } else {
                                i3 = (int) ((f * i2) + 0.5f);
                            }
                            zo1Var2.d(i3);
                        }
                    }
                }
            }
            if (zo1Var2.j) {
                int i6 = zo1Var2.g;
                si1 si1Var = this.i;
                si1 si1Var2 = this.h;
                if (i6 == i4) {
                    si1Var2.d(iE);
                    si1Var.d(iE2);
                    return;
                }
                m31 m31Var3 = this.b;
                float f2 = i == 0 ? m31Var3.d0 : m31Var3.e0;
                if (si1VarH == si1VarH2) {
                    iE = si1VarH.g;
                    iE2 = si1VarH2.g;
                    f2 = 0.5f;
                }
                si1Var2.d((int) ((((iE2 - iE) - i6) * f2) + iE + 0.5f));
                si1Var.d(si1Var2.g + zo1Var2.g);
            }
        }
    }
}
