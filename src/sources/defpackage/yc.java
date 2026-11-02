package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yc implements rn2 {
    public final /* synthetic */ byte X = 0;
    public final /* synthetic */ long Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ yc(long j, rn2 rn2Var, int i) {
        this.Y = j;
        this.Z = rn2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Object obj3 = this.Z;
        long j = this.Y;
        switch (b) {
            case 0:
                kx4 kx4Var = (kx4) obj3;
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else if (j == 9205357640488583168L) {
                    lp2Var.W(-1243644858);
                    dd.b(kx4Var, lp2Var, 0, 0);
                    lp2Var.p(false);
                } else {
                    lp2Var.W(-1244013944);
                    kx4 kx4VarF = b.f(kx4Var, nt1.b(j), nt1.a(j), 0.0f, 0.0f, 12);
                    xr4 xr4VarC = g80.c(pz2.f0, false);
                    int iHashCode = Long.hashCode(lp2Var.T);
                    kl5 kl5VarL = lp2Var.l();
                    kx4 kx4VarQ = w45.Q(lp2Var, kx4VarF);
                    uz0.j.getClass();
                    lp2Var.Z();
                    if (lp2Var.S) {
                        lp2Var.k();
                    } else {
                        lp2Var.j0();
                    }
                    pn7.m(pz2.B0, lp2Var, xr4VarC);
                    pn7.m(pz2.A0, lp2Var, kl5VarL);
                    pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
                    pn7.l(lp2Var);
                    pn7.m(pz2.z0, lp2Var, kx4VarQ);
                    dd.b(null, lp2Var, 0, 1);
                    lp2Var.p(true);
                    lp2Var.p(false);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                pn7.c(j, (rn2) obj3, (lp2) obj, w79.P(1));
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ yc(long j, kx4 kx4Var) {
        this.Y = j;
        this.Z = kx4Var;
    }
}
