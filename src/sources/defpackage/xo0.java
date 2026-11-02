package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xo0 extends k09 {
    public final ArrayList k;
    public int l;

    public xo0(m31 m31Var, int i) {
        m31 m31Var2;
        super(m31Var);
        ArrayList<k09> arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        m31 m31Var3 = this.b;
        m31 m31VarM = m31Var3.m(i);
        while (true) {
            m31Var2 = m31Var3;
            m31Var3 = m31VarM;
            if (m31Var3 == null) {
                break;
            } else {
                m31VarM = m31Var3.m(this.f);
            }
        }
        this.b = m31Var2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? m31Var2.d : i2 == 1 ? m31Var2.e : null);
        m31 m31VarL = m31Var2.l(this.f);
        while (m31VarL != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? m31VarL.d : i3 == 1 ? m31VarL.e : null);
            m31VarL = m31VarL.l(this.f);
        }
        for (k09 k09Var : arrayList) {
            int i4 = this.f;
            if (i4 == 0) {
                k09Var.b.b = this;
            } else if (i4 == 1) {
                k09Var.b.c = this;
            }
        }
        if (this.f == 0 && this.b.T.v0 && arrayList.size() > 1) {
            this.b = ((k09) oi0.h(1, arrayList)).b;
        }
        int i5 = this.f;
        m31 m31Var4 = this.b;
        this.l = i5 == 0 ? m31Var4.i0 : m31Var4.j0;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00e4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc A[ADDED_TO_REGION] */
    @Override // defpackage.mi1
    public final void a(mi1 mi1Var) {
        int i;
        int i2;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f3;
        si1 si1Var = this.h;
        if (si1Var.j) {
            si1 si1Var2 = this.i;
            if (si1Var2.j) {
                n31 n31Var = this.b.T;
                boolean z2 = n31Var != null ? n31Var.v0 : false;
                int i13 = si1Var2.g - si1Var.g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i14 >= size) {
                        i14 = -1;
                        break;
                    } else if (((k09) arrayList.get(i14)).b.g0 != 8) {
                        break;
                    } else {
                        i14++;
                    }
                }
                int i15 = size - 1;
                for (int i16 = i15; i16 >= 0; i16--) {
                    if (((k09) arrayList.get(i16)).b.g0 != 8) {
                        i = i16;
                        break;
                    }
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= 2) {
                        z = z2;
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i18 = 0;
                    i5 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    while (i18 < size) {
                        k09 k09Var = (k09) arrayList.get(i18);
                        m31 m31Var = k09Var.b;
                        boolean z3 = z2;
                        if (m31Var.g0 == i2) {
                            i11 = i17;
                        } else {
                            i20++;
                            if (i18 > 0 && i18 >= i14) {
                                i5 += k09Var.h.f;
                            }
                            zo1 zo1Var = k09Var.e;
                            int i21 = zo1Var.g;
                            i11 = i17;
                            boolean z4 = k09Var.d != 3;
                            if (z4) {
                                int i22 = this.f;
                                if (i22 == 0 && !m31Var.d.e.j) {
                                    return;
                                }
                                if (i22 == 1 && !m31Var.e.e.j) {
                                    return;
                                }
                            } else {
                                if (k09Var.a == 1 && i11 == 0) {
                                    i12 = zo1Var.m;
                                    i19++;
                                } else {
                                    if (zo1Var.j) {
                                        i12 = i21;
                                    }
                                    if (z4) {
                                        i5 += i12;
                                    } else {
                                        i19++;
                                        f3 = m31Var.k0[this.f];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                    }
                                    if (i18 >= i15 && i18 < i) {
                                        i5 += -k09Var.i.f;
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    i19++;
                                    f3 = m31Var.k0[this.f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i12;
                                }
                                if (i18 >= i15) {
                                }
                            }
                            i12 = i21;
                            if (z4) {
                                i19++;
                                f3 = m31Var.k0[this.f];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i5 += i12;
                            }
                            if (i18 >= i15) {
                            }
                        }
                        i18++;
                        z2 = z3;
                        i17 = i11;
                        i2 = 8;
                    }
                    z = z2;
                    int i23 = i17;
                    if (i5 < i13 || i19 == 0) {
                        i3 = i19;
                        i4 = i20;
                        break;
                    } else {
                        i17 = i23 + 1;
                        z2 = z;
                        i2 = 8;
                    }
                }
                int i24 = si1Var.g;
                if (z) {
                    i24 = si1Var2.g;
                }
                float f4 = 0.5f;
                if (i5 > i13) {
                    i24 = z ? i24 + ((int) (((i5 - i13) / 2.0f) + 0.5f)) : i24 - ((int) (((i5 - i13) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i13 - i5;
                    int i25 = (int) ((f5 / i3) + 0.5f);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < size) {
                        float f6 = f4;
                        k09 k09Var2 = (k09) arrayList.get(i26);
                        int i28 = i24;
                        m31 m31Var2 = k09Var2.b;
                        int i29 = i3;
                        zo1 zo1Var2 = k09Var2.e;
                        float f7 = f5;
                        int i30 = i25;
                        if (m31Var2.g0 != 8 && k09Var2.d == 3 && !zo1Var2.j) {
                            int i31 = f > 0.0f ? (int) (((m31Var2.k0[this.f] * f7) / f) + f6) : i30;
                            if (this.f == 0) {
                                i9 = m31Var2.v;
                                i10 = m31Var2.u;
                            } else {
                                i9 = m31Var2.y;
                                i10 = m31Var2.x;
                            }
                            int iMax = Math.max(i10, k09Var2.a == 1 ? Math.min(i31, zo1Var2.m) : i31);
                            if (i9 > 0) {
                                iMax = Math.min(i9, iMax);
                            }
                            if (iMax != i31) {
                                i27++;
                                i31 = iMax;
                            }
                            zo1Var2.d(i31);
                        }
                        i26++;
                        i24 = i28;
                        f4 = f6;
                        i3 = i29;
                        f5 = f7;
                        i25 = i30;
                    }
                    i6 = i24;
                    f2 = f4;
                    int i32 = i3;
                    if (i27 > 0) {
                        i3 = i32 - i27;
                        i5 = 0;
                        for (int i33 = 0; i33 < size; i33++) {
                            k09 k09Var3 = (k09) arrayList.get(i33);
                            if (k09Var3.b.g0 != 8) {
                                if (i33 > 0 && i33 >= i14) {
                                    i5 += k09Var3.h.f;
                                }
                                i5 += k09Var3.e.g;
                                if (i33 < i15 && i33 < i) {
                                    i5 += -k09Var3.i.f;
                                }
                            }
                        }
                    } else {
                        i3 = i32;
                    }
                    i8 = 2;
                    if (this.l == 2 && i27 == 0) {
                        i7 = 0;
                        this.l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i24;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i13) {
                    this.l = i8;
                }
                if (i4 > 0 && i3 == 0 && i14 == i) {
                    this.l = i8;
                }
                int i34 = this.l;
                if (i34 == 1) {
                    int i35 = i4 > 1 ? (i13 - i5) / (i4 - 1) : i4 == 1 ? (i13 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i35 = i7;
                    }
                    int i36 = i6;
                    for (int i37 = i7; i37 < size; i37++) {
                        k09 k09Var4 = (k09) arrayList.get(z ? size - (i37 + 1) : i37);
                        m31 m31Var3 = k09Var4.b;
                        si1 si1Var3 = k09Var4.i;
                        si1 si1Var4 = k09Var4.h;
                        if (m31Var3.g0 == 8) {
                            si1Var4.d(i36);
                            si1Var3.d(i36);
                        } else {
                            if (i37 > 0) {
                                i36 = z ? i36 - i35 : i36 + i35;
                            }
                            if (i37 > 0 && i37 >= i14) {
                                i36 = z ? i36 - si1Var4.f : i36 + si1Var4.f;
                            }
                            if (z) {
                                si1Var3.d(i36);
                            } else {
                                si1Var4.d(i36);
                            }
                            zo1 zo1Var3 = k09Var4.e;
                            int i38 = zo1Var3.g;
                            if (k09Var4.d == 3 && k09Var4.a == 1) {
                                i38 = zo1Var3.m;
                            }
                            i36 = z ? i36 - i38 : i36 + i38;
                            if (z) {
                                si1Var4.d(i36);
                            } else {
                                si1Var3.d(i36);
                            }
                            k09Var4.g = true;
                            if (i37 < i15 && i37 < i) {
                                i36 = z ? i36 - (-si1Var3.f) : i36 + (-si1Var3.f);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 0) {
                    int i39 = (i13 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i39 = i7;
                    }
                    int i40 = i6;
                    for (int i41 = i7; i41 < size; i41++) {
                        k09 k09Var5 = (k09) arrayList.get(z ? size - (i41 + 1) : i41);
                        m31 m31Var4 = k09Var5.b;
                        si1 si1Var5 = k09Var5.i;
                        si1 si1Var6 = k09Var5.h;
                        if (m31Var4.g0 == 8) {
                            si1Var6.d(i40);
                            si1Var5.d(i40);
                        } else {
                            int i42 = z ? i40 - i39 : i40 + i39;
                            if (i41 > 0 && i41 >= i14) {
                                i42 = z ? i42 - si1Var6.f : i42 + si1Var6.f;
                            }
                            if (z) {
                                si1Var5.d(i42);
                            } else {
                                si1Var6.d(i42);
                            }
                            zo1 zo1Var4 = k09Var5.e;
                            int iMin = zo1Var4.g;
                            if (k09Var5.d == 3 && k09Var5.a == 1) {
                                iMin = Math.min(iMin, zo1Var4.m);
                            }
                            i40 = z ? i42 - iMin : i42 + iMin;
                            if (z) {
                                si1Var6.d(i40);
                            } else {
                                si1Var5.d(i40);
                            }
                            if (i41 < i15 && i41 < i) {
                                i40 = z ? i40 - (-si1Var5.f) : i40 + (-si1Var5.f);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 2) {
                    int i43 = this.f;
                    m31 m31Var5 = this.b;
                    float f8 = i43 == 0 ? m31Var5.d0 : m31Var5.e0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i44 = (int) (((i13 - i5) * f8) + f2);
                    if (i44 < 0 || i3 > 0) {
                        i44 = i7;
                    }
                    int i45 = z ? i6 - i44 : i6 + i44;
                    for (int i46 = i7; i46 < size; i46++) {
                        k09 k09Var6 = (k09) arrayList.get(z ? size - (i46 + 1) : i46);
                        m31 m31Var6 = k09Var6.b;
                        si1 si1Var7 = k09Var6.i;
                        si1 si1Var8 = k09Var6.h;
                        if (m31Var6.g0 == 8) {
                            si1Var8.d(i45);
                            si1Var7.d(i45);
                        } else {
                            if (i46 > 0 && i46 >= i14) {
                                i45 = z ? i45 - si1Var8.f : i45 + si1Var8.f;
                            }
                            if (z) {
                                si1Var7.d(i45);
                            } else {
                                si1Var8.d(i45);
                            }
                            zo1 zo1Var5 = k09Var6.e;
                            int i47 = zo1Var5.g;
                            if (k09Var6.d == 3 && k09Var6.a == 1) {
                                i47 = zo1Var5.m;
                            }
                            i45 = z ? i45 - i47 : i45 + i47;
                            if (z) {
                                si1Var8.d(i45);
                            } else {
                                si1Var7.d(i45);
                            }
                            if (i46 < i15 && i46 < i) {
                                i45 = z ? i45 - (-si1Var7.f) : i45 + (-si1Var7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.k09
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((k09) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        m31 m31Var = ((k09) arrayList.get(0)).b;
        m31 m31Var2 = ((k09) arrayList.get(size - 1)).b;
        int i = this.f;
        si1 si1Var = this.i;
        si1 si1Var2 = this.h;
        if (i == 0) {
            u21 u21Var = m31Var.I;
            u21 u21Var2 = m31Var2.K;
            si1 si1VarI = k09.i(u21Var, 0);
            int iE = u21Var.e();
            m31 m31VarM = m();
            if (m31VarM != null) {
                iE = m31VarM.I.e();
            }
            if (si1VarI != null) {
                k09.b(si1Var2, si1VarI, iE);
            }
            si1 si1VarI2 = k09.i(u21Var2, 0);
            int iE2 = u21Var2.e();
            m31 m31VarN = n();
            if (m31VarN != null) {
                iE2 = m31VarN.K.e();
            }
            if (si1VarI2 != null) {
                k09.b(si1Var, si1VarI2, -iE2);
            }
        } else {
            u21 u21Var3 = m31Var.J;
            u21 u21Var4 = m31Var2.L;
            si1 si1VarI3 = k09.i(u21Var3, 1);
            int iE3 = u21Var3.e();
            m31 m31VarM2 = m();
            if (m31VarM2 != null) {
                iE3 = m31VarM2.J.e();
            }
            if (si1VarI3 != null) {
                k09.b(si1Var2, si1VarI3, iE3);
            }
            si1 si1VarI4 = k09.i(u21Var4, 1);
            int iE4 = u21Var4.e();
            m31 m31VarN2 = n();
            if (m31VarN2 != null) {
                iE4 = m31VarN2.L.e();
            }
            if (si1VarI4 != null) {
                k09.b(si1Var, si1VarI4, -iE4);
            }
        }
        si1Var2.a = this;
        si1Var.a = this;
    }

    @Override // defpackage.k09
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((k09) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // defpackage.k09
    public final void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((k09) it.next()).f();
        }
    }

    @Override // defpackage.k09
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            k09 k09Var = (k09) arrayList.get(i);
            j = ((long) k09Var.i.f) + k09Var.j() + j + ((long) k09Var.h.f);
        }
        return j;
    }

    @Override // defpackage.k09
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((k09) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final m31 m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            m31 m31Var = ((k09) arrayList.get(i)).b;
            if (m31Var.g0 != 8) {
                return m31Var;
            }
            i++;
        }
    }

    public final m31 n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m31 m31Var = ((k09) arrayList.get(size)).b;
            if (m31Var.g0 != 8) {
                return m31Var;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        for (k09 k09Var : this.k) {
            sb.append("<");
            sb.append(k09Var);
            sb.append("> ");
        }
        return sb.toString();
    }
}
