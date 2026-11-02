package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class wv2 implements rn2 {
    public final /* synthetic */ float X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ zy0 Z;
    public final /* synthetic */ dn2 f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ wv2(float f, boolean z, zy0 zy0Var, dn2 dn2Var) {
        this.X = f;
        this.Y = z;
        this.Z = zy0Var;
        this.f0 = dn2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            ut8 ut8Var = z91.e;
            hx4 hx4Var = hx4.X;
            kx4 kx4VarA = os4.A(z91.T(hx4Var, ut8Var), 0.0f, 0.0f, 0.0f, this.X, 7);
            tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var, 0);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarA);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, tw0VarA);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            ch3.f(lp2Var, b.b(hx4Var, 16.0f));
            if (this.Y) {
                lp2Var.W(839871337);
                r03 r03Var = new r03(pz2.r0);
                hx4Var.y(r03Var);
                vr3.c(r03Var, 0.0f, 0.0f, (x67) null, 0L, lp2Var, 0);
                ch3.f(lp2Var, b.b(hx4Var, 16.0f));
                lp2Var.p(false);
            } else {
                lp2Var.W(840034707);
                lp2Var.p(false);
            }
            this.Z.F(uw0.a, this.f0, lp2Var, 54);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        return dn8.a;
    }
}
