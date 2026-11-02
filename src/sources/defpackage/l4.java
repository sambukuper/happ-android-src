package defpackage;

import androidx.compose.foundation.layout.b;
import java.util.ArrayList;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l4 implements sn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ l4(byte b) {
        this.X = b;
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.X;
        hx4 hx4Var = hx4.X;
        e02 e02Var = e02.X;
        dn8 dn8Var = dn8.a;
        final byte b2 = 1;
        boolean z = false;
        switch (b) {
            case 0:
                zr4 zr4Var = (zr4) obj;
                final int iX0 = zr4Var.x0(10.0f);
                int i = iX0 * 2;
                final eo5 eo5VarO = ((tr4) obj2).o(s31.i(i, ((q31) obj3).a, 0));
                return zr4Var.g0(eo5VarO.X - i, eo5VarO.Y, e02Var, new gn2() { // from class: k4
                    @Override // defpackage.gn2
                    public final Object B(Object obj4) {
                        byte b3 = b2;
                        dn8 dn8Var2 = dn8.a;
                        int i2 = iX0;
                        eo5 eo5Var = eo5VarO;
                        do5 do5Var = (do5) obj4;
                        switch (b3) {
                            case 0:
                                do5.f(do5Var, eo5Var, 0, -i2);
                                break;
                            default:
                                do5.f(do5Var, eo5Var, -i2, 0);
                                break;
                        }
                        return dn8Var2;
                    }
                });
            case 1:
                zr4 zr4Var2 = (zr4) obj;
                final int iX1 = zr4Var2.x0(10.0f);
                int i2 = iX1 * 2;
                final eo5 eo5VarO2 = ((tr4) obj2).o(s31.i(0, ((q31) obj3).a, i2));
                int i3 = eo5VarO2.Y - i2;
                int i4 = eo5VarO2.X;
                final byte b3 = z ? (byte) 1 : (byte) 0;
                return zr4Var2.g0(i4, i3, e02Var, new gn2() { // from class: k4
                    @Override // defpackage.gn2
                    public final Object B(Object obj4) {
                        byte b4 = b3;
                        dn8 dn8Var2 = dn8.a;
                        int i5 = iX1;
                        eo5 eo5Var = eo5VarO2;
                        do5 do5Var = (do5) obj4;
                        switch (b4) {
                            case 0:
                                do5.f(do5Var, eo5Var, 0, -i5);
                                break;
                            default:
                                do5.f(do5Var, eo5Var, -i5, 0);
                                break;
                        }
                        return dn8Var2;
                    }
                });
            case 2:
                h51 h51Var = (h51) obj;
                lp2 lp2Var = (lp2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= lp2Var.f(h51Var) ? 4 : 2;
                }
                if (lp2Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    g80.a(u15.f(b.b(os4.z(hx4Var, 0.0f, j51.g, 1).y(b.a), j51.f), h51Var.c, u70.e), lp2Var, 0);
                } else {
                    lp2Var.Q();
                }
                return dn8Var;
            case 3:
                lp2 lp2Var2 = (lp2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((xq6) obj).getClass();
                if (!lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    lp2Var2.Q();
                }
                return dn8Var;
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                lp2 lp2Var3 = (lp2) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= lp2Var3.g(zBooleanValue) ? 4 : 2;
                }
                if (!lp2Var3.N(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    lp2Var3.Q();
                } else if (zBooleanValue) {
                    lp2Var3.W(364821953);
                    g73 g73VarB = g33.e;
                    if (g73VarB == null) {
                        f73 f73Var = new f73("Filled.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i5 = gu8.a;
                        fe7 fe7Var = new fe7(dw0.b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new vi5(8.0f, 5.0f));
                        arrayList.add(new hj5(14.0f));
                        arrayList.add(new cj5(11.0f, -7.0f));
                        arrayList.add(ri5.c);
                        f73.a(f73Var, arrayList, fe7Var);
                        g73VarB = f73Var.b();
                        g33.e = g73VarB;
                    }
                    os4.a(g73VarB, null, null, ((dp) lp2Var3.j(ep.z)).c.a, lp2Var3, 0, 6);
                    lp2Var3.p(false);
                } else {
                    lp2Var3.W(364826332);
                    g73 g73VarB2 = i21.h0;
                    if (g73VarB2 == null) {
                        f73 f73Var2 = new f73("Filled.Pause", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i6 = gu8.a;
                        fe7 fe7Var2 = new fe7(dw0.b);
                        ArrayList arrayList2 = new ArrayList(32);
                        arrayList2.add(new vi5(6.0f, 19.0f));
                        arrayList2.add(new bj5(4.0f));
                        arrayList2.add(new ui5(10.0f, 5.0f));
                        arrayList2.add(new ui5(6.0f, 5.0f));
                        arrayList2.add(new hj5(14.0f));
                        arrayList2.add(ri5.c);
                        arrayList2.add(new vi5(14.0f, 5.0f));
                        arrayList2.add(new hj5(14.0f));
                        arrayList2.add(new bj5(4.0f));
                        arrayList2.add(new ui5(18.0f, 5.0f));
                        arrayList2.add(new bj5(-4.0f));
                        arrayList2.add(ri5.c);
                        f73.a(f73Var2, arrayList2, fe7Var2);
                        g73VarB2 = f73Var2.b();
                        i21.h0 = g73VarB2;
                    }
                    os4.a(g73VarB2, null, null, ((dp) lp2Var3.j(ep.z)).c.a, lp2Var3, 0, 6);
                    lp2Var3.p(false);
                }
                return dn8Var;
            case 5:
                lp2 lp2Var4 = (lp2) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((k44) obj).getClass();
                if (lp2Var4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ch3.f(lp2Var4, b.b(hx4Var, 16.0f));
                } else {
                    lp2Var4.Q();
                }
                return dn8Var;
            case 6:
                lp2 lp2Var5 = (lp2) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((k44) obj).getClass();
                if (lp2Var5.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    km4.f(b.a, lp2Var5, 6);
                } else {
                    lp2Var5.Q();
                }
                return dn8Var;
            case 7:
                lp2 lp2Var6 = (lp2) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((k44) obj).getClass();
                if (lp2Var6.N(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    z39.c(null, lp2Var6, 0, 1);
                } else {
                    lp2Var6.Q();
                }
                return dn8Var;
            case 8:
                lp2 lp2Var7 = (lp2) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((k44) obj).getClass();
                if (lp2Var7.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    z39.c(null, lp2Var7, 0, 1);
                } else {
                    lp2Var7.Q();
                }
                return dn8Var;
            case 9:
                lp2 lp2Var8 = (lp2) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((k44) obj).getClass();
                if (lp2Var8.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    g28.a(b.a, lp2Var8, 6);
                } else {
                    lp2Var8.Q();
                }
                return dn8Var;
            case 10:
                lp2 lp2Var9 = (lp2) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((k44) obj).getClass();
                if (lp2Var9.N(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    z39.c(null, lp2Var9, 0, 1);
                } else {
                    lp2Var9.Q();
                }
                return dn8Var;
            case 11:
                lp2 lp2Var10 = (lp2) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((k44) obj).getClass();
                if (lp2Var10.N(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    ch3.f(lp2Var10, u15.f(b.b(b.a, 16.0f), ((dp) lp2Var10.j(ep.z)).b.b, u70.e));
                } else {
                    lp2Var10.Q();
                }
                return dn8Var;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                lp2 lp2Var11 = (lp2) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((ek) obj).getClass();
                if (lp2Var11.N(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    os4.a(u28.p(q36.icon_warning, lp2Var11), null, vj8.j0(y46.routing_downloading_geo_files_failure, lp2Var11), 0L, lp2Var11, 0, 10);
                } else {
                    lp2Var11.Q();
                }
                return dn8Var;
            case 13:
                lp2 lp2Var12 = (lp2) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((ek) obj).getClass();
                if (lp2Var12.N(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    os4.a(u28.p(q36.icon_warning, lp2Var12), null, vj8.j0(y46.routing_downloading_geo_files_failure, lp2Var12), 0L, lp2Var12, 0, 10);
                } else {
                    lp2Var12.Q();
                }
                return dn8Var;
            case 14:
                k44 k44Var = (k44) obj;
                lp2 lp2Var13 = (lp2) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                k44Var.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= lp2Var13.f(k44Var) ? 4 : 2;
                }
                if (lp2Var13.N(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    sr srVar = ((gr) lp2Var13.j(hr.a)).a;
                    ch3.f(lp2Var13, dh3.p(k44Var, b.b(hx4Var, 24.0f)));
                } else {
                    lp2Var13.Q();
                }
                return dn8Var;
            case 15:
                lp2 lp2Var14 = (lp2) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((uw0) obj).getClass();
                if (!lp2Var14.N(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    lp2Var14.Q();
                }
                return dn8Var;
            default:
                zr4 zr4Var3 = (zr4) obj;
                tr4 tr4Var = (tr4) obj2;
                zr4Var3.getClass();
                tr4Var.getClass();
                return zr4Var3.g0(0, 0, e02Var, new d1(tr4Var.o(s31.b(0, 0, 0, 0, 15)), (byte) 5));
        }
    }
}
