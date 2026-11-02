package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fh implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;

    public /* synthetic */ fh(Object obj, gn2 gn2Var, kx4 kx4Var, byte b) {
        this.X = b;
        this.f0 = obj;
        this.Y = gn2Var;
        this.Z = kx4Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        be beVar = zz0.a;
        byte b2 = 1;
        dn8 dn8Var = dn8.a;
        Object obj3 = this.Y;
        Object obj4 = this.f0;
        Object obj5 = this.Z;
        switch (b) {
            case 0:
                kx4 kx4Var = (kx4) obj5;
                y05 y05Var = (y05) obj4;
                zy0 zy0Var = (zy0) obj3;
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    Object objK = lp2Var.K();
                    if (objK == beVar) {
                        objK = new gh(y05Var, (byte) 0);
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
                    lp2Var.p(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                y01.a((mf5) obj5, (bi) obj4, (zy0) obj3, (lp2) obj, w79.P(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                gr2.c((ir2) obj4, (gn2) obj3, (kx4) obj5, (lp2) obj, w79.P(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                u70.e((b83) obj4, (gn2) obj3, (kx4) obj5, (lp2) obj, w79.P(385));
                break;
            case 4:
                ((Integer) obj2).getClass();
                nr4.a((String) obj4, (dn2) obj3, (kx4) obj5, (lp2) obj, w79.P(385));
                break;
            case 5:
                ((Integer) obj2).getClass();
                u15.a((String) obj4, (String) obj3, (kx4) obj5, (lp2) obj, w79.P(385));
                break;
            case 6:
                ((Integer) obj2).getClass();
                u70.f((fa3) obj4, (gn2) obj3, (kx4) obj5, (lp2) obj, w79.P(385));
                break;
            case 7:
                ((Integer) obj2).getClass();
                yn0.h((ha3) obj4, (gn2) obj3, (kx4) obj5, (lp2) obj, w79.P(385));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ys0.h((ga3) obj4, (gn2) obj3, (kx4) obj5, (lp2) obj, w79.P(385));
                break;
            case 9:
                ((Integer) obj2).getClass();
                yn0.i((n84) obj5, (d94) obj4, (dn2) obj3, (lp2) obj, w79.P(7));
                break;
            case 10:
                ((Integer) obj2).getClass();
                jm4.k((lf4) obj4, (dn2) obj3, (kx4) obj5, (lp2) obj, w79.P(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                u15.b((lg4) obj4, (gn2) obj3, (kx4) obj5, (lp2) obj, w79.P(385));
                break;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                ((Integer) obj2).getClass();
                oc.c((om6) obj4, (gn2) obj3, (kx4) obj5, (lp2) obj, w79.P(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                pu.e((j2) obj4, (gn2) obj3, (kx4) obj5, (lp2) obj, w79.P(385));
                break;
            case 14:
                ((Integer) obj2).getClass();
                u70.l((dn2) obj4, (dn2) obj3, (kx4) obj5, (lp2) obj, w79.P(1));
                break;
            case 15:
                dn2 dn2Var = (dn2) obj5;
                pv3 pv3Var = (pv3) obj4;
                dn2 dn2Var2 = (dn2) obj3;
                lp2 lp2Var2 = (lp2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    lp2Var2.Q();
                } else {
                    wq6 wq6VarA = vq6.a(new ft(8.0f, new bt()), pz2.o0, lp2Var2, 54);
                    int iHashCode2 = Long.hashCode(lp2Var2.T);
                    kl5 kl5VarL2 = lp2Var2.l();
                    kx4 kx4VarQ3 = w45.Q(lp2Var2, hx4.X);
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
                    pn7.m(pz2.z0, lp2Var2, kx4VarQ3);
                    String strJ0 = vj8.j0(y46.dialog_input_in_center_button_negative, lp2Var2);
                    ox1 ox1Var = es.a;
                    o88 o88Var = ((ds) lp2Var2.j(ox1Var)).c;
                    ox1 ox1Var2 = ep.z;
                    long j = ((dp) lp2Var2.j(ox1Var2)).c.a;
                    dj2 dj2Var = dj2.f0;
                    z51.g(strJ0, null, false, o88.a(o88Var, j, 0L, dj2Var, null, 0L, 0L, null, 16777210), 0, 0, 1, 0, false, null, null, dn2Var, lp2Var2, 1572864, 4022);
                    String strJ1 = vj8.j0(y46.sub_routing_duplicated_name_replace, lp2Var2);
                    o88 o88VarA = o88.a(((ds) lp2Var2.j(ox1Var)).c, ((dp) lp2Var2.j(ox1Var2)).a, 0L, dj2Var, null, 0L, 0L, null, 16777210);
                    boolean zF = lp2Var2.f(pv3Var) | lp2Var2.f(dn2Var2) | lp2Var2.f(dn2Var);
                    Object objK2 = lp2Var2.K();
                    if (zF || objK2 == beVar) {
                        objK2 = new g00((Object) pv3Var, (Object) dn2Var2, (Object) dn2Var, (byte) 16);
                        lp2Var2.g0(objK2);
                    }
                    z51.g(strJ1, null, false, o88VarA, 0, 0, 1, 0, false, null, null, (dn2) objK2, lp2Var2, 1572864, 4022);
                    lp2Var2.p(true);
                }
                break;
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                ((Integer) obj2).getClass();
                ys0.k((dn2) obj4, (gn2) obj3, (kx4) obj5, (lp2) obj, w79.P(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                zc1.i((sn6) obj4, (gn2) obj3, (kx4) obj5, (lp2) obj, w79.P(1));
                break;
            case 18:
                ba6 ba6Var = (ba6) obj5;
                sy6 sy6Var = (sy6) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jI = sy6Var.i(sy6Var.e(fFloatValue - ba6Var.X));
                sy6 sy6Var2 = ((ry6) obj3).a;
                ba6Var.X += sy6Var.e(sy6Var.h(sy6Var2.d(sy6Var2.k, jI, 1)));
                break;
            case 19:
                ((Integer) obj2).getClass();
                qp7.a((yr7) obj4, (gn2) obj3, (kx4) obj5, (lp2) obj, w79.P(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                rp7.a((cm5) obj4, (gn2) obj3, (kx4) obj5, (lp2) obj, w79.P(385));
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                fu7 fu7Var = (fu7) obj4;
                gn2 gn2Var = (gn2) obj3;
                kx4 kx4Var2 = (kx4) obj5;
                lp2 lp2Var3 = (lp2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!lp2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    lp2Var3.Q();
                } else {
                    String strJ2 = vj8.j0(y46.title_pref_reject_duplicates, lp2Var3);
                    boolean z = fu7Var.a;
                    boolean zF2 = lp2Var3.f(gn2Var);
                    Object objK3 = lp2Var3.K();
                    if (zF2 || objK3 == beVar) {
                        objK3 = new pr2(gn2Var, (byte) 10);
                        lp2Var3.g0(objK3);
                    }
                    g33.a(strJ2, z, (gn2) objK3, kx4Var2, false, null, null, lp2Var3, 3072, 240);
                    String strJ3 = vj8.j0(y46.title_pref_use_legacy_okhttp, lp2Var3);
                    boolean z2 = fu7Var.b;
                    boolean zF3 = lp2Var3.f(gn2Var);
                    Object objK4 = lp2Var3.K();
                    if (zF3 || objK4 == beVar) {
                        objK4 = new pr2(gn2Var, (byte) 11);
                        lp2Var3.g0(objK4);
                    }
                    g33.a(strJ3, z2, (gn2) objK4, kx4Var2, false, null, null, lp2Var3, 3072, 240);
                }
                break;
            case 22:
                ms7 ms7Var = (ms7) obj4;
                gn2 gn2Var2 = (gn2) obj3;
                kx4 kx4Var3 = (kx4) obj5;
                lp2 lp2Var4 = (lp2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!lp2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    lp2Var4.Q();
                } else {
                    String strJ4 = vj8.j0(y46.sub_properties_sending_data_hwid, lp2Var4);
                    boolean z3 = ms7Var.a;
                    boolean z4 = !ms7Var.b;
                    boolean zF4 = lp2Var4.f(gn2Var2);
                    Object objK5 = lp2Var4.K();
                    if (zF4 || objK5 == beVar) {
                        objK5 = new pr2(gn2Var2, (byte) 22);
                        lp2Var4.g0(objK5);
                    }
                    g33.a(strJ4, z3, (gn2) objK5, kx4Var3, z4, null, null, lp2Var4, 3072, 224);
                }
                break;
            case 23:
                da6 da6Var = (da6) obj5;
                r68 r68Var = (r68) obj4;
                hq5 hq5Var = (hq5) obj;
                long jF = z85.f(da6Var.X, ((z85) obj2).a);
                da6Var.X = jF;
                r68Var.B(ev2.X, z85.f(((da6) obj3).X, jF));
                if (r68Var.v(r68Var.n())) {
                    hq5Var.a();
                    ez2 ez2Var = r68Var.j;
                    if (ez2Var != null) {
                        ((so5) ez2Var).a(9);
                    }
                }
                break;
            default:
                h59 h59Var = (h59) obj5;
                xz0 xz0Var = (xz0) obj4;
                zy0 zy0Var2 = (zy0) obj3;
                lp2 lp2Var5 = (lp2) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!lp2Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    lp2Var5.Q();
                } else {
                    AndroidComposeView androidComposeView = h59Var.X;
                    boolean zH = lp2Var5.h(h59Var);
                    Object objK6 = lp2Var5.K();
                    q51 q51Var = null;
                    if (zH || objK6 == beVar) {
                        objK6 = new g59(h59Var, q51Var, false ? (byte) 1 : (byte) 0);
                        lp2Var5.g0(objK6);
                    }
                    u70.h((rn2) objK6, lp2Var5, androidComposeView);
                    boolean zH2 = lp2Var5.h(h59Var);
                    Object objK7 = lp2Var5.K();
                    if (zH2 || objK7 == beVar) {
                        objK7 = new g59(h59Var, q51Var, b2);
                        lp2Var5.g0(objK7);
                    }
                    u70.h((rn2) objK7, lp2Var5, androidComposeView);
                    xz0Var.a(androidComposeView, zy0Var2, lp2Var5, 0);
                }
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ fh(Object obj, Object obj2, on2 on2Var, int i, byte b) {
        this.X = b;
        this.Z = obj;
        this.f0 = obj2;
        this.Y = on2Var;
    }

    public /* synthetic */ fh(Object obj, Object obj2, kx4 kx4Var, int i, byte b) {
        this.X = b;
        this.f0 = obj;
        this.Y = obj2;
        this.Z = kx4Var;
    }

    public /* synthetic */ fh(Object obj, Object obj2, Object obj3, byte b) {
        this.X = b;
        this.Z = obj;
        this.f0 = obj2;
        this.Y = obj3;
    }
}
