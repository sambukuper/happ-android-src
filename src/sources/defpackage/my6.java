package defpackage;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class my6 extends xu1 implements gx3, w07 {
    public final z47 L0;
    public b1 M0;
    public x2 N0;
    public boolean O0;
    public boolean P0;
    public uy4 Q0;
    public ad8 R0;
    public final pe1 S0;
    public final sy6 T0;
    public final ky6 U0;
    public final ai2 V0;
    public final o41 W0;

    public my6(td tdVar, w80 w80Var, he2 he2Var, xz4 xz4Var, sd5 sd5Var, ny6 ny6Var, boolean z, boolean z2) {
        super(u70.a, z, xz4Var, sd5Var);
        this.L0 = new z47((byte) 25);
        pe1 pe1Var = new pe1(new bd1(new y45((fi1) iy6.c)));
        this.S0 = pe1Var;
        sy6 sy6Var = new sy6(ny6Var, tdVar, he2Var == null ? pe1Var : he2Var, sd5Var, z2, this.L0, this, new ly6(this, (byte) 0));
        this.T0 = sy6Var;
        ky6 ky6Var = new ky6(sy6Var, z);
        this.U0 = ky6Var;
        ai2 ai2Var = new ai2(2, null, 10);
        Y0(ai2Var);
        this.V0 = ai2Var;
        o41 o41Var = new o41(sd5Var, sy6Var, z2, w80Var, new ly6(this, (byte) 1));
        Y0(o41Var);
        this.W0 = o41Var;
        Y0(new z25(ky6Var, this.L0));
        t80 t80Var = new t80();
        t80Var.q0 = o41Var;
        Y0(t80Var);
    }

    @Override // defpackage.gx3
    public final boolean F(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.u0 || ((!ax3.a(w39.N(keyEvent), ax3.D) && !ax3.a(pu.d(keyEvent.getKeyCode()), ax3.C)) || w39.S(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.T0.d == sd5.X;
        o41 o41Var = this.W0;
        if (z) {
            int iZ0 = (int) (o41Var.Z0() & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(ax3.a(pu.d(keyEvent.getKeyCode()), ax3.C) ? iZ0 : -iZ0)));
        } else {
            int iZ1 = (int) (o41Var.Z0() >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(ax3.a(pu.d(keyEvent.getKeyCode()), ax3.C) ? iZ1 : -iZ1)) << 32);
        }
        w51.G(M0(), null, null, new x2(this, jFloatToRawIntBits, null, (byte) 1), 3);
        return true;
    }

    @Override // defpackage.jx4
    public final boolean N0() {
        return false;
    }

    @Override // defpackage.jx4
    public final void Q0() {
        uy4 uy4Var = this.Q0;
        if (uy4Var != null) {
            uy4Var.c = yn0.Z(this).A0;
        }
        ad8 ad8Var = this.R0;
        if (ad8Var != null) {
            ad8Var.c = yn0.Z(this).A0;
        }
        if (this.p0) {
            fi1 fi1Var = yn0.Z(this).A0;
            pe1 pe1Var = this.S0;
            pe1Var.getClass();
            pe1Var.a = new bd1(new y45(fi1Var));
        }
    }

    @Override // defpackage.nh1, defpackage.kq5
    public final void c() {
        I();
        uy4 uy4Var = this.Q0;
        if (uy4Var != null) {
            uy4Var.c = yn0.Z(this).A0;
        }
        ad8 ad8Var = this.R0;
        if (ad8Var != null) {
            ad8Var.c = yn0.Z(this).A0;
        }
        I();
        if (this.p0) {
            fi1 fi1Var = yn0.Z(this).A0;
            pe1 pe1Var = this.S0;
            pe1Var.getClass();
            pe1Var.a = new bd1(new y45(fi1Var));
        }
    }

    @Override // defpackage.xu1
    public final Object c1(pi piVar, wu1 wu1Var) {
        sy6 sy6Var = this.T0;
        Object objG = sy6Var.g(f15.Y, new qk4((Object) piVar, (Object) sy6Var, (q51) null, (byte) 16), wu1Var);
        return objG == c71.X ? objG : dn8.a;
    }

    @Override // defpackage.w07
    public final void h(f17 f17Var) {
        if (this.u0 && (this.M0 == null || this.N0 == null)) {
            this.M0 = new b1(this, (byte) 1);
            this.N0 = new x2(this, null);
        }
        b1 b1Var = this.M0;
        if (b1Var != null) {
            nw3[] nw3VarArr = d17.a;
            f17Var.a(s07.d, new q3(null, b1Var));
        }
        x2 x2Var = this.N0;
        if (x2Var != null) {
            nw3[] nw3VarArr2 = d17.a;
            f17Var.a(s07.e, x2Var);
        }
    }

    @Override // defpackage.xu1
    public final void i1(hu1 hu1Var) {
        if (this.p0) {
            w51.G(this.L0.F(), null, null, new jy2((Object) hu1Var, (Object) this, (q51) null, (byte) 29), 3);
        }
    }

    @Override // defpackage.gx3
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    public final void t1(td tdVar, w80 w80Var, he2 he2Var, xz4 xz4Var, sd5 sd5Var, ny6 ny6Var, boolean z, boolean z2) {
        boolean z3;
        if (this.u0 != z) {
            this.U0.Y = z;
            this.M0 = null;
            this.N0 = null;
            ch3.I(this);
        }
        if (he2Var == null) {
            he2Var = this.S0;
        }
        sy6 sy6Var = this.T0;
        boolean z4 = true;
        if (dh3.f(sy6Var.a, ny6Var)) {
            z3 = false;
        } else {
            sy6Var.a = ny6Var;
            z3 = true;
        }
        sy6Var.b = tdVar;
        sd5 sd5Var2 = sy6Var.d;
        if (sd5Var2 != sd5Var) {
            sy6Var.d = sd5Var;
            sd5Var2 = sd5Var;
            z3 = true;
        }
        if (sy6Var.e != z2) {
            sy6Var.e = z2;
        } else {
            z4 = z3;
        }
        sy6Var.c = he2Var;
        sy6Var.f = this.L0;
        o41 o41Var = this.W0;
        o41Var.q0 = sd5Var;
        o41Var.s0 = z2;
        o41Var.t0 = w80Var;
        y2 y2Var = u70.a;
        sd5 sd5Var3 = sd5.X;
        if (sd5Var2 != sd5Var3) {
            sd5Var3 = sd5.Y;
        }
        s1(y2Var, z, xz4Var, sd5Var3, z4);
    }

    @Override // defpackage.xu1, defpackage.kq5
    public final void z(aq5 aq5Var, bq5 bq5Var, long j) {
        boolean z;
        byte b;
        int i;
        List list = aq5Var.a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((Boolean) this.t0.B(new oq5(((hq5) list.get(i2)).i))).booleanValue()) {
                super.z(aq5Var, bq5Var, j);
                break;
            }
        }
        if (this.u0) {
            if (this.C0 == null) {
                or2 or2Var = new or2(this);
                Y0(or2Var);
                this.C0 = or2Var;
            }
            q51 q51Var = null;
            byte b2 = 12;
            byte b3 = 3;
            bq5 bq5Var2 = bq5.X;
            if (bq5Var == bq5Var2 && aq5Var.f == 6) {
                if (this.O0) {
                    z = true;
                } else {
                    yr2 yr2Var = new yr2(ViewConfiguration.get(ys0.S(this).getContext()), b3);
                    z = true;
                    this.Q0 = new uy4(this.T0, yr2Var, new yy0(2, this, my6.class, "onMouseWheelScrollStopped", "onMouseWheelScrollStopped-TH1AsA0(J)V", 4, (byte) 2), yn0.Z(this).A0);
                    this.O0 = true;
                }
                uy4 uy4Var = this.Q0;
                if (uy4Var != null) {
                    b71 b71VarM0 = M0();
                    if (uy4Var.h == null) {
                        uy4Var.h = w51.G(b71VarM0, null, null, new y9(uy4Var, q51Var, b2), 3);
                    }
                }
            } else {
                z = true;
            }
            uy4 uy4Var2 = this.Q0;
            bq5 bq5Var3 = bq5.Y;
            if (uy4Var2 != null && aq5Var.f == 6) {
                List list2 = aq5Var.a;
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        if (bq5Var == bq5Var2 && uy4Var2.d) {
                            uy4Var2.f(aq5Var);
                            w55.a(aq5Var);
                        }
                        if (bq5Var != bq5Var3 || uy4Var2.d || !uy4Var2.f(aq5Var)) {
                            break;
                            break;
                            break;
                        } else {
                            w55.a(aq5Var);
                            break;
                        }
                    }
                    if (((hq5) list2.get(i3)).c()) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            if (bq5Var == bq5Var2 && ((i = aq5Var.f) == 10 || i == 11 || i == 12)) {
                if (this.P0) {
                    b = 10;
                } else {
                    b = 10;
                    this.R0 = new ad8(this.T0, new yy0(2, this, my6.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, (byte) 3), yn0.Z(this).A0);
                    this.P0 = z;
                }
                ad8 ad8Var = this.R0;
                if (ad8Var != null) {
                    b71 b71VarM1 = M0();
                    if (ad8Var.g == null) {
                        ad8Var.g = w51.G(b71VarM1, null, null, new wu1(ad8Var, q51Var, b), 3);
                    }
                }
            } else {
                b = 10;
            }
            ad8 ad8Var2 = this.R0;
            if (ad8Var2 != null) {
                int i4 = aq5Var.f;
                if (i4 == b || i4 == 11 || i4 == 12) {
                    List list3 = aq5Var.a;
                    int size3 = list3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        if (((hq5) list3.get(i5)).c()) {
                            return;
                        }
                    }
                    if (bq5Var == bq5Var2 && ad8Var2.d) {
                        ad8Var2.d(aq5Var);
                        w55.a(aq5Var);
                    }
                    if (bq5Var == bq5Var3 && !ad8Var2.d && ad8Var2.d(aq5Var)) {
                        w55.a(aq5Var);
                    }
                }
            }
        }
    }

    @Override // defpackage.xu1
    public final void h1(long j) {
    }
}
