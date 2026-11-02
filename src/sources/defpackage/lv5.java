package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class lv5 implements tn2 {
    public final /* synthetic */ byte X = 2;
    public final /* synthetic */ pv3 Y;
    public final /* synthetic */ on2 Z;
    public final /* synthetic */ lh7 f0;
    public final /* synthetic */ xw8 g0;
    public final /* synthetic */ on2 h0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ lv5(vv5 vv5Var, dn2 dn2Var, pv3 pv3Var, dn2 dn2Var2, y05 y05Var) {
        this.g0 = vv5Var;
        this.Z = dn2Var;
        this.Y = pv3Var;
        this.h0 = dn2Var2;
        this.f0 = y05Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object F(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.X;
        ct ctVar = ht.a;
        dn8 dn8Var = dn8.a;
        hx4 hx4Var = hx4.X;
        Object obj5 = zz0.a;
        lh7 lh7Var = this.f0;
        gn2 gn2Var = this.Y;
        rn2 rn2Var = this.h0;
        tn2 tn2Var = this.Z;
        xw8 xw8Var = this.g0;
        switch (b) {
            case 0:
                vv5 vv5Var = (vv5) xw8Var;
                dn2 dn2Var = (dn2) tn2Var;
                dn2 dn2Var2 = (dn2) rn2Var;
                lp2 lp2Var = (lp2) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((uw0) obj).getClass();
                ((dn2) obj2).getClass();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 129) != 128)) {
                    lp2Var.Q();
                } else {
                    f76 f76Var = vv5Var.g;
                    f76Var.getClass();
                    dn2Var.getClass();
                    boolean zH = lp2Var.h(f76Var) | lp2Var.f(dn2Var);
                    Object objK = lp2Var.K();
                    if (zH || objK == obj5) {
                        objK = new jy2(f76Var, dn2Var, (q51) null, (byte) 20);
                        lp2Var.g0(objK);
                    }
                    u70.j(f76Var, dn2Var, (rn2) objK, lp2Var);
                    o50 o50Var = pz2.o0;
                    FillElement fillElement = b.a;
                    kx4 kx4VarY = os4.y(fillElement, 16.0f, 8.0f);
                    wq6 wq6VarA = vq6.a(ctVar, o50Var, lp2Var, 48);
                    int iHashCode = Long.hashCode(lp2Var.T);
                    kl5 kl5VarL = lp2Var.l();
                    kx4 kx4VarQ = w45.Q(lp2Var, kx4VarY);
                    uz0.j.getClass();
                    lp2Var.Z();
                    if (lp2Var.S) {
                        lp2Var.k();
                    } else {
                        lp2Var.j0();
                    }
                    pn7.m(pz2.B0, lp2Var, wq6VarA);
                    pn7.m(pz2.A0, lp2Var, kl5VarL);
                    pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
                    pn7.l(lp2Var);
                    pn7.m(pz2.z0, lp2Var, kx4VarQ);
                    String strJ0 = vj8.j0(y46.cancel, lp2Var);
                    ox1 ox1Var = es.a;
                    o88 o88Var = ((ds) lp2Var.j(ox1Var)).b;
                    ox1 ox1Var2 = ep.z;
                    o88 o88VarA = o88.a(o88Var, ((dp) lp2Var.j(ox1Var2)).a, 0L, (dj2) null, (gi2) null, 0L, 0L, (aa4) null, 16777214);
                    boolean zF = lp2Var.f(gn2Var) | lp2Var.f(dn2Var2);
                    Object objK2 = lp2Var.K();
                    if (zF || objK2 == obj5) {
                        objK2 = new nq2(gn2Var, dn2Var2, (byte) 1);
                        lp2Var.g0(objK2);
                    }
                    z51.g(strJ0, (kx4) null, false, o88VarA, 0, 0, 1, 0, false, (ig5) null, (x67) null, (dn2) objK2, lp2Var, 1572864, 4022);
                    ch3.f(lp2Var, xq6.a());
                    zc1.g(vj8.j0(y46.routing_sub_select_title, lp2Var), (kx4) null, o88.a(((ds) lp2Var.j(ox1Var)).a.c, ((dp) lp2Var.j(ox1Var2)).c.a, 0L, (dj2) null, (gi2) null, 0L, 0L, (aa4) null, 16777214), 0, 0, 1, 0, false, (gn2) null, lp2Var, 196608, 474);
                    ch3.f(lp2Var, xq6.a());
                    String strJ1 = vj8.j0(y46.done, lp2Var);
                    o88 o88VarA2 = o88.a(((ds) lp2Var.j(ox1Var)).b, ((dp) lp2Var.j(ox1Var2)).c.a, 0L, (dj2) null, (gi2) null, 0L, 0L, (aa4) null, 16777214);
                    boolean zF2 = lp2Var.f(gn2Var) | lp2Var.f(dn2Var2);
                    Object objK3 = lp2Var.K();
                    if (zF2 || objK3 == obj5) {
                        objK3 = new nq2(gn2Var, dn2Var2, (byte) 2);
                        lp2Var.g0(objK3);
                    }
                    z51.g(strJ1, (kx4) null, false, o88VarA2, 0, 0, 1, 0, false, (ig5) null, (x67) null, (dn2) objK3, lp2Var, 1572864, 4022);
                    lp2Var.p(true);
                    ch3.f(lp2Var, b.b(hx4Var, 12.0f));
                    hi5.J(((nv5) lh7Var.getValue()).d, fillElement, os4.z(fillElement, 0.0f, 12.0f, 1), jm4.U(1703881712, new oq2(gn2Var, lh7Var, (byte) 1), lp2Var), lp2Var, 3504);
                }
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                sq6 sq6Var = (sq6) xw8Var;
                gn2 gn2Var2 = (gn2) rn2Var;
                dn2 dn2Var3 = (dn2) tn2Var;
                lp2 lp2Var2 = (lp2) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((uw0) obj).getClass();
                ((dn2) obj2).getClass();
                if (!lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 129) != 128)) {
                    lp2Var2.Q();
                } else {
                    f76 f76Var2 = sq6Var.e;
                    f76Var2.getClass();
                    gn2Var2.getClass();
                    boolean zH2 = lp2Var2.h(f76Var2) | lp2Var2.f(gn2Var2);
                    Object objK4 = lp2Var2.K();
                    if (zH2 || objK4 == obj5) {
                        objK4 = new jy2(f76Var2, gn2Var2, (q51) null, (byte) 26);
                        lp2Var2.g0(objK4);
                    }
                    u70.h((rn2) objK4, lp2Var2, f76Var2);
                    o50 o50Var2 = pz2.o0;
                    FillElement fillElement2 = b.a;
                    kx4 kx4VarY2 = os4.y(fillElement2, 16.0f, 8.0f);
                    wq6 wq6VarA2 = vq6.a(ctVar, o50Var2, lp2Var2, 48);
                    int iHashCode2 = Long.hashCode(lp2Var2.T);
                    kl5 kl5VarL2 = lp2Var2.l();
                    kx4 kx4VarQ2 = w45.Q(lp2Var2, kx4VarY2);
                    uz0.j.getClass();
                    lp2Var2.Z();
                    if (lp2Var2.S) {
                        lp2Var2.k();
                    } else {
                        lp2Var2.j0();
                    }
                    pn7.m(pz2.B0, lp2Var2, wq6VarA2);
                    pn7.m(pz2.A0, lp2Var2, kl5VarL2);
                    pn7.m(pz2.C0, lp2Var2, Integer.valueOf(iHashCode2));
                    pn7.l(lp2Var2);
                    pn7.m(pz2.z0, lp2Var2, kx4VarQ2);
                    String strJ2 = vj8.j0(y46.cancel, lp2Var2);
                    o88 o88VarA3 = o88.a(ys0.D(lp2Var2).b, ys0.y(lp2Var2).a, 0L, (dj2) null, (gi2) null, 0L, 0L, (aa4) null, 16777214);
                    boolean zF3 = lp2Var2.f(gn2Var) | lp2Var2.f(dn2Var3);
                    Object objK5 = lp2Var2.K();
                    if (zF3 || objK5 == obj5) {
                        objK5 = new jq6(gn2Var, dn2Var3, (byte) 1);
                        lp2Var2.g0(objK5);
                    }
                    z51.g(strJ2, (kx4) null, false, o88VarA3, 0, 0, 1, 0, false, (ig5) null, (x67) null, (pv3) objK5, lp2Var2, 1572864, 4022);
                    ch3.f(lp2Var2, xq6.a());
                    zc1.g(vj8.j0(y46.routing_sub_select_title, lp2Var2), (kx4) null, o88.a(ys0.D(lp2Var2).a.c, ys0.y(lp2Var2).c.a, 0L, (dj2) null, (gi2) null, 0L, 0L, (aa4) null, 16777214), 0, 0, 1, 0, false, (gn2) null, lp2Var2, 196608, 474);
                    ch3.f(lp2Var2, xq6.a());
                    String strJ3 = vj8.j0(y46.done, lp2Var2);
                    o88 o88VarA4 = o88.a(ys0.D(lp2Var2).b, ys0.y(lp2Var2).c.a, 0L, (dj2) null, (gi2) null, 0L, 0L, (aa4) null, 16777214);
                    boolean zF4 = lp2Var2.f(gn2Var);
                    Object objK6 = lp2Var2.K();
                    if (zF4 || objK6 == obj5) {
                        objK6 = new aa3(gn2Var, (byte) 7);
                        lp2Var2.g0(objK6);
                    }
                    z51.g(strJ3, (kx4) null, false, o88VarA4, 0, 0, 1, 0, false, (ig5) null, (x67) null, (dn2) objK6, lp2Var2, 1572864, 4022);
                    lp2Var2.p(true);
                    ch3.f(lp2Var2, b.b(hx4Var, 24.0f));
                    zc1.g(vj8.j0(y46.routing_sub_select_description, lp2Var2), os4.z(fillElement2, 16.0f, 0.0f, 2), o88.a(ys0.D(lp2Var2).d, ys0.y(lp2Var2).c.c, 0L, (dj2) null, (gi2) null, 0L, 0L, (aa4) null, 16777214), 0, 0, 1, 0, false, (gn2) null, lp2Var2, 196656, 472);
                    ch3.f(lp2Var2, b.b(hx4Var, 12.0f));
                    hi5.J(((kq6) lh7Var.getValue()).c, fillElement2, os4.z(fillElement2, 0.0f, 12.0f, 1), jm4.U(1912122274, new oq2(gn2Var, lh7Var, (byte) 2), lp2Var2), lp2Var2, 3504);
                }
                break;
            default:
                kr7 kr7Var = (kr7) xw8Var;
                tn2 tn2Var2 = tn2Var;
                rn2 rn2Var2 = rn2Var;
                dn2 dn2Var4 = (dn2) obj2;
                lp2 lp2Var3 = (lp2) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((uw0) obj).getClass();
                dn2Var4.getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= lp2Var3.h(dn2Var4) ? 32 : 16;
                }
                int i = iIntValue3;
                if (!lp2Var3.N(i & 1, (i & 145) != 144)) {
                    lp2Var3.Q();
                } else {
                    f76 f76Var3 = kr7Var.i;
                    f76Var3.getClass();
                    tn2Var2.getClass();
                    rn2Var2.getClass();
                    Object objJ = lp2Var3.j(yc4.a);
                    BaseActivity baseActivity = objJ instanceof BaseActivity ? (BaseActivity) objJ : null;
                    Context context = (Context) lp2Var3.j(pc.b);
                    ky2 ky2Var = (ky2) lp2Var3.j(ly2.a);
                    Object[] objArr = {f76Var3, baseActivity, context, ky2Var};
                    boolean zH3 = lp2Var3.h(f76Var3) | ((((i & 112) ^ 48) > 32 && lp2Var3.f(dn2Var4)) || (i & 48) == 32) | lp2Var3.f(tn2Var2) | lp2Var3.f(ky2Var) | lp2Var3.h(context) | lp2Var3.f(rn2Var2);
                    Object objK7 = lp2Var3.K();
                    if (zH3 || objK7 == obj5) {
                        objK7 = new qi(f76Var3, dn2Var4, tn2Var2, ky2Var, context, rn2Var2, (q51) null);
                        lp2Var3.g0(objK7);
                    }
                    u70.k(objArr, (rn2) objK7, lp2Var3);
                    FillElement fillElement3 = b.a;
                    kx4 kx4VarZ = os4.z(fillElement3, 16.0f, 0.0f, 2);
                    kx4 kx4VarV = dh3.V(fillElement3, dh3.G(lp2Var3));
                    tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var3, 0);
                    int iHashCode3 = Long.hashCode(lp2Var3.T);
                    kl5 kl5VarL3 = lp2Var3.l();
                    kx4 kx4VarQ3 = w45.Q(lp2Var3, kx4VarV);
                    uz0.j.getClass();
                    lp2Var3.Z();
                    if (lp2Var3.S) {
                        lp2Var3.k();
                    } else {
                        lp2Var3.j0();
                    }
                    dx0 dx0Var = pz2.B0;
                    pn7.m(dx0Var, lp2Var3, tw0VarA);
                    dx0 dx0Var2 = pz2.A0;
                    pn7.m(dx0Var2, lp2Var3, kl5VarL3);
                    Integer numValueOf = Integer.valueOf(iHashCode3);
                    dx0 dx0Var3 = pz2.C0;
                    pn7.m(dx0Var3, lp2Var3, numValueOf);
                    pn7.l(lp2Var3);
                    dx0 dx0Var4 = pz2.z0;
                    pn7.m(dx0Var4, lp2Var3, kx4VarQ3);
                    wq6 wq6VarA3 = vq6.a(new ft(16.0f, new bt()), pz2.o0, lp2Var3, 54);
                    int iHashCode4 = Long.hashCode(lp2Var3.T);
                    kl5 kl5VarL4 = lp2Var3.l();
                    kx4 kx4VarQ4 = w45.Q(lp2Var3, kx4VarZ);
                    lp2Var3.Z();
                    if (lp2Var3.S) {
                        lp2Var3.k();
                    } else {
                        lp2Var3.j0();
                    }
                    pn7.m(dx0Var, lp2Var3, wq6VarA3);
                    pn7.m(dx0Var2, lp2Var3, kl5VarL4);
                    oi0.u(iHashCode4, lp2Var3, dx0Var3, lp2Var3);
                    pn7.m(dx0Var4, lp2Var3, kx4VarQ4);
                    d44 d44Var = new d44(1.0f, true);
                    String strJ4 = vj8.j0(((sq7) lh7Var.getValue()).X == null ? y46.dialog_subscription_add_title : y46.dialog_subscription_edit_title, lp2Var3);
                    ox1 ox1Var3 = es.a;
                    zc1.g(strJ4, d44Var, o88.a(((ds) lp2Var3.j(ox1Var3)).a.c, ((dp) lp2Var3.j(ep.z)).c.a, 0L, (dj2) null, (gi2) null, 0L, 0L, (aa4) null, 16777214), 0, 0, 1, 0, false, (gn2) null, lp2Var3, 196608, 472);
                    lp2Var3.p(true);
                    ch3.f(lp2Var3, b.b(hx4Var, 20.0f));
                    oc.b(vj8.j0(y46.dialog_subscription_edit_options, lp2Var3), kx4VarZ, lp2Var3, 48);
                    ch3.f(lp2Var3, b.b(hx4Var, 4.0f));
                    gn2 gn2Var3 = gn2Var;
                    rq7.d((sq7) lh7Var.getValue(), gn2Var3, fillElement3, lp2Var3, 384);
                    z39.c(fillElement3, lp2Var3, 6, 0);
                    ch3.f(lp2Var3, b.b(hx4Var, 16.0f));
                    oc.b(vj8.j0(y46.dialog_subscription_edit_title_and_url, lp2Var3), kx4VarZ, lp2Var3, 48);
                    ch3.f(lp2Var3, b.b(hx4Var, 4.0f));
                    rq7.c((sq7) lh7Var.getValue(), gn2Var3, fillElement3, lp2Var3, 384);
                    ch3.f(lp2Var3, b.b(hx4Var, 24.0f));
                    kx4 kx4VarZ2 = os4.z(fillElement3, 16.0f, 0.0f, 2);
                    xr4 xr4VarC = g80.c(pz2.Z, false);
                    int iHashCode5 = Long.hashCode(lp2Var3.T);
                    kl5 kl5VarL5 = lp2Var3.l();
                    kx4 kx4VarQ5 = w45.Q(lp2Var3, kx4VarZ2);
                    lp2Var3.Z();
                    if (lp2Var3.S) {
                        lp2Var3.k();
                    } else {
                        lp2Var3.j0();
                    }
                    pn7.m(dx0Var, lp2Var3, xr4VarC);
                    pn7.m(dx0Var2, lp2Var3, kl5VarL5);
                    oi0.u(iHashCode5, lp2Var3, dx0Var3, lp2Var3);
                    pn7.m(dx0Var4, lp2Var3, kx4VarQ5);
                    String strJ5 = vj8.j0(y46.dialog_subscription_edit_button_positive, lp2Var3);
                    boolean z = ((sq7) lh7Var.getValue()).p0;
                    boolean z2 = ((sq7) lh7Var.getValue()).n0;
                    o88 o88VarA5 = o88.a(((ds) lp2Var3.j(ox1Var3)).a.d, 0L, 0L, dj2.f0, (gi2) null, 0L, 0L, (aa4) null, 16777211);
                    ig5 ig5Var = new ig5(12.0f, 12.0f, 12.0f, 12.0f);
                    boolean zF5 = lp2Var3.f(gn2Var);
                    Object objK8 = lp2Var3.K();
                    if (zF5 || objK8 == obj5) {
                        objK8 = new aa3(gn2Var, (byte) 14);
                        lp2Var3.g0(objK8);
                    }
                    km4.e(strJ5, fillElement3, z, z2, o88VarA5, 0, 0, 0, 0, false, ig5Var, (x67) null, (dw0) null, (dw0) null, (dw0) null, (dw0) null, (dn2) objK8, lp2Var3, 48, 523232);
                    lp2Var3.p(true);
                    ch3.f(lp2Var3, b.b(hx4Var, 30.0f));
                    lp2Var3.p(true);
                }
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ lv5(sq6 sq6Var, gn2 gn2Var, pv3 pv3Var, dn2 dn2Var, y05 y05Var) {
        this.g0 = sq6Var;
        this.h0 = gn2Var;
        this.Y = pv3Var;
        this.Z = dn2Var;
        this.f0 = y05Var;
    }

    public /* synthetic */ lv5(kr7 kr7Var, tn2 tn2Var, rn2 rn2Var, pv3 pv3Var, y05 y05Var) {
        this.g0 = kr7Var;
        this.Z = tn2Var;
        this.h0 = rn2Var;
        this.Y = pv3Var;
        this.f0 = y05Var;
    }
}
