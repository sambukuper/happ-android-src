package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z25 extends jx4 implements ye8, t25 {
    public t25 q0;
    public z47 r0;
    public z25 s0;
    public final String t0;

    public z25(t25 t25Var, z47 z47Var) {
        this.q0 = t25Var;
        this.r0 = z47Var == null ? new z47((byte) 25) : z47Var;
        this.t0 = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // defpackage.t25
    public final Object B(long j, long j2, q51 q51Var) {
        x25 x25Var;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (q51Var instanceof x25) {
            x25Var = (x25) q51Var;
            int i = x25Var.j0;
            if ((i & Integer.MIN_VALUE) != 0) {
                x25Var.j0 = i - Integer.MIN_VALUE;
            } else {
                x25Var = new x25(this, (s51) q51Var);
            }
        } else {
            x25Var = new x25(this, (s51) q51Var);
        }
        x25 x25Var2 = x25Var;
        Object objB = x25Var2.h0;
        int i2 = x25Var2.j0;
        z25 z25VarZ0 = null;
        c71 c71Var = c71.X;
        if (i2 == 0) {
            w39.n0(objB);
            t25 t25Var = this.q0;
            x25Var2.f0 = j;
            x25Var2.g0 = j2;
            x25Var2.j0 = 1;
            objB = t25Var.B(j, j2, x25Var2);
            if (objB != c71Var) {
                j3 = j;
                j4 = j2;
            }
            return c71Var;
        }
        if (i2 == 1) {
            j4 = x25Var2.g0;
            j3 = x25Var2.f0;
            w39.n0(objB);
        } else {
            if (i2 != 2) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j7 = x25Var2.f0;
            w39.n0(objB);
        }
        j6 = ((tu8) objB).a;
        j5 = j7;
        return new tu8(tu8.e(j5, j6));
        j5 = ((tu8) objB).a;
        boolean z = this.p0;
        if (!z) {
            z25VarZ0 = this.s0;
        } else if (z) {
            z25VarZ0 = Z0();
        }
        if (z25VarZ0 != null) {
            long jE = tu8.e(j3, j5);
            long jD = tu8.d(j4, j5);
            x25Var2.f0 = j5;
            x25Var2.j0 = 2;
            objB = z25VarZ0.B(jE, jD, x25Var2);
            if (objB != c71Var) {
                j7 = j5;
                j6 = ((tu8) objB).a;
                j5 = j7;
            }
            return c71Var;
        }
        j6 = 0;
        return new tu8(tu8.e(j5, j6));
    }

    @Override // defpackage.t25
    public final long N(int i, long j) {
        z25 z25VarZ0 = this.p0 ? Z0() : null;
        long jN = z25VarZ0 != null ? z25VarZ0.N(i, j) : 0L;
        return z85.f(jN, this.q0.N(i, z85.e(j, jN)));
    }

    @Override // defpackage.jx4
    public final void Q0() {
        z47 z47Var = this.r0;
        z47Var.Y = this;
        z47Var.Z = null;
        this.s0 = null;
        z47Var.f0 = new tb2(this, (byte) 24);
        z47Var.g0 = M0();
    }

    @Override // defpackage.jx4
    public final void R0() {
        ea6 ea6Var = new ea6();
        ts7.h(this, new nb(ea6Var, (byte) 3));
        z25 z25Var = (z25) ((ye8) ea6Var.X);
        this.s0 = z25Var;
        z47 z47Var = this.r0;
        z47Var.Z = z25Var;
        if (((z25) z47Var.Y) == this) {
            z47Var.Y = null;
            z47Var.g0 = null;
            z47Var.f0 = zc1.b;
        }
    }

    public final b71 Y0() {
        z25 z25VarZ0 = Z0();
        b71 b71VarY0 = z25VarZ0 != null ? z25VarZ0.Y0() : null;
        if (b71VarY0 != null && gv3.E(b71VarY0)) {
            return b71VarY0;
        }
        b71 b71Var = (b71) this.r0.g0;
        if (b71Var != null) {
            return b71Var;
        }
        bt.i("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final z25 Z0() {
        t6 t6Var;
        ye8 ye8Var = null;
        if (!this.p0) {
            return null;
        }
        if (!this.X.p0) {
            wc3.b("visitAncestors called on an unattached node");
        }
        jx4 jx4Var = this.X.g0;
        LayoutNode layoutNodeZ = yn0.Z(this);
        loop0: while (layoutNodeZ != null) {
            if ((((jx4) layoutNodeZ.H0.i0).f0 & 262144) != 0) {
                while (jx4Var != null) {
                    if ((jx4Var.Z & 262144) != 0) {
                        jx4 jx4VarT = jx4Var;
                        c15 c15Var = null;
                        while (jx4VarT != null) {
                            if (jx4VarT instanceof ye8) {
                                ye8 ye8Var2 = (ye8) jx4VarT;
                                if (dh3.f(this.t0, ye8Var2.o()) && z25.class == ye8Var2.getClass()) {
                                    ye8Var = ye8Var2;
                                    break loop0;
                                }
                            }
                            if ((jx4VarT.Z & 262144) != 0 && (jx4VarT instanceof oh1)) {
                                int i = 0;
                                for (jx4 jx4Var2 = ((oh1) jx4VarT).r0; jx4Var2 != null; jx4Var2 = jx4Var2.h0) {
                                    if ((jx4Var2.Z & 262144) != 0) {
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
        return (z25) ye8Var;
    }

    @Override // defpackage.ye8
    public final Object o() {
        return this.t0;
    }

    @Override // defpackage.t25
    public final long s0(int i, long j, long j2) {
        long jS0 = this.q0.s0(i, j, j2);
        z25 z25VarZ0 = this.p0 ? Z0() : null;
        return z85.f(jS0, z25VarZ0 != null ? z25VarZ0.s0(i, z85.f(j, jS0), z85.e(j2, jS0)) : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r9 == r5) goto L27;
     */
    @Override // defpackage.t25
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z0(long r7, defpackage.q51 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.y25
            if (r0 == 0) goto L13
            r0 = r9
            y25 r0 = (defpackage.y25) r0
            int r1 = r0.i0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i0 = r1
            goto L1a
        L13:
            y25 r0 = new y25
            s51 r9 = (defpackage.s51) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.g0
            int r1 = r0.i0
            r2 = 0
            r3 = 2
            r4 = 1
            c71 r5 = defpackage.c71.X
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            long r6 = r0.f0
            defpackage.w39.n0(r9)
            goto L6c
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.bt.i(r6)
            return r2
        L35:
            long r7 = r0.f0
            defpackage.w39.n0(r9)
            goto L53
        L3b:
            defpackage.w39.n0(r9)
            boolean r9 = r6.p0
            if (r9 == 0) goto L46
            z25 r2 = r6.Z0()
        L46:
            if (r2 == 0) goto L58
            r0.f0 = r7
            r0.i0 = r4
            java.lang.Object r9 = r2.z0(r7, r0)
            if (r9 != r5) goto L53
            goto L6a
        L53:
            tu8 r9 = (defpackage.tu8) r9
            long r1 = r9.a
            goto L5a
        L58:
            r1 = 0
        L5a:
            t25 r6 = r6.q0
            long r7 = defpackage.tu8.d(r7, r1)
            r0.f0 = r1
            r0.i0 = r3
            java.lang.Object r9 = r6.z0(r7, r0)
            if (r9 != r5) goto L6b
        L6a:
            return r5
        L6b:
            r6 = r1
        L6c:
            tu8 r9 = (defpackage.tu8) r9
            long r8 = r9.a
            long r6 = defpackage.tu8.e(r6, r8)
            tu8 r8 = new tu8
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z25.z0(long, q51):java.lang.Object");
    }
}
