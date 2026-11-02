package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fx2 implements tn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ on2 Z;

    public /* synthetic */ fx2(Object obj, on2 on2Var, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = on2Var;
    }

    @Override // defpackage.tn2
    public final Object F(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        hx4 hx4Var = hx4.X;
        on2 on2Var = this.Z;
        Object obj5 = this.Y;
        switch (b) {
            case 0:
                kx4 kx4Var = (kx4) obj5;
                zy0 zy0Var = (zy0) on2Var;
                lp2 lp2Var = (lp2) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((ej) obj).getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= (iIntValue & 64) == 0 ? lp2Var.f(obj2) : lp2Var.h(obj2) ? 32 : 16;
                }
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 145) != 144)) {
                    lp2Var.Q();
                } else if (obj2 != null) {
                    lp2Var.W(785847406);
                    zy0Var.x(obj2, lp2Var, Integer.valueOf((iIntValue >> 3) & 14));
                    lp2Var.p(false);
                } else {
                    lp2Var.W(785842217);
                    xr4 xr4VarC = g80.c(pz2.Z, false);
                    int iHashCode = Long.hashCode(lp2Var.T);
                    kl5 kl5VarL = lp2Var.l();
                    kx4 kx4VarQ = w45.Q(lp2Var, kx4Var);
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
                    hi5.L(lp2Var, l80.a(os4.z(hx4Var, 0.0f, 12.0f, 1), pz2.i0));
                    lp2Var.p(true);
                    lp2Var.p(false);
                }
                break;
            default:
                y05 y05Var = (y05) obj5;
                pv3 pv3Var = (pv3) on2Var;
                lp2 lp2Var2 = (lp2) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((uw0) obj).getClass();
                ((dn2) obj2).getClass();
                if (!lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 129) != 128)) {
                    lp2Var2.Q();
                } else {
                    o50 o50Var = pz2.o0;
                    ft ftVar = new ft(16.0f, new bt());
                    FillElement fillElement = b.a;
                    kx4 kx4VarZ = os4.z(fillElement, 16.0f, 0.0f, 2);
                    wq6 wq6VarA = vq6.a(ftVar, o50Var, lp2Var2, 54);
                    int iHashCode2 = Long.hashCode(lp2Var2.T);
                    kl5 kl5VarL2 = lp2Var2.l();
                    kx4 kx4VarQ2 = w45.Q(lp2Var2, kx4VarZ);
                    uz0.j.getClass();
                    lp2Var2.Z();
                    if (lp2Var2.S) {
                        lp2Var2.k();
                    } else {
                        lp2Var2.j0();
                    }
                    pn7.m(pz2.B0, lp2Var2, wq6VarA);
                    pn7.m(pz2.A0, lp2Var2, kl5VarL2);
                    pn7.m(pz2.C0, lp2Var2, Integer.valueOf(iHashCode2));
                    pn7.l(lp2Var2);
                    pn7.m(pz2.z0, lp2Var2, kx4VarQ2);
                    zc1.g(vj8.j0(y46.app_update_header, lp2Var2), new d44(1.0f, true), o88.a(((ds) lp2Var2.j(es.a)).a.c, ((dp) lp2Var2.j(ep.z)).c.a, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 1, 0, false, null, lp2Var2, 196608, 472);
                    lp2Var2.p(true);
                    ch3.f(lp2Var2, b.b(hx4Var, 12.0f));
                    km4.c(yb6.a.b(((ja3) y05Var.getValue()).getClass()).E(), g33.e(fillElement), null, null, jm4.U(-1855707213, new o90((Object) pv3Var, (Object) y05Var, (byte) 6), lp2Var2), lp2Var2, 24576);
                }
                break;
        }
        return dn8Var;
    }
}
