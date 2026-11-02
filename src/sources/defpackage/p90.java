package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p90 implements sn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;

    public /* synthetic */ p90(Object obj, Object obj2, Object obj3, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        zy0 zy0Var;
        ow2 ow2Var;
        byte b = this.X;
        ec7 ec7Var = ec7.Y;
        hx4 hx4Var = hx4.X;
        be beVar = zz0.a;
        dn8 dn8Var = dn8.a;
        Object obj4 = this.f0;
        Object obj5 = this.Z;
        Object obj6 = this.Y;
        switch (b) {
            case 0:
                x90 x90Var = (x90) obj5;
                tz6 tz6Var = (tz6) obj4;
                if (obj6 != z90.l) {
                    jm4.s(x90Var.Y, obj6, tz6Var.X);
                }
                return dn8Var;
            case 1:
                ir2 ir2Var = (ir2) obj6;
                gn2 gn2Var = (gn2) obj5;
                kx4 kx4Var = (kx4) obj4;
                k44 k44Var = (k44) obj;
                lp2 lp2Var = (lp2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                k44Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= lp2Var.f(k44Var) ? 4 : 2;
                }
                if (lp2Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    gr2.c(ir2Var, gn2Var, dh3.p(k44Var, kx4Var), lp2Var, 0);
                } else {
                    lp2Var.Q();
                }
                return dn8Var;
            case 2:
                b83 b83Var = (b83) obj6;
                ow2 ow2Var2 = (ow2) obj5;
                tn2 tn2Var = (tn2) obj4;
                lp2 lp2Var2 = (lp2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((uw0) obj).getClass();
                if (lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Iterator it = b83Var.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            i21.X();
                            throw null;
                        }
                        mw2 mw2Var = (mw2) next;
                        float f = ot4.a;
                        ox1 ox1Var = ep.z;
                        long j = ((dp) lp2Var2.j(ox1Var)).c.a;
                        long j2 = ((dp) lp2Var2.j(ox1Var)).a;
                        long j3 = dw0.g;
                        iw0 iw0Var = (iw0) lp2Var2.j(kw0.a);
                        Iterator it2 = it;
                        qt4 qt4Var = iw0Var.Y;
                        if (qt4Var == null) {
                            qt4Var = new qt4(kw0.b(iw0Var, oc.j), kw0.b(iw0Var, oc.k), kw0.b(iw0Var, oc.m), dw0.b(oc.e, kw0.b(iw0Var, oc.d)), dw0.b(oc.g, kw0.b(iw0Var, oc.f)), dw0.b(oc.i, kw0.b(iw0Var, oc.h)));
                            iw0Var.Y = qt4Var;
                        }
                        long j4 = j != 16 ? j : qt4Var.a;
                        if (j2 == r6) {
                            j2 = qt4Var.b;
                        }
                        long j5 = j2;
                        long j6 = j3 != 16 ? j3 : qt4Var.c;
                        long j7 = j3 != 16 ? j3 : qt4Var.d;
                        long j8 = j3 != 16 ? j3 : qt4Var.e;
                        if (j3 == 16) {
                            j3 = qt4Var.f;
                        }
                        qt4 qt4Var2 = new qt4(j4, j5, j6, j7, j8, j3);
                        ig5 ig5Var = new ig5(16.0f, 16.0f, 16.0f, 16.0f);
                        g73 g73Var = mw2Var.b;
                        if (g73Var == null) {
                            lp2Var2.W(2031674576);
                            lp2Var2.p(false);
                            zy0Var = null;
                        } else {
                            lp2Var2.W(2031674577);
                            zy0 zy0VarU = jm4.U(-272996874, new i9(g73Var, mw2Var, (byte) 13), lp2Var2);
                            lp2Var2.p(false);
                            zy0Var = zy0VarU;
                        }
                        zy0 zy0VarU2 = jm4.U(-1926683192, new sl(tn2Var, i, mw2Var), lp2Var2);
                        boolean zF = lp2Var2.f(mw2Var) | lp2Var2.f(ow2Var2);
                        Object objK = lp2Var2.K();
                        if (zF || objK == beVar) {
                            objK = new p5(mw2Var, ow2Var2, (byte) 27);
                            lp2Var2.g0(objK);
                        }
                        ye.b(zy0VarU2, (dn2) objK, null, zy0Var, false, qt4Var2, ig5Var, lp2Var2, 12582918);
                        it = it2;
                        i = i2;
                    }
                } else {
                    lp2Var2.Q();
                }
                return dn8Var;
            case 3:
                sf4 sf4Var = (sf4) obj6;
                gn2 gn2Var2 = (gn2) obj5;
                kx4 kx4Var2 = (kx4) obj4;
                lp2 lp2Var3 = (lp2) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((uw0) obj).getClass();
                if (lp2Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    w79.a(b.a, null, jm4.U(1970924396, new rf4(sf4Var, gn2Var2, kx4Var2), lp2Var3), lp2Var3, 390);
                } else {
                    lp2Var3.Q();
                }
                return dn8Var;
            case 4:
                ow2 ow2Var3 = (ow2) obj6;
                lg4 lg4Var = (lg4) obj5;
                gn2 gn2Var3 = (gn2) obj4;
                lp2 lp2Var4 = (lp2) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((xq6) obj).getClass();
                if (lp2Var4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    xr4 xr4VarC = g80.c(pz2.Z, false);
                    int iHashCode = Long.hashCode(lp2Var4.T);
                    kl5 kl5VarL = lp2Var4.l();
                    kx4 kx4VarQ = w45.Q(lp2Var4, hx4Var);
                    uz0.j.getClass();
                    lp2Var4.Z();
                    if (lp2Var4.S) {
                        lp2Var4.k();
                    } else {
                        lp2Var4.j0();
                    }
                    pn7.m(pz2.B0, lp2Var4, xr4VarC);
                    pn7.m(pz2.A0, lp2Var4, kl5VarL);
                    pn7.m(pz2.C0, lp2Var4, Integer.valueOf(iHashCode));
                    pn7.l(lp2Var4);
                    pn7.m(pz2.z0, lp2Var4, kx4VarQ);
                    boolean zF2 = lp2Var4.f(ow2Var3);
                    Object objK2 = lp2Var4.K();
                    if (zF2 || objK2 == beVar) {
                        ow2Var = ow2Var3;
                        ub ubVar = new ub(0, ow2Var, ow2.class, "toggle", "toggle()V", 0, (byte) 18);
                        lp2Var4.g0(ubVar);
                        objK2 = ubVar;
                    } else {
                        ow2Var = ow2Var3;
                    }
                    w45.c((dn2) ((pv3) objK2), null, lg4Var != null, null, null, null, i21.g, lp2Var4, 1572864, 58);
                    lp2Var4.W(2080693737);
                    qm5 qm5VarC = ec7Var.c();
                    if (lg4Var == null || !lg4Var.j) {
                        lp2Var4.W(-483109175);
                        lp2Var4.p(false);
                    } else {
                        lp2Var4.W(-483545469);
                        String strJ0 = vj8.j0(y46.logcat_share, lp2Var4);
                        g73 g73VarP = u28.p(q36.icon_share_log, lp2Var4);
                        boolean zF3 = lp2Var4.f(gn2Var3);
                        Object objK3 = lp2Var4.K();
                        if (zF3 || objK3 == beVar) {
                            objK3 = new ba3(gn2Var3, (byte) 3);
                            lp2Var4.g0(objK3);
                        }
                        qm5VarC.add(new mw2(strJ0, g73VarP, (dn2) objK3));
                        lp2Var4.p(false);
                    }
                    String strJ1 = vj8.j0(y46.logcat_clear, lp2Var4);
                    g73 g73VarP2 = u28.p(q36.ic_action_delete, lp2Var4);
                    boolean zF4 = lp2Var4.f(gn2Var3);
                    Object objK4 = lp2Var4.K();
                    if (zF4 || objK4 == beVar) {
                        objK4 = new ba3(gn2Var3, (byte) 4);
                        lp2Var4.g0(objK4);
                    }
                    qm5VarC.add(new mw2(strJ1, g73VarP2, (dn2) objK4));
                    String strJ2 = vj8.j0(y46.logcat_copy, lp2Var4);
                    g73 g73VarP3 = u28.p(q36.ic_copy, lp2Var4);
                    boolean zF5 = lp2Var4.f(gn2Var3);
                    Object objK5 = lp2Var4.K();
                    if (zF5 || objK5 == beVar) {
                        objK5 = new ba3(gn2Var3, (byte) 5);
                        lp2Var4.g0(objK5);
                    }
                    qm5VarC.add(new mw2(strJ2, g73VarP3, (dn2) objK5));
                    j2 j2VarC = qm5VarC.c();
                    lp2Var4.p(false);
                    jm4.i(j2VarC, null, ow2Var, null, lp2Var4, 0, 26);
                    lp2Var4.p(true);
                } else {
                    lp2Var4.Q();
                }
                return dn8Var;
            case 5:
                oh2 oh2Var = (oh2) obj6;
                gg5 gg5Var = (gg5) obj5;
                pv3 pv3Var = (pv3) obj4;
                sf4 sf4Var2 = (sf4) obj;
                lp2 lp2Var5 = (lp2) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                sf4Var2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= lp2Var5.f(sf4Var2) ? 4 : 2;
                }
                if (lp2Var5.N(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    Object objK6 = lp2Var5.K();
                    if (objK6 == beVar) {
                        oh2 oh2Var2 = oh2.b;
                        objK6 = nh2.a;
                        lp2Var5.g0(objK6);
                    }
                    ((nh2) objK6).getClass();
                    oh2 oh2Var3 = new oh2();
                    oh2 oh2Var4 = new oh2();
                    oh2 oh2Var5 = new oh2();
                    Object objK7 = lp2Var5.K();
                    if (objK7 == beVar) {
                        j2 j2Var = sf4Var2.f;
                        dm5 dm5Var = dm5.f0;
                        dm5Var.getClass();
                        em5 em5Var = new em5(dm5Var);
                        ListIterator listIterator = j2Var.listIterator(0);
                        while (listIterator.hasNext()) {
                            em5Var.put(((lf4) listIterator.next()).b, new oh2());
                        }
                        objK7 = em5Var.f();
                        lp2Var5.g0(objK7);
                    }
                    cm5 cm5Var = (cm5) objK7;
                    kx4 kx4VarU = ch3.u(zc1.I(b.c, oh2Var));
                    boolean zF6 = lp2Var5.f(pv3Var) | ((iIntValue5 & 14) == 4) | lp2Var5.f(oh2Var3) | lp2Var5.f(oh2Var4) | lp2Var5.f(oh2Var5);
                    Object objK8 = lp2Var5.K();
                    if (zF6 || objK8 == beVar) {
                        j80 j80Var = new j80(sf4Var2, pv3Var, oh2Var3, oh2Var4, oh2Var5, cm5Var, (byte) 1);
                        lp2Var5.g0(j80Var);
                        objK8 = j80Var;
                    }
                    jb5.a(kx4VarU, null, 0.0f, gg5Var, null, null, null, false, null, false, (gn2) objK8, lp2Var5, 0, 2038);
                } else {
                    lp2Var5.Q();
                }
                return dn8Var;
            case 6:
                om6 om6Var = (om6) obj6;
                gn2 gn2Var4 = (gn2) obj5;
                kx4 kx4Var3 = (kx4) obj4;
                k44 k44Var2 = (k44) obj;
                lp2 lp2Var6 = (lp2) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                k44Var2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= lp2Var6.f(k44Var2) ? 4 : 2;
                }
                if (lp2Var6.N(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    oc.c(om6Var, gn2Var4, dh3.p(k44Var2, kx4Var3), lp2Var6, 0);
                } else {
                    lp2Var6.Q();
                }
                return dn8Var;
            case 7:
                qn7 qn7Var = (qn7) obj6;
                ow2 ow2Var4 = (ow2) obj5;
                gn2 gn2Var5 = (gn2) obj4;
                lp2 lp2Var7 = (lp2) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((xq6) obj).getClass();
                if (!lp2Var7.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    lp2Var7.Q();
                } else if (qn7Var.i || qn7Var.c) {
                    lp2Var7.W(1434326043);
                    lp2Var7.p(false);
                } else {
                    lp2Var7.W(1431673683);
                    xr4 xr4VarC2 = g80.c(pz2.Z, false);
                    int iHashCode2 = Long.hashCode(lp2Var7.T);
                    kl5 kl5VarL2 = lp2Var7.l();
                    kx4 kx4VarQ2 = w45.Q(lp2Var7, hx4Var);
                    uz0.j.getClass();
                    lp2Var7.Z();
                    if (lp2Var7.S) {
                        lp2Var7.k();
                    } else {
                        lp2Var7.j0();
                    }
                    pn7.m(pz2.B0, lp2Var7, xr4VarC2);
                    pn7.m(pz2.A0, lp2Var7, kl5VarL2);
                    pn7.m(pz2.C0, lp2Var7, Integer.valueOf(iHashCode2));
                    pn7.l(lp2Var7);
                    pn7.m(pz2.z0, lp2Var7, kx4VarQ2);
                    boolean zF7 = lp2Var7.f(ow2Var4);
                    Object objK9 = lp2Var7.K();
                    if (zF7 || objK9 == beVar) {
                        objK9 = new kn7(0, ow2Var4, ow2.class, "toggle", "toggle()V", 0, (byte) 0);
                        lp2Var7.g0(objK9);
                    }
                    w45.c((dn2) ((pv3) objK9), null, false, null, null, null, jm4.Z, lp2Var7, 1572864, 62);
                    String strJ3 = vj8.j0(y46.sub_routing_menu_import_from_clipboard, lp2Var7);
                    g73 g73VarP4 = u28.p(q36.ic_routing_import, lp2Var7);
                    boolean zF8 = lp2Var7.f(gn2Var5);
                    Object objK10 = lp2Var7.K();
                    if (zF8 || objK10 == beVar) {
                        objK10 = new ba3(gn2Var5, (byte) 8);
                        lp2Var7.g0(objK10);
                    }
                    mw2 mw2Var2 = new mw2(strJ3, g73VarP4, (dn2) objK10);
                    String strJ4 = vj8.j0(y46.sub_routing_menu_create_new_profile, lp2Var7);
                    g73 g73VarP5 = u28.p(q36.ic_routing_add, lp2Var7);
                    boolean zF9 = lp2Var7.f(gn2Var5);
                    Object objK11 = lp2Var7.K();
                    if (zF9 || objK11 == beVar) {
                        objK11 = new ba3(gn2Var5, (byte) 9);
                        lp2Var7.g0(objK11);
                    }
                    mw2 mw2Var3 = new mw2(strJ4, g73VarP5, (dn2) objK11);
                    String strJ5 = vj8.j0(y46.sub_routing_menu_copy_from_another_subs, lp2Var7);
                    g73 g73VarP6 = u28.p(q36.ic_routing_copy, lp2Var7);
                    boolean zF10 = lp2Var7.f(gn2Var5);
                    Object objK12 = lp2Var7.K();
                    if (zF10 || objK12 == beVar) {
                        objK12 = new ba3(gn2Var5, (byte) 10);
                        lp2Var7.g0(objK12);
                    }
                    mw2 mw2Var4 = new mw2(strJ5, g73VarP6, (dn2) objK12);
                    if (!qn7Var.h) {
                        mw2Var4 = null;
                    }
                    String strJ6 = vj8.j0(y46.sub_routing_menu_export_select_profile, lp2Var7);
                    g73 g73VarP7 = u28.p(q36.ic_routing_export, lp2Var7);
                    boolean zF11 = lp2Var7.f(gn2Var5);
                    Object objK13 = lp2Var7.K();
                    if (zF11 || objK13 == beVar) {
                        objK13 = new ba3(gn2Var5, (byte) 11);
                        lp2Var7.g0(objK13);
                    }
                    mw2[] mw2VarArr = {mw2Var2, mw2Var3, mw2Var4, qn7Var.q ? new mw2(strJ6, g73VarP7, (dn2) objK13) : null};
                    qm5 qm5VarC2 = ec7Var.c();
                    for (int i3 = 0; i3 < 4; i3++) {
                        mw2 mw2Var5 = mw2VarArr[i3];
                        if (mw2Var5 != null) {
                            qm5VarC2.add(mw2Var5);
                        }
                    }
                    jm4.i(qm5VarC2.c(), null, ow2Var4, null, lp2Var7, 0, 26);
                    lp2Var7.p(true);
                    lp2Var7.p(false);
                }
                return dn8Var;
            case 8:
                qn7 qn7Var2 = (qn7) obj6;
                kx4 kx4Var4 = (kx4) obj5;
                gn2 gn2Var6 = (gn2) obj4;
                lp2 lp2Var8 = (lp2) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((uw0) obj).getClass();
                if (lp2Var8.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    w79.a(b.a, null, jm4.U(-402632835, new jn7(qn7Var2, kx4Var4, gn2Var6), lp2Var8), lp2Var8, 390);
                } else {
                    lp2Var8.Q();
                }
                return dn8Var;
            case 9:
                um6 um6Var = (um6) obj6;
                qn7 qn7Var3 = (qn7) obj5;
                gn2 gn2Var7 = (gn2) obj4;
                lp2 lp2Var9 = (lp2) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((ek) obj).getClass();
                if (!lp2Var9.N(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    lp2Var9.Q();
                } else if (um6Var != null) {
                    String str = um6Var.c;
                    lp2Var9.W(1414709899);
                    String str2 = qn7Var3.j;
                    boolean zEquals = str2 == null ? false : str2.equals(str);
                    String str3 = qn7Var3.k;
                    boolean zEquals2 = str3 == null ? false : str3.equals(str);
                    FillElement fillElement = b.a;
                    sr srVar = ((gr) lp2Var9.j(hr.a)).a;
                    i21.c(um6Var, zEquals, zEquals2, gn2Var7, os4.A(fillElement, 0.0f, 24.0f, 0.0f, 0.0f, 13), lp2Var9, 0);
                    lp2Var9.p(false);
                } else {
                    lp2Var9.W(1415188477);
                    lp2Var9.p(false);
                }
                return dn8Var;
            case 10:
                yr7 yr7Var = (yr7) obj6;
                gn2 gn2Var8 = (gn2) obj5;
                kx4 kx4Var5 = (kx4) obj4;
                k44 k44Var3 = (k44) obj;
                lp2 lp2Var10 = (lp2) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                k44Var3.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= lp2Var10.f(k44Var3) ? 4 : 2;
                }
                if (lp2Var10.N(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    qp7.a(yr7Var, gn2Var8, dh3.p(k44Var3, kx4Var5), lp2Var10, 0);
                } else {
                    lp2Var10.Q();
                }
                return dn8Var;
            case 11:
                fu7 fu7Var = (fu7) obj6;
                gn2 gn2Var9 = (gn2) obj5;
                kx4 kx4Var6 = (kx4) obj4;
                lp2 lp2Var11 = (lp2) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((uw0) obj).getClass();
                if (lp2Var11.N(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    w79.a(b.a, null, jm4.U(941542385, new fh((Object) fu7Var, gn2Var9, kx4Var6, (byte) 21), lp2Var11), lp2Var11, 390);
                } else {
                    lp2Var11.Q();
                }
                return dn8Var;
            default:
                ms7 ms7Var = (ms7) obj6;
                gn2 gn2Var10 = (gn2) obj5;
                kx4 kx4Var7 = (kx4) obj4;
                lp2 lp2Var12 = (lp2) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((uw0) obj).getClass();
                if (lp2Var12.N(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    w79.a(b.a, null, jm4.U(1965226856, new fh((Object) ms7Var, gn2Var10, kx4Var7, (byte) 22), lp2Var12), lp2Var12, 390);
                } else {
                    lp2Var12.Q();
                }
                return dn8Var;
        }
    }
}
