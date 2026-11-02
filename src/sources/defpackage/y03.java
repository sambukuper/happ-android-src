package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y03 extends k09 {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0268  */
    /* JADX WARN: Code duplicated, block: B:118:0x0278  */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // defpackage.mi1
    public final void a(mi1 mi1Var) {
        float f;
        int iG;
        int i;
        int iG2;
        float f2;
        float f3;
        float f4;
        int i2;
        if (p61.B(this.j) == 3) {
            m31 m31Var = this.b;
            l(m31Var.I, m31Var.K, 0);
            return;
        }
        zo1 zo1Var = this.e;
        boolean z = zo1Var.j;
        si1 si1Var = this.h;
        si1 si1Var2 = this.i;
        if (z || this.d != 3) {
            f = 0.5f;
        } else {
            m31 m31Var2 = this.b;
            int i3 = m31Var2.r;
            if (i3 == 2) {
                f = 0.5f;
                n31 n31Var = m31Var2.T;
                if (n31Var != null) {
                    zo1 zo1Var2 = n31Var.d.e;
                    if (zo1Var2.j) {
                        zo1Var.d((int) ((zo1Var2.g * m31Var2.w) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = m31Var2.s;
                if (i4 == 0 || i4 == 3) {
                    kv8 kv8Var = m31Var2.e;
                    si1 si1Var3 = kv8Var.h;
                    si1 si1Var4 = kv8Var.i;
                    boolean z2 = m31Var2.I.f != null;
                    boolean z3 = m31Var2.J.f != null;
                    boolean z4 = m31Var2.K.f != null;
                    boolean z5 = m31Var2.L.f != null;
                    f = 0.5f;
                    int i5 = m31Var2.X;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = m31Var2.W;
                        boolean z6 = si1Var3.j;
                        ArrayList arrayList = si1Var3.l;
                        int[] iArr = k;
                        if (z6 && si1Var4.j) {
                            if (si1Var.c && si1Var2.c) {
                                m(iArr, ((si1) si1Var.l.get(0)).g + si1Var.f, ((si1) si1Var2.l.get(0)).g - si1Var2.f, si1Var3.g + si1Var3.f, si1Var4.g - si1Var4.f, f5, i5);
                                zo1Var.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (si1Var.j && si1Var2.j) {
                            if (!si1Var3.c || !si1Var4.c) {
                                return;
                            }
                            m(iArr, si1Var.g + si1Var.f, si1Var2.g - si1Var2.f, ((si1) arrayList.get(0)).g + si1Var3.f, ((si1) si1Var4.l.get(0)).g - si1Var4.f, f5, i5);
                            zo1Var.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!si1Var.c || !si1Var2.c || !si1Var3.c || !si1Var4.c) {
                            return;
                        }
                        m(iArr, ((si1) si1Var.l.get(0)).g + si1Var.f, ((si1) si1Var2.l.get(0)).g - si1Var2.f, ((si1) arrayList.get(0)).g + si1Var3.f, ((si1) si1Var4.l.get(0)).g - si1Var4.f, f5, i5);
                        zo1Var.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!si1Var.c || !si1Var2.c) {
                            return;
                        }
                        float f6 = m31Var2.W;
                        int i6 = ((si1) si1Var.l.get(0)).g + si1Var.f;
                        int i7 = ((si1) si1Var2.l.get(0)).g - si1Var2.f;
                        if (i5 == -1 || i5 == 0) {
                            int iG3 = g(i7 - i6, 0);
                            int i8 = (int) ((iG3 * f6) + 0.5f);
                            int iG4 = g(i8, 1);
                            if (i8 != iG4) {
                                iG3 = (int) ((iG4 / f6) + 0.5f);
                            }
                            zo1Var.d(iG3);
                            this.b.e.e.d(iG4);
                        } else if (i5 == 1) {
                            int iG5 = g(i7 - i6, 0);
                            int i9 = (int) ((iG5 / f6) + 0.5f);
                            int iG6 = g(i9, 1);
                            if (i9 != iG6) {
                                iG5 = (int) ((iG6 * f6) + 0.5f);
                            }
                            zo1Var.d(iG5);
                            this.b.e.e.d(iG6);
                        }
                    } else if (z3 && z5) {
                        if (!si1Var3.c || !si1Var4.c) {
                            return;
                        }
                        float f7 = m31Var2.W;
                        int i10 = ((si1) si1Var3.l.get(0)).g + si1Var3.f;
                        int i11 = ((si1) si1Var4.l.get(0)).g - si1Var4.f;
                        if (i5 == -1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            zo1Var.d(iG2);
                            this.b.e.e.d(iG);
                        } else if (i5 == 0) {
                            int iG7 = g(i11 - i10, 1);
                            int i12 = (int) ((iG7 * f7) + 0.5f);
                            int iG8 = g(i12, 0);
                            if (i12 != iG8) {
                                iG7 = (int) ((iG8 / f7) + 0.5f);
                            }
                            zo1Var.d(iG8);
                            this.b.e.e.d(iG7);
                        } else if (i5 == 1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            zo1Var.d(iG2);
                            this.b.e.e.d(iG);
                        }
                    }
                } else {
                    int i13 = m31Var2.X;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f4 = m31Var2.e.e.g / m31Var2.W;
                            i2 = (int) (f4 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f2 = m31Var2.e.e.g;
                            f3 = m31Var2.W;
                        }
                        zo1Var.d(i2);
                        f = 0.5f;
                    } else {
                        f2 = m31Var2.e.e.g;
                        f3 = m31Var2.W;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    zo1Var.d(i2);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        boolean z7 = si1Var.c;
        ArrayList arrayList2 = si1Var.l;
        if (z7) {
            boolean z8 = si1Var2.c;
            ArrayList arrayList3 = si1Var2.l;
            if (z8) {
                if (si1Var.j && si1Var2.j && zo1Var.j) {
                    return;
                }
                if (!zo1Var.j && this.d == 3) {
                    m31 m31Var3 = this.b;
                    if (m31Var3.r == 0 && !m31Var3.x()) {
                        si1 si1Var5 = (si1) arrayList2.get(0);
                        si1 si1Var6 = (si1) arrayList3.get(0);
                        int i14 = si1Var5.g + si1Var.f;
                        int i15 = si1Var6.g + si1Var2.f;
                        si1Var.d(i14);
                        si1Var2.d(i15);
                        zo1Var.d(i15 - i14);
                        return;
                    }
                }
                if (!zo1Var.j && this.d == 3 && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((si1) arrayList3.get(0)).g + si1Var2.f) - (((si1) arrayList2.get(0)).g + si1Var.f), zo1Var.m);
                    m31 m31Var4 = this.b;
                    int i16 = m31Var4.v;
                    int iMax = Math.max(m31Var4.u, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    zo1Var.d(iMax);
                }
                if (zo1Var.j) {
                    si1 si1Var7 = (si1) arrayList2.get(0);
                    si1 si1Var8 = (si1) arrayList3.get(0);
                    int i17 = si1Var7.g;
                    int i18 = si1Var.f + i17;
                    int i19 = si1Var8.g;
                    int i20 = si1Var2.f + i19;
                    float f8 = this.b.d0;
                    if (si1Var7 == si1Var8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    si1Var.d((int) ((((i19 - i17) - zo1Var.g) * f8) + i17 + f));
                    si1Var2.d(si1Var.g + zo1Var.g);
                }
            }
        }
    }

    @Override // defpackage.k09
    public final void e() {
        si1 si1Var = this.h;
        if (si1Var.j) {
            this.b.Y = si1Var.g;
        }
    }

    @Override // defpackage.k09
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.k09
    public final boolean k() {
        return this.d != 3 || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        si1 si1Var = this.h;
        si1Var.c();
        si1Var.j = false;
        si1 si1Var2 = this.i;
        si1Var2.c();
        si1Var2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.h0;
    }
}
