package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import java.util.Arrays;
import java.util.List;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o90 implements sn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ o90(Object obj, gn2 gn2Var, byte b) {
        this.X = b;
        this.Z = obj;
        this.Y = gn2Var;
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        Object objC;
        Object obj4;
        Typeface typeface;
        byte b = this.X;
        ec7 ec7Var = ec7.Y;
        hx4 hx4Var = hx4.X;
        be beVar = zz0.a;
        dn8 dn8Var = dn8.a;
        Object obj5 = this.Z;
        Object obj6 = this.Y;
        switch (b) {
            case 0:
                jm4.s((gn2) obj6, obj5, (s61) obj3);
                return dn8Var;
            case 1:
                gn2 gn2Var = (gn2) obj6;
                h51 h51Var = (h51) obj5;
                lp2 lp2Var = (lp2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (lp2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Object objK = lp2Var.K();
                    if (objK == beVar) {
                        objK = new i51();
                        lp2Var.g0(objK);
                    }
                    i51 i51Var = (i51) objK;
                    i51Var.a.clear();
                    gn2Var.B(i51Var);
                    i51Var.a(h51Var, lp2Var, 0);
                } else {
                    lp2Var.Q();
                }
                return dn8Var;
            case 2:
                b83 b83Var = (b83) obj5;
                gn2 gn2Var2 = (gn2) obj6;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                lp2 lp2Var2 = (lp2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= lp2Var2.g(zBooleanValue) ? 4 : 2;
                }
                if (lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    FillElement fillElement = b.a;
                    if (zBooleanValue) {
                        lp2Var2.W(-1974603820);
                        u70.d(os4.z(fillElement, 0.0f, 24.0f, 1), lp2Var2, 6);
                        lp2Var2.p(false);
                    } else {
                        lp2Var2.W(-1083058474);
                        kx4 kx4VarX = os4.x(fillElement, 16.0f);
                        kx4 kx4VarF = u15.f(g33.e(fillElement), ((dp) lp2Var2.j(ep.z)).b.a, u70.e);
                        boolean zF = lp2Var2.f(b83Var) | lp2Var2.f(gn2Var2);
                        Object objK2 = lp2Var2.K();
                        if (zF || objK2 == beVar) {
                            objK2 = new ii(b83Var, gn2Var2, kx4VarX, fillElement);
                            lp2Var2.g0(objK2);
                        }
                        jb5.a(kx4VarF, null, 0.0f, null, null, null, null, false, null, false, (gn2) objK2, lp2Var2, 0, 2046);
                        lp2Var2.p(false);
                    }
                } else {
                    lp2Var2.Q();
                }
                return dn8Var;
            case 3:
                kx4 kx4Var = (kx4) obj6;
                zy0 zy0Var = (zy0) obj5;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                lp2 lp2Var3 = (lp2) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= lp2Var3.g(zBooleanValue2) ? 4 : 2;
                }
                if (!lp2Var3.N(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    lp2Var3.Q();
                } else if (zBooleanValue2) {
                    lp2Var3.W(-850113556);
                    xr4 xr4VarC = g80.c(pz2.Z, false);
                    int iHashCode = Long.hashCode(lp2Var3.T);
                    kl5 kl5VarL = lp2Var3.l();
                    kx4 kx4VarQ = w45.Q(lp2Var3, kx4Var);
                    uz0.j.getClass();
                    lp2Var3.Z();
                    if (lp2Var3.S) {
                        lp2Var3.k();
                    } else {
                        lp2Var3.j0();
                    }
                    pn7.m(pz2.B0, lp2Var3, xr4VarC);
                    pn7.m(pz2.A0, lp2Var3, kl5VarL);
                    pn7.m(pz2.C0, lp2Var3, Integer.valueOf(iHashCode));
                    pn7.l(lp2Var3);
                    pn7.m(pz2.z0, lp2Var3, kx4VarQ);
                    hi5.L(lp2Var3, l80.a(hx4Var, pz2.i0));
                    lp2Var3.p(true);
                    lp2Var3.p(false);
                } else {
                    lp2Var3.W(-850109179);
                    zy0Var.K(lp2Var3, 0);
                    lp2Var3.p(false);
                }
                return dn8Var;
            case 4:
                y05 y05Var = (y05) obj6;
                ky2 ky2Var = (ky2) obj5;
                ek ekVar = (ek) obj;
                lp2 lp2Var4 = (lp2) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ekVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= (iIntValue4 & 8) == 0 ? lp2Var4.f(ekVar) : lp2Var4.h(ekVar) ? 4 : 2;
                }
                if (lp2Var4.N(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    ce8 ce8VarA = ekVar.a();
                    ug8 ug8Var = ys0.j0;
                    if (ce8VarA.g()) {
                        lp2Var4.W(1666827533);
                        lp2Var4.p(false);
                        objC = ce8VarA.c();
                    } else {
                        lp2Var4.W(1666573488);
                        boolean zF2 = lp2Var4.f(ce8VarA);
                        objC = lp2Var4.K();
                        if (zF2 || objC == beVar) {
                            dd7 dd7VarD = yn0.D();
                            gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
                            dd7 dd7VarP = yn0.P(dd7VarD);
                            try {
                                Object objC2 = ce8VarA.c();
                                yn0.c0(dd7VarD, dd7VarP, gn2VarE);
                                lp2Var4.g0(objC2);
                                objC = objC2;
                            } catch (Throwable th) {
                                yn0.c0(dd7VarD, dd7VarP, gn2VarE);
                                throw th;
                            }
                        }
                        lp2Var4.p(false);
                    }
                    r12 r12Var = (r12) objC;
                    lp2Var4.W(-1819049825);
                    r12 r12Var2 = r12.Y;
                    float f = r12Var == r12Var2 ? 1.0f : 0.0f;
                    lp2Var4.p(false);
                    Float fValueOf = Float.valueOf(f);
                    boolean zF3 = lp2Var4.f(ce8VarA);
                    Object objK3 = lp2Var4.K();
                    Object obj7 = objK3;
                    if (zF3 || objK3 == beVar) {
                        zi1 zi1VarB = rd7.b(new s71(ce8VarA, (byte) 2));
                        lp2Var4.g0(zi1VarB);
                        obj7 = zi1VarB;
                    }
                    r12 r12Var3 = (r12) ((lh7) obj7).getValue();
                    lp2Var4.W(-1819049825);
                    float f2 = r12Var3 != r12Var2 ? 0.0f : 1.0f;
                    lp2Var4.p(false);
                    Float fValueOf2 = Float.valueOf(f2);
                    boolean zF4 = lp2Var4.f(ce8VarA);
                    Object objK4 = lp2Var4.K();
                    Object obj8 = objK4;
                    if (zF4 || objK4 == beVar) {
                        zi1 zi1VarB2 = rd7.b(new s71(ce8VarA, (byte) 3));
                        lp2Var4.g0(zi1VarB2);
                        obj8 = zi1VarB2;
                    }
                    ((wd8) ((lh7) obj8).getValue()).getClass();
                    lp2Var4.W(1019237489);
                    wf7 wf7VarV = wl7.V(0.0f, 400.0f, null, 5);
                    lp2Var4.p(false);
                    yd8 yd8VarH = rq7.h(ce8VarA, fValueOf, fValueOf2, wf7VarV, ug8Var, lp2Var4, 196608);
                    by2 by2Var = (by2) y05Var.getValue();
                    if (by2Var == null) {
                        lp2Var4.W(2085522987);
                        lp2Var4.p(false);
                    } else {
                        lp2Var4.W(2085522988);
                        boolean zF5 = lp2Var4.f(yd8VarH);
                        Object objK5 = lp2Var4.K();
                        if (zF5 || objK5 == beVar) {
                            obj4 = objK5;
                            cy2 cy2Var = new cy2(yd8VarH, (byte) 0);
                            lp2Var4.g0(cy2Var);
                            obj4 = cy2Var;
                        }
                        yn0.d(by2Var, ky2Var, (dn2) obj4, b.k(hx4Var, 300.0f), lp2Var4, 3072);
                        lp2Var4.p(false);
                    }
                } else {
                    lp2Var4.Q();
                }
                return dn8Var;
            case 5:
                kx4 kx4Var2 = (kx4) obj6;
                y68 y68Var = (y68) obj5;
                lp2 lp2Var5 = (lp2) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ek) obj).getClass();
                if (lp2Var5.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    g73 g73VarB = w79.h;
                    if (g73VarB == null) {
                        f73 f73Var = new f73("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i = gu8.a;
                        fe7 fe7Var = new fe7(dw0.b);
                        cc0 cc0Var = new cc0((byte) 2);
                        cc0Var.e(19.0f, 6.41f);
                        cc0Var.d(17.59f, 5.0f);
                        cc0Var.d(12.0f, 10.59f);
                        cc0Var.d(6.41f, 5.0f);
                        cc0Var.d(5.0f, 6.41f);
                        cc0Var.d(10.59f, 12.0f);
                        cc0Var.d(5.0f, 17.59f);
                        cc0Var.d(6.41f, 19.0f);
                        cc0Var.d(12.0f, 13.41f);
                        cc0Var.d(17.59f, 19.0f);
                        cc0Var.d(19.0f, 17.59f);
                        cc0Var.d(13.41f, 12.0f);
                        cc0Var.c();
                        f73.a(f73Var, cc0Var.b, fe7Var);
                        g73VarB = f73Var.b();
                        w79.h = g73VarB;
                    }
                    long j = ((dp) lp2Var5.j(ep.z)).c.a;
                    String strJ0 = vj8.j0(y46.logcat_clear, lp2Var5);
                    boolean zF6 = lp2Var5.f(y68Var);
                    Object objK6 = lp2Var5.K();
                    if (zF6 || objK6 == beVar) {
                        objK6 = new ub(0, y68Var, z68.class, "clearText", "clearText(Landroidx/compose/foundation/text/input/TextFieldState;)V", 1, (byte) 14);
                        lp2Var5.g0(objK6);
                    }
                    os4.a(g73VarB, vj8.e0(kx4Var2, (dn2) ((pv3) objK6), lp2Var5, 0), strJ0, j, lp2Var5, 0, 0);
                } else {
                    lp2Var5.Q();
                }
                return dn8Var;
            case 6:
                pv3 pv3Var = (pv3) obj6;
                y05 y05Var2 = (y05) obj5;
                lp2 lp2Var6 = (lp2) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if (lp2Var6.N(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    ja3 ja3Var = (ja3) y05Var2.getValue();
                    if (ja3Var instanceof ia3) {
                        lp2Var6.W(-923200622);
                        FillElement fillElement2 = b.a;
                        xr4 xr4VarC2 = g80.c(pz2.Z, false);
                        int iHashCode2 = Long.hashCode(lp2Var6.T);
                        kl5 kl5VarL2 = lp2Var6.l();
                        kx4 kx4VarQ2 = w45.Q(lp2Var6, fillElement2);
                        uz0.j.getClass();
                        lp2Var6.Z();
                        if (lp2Var6.S) {
                            lp2Var6.k();
                        } else {
                            lp2Var6.j0();
                        }
                        pn7.m(pz2.B0, lp2Var6, xr4VarC2);
                        pn7.m(pz2.A0, lp2Var6, kl5VarL2);
                        pn7.m(pz2.C0, lp2Var6, Integer.valueOf(iHashCode2));
                        pn7.l(lp2Var6);
                        pn7.m(pz2.z0, lp2Var6, kx4VarQ2);
                        hi5.L(lp2Var6, l80.a(os4.z(hx4Var, 0.0f, 12.0f, 1), pz2.i0));
                        lp2Var6.p(true);
                        lp2Var6.p(false);
                    } else if (ja3Var instanceof ha3) {
                        lp2Var6.W(-923190979);
                        yn0.h((ha3) ja3Var, (gn2) pv3Var, b.a, lp2Var6, 384);
                        lp2Var6.p(false);
                    } else if (ja3Var instanceof ga3) {
                        lp2Var6.W(-923183583);
                        ys0.h((ga3) ja3Var, (gn2) pv3Var, b.a, lp2Var6, 384);
                        lp2Var6.p(false);
                    } else {
                        if (!(ja3Var instanceof fa3)) {
                            lp2Var6.W(-923202213);
                            lp2Var6.p(false);
                            b61.c();
                            return null;
                        }
                        lp2Var6.W(-923176063);
                        u70.f((fa3) ja3Var, (gn2) pv3Var, b.a, lp2Var6, 384);
                        lp2Var6.p(false);
                    }
                } else {
                    lp2Var6.Q();
                }
                return dn8Var;
            case 7:
                gn2 gn2Var3 = (gn2) obj6;
                lf4 lf4Var = (lf4) obj5;
                l80 l80Var = (l80) obj;
                lp2 lp2Var7 = (lp2) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                l80Var.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= lp2Var7.f(l80Var) ? 4 : 2;
                }
                if (lp2Var7.N(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    kx4 kx4VarA = l80.a(os4.z(b.k(hx4Var, 92.0f), 0.0f, 12.0f, 1), pz2.j0);
                    boolean zF7 = lp2Var7.f(gn2Var3) | lp2Var7.f(lf4Var);
                    Object objK7 = lp2Var7.K();
                    if (zF7 || objK7 == beVar) {
                        objK7 = new ff4(gn2Var3, lf4Var, (byte) 1);
                        lp2Var7.g0(objK7);
                    }
                    gv3.e(kx4VarA, (dn2) objK7, lp2Var7, 0);
                } else {
                    lp2Var7.Q();
                }
                return dn8Var;
            case 8:
                sf4 sf4Var = (sf4) obj5;
                gn2 gn2Var4 = (gn2) obj6;
                lp2 lp2Var8 = (lp2) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((k44) obj).getClass();
                if (lp2Var8.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    os4.c(sf4Var, gn2Var4, b.a, lp2Var8, 384);
                } else {
                    lp2Var8.Q();
                }
                return dn8Var;
            case 9:
                gn2 gn2Var5 = (gn2) obj6;
                um6 um6Var = (um6) obj5;
                l80 l80Var2 = (l80) obj;
                lp2 lp2Var9 = (lp2) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                l80Var2.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= lp2Var9.f(l80Var2) ? 4 : 2;
                }
                if (lp2Var9.N(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    kx4 kx4VarK = b.k(hx4Var, 92.0f);
                    kx4 kx4VarA2 = l80.a(kx4VarK, pz2.j0);
                    boolean zF8 = lp2Var9.f(gn2Var5) | lp2Var9.f(um6Var);
                    Object objK8 = lp2Var9.K();
                    if (zF8 || objK8 == beVar) {
                        objK8 = new qm6(gn2Var5, um6Var, (byte) 0);
                        lp2Var9.g0(objK8);
                    }
                    gv3.e(kx4VarA2, (dn2) objK8, lp2Var9, 0);
                    kx4 kx4VarA3 = l80.a(kx4VarK, pz2.h0);
                    boolean zF9 = lp2Var9.f(gn2Var5) | lp2Var9.f(um6Var);
                    Object objK9 = lp2Var9.K();
                    if (zF9 || objK9 == beVar) {
                        objK9 = new qm6(gn2Var5, um6Var, (byte) 1);
                        lp2Var9.g0(objK9);
                    }
                    pu.b(kx4VarA3, (dn2) objK9, lp2Var9, 0);
                } else {
                    lp2Var9.Q();
                }
                return dn8Var;
            case 10:
                ow2 ow2Var = (ow2) obj5;
                gn2 gn2Var6 = (gn2) obj6;
                lp2 lp2Var10 = (lp2) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((xq6) obj).getClass();
                if (lp2Var10.N(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    xr4 xr4VarC3 = g80.c(pz2.Z, false);
                    int iHashCode3 = Long.hashCode(lp2Var10.T);
                    kl5 kl5VarL3 = lp2Var10.l();
                    kx4 kx4VarQ3 = w45.Q(lp2Var10, hx4Var);
                    uz0.j.getClass();
                    lp2Var10.Z();
                    if (lp2Var10.S) {
                        lp2Var10.k();
                    } else {
                        lp2Var10.j0();
                    }
                    pn7.m(pz2.B0, lp2Var10, xr4VarC3);
                    pn7.m(pz2.A0, lp2Var10, kl5VarL3);
                    pn7.m(pz2.C0, lp2Var10, Integer.valueOf(iHashCode3));
                    pn7.l(lp2Var10);
                    pn7.m(pz2.z0, lp2Var10, kx4VarQ3);
                    boolean zF10 = lp2Var10.f(ow2Var);
                    Object objK10 = lp2Var10.K();
                    if (zF10 || objK10 == beVar) {
                        objK10 = new ub(0, ow2Var, ow2.class, "toggle", "toggle()V", 0, (byte) 28);
                        lp2Var10.g0(objK10);
                    }
                    w45.c((dn2) ((pv3) objK10), null, false, null, null, null, ch3.b, lp2Var10, 1572864, 62);
                    String strJ1 = vj8.j0(y46.menu_item_create_profile, lp2Var10);
                    g73 g73VarP = u28.p(q36.ic_routing_add, lp2Var10);
                    boolean zF11 = lp2Var10.f(gn2Var6);
                    Object objK11 = lp2Var10.K();
                    if (zF11 || objK11 == beVar) {
                        objK11 = new ba3(gn2Var6, (byte) 6);
                        lp2Var10.g0(objK11);
                    }
                    mw2 mw2Var = new mw2(strJ1, g73VarP, (dn2) objK11);
                    String strJ2 = vj8.j0(y46.menu_item_import_profile, lp2Var10);
                    g73 g73VarP2 = u28.p(q36.ic_routing_import, lp2Var10);
                    boolean zF12 = lp2Var10.f(gn2Var6);
                    Object objK12 = lp2Var10.K();
                    if (zF12 || objK12 == beVar) {
                        objK12 = new ba3(gn2Var6, (byte) 7);
                        lp2Var10.g0(objK12);
                    }
                    List listAsList = Arrays.asList(mw2Var, new mw2(strJ2, g73VarP2, (dn2) objK12));
                    listAsList.getClass();
                    ec7Var.getClass();
                    jm4.i(ec7Var.e(listAsList), null, ow2Var, null, lp2Var10, 0, 26);
                    lp2Var10.p(true);
                } else {
                    lp2Var10.Q();
                }
                return dn8Var;
            case 11:
                sn6 sn6Var = (sn6) obj5;
                gn2 gn2Var7 = (gn2) obj6;
                lp2 lp2Var11 = (lp2) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((uw0) obj).getClass();
                if (lp2Var11.N(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    w79.a(b.a, null, jm4.U(-1471148969, new i9(sn6Var, gn2Var7, (byte) 27), lp2Var11), lp2Var11, 390);
                } else {
                    lp2Var11.Q();
                }
                return dn8Var;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                gn2 gn2Var8 = (gn2) obj6;
                vo6 vo6Var = (vo6) obj5;
                l80 l80Var3 = (l80) obj;
                lp2 lp2Var12 = (lp2) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                l80Var3.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= lp2Var12.f(l80Var3) ? 4 : 2;
                }
                if (lp2Var12.N(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    kx4 kx4VarK2 = b.k(hx4Var, 92.0f);
                    kx4 kx4VarA4 = l80.a(kx4VarK2, pz2.j0);
                    boolean zF13 = lp2Var12.f(gn2Var8) | lp2Var12.f(vo6Var);
                    Object objK13 = lp2Var12.K();
                    if (zF13 || objK13 == beVar) {
                        objK13 = new rn6(gn2Var8, vo6Var, (byte) 1);
                        lp2Var12.g0(objK13);
                    }
                    gv3.e(kx4VarA4, (dn2) objK13, lp2Var12, 0);
                    kx4 kx4VarA5 = l80.a(kx4VarK2, pz2.h0);
                    boolean zF14 = lp2Var12.f(gn2Var8) | lp2Var12.f(vo6Var);
                    Object objK14 = lp2Var12.K();
                    if (zF14 || objK14 == beVar) {
                        objK14 = new rn6(gn2Var8, vo6Var, (byte) 2);
                        lp2Var12.g0(objK14);
                    }
                    pu.b(kx4VarA5, (dn2) objK14, lp2Var12, 0);
                } else {
                    lp2Var12.Q();
                }
                return dn8Var;
            case 13:
                tn6 tn6Var = (tn6) obj6;
                kx4 kx4Var3 = (kx4) obj5;
                k44 k44Var = (k44) obj;
                lp2 lp2Var13 = (lp2) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                k44Var.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= lp2Var13.f(k44Var) ? 4 : 2;
                }
                if (lp2Var13.N(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    g33.d(tn6Var, dh3.p(k44Var, kx4Var3), lp2Var13, 0);
                } else {
                    lp2Var13.Q();
                }
                return dn8Var;
            case 14:
                Spannable spannable = (Spannable) obj6;
                jf jfVar = (jf) obj5;
                qe7 qe7Var = (qe7) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                int iIntValue15 = ((Integer) obj3).intValue();
                gi2 gi2Var = qe7Var.f;
                dj2 dj2Var = qe7Var.c;
                if (dj2Var == null) {
                    dj2Var = dj2.g0;
                }
                bj2 bj2Var = qe7Var.d;
                int i2 = bj2Var != null ? bj2Var.a : 0;
                cj2 cj2Var = qe7Var.e;
                int i3 = cj2Var != null ? cj2Var.a : 65535;
                kf kfVar = (kf) jfVar.Y;
                rj8 rj8VarB = ((hi2) kfVar.g0).b(gi2Var, dj2Var, i2, i3);
                if (rj8VarB instanceof rj8) {
                    Object obj9 = rj8VarB.X;
                    obj9.getClass();
                    typeface = (Typeface) obj9;
                } else {
                    zv7 zv7Var = new zv7(rj8VarB, kfVar.l0);
                    kfVar.l0 = zv7Var;
                    Object obj10 = zv7Var.Z;
                    obj10.getClass();
                    typeface = (Typeface) obj10;
                }
                spannable.setSpan(new ji2(typeface, (byte) 1), iIntValue14, iIntValue15, 33);
                return dn8Var;
            case 15:
                qn7 qn7Var = (qn7) obj5;
                gn2 gn2Var9 = (gn2) obj6;
                lp2 lp2Var14 = (lp2) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((ek) obj).getClass();
                if (!lp2Var14.N(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    lp2Var14.Q();
                } else if (qn7Var.c) {
                    lp2Var14.W(-1940925075);
                    pn7.e(qn7Var, gn2Var9, b.a, lp2Var14, 384);
                    lp2Var14.p(false);
                } else {
                    lp2Var14.W(-1940918683);
                    boolean z = qn7Var.p;
                    b83 b83Var2 = qn7Var.f;
                    pn7.d(z, b83Var2 == null ? ec7Var : b83Var2, qn7Var.j, qn7Var.k, gn2Var9, b.a, lp2Var14, 196608);
                    lp2Var14.p(false);
                }
                return dn8Var;
            default:
                pv3 pv3Var2 = (pv3) obj6;
                lh7 lh7Var = (lh7) obj5;
                qs7 qs7Var = (qs7) obj;
                lp2 lp2Var15 = (lp2) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                qs7Var.getClass();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= lp2Var15.f(qs7Var) ? 4 : 2;
                }
                if (lp2Var15.N(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    bt7.a(((et7) lh7Var.getValue()).d, ((et7) lh7Var.getValue()).b, qs7Var, (gn2) pv3Var2, b.c, lp2Var15, ((iIntValue17 << 6) & 896) | 24576);
                } else {
                    lp2Var15.Q();
                }
                return dn8Var;
        }
    }

    public /* synthetic */ o90(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }
}
