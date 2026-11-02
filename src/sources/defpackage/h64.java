package defpackage;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import androidx.compose.foundation.layout.b;
import su.happ.proxyutility.dto.enums.SubscriptionSortType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h64 implements sn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    public /* synthetic */ h64(rn2 rn2Var, i51 i51Var, sn2 sn2Var, dn2 dn2Var) {
        this.X = (byte) 1;
        this.Y = rn2Var;
        this.Z = i51Var;
        this.f0 = sn2Var;
        this.g0 = dn2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [q51] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r4v2, types: [lp2] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        p64 p64Var;
        kx4 kx4VarY;
        ?? r12;
        ws5 ws5Var;
        Object obj4;
        byte b = this.X;
        byte b2 = 9;
        hx4 hx4Var = hx4.X;
        byte b3 = 5;
        be beVar = zz0.a;
        byte b4 = 18;
        ?? r11 = 0;
        dn8 dn8Var = dn8.a;
        Object obj5 = this.g0;
        Object obj6 = this.f0;
        Object obj7 = this.Z;
        Object obj8 = this.Y;
        switch (b) {
            case 0:
                p64 p64Var2 = (p64) obj8;
                kx4 kx4Var = (kx4) obj7;
                d74 d74Var = (d74) obj6;
                y05 y05Var = (y05) obj5;
                iv6 iv6Var = (iv6) obj;
                ?? r4 = (lp2) obj2;
                ((Integer) obj3).getClass();
                Object objK = r4.K();
                Object obj9 = objK;
                if (objK == beVar) {
                    f64 f64Var = new f64(iv6Var, new eh(y05Var, (byte) 5));
                    r4.g0(f64Var);
                    obj9 = f64Var;
                }
                f64 f64Var2 = (f64) obj9;
                Object objK2 = r4.K();
                Object obj10 = objK2;
                if (objK2 == beVar) {
                    vp7 vp7Var = new vp7(new zz2(f64Var2));
                    r4.g0(vp7Var);
                    obj10 = vp7Var;
                }
                vp7 vp7Var2 = (vp7) obj10;
                if (p64Var2 != null) {
                    r4.W(1743490539);
                    r4.W(887527095);
                    String str = Build.FINGERPRINT;
                    if (str == null || !str.equals("robolectric")) {
                        r4.W(1345729441);
                        View view = (View) r4.j(pc.f);
                        boolean zF = r4.f(view);
                        Object objK3 = r4.K();
                        ?? r13 = objK3;
                        if (zF || objK3 == beVar) {
                            Object tag = view.getTag(f46.compose_prefetch_scheduler);
                            if (tag instanceof ws5) {
                                ws5Var = (ws5) tag;
                            }
                            if (r11 == 0) {
                                r11 = ws5Var;
                                eg egVar = new eg(view);
                                view.setTag(f46.compose_prefetch_scheduler, egVar);
                                r12 = egVar;
                            } else {
                                r11 = ws5Var;
                                r12 = r11;
                            }
                            r4.g0(r12);
                            r13 = r12;
                        }
                        obj4 = (ws5) r13;
                        r4.p(false);
                    } else {
                        r4.W(1345548711);
                        Object objK4 = r4.K();
                        if (objK4 == beVar) {
                            objK4 = new xs5();
                            r4.g0(objK4);
                        }
                        obj4 = (xs5) objK4;
                        r4.p(false);
                    }
                    r4.p(false);
                    Object[] objArr = {p64Var2, f64Var2, vp7Var2, obj4};
                    boolean zF2 = r4.f(p64Var2) | r4.h(f64Var2) | r4.h(vp7Var2) | r4.h(obj4);
                    Object objK5 = r4.K();
                    if (zF2 || objK5 == beVar) {
                        p64Var = p64Var2;
                        ii iiVar = new ii(p64Var, f64Var2, vp7Var2, obj4, (byte) 4);
                        r4.g0(iiVar);
                        objK5 = iiVar;
                    } else {
                        p64Var = p64Var2;
                    }
                    u70.c(objArr, (gn2) objK5, r4);
                    r4.p(false);
                } else {
                    p64Var = p64Var2;
                    r4.W(1744076749);
                    r4.p(false);
                }
                int i = q64.a;
                if (p64Var != null && (kx4VarY = kx4Var.y(new ze8(p64Var))) != null) {
                    kx4Var = kx4VarY;
                }
                boolean zF3 = r4.f(f64Var2) | r4.f(d74Var);
                Object objK6 = r4.K();
                Object obj11 = objK6;
                if (zF3 || objK6 == beVar) {
                    i9 i9Var = new i9(f64Var2, d74Var, b4);
                    r4.g0(i9Var);
                    obj11 = i9Var;
                }
                sp7.b(vp7Var2, kx4Var, (rn2) obj11, r4, 8);
                break;
            case 1:
                rn2 rn2Var = (rn2) obj8;
                i51 i51Var = (i51) obj7;
                sn2 sn2Var = (sn2) obj6;
                dn2 dn2Var = (dn2) obj5;
                h51 h51Var = (h51) obj;
                lp2 lp2Var = (lp2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= lp2Var.f(h51Var) ? 4 : 2;
                }
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    lp2Var.Q();
                } else {
                    String str2 = (String) rn2Var.K(lp2Var, 0);
                    if (fm7.o0(str2)) {
                        zc3.c("Label must not be blank");
                    }
                    i51Var.getClass();
                    vj8.X.G(str2, Boolean.TRUE, h51Var, sn2Var, dn2Var, lp2Var, Integer.valueOf((iIntValue << 9) & 7168));
                }
                break;
            case 2:
                th4 th4Var = (th4) obj8;
                lh7 lh7Var = (lh7) obj7;
                oh2 oh2Var = (oh2) obj6;
                pv3 pv3Var = (pv3) obj5;
                gg5 gg5Var = (gg5) obj;
                lp2 lp2Var2 = (lp2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                gg5Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= lp2Var2.f(gg5Var) ? 4 : 2;
                }
                if (!lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    lp2Var2.Q();
                } else {
                    uf4 uf4Var = (uf4) lh7Var.getValue();
                    hi5.I(uf4Var instanceof sf4 ? (sf4) uf4Var : null, b.c, null, jm4.U(-1744291408, new p90(oh2Var, gg5Var, pv3Var, b3), lp2Var2), lp2Var2, 3120, 4);
                    f76 f76Var = th4Var.g;
                    f76Var.getClass();
                    Activity activity = (Activity) lp2Var2.j(yc4.a);
                    boolean zH = lp2Var2.h(f76Var) | lp2Var2.h(activity);
                    Object objK7 = lp2Var2.K();
                    if (zH || objK7 == beVar) {
                        objK7 = new jy2(f76Var, activity, (q51) r11, b3);
                        lp2Var2.g0(objK7);
                    }
                    u70.j(f76Var, activity, (rn2) objK7, lp2Var2);
                }
                break;
            case 3:
                pv3 pv3Var2 = (pv3) obj8;
                j74 j74Var = (j74) obj7;
                gg5 gg5Var2 = (gg5) obj6;
                oh2 oh2Var2 = (oh2) obj5;
                lg4 lg4Var = (lg4) obj;
                lp2 lp2Var3 = (lp2) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                lg4Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= lp2Var3.f(lg4Var) ? 4 : 2;
                }
                if (!lp2Var3.N(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    lp2Var3.Q();
                } else {
                    wl7.e(lg4Var, (gn2) pv3Var2, j74Var, gg5Var2, oh2Var2, b.c, lp2Var3, (iIntValue3 & 14) | 221184);
                }
                break;
            case 4:
                vo6 vo6Var = (vo6) obj8;
                oh2 oh2Var3 = (oh2) obj7;
                gn2 gn2Var = (gn2) obj6;
                la laVar = (la) obj5;
                lp2 lp2Var4 = (lp2) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((l80) obj).getClass();
                if (!lp2Var4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    lp2Var4.Q();
                } else {
                    Object objK8 = lp2Var4.K();
                    if (objK8 == beVar) {
                        objK8 = u70.D(lp2Var4);
                        lp2Var4.g0(objK8);
                    }
                    b71 b71Var = (b71) objK8;
                    kx4 kx4VarF = u15.f(zc1.I(hx4Var, oh2Var3).y(b.a), ((dp) lp2Var4.j(ep.z)).b.b, u70.e);
                    boolean zF4 = lp2Var4.f(gn2Var) | lp2Var4.f(vo6Var);
                    Object objK9 = lp2Var4.K();
                    if (zF4 || objK9 == beVar) {
                        objK9 = new rn6(gn2Var, vo6Var, (byte) 0);
                        lp2Var4.g0(objK9);
                    }
                    z51.i(vo6Var, mb6.S(os4.z(vj8.x(kx4VarF, false, null, null, null, (dn2) objK9, lp2Var4, 31), 0.0f, 4.0f, 1), new tm6(laVar, b71Var, gn2Var, vo6Var, (byte) 2)), lp2Var4, 0);
                }
                break;
            case 5:
                b83 b83Var = (b83) obj8;
                String str3 = (String) obj7;
                String str4 = (String) obj6;
                gn2 gn2Var2 = (gn2) obj5;
                lp2 lp2Var5 = (lp2) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((uw0) obj).getClass();
                if (!lp2Var5.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    lp2Var5.Q();
                } else {
                    yn0.m(b83Var, str3, str4, gn2Var2, b.a, lp2Var5, 24576);
                }
                break;
            case 6:
                SubscriptionSortType subscriptionSortType = (SubscriptionSortType) obj8;
                j2 j2Var = (j2) obj6;
                gn2 gn2Var3 = (gn2) obj5;
                kx4 kx4Var2 = (kx4) obj7;
                lp2 lp2Var6 = (lp2) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((uw0) obj).getClass();
                if (!lp2Var6.N(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    lp2Var6.Q();
                } else {
                    w79.a(b.a, null, jm4.U(-798888886, new j30(subscriptionSortType, j2Var, gn2Var3, kx4Var2), lp2Var6), lp2Var6, 390);
                }
                break;
            case 7:
                ps7 ps7Var = (ps7) obj8;
                gn2 gn2Var4 = (gn2) obj6;
                kx4 kx4Var3 = (kx4) obj7;
                y68 y68Var = (y68) obj5;
                lp2 lp2Var7 = (lp2) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((uw0) obj).getClass();
                if (!lp2Var7.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    lp2Var7.Q();
                } else {
                    w79.a(b.a, null, jm4.U(-404384322, new j30(ps7Var, gn2Var4, kx4Var3, y68Var), lp2Var7), lp2Var7, 390);
                }
                break;
            default:
                z24 z24Var = (z24) obj8;
                oh2 oh2Var4 = (oh2) obj7;
                lh7 lh7Var2 = (lh7) obj6;
                pv3 pv3Var3 = (pv3) obj5;
                gg5 gg5Var3 = (gg5) obj;
                lp2 lp2Var8 = (lp2) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                gg5Var3.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= lp2Var8.f(gg5Var3) ? 4 : 2;
                }
                if (!lp2Var8.N(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    lp2Var8.Q();
                } else {
                    kx4 kx4VarU = ch3.u(zc1.I(dh3.V(os4.A(b.c, os4.h(gg5Var3, z24Var), 0.0f, os4.g(gg5Var3, z24Var), 0.0f, 10), dh3.G(lp2Var8)), oh2Var4));
                    tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var8, 0);
                    int iHashCode = Long.hashCode(lp2Var8.T);
                    kl5 kl5VarL = lp2Var8.l();
                    kx4 kx4VarQ = w45.Q(lp2Var8, kx4VarU);
                    uz0.j.getClass();
                    lp2Var8.Z();
                    if (lp2Var8.S) {
                        lp2Var8.k();
                    } else {
                        lp2Var8.j0();
                    }
                    pn7.m(pz2.B0, lp2Var8, tw0VarA);
                    pn7.m(pz2.A0, lp2Var8, kl5VarL);
                    pn7.m(pz2.C0, lp2Var8, Integer.valueOf(iHashCode));
                    pn7.l(lp2Var8);
                    pn7.m(pz2.z0, lp2Var8, kx4VarQ);
                    ch3.f(lp2Var8, b.b(hx4Var, gg5Var3.d()));
                    hu7 hu7Var = (hu7) lh7Var2.getValue();
                    hu7Var.getClass();
                    hi5.I(hu7Var instanceof fu7 ? (fu7) hu7Var : null, b.a, null, jm4.U(-1336408491, new m30(pv3Var3, b2), lp2Var8), lp2Var8, 3120, 4);
                    ch3.f(lp2Var8, b.b(hx4Var, gg5Var3.a()));
                    lp2Var8.p(true);
                }
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ h64(ps7 ps7Var, gn2 gn2Var, kx4 kx4Var, y68 y68Var) {
        this.X = (byte) 7;
        this.Y = ps7Var;
        this.f0 = gn2Var;
        this.Z = kx4Var;
        this.g0 = y68Var;
    }

    public /* synthetic */ h64(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
        this.g0 = obj4;
    }

    public /* synthetic */ h64(SubscriptionSortType subscriptionSortType, j2 j2Var, gn2 gn2Var, kx4 kx4Var) {
        this.X = (byte) 6;
        this.Y = subscriptionSortType;
        this.f0 = j2Var;
        this.g0 = gn2Var;
        this.Z = kx4Var;
    }
}
