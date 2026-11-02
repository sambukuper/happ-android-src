package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qq7 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ y68 Y;

    public /* synthetic */ qq7(y68 y68Var, byte b) {
        this.X = b;
        this.Y = y68Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        hx4 hx4Var = hx4.X;
        dn8 dn8Var = dn8.a;
        y68 y68Var = this.Y;
        switch (b) {
            case 0:
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    z91.e(y68Var, b.g(hx4Var, 24.0f), lp2Var, 48);
                }
                break;
            case 1:
                lp2 lp2Var2 = (lp2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    lp2Var2.Q();
                } else {
                    FillElement fillElement = b.a;
                    kx4 kx4VarA = os4.A(fillElement, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                    wq6 wq6VarA = vq6.a(ht.b, pz2.n0, lp2Var2, 6);
                    int iHashCode = Long.hashCode(lp2Var2.T);
                    kl5 kl5VarL = lp2Var2.l();
                    kx4 kx4VarQ = w45.Q(lp2Var2, kx4VarA);
                    uz0.j.getClass();
                    lp2Var2.Z();
                    if (lp2Var2.S) {
                        lp2Var2.k();
                    } else {
                        lp2Var2.j0();
                    }
                    pn7.m(pz2.B0, lp2Var2, wq6VarA);
                    pn7.m(pz2.A0, lp2Var2, kl5VarL);
                    pn7.m(pz2.C0, lp2Var2, Integer.valueOf(iHashCode));
                    pn7.l(lp2Var2);
                    pn7.m(pz2.z0, lp2Var2, kx4VarQ);
                    zc1.g(y68Var.c().Z.length() + " / 25", fillElement, o88.a(((ds) lp2Var2.j(es.a)).d, ((dp) lp2Var2.j(ep.z)).c.c, 0L, null, null, 0L, 0L, null, 16777214), 6, 0, 0, 0, false, null, lp2Var2, 48, 496);
                    lp2Var2.p(true);
                }
                break;
            case 2:
                lp2 lp2Var3 = (lp2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!lp2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    lp2Var3.Q();
                } else {
                    z91.e(y68Var, b.g(hx4Var, 24.0f), lp2Var3, 48);
                }
                break;
            default:
                lp2 lp2Var4 = (lp2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!lp2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    lp2Var4.Q();
                } else {
                    z91.e(y68Var, b.g(hx4Var, 24.0f), lp2Var4, 48);
                }
                break;
        }
        return dn8Var;
    }
}
