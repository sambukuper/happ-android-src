package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xu1 extends oh1 implements kq5, ic3, s01, hv1 {
    public au1 A0;
    public long B0 = 0;
    public or2 C0;
    public or2 D0;
    public du1 E0;
    public cu1 F0;
    public bu1 G0;
    public wl7 H0;
    public rb8 I0;
    public kr0 J0;
    public hc3 K0;
    public sd5 s0;
    public gn2 t0;
    public boolean u0;
    public xz4 v0;
    public x90 w0;
    public zu1 x0;
    public boolean y0;
    public boolean z0;

    public xu1(gn2 gn2Var, boolean z, xz4 xz4Var, sd5 sd5Var) {
        this.s0 = sd5Var;
        this.t0 = gn2Var;
        this.u0 = z;
        this.v0 = xz4Var;
    }

    public static void f1(xu1 xu1Var, hq5 hq5Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        cu1 cu1Var = xu1Var.F0;
        if (cu1Var == null) {
            cu1Var = new cu1();
            cu1Var.g = null;
            cu1Var.h = Long.MAX_VALUE;
            cu1Var.i = false;
            xu1Var.F0 = cu1Var;
        }
        cu1Var.g = hq5Var;
        cu1Var.h = j;
        kr0 kr0Var = xu1Var.J0;
        sd5 sd5Var = xu1Var.s0;
        if (kr0Var == null) {
            xu1Var.J0 = new kr0(sd5Var);
        } else {
            kr0Var.c = sd5Var;
            kr0Var.b = j2;
        }
        cu1Var.i = false;
        xu1Var.H0 = cu1Var;
    }

    @Override // defpackage.kq5
    public final void I() {
        if (this.z0) {
            d1();
            if (this.y0) {
                m1().b(eu1.a);
            }
            this.I0 = null;
        }
        this.z0 = false;
    }

    @Override // defpackage.nr2
    public final String Q() {
        if (!this.u0) {
            return "idle";
        }
        wl7 wl7Var = this.H0;
        if (wl7Var instanceof au1) {
            return ((au1) wl7Var).i ? "waiting" : "idle";
        }
        if ((wl7Var instanceof cu1) || (wl7Var instanceof bu1)) {
            return "waiting";
        }
        return wl7Var instanceof du1 ? "recognized" : "idle";
    }

    @Override // defpackage.jx4
    public final void R0() {
        this.y0 = false;
        b1();
        or2 or2Var = this.D0;
        if (or2Var != null) {
            Z0(or2Var);
        }
        or2 or2Var2 = this.C0;
        if (or2Var2 != null) {
            Z0(or2Var2);
        }
        this.D0 = null;
        this.C0 = null;
    }

    @Override // defpackage.hv1
    public final sd5 a0() {
        return this.s0;
    }

    public final void b1() {
        zu1 zu1Var = this.x0;
        if (zu1Var != null) {
            xz4 xz4Var = this.v0;
            if (xz4Var != null) {
                xz4Var.b(new yu1(zu1Var));
            }
            this.x0 = null;
        }
    }

    public abstract Object c1(pi piVar, wu1 wu1Var);

    public final void d1() {
        this.B0 = 0L;
        au1 au1Var = this.A0;
        zt1 zt1Var = zt1.Z;
        if (au1Var == null) {
            au1Var = new au1();
            au1Var.g = zt1Var;
            au1Var.h = false;
            au1Var.i = false;
            this.A0 = au1Var;
        }
        au1Var.g = zt1Var;
        au1Var.h = false;
        au1Var.i = false;
        this.H0 = au1Var;
    }

    public final void e1(hq5 hq5Var, long j, kr0 kr0Var) {
        bu1 bu1Var = this.G0;
        if (bu1Var == null) {
            bu1Var = new bu1();
            bu1Var.g = null;
            bu1Var.h = Long.MAX_VALUE;
            this.G0 = bu1Var;
        }
        bu1Var.g = hq5Var;
        bu1Var.h = j;
        kr0Var.b = 0L;
        this.H0 = bu1Var;
    }

    public final void g1(iu1 iu1Var) {
        if ((iu1Var instanceof gu1) && !this.y0) {
            this.y0 = true;
            r1();
        }
        m1().b(iu1Var);
    }

    public void i1(hu1 hu1Var) {
        if (this.p0) {
            w51.G(M0(), null, null, new y9(this, hu1Var, null, (byte) 0), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j1(s51 s51Var) throws Throwable {
        tu1 tu1Var;
        if (s51Var instanceof tu1) {
            tu1Var = (tu1) s51Var;
            int i = tu1Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                tu1Var.h0 = i - Integer.MIN_VALUE;
            } else {
                tu1Var = new tu1(this, s51Var);
            }
        } else {
            tu1Var = new tu1(this, s51Var);
        }
        Object obj = tu1Var.f0;
        int i2 = tu1Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            zu1 zu1Var = this.x0;
            if (zu1Var != null) {
                xz4 xz4Var = this.v0;
                if (xz4Var != null) {
                    yu1 yu1Var = new yu1(zu1Var);
                    tu1Var.h0 = 1;
                    Object objA = xz4Var.a(yu1Var, tu1Var);
                    c71 c71Var = c71.X;
                    if (objA == c71Var) {
                        return c71Var;
                    }
                }
            }
            i1(new hu1(0L, false));
            return dn8.a;
        }
        if (i2 != 1) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(obj);
        this.x0 = null;
        i1(new hu1(0L, false));
        return dn8.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k1(gu1 gu1Var, s51 s51Var) {
        uu1 uu1Var;
        xz4 xz4Var;
        zu1 zu1Var;
        gu1 gu1Var2;
        zu1 zu1Var2;
        if (s51Var instanceof uu1) {
            uu1Var = (uu1) s51Var;
            int i = uu1Var.j0;
            if ((i & Integer.MIN_VALUE) != 0) {
                uu1Var.j0 = i - Integer.MIN_VALUE;
            } else {
                uu1Var = new uu1(this, s51Var);
            }
        } else {
            uu1Var = new uu1(this, s51Var);
        }
        Object obj = uu1Var.h0;
        int i2 = uu1Var.j0;
        c71 c71Var = c71.X;
        if (i2 == 0) {
            w39.n0(obj);
            zu1 zu1Var3 = this.x0;
            if (zu1Var3 != null && (xz4Var = this.v0) != null) {
                yu1 yu1Var = new yu1(zu1Var3);
                uu1Var.f0 = gu1Var;
                uu1Var.j0 = 1;
                if (xz4Var.a(yu1Var, uu1Var) != c71Var) {
                }
                return c71Var;
            }
            this.x0 = zu1Var;
            h1(gu1Var.a);
            return dn8.a;
        }
        if (i2 == 1) {
            gu1Var = uu1Var.f0;
            w39.n0(obj);
        } else {
            if (i2 != 2) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zu1Var2 = uu1Var.g0;
            gu1Var2 = uu1Var.f0;
            w39.n0(obj);
        }
        zu1Var = zu1Var2;
        gu1Var = gu1Var2;
        this.x0 = zu1Var;
        h1(gu1Var.a);
        return dn8.a;
        zu1Var = new zu1();
        xz4 xz4Var2 = this.v0;
        if (xz4Var2 != null) {
            uu1Var.f0 = gu1Var;
            uu1Var.g0 = zu1Var;
            uu1Var.j0 = 2;
            if (xz4Var2.a(zu1Var, uu1Var) != c71Var) {
                gu1Var2 = gu1Var;
                zu1Var2 = zu1Var;
                zu1Var = zu1Var2;
                gu1Var = gu1Var2;
            }
            return c71Var;
        }
        this.x0 = zu1Var;
        h1(gu1Var.a);
        return dn8.a;
    }

    @Override // defpackage.ic3
    public final void l0() {
        hc3 hc3Var = this.K0;
        if (hc3Var != null) {
            hc3Var.a();
            xu1 xu1Var = hc3Var.X;
            if (xu1Var.y0) {
                xu1Var.g1(eu1.a);
            }
            hc3Var.i0 = null;
            b8 b8Var = hc3Var.l0;
            b8Var.b = 0;
            ((zz4) b8Var.c).b = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l1(hu1 hu1Var, s51 s51Var) throws Throwable {
        vu1 vu1Var;
        if (s51Var instanceof vu1) {
            vu1Var = (vu1) s51Var;
            int i = vu1Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                vu1Var.i0 = i - Integer.MIN_VALUE;
            } else {
                vu1Var = new vu1(this, s51Var);
            }
        } else {
            vu1Var = new vu1(this, s51Var);
        }
        Object obj = vu1Var.g0;
        int i2 = vu1Var.i0;
        if (i2 == 0) {
            w39.n0(obj);
            zu1 zu1Var = this.x0;
            if (zu1Var != null) {
                xz4 xz4Var = this.v0;
                if (xz4Var != null) {
                    av1 av1Var = new av1(zu1Var);
                    vu1Var.f0 = hu1Var;
                    vu1Var.i0 = 1;
                    Object objA = xz4Var.a(av1Var, vu1Var);
                    c71 c71Var = c71.X;
                    if (objA == c71Var) {
                        return c71Var;
                    }
                }
            }
            i1(hu1Var);
            return dn8.a;
        }
        if (i2 != 1) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hu1Var = vu1Var.f0;
        w39.n0(obj);
        this.x0 = null;
        i1(hu1Var);
        return dn8.a;
    }

    public final jp0 m1() {
        x90 x90Var = this.w0;
        if (x90Var != null) {
            return x90Var;
        }
        bt.q("Events channel not initialized.");
        return null;
    }

    public final rb8 n1() {
        rb8 rb8Var = this.I0;
        if (rb8Var != null) {
            return rb8Var;
        }
        bt.q("Velocity Tracker not initialized.");
        return null;
    }

    public final void o1(long j, hq5 hq5Var) {
        this.B0 = z85.f(this.B0, j);
        p38.a(n1(), hq5Var);
        m1().b(new fu1(j, false));
    }

    public final void p1(hq5 hq5Var, hq5 hq5Var2, long j) {
        if (this.I0 == null) {
            this.I0 = new rb8((byte) 6);
        }
        p38.a(n1(), hq5Var);
        long jE = z85.e(hq5Var2.c, j);
        if (((Boolean) this.t0.B(new oq5(hq5Var.i))).booleanValue()) {
            if (!this.y0) {
                if (this.w0 == null) {
                    this.w0 = gv3.b(Integer.MAX_VALUE, null, null, 6);
                }
                r1();
            }
            m1().b(new gu1(jE));
        }
    }

    public boolean q1() {
        sy6 sy6Var = ((my6) this).T0;
        if (sy6Var.a.b()) {
            return true;
        }
        td tdVar = sy6Var.b;
        return tdVar != null ? tdVar.e() : false;
    }

    public final void r1() {
        this.y0 = true;
        q51 q51Var = null;
        if (this.w0 == null) {
            this.w0 = gv3.b(Integer.MAX_VALUE, null, null, 6);
        }
        w51.G(M0(), null, null, new wu1((Object) this, q51Var, (byte) 0), 3);
    }

    public final void s1(gn2 gn2Var, boolean z, xz4 xz4Var, sd5 sd5Var, boolean z2) {
        this.t0 = gn2Var;
        boolean z3 = true;
        if (this.u0 != z) {
            this.u0 = z;
            if (!z) {
                or2 or2Var = this.D0;
                if (or2Var != null) {
                    Z0(or2Var);
                }
                or2 or2Var2 = this.C0;
                if (or2Var2 != null) {
                    Z0(or2Var2);
                }
                this.D0 = null;
                this.C0 = null;
                b1();
                this.K0 = null;
            }
            z2 = true;
        }
        if (!dh3.f(this.v0, xz4Var)) {
            b1();
            this.v0 = xz4Var;
        }
        if (this.s0 != sd5Var) {
            this.s0 = sd5Var;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.z0;
            eu1 eu1Var = eu1.a;
            if (z4) {
                d1();
                if (this.y0) {
                    m1().b(eu1Var);
                }
                this.I0 = null;
            }
            hc3 hc3Var = this.K0;
            if (hc3Var != null) {
                hc3Var.a();
                xu1 xu1Var = hc3Var.X;
                if (xu1Var.y0) {
                    xu1Var.g1(eu1Var);
                }
                hc3Var.i0 = null;
                b8 b8Var = hc3Var.l0;
                b8Var.b = 0;
                ((zz4) b8Var.c).b = 0;
            }
        }
    }

    @Override // defpackage.ic3
    public final void w(ne neVar, bq5 bq5Var) {
        Object obj;
        Object obj2;
        Object obj3;
        char c;
        long j;
        float f;
        float fIntBitsToFloat;
        hc3 hc3Var;
        Object obj4;
        hc3 hc3Var2;
        Object obj5;
        Object obj6;
        cc3 cc3Var;
        int i = neVar.b;
        ArrayList arrayList = (ArrayList) neVar.c;
        if (this.u0) {
            hc3 hc3Var3 = this.K0;
            if (hc3Var3 == null) {
                hc3Var3 = new hc3(this);
                this.K0 = hc3Var3;
            }
            if (this.D0 == null) {
                or2 or2Var = new or2(hc3Var3);
                Y0(or2Var);
                this.D0 = or2Var;
            }
            hc3 hc3Var4 = this.K0;
            if (hc3Var4 != null) {
                xu1 xu1Var = hc3Var4.X;
                w51 w51Var = hc3Var4.h0;
                if (w51Var == null) {
                    cc3 cc3Var2 = hc3Var4.Y;
                    if (cc3Var2 == null) {
                        obj = w51Var;
                        cc3Var = cc3Var2;
                        cc3 cc3Var3 = new cc3();
                        cc3Var3.q = bc3.Z;
                        cc3Var3.r = false;
                        cc3Var3.s = false;
                        hc3Var4.Y = cc3Var3;
                        cc3Var = cc3Var3;
                    }
                    obj = w51Var;
                    cc3Var = cc3Var2;
                    hc3Var4.h0 = cc3Var;
                    obj = cc3Var;
                }
                obj = w51Var;
                boolean z = obj instanceof cc3;
                bq5 bq5Var2 = bq5.X;
                boolean z2 = true;
                bq5 bq5Var3 = bq5.Y;
                if (z) {
                    cc3 cc3Var4 = (cc3) obj;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (!z51.o((ac3) arrayList.get(i2))) {
                            return;
                        }
                    }
                    ac3 ac3Var = (ac3) wv0.r0(arrayList);
                    int i3 = gc3.a[cc3Var4.q.ordinal()];
                    bc3 bc3Var = bc3.Y;
                    bc3 bc3Var2 = bc3.X;
                    bc3 bc3Var3 = i3 == 1 ? !xu1Var.q1() ? bc3Var2 : bc3Var : cc3Var4.q;
                    cc3Var4.q = bc3Var3;
                    if (bq5Var == bq5Var2) {
                        if (bc3Var3 == bc3Var) {
                            ac3Var.i = true;
                            cc3Var4.r = true;
                        }
                        cc3Var4.s = true;
                    }
                    if (bq5Var == bq5Var3) {
                        if (bc3Var3 == bc3Var2) {
                            hc3.c(hc3Var4, ac3Var, ac3Var.a, 0L, 12);
                            return;
                        }
                        if (cc3Var4.r) {
                            hc3Var4.f(ac3Var, ac3Var, new zb3(i), 0L);
                            hc3Var4.e(ac3Var, new zb3(i), 0L);
                            long j2 = ac3Var.a;
                            fc3 fc3Var = hc3Var4.Z;
                            if (fc3Var == null) {
                                fc3Var = new fc3();
                                fc3Var.q = Long.MAX_VALUE;
                                hc3Var4.Z = fc3Var;
                            }
                            fc3Var.q = j2;
                            hc3Var4.h0 = fc3Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                boolean z3 = obj instanceof ec3;
                bq5 bq5Var4 = bq5.Z;
                if (z3) {
                    ec3 ec3Var = (ec3) obj;
                    if (bq5Var == bq5Var2) {
                        return;
                    }
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            hc3Var = hc3Var4;
                            obj4 = null;
                            break;
                        }
                        obj4 = arrayList.get(i4);
                        hc3Var = hc3Var4;
                        if (jm4.w(((ac3) obj4).a, ec3Var.r)) {
                            break;
                        }
                        i4++;
                        hc3Var4 = hc3Var;
                    }
                    ac3 ac3Var2 = (ac3) obj4;
                    if (ac3Var2 == null) {
                        int size3 = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size3) {
                                obj6 = null;
                                break;
                            }
                            obj6 = arrayList.get(i5);
                            if (((ac3) obj6).d) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        ac3Var2 = (ac3) obj6;
                        if (ac3Var2 == null) {
                            hc3Var.a();
                            return;
                        }
                        ec3Var.r = ac3Var2.a;
                    }
                    ac3 ac3Var3 = ac3Var2;
                    if (bq5Var != bq5Var3) {
                        hc3Var2 = hc3Var;
                    } else if (ac3Var3.i) {
                        hc3Var2 = hc3Var;
                        ac3 ac3Var4 = ec3Var.q;
                        if (ac3Var4 == null) {
                            bt.q("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j3 = ec3Var.r;
                        kr0 kr0Var = hc3Var2.j0;
                        if (kr0Var == null) {
                            bt.q("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                        hc3Var2.b(ac3Var4, j3, kr0Var);
                    } else if (z51.p(ac3Var3)) {
                        int size4 = arrayList.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size4) {
                                obj5 = null;
                                break;
                            }
                            Object obj7 = arrayList.get(i6);
                            if (((ac3) obj7).d) {
                                obj5 = obj7;
                                break;
                            }
                            i6++;
                        }
                        ac3 ac3Var5 = (ac3) obj5;
                        if (ac3Var5 == null) {
                            hc3Var.a();
                        } else {
                            ec3Var.r = ac3Var5.a;
                        }
                        hc3Var2 = hc3Var;
                    } else {
                        fw8 fw8Var = (fw8) hi5.W(xu1Var, y01.t);
                        float f2 = qu1.a;
                        float f3 = fw8Var.f();
                        hc3Var2 = hc3Var;
                        kr0 kr0Var2 = hc3Var2.j0;
                        if (kr0Var2 == null) {
                            bt.q("Touch slop detector not initialized.");
                            return;
                        }
                        long jE = kr0.e(kr0Var2, z51.M(ac3Var3, xu1Var.s0, new zb3(i), true), f3);
                        if ((9223372034707292159L & jE) != 9205357640488583168L) {
                            ac3Var3.i = true;
                            ac3 ac3Var6 = ec3Var.q;
                            ac3Var6.getClass();
                            hc3Var2.f(ac3Var6, ac3Var3, new zb3(i), jE);
                            hc3Var2.e(ac3Var3, new zb3(i), jE);
                            long j4 = ac3Var3.a;
                            fc3 fc3Var2 = hc3Var2.Z;
                            if (fc3Var2 == null) {
                                fc3Var2 = new fc3();
                                fc3Var2.q = Long.MAX_VALUE;
                                hc3Var2.Z = fc3Var2;
                            }
                            fc3Var2.q = j4;
                            hc3Var2.h0 = fc3Var2;
                        } else {
                            ec3Var.s = true;
                        }
                    }
                    if (bq5Var == bq5Var4 && ec3Var.s) {
                        if (!ac3Var3.i) {
                            ec3Var.s = false;
                            return;
                        }
                        ac3 ac3Var7 = ec3Var.q;
                        if (ac3Var7 == null) {
                            bt.q("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j5 = ec3Var.r;
                        kr0 kr0Var3 = hc3Var2.j0;
                        if (kr0Var3 != null) {
                            hc3Var2.b(ac3Var7, j5, kr0Var3);
                            return;
                        } else {
                            bt.q("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                    }
                    return;
                }
                if (obj instanceof dc3) {
                    dc3 dc3Var = (dc3) obj;
                    if (bq5Var != bq5Var4) {
                        return;
                    }
                    int size5 = arrayList.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        if (((ac3) arrayList.get(i7)).i) {
                            z2 = false;
                            break;
                        }
                    }
                    int size6 = arrayList.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        if (((ac3) arrayList.get(i8)).d) {
                            if (arrayList.isEmpty()) {
                                break;
                            }
                            if (z2) {
                                long jN = z51.N((ac3) wv0.r0(arrayList), xu1Var.s0, new zb3(i));
                                ac3 ac3Var8 = dc3Var.q;
                                ac3Var8.getClass();
                                long jE2 = z85.e(jN, z51.N(ac3Var8, xu1Var.s0, new zb3(i)));
                                ac3 ac3Var9 = dc3Var.q;
                                if (ac3Var9 != null) {
                                    hc3.c(hc3Var4, ac3Var9, dc3Var.r, jE2, 8);
                                    return;
                                } else {
                                    bt.q("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    hc3Var4.a();
                    return;
                }
                if (!(obj instanceof fc3)) {
                    b61.c();
                    return;
                }
                fc3 fc3Var3 = (fc3) obj;
                if (bq5Var != bq5Var3) {
                    return;
                }
                long j6 = fc3Var3.q;
                int size7 = arrayList.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList.get(i9);
                    if (jm4.w(((ac3) obj2).a, j6)) {
                        break;
                    } else {
                        i9++;
                    }
                }
                ac3 ac3Var10 = (ac3) obj2;
                if (ac3Var10 == null) {
                    return;
                }
                long j7 = ac3Var10.c;
                boolean zP = z51.p(ac3Var10);
                eu1 eu1Var = eu1.a;
                if (!zP) {
                    if (ac3Var10.i) {
                        xu1Var.g1(eu1Var);
                        return;
                    } else {
                        if (z85.c(z51.M(ac3Var10, xu1Var.s0, new zb3(i), true)) == 0.0f) {
                            return;
                        }
                        hc3Var4.e(ac3Var10, new zb3(i), z51.M(ac3Var10, xu1Var.s0, new zb3(i), false));
                        ac3Var10.i = true;
                        return;
                    }
                }
                int size8 = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size8) {
                        obj3 = null;
                        break;
                    }
                    obj3 = arrayList.get(i10);
                    if (((ac3) obj3).d) {
                        break;
                    } else {
                        i10++;
                    }
                }
                ac3 ac3Var11 = (ac3) obj3;
                if (ac3Var11 != null) {
                    fc3Var3.q = ac3Var11.a;
                    return;
                }
                if (ac3Var10.i || !z51.p(ac3Var10)) {
                    xu1Var.g1(eu1Var);
                } else {
                    rb8 rb8VarD = hc3Var4.d();
                    sd5 sd5Var = xu1Var.s0;
                    b8 b8Var = hc3Var4.k0;
                    j05 j05Var = (j05) b8Var.c;
                    char c2 = ' ';
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 >> 32));
                    long j8 = 4294967295L;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                    if (z51.o(ac3Var10)) {
                        b8Var.b = 0;
                        j05Var.d();
                    }
                    if (z51.p(ac3Var10) || z51.o(ac3Var10)) {
                        c = ' ';
                        j = 4294967295L;
                        f = 0.0f;
                    } else {
                        if (j05Var.b == 3) {
                            int i11 = b8Var.b;
                            b8Var.b = i11 + 1;
                            j05Var.o(i11, ac3Var10);
                        } else {
                            j05Var.a(ac3Var10);
                        }
                        if (b8Var.b == 3) {
                            b8Var.b = 0;
                        }
                        Object[] objArr = j05Var.a;
                        int i12 = j05Var.b;
                        int i13 = 0;
                        float fIntBitsToFloat4 = 0.0f;
                        while (i13 < i12) {
                            char c3 = c2;
                            fIntBitsToFloat4 = Float.intBitsToFloat((int) (((ac3) objArr[i13]).c >> c3)) + fIntBitsToFloat4;
                            i13++;
                            c2 = c3;
                        }
                        c = c2;
                        f = 0.0f;
                        int i14 = j05Var.b;
                        fIntBitsToFloat2 = fIntBitsToFloat4 / i14;
                        Object[] objArr2 = j05Var.a;
                        float fIntBitsToFloat5 = 0.0f;
                        int i15 = 0;
                        while (i15 < i14) {
                            long j9 = j8;
                            fIntBitsToFloat5 += Float.intBitsToFloat((int) (((ac3) objArr2[i15]).c & j9));
                            i15++;
                            j8 = j9;
                        }
                        j = j8;
                        fIntBitsToFloat3 = fIntBitsToFloat5 / j05Var.b;
                    }
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j);
                    if (sd5Var != null) {
                        if (i == 1) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
                        } else if (i == 2) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j));
                        }
                        jFloatToRawIntBits = sd5Var == sd5.Y ? (((long) Float.floatToRawIntBits(f)) & j) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) : (((long) Float.floatToRawIntBits(f)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j);
                    }
                    ((gj4) rb8VarD.Y).f(ac3Var10.b, jFloatToRawIntBits);
                    float fE = ((fw8) hi5.W(xu1Var, y01.t)).e();
                    long jA = hc3Var4.d().a(a38.a(fE, fE));
                    gj4 gj4Var = (gj4) hc3Var4.d().Y;
                    vu8 vu8Var = (vu8) gj4Var.Y;
                    ka1[] ka1VarArr = vu8Var.d;
                    eu.m0(0, ka1VarArr.length, null, ka1VarArr);
                    vu8Var.e = 0;
                    vu8 vu8Var2 = (vu8) gj4Var.Z;
                    ka1[] ka1VarArr2 = vu8Var2.d;
                    eu.m0(0, ka1VarArr2.length, null, ka1VarArr2);
                    vu8Var2.e = 0;
                    gj4Var.X = 0L;
                    xu1Var.g1(new hu1(jv1.b(jA), true));
                }
                hc3Var4.a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01a7  */
    public void z(aq5 aq5Var, bq5 bq5Var, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        boolean z;
        Object obj4;
        Object obj5;
        au1 au1Var;
        boolean z2 = true;
        this.z0 = true;
        if (this.u0) {
            if (this.C0 == null) {
                or2 or2Var = new or2(this);
                Y0(or2Var);
                this.C0 = or2Var;
            }
            wl7 wl7Var = this.H0;
            boolean z3 = false;
            Object obj6 = wl7Var;
            if (wl7Var == null) {
                au1 au1Var2 = this.A0;
                if (au1Var2 == null) {
                    au1Var = au1Var2;
                    au1 au1Var3 = new au1();
                    au1Var3.g = zt1.Z;
                    au1Var3.h = false;
                    au1Var3.i = false;
                    this.A0 = au1Var3;
                    au1Var = au1Var3;
                }
                au1Var = au1Var2;
                this.H0 = au1Var;
                obj6 = au1Var;
            }
            boolean z4 = obj6 instanceof au1;
            bq5 bq5Var2 = bq5.X;
            bq5 bq5Var3 = bq5.Y;
            if (z4) {
                au1 au1Var4 = (au1) obj6;
                if (!aq5Var.a.isEmpty() && q18.e(aq5Var, false)) {
                    hq5 hq5Var = (hq5) wv0.r0(aq5Var.a);
                    int i = su1.a[au1Var4.g.ordinal()];
                    zt1 zt1Var = zt1.Y;
                    zt1 zt1Var2 = zt1.X;
                    zt1 zt1Var3 = i == 1 ? !q1() ? zt1Var2 : zt1Var : au1Var4.g;
                    au1Var4.g = zt1Var3;
                    if (bq5Var == bq5Var2) {
                        if (zt1Var3 == zt1Var) {
                            hq5Var.a();
                            au1Var4.h = true;
                        }
                        au1Var4.i = true;
                    }
                    if (bq5Var == bq5Var3) {
                        if (zt1Var3 == zt1Var2) {
                            f1(this, hq5Var, hq5Var.a, 0L, 12);
                            return;
                        }
                        if (au1Var4.h) {
                            p1(hq5Var, hq5Var, 0L);
                            o1(0L, hq5Var);
                            long j2 = hq5Var.a;
                            du1 du1Var = this.E0;
                            if (du1Var == null) {
                                du1Var = new du1();
                                du1Var.g = Long.MAX_VALUE;
                                this.E0 = du1Var;
                            }
                            du1Var.g = j2;
                            this.H0 = du1Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z5 = obj6 instanceof cu1;
            bq5 bq5Var4 = bq5.Z;
            if (!z5) {
                if (obj6 instanceof bu1) {
                    bu1 bu1Var = (bu1) obj6;
                    if (bq5Var != bq5Var4) {
                        return;
                    }
                    List list = aq5Var.a;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (((hq5) list.get(i2)).c()) {
                            z2 = false;
                            break;
                        }
                    }
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        if (((hq5) list.get(i3)).d) {
                            if (list.isEmpty()) {
                                break;
                            }
                            if (z2) {
                                long j3 = ((hq5) wv0.r0(list)).c;
                                hq5 hq5Var2 = bu1Var.g;
                                hq5Var2.getClass();
                                long jE = z85.e(j3, hq5Var2.c);
                                hq5 hq5Var3 = bu1Var.g;
                                if (hq5Var3 != null) {
                                    f1(this, hq5Var3, bu1Var.h, jE, 8);
                                    return;
                                } else {
                                    bt.q("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    d1();
                    return;
                }
                if (!(obj6 instanceof du1)) {
                    b61.c();
                    return;
                }
                du1 du1Var2 = (du1) obj6;
                if (bq5Var != bq5Var3) {
                    return;
                }
                long j4 = du1Var2.g;
                List list2 = aq5Var.a;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = list2.get(i4);
                    if (jm4.w(((hq5) obj).a, j4)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                hq5 hq5Var4 = (hq5) obj;
                if (hq5Var4 == null) {
                    return;
                }
                boolean zM = vr3.m(hq5Var4);
                Object obj7 = eu1.a;
                if (!zM) {
                    if (hq5Var4.c()) {
                        m1().b(obj7);
                        return;
                    } else {
                        if (z85.c(vr3.S(hq5Var4, true)) == 0.0f) {
                            return;
                        }
                        o1(vr3.S(hq5Var4, false), hq5Var4);
                        hq5Var4.a();
                        return;
                    }
                }
                List list3 = aq5Var.a;
                int size4 = list3.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list3.get(i5);
                    if (((hq5) obj2).d) {
                        break;
                    } else {
                        i5++;
                    }
                }
                hq5 hq5Var5 = (hq5) obj2;
                if (hq5Var5 != null) {
                    du1Var2.g = hq5Var5.a;
                    return;
                }
                if (hq5Var4.c() || !vr3.m(hq5Var4)) {
                    m1().b(obj7);
                } else {
                    float fE = ((fw8) hi5.W(this, y01.t)).e();
                    p38.a(n1(), hq5Var4);
                    long jA = n1().a(a38.a(fE, fE));
                    gj4 gj4Var = (gj4) n1().Y;
                    vu8 vu8Var = (vu8) gj4Var.Y;
                    ka1[] ka1VarArr = vu8Var.d;
                    eu.m0(0, ka1VarArr.length, null, ka1VarArr);
                    vu8Var.e = 0;
                    vu8 vu8Var2 = (vu8) gj4Var.Z;
                    ka1[] ka1VarArr2 = vu8Var2.d;
                    eu.m0(0, ka1VarArr2.length, null, ka1VarArr2);
                    vu8Var2.e = 0;
                    gj4Var.X = 0L;
                    m1().b(new hu1(jv1.b(jA), false));
                    this.z0 = false;
                }
                d1();
                return;
            }
            cu1 cu1Var = (cu1) obj6;
            if (bq5Var == bq5Var2) {
                return;
            }
            List list4 = aq5Var.a;
            int size5 = list4.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    obj3 = null;
                    break;
                }
                obj3 = list4.get(i6);
                if (jm4.w(((hq5) obj3).a, cu1Var.h)) {
                    break;
                } else {
                    i6++;
                }
            }
            hq5 hq5Var6 = (hq5) obj3;
            if (hq5Var6 == null) {
                int size6 = list4.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list4.get(i7);
                    if (((hq5) obj5).d) {
                        break;
                    } else {
                        i7++;
                    }
                }
                hq5Var6 = (hq5) obj5;
                if (hq5Var6 == null) {
                    d1();
                    return;
                }
                cu1Var.h = hq5Var6.a;
            }
            if (bq5Var == bq5Var3) {
                if (hq5Var6.c()) {
                    hq5 hq5Var7 = cu1Var.g;
                    if (hq5Var7 == null) {
                        bt.q("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j5 = cu1Var.h;
                    kr0 kr0Var = this.J0;
                    if (kr0Var == null) {
                        bt.q("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    e1(hq5Var7, j5, kr0Var);
                } else if (vr3.m(hq5Var6)) {
                    int size7 = list4.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size7) {
                            obj4 = null;
                            break;
                        }
                        Object obj8 = list4.get(i8);
                        if (((hq5) obj8).d) {
                            obj4 = obj8;
                            break;
                        }
                        i8++;
                    }
                    hq5 hq5Var8 = (hq5) obj4;
                    if (hq5Var8 == null) {
                        d1();
                    } else {
                        cu1Var.h = hq5Var8.a;
                    }
                } else {
                    float fG = qu1.g((fw8) hi5.W(this, y01.t), hq5Var6.i);
                    kr0 kr0Var2 = this.J0;
                    if (kr0Var2 == null) {
                        bt.q("Touch slop detector not initialized.");
                        return;
                    }
                    long jE2 = kr0.e(kr0Var2, vr3.S(hq5Var6, true), fG);
                    if ((9223372034707292159L & jE2) != 9205357640488583168L) {
                        long jF = z85.f(this.B0, vr3.S(hq5Var6, false));
                        this.B0 = jF;
                        float fAtan2 = ((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (this.B0 & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jF >> 32))))) * 57.29578f;
                        sd5 sd5Var = this.s0;
                        if (sd5Var == null) {
                            z = true;
                        } else {
                            iv1 iv1Var = jv1.a;
                            if (sd5Var != sd5.Y ? fAtan2 <= 30.0f || fAtan2 > 90.0f : fAtan2 > 30.0f) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                        aa6 aa6Var = new aa6();
                        ru1 ru1Var = new ru1(fAtan2, aa6Var);
                        iv1 iv1Var2 = jv1.a;
                        ts7.g(this, or2.r0, new pr2(new y0((Object) ru1Var, (byte) 27), z3 ? 1 : 0));
                        if (z || !aa6Var.X) {
                            hq5Var6.a();
                            hq5 hq5Var9 = cu1Var.g;
                            hq5Var9.getClass();
                            p1(hq5Var9, hq5Var6, jE2);
                            o1(jE2, hq5Var6);
                            long j6 = hq5Var6.a;
                            du1 du1Var3 = this.E0;
                            if (du1Var3 == null) {
                                du1Var3 = new du1();
                                du1Var3.g = Long.MAX_VALUE;
                                this.E0 = du1Var3;
                            }
                            du1Var3.g = j6;
                            this.H0 = du1Var3;
                        } else {
                            cu1Var.i = true;
                        }
                    } else {
                        cu1Var.i = true;
                        this.B0 = z85.f(this.B0, vr3.S(hq5Var6, true));
                    }
                }
            }
            if (bq5Var == bq5Var4 && cu1Var.i) {
                if (!hq5Var6.c()) {
                    cu1Var.i = false;
                    return;
                }
                hq5 hq5Var10 = cu1Var.g;
                if (hq5Var10 == null) {
                    bt.q("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j7 = cu1Var.h;
                kr0 kr0Var3 = this.J0;
                if (kr0Var3 != null) {
                    e1(hq5Var10, j7, kr0Var3);
                } else {
                    bt.q("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
    }

    public void h1(long j) {
    }
}
