package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class df4 implements sn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;
    public final /* synthetic */ Object i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ df4(lg4 lg4Var, ci4 ci4Var, j74 j74Var, pv3 pv3Var, oh2 oh2Var, y05 y05Var) {
        this.X = (byte) 1;
        this.Z = lg4Var;
        this.f0 = ci4Var;
        this.g0 = j74Var;
        this.h0 = pv3Var;
        this.Y = oh2Var;
        this.i0 = y05Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object x(Object obj, Object obj2, Object obj3) {
        dn8 dn8Var;
        gw5 gw5Var;
        lp2 lp2Var;
        boolean z;
        boolean z2;
        byte b = this.X;
        Object obj4 = zz0.a;
        dn8 dn8Var2 = dn8.a;
        Object obj5 = this.i0;
        Object obj6 = this.h0;
        Object obj7 = this.g0;
        Object obj8 = this.Y;
        Object obj9 = this.f0;
        Object obj10 = this.Z;
        switch (b) {
            case 0:
                final lf4 lf4Var = (lf4) obj10;
                final gn2 gn2Var = (gn2) obj9;
                oh2 oh2Var = (oh2) obj8;
                b71 b71Var = (b71) obj7;
                dn2 dn2Var = (dn2) obj6;
                la laVar = (la) obj5;
                lp2 lp2Var2 = (lp2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((l80) obj).getClass();
                if (lp2Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zF = lp2Var2.f(gn2Var) | lp2Var2.f(lf4Var);
                    Object objK = lp2Var2.K();
                    if (zF || objK == obj4) {
                        final byte b2 = 0;
                        objK = new dn2() { // from class: ff4
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            public final Object invoke() {
                                byte b3 = b2;
                                dn8 dn8Var3 = dn8.a;
                                lf4 lf4Var2 = lf4Var;
                                gn2 gn2Var2 = gn2Var;
                                switch (b3) {
                                    case 0:
                                        lf4Var2.getClass();
                                        gn2Var2.B(new dg4(lf4Var2));
                                        break;
                                    default:
                                        String str = lf4Var2.b;
                                        str.getClass();
                                        gn2Var2.B(new yf4(str));
                                        break;
                                }
                                return dn8Var3;
                            }
                        };
                        lp2Var2.g0(objK);
                    }
                    dn2 dn2Var2 = (dn2) objK;
                    kx4 kx4VarI = zc1.I(b.a, oh2Var);
                    boolean zH = lp2Var2.h(b71Var) | lp2Var2.f(dn2Var) | lp2Var2.f(gn2Var) | lp2Var2.f(lf4Var);
                    Object objK2 = lp2Var2.K();
                    if (zH || objK2 == obj4) {
                        hf4 hf4Var = new hf4(laVar, b71Var, dn2Var, gn2Var, lf4Var);
                        lp2Var2.g0(hf4Var);
                        objK2 = hf4Var;
                    }
                    jm4.k(lf4Var, dn2Var2, mb6.S(kx4VarI, (gn2) objK2), lp2Var2, 0);
                } else {
                    lp2Var2.Q();
                }
                return dn8Var2;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                lg4 lg4Var = (lg4) obj10;
                ci4 ci4Var = (ci4) obj9;
                j74 j74Var = (j74) obj7;
                pv3 pv3Var = (pv3) obj6;
                oh2 oh2Var2 = (oh2) obj8;
                y05 y05Var = (y05) obj5;
                gg5 gg5Var = (gg5) obj;
                lp2 lp2Var3 = (lp2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                gg5Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= lp2Var3.f(gg5Var) ? 4 : 2;
                }
                if (lp2Var3.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    FillElement fillElement = b.c;
                    hi5.I(lg4Var, fillElement, fillElement, jm4.U(552947049, new h64(pv3Var, j74Var, gg5Var, oh2Var2, (byte) 3), lp2Var3), lp2Var3, 3504, 0);
                    ng4 ng4Var = (ng4) y05Var.getValue();
                    f76 f76Var = ci4Var.f;
                    ng4Var.getClass();
                    f76Var.getClass();
                    j74Var.getClass();
                    Context context = (Context) lp2Var3.j(pc.b);
                    Activity activity = (Activity) lp2Var3.j(yc4.a);
                    Resources resources = (Resources) lp2Var3.j(pc.c);
                    ky2 ky2Var = (ky2) lp2Var3.j(ly2.a);
                    Object[] objArr = {f76Var, context, activity, resources, ky2Var, j74Var, ng4Var};
                    boolean zH2 = lp2Var3.h(f76Var) | lp2Var3.h(context) | lp2Var3.f(ky2Var) | lp2Var3.h(resources) | lp2Var3.h(activity) | lp2Var3.f(ng4Var) | lp2Var3.f(j74Var);
                    Object objK3 = lp2Var3.K();
                    if (zH2 || objK3 == obj4) {
                        ft1 ft1Var = new ft1(f76Var, context, ky2Var, resources, activity, ng4Var, j74Var, (q51) null, (byte) 3);
                        lp2Var3.g0(ft1Var);
                        objK3 = ft1Var;
                    }
                    u70.k(objArr, (rn2) objK3, lp2Var3);
                } else {
                    lp2Var3.Q();
                }
                return dn8Var2;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                vo6 vo6Var = (vo6) obj10;
                String str = vo6Var.c;
                String str2 = (String) obj8;
                tn6 tn6Var = (tn6) obj7;
                String str3 = (String) obj6;
                gn2 gn2Var2 = (gn2) obj9;
                kx4 kx4Var = (kx4) obj5;
                k44 k44Var = (k44) obj;
                lp2 lp2Var4 = (lp2) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                k44Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= lp2Var4.f(k44Var) ? 4 : 2;
                }
                if (lp2Var4.N(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    z51.h(vo6Var, str2 == null ? false : dh3.f(str, str2), !tn6Var.b, str3 == null ? false : str3.equals(str), gn2Var2, dh3.p(k44Var, kx4Var), lp2Var4, 0);
                } else {
                    lp2Var4.Q();
                }
                return dn8Var2;
            default:
                ep6 ep6Var = (ep6) obj10;
                gw5 gw5Var2 = (gw5) obj9;
                sq6 sq6Var = (sq6) obj8;
                gn2 gn2Var3 = (pv3) obj7;
                lh7 lh7Var = (lh7) obj6;
                o87 o87Var = (o87) obj5;
                gg5 gg5Var2 = (gg5) obj;
                lp2 lp2Var5 = (lp2) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                gg5Var2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= lp2Var5.f(gg5Var2) ? 4 : 2;
                }
                if (lp2Var5.N(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    z24 z24Var = (z24) lp2Var5.j(y01.n);
                    f76 f76Var2 = ep6Var.h;
                    boolean zH3 = lp2Var5.h(gw5Var2);
                    Object objK4 = lp2Var5.K();
                    if (zH3 || objK4 == obj4) {
                        al5 al5Var = new al5(1, gw5Var2, gw5.class, "onUiIntent", "onUiIntent(Lsu/happ/proxyutility/feature/routing/duplicated_name/ProfileDuplicatedNameUiIntent;)V", 0, (byte) 6);
                        gw5Var = gw5Var2;
                        lp2Var5.g0(al5Var);
                        objK4 = al5Var;
                    } else {
                        gw5Var = gw5Var2;
                    }
                    gn2 gn2Var4 = (pv3) objK4;
                    boolean zH4 = lp2Var5.h(sq6Var);
                    Object objK5 = lp2Var5.K();
                    if (zH4 || objK5 == obj4) {
                        objK5 = new hr5(sq6Var, (byte) 8);
                        lp2Var5.g0(objK5);
                    }
                    dn2 dn2Var3 = (dn2) objK5;
                    gn2 gn2Var5 = gn2Var4;
                    f76Var2.getClass();
                    dn2Var3.getClass();
                    gn2Var5.getClass();
                    Context context2 = (Context) lp2Var5.j(pc.b);
                    Resources resources2 = (Resources) lp2Var5.j(pc.c);
                    Activity activity2 = (Activity) lp2Var5.j(yc4.a);
                    gw5 gw5Var3 = gw5Var;
                    ky2 ky2Var2 = (ky2) lp2Var5.j(ly2.a);
                    dn8Var = dn8Var2;
                    Object[] objArr2 = {f76Var2, context2, resources2, activity2, ky2Var2};
                    boolean zH5 = lp2Var5.h(f76Var2) | lp2Var5.f(ky2Var2) | lp2Var5.h(resources2) | lp2Var5.h(context2) | lp2Var5.h(activity2) | lp2Var5.f(dn2Var3) | lp2Var5.f(gn2Var5);
                    Object objK6 = lp2Var5.K();
                    if (zH5 || objK6 == obj4) {
                        objK6 = new ft1(f76Var2, ky2Var2, resources2, context2, activity2, dn2Var3, gn2Var5, (q51) null, (byte) 4);
                        lp2Var5.g0(objK6);
                    }
                    u70.k(objArr2, (rn2) objK6, lp2Var5);
                    zc1.i((sn6) lh7Var.getValue(), gn2Var3, os4.A(b.c, os4.h(gg5Var2, z24Var), gg5Var2.d(), os4.g(gg5Var2, z24Var), 0.0f, 8), lp2Var5, 0);
                    if (((sn6) lh7Var.getValue()).k) {
                        lp2Var5.W(548795037);
                        boolean zF2 = lp2Var5.f(gn2Var3);
                        Object objK7 = lp2Var5.K();
                        if (zF2 || objK7 == obj4) {
                            objK7 = new aa3(gn2Var3, (byte) 3);
                            lp2Var5.g0(objK7);
                        }
                        dn2 dn2Var4 = (dn2) objK7;
                        boolean zF3 = lp2Var5.f(lh7Var) | lp2Var5.f(gn2Var3);
                        Object objK8 = lp2Var5.K();
                        if (zF3 || objK8 == obj4) {
                            objK8 = new d3(gn2Var3, lh7Var, (byte) 16);
                            lp2Var5.g0(objK8);
                        }
                        ch3.e(sq6Var, dn2Var4, (gn2) objK8, o87Var, lp2Var5, 8);
                        lp2Var = lp2Var5;
                        z = false;
                        lp2Var.p(false);
                    } else {
                        lp2Var = lp2Var5;
                        z = false;
                        lp2Var.W(549691650);
                        lp2Var.p(false);
                    }
                    lw5 lw5Var = ((sn6) lh7Var.getValue()).e;
                    if (!(lw5Var instanceof jw5)) {
                        if (lw5Var instanceof kw5) {
                            lp2Var.W(-674998045);
                            boolean zF4 = lp2Var.f(gn2Var3);
                            Object objK9 = lp2Var.K();
                            if (zF4 || objK9 == obj4) {
                                objK9 = new aa3(gn2Var3, (byte) 4);
                                lp2Var.g0(objK9);
                            }
                            dn2 dn2Var5 = (dn2) objK9;
                            boolean zF5 = lp2Var.f(gn2Var3) | lp2Var.f(lw5Var);
                            Object objK10 = lp2Var.K();
                            if (zF5 || objK10 == obj4) {
                                objK10 = new zw2(gn2Var3, lw5Var, (byte) 28);
                                lp2Var.g0(objK10);
                            }
                            ys0.k(dn2Var5, (gn2) objK10, (kx4) null, lp2Var, 0);
                            lp2Var.p(false);
                        } else {
                            lp2Var.W(-675003677);
                            lp2Var.p(false);
                            b61.c();
                        }
                        return null;
                    }
                    lp2Var.W(-675000567);
                    lp2Var.p(z);
                    if (((sn6) lh7Var.getValue()).g) {
                        lp2Var.W(550433790);
                        boolean zF6 = lp2Var.f(gn2Var3);
                        Object objK11 = lp2Var.K();
                        if (zF6 || objK11 == obj4) {
                            objK11 = new aa3(gn2Var3, (byte) 5);
                            lp2Var.g0(objK11);
                        }
                        yn0.l(gw5Var3, (dn2) objK11, (dn2) null, lp2Var, 8, 12);
                        z2 = false;
                        lp2Var.p(false);
                    } else {
                        z2 = false;
                        lp2Var.W(550806658);
                        lp2Var.p(false);
                    }
                    bw5 bw5Var = ((sn6) lh7Var.getValue()).i;
                    if (bw5Var instanceof xv5) {
                        lp2Var.W(-674964919);
                        lp2Var.p(z2);
                    } else {
                        if (!(bw5Var instanceof zv5)) {
                            lp2Var.W(-674967656);
                            lp2Var.p(false);
                            b61.c();
                            return null;
                        }
                        lp2Var.W(550999323);
                        boolean zF7 = lp2Var.f(gn2Var3);
                        Object objK12 = lp2Var.K();
                        if (zF7 || objK12 == obj4) {
                            objK12 = new aa3(gn2Var3, (byte) 6);
                            lp2Var.g0(objK12);
                        }
                        dn2 dn2Var6 = (dn2) objK12;
                        boolean zF8 = lp2Var.f(gn2Var3) | lp2Var.f(bw5Var);
                        Object objK13 = lp2Var.K();
                        if (zF8 || objK13 == obj4) {
                            objK13 = new a23(gn2Var3, bw5Var, (byte) 15);
                            lp2Var.g0(objK13);
                        }
                        u70.l(dn2Var6, (dn2) objK13, (kx4) null, lp2Var, 0);
                        lp2Var.p(false);
                    }
                } else {
                    dn8Var = dn8Var2;
                    lp2Var5.Q();
                }
                return dn8Var;
        }
    }

    public /* synthetic */ df4(vo6 vo6Var, String str, tn6 tn6Var, String str2, gn2 gn2Var, kx4 kx4Var) {
        this.X = (byte) 2;
        this.Z = vo6Var;
        this.Y = str;
        this.g0 = tn6Var;
        this.h0 = str2;
        this.f0 = gn2Var;
        this.i0 = kx4Var;
    }

    public /* synthetic */ df4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.X = b;
        this.Z = obj;
        this.f0 = obj2;
        this.Y = obj3;
        this.g0 = obj4;
        this.h0 = obj5;
        this.i0 = obj6;
    }
}
