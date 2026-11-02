package defpackage;

import android.os.Trace;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ai2 extends jx4 implements s01, w85, nx4, nh1 {
    public final rn2 q0;
    public boolean r0;
    public boolean s0;
    public final byte t0;
    public Integer u0;
    public f63 v0;

    /* JADX WARN: Multi-variable type inference failed */
    public ai2(int i, rn2 rn2Var, int i2) {
        this.q0 = (i2 & 4) != 0 ? null : rn2Var;
        this.t0 = i;
    }

    public static boolean h1(ai2 ai2Var) {
        return ai2Var.g1(7);
    }

    @Override // defpackage.jx4
    public final boolean N0() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    @Override // defpackage.jx4
    public final void R0() {
        int iOrdinal = d1().ordinal();
        if (iOrdinal == 0) {
            gh2 gh2Var = (gh2) yn0.a0(this).getFocusOwner();
            gh2Var.b(8, true, false);
            gh2Var.d.a();
        } else if (iOrdinal == 1) {
            yn0.a0(this).getFocusOwner();
            u15.l(this);
        } else if (iOrdinal == 2) {
            gh2 gh2Var2 = (gh2) yn0.a0(this).getFocusOwner();
            gh2Var2.b(8, true, false);
            gh2Var2.d.a();
        } else if (iOrdinal != 3) {
            b61.c();
            return;
        }
        this.u0 = null;
        f63 f63Var = this.v0;
        if (f63Var != null) {
            f63Var.D();
        }
        this.v0 = null;
    }

    @Override // defpackage.jx4
    public final void S0() {
        if (d1().b()) {
            ((gh2) yn0.a0(this).getFocusOwner()).b(8, true, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x01d2 A[PHI: r16
  0x01d2: PHI (r16v2 c15) = (r16v1 c15), (r16v1 c15), (r16v1 c15), (r16v4 c15) binds: [B:100:0x0182, B:102:0x0188, B:104:0x018c, B:121:0x01c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:163:0x026f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0276 A[ADDED_TO_REGION, LOOP:9: B:165:0x0276->B:172:0x0288, LOOP_START, PHI: r14
  0x0276: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:164:0x0274, B:172:0x0288] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:166:0x0278  */
    /* JADX WARN: Code duplicated, block: B:169:0x0283 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x0285  */
    /* JADX WARN: Code duplicated, block: B:171:0x0287  */
    /* JADX WARN: Code duplicated, block: B:173:0x028e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0296  */
    /* JADX WARN: Code duplicated, block: B:180:0x02a1 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:208:0x020f A[SYNTHETIC] */
    public final boolean Y0() {
        c15 c15Var;
        int i;
        ai2 ai2Var;
        yh2 yh2Var;
        t6 t6Var;
        boolean z;
        t6 t6Var2;
        int iOrdinal = os4.D(this).ordinal();
        if (iOrdinal == 0) {
            gh2 gh2Var = (gh2) yn0.a0(this).getFocusOwner();
            ai2 ai2VarF = gh2Var.f();
            yh2 yh2VarD1 = d1();
            if (ai2VarF == this) {
                Z0(yh2VarD1, yh2VarD1);
                return true;
            }
            if (ai2VarF != null || ((gh2) yn0.a0(this).getFocusOwner()).a.B()) {
                if (ai2VarF != null) {
                    c15Var = new c15(0, new ai2[16]);
                    if (!ai2VarF.X.p0) {
                        wc3.b("visitAncestors called on an unattached node");
                    }
                    jx4 jx4Var = ai2VarF.X.g0;
                    LayoutNode layoutNodeZ = yn0.Z(ai2VarF);
                    while (layoutNodeZ != null) {
                        if ((((jx4) layoutNodeZ.H0.i0).f0 & 1024) != 0) {
                            while (jx4Var != null) {
                                if ((jx4Var.Z & 1024) != 0) {
                                    jx4 jx4VarT = jx4Var;
                                    c15 c15Var2 = null;
                                    while (jx4VarT != null) {
                                        if (jx4VarT instanceof ai2) {
                                            c15Var.b((ai2) jx4VarT);
                                        } else if ((jx4VarT.Z & 1024) != 0 && (jx4VarT instanceof oh1)) {
                                            int i2 = 0;
                                            for (jx4 jx4Var2 = ((oh1) jx4VarT).r0; jx4Var2 != null; jx4Var2 = jx4Var2.h0) {
                                                if ((jx4Var2.Z & 1024) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        jx4VarT = jx4Var2;
                                                    } else {
                                                        if (c15Var2 == null) {
                                                            c15Var2 = new c15(0, new jx4[16]);
                                                        }
                                                        if (jx4VarT != null) {
                                                            c15Var2.b(jx4VarT);
                                                            jx4VarT = null;
                                                        }
                                                        c15Var2.b(jx4Var2);
                                                    }
                                                }
                                            }
                                            if (i2 == 1) {
                                            }
                                        }
                                        jx4VarT = yn0.T(c15Var2);
                                    }
                                }
                                jx4Var = jx4Var.g0;
                            }
                        }
                        layoutNodeZ = layoutNodeZ.w();
                        jx4Var = (layoutNodeZ == null || (t6Var2 = layoutNodeZ.H0) == null) ? null : (f18) t6Var2.h0;
                    }
                } else {
                    c15Var = null;
                }
                Object[] objArr = new ai2[16];
                Object[] objArr2 = new ai2[16];
                if (!this.X.p0) {
                    wc3.b("visitAncestors called on an unattached node");
                }
                jx4 jx4Var3 = this.X.g0;
                LayoutNode layoutNodeZ2 = yn0.Z(this);
                int i3 = 0;
                int i4 = 0;
                boolean z2 = true;
                while (layoutNodeZ2 != null) {
                    if ((((jx4) layoutNodeZ2.H0.i0).f0 & 1024) != 0) {
                        while (jx4Var3 != null) {
                            if ((jx4Var3.Z & 1024) != 0) {
                                jx4 jx4VarT2 = jx4Var3;
                                c15 c15Var3 = null;
                                while (jx4VarT2 != null) {
                                    if (jx4VarT2 instanceof ai2) {
                                        ai2 ai2Var2 = (ai2) jx4VarT2;
                                        if (dh3.f(c15Var != null ? Boolean.valueOf(c15Var.j(ai2Var2)) : null, Boolean.TRUE)) {
                                            int i5 = i3 + 1;
                                            if (objArr.length < i5) {
                                                int length = objArr.length;
                                                Object[] objArr3 = new Object[Math.max(i5, length * 2)];
                                                System.arraycopy(objArr, 0, objArr3, 0, length);
                                                objArr = objArr3;
                                            }
                                            objArr[i3] = ai2Var2;
                                            i3 = i5;
                                        } else {
                                            gh2Var = gh2Var;
                                            int i6 = i4 + 1;
                                            if (objArr2.length < i6) {
                                                int length2 = objArr2.length;
                                                Object[] objArr4 = new Object[Math.max(i6, length2 * 2)];
                                                System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                                objArr2 = objArr4;
                                            }
                                            objArr2[i4] = ai2Var2;
                                            i4 = i6;
                                        }
                                        if (ai2Var2 == ai2VarF) {
                                            z2 = false;
                                        }
                                        z = false;
                                    } else {
                                        gh2Var = gh2Var;
                                        z = true;
                                    }
                                    if (z && (jx4VarT2.Z & 1024) != 0 && (jx4VarT2 instanceof oh1)) {
                                        int i7 = 0;
                                        for (jx4 jx4Var4 = ((oh1) jx4VarT2).r0; jx4Var4 != null; jx4Var4 = jx4Var4.h0) {
                                            if ((jx4Var4.Z & 1024) != 0) {
                                                int i8 = i7 + 1;
                                                if (i8 == 1) {
                                                    jx4VarT2 = jx4Var4;
                                                    i8 = i8;
                                                } else {
                                                    c15 c15Var4 = c15Var3 == null ? new c15(0, new jx4[16]) : c15Var3;
                                                    if (jx4VarT2 != null) {
                                                        c15Var4.b(jx4VarT2);
                                                        jx4VarT2 = null;
                                                    }
                                                    c15Var4.b(jx4Var4);
                                                    c15Var3 = c15Var4;
                                                }
                                                i7 = i8;
                                            }
                                        }
                                        if (i7 != 1) {
                                            jx4VarT2 = yn0.T(c15Var3);
                                        }
                                    } else {
                                        jx4VarT2 = yn0.T(c15Var3);
                                    }
                                }
                            }
                            jx4Var3 = jx4Var3.g0;
                            gh2Var = gh2Var;
                        }
                    }
                    gh2 gh2Var2 = gh2Var;
                    layoutNodeZ2 = layoutNodeZ2.w();
                    jx4Var3 = (layoutNodeZ2 == null || (t6Var = layoutNodeZ2.H0) == null) ? null : (f18) t6Var.h0;
                    gh2Var = gh2Var2;
                }
                gh2 gh2Var3 = gh2Var;
                if (!z2 || ai2VarF == null || os4.F(ai2VarF, false)) {
                    ch3.N(this, new tb2(this, (byte) 1));
                    int iOrdinal2 = d1().ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 == 1) {
                            ((gh2) yn0.a0(this).getFocusOwner()).i(this);
                        } else if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                b61.c();
                                return false;
                            }
                            ((gh2) yn0.a0(this).getFocusOwner()).i(this);
                        }
                    }
                    yh2 yh2Var2 = yh2.Z;
                    yh2 yh2Var3 = yh2.X;
                    if (z2 && ai2VarF != null) {
                        ai2VarF.Z0(yh2Var3, yh2Var2);
                    }
                    yh2 yh2Var4 = yh2.Y;
                    if (c15Var != null) {
                        int i9 = c15Var.Z - 1;
                        Object[] objArr5 = c15Var.X;
                        if (i9 < objArr5.length) {
                            while (i9 >= 0) {
                                ai2 ai2Var3 = (ai2) objArr5[i9];
                                if (gh2Var3.f() == this) {
                                    ai2Var3.Z0(yh2Var4, yh2Var2);
                                    i9--;
                                }
                            }
                            i = i4 - 1;
                            if (i < objArr2.length) {
                                while (i >= 0) {
                                    ai2Var = (ai2) objArr2[i];
                                    if (gh2Var3.f() == this) {
                                        if (ai2Var == ai2VarF) {
                                            yh2Var = yh2Var3;
                                        } else {
                                            yh2Var = yh2Var2;
                                        }
                                        ai2Var.Z0(yh2Var, yh2Var4);
                                        i--;
                                    }
                                }
                                if (gh2Var3.f() == this) {
                                    Z0(yh2VarD1, yh2Var3);
                                    if (gh2Var3.f() != this) {
                                        return true;
                                    }
                                }
                            } else if (gh2Var3.f() == this) {
                                Z0(yh2VarD1, yh2Var3);
                                if (gh2Var3.f() != this) {
                                    return true;
                                }
                            }
                        } else {
                            i = i4 - 1;
                            if (i < objArr2.length) {
                                while (i >= 0) {
                                    ai2Var = (ai2) objArr2[i];
                                    if (gh2Var3.f() == this) {
                                        if (ai2Var == ai2VarF) {
                                            yh2Var = yh2Var3;
                                        } else {
                                            yh2Var = yh2Var2;
                                        }
                                        ai2Var.Z0(yh2Var, yh2Var4);
                                        i--;
                                    }
                                }
                                if (gh2Var3.f() == this) {
                                    Z0(yh2VarD1, yh2Var3);
                                    if (gh2Var3.f() != this) {
                                        return true;
                                    }
                                }
                            } else if (gh2Var3.f() == this) {
                                Z0(yh2VarD1, yh2Var3);
                                if (gh2Var3.f() != this) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        i = i4 - 1;
                        if (i < objArr2.length) {
                            while (i >= 0) {
                                ai2Var = (ai2) objArr2[i];
                                if (gh2Var3.f() == this) {
                                    if (ai2Var == ai2VarF) {
                                        yh2Var = yh2Var3;
                                    } else {
                                        yh2Var = yh2Var2;
                                    }
                                    ai2Var.Z0(yh2Var, yh2Var4);
                                    i--;
                                }
                            }
                            if (gh2Var3.f() == this) {
                                Z0(yh2VarD1, yh2Var3);
                                if (gh2Var3.f() != this) {
                                    return true;
                                }
                            }
                        } else if (gh2Var3.f() == this) {
                            Z0(yh2VarD1, yh2Var3);
                            if (gh2Var3.f() != this) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return true;
            }
            if (iOrdinal != 3) {
                b61.c();
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [jx4] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [jx4] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [c15] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [c15] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void Z0(yh2 yh2Var, yh2 yh2Var2) {
        t6 t6Var;
        rn2 rn2Var;
        gh2 gh2Var = (gh2) yn0.a0(this).getFocusOwner();
        ai2 ai2VarF = gh2Var.f();
        if (!yh2Var.equals(yh2Var2) && (rn2Var = this.q0) != null) {
            rn2Var.K(yh2Var, yh2Var2);
        }
        jx4 jx4Var = this.X;
        if (!jx4Var.p0) {
            wc3.b("visitAncestors called on an unattached node");
        }
        jx4 jx4Var2 = this.X;
        LayoutNode layoutNodeZ = yn0.Z(this);
        while (layoutNodeZ != null) {
            if ((((jx4) layoutNodeZ.H0.i0).f0 & 5120) != 0) {
                while (jx4Var2 != null) {
                    int i = jx4Var2.Z;
                    if ((i & 5120) != 0) {
                        if (jx4Var2 != jx4Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? T = jx4Var2;
                            ?? c15Var = 0;
                            while (T != 0) {
                                if (T instanceof vg2) {
                                    vg2 vg2Var = (vg2) T;
                                    if (ai2VarF == gh2Var.f()) {
                                        vg2Var.H(yh2Var2);
                                    }
                                } else if ((T.Z & 4096) != 0 && (T instanceof oh1)) {
                                    jx4 jx4Var3 = ((oh1) T).r0;
                                    int i2 = 0;
                                    T = T;
                                    c15Var = c15Var;
                                    while (jx4Var3 != null) {
                                        if ((jx4Var3.Z & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                c15Var = c15Var;
                                                T = jx4Var3;
                                            } else {
                                                if (c15Var == 0) {
                                                    c15Var = new c15(0, new jx4[16]);
                                                }
                                                if (T != 0) {
                                                    c15Var.b(T);
                                                    T = 0;
                                                }
                                                c15Var.b(jx4Var3);
                                            }
                                        }
                                        jx4Var3 = jx4Var3.h0;
                                        T = T;
                                        c15Var = c15Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                T = yn0.T(c15Var);
                            }
                        }
                    }
                    jx4Var2 = jx4Var2.g0;
                }
            }
            layoutNodeZ = layoutNodeZ.w();
            jx4Var2 = (layoutNodeZ == null || (t6Var = layoutNodeZ.H0) == null) ? null : (f18) t6Var.h0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [jx4] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [jx4] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [c15] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [c15] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final jh2 a1() {
        boolean z;
        t6 t6Var;
        jh2 jh2Var = new jh2();
        jh2Var.a = true;
        oh2 oh2Var = oh2.b;
        jh2Var.b = oh2Var;
        jh2Var.c = oh2Var;
        jh2Var.d = oh2Var;
        jh2Var.e = oh2Var;
        jh2Var.f = oh2Var;
        jh2Var.g = oh2Var;
        jh2Var.h = oh2Var;
        jh2Var.i = oh2Var;
        jh2Var.j = new ya2((byte) 8);
        jh2Var.k = new ya2((byte) 9);
        jh2Var.l = oy1.A0;
        byte b = this.t0;
        if (b == 1) {
            z = true;
        } else if (b == 0) {
            z = !(((xd3) ((zd3) ((yd3) hi5.W(this, y01.m))).a.getValue()).a == 1);
        } else {
            if (b != 2) {
                bt.i("Unknown Focusability");
                return null;
            }
            z = false;
        }
        jh2Var.a = z;
        jx4 jx4Var = this.X;
        if (!jx4Var.p0) {
            wc3.b("visitAncestors called on an unattached node");
        }
        jx4 jx4Var2 = this.X;
        LayoutNode layoutNodeZ = yn0.Z(this);
        loop0: while (layoutNodeZ != null) {
            if ((((jx4) layoutNodeZ.H0.i0).f0 & 3072) != 0) {
                while (jx4Var2 != null) {
                    int i = jx4Var2.Z;
                    if ((i & 3072) != 0) {
                        if (jx4Var2 != jx4Var && (i & 1024) != 0) {
                            break loop0;
                        }
                        if ((i & 2048) != 0) {
                            ?? c15Var = 0;
                            ?? T = jx4Var2;
                            while (T != 0) {
                                if (T instanceof lh2) {
                                    ((lh2) T).E(jh2Var);
                                } else if ((T.Z & 2048) != 0 && (T instanceof oh1)) {
                                    jx4 jx4Var3 = ((oh1) T).r0;
                                    int i2 = 0;
                                    while (jx4Var3 != null) {
                                        if ((jx4Var3.Z & 2048) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                T = T;
                                                c15Var = c15Var;
                                                c15Var = c15Var;
                                                T = jx4Var3;
                                            } else {
                                                if (c15Var == 0) {
                                                    c15Var = new c15(0, new jx4[16]);
                                                }
                                                if (T != 0) {
                                                    c15Var.b(T);
                                                    T = 0;
                                                }
                                                c15Var.b(jx4Var3);
                                            }
                                        } else {
                                            T = T;
                                            c15Var = c15Var;
                                        }
                                        jx4Var3 = jx4Var3.h0;
                                        T = T;
                                        c15Var = c15Var;
                                    }
                                    if (i2 == 1) {
                                        T = T;
                                        c15Var = c15Var;
                                    } else {
                                        T = T;
                                        c15Var = c15Var;
                                    }
                                }
                                T = yn0.T(c15Var);
                            }
                        }
                    }
                    jx4Var2 = jx4Var2.g0;
                }
            }
            layoutNodeZ = layoutNodeZ.w();
            jx4Var2 = (layoutNodeZ == null || (t6Var = layoutNodeZ.H0) == null) ? null : (f18) t6Var.h0;
        }
        return jh2Var;
    }

    public final s86 b1(y24 y24Var) {
        s86 s86Var = a1().l;
        if (s86Var != oy1.A0) {
            return y24Var == null ? s86Var : s86Var.k(y24Var.F(yn0.Y(this), 0L));
        }
        return y24Var != null ? y24Var.H(yn0.Y(this), false) : u70.n(0L, u15.R(yn0.Y(this).Z));
    }

    public final v54 c1() {
        t6 t6Var;
        Object obj;
        if (!this.X.p0) {
            wc3.b("visitAncestors called on an unattached node");
        }
        jx4 jx4Var = this.X.g0;
        LayoutNode layoutNodeZ = yn0.Z(this);
        loop0: while (layoutNodeZ != null) {
            if ((((jx4) layoutNodeZ.H0.i0).f0 & 8388640) != 0) {
                while (jx4Var != null) {
                    int i = jx4Var.Z;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(jx4Var instanceof v54)) {
                                if (jx4Var instanceof oh1) {
                                    jx4Var = null;
                                    for (jx4 jx4Var2 = ((oh1) jx4Var).r0; jx4Var2 != null; jx4Var2 = jx4Var2.h0) {
                                        if (jx4Var2 instanceof v54) {
                                            jx4Var = jx4Var2;
                                        }
                                    }
                                } else {
                                    jx4Var = null;
                                }
                            }
                            v54 v54Var = (v54) jx4Var;
                            if (v54Var != null) {
                                return v54Var;
                            }
                        } else if ((i & 32) == 0) {
                            continue;
                        } else {
                            if (jx4Var instanceof nx4) {
                                obj = jx4Var;
                            } else if (jx4Var instanceof oh1) {
                                obj = null;
                                for (jx4 jx4Var3 = ((oh1) jx4Var).r0; jx4Var3 != null; jx4Var3 = jx4Var3.h0) {
                                    if (jx4Var3 instanceof nx4) {
                                        obj = jx4Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            nx4 nx4Var = (nx4) obj;
                            if (nx4Var != null) {
                                wl7 wl7VarZ = nx4Var.Z();
                                r06 r06Var = jb5.X;
                                if (wl7VarZ.v(r06Var)) {
                                    return (v54) nx4Var.Z().C(r06Var);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    jx4Var = jx4Var.g0;
                }
            }
            layoutNodeZ = layoutNodeZ.w();
            jx4Var = (layoutNodeZ == null || (t6Var = layoutNodeZ.H0) == null) ? null : (f18) t6Var.h0;
        }
        return null;
    }

    public final yh2 d1() {
        ai2 ai2VarF;
        t6 t6Var;
        boolean z = this.p0;
        yh2 yh2Var = yh2.Z;
        if (!z || (ai2VarF = ((gh2) yn0.a0(this).getFocusOwner()).f()) == null) {
            return yh2Var;
        }
        if (this == ai2VarF) {
            return yh2.X;
        }
        if (ai2VarF.p0) {
            if (!ai2VarF.X.p0) {
                wc3.b("visitAncestors called on an unattached node");
            }
            jx4 jx4Var = ai2VarF.X.g0;
            LayoutNode layoutNodeZ = yn0.Z(ai2VarF);
            while (layoutNodeZ != null) {
                if ((((jx4) layoutNodeZ.H0.i0).f0 & 1024) != 0) {
                    while (jx4Var != null) {
                        if ((jx4Var.Z & 1024) != 0) {
                            jx4 jx4VarT = jx4Var;
                            c15 c15Var = null;
                            while (jx4VarT != null) {
                                if (jx4VarT instanceof ai2) {
                                    if (this == ((ai2) jx4VarT)) {
                                        return yh2.Y;
                                    }
                                } else if ((jx4VarT.Z & 1024) != 0 && (jx4VarT instanceof oh1)) {
                                    int i = 0;
                                    for (jx4 jx4Var2 = ((oh1) jx4VarT).r0; jx4Var2 != null; jx4Var2 = jx4Var2.h0) {
                                        if ((jx4Var2.Z & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                jx4VarT = jx4Var2;
                                            } else {
                                                if (c15Var == null) {
                                                    c15Var = new c15(0, new jx4[16]);
                                                }
                                                if (jx4VarT != null) {
                                                    c15Var.b(jx4VarT);
                                                    jx4VarT = null;
                                                }
                                                c15Var.b(jx4Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                jx4VarT = yn0.T(c15Var);
                            }
                        }
                        jx4Var = jx4Var.g0;
                    }
                }
                layoutNodeZ = layoutNodeZ.w();
                jx4Var = (layoutNodeZ == null || (t6Var = layoutNodeZ.H0) == null) ? null : (f18) t6Var.h0;
            }
        }
        return yh2Var;
    }

    public final void e1() {
        int iOrdinal = d1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                b61.c();
                return;
            }
        }
        ea6 ea6Var = new ea6();
        ch3.N(this, new p5(ea6Var, this, (byte) 23));
        Object obj = ea6Var.X;
        if (obj == null) {
            dh3.T("focusProperties");
            throw null;
        }
        if (((hh2) obj).b()) {
            return;
        }
        ((gh2) yn0.a0(this).getFocusOwner()).b(8, true, true);
    }

    public final boolean g1(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return a1().a ? Y0() : gs8.h(this, i, new ya2(i));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.w85
    public final void q0() {
        e1();
    }

    @Override // defpackage.jx4
    public final void Q0() {
    }

    public final void f1() {
    }
}
