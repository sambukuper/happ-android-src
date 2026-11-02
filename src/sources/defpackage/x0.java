package defpackage;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x0 extends oh1 implements kq5, gx3, w07, s01, w85, ic3, nr2 {
    public tb3 A0;
    public or2 B0;
    public String C0 = "idle";
    public nh1 D0;
    public ft5 E0;
    public d13 F0;
    public final a05 G0;
    public long H0;
    public ft5 I0;
    public xz4 J0;
    public boolean K0;
    public og7 L0;
    public xz4 s0;
    public tb3 t0;
    public boolean u0;
    public String v0;
    public kl6 w0;
    public boolean x0;
    public dn2 y0;
    public final ci2 z0;

    public x0(xz4 xz4Var, tb3 tb3Var, boolean z, boolean z2, String str, kl6 kl6Var, dn2 dn2Var) {
        this.s0 = xz4Var;
        this.t0 = tb3Var;
        this.u0 = z;
        this.v0 = str;
        this.w0 = kl6Var;
        this.x0 = z2;
        this.y0 = dn2Var;
        this.z0 = new ci2(xz4Var, 0, new d0(1, this, x0.class, "onFocusChange", "onFocusChange(Z)V", 0, (byte) 1));
        int i = fi4.a;
        this.G0 = new a05(6);
        this.H0 = 0L;
        xz4 xz4Var2 = this.s0;
        this.J0 = xz4Var2;
        this.K0 = xz4Var2 == null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.gx3
    public final boolean F(KeyEvent keyEvent) {
        boolean z;
        j1();
        long jN = w39.N(keyEvent);
        boolean z2 = this.x0;
        byte b = 3;
        q51 q51Var = null;
        a05 a05Var = this.G0;
        if (z2) {
            byte b2 = 2;
            if (w39.S(keyEvent) == 2 && x97.G(keyEvent)) {
                if (a05Var.b(jN)) {
                    z = false;
                } else {
                    ft5 ft5Var = new ft5(this.H0);
                    a05Var.g(jN, ft5Var);
                    if (this.s0 != null) {
                        w51.G(M0(), null, null, new v0(this, ft5Var, q51Var, b2), 3);
                    }
                    z = true;
                }
                if (l1(keyEvent) || z) {
                    return true;
                }
                return false;
            }
        }
        if (this.x0 && w39.S(keyEvent) == 1 && x97.G(keyEvent)) {
            ft5 ft5Var2 = (ft5) a05Var.f(jN);
            if (ft5Var2 != null) {
                if (this.s0 != null) {
                    w51.G(M0(), null, null, new v0(this, ft5Var2, q51Var, b), 3);
                }
                m1(keyEvent);
            }
            if (ft5Var2 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.w07
    public final boolean I0() {
        return true;
    }

    @Override // defpackage.jx4
    public final boolean N0() {
        return false;
    }

    @Override // defpackage.nr2
    public final String Q() {
        return this.C0;
    }

    @Override // defpackage.jx4
    public final void Q0() {
        q0();
        if (!this.K0) {
            j1();
        }
        if (this.x0) {
            Y0(this.z0);
        }
    }

    @Override // defpackage.jx4
    public final void R0() {
        d1();
        if (this.J0 == null) {
            this.s0 = null;
        }
        nh1 nh1Var = this.D0;
        if (nh1Var != null) {
            Z0(nh1Var);
        }
        this.D0 = null;
        or2 or2Var = this.B0;
        if (or2Var != null) {
            Z0(or2Var);
        }
        this.B0 = null;
    }

    public final boolean c1() {
        ea6 ea6Var = new ea6();
        ts7.g(this, or2.r0, new pr2(new nb(ea6Var, (byte) 1), (byte) 0));
        if (ea6Var.X == null) {
            int i = cu0.b;
            ViewParent parent = ys0.S(this).getParent();
            while (parent != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (!viewGroup.shouldDelayChildPressedState()) {
                    parent = viewGroup.getParent();
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:16:0x0037->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[EDGE_INSN: B:30:0x0076->B:27:0x0076 BREAK  A[LOOP:0: B:16:0x0037->B:26:0x0073], SYNTHETIC] */
    public final void d1() {
        xz4 xz4Var = this.s0;
        a05 a05Var = this.G0;
        if (xz4Var != null) {
            ft5 ft5Var = this.E0;
            if (ft5Var != null) {
                xz4Var.b(new et5(ft5Var));
            }
            ft5 ft5Var2 = this.I0;
            if (ft5Var2 != null) {
                xz4Var.b(new et5(ft5Var2));
            }
            d13 d13Var = this.F0;
            if (d13Var != null) {
                xz4Var.b(new e13(d13Var));
            }
            Object[] objArr = a05Var.c;
            long[] jArr = a05Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                xz4Var.b(new et5((ft5) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.E0 = null;
        this.I0 = null;
        this.F0 = null;
        a05Var.a();
    }

    public final long e1(long j) {
        long jD0 = yn0.Z(this).A0.D0(((fw8) hi5.W(this, y01.t)).d());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jD0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jD0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final void f1(boolean z) {
        xz4 xz4Var = this.s0;
        if (xz4Var != null) {
            og7 og7Var = this.L0;
            q51 q51Var = null;
            if (og7Var == null || !og7Var.k()) {
                ft5 ft5Var = z ? this.I0 : this.E0;
                if (ft5Var != null) {
                    et5 et5Var = new et5(ft5Var);
                    bm3 bm3Var = (bm3) ((m51) M0()).Y.H0(oy1.E0);
                    w51.G(M0(), null, null, new r0((Object) xz4Var, (Object) et5Var, (Object) (bm3Var != null ? bm3Var.D(new p0(xz4Var, et5Var, (byte) 0)) : null), q51Var, (byte) 0), 3);
                }
            } else {
                og7 og7Var2 = this.L0;
                if (og7Var2 != null) {
                    og7Var2.m(null);
                }
            }
            if (z) {
                this.I0 = null;
            } else {
                this.E0 = null;
            }
        }
    }

    public final void g1(long j, boolean z) {
        xz4 xz4Var = this.s0;
        if (xz4Var != null) {
            og7 og7Var = this.L0;
            if (og7Var == null || !og7Var.k()) {
                ft5 ft5Var = z ? this.I0 : this.E0;
                if (ft5Var != null) {
                    w51.G(M0(), null, null, new t0(ft5Var, xz4Var, null), 3);
                }
            } else {
                og7Var.m(null);
                w51.G(M0(), null, null, new s0((Object) og7Var, j, xz4Var, (q51) null, (byte) 0), 3);
            }
            if (z) {
                this.I0 = null;
            } else {
                this.E0 = null;
            }
        }
    }

    @Override // defpackage.w07
    public final void h(f17 f17Var) {
        kl6 kl6Var = this.w0;
        if (kl6Var != null) {
            d17.d(f17Var, kl6Var.a);
        }
        String str = this.v0;
        o0 o0Var = new o0(this, (byte) 1);
        nw3[] nw3VarArr = d17.a;
        f17Var.a(s07.b, new q3(str, o0Var));
        if (this.x0) {
            this.z0.h(f17Var);
        } else {
            f17Var.a(c17.j, dn8.a);
        }
        b1(f17Var);
    }

    public final void h1(ac3 ac3Var) {
        xz4 xz4Var = this.s0;
        if (xz4Var != null) {
            ft5 ft5Var = new ft5(ac3Var.c);
            q51 q51Var = null;
            if (c1()) {
                this.L0 = w51.G(M0(), null, null, new u0(xz4Var, ft5Var, this, q51Var, (byte) 0), 3);
            } else {
                this.I0 = ft5Var;
                w51.G(M0(), null, null, new t0(xz4Var, ft5Var, q51Var, (byte) 1), 3);
            }
        }
    }

    public final void i1(hq5 hq5Var) {
        xz4 xz4Var = this.s0;
        if (xz4Var != null) {
            ft5 ft5Var = new ft5(hq5Var.c);
            q51 q51Var = null;
            if (c1()) {
                this.L0 = w51.G(M0(), null, null, new u0(xz4Var, ft5Var, this, q51Var, (byte) 1), 3);
            } else {
                this.E0 = ft5Var;
                w51.G(M0(), null, null, new t0(xz4Var, ft5Var, q51Var, (byte) 2), 3);
            }
        }
    }

    public final void j1() {
        if (this.D0 != null) {
            return;
        }
        tb3 tb3Var = this.u0 ? this.A0 : this.t0;
        if (tb3Var != null) {
            xz4 xz4Var = this.s0;
            if (xz4Var == null) {
                xz4Var = new xz4();
                this.s0 = xz4Var;
            }
            this.z0.d1(xz4Var);
            xz4 xz4Var2 = this.s0;
            xz4Var2.getClass();
            nh1 nh1VarA = tb3Var.a(xz4Var2);
            Y0(nh1VarA);
            this.D0 = nh1VarA;
        }
    }

    @Override // defpackage.gx3
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    public boolean l1(KeyEvent keyEvent) {
        return false;
    }

    public void m1(KeyEvent keyEvent) {
        n1();
    }

    public final void n1() {
        ie7 ie7Var = (ie7) hi5.W(this, y01.v);
        if (ie7Var != null) {
            ie7Var.a();
        }
        this.y0.invoke();
    }

    public final void o1(xz4 xz4Var, tb3 tb3Var, boolean z, boolean z2, String str, kl6 kl6Var, dn2 dn2Var) {
        boolean z3;
        boolean z4;
        nh1 nh1Var;
        boolean z5 = true;
        if (dh3.f(this.J0, xz4Var)) {
            z3 = false;
        } else {
            d1();
            this.J0 = xz4Var;
            this.s0 = xz4Var;
            z3 = true;
        }
        if (!dh3.f(this.t0, tb3Var)) {
            this.t0 = tb3Var;
            z3 = true;
        }
        if (this.u0 != z) {
            this.u0 = z;
            if (z) {
                q0();
            }
            z3 = true;
        }
        boolean z6 = this.x0;
        ci2 ci2Var = this.z0;
        if (z6 != z2) {
            if (z2) {
                Y0(ci2Var);
            } else {
                Z0(ci2Var);
                d1();
            }
            ch3.I(this);
            if (!z2) {
                nh1 nh1Var2 = this.B0;
                if (nh1Var2 != null) {
                    Z0(nh1Var2);
                }
                this.B0 = null;
                this.C0 = "idle";
            }
            this.x0 = z2;
        }
        if (!dh3.f(this.v0, str)) {
            this.v0 = str;
            ch3.I(this);
        }
        if (!dh3.f(this.w0, kl6Var)) {
            this.w0 = kl6Var;
            ch3.I(this);
        }
        this.y0 = dn2Var;
        boolean z7 = this.K0;
        xz4 xz4Var2 = this.J0;
        if (z7 == (xz4Var2 == null)) {
            z5 = z3;
            z4 = z7;
        } else {
            z4 = xz4Var2 == null;
            this.K0 = z4;
            if (z4 || this.D0 != null) {
                z7 = z4;
                z5 = z3;
                z4 = z7;
            }
        }
        if (z5 && ((nh1Var = this.D0) != null || !z4)) {
            if (nh1Var != null) {
                Z0(nh1Var);
            }
            this.D0 = null;
            j1();
        }
        ci2Var.d1(this.s0);
    }

    @Override // defpackage.w85
    public final void q0() {
        if (this.u0) {
            ch3.N(this, new o0(this, (byte) 0));
        }
    }

    public void z(aq5 aq5Var, bq5 bq5Var, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.H0 = (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        j1();
        if (this.x0) {
            if (this.B0 == null) {
                or2 or2Var = new or2(this);
                Y0(or2Var);
                this.B0 = or2Var;
            }
            if (bq5Var == bq5.Y) {
                int i = aq5Var.f;
                q51 q51Var = null;
                if (i == 4) {
                    w51.G(M0(), null, null, new w0(this, q51Var, (byte) 0), 3);
                } else if (i == 5) {
                    w51.G(M0(), null, null, new w0(this, q51Var, (byte) 1), 3);
                }
            }
        }
    }

    public void k1() {
    }

    public void b1(f17 f17Var) {
    }
}
