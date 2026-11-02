package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class we2 {
    public int a;
    public u21 d;
    public u21 e;
    public u21 f;
    public u21 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ ye2 r;
    public m31 b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public we2(ye2 ye2Var, int i, u21 u21Var, u21 u21Var2, u21 u21Var3, u21 u21Var4, int i2) {
        this.r = ye2Var;
        this.a = i;
        this.d = u21Var;
        this.e = u21Var2;
        this.f = u21Var3;
        this.g = u21Var4;
        this.h = ye2Var.w0;
        this.i = ye2Var.s0;
        this.j = ye2Var.x0;
        this.k = ye2Var.t0;
        this.q = i2;
    }

    public final void a(m31 m31Var) {
        int i = this.a;
        int i2 = this.q;
        ye2 ye2Var = this.r;
        if (i == 0) {
            int iU = ye2Var.U(m31Var, i2);
            if (m31Var.p0[0] == 3) {
                this.p++;
                iU = 0;
            }
            this.l = iU + (m31Var.g0 != 8 ? ye2Var.P0 : 0) + this.l;
            int iT = ye2Var.T(m31Var, this.q);
            if (this.b == null || this.c < iT) {
                this.b = m31Var;
                this.c = iT;
                this.m = iT;
            }
        } else {
            int iU2 = ye2Var.U(m31Var, i2);
            int iT2 = ye2Var.T(m31Var, this.q);
            if (m31Var.p0[1] == 3) {
                this.p++;
                iT2 = 0;
            }
            this.m = iT2 + (m31Var.g0 != 8 ? ye2Var.Q0 : 0) + this.m;
            if (this.b == null || this.c < iU2) {
                this.b = m31Var;
                this.c = iU2;
                this.l = iU2;
            }
        }
        this.o++;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0105 A[PHI: r5 r9
  0x0105: PHI (r5v25 int) = (r5v23 int), (r5v26 int) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]
  0x0105: PHI (r9v24 float) = (r9v22 float), (r9v27 float) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    public final void b(int i, boolean z, boolean z2) {
        ye2 ye2Var;
        int i2;
        int i3;
        m31 m31Var;
        boolean z3;
        char c;
        int i4;
        float f;
        int i5;
        int i6 = this.o;
        int i7 = 0;
        while (true) {
            ye2Var = this.r;
            if (i7 >= i6 || (i5 = this.n + i7) >= ye2Var.b1) {
                break;
            }
            m31 m31Var2 = ye2Var.a1[i5];
            if (m31Var2 != null) {
                m31Var2.D();
            }
            i7++;
        }
        if (i6 == 0 || this.b == null) {
            return;
        }
        boolean z4 = z2 && i == 0;
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = this.n + (z ? (i6 - 1) - i10 : i10);
            if (i11 >= ye2Var.b1) {
                break;
            }
            m31 m31Var3 = ye2Var.a1[i11];
            if (m31Var3 != null && m31Var3.g0 == 0) {
                if (i8 == -1) {
                    i8 = i10;
                }
                i9 = i10;
            }
        }
        int i12 = this.a;
        m31 m31Var4 = this.b;
        if (i12 == 0) {
            m31Var4.j0 = ye2Var.E0;
            u21 u21Var = m31Var4.L;
            u21 u21Var2 = m31Var4.J;
            int i13 = this.i;
            if (i > 0) {
                i13 += ye2Var.Q0;
            }
            u21Var2.a(this.e, i13);
            if (z2) {
                u21Var.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.d.L.a(u21Var2, 0);
            }
            if (ye2Var.S0 != 3 || m31Var4.E) {
                m31Var = m31Var4;
                break;
            }
            int i14 = 0;
            while (true) {
                if (i14 < i6) {
                    int i15 = this.n + (z ? (i6 - 1) - i14 : i14);
                    if (i15 < ye2Var.b1) {
                        m31Var = ye2Var.a1[i15];
                        if (m31Var.E) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
                m31Var = m31Var4;
                break;
            }
            int i16 = 0;
            m31 m31Var5 = null;
            while (i16 < i6) {
                int i17 = z ? (i6 - 1) - i16 : i16;
                int i18 = this.n + i17;
                if (i18 >= ye2Var.b1) {
                    return;
                }
                m31 m31Var6 = ye2Var.a1[i18];
                if (m31Var6 == null) {
                    i6 = i6;
                    z3 = z4;
                    i9 = i9;
                    c = 3;
                } else {
                    u21 u21Var3 = m31Var6.J;
                    u21 u21Var4 = m31Var6.L;
                    u21 u21Var5 = m31Var6.I;
                    z3 = z4;
                    if (i16 == 0) {
                        m31Var6.f(u21Var5, this.d, this.h);
                    }
                    if (i17 == 0) {
                        int i19 = ye2Var.D0;
                        float f2 = ye2Var.J0;
                        if (z) {
                            f2 = 1.0f - f2;
                        }
                        if (this.n == 0 && (i4 = ye2Var.F0) != -1) {
                            f = ye2Var.L0;
                            if (z) {
                                f = 1.0f - f;
                            }
                        } else if (!z2 || (i4 = ye2Var.H0) == -1) {
                            i4 = i19;
                            f = f2;
                        } else {
                            f = ye2Var.N0;
                            if (z) {
                                f = 1.0f - f;
                            }
                        }
                        m31Var6.i0 = i4;
                        m31Var6.d0 = f;
                    }
                    if (i16 == i6 - 1) {
                        m31Var6.f(m31Var6.K, this.f, this.j);
                    }
                    if (m31Var5 != null) {
                        u21 u21Var6 = m31Var5.K;
                        u21Var5.a(u21Var6, ye2Var.P0);
                        if (i16 == i8) {
                            int i20 = this.h;
                            if (u21Var5.h()) {
                                u21Var5.h = i20;
                            }
                        }
                        u21Var6.a(u21Var5, 0);
                        if (i16 == i9 + 1) {
                            int i21 = this.j;
                            if (u21Var6.h()) {
                                u21Var6.h = i21;
                            }
                        }
                    }
                    if (m31Var6 != m31Var4) {
                        int i22 = ye2Var.S0;
                        c = 3;
                        if (i22 == 3 && m31Var.E && m31Var6 != m31Var && m31Var6.E) {
                            m31Var6.M.a(m31Var.M, 0);
                        } else if (i22 == 0) {
                            u21Var3.a(u21Var2, 0);
                        } else if (i22 == 1) {
                            u21Var4.a(u21Var, 0);
                        } else if (z3) {
                            u21Var3.a(this.e, this.i);
                            u21Var4.a(this.g, this.k);
                        } else {
                            u21Var3.a(u21Var2, 0);
                            u21Var4.a(u21Var, 0);
                        }
                    } else {
                        c = 3;
                    }
                    m31Var5 = m31Var6;
                }
                i16++;
                z4 = z3;
                i9 = i9;
                i6 = i6;
            }
            return;
        }
        int i23 = i6;
        boolean z5 = z4;
        int i24 = i9;
        m31Var4.i0 = ye2Var.D0;
        u21 u21Var7 = m31Var4.I;
        u21 u21Var8 = m31Var4.K;
        int i25 = this.h;
        if (i > 0) {
            i25 += ye2Var.P0;
        }
        if (z) {
            u21Var8.a(this.f, i25);
            if (z2) {
                u21Var7.a(this.d, this.j);
            }
            if (i > 0) {
                this.f.d.I.a(u21Var8, 0);
            }
        } else {
            u21Var7.a(this.d, i25);
            if (z2) {
                u21Var8.a(this.f, this.j);
            }
            if (i > 0) {
                this.d.d.K.a(u21Var7, 0);
            }
        }
        int i26 = 0;
        m31 m31Var7 = null;
        while (true) {
            int i27 = i23;
            if (i26 >= i27 || (i2 = this.n + i26) >= ye2Var.b1) {
                return;
            }
            m31 m31Var8 = ye2Var.a1[i2];
            if (m31Var8 == null) {
                i23 = i27;
            } else {
                u21 u21Var9 = m31Var8.I;
                u21 u21Var10 = m31Var8.J;
                u21 u21Var11 = m31Var8.K;
                if (i26 == 0) {
                    m31Var8.f(u21Var10, this.e, this.i);
                    int i28 = ye2Var.E0;
                    float f3 = ye2Var.K0;
                    if (this.n == 0) {
                        int i29 = ye2Var.G0;
                        i23 = i27;
                        i3 = -1;
                        if (i29 != -1) {
                            f3 = ye2Var.M0;
                        }
                        i28 = i29;
                        m31Var8.j0 = i28;
                        m31Var8.e0 = f3;
                    } else {
                        i23 = i27;
                        i3 = -1;
                    }
                    if (z2 && (i29 = ye2Var.I0) != i3) {
                        f3 = ye2Var.O0;
                        i28 = i29;
                    }
                    m31Var8.j0 = i28;
                    m31Var8.e0 = f3;
                } else {
                    i23 = i27;
                }
                if (i26 == i23 - 1) {
                    m31Var8.f(m31Var8.L, this.g, this.k);
                }
                if (m31Var7 != null) {
                    u21 u21Var12 = m31Var7.L;
                    u21Var10.a(u21Var12, ye2Var.Q0);
                    if (i26 == i8) {
                        int i30 = this.i;
                        if (u21Var10.h()) {
                            u21Var10.h = i30;
                        }
                    }
                    u21Var12.a(u21Var10, 0);
                    if (i26 == i24 + 1) {
                        int i31 = this.k;
                        if (u21Var12.h()) {
                            u21Var12.h = i31;
                        }
                    }
                }
                if (m31Var8 != m31Var4) {
                    int i32 = ye2Var.R0;
                    if (z) {
                        if (i32 == 0) {
                            u21Var11.a(u21Var8, 0);
                        } else if (i32 == 1) {
                            u21Var9.a(u21Var7, 0);
                        } else if (i32 == 2) {
                            u21Var9.a(u21Var7, 0);
                            u21Var11.a(u21Var8, 0);
                        }
                    } else if (i32 == 0) {
                        u21Var9.a(u21Var7, 0);
                    } else if (i32 == 1) {
                        u21Var11.a(u21Var8, 0);
                    } else if (i32 == 2) {
                        if (z5) {
                            u21Var9.a(this.d, this.h);
                            u21Var11.a(this.f, this.j);
                        } else {
                            u21Var9.a(u21Var7, 0);
                            u21Var11.a(u21Var8, 0);
                        }
                    }
                }
                m31Var7 = m31Var8;
            }
            i26++;
        }
    }

    public final int c() {
        int i = this.a;
        int i2 = this.m;
        return i == 1 ? i2 - this.r.Q0 : i2;
    }

    public final int d() {
        int i = this.a;
        int i2 = this.l;
        return i == 0 ? i2 - this.r.P0 : i2;
    }

    public final void e(int i) {
        ye2 ye2Var;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            ye2Var = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= ye2Var.b1) {
                break;
            }
            m31 m31Var = ye2Var.a1[i2];
            if (this.a == 0) {
                if (m31Var != null) {
                    int[] iArr = m31Var.p0;
                    if (iArr[0] == 3 && m31Var.r == 0) {
                        ye2Var.V(1, i5, iArr[1], m31Var.k(), m31Var);
                    }
                }
            } else if (m31Var != null) {
                int[] iArr2 = m31Var.p0;
                if (iArr2[1] == 3 && m31Var.s == 0) {
                    int i7 = i5;
                    ye2Var.V(iArr2[0], m31Var.q(), 1, i7, m31Var);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i8 = this.o;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.n + i9;
            if (i10 >= ye2Var.b1) {
                return;
            }
            m31 m31Var2 = ye2Var.a1[i10];
            if (this.a == 0) {
                int iQ = m31Var2.q();
                int i11 = ye2Var.P0;
                if (m31Var2.g0 == 8) {
                    i11 = 0;
                }
                this.l = iQ + i11 + this.l;
                int iT = ye2Var.T(m31Var2, this.q);
                if (this.b == null || this.c < iT) {
                    this.b = m31Var2;
                    this.c = iT;
                    this.m = iT;
                }
            } else {
                int iU = ye2Var.U(m31Var2, this.q);
                int iT2 = ye2Var.T(m31Var2, this.q);
                int i12 = ye2Var.Q0;
                if (m31Var2.g0 == 8) {
                    i12 = 0;
                }
                this.m = iT2 + i12 + this.m;
                if (this.b == null || this.c < iU) {
                    this.b = m31Var2;
                    this.c = iU;
                    this.l = iU;
                }
            }
        }
    }

    public final void f(int i, u21 u21Var, u21 u21Var2, u21 u21Var3, u21 u21Var4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = u21Var;
        this.e = u21Var2;
        this.f = u21Var3;
        this.g = u21Var4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
