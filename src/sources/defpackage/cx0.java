package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cx0 extends x0 {
    public dn2 M0;
    public boolean N0;
    public final a05 O0;
    public final a05 P0;
    public hq5 Q0;
    public og7 R0;
    public og7 S0;
    public boolean T0;
    public boolean U0;
    public long V0;
    public boolean W0;
    public ac3 X0;
    public og7 Y0;
    public og7 Z0;
    public boolean a1;
    public boolean b1;
    public long c1;
    public boolean d1;

    public cx0(dn2 dn2Var, dn2 dn2Var2, tb3 tb3Var, xz4 xz4Var, boolean z) {
        super(xz4Var, tb3Var, false, z, null, null, dn2Var);
        this.M0 = dn2Var2;
        this.N0 = true;
        int i = fi4.a;
        this.O0 = new a05(6);
        this.P0 = new a05(6);
        this.V0 = -1L;
        this.c1 = -1L;
    }

    @Override // defpackage.kq5
    public final void I() {
        d13 d13Var;
        xz4 xz4Var = this.s0;
        if (xz4Var != null && (d13Var = this.F0) != null) {
            xz4Var.b(new e13(d13Var));
        }
        this.F0 = null;
        p1(false);
    }

    @Override // defpackage.jx4
    public final void S0() {
        s1();
    }

    @Override // defpackage.x0
    public final void b1(f17 f17Var) {
        if (this.M0 != null) {
            o7 o7Var = new o7(this, (byte) 20);
            nw3[] nw3VarArr = d17.a;
            f17Var.a(s07.c, new q3(null, o7Var));
        }
    }

    @Override // defpackage.x0
    public final void k1() {
        s1();
    }

    @Override // defpackage.ic3
    public final void l0() {
        p1(true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    @Override // defpackage.x0
    public final boolean l1(KeyEvent keyEvent) {
        boolean z;
        long jN = w39.N(keyEvent);
        q51 q51Var = null;
        if (this.M0 != null) {
            a05 a05Var = this.O0;
            if (a05Var.d(jN) == null) {
                a05Var.g(jN, w51.G(M0(), null, null, new bx0(this, q51Var, (byte) 2), 3));
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return z;
    }

    @Override // defpackage.x0
    public final void m1(KeyEvent keyEvent) {
        long jN = w39.N(keyEvent);
        a05 a05Var = this.O0;
        boolean z = false;
        if (a05Var.d(jN) != null) {
            bm3 bm3Var = (bm3) a05Var.d(jN);
            if (bm3Var != null) {
                if (bm3Var.k()) {
                    bm3Var.m(null);
                } else {
                    z = true;
                }
            }
            a05Var.f(jN);
        }
        if (z) {
            return;
        }
        n1();
    }

    public final void p1(boolean z) {
        if (z) {
            this.X0 = null;
            og7 og7Var = this.Y0;
            if (og7Var != null) {
                og7Var.m(null);
            }
            this.Y0 = null;
            og7 og7Var2 = this.Z0;
            if (og7Var2 != null) {
                og7Var2.m(null);
            }
            this.Z0 = null;
            this.a1 = false;
            this.b1 = false;
            this.c1 = -1L;
            this.d1 = false;
        } else {
            this.Q0 = null;
            og7 og7Var3 = this.R0;
            if (og7Var3 != null) {
                og7Var3.m(null);
            }
            this.R0 = null;
            og7 og7Var4 = this.S0;
            if (og7Var4 != null) {
                og7Var4.m(null);
            }
            this.S0 = null;
            this.T0 = false;
            this.U0 = false;
            this.V0 = -1L;
            this.W0 = false;
        }
        f1(z);
    }

    public final void q1(long j, ac3 ac3Var) {
        if (this.x0 && !this.d1) {
            g1(ac3Var.c, true);
            this.c1 = j;
            if (!this.b1 && !this.a1) {
                n1();
            }
        }
        this.X0 = null;
        this.d1 = false;
        this.a1 = false;
        og7 og7Var = this.Y0;
        if (og7Var != null) {
            og7Var.m(null);
        }
        this.Y0 = null;
        this.b1 = false;
    }

    public final void r1(long j, hq5 hq5Var) {
        if (this.x0 && !this.W0) {
            g1(hq5Var.c, false);
            this.V0 = j;
            if (!this.U0 && !this.T0) {
                n1();
            }
        }
        this.Q0 = null;
        this.W0 = false;
        this.T0 = false;
        og7 og7Var = this.R0;
        if (og7Var != null) {
            og7Var.m(null);
        }
        this.R0 = null;
        this.U0 = false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x009f A[LOOP:2: B:24:0x0071->B:35:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:36:0x00a2 BREAK  A[LOOP:2: B:24:0x0071->B:35:0x009f], SYNTHETIC] */
    public final void s1() {
        char c;
        long j;
        long j2;
        a05 a05Var = this.O0;
        Object[] objArr = a05Var.c;
        long[] jArr = a05Var.a;
        int length = jArr.length - 2;
        char c2 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c2) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            ((bm3) objArr[(i << 3) + i3]).m(null);
                        }
                        j3 >>= 8;
                        i3++;
                        c2 = c2;
                    }
                    c = c2;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c2;
                }
                if (i == length) {
                    break;
                }
                i++;
                c2 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        a05Var.a();
        a05 a05Var2 = this.P0;
        Object[] objArr2 = a05Var2.c;
        long[] jArr2 = a05Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i4 != length2) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((ax0) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 != length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        a05Var2.a();
    }

    @Override // defpackage.ic3
    public final void w(ne neVar, bq5 bq5Var) {
        ArrayList arrayList = (ArrayList) neVar.c;
        j1();
        if (this.x0 && this.B0 == null) {
            or2 or2Var = new or2(this);
            Y0(or2Var);
            this.B0 = or2Var;
        }
        byte b = 1;
        int i = 0;
        if (bq5Var != bq5.Y) {
            if (bq5Var != bq5.Z || this.X0 == null || this.b1) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                ac3 ac3Var = (ac3) arrayList.get(i);
                if (ac3Var.i && ac3Var != this.X0) {
                    p1(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.X0 == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (z51.o((ac3) arrayList.get(i2))) {
                    ac3 ac3Var2 = (ac3) arrayList.get(0);
                    ac3Var2.i = true;
                    this.X0 = ac3Var2;
                    if (this.x0) {
                        og7 og7Var = this.Z0;
                        q51 q51Var = null;
                        if (og7Var != null && og7Var.k()) {
                            ((fw8) hi5.W(this, y01.t)).getClass();
                            if (ac3Var2.b - this.c1 < 40) {
                                this.d1 = true;
                                return;
                            }
                            this.a1 = true;
                            og7 og7Var2 = this.Z0;
                            if (og7Var2 != null) {
                                og7Var2.m(null);
                            }
                            this.Z0 = null;
                        }
                        this.b1 = false;
                        h1(ac3Var2);
                        if (this.M0 != null) {
                            this.Y0 = w51.G(M0(), null, null, new bx0(this, q51Var, b), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.b1) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                ac3 ac3Var3 = (ac3) arrayList.get(i3);
                if (!ac3Var3.h || ac3Var3.d) {
                    int size4 = arrayList.size();
                    while (i < size4) {
                        ((ac3) arrayList.get(i)).i = true;
                        i++;
                    }
                    return;
                }
            }
            ac3 ac3Var4 = (ac3) arrayList.get(0);
            ac3Var4.i = true;
            long j = ac3Var4.b;
            ac3 ac3Var5 = this.X0;
            ac3Var5.getClass();
            q1(j, ac3Var5);
            return;
        }
        int size5 = arrayList.size();
        for (int i4 = 0; i4 < size5; i4++) {
            ac3 ac3Var6 = (ac3) arrayList.get(i4);
            if (ac3Var6.i || !ac3Var6.h || ac3Var6.d) {
                float f = ((fw8) hi5.W(this, y01.t)).f();
                int size6 = arrayList.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    ac3 ac3Var7 = (ac3) arrayList.get(i5);
                    long j2 = ac3Var7.c;
                    ac3 ac3Var8 = this.X0;
                    ac3Var8.getClass();
                    boolean z = Math.abs(z85.c(z85.e(j2, ac3Var8.c))) > f;
                    if (ac3Var7.i || z) {
                        p1(true);
                        return;
                    }
                }
                return;
            }
        }
        ac3 ac3Var9 = (ac3) arrayList.get(0);
        ac3Var9.i = true;
        long j3 = ac3Var9.b;
        ac3 ac3Var10 = this.X0;
        ac3Var10.getClass();
        q1(j3, ac3Var10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x0, defpackage.kq5
    public final void z(aq5 aq5Var, bq5 bq5Var, long j) {
        super.z(aq5Var, bq5Var, j);
        Object[] objArr = 0;
        if (bq5Var != bq5.Y) {
            if (bq5Var != bq5.Z || this.Q0 == null || this.U0) {
                return;
            }
            List list = aq5Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                hq5 hq5Var = (hq5) list.get(i);
                if (hq5Var.c() && hq5Var != this.Q0) {
                    p1(false);
                    return;
                }
            }
            return;
        }
        q51 q51Var = null;
        if (this.Q0 == null) {
            if (q18.e(aq5Var, true)) {
                hq5 hq5Var2 = (hq5) aq5Var.a.get(0);
                hq5Var2.a();
                this.Q0 = hq5Var2;
                if (this.x0) {
                    og7 og7Var = this.S0;
                    if (og7Var != null && og7Var.k()) {
                        ((fw8) hi5.W(this, y01.t)).getClass();
                        if (hq5Var2.b - this.V0 < 40) {
                            this.W0 = true;
                            return;
                        }
                        this.T0 = true;
                        og7 og7Var2 = this.S0;
                        if (og7Var2 != null) {
                            og7Var2.m(null);
                        }
                        this.S0 = null;
                    }
                    this.U0 = false;
                    i1(hq5Var2);
                    if (this.M0 != null) {
                        this.R0 = w51.G(M0(), null, null, new bx0(this, q51Var, objArr == true ? 1 : 0), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        Object[] objArr2 = aq5Var.c == 2;
        List list2 = aq5Var.a;
        if (objArr2 != false && !this.U0 && this.x0 && this.M0 != null) {
            og7 og7Var3 = this.R0;
            if (og7Var3 != null) {
                og7Var3.m(null);
            }
            this.R0 = null;
            dn2 dn2Var = this.M0;
            if (dn2Var != null) {
                dn2Var.invoke();
            }
            if (this.N0) {
                ((so5) ((ez2) hi5.W(this, y01.l))).a(0);
            }
            this.U0 = true;
        }
        if (this.U0) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!vr3.m((hq5) list2.get(i2))) {
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((hq5) list2.get(i3)).a();
                    }
                    return;
                }
            }
            hq5 hq5Var3 = (hq5) list2.get(0);
            hq5Var3.a();
            long j2 = hq5Var3.b;
            hq5 hq5Var4 = this.Q0;
            hq5Var4.getClass();
            r1(j2, hq5Var4);
            return;
        }
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!vr3.l((hq5) list2.get(i4))) {
                long jE1 = e1(j);
                int size5 = list2.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    hq5 hq5Var5 = (hq5) list2.get(i5);
                    if (hq5Var5.c() || vr3.K(hq5Var5, j, jE1)) {
                        p1(false);
                        return;
                    }
                }
                return;
            }
        }
        hq5 hq5Var6 = (hq5) list2.get(0);
        hq5Var6.a();
        long j3 = hq5Var6.b;
        hq5 hq5Var7 = this.Q0;
        hq5Var7.getClass();
        r1(j3, hq5Var7);
    }
}
