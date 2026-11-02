package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.b;
import androidx.compose.material3.c;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class zv2 implements sn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ zv2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
        this.g0 = obj4;
        this.h0 = obj5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.X;
        be beVar = zz0.a;
        hx4 hx4Var = hx4.X;
        final byte b2 = 2;
        dn8 dn8Var = dn8.a;
        Object obj4 = this.h0;
        Object obj5 = this.g0;
        Object obj6 = this.f0;
        Object obj7 = this.Z;
        Object obj8 = this.Y;
        switch (b) {
            case 0:
                zy0 zy0Var = (zy0) obj8;
                dn2 dn2Var = (dn2) obj7;
                Context context = (Context) obj6;
                Activity activity = (Activity) obj5;
                Configuration configuration = (Configuration) obj4;
                uw0 uw0Var = (uw0) obj;
                lp2 lp2Var = (lp2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                uw0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= lp2Var.f(uw0Var) ? (byte) 4 : (byte) 2;
                }
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    lp2Var.Q();
                } else {
                    vr3.e(context, activity, configuration, jm4.U(1513971341, new dw2(zy0Var, uw0Var, dn2Var, (byte) 1), lp2Var), lp2Var);
                }
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                final um6 um6Var = (um6) obj8;
                final gn2 gn2Var = (gn2) obj7;
                oh2 oh2Var = (oh2) obj6;
                oh2 oh2Var2 = (oh2) obj5;
                la laVar = (la) obj4;
                lp2 lp2Var2 = (lp2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((l80) obj).getClass();
                if (!lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    lp2Var2.Q();
                } else {
                    Object objK = lp2Var2.K();
                    if (objK == beVar) {
                        objK = u70.D(lp2Var2);
                        lp2Var2.g0(objK);
                    }
                    b71 b71Var = (b71) objK;
                    kx4 kx4VarI = zc1.I(hx4Var, oh2Var);
                    boolean zF = lp2Var2.f(oh2Var2);
                    Object objK2 = lp2Var2.K();
                    if (zF || objK2 == beVar) {
                        objK2 = new bz2(oh2Var2, (byte) 4);
                        lp2Var2.g0(objK2);
                    }
                    kx4 kx4VarF = u15.f(z91.C(kx4VarI, (gn2) objK2).y(b.a), ((dp) lp2Var2.j(ep.z)).b.b, u70.e);
                    boolean z = !um6Var.b;
                    boolean zF2 = lp2Var2.f(gn2Var) | lp2Var2.f(um6Var);
                    Object objK3 = lp2Var2.K();
                    if (zF2 || objK3 == beVar) {
                        objK3 = new dn2() { // from class: qm6
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            public final Object invoke() {
                                byte b3 = b2;
                                dn8 dn8Var2 = dn8.a;
                                um6 um6Var2 = um6Var;
                                gn2 gn2Var2 = gn2Var;
                                switch (b3) {
                                    case 0:
                                        String str = um6Var2.c;
                                        str.getClass();
                                        gn2Var2.B(new ro7(str));
                                        break;
                                    case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                                        String str2 = um6Var2.c;
                                        str2.getClass();
                                        gn2Var2.B(new vo7(str2));
                                        break;
                                    default:
                                        String str3 = um6Var2.c;
                                        str3.getClass();
                                        gn2Var2.B(new uo7(str3));
                                        break;
                                }
                                return dn8Var2;
                            }
                        };
                        lp2Var2.g0(objK3);
                    }
                    kx4 kx4VarS = mb6.S(os4.z(vj8.x(kx4VarF, z, (xz4) null, (c) null, (dn2) null, (dn2) objK3, lp2Var2, 29), 0.0f, 4.0f, 1), new tm6(laVar, b71Var, gn2Var, um6Var, (byte) 0));
                    kx4 kx4VarI2 = zc1.I(hx4Var, oh2Var2);
                    boolean zF3 = lp2Var2.f(oh2Var);
                    Object objK4 = lp2Var2.K();
                    if (zF3 || objK4 == beVar) {
                        objK4 = new bz2(oh2Var, (byte) 3);
                        lp2Var2.g0(objK4);
                    }
                    u70.p(um6Var, gn2Var, kx4VarS, z91.C(kx4VarI2, (gn2) objK4), lp2Var2, 0);
                }
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                um6 um6Var2 = (um6) obj8;
                String str = um6Var2.c;
                String str2 = (String) obj7;
                String str3 = (String) obj6;
                gn2 gn2Var2 = (gn2) obj5;
                kx4 kx4Var = (kx4) obj4;
                k44 k44Var = (k44) obj;
                lp2 lp2Var3 = (lp2) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                k44Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= lp2Var3.f(k44Var) ? (byte) 4 : (byte) 2;
                }
                if (!lp2Var3.N(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    lp2Var3.Q();
                } else {
                    u70.o(um6Var2, str2 == null ? false : str2.equals(str), str3 != null ? str3.equals(str) : false, gn2Var2, dh3.p(k44Var, kx4Var), lp2Var3, 0);
                }
                break;
            case 3:
                is7 is7Var = (is7) obj8;
                gn2 gn2Var3 = (gn2) obj7;
                kx4 kx4Var2 = (kx4) obj6;
                y68 y68Var = (y68) obj5;
                y68 y68Var2 = (y68) obj4;
                lp2 lp2Var4 = (lp2) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((uw0) obj).getClass();
                if (!lp2Var4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    lp2Var4.Q();
                } else {
                    w79.a(b.a, (rn2) null, jm4.U(-1410186204, new no5(is7Var, gn2Var3, kx4Var2, y68Var, y68Var2), lp2Var4), lp2Var4, 390);
                }
                break;
            default:
                z24 z24Var = (z24) obj8;
                oh2 oh2Var3 = (oh2) obj7;
                yt7 yt7Var = (yt7) obj6;
                lh7 lh7Var = (lh7) obj5;
                pv3 pv3Var = (pv3) obj4;
                gg5 gg5Var = (gg5) obj;
                lp2 lp2Var5 = (lp2) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                gg5Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= lp2Var5.f(gg5Var) ? (byte) 4 : (byte) 2;
                }
                if (!lp2Var5.N(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    lp2Var5.Q();
                } else {
                    kx4 kx4VarU = ch3.u(zc1.I(dh3.V(os4.A(b.c, os4.h(gg5Var, z24Var), 0.0f, os4.g(gg5Var, z24Var), 0.0f, 10), dh3.G(lp2Var5)), oh2Var3));
                    tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var5, 0);
                    int iHashCode = Long.hashCode(lp2Var5.T);
                    kl5 kl5VarL = lp2Var5.l();
                    kx4 kx4VarQ = w45.Q(lp2Var5, kx4VarU);
                    uz0.j.getClass();
                    lp2Var5.Z();
                    if (lp2Var5.S) {
                        lp2Var5.k();
                    } else {
                        lp2Var5.j0();
                    }
                    pn7.m(pz2.B0, lp2Var5, tw0VarA);
                    pn7.m(pz2.A0, lp2Var5, kl5VarL);
                    pn7.m(pz2.C0, lp2Var5, Integer.valueOf(iHashCode));
                    pn7.l(lp2Var5);
                    pn7.m(pz2.z0, lp2Var5, kx4VarQ);
                    ch3.f(lp2Var5, b.b(hx4Var, gg5Var.d()));
                    hi5.I(((et7) lh7Var.getValue()).c, b.a, (kx4) null, jm4.U(927418363, new o90(pv3Var, lh7Var, (byte) 16), lp2Var5), lp2Var5, 3120, 4);
                    ch3.f(lp2Var5, b.b(hx4Var, gg5Var.a()));
                    lp2Var5.p(true);
                    f76 f76Var = yt7Var.g;
                    f76Var.getClass();
                    Context context2 = (Context) lp2Var5.j(pc.b);
                    Activity activity2 = (Activity) lp2Var5.j(yc4.a);
                    boolean zH = lp2Var5.h(f76Var) | lp2Var5.h(context2) | lp2Var5.h(activity2);
                    Object objK5 = lp2Var5.K();
                    if (zH || objK5 == beVar) {
                        qk4 qk4Var = new qk4(f76Var, context2, activity2, (q51) null, (byte) 20);
                        lp2Var5.g0(qk4Var);
                        objK5 = qk4Var;
                    }
                    u70.h((rn2) objK5, lp2Var5, f76Var);
                }
                break;
        }
        return dn8Var;
    }
}
