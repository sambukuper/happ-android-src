package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c13 extends jx4 implements ye8, kq5, s01 {
    public ot1 q0;
    public sf r0;
    public boolean s0;

    public c13(sf sfVar, ot1 ot1Var) {
        this.q0 = ot1Var;
        this.r0 = sfVar;
    }

    @Override // defpackage.kq5
    public final void I() {
        c1();
    }

    @Override // defpackage.jx4
    public final void R0() {
        c1();
    }

    public final void Y0() {
        sf sfVar;
        ea6 ea6Var = new ea6();
        ts7.h(this, new ya2(ea6Var, (byte) 20));
        c13 c13Var = (c13) ea6Var.X;
        if (c13Var == null || (sfVar = c13Var.r0) == null) {
            sfVar = this.r0;
        }
        Z0(sfVar);
    }

    public void Z0(fq5 fq5Var) {
        gq5 gq5Var = (gq5) hi5.W(this, y01.w);
        if (gq5Var != null) {
            ((wb) gq5Var).a = fq5Var;
        }
    }

    public final void a1() {
        aa6 aa6Var = new aa6();
        aa6Var.X = true;
        ts7.j(this, new vj2((Object) aa6Var, (byte) 6));
        if (aa6Var.X) {
            Y0();
        }
    }

    public boolean b1(int i) {
        return (i == 3 || i == 4) ? false : true;
    }

    public final void c1() {
        if (this.s0) {
            this.s0 = false;
            if (this.p0) {
                ea6 ea6Var = new ea6();
                ts7.h(this, new nb(ea6Var, (byte) 2));
                c13 c13Var = (c13) ea6Var.X;
                if (c13Var != null) {
                    c13Var.Y0();
                } else {
                    Z0(null);
                }
            }
        }
    }

    @Override // defpackage.kq5
    public final long p() {
        if (this.q0 == null) {
            return vc8.a;
        }
        fi1 fi1Var = yn0.Z(this).A0;
        int i = vc8.b;
        return z38.c(fi1Var.x0(10.0f), fi1Var.x0(40.0f), fi1Var.x0(10.0f), fi1Var.x0(40.0f));
    }

    @Override // defpackage.kq5
    public final void z(aq5 aq5Var, bq5 bq5Var, long j) {
        if (bq5Var == bq5.Y) {
            List list = aq5Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (b1(((hq5) list.get(i)).i)) {
                    int i2 = aq5Var.f;
                    if (i2 == 4) {
                        this.s0 = true;
                        a1();
                        return;
                    } else {
                        if (i2 == 5) {
                            c1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }
}
