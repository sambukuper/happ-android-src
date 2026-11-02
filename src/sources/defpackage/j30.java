package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import su.happ.proxyutility.dto.enums.SubscriptionSortType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j30 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    public /* synthetic */ j30(um6 um6Var, gn2 gn2Var, kx4 kx4Var, kx4 kx4Var2, int i) {
        this.X = (byte) 8;
        this.Z = um6Var;
        this.f0 = gn2Var;
        this.Y = kx4Var;
        this.g0 = kx4Var2;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        long j;
        byte b = this.X;
        hx4 hx4Var = hx4.X;
        be beVar = zz0.a;
        dn8 dn8Var = dn8.a;
        byte b2 = 1;
        Object obj3 = this.g0;
        Object obj4 = this.Y;
        Object obj5 = this.f0;
        Object obj6 = this.Z;
        switch (b) {
            case 0:
                kx4 kx4Var = (kx4) obj4;
                y05 y05Var = (y05) obj6;
                zy0 zy0Var = (zy0) obj5;
                i30 i30Var = (i30) obj3;
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    Object objK = lp2Var.K();
                    if (objK == beVar) {
                        objK = new gh(y05Var, (byte) 1);
                        lp2Var.g0(objK);
                    }
                    kx4 kx4VarQ = vr3.Q(kx4Var, (gn2) objK);
                    xr4 xr4VarC = g80.c(pz2.Z, true);
                    int iHashCode = Long.hashCode(lp2Var.T);
                    kl5 kl5VarL = lp2Var.l();
                    kx4 kx4VarQ2 = w45.Q(lp2Var, kx4VarQ);
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
                    pn7.m(pz2.z0, lp2Var, kx4VarQ2);
                    zy0Var.K(lp2Var, 0);
                    Object objK2 = lp2Var.K();
                    if (objK2 == beVar) {
                        objK2 = new eh(y05Var, (byte) 1);
                        lp2Var.g0(objK2);
                    }
                    i30Var.b((dn2) objK2, lp2Var, 6);
                    lp2Var.p(true);
                }
                break;
            case 1:
                String str = (String) obj4;
                Context context = (Context) obj6;
                Activity activity = (Activity) obj5;
                Configuration configuration = (Configuration) obj3;
                lp2 lp2Var2 = (lp2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    lp2Var2.Q();
                } else {
                    ch3.d(context, activity, configuration, jm4.U(422880042, new rv2(str, false ? (byte) 1 : (byte) 0), lp2Var2), lp2Var2);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                yn0.d((by2) obj6, (ky2) obj5, (dn2) obj3, (kx4) obj4, (lp2) obj, w79.P(3073));
                break;
            case 3:
                oh2 oh2Var = (oh2) obj4;
                oh2 oh2Var2 = (oh2) obj6;
                b71 b71Var = (b71) obj5;
                jc8 jc8Var = (jc8) obj3;
                lp2 lp2Var3 = (lp2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!lp2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    lp2Var3.Q();
                } else {
                    g73 g73VarP = u28.p(q36.info, lp2Var3);
                    long j2 = ((dp) lp2Var3.j(ep.z)).a;
                    kx4 kx4VarI = zc1.I(b.g(hx4Var, 20.0f), oh2Var);
                    boolean zF = lp2Var3.f(oh2Var2);
                    Object objK3 = lp2Var3.K();
                    if (zF || objK3 == beVar) {
                        objK3 = new bz2(oh2Var2, (byte) 0);
                        lp2Var3.g0(objK3);
                    }
                    kx4 kx4VarC = z91.C(kx4VarI, (gn2) objK3);
                    boolean zH = lp2Var3.h(b71Var) | lp2Var3.h(jc8Var);
                    Object objK4 = lp2Var3.K();
                    if (zH || objK4 == beVar) {
                        objK4 = new k40(b71Var, jc8Var, b2);
                        lp2Var3.g0(objK4);
                    }
                    os4.a(g73VarP, vj8.e0(kx4VarC, (dn2) objK4, lp2Var3, 0), null, j2, lp2Var3, 0, 4);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                ci8.b((dn2) obj6, (kx4) obj4, (p64) obj5, (d74) obj3, (lp2) obj, w79.P(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                lr4.b((iw0) obj4, (p77) obj6, (wj8) obj3, (zy0) obj5, (lp2) obj, w79.P(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                w79.c((vv5) obj4, (dn2) obj6, (dn2) obj5, (o87) obj3, (lp2) obj, w79.P(9));
                break;
            case 7:
                dn2 dn2Var = (dn2) obj4;
                y68 y68Var = (y68) obj5;
                gn2 gn2Var = (gn2) obj3;
                y05 y05Var2 = (y05) obj6;
                lp2 lp2Var4 = (lp2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!lp2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    lp2Var4.Q();
                } else {
                    wq6 wq6VarA = vq6.a(new ft(8.0f, new bt()), pz2.o0, lp2Var4, 54);
                    int iHashCode2 = Long.hashCode(lp2Var4.T);
                    kl5 kl5VarL2 = lp2Var4.l();
                    kx4 kx4VarQ3 = w45.Q(lp2Var4, hx4Var);
                    uz0.j.getClass();
                    lp2Var4.Z();
                    if (lp2Var4.S) {
                        lp2Var4.k();
                    } else {
                        lp2Var4.j0();
                    }
                    pn7.m(pz2.B0, lp2Var4, wq6VarA);
                    pn7.m(pz2.A0, lp2Var4, kl5VarL2);
                    pn7.m(pz2.C0, lp2Var4, Integer.valueOf(iHashCode2));
                    pn7.l(lp2Var4);
                    pn7.m(pz2.z0, lp2Var4, kx4VarQ3);
                    String strJ0 = vj8.j0(y46.dialog_input_in_center_button_negative, lp2Var4);
                    ox1 ox1Var = es.a;
                    o88 o88Var = ((ds) lp2Var4.j(ox1Var)).c;
                    ox1 ox1Var2 = ep.z;
                    long j3 = ((dp) lp2Var4.j(ox1Var2)).c.a;
                    dj2 dj2Var = dj2.f0;
                    z51.g(strJ0, null, false, o88.a(o88Var, j3, 0L, dj2Var, null, 0L, 0L, null, 16777210), 0, 0, 1, 0, false, null, null, dn2Var, lp2Var4, 1572864, 4022);
                    String strJ1 = vj8.j0(y46.dialog_subscription_edit_button_create, lp2Var4);
                    o88 o88Var2 = ((ds) lp2Var4.j(ox1Var)).c;
                    if (((Boolean) y05Var2.getValue()).booleanValue()) {
                        lp2Var4.W(-686746282);
                        j = ((dp) lp2Var4.j(ox1Var2)).c.c;
                        lp2Var4.p(false);
                    } else {
                        lp2Var4.W(-686744331);
                        j = ((dp) lp2Var4.j(ox1Var2)).a;
                        lp2Var4.p(false);
                    }
                    o88 o88VarA = o88.a(o88Var2, j, 0L, dj2Var, null, 0L, 0L, null, 16777210);
                    boolean z = !((Boolean) y05Var2.getValue()).booleanValue();
                    boolean zF2 = lp2Var4.f(y68Var) | lp2Var4.f(gn2Var) | lp2Var4.f(dn2Var);
                    Object objK5 = lp2Var4.K();
                    if (zF2 || objK5 == beVar) {
                        objK5 = new g00((Object) y68Var, (Object) gn2Var, (Object) dn2Var, (byte) 17);
                        lp2Var4.g0(objK5);
                    }
                    z51.g(strJ1, null, z, o88VarA, 0, 0, 1, 0, false, null, null, (dn2) objK5, lp2Var4, 1572864, 4018);
                    lp2Var4.p(true);
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                u70.p((um6) obj6, (gn2) obj5, (kx4) obj4, (kx4) obj3, (lp2) obj, w79.P(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                zc1.h((ep6) obj6, (sq6) obj5, (gw5) obj3, (kx4) obj4, (lp2) obj, w79.P(3657));
                break;
            case 10:
                SubscriptionSortType subscriptionSortType = (SubscriptionSortType) obj6;
                j2 j2Var = (j2) obj5;
                gn2 gn2Var2 = (gn2) obj3;
                kx4 kx4Var2 = (kx4) obj4;
                lp2 lp2Var5 = (lp2) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!lp2Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    lp2Var5.Q();
                } else {
                    int iOrdinal = subscriptionSortType.ordinal();
                    boolean zF3 = lp2Var5.f(gn2Var2);
                    Object objK6 = lp2Var5.K();
                    if (zF3 || objK6 == beVar) {
                        objK6 = new pr2(gn2Var2, (byte) 23);
                        lp2Var5.g0(objK6);
                    }
                    z68.d(j2Var, iOrdinal, (gn2) objK6, kx4Var2, lp2Var5, 3072);
                }
                break;
            default:
                ps7 ps7Var = (ps7) obj6;
                gn2 gn2Var3 = (gn2) obj5;
                kx4 kx4Var3 = (kx4) obj4;
                y68 y68Var2 = (y68) obj3;
                lp2 lp2Var6 = (lp2) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!lp2Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    lp2Var6.Q();
                } else {
                    boolean z2 = !ps7Var.b;
                    String strJ = ch3.J(oc.t(lp2Var6) ? "AndroidTV" : "Android");
                    FillElement fillElement = b.a;
                    ig5 ig5Var = ((gr) lp2Var6.j(hr.a)).a.b;
                    o88 o88VarA2 = o88.a(((ds) lp2Var6.j(es.a)).b, ((dp) lp2Var6.j(ep.z)).c.a, 0L, null, null, 0L, 0L, null, 16777214);
                    boolean zF4 = lp2Var6.f(gn2Var3);
                    Object objK7 = lp2Var6.K();
                    if (zF4 || objK7 == beVar) {
                        objK7 = new pr2(gn2Var3, (byte) 24);
                        lp2Var6.g0(objK7);
                    }
                    z91.f(strJ, (gn2) objK7, kx4Var3, fillElement, 0, y68Var2, null, o88VarA2, jm4.U(-1542319234, new qq7(y68Var2, (byte) 3), lp2Var6), null, false, z2, null, null, null, ig5Var, 0L, 0L, 0L, 0L, lp2Var6, 805309824, 0, 2026832);
                }
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ j30(dn2 dn2Var, kx4 kx4Var, p64 p64Var, d74 d74Var, int i) {
        this.X = (byte) 4;
        this.Z = dn2Var;
        this.Y = kx4Var;
        this.f0 = p64Var;
        this.g0 = d74Var;
    }

    public /* synthetic */ j30(dn2 dn2Var, y68 y68Var, gn2 gn2Var, y05 y05Var) {
        this.X = (byte) 7;
        this.Y = dn2Var;
        this.f0 = y68Var;
        this.g0 = gn2Var;
        this.Z = y05Var;
    }

    public /* synthetic */ j30(vv5 vv5Var, dn2 dn2Var, dn2 dn2Var2, o87 o87Var, int i) {
        this.X = (byte) 6;
        this.Y = vv5Var;
        this.Z = dn2Var;
        this.f0 = dn2Var2;
        this.g0 = o87Var;
    }

    public /* synthetic */ j30(iw0 iw0Var, p77 p77Var, wj8 wj8Var, zy0 zy0Var, int i) {
        this.X = (byte) 5;
        this.Y = iw0Var;
        this.Z = p77Var;
        this.g0 = wj8Var;
        this.f0 = zy0Var;
    }

    public /* synthetic */ j30(ps7 ps7Var, gn2 gn2Var, kx4 kx4Var, y68 y68Var) {
        this.X = (byte) 11;
        this.Z = ps7Var;
        this.f0 = gn2Var;
        this.Y = kx4Var;
        this.g0 = y68Var;
    }

    public /* synthetic */ j30(Object obj, Object obj2, Object obj3, kx4 kx4Var, int i, byte b) {
        this.X = b;
        this.Z = obj;
        this.f0 = obj2;
        this.g0 = obj3;
        this.Y = kx4Var;
    }

    public /* synthetic */ j30(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
        this.g0 = obj4;
    }

    public /* synthetic */ j30(SubscriptionSortType subscriptionSortType, j2 j2Var, gn2 gn2Var, kx4 kx4Var) {
        this.X = (byte) 10;
        this.Z = subscriptionSortType;
        this.f0 = j2Var;
        this.g0 = gn2Var;
        this.Y = kx4Var;
    }
}
