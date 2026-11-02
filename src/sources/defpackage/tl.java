package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tl {
    public static final qg5 a;

    static {
        d02 d02Var = d02.X;
        a = new qg5(d02Var, d02Var);
    }

    public static final void a(ql qlVar, List list, lp2 lp2Var, int i) {
        lp2Var.X(-1794596951);
        int i2 = (i & 6) == 0 ? (lp2Var.f(qlVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(list) ? 32 : 16;
        }
        byte b = 0;
        if (lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                pl plVar = (pl) list.get(i3);
                sn2 sn2Var = (sn2) plVar.a;
                int i4 = plVar.b;
                int i5 = plVar.c;
                Object objK = lp2Var.K();
                if (objK == zz0.a) {
                    objK = ld.d;
                    lp2Var.g0(objK);
                }
                xr4 xr4Var = (xr4) objK;
                int iHashCode = Long.hashCode(lp2Var.T);
                kl5 kl5VarL = lp2Var.l();
                kx4 kx4VarQ = w45.Q(lp2Var, hx4.X);
                uz0.j.getClass();
                lp2Var.Z();
                if (lp2Var.S) {
                    lp2Var.k();
                } else {
                    lp2Var.j0();
                }
                pn7.m(pz2.B0, lp2Var, xr4Var);
                pn7.m(pz2.A0, lp2Var, kl5VarL);
                pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
                pn7.l(lp2Var);
                pn7.m(pz2.z0, lp2Var, kx4VarQ);
                sn2Var.x(qlVar.subSequence(i4, i5).Y, lp2Var, 0);
                lp2Var.p(true);
            }
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new sl(b, i, qlVar, list);
        }
    }
}
