package defpackage;

import android.view.View;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import su.happ.proxyutility.domain.routing.entity.RouteSettingsCache;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.SubscriptionSortType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class gq6 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ gq6(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:56:0x019b  */
    public final Object B(Object obj) throws Exception {
        is7 is7VarA;
        c88 c88VarA;
        c88 c88VarA2;
        c88 c88VarA3;
        x78 x78Var;
        lf lfVarJ;
        a88 a88VarC = null;
        switch (this.X) {
            case 0:
                mr2 mr2Var = mr2.GEOIP;
                mr2 mr2Var2 = mr2.GEOSITE;
                iq6 iq6Var = (iq6) this.Y;
                Map map = (Map) this.Z;
                RouteSettingsCache routeSettingsCache = (RouteSettingsCache) obj;
                routeSettingsCache.getClass();
                int i = hq6.a[((fq6) iq6Var.d.X.getValue()).Z.ordinal()];
                if (i == 1) {
                    List list = (List) map.get(mr2Var2);
                    if (list != null) {
                        routeSettingsCache.getRouteSettings().S(list);
                    }
                    List list2 = (List) map.get(mr2Var);
                    if (list2 != null) {
                        routeSettingsCache.getRouteSettings().R(list2);
                    }
                } else if (i == 2) {
                    List list3 = (List) map.get(mr2Var2);
                    if (list3 != null) {
                        routeSettingsCache.getRouteSettings().F(list3);
                    }
                    List list4 = (List) map.get(mr2Var);
                    if (list4 != null) {
                        routeSettingsCache.getRouteSettings().E(list4);
                    }
                } else {
                    if (i != 3) {
                        b61.c();
                        return null;
                    }
                    List list5 = (List) map.get(mr2Var2);
                    if (list5 != null) {
                        routeSettingsCache.getRouteSettings().D(list5);
                    }
                    List list6 = (List) map.get(mr2Var);
                    if (list6 != null) {
                        routeSettingsCache.getRouteSettings().C(list6);
                    }
                }
                return routeSettingsCache;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin /* 1 */:
                ((e15) this.Y).a.setValue(new q42((v09) this.Z, (v09) obj));
                return dn8.a;
            case XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin /* 2 */:
                ry6 ry6Var = (ry6) this.Y;
                sy6 sy6Var = (sy6) this.Z;
                fu1 fu1Var = (fu1) obj;
                float f = fu1Var.b ? -1.0f : 1.0f;
                long j = fu1Var.a;
                ry6Var.a(1, z85.g(f, sy6Var.d == sd5.Y ? z85.a(0.0f, 1, j) : z85.a(0.0f, 2, j)));
                return dn8.a;
            case 3:
                do5.k((do5) obj, (eo5) this.Y, 0, 0, ((r97) this.Z).K0, 4);
                return dn8.a;
            case 4:
                List list7 = (List) this.Y;
                kh7 kh7Var = (kh7) this.Z;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    Iterator it = list7.iterator();
                    while (it.hasNext()) {
                        ((ux0) it.next()).l0(th);
                    }
                } else {
                    Iterator it2 = list7.iterator();
                    while (it2.hasNext()) {
                        ((ux0) it2.next()).V(dn8.a);
                    }
                }
                synchronized (kh7Var.d) {
                    kh7Var.f.removeAll(list7);
                }
                return dn8.a;
            case 5:
                MetaParams metaParams = (MetaParams) this.Y;
                String str = (String) this.Z;
                qs7 qs7Var = (qs7) obj;
                qs7Var.getClass();
                Integer numT0 = metaParams.getProfileUpdateInterval();
                if (numT0 == null) {
                    is7VarA = is7.a(qs7Var.a, false, false, 0, 0, false, 29);
                } else if (numT0.intValue() == 0) {
                    ev7.a(str);
                    is7VarA = is7.a(qs7Var.a, false, false, 0, 0, false, 28);
                } else {
                    qs7.Companion.getClass();
                    kf3 kf3Var = qs7.l;
                    int i2 = ((if3) kf3Var).X;
                    int i3 = ((if3) kf3Var).Y;
                    int iIntValue = numT0.intValue();
                    if (i2 > iIntValue || iIntValue > i3) {
                        is7VarA = is7.a(qs7Var.a, false, false, 0, 0, false, 29);
                    } else {
                        vz7 vz7Var = ev7.a;
                        ev7.b(numT0.intValue(), str);
                        is7VarA = is7.a(qs7Var.a, true, true, numT0.intValue(), 0, false, 24);
                    }
                }
                return qs7.a(qs7Var, is7VarA, false, false, (fs7) null, false, false, (ms7) null, 0, (ps7) null, (SubscriptionSortType) null, 1022);
            case 6:
                Boolean bool = (Boolean) this.Y;
                SubscriptionItem subscriptionItem = (SubscriptionItem) this.Z;
                PrintWriter printWriter = (PrintWriter) obj;
                printWriter.println(p61.q(printWriter) + " Prepare to handle reset: " + bool + ", " + (subscriptionItem != null ? Boolean.valueOf(subscriptionItem.getResetHandled()) : null));
                return dn8.a;
            case 7:
                HashMap map2 = (HashMap) this.Y;
                aj0 aj0Var = (aj0) this.Z;
                hq8 hq8Var = (hq8) obj;
                hq8Var.getClass();
                Object obj2 = map2.get(hq8Var);
                if (obj2 == null) {
                    bt.q("Required value was null.");
                    return null;
                }
                pl0 pl0Var = (pl0) obj2;
                er8 er8VarP = hq8Var.p(aj0Var, pl0Var.a, pl0Var.b);
                er8VarP.getClass();
                return er8VarP;
            case 8:
                qn7 qn7Var = (qn7) this.Y;
                gn2 gn2Var = (gn2) this.Z;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                b83 b83Var = qn7Var.f;
                boolean z = dh3.f(b83Var != null ? Boolean.valueOf(b83Var.isEmpty() ^ true) : null, Boolean.TRUE) && !zBooleanValue;
                gn2Var.B(new wo7(false));
                return Boolean.valueOf(z);
            case 9:
                String str2 = (String) this.Y;
                aa6 aa6Var = (aa6) this.Z;
                PrintWriter printWriter2 = (PrintWriter) obj;
                printWriter2.println(p61.q(printWriter2) + " Front [" + str2 + "] " + (aa6Var.X ? "update" : "set") + " to NEW_VALUE");
                return dn8.a;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMin /* 10 */:
                l08 l08Var = (l08) this.Y;
                j08 j08Var = (j08) this.Z;
                qr6 qr6Var = (qr6) obj;
                qr6Var.getClass();
                l08Var.b.H(qr6Var, j08Var);
                return dn8.a;
            case 11:
                jc0 jc0Var = (jc0) obj;
                return jc0Var.a(new y0(new gq6(((x67) this.Y).a(jc0Var.X.e(), jc0Var.X.getLayoutDirection(), jc0Var), (a58) this.Z, (byte) 12), (byte) 14));
            case 12:
                x97.u((sv1) obj, (mb6) this.Y, ((a58) this.Z).a());
                return dn8.a;
            case 13:
                lh7 lh7Var = (lh7) this.Y;
                y05 y05Var = (y05) this.Z;
                ua7 ua7Var = (ua7) obj;
                float fFloatValue = ((Number) lh7Var.getValue()).floatValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (ua7Var.a >> 32)) * fFloatValue;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (ua7Var.a & 4294967295L)) * fFloatValue;
                if (Float.intBitsToFloat((int) (((ua7) y05Var.getValue()).a >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((ua7) y05Var.getValue()).a & 4294967295L)) != fIntBitsToFloat2) {
                    y05Var.setValue(new ua7((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)))));
                }
                return dn8.a;
            case 14:
                pl plVar = (pl) this.Y;
                oh5 oh5Var = ((qa4) this.Z).b;
                w28 w28Var = (w28) obj;
                pa4 pa4Var = (pa4) plVar.a;
                c88 c88VarA4 = pa4Var.a();
                qe7 qe7Var = c88VarA4 != null ? c88VarA4.a : null;
                qe7 qe7VarC = ((oh5Var.l() & 1) == 0 || (c88VarA3 = pa4Var.a()) == null) ? null : c88VarA3.b;
                if (qe7Var != null) {
                    qe7VarC = qe7Var.c(qe7VarC);
                }
                qe7 qe7VarC2 = ((oh5Var.l() & 2) == 0 || (c88VarA2 = pa4Var.a()) == null) ? null : c88VarA2.c;
                if (qe7VarC != null) {
                    qe7VarC2 = qe7VarC.c(qe7VarC2);
                }
                if ((oh5Var.l() & 4) != 0 && (c88VarA = pa4Var.a()) != null) {
                    a88VarC = c88VarA.d;
                }
                if (qe7VarC2 != null) {
                    a88VarC = qe7VarC2.c(a88VarC);
                }
                w28Var.b = w28Var.a.b(new v28(new aa6(), plVar, a88VarC, (byte) 0));
                return dn8.a;
            case 15:
                b88 b88Var = (b88) this.Y;
                pl plVar2 = (pl) this.Z;
                pk6 pk6Var = (pk6) obj;
                ql qlVar = b88Var.b;
                rh5 rh5Var = b88Var.a;
                x78 x78Var2 = (x78) rh5Var.getValue();
                if (dh3.f(qlVar, x78Var2 != null ? x78Var2.a.a : null) && (x78Var = (x78) rh5Var.getValue()) != null) {
                    bz4 bz4Var = x78Var.b;
                    pl plVarC = b88.c(plVar2, x78Var);
                    if (plVarC == null) {
                        lfVarJ = null;
                    } else {
                        int i4 = plVarC.c;
                        int i5 = plVarC.b;
                        lfVarJ = x78Var.j(i5, i4);
                        s86 s86VarB = x78Var.b(i5);
                        int i6 = i4 - 1;
                        lfVarJ.h(((((long) Float.floatToRawIntBits(bz4Var.c(i5) == bz4Var.c(i6) ? Math.min(x78Var.b(i6).a, s86VarB.a) : 0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(s86VarB.b)))) ^ (-9223372034707292160L));
                    }
                } else {
                    lfVarJ = null;
                }
                a88VarC = lfVarJ != null ? new a88(lfVarJ) : null;
                if (a88VarC != null) {
                    pk6Var.k(a88VarC);
                    pk6Var.d(true);
                }
                return dn8.a;
            case 16:
                ((rs4) this.Y).j(((uh3) this.Z).B(obj));
                return dn8.a;
            case 17:
                w51.G((b71) this.Y, (s61) null, e71.f0, new rh7((ce8) this.Z, (q51) null), 1);
                return new zf((byte) 1);
            case 18:
                ce8 ce8Var = (ce8) this.Y;
                ce8 ce8Var2 = (ce8) this.Z;
                ce8Var.k.add(ce8Var2);
                return new p00(ce8Var, ce8Var2, (byte) 5);
            case 19:
                return new p00((ce8) this.Y, (sd8) this.Z, (byte) 6);
            case 20:
                ce8 ce8Var3 = (ce8) this.Y;
                yd8 yd8Var = (yd8) this.Z;
                ce8Var3.j.add(yd8Var);
                return new p00(ce8Var3, yd8Var, (byte) 7);
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                qo8 qo8Var = (qo8) this.Y;
                gn2 gn2Var2 = (gn2) this.Z;
                ((Long) obj).getClass();
                float f2 = qo8Var.e;
                qo8Var.e = 0.0f;
                gn2Var2.B(Float.valueOf(f2));
                return dn8.a;
            case 22:
                lr8 lr8Var = (lr8) this.Y;
                rm3 rm3Var = (rm3) this.Z;
                synchronized (lr8Var.k) {
                    lr8Var.w.remove(rm3Var);
                }
                return dn8.a;
            case 23:
                c29 c29Var = (c29) this.Y;
                View view = (View) this.Z;
                c29Var.a(view);
                return new p00(c29Var, view, (byte) 8);
            case 24:
                b49 b49Var = (b49) this.Y;
                a49 a49Var = (a49) this.Z;
                qr6 qr6Var2 = (qr6) obj;
                qr6Var2.getClass();
                b49Var.b.H(qr6Var2, a49Var);
                return dn8.a;
            case 25:
                d49 d49Var = (d49) this.Y;
                c49 c49Var = (c49) this.Z;
                qr6 qr6Var3 = (qr6) obj;
                qr6Var3.getClass();
                d49Var.b.H(qr6Var3, c49Var);
                return dn8.a;
            case 26:
                u39 u39Var = (u39) this.Y;
                String str3 = (String) this.Z;
                qr6 qr6Var4 = (qr6) obj;
                qr6Var4.getClass();
                xr6 xr6VarX0 = qr6Var4.X0("UPDATE workspec SET state=? WHERE id=?");
                try {
                    xr6VarX0.i(1, a28.u(u39Var));
                    xr6VarX0.T(2, str3);
                    xr6VarX0.S0();
                    return Integer.valueOf(os4.r(qr6Var4));
                } finally {
                    xr6VarX0.close();
                }
            case 27:
                u91 u91Var = (u91) this.Y;
                String str4 = (String) this.Z;
                qr6 qr6Var5 = (qr6) obj;
                qr6Var5.getClass();
                xr6 xr6VarX1 = qr6Var5.X0("UPDATE workspec SET output=? WHERE id=?");
                try {
                    u91 u91Var2 = u91.b;
                    xr6VarX1.j(1, wl7.c0(u91Var));
                    xr6VarX1.T(2, str4);
                    xr6VarX1.S0();
                    return dn8.a;
                } finally {
                    xr6VarX1.close();
                }
            case 28:
                n49 n49Var = (n49) this.Y;
                l49 l49Var = (l49) this.Z;
                qr6 qr6Var6 = (qr6) obj;
                qr6Var6.getClass();
                n49Var.b.H(qr6Var6, l49Var);
                return dn8.a;
            default:
                p49 p49Var = (p49) this.Y;
                o49 o49Var = (o49) this.Z;
                qr6 qr6Var7 = (qr6) obj;
                qr6Var7.getClass();
                p49Var.b.H(qr6Var7, o49Var);
                return dn8.a;
        }
    }

    public /* synthetic */ gq6(Object obj, Object obj2, Object obj3, byte b) {
        this.X = b;
        this.Y = obj2;
        this.Z = obj3;
    }
}
