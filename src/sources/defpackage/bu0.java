package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class bu0 extends x0 {
    public hq5 M0;
    public ac3 N0;

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

    @Override // defpackage.ic3
    public final void l0() {
        p1(true);
    }

    public final void p1(boolean z) {
        if (z) {
            this.N0 = null;
        } else {
            this.M0 = null;
        }
        f1(z);
        this.C0 = "idle";
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
        if (bq5Var != bq5.Y) {
            if (bq5Var == bq5.Z) {
                if (this.N0 != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ac3 ac3Var = (ac3) arrayList.get(i);
                        if (ac3Var.i && ac3Var != this.N0) {
                            p1(true);
                            break;
                        }
                    }
                }
                if (dh3.f(this.C0, "recognized")) {
                    this.C0 = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.N0 == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (z51.o((ac3) arrayList.get(i2))) {
                    ac3 ac3Var2 = (ac3) arrayList.get(0);
                    ac3Var2.i = true;
                    this.N0 = ac3Var2;
                    if (this.x0) {
                        this.C0 = "waiting";
                        h1(ac3Var2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ac3 ac3Var3 = (ac3) arrayList.get(i3);
            if (ac3Var3.i || !ac3Var3.h || ac3Var3.d) {
                float f = ((fw8) hi5.W(this, y01.t)).f();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ac3 ac3Var4 = (ac3) arrayList.get(i4);
                    long j = ac3Var4.c;
                    ac3 ac3Var5 = this.N0;
                    ac3Var5.getClass();
                    boolean z = Math.abs(z85.c(z85.e(j, ac3Var5.c))) > f;
                    if (ac3Var4.i || z) {
                        p1(true);
                        return;
                    }
                }
                return;
            }
        }
        ((ac3) arrayList.get(0)).i = true;
        if (this.x0) {
            this.C0 = "recognized";
            ac3 ac3Var6 = this.N0;
            ac3Var6.getClass();
            g1(ac3Var6.c, true);
            n1();
        }
        this.N0 = null;
    }

    @Override // defpackage.x0, defpackage.kq5
    public final void z(aq5 aq5Var, bq5 bq5Var, long j) {
        super.z(aq5Var, bq5Var, j);
        if (bq5Var != bq5.Y) {
            if (bq5Var == bq5.Z) {
                if (this.M0 != null) {
                    List list = aq5Var.a;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        hq5 hq5Var = (hq5) list.get(i);
                        if (hq5Var.c() && hq5Var != this.M0) {
                            p1(false);
                            break;
                        }
                    }
                }
                if (dh3.f(this.C0, "recognized")) {
                    this.C0 = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.M0 == null) {
            if (q18.e(aq5Var, true)) {
                hq5 hq5Var2 = (hq5) aq5Var.a.get(0);
                hq5Var2.a();
                this.M0 = hq5Var2;
                if (this.x0) {
                    this.C0 = "waiting";
                    i1(hq5Var2);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = aq5Var.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!vr3.l((hq5) list2.get(i2))) {
                long jE1 = e1(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    hq5 hq5Var3 = (hq5) list2.get(i3);
                    if (hq5Var3.c() || vr3.K(hq5Var3, j, jE1)) {
                        p1(false);
                        return;
                    }
                }
                return;
            }
        }
        ((hq5) list2.get(0)).a();
        if (this.x0) {
            this.C0 = "recognized";
            hq5 hq5Var4 = this.M0;
            hq5Var4.getClass();
            g1(hq5Var4.c, false);
            n1();
        }
        this.M0 = null;
    }
}
