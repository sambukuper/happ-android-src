package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rv2 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ String Y;

    public /* synthetic */ rv2(String str, byte b) {
        this.X = b;
        this.Y = str;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                p50 p50Var = pz2.h0;
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    FillElement fillElement = b.a;
                    xr4 xr4VarC = g80.c(p50Var, false);
                    int iHashCode = Long.hashCode(lp2Var.T);
                    kl5 kl5VarL = lp2Var.l();
                    kx4 kx4VarQ = w45.Q(lp2Var, fillElement);
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
                    zc1.g(this.Y, null, o88.a(((ds) lp2Var.j(es.a)).b, ((dp) lp2Var.j(ep.z)).j.a, 0L, dj2.f0, null, 0L, 0L, null, 16777210), 0, 0, 0, 0, false, null, lp2Var, 0, 506);
                    lp2Var.p(true);
                }
                break;
            case 1:
                lp2 lp2Var2 = (lp2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    lp2Var2.Q();
                } else {
                    zc1.g(this.Y, null, o88.a(((ds) lp2Var2.j(es.a)).a.c, ((dp) lp2Var2.j(ep.z)).c.a, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 0, 0, false, null, lp2Var2, 0, 506);
                }
                break;
            case 2:
                lp2 lp2Var3 = (lp2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!lp2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    lp2Var3.Q();
                } else {
                    zc1.g(this.Y, os4.y(hx4.X, 8.0f, 4.0f), o88.a(((ds) lp2Var3.j(es.a)).c, ((dp) lp2Var3.j(ep.z)).c.a, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 0, 0, false, null, lp2Var3, 48, 504);
                }
                break;
            default:
                lp2 lp2Var4 = (lp2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!lp2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    lp2Var4.Q();
                } else {
                    zc1.g(this.Y, null, o88.a(((ds) lp2Var4.j(es.a)).c, ((dp) lp2Var4.j(ep.z)).c.a, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 0, 0, false, null, lp2Var4, 0, 506);
                }
                break;
        }
        return dn8Var;
    }
}
