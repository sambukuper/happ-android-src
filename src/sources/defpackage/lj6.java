package defpackage;

import java.util.List;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.SubscriptionUserInfo;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.dto.enums.EIpType;
import su.happ.proxyutility.dto.enums.EPingType;
import su.happ.proxyutility.dto.enums.FragmentationDelay;
import su.happ.proxyutility.dto.enums.FragmentationLength;
import su.happ.proxyutility.dto.enums.FragmentationPackets;
import su.happ.proxyutility.dto.enums.FragmentationType;
import su.happ.proxyutility.dto.enums.GeoUserAgent;
import su.happ.proxyutility.dto.enums.GoPingType;
import su.happ.proxyutility.dto.enums.InboundAuthMode;
import su.happ.proxyutility.dto.enums.MuxQuicType;
import su.happ.proxyutility.dto.enums.NoisesPacketType;
import su.happ.proxyutility.dto.enums.SubInfoColor;
import su.happ.proxyutility.dto.enums.SubscriptionAutoConnectType;
import su.happ.proxyutility.dto.enums.SubscriptionSortType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lj6 {
    /* JADX WARN: Multi-variable type inference failed */
    public static MetaParams a(MetaParams metaParams, MetaParams metaParams2) {
        MetaParams metaParams3 = new MetaParams(0 == true ? 1 : 0, -1);
        kg6 kg6Var = kg6.X;
        Object obj = kg6Var.get(metaParams2);
        if (obj == null) {
            obj = kg6Var.get(metaParams);
        }
        metaParams3.i2((String) obj);
        vg6 vg6Var = vg6.X;
        Object obj2 = vg6Var.get(metaParams2);
        if (obj2 == null) {
            obj2 = vg6Var.get(metaParams);
        }
        metaParams3.j2((Integer) obj2);
        gh6 gh6Var = gh6.X;
        Object obj3 = gh6Var.get(metaParams2);
        if (obj3 == null) {
            obj3 = gh6Var.get(metaParams);
        }
        metaParams3.P2((SubscriptionUserInfo) obj3);
        rh6 rh6Var = rh6.X;
        Object obj4 = rh6Var.get(metaParams2);
        if (obj4 == null) {
            obj4 = rh6Var.get(metaParams);
        }
        metaParams3.k2((String) obj4);
        ci6 ci6Var = ci6.X;
        Object obj5 = ci6Var.get(metaParams2);
        if (obj5 == null) {
            obj5 = ci6Var.get(metaParams);
        }
        XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean tcpMaskSettingBean = (XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean) obj5;
        metaParams3.v1(tcpMaskSettingBean != null ? tcpMaskSettingBean.getValue() : null);
        ni6 ni6Var = ni6.X;
        Object obj6 = ni6Var.get(metaParams2);
        if (obj6 == null) {
            obj6 = ni6Var.get(metaParams);
        }
        metaParams3.q2((String) obj6);
        yi6 yi6Var = yi6.X;
        Object obj7 = yi6Var.get(metaParams2);
        if (obj7 == null) {
            obj7 = yi6Var.get(metaParams);
        }
        metaParams3.F1((String) obj7);
        jj6 jj6Var = jj6.X;
        Object obj8 = jj6Var.get(metaParams2);
        if (obj8 == null) {
            obj8 = jj6Var.get(metaParams);
        }
        metaParams3.K1((Boolean) obj8);
        kj6 kj6Var = kj6.X;
        Object obj9 = kj6Var.get(metaParams2);
        if (obj9 == null) {
            obj9 = kj6Var.get(metaParams);
        }
        metaParams3.l1((String) obj9);
        ag6 ag6Var = ag6.X;
        Object obj10 = ag6Var.get(metaParams2);
        if (obj10 == null) {
            obj10 = ag6Var.get(metaParams);
        }
        metaParams3.T2((String) obj10);
        bg6 bg6Var = bg6.X;
        Object obj11 = bg6Var.get(metaParams2);
        if (obj11 == null) {
            obj11 = bg6Var.get(metaParams);
        }
        metaParams3.u2((String) obj11);
        cg6 cg6Var = cg6.X;
        Object obj12 = cg6Var.get(metaParams2);
        if (obj12 == null) {
            obj12 = cg6Var.get(metaParams);
        }
        metaParams3.T1((String) obj12);
        dg6 dg6Var = dg6.X;
        Object obj13 = dg6Var.get(metaParams2);
        if (obj13 == null) {
            obj13 = dg6Var.get(metaParams);
        }
        metaParams3.S1((String) obj13);
        eg6 eg6Var = eg6.X;
        Object obj14 = eg6Var.get(metaParams2);
        if (obj14 == null) {
            obj14 = eg6Var.get(metaParams);
        }
        metaParams3.l2((String) obj14);
        fg6 fg6Var = fg6.X;
        Object obj15 = fg6Var.get(metaParams2);
        if (obj15 == null) {
            obj15 = fg6Var.get(metaParams);
        }
        metaParams3.L1((String) obj15);
        gg6 gg6Var = gg6.X;
        Object obj16 = gg6Var.get(metaParams2);
        if (obj16 == null) {
            obj16 = gg6Var.get(metaParams);
        }
        metaParams3.H2((Boolean) obj16);
        hg6 hg6Var = hg6.X;
        Object obj17 = hg6Var.get(metaParams2);
        if (obj17 == null) {
            obj17 = hg6Var.get(metaParams);
        }
        metaParams3.M2((Boolean) obj17);
        ig6 ig6Var = ig6.X;
        Object obj18 = ig6Var.get(metaParams2);
        if (obj18 == null) {
            obj18 = ig6Var.get(metaParams);
        }
        metaParams3.I2((SubscriptionAutoConnectType) obj18);
        jg6 jg6Var = jg6.X;
        Object obj19 = jg6Var.get(metaParams2);
        if (obj19 == null) {
            obj19 = jg6Var.get(metaParams);
        }
        metaParams3.v2((Boolean) obj19);
        lg6 lg6Var = lg6.X;
        Object obj20 = lg6Var.get(metaParams2);
        if (obj20 == null) {
            obj20 = lg6Var.get(metaParams);
        }
        metaParams3.y1((Boolean) obj20);
        mg6 mg6Var = mg6.X;
        Object obj21 = mg6Var.get(metaParams2);
        if (obj21 == null) {
            obj21 = mg6Var.get(metaParams);
        }
        metaParams3.C1((FragmentationPackets) obj21);
        ng6 ng6Var = ng6.X;
        Object obj22 = ng6Var.get(metaParams2);
        if (obj22 == null) {
            obj22 = ng6Var.get(metaParams);
        }
        FragmentationLength fragmentationLength = (FragmentationLength) obj22;
        metaParams3.A1(fragmentationLength != null ? fragmentationLength.getValue() : null);
        og6 og6Var = og6.X;
        Object obj23 = og6Var.get(metaParams2);
        if (obj23 == null) {
            obj23 = og6Var.get(metaParams);
        }
        FragmentationDelay fragmentationDelay = (FragmentationDelay) obj23;
        metaParams3.x1(fragmentationDelay != null ? fragmentationDelay.getValue() : null);
        pg6 pg6Var = pg6.X;
        Object obj24 = pg6Var.get(metaParams2);
        if (obj24 == null) {
            obj24 = pg6Var.get(metaParams);
        }
        FragmentationDelay fragmentationDelay2 = (FragmentationDelay) obj24;
        metaParams3.z1(fragmentationDelay2 != null ? fragmentationDelay2.getValue() : null);
        qg6 qg6Var = qg6.X;
        Object obj25 = qg6Var.get(metaParams2);
        if (obj25 == null) {
            obj25 = qg6Var.get(metaParams);
        }
        metaParams3.D1((FragmentationType) obj25);
        rg6 rg6Var = rg6.X;
        Object obj26 = rg6Var.get(metaParams2);
        if (obj26 == null) {
            obj26 = rg6Var.get(metaParams);
        }
        metaParams3.w1((String) obj26);
        sg6 sg6Var = sg6.X;
        Object obj27 = sg6Var.get(metaParams2);
        if (obj27 == null) {
            obj27 = sg6Var.get(metaParams);
        }
        metaParams3.B1((String) obj27);
        tg6 tg6Var = tg6.X;
        Object obj28 = tg6Var.get(metaParams2);
        if (obj28 == null) {
            obj28 = tg6Var.get(metaParams);
        }
        metaParams3.V1((Boolean) obj28);
        ug6 ug6Var = ug6.X;
        Object obj29 = ug6Var.get(metaParams2);
        if (obj29 == null) {
            obj29 = ug6Var.get(metaParams);
        }
        metaParams3.X1((NoisesPacketType) obj29);
        wg6 wg6Var = wg6.X;
        Object obj30 = wg6Var.get(metaParams2);
        if (obj30 == null) {
            obj30 = wg6Var.get(metaParams);
        }
        metaParams3.W1((String) obj30);
        xg6 xg6Var = xg6.X;
        Object obj31 = xg6Var.get(metaParams2);
        if (obj31 == null) {
            obj31 = xg6Var.get(metaParams);
        }
        metaParams3.U1((String) obj31);
        yg6 yg6Var = yg6.X;
        Object obj32 = yg6Var.get(metaParams2);
        if (obj32 == null) {
            obj32 = yg6Var.get(metaParams);
        }
        metaParams3.Y1((String) obj32);
        zg6 zg6Var = zg6.X;
        Object obj33 = zg6Var.get(metaParams2);
        if (obj33 == null) {
            obj33 = zg6Var.get(metaParams);
        }
        metaParams3.Z1((String) obj33);
        ah6 ah6Var = ah6.X;
        Object obj34 = ah6Var.get(metaParams2);
        if (obj34 == null) {
            obj34 = ah6Var.get(metaParams);
        }
        metaParams3.M1((Boolean) obj34);
        bh6 bh6Var = bh6.X;
        Object obj35 = bh6Var.get(metaParams2);
        if (obj35 == null) {
            obj35 = bh6Var.get(metaParams);
        }
        metaParams3.J2((Boolean) obj35);
        ch6 ch6Var = ch6.X;
        Object obj36 = ch6Var.get(metaParams2);
        if (obj36 == null) {
            obj36 = ch6Var.get(metaParams);
        }
        metaParams3.O2((Boolean) obj36);
        dh6 dh6Var = dh6.X;
        Object obj37 = dh6Var.get(metaParams2);
        if (obj37 == null) {
            obj37 = dh6Var.get(metaParams);
        }
        metaParams3.G2((Boolean) obj37);
        eh6 eh6Var = eh6.X;
        Object obj38 = eh6Var.get(metaParams2);
        if (obj38 == null) {
            obj38 = eh6Var.get(metaParams);
        }
        metaParams3.K2((Boolean) obj38);
        fh6 fh6Var = fh6.X;
        Object obj39 = fh6Var.get(metaParams2);
        if (obj39 == null) {
            obj39 = fh6Var.get(metaParams);
        }
        metaParams3.a2((Boolean) obj39);
        hh6 hh6Var = hh6.X;
        Object obj40 = hh6Var.get(metaParams2);
        if (obj40 == null) {
            obj40 = hh6Var.get(metaParams);
        }
        metaParams3.g2((EPingType) obj40);
        ih6 ih6Var = ih6.X;
        Object obj41 = ih6Var.get(metaParams2);
        if (obj41 == null) {
            obj41 = ih6Var.get(metaParams);
        }
        metaParams3.E1((Boolean) obj41);
        jh6 jh6Var = jh6.X;
        Object obj42 = jh6Var.get(metaParams2);
        if (obj42 == null) {
            obj42 = jh6Var.get(metaParams);
        }
        metaParams3.o1((String) obj42);
        kh6 kh6Var = kh6.X;
        Object obj43 = kh6Var.get(metaParams2);
        if (obj43 == null) {
            obj43 = kh6Var.get(metaParams);
        }
        metaParams3.p1((String) obj43);
        lh6 lh6Var = lh6.X;
        Object obj44 = lh6Var.get(metaParams2);
        if (obj44 == null) {
            obj44 = lh6Var.get(metaParams);
        }
        metaParams3.m1((Boolean) obj44);
        mh6 mh6Var = mh6.X;
        Object obj45 = mh6Var.get(metaParams2);
        if (obj45 == null) {
            obj45 = mh6Var.get(metaParams);
        }
        metaParams3.t2((Boolean) obj45);
        nh6 nh6Var = nh6.X;
        Object obj46 = nh6Var.get(metaParams2);
        if (obj46 == null) {
            obj46 = nh6Var.get(metaParams);
        }
        metaParams3.s2((String) obj46);
        oh6 oh6Var = oh6.X;
        Object obj47 = oh6Var.get(metaParams2);
        if (obj47 == null) {
            obj47 = oh6Var.get(metaParams);
        }
        metaParams3.r2((String) obj47);
        ph6 ph6Var = ph6.X;
        Object obj48 = ph6Var.get(metaParams2);
        if (obj48 == null) {
            obj48 = ph6Var.get(metaParams);
        }
        metaParams3.e2((jk5) obj48);
        qh6 qh6Var = qh6.X;
        Object obj49 = qh6Var.get(metaParams2);
        if (obj49 == null) {
            obj49 = qh6Var.get(metaParams);
        }
        metaParams3.b2((List) obj49);
        sh6 sh6Var = sh6.X;
        Object obj50 = sh6Var.get(metaParams2);
        if (obj50 == null) {
            obj50 = sh6Var.get(metaParams);
        }
        metaParams3.d2((List) obj50);
        th6 th6Var = th6.X;
        Object obj51 = th6Var.get(metaParams2);
        if (obj51 == null) {
            obj51 = th6Var.get(metaParams);
        }
        metaParams3.c2((List) obj51);
        uh6 uh6Var = uh6.X;
        Object obj52 = uh6Var.get(metaParams2);
        if (obj52 == null) {
            obj52 = uh6Var.get(metaParams);
        }
        metaParams3.O1((Boolean) obj52);
        vh6 vh6Var = vh6.X;
        Object obj53 = vh6Var.get(metaParams2);
        if (obj53 == null) {
            obj53 = vh6Var.get(metaParams);
        }
        metaParams3.Q1((Integer) obj53);
        wh6 wh6Var = wh6.X;
        Object obj54 = wh6Var.get(metaParams2);
        if (obj54 == null) {
            obj54 = wh6Var.get(metaParams);
        }
        metaParams3.R1((Integer) obj54);
        xh6 xh6Var = xh6.X;
        Object obj55 = xh6Var.get(metaParams2);
        if (obj55 == null) {
            obj55 = xh6Var.get(metaParams);
        }
        metaParams3.P1((MuxQuicType) obj55);
        yh6 yh6Var = yh6.X;
        Object obj56 = yh6Var.get(metaParams2);
        if (obj56 == null) {
            obj56 = yh6Var.get(metaParams);
        }
        metaParams3.w2((Boolean) obj56);
        zh6 zh6Var = zh6.X;
        Object obj57 = zh6Var.get(metaParams2);
        if (obj57 == null) {
            obj57 = zh6Var.get(metaParams);
        }
        metaParams3.h2((EIpType) obj57);
        ai6 ai6Var = ai6.X;
        Object obj58 = ai6Var.get(metaParams2);
        if (obj58 == null) {
            obj58 = ai6Var.get(metaParams);
        }
        metaParams3.Q2((Boolean) obj58);
        bi6 bi6Var = bi6.X;
        Object obj59 = bi6Var.get(metaParams2);
        if (obj59 == null) {
            obj59 = bi6Var.get(metaParams);
        }
        metaParams3.f2((vn5) obj59);
        di6 di6Var = di6.X;
        Object obj60 = di6Var.get(metaParams2);
        if (obj60 == null) {
            obj60 = di6Var.get(metaParams);
        }
        metaParams3.s1((String) obj60);
        ei6 ei6Var = ei6.X;
        Object obj61 = ei6Var.get(metaParams2);
        if (obj61 == null) {
            obj61 = ei6Var.get(metaParams);
        }
        metaParams3.t1((String) obj61);
        fi6 fi6Var = fi6.X;
        Object obj62 = fi6Var.get(metaParams2);
        if (obj62 == null) {
            obj62 = fi6Var.get(metaParams);
        }
        metaParams3.E2((SubInfoColor) obj62);
        gi6 gi6Var = gi6.X;
        Object obj63 = gi6Var.get(metaParams2);
        if (obj63 == null) {
            obj63 = gi6Var.get(metaParams);
        }
        metaParams3.F2((String) obj63);
        hi6 hi6Var = hi6.X;
        Object obj64 = hi6Var.get(metaParams2);
        if (obj64 == null) {
            obj64 = hi6Var.get(metaParams);
        }
        metaParams3.D2((String) obj64);
        ii6 ii6Var = ii6.X;
        Object obj65 = ii6Var.get(metaParams2);
        if (obj65 == null) {
            obj65 = ii6Var.get(metaParams);
        }
        metaParams3.C2((String) obj65);
        ji6 ji6Var = ji6.X;
        Object obj66 = ji6Var.get(metaParams2);
        if (obj66 == null) {
            obj66 = ji6Var.get(metaParams);
        }
        metaParams3.A2((Boolean) obj66);
        ki6 ki6Var = ki6.X;
        Object obj67 = ki6Var.get(metaParams2);
        if (obj67 == null) {
            obj67 = ki6Var.get(metaParams);
        }
        metaParams3.B2((String) obj67);
        li6 li6Var = li6.X;
        Object obj68 = li6Var.get(metaParams2);
        if (obj68 == null) {
            obj68 = li6Var.get(metaParams);
        }
        metaParams3.R2((Boolean) obj68);
        mi6 mi6Var = mi6.X;
        Object obj69 = mi6Var.get(metaParams2);
        if (obj69 == null) {
            obj69 = mi6Var.get(metaParams);
        }
        metaParams3.L2((Boolean) obj69);
        oi6 oi6Var = oi6.X;
        Object obj70 = oi6Var.get(metaParams2);
        if (obj70 == null) {
            obj70 = oi6Var.get(metaParams);
        }
        metaParams3.r1((Boolean) obj70);
        pi6 pi6Var = pi6.X;
        Object obj71 = pi6Var.get(metaParams2);
        if (obj71 == null) {
            obj71 = pi6Var.get(metaParams);
        }
        metaParams3.N1((Boolean) obj71);
        qi6 qi6Var = qi6.X;
        Object obj72 = qi6Var.get(metaParams2);
        if (obj72 == null) {
            obj72 = qi6Var.get(metaParams);
        }
        metaParams3.S2((SubscriptionSortType) obj72);
        ri6 ri6Var = ri6.X;
        Object obj73 = ri6Var.get(metaParams2);
        if (obj73 == null) {
            obj73 = ri6Var.get(metaParams);
        }
        metaParams3.q1((Boolean) obj73);
        si6 si6Var = si6.X;
        Object obj74 = si6Var.get(metaParams2);
        if (obj74 == null) {
            obj74 = si6Var.get(metaParams);
        }
        metaParams3.x2((InboundAuthMode) obj74);
        ti6 ti6Var = ti6.X;
        Object obj75 = ti6Var.get(metaParams2);
        if (obj75 == null) {
            obj75 = ti6Var.get(metaParams);
        }
        metaParams3.z2((String) obj75);
        ui6 ui6Var = ui6.X;
        Object obj76 = ui6Var.get(metaParams2);
        if (obj76 == null) {
            obj76 = ui6Var.get(metaParams);
        }
        metaParams3.y2((String) obj76);
        vi6 vi6Var = vi6.X;
        Object obj77 = vi6Var.get(metaParams2);
        if (obj77 == null) {
            obj77 = vi6Var.get(metaParams);
        }
        metaParams3.J1((Boolean) obj77);
        wi6 wi6Var = wi6.X;
        Object obj78 = wi6Var.get(metaParams2);
        if (obj78 == null) {
            obj78 = wi6Var.get(metaParams);
        }
        metaParams3.G1((InboundAuthMode) obj78);
        xi6 xi6Var = xi6.X;
        Object obj79 = xi6Var.get(metaParams2);
        if (obj79 == null) {
            obj79 = xi6Var.get(metaParams);
        }
        metaParams3.I1((String) obj79);
        zi6 zi6Var = zi6.X;
        Object obj80 = zi6Var.get(metaParams2);
        if (obj80 == null) {
            obj80 = zi6Var.get(metaParams);
        }
        metaParams3.H1((String) obj80);
        aj6 aj6Var = aj6.X;
        Object obj81 = aj6Var.get(metaParams2);
        if (obj81 == null) {
            obj81 = aj6Var.get(metaParams);
        }
        metaParams3.V2((GeoUserAgent) obj81);
        bj6 bj6Var = bj6.X;
        Object obj82 = bj6Var.get(metaParams2);
        if (obj82 == null) {
            obj82 = bj6Var.get(metaParams);
        }
        metaParams3.N2((Integer) obj82);
        cj6 cj6Var = cj6.X;
        Object obj83 = cj6Var.get(metaParams2);
        if (obj83 == null) {
            obj83 = cj6Var.get(metaParams);
        }
        metaParams3.W2((Boolean) obj83);
        dj6 dj6Var = dj6.X;
        Object obj84 = dj6Var.get(metaParams2);
        if (obj84 == null) {
            obj84 = dj6Var.get(metaParams);
        }
        metaParams3.X2((Integer) obj84);
        ej6 ej6Var = ej6.X;
        Object obj85 = ej6Var.get(metaParams2);
        if (obj85 == null) {
            obj85 = ej6Var.get(metaParams);
        }
        metaParams3.n1((Boolean) obj85);
        fj6 fj6Var = fj6.X;
        Object obj86 = fj6Var.get(metaParams2);
        if (obj86 == null) {
            obj86 = fj6Var.get(metaParams);
        }
        metaParams3.m2((GoPingType) obj86);
        gj6 gj6Var = gj6.X;
        Object obj87 = gj6Var.get(metaParams2);
        if (obj87 == null) {
            obj87 = gj6Var.get(metaParams);
        }
        metaParams3.n2((Integer) obj87);
        hj6 hj6Var = hj6.X;
        Object obj88 = hj6Var.get(metaParams2);
        if (obj88 == null) {
            obj88 = hj6Var.get(metaParams);
        }
        metaParams3.U2((Boolean) obj88);
        ij6 ij6Var = ij6.X;
        Object obj89 = ij6Var.get(metaParams2);
        if (obj89 == null) {
            obj89 = ij6Var.get(metaParams);
        }
        metaParams3.u1((String) obj89);
        metaParams3.p2(metaParams2.k1(metaParams));
        return metaParams3;
    }
}
