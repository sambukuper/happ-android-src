package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j80 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;
    public final /* synthetic */ Object i0;

    public /* synthetic */ j80(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
        this.g0 = obj4;
        this.h0 = obj5;
        this.i0 = obj6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.i0;
        Object obj3 = this.h0;
        Object obj4 = this.g0;
        Object obj5 = this.f0;
        Object obj6 = this.Z;
        Object obj7 = this.Y;
        final byte b2 = 0;
        int i = 0;
        switch (b) {
            case 0:
                eo5[] eo5VarArr = (eo5[]) obj7;
                List list = (List) obj6;
                zr4 zr4Var = (zr4) obj5;
                ca6 ca6Var = (ca6) obj4;
                ca6 ca6Var2 = (ca6) obj3;
                k80 k80Var = (k80) obj2;
                do5 do5Var = (do5) obj;
                int length = eo5VarArr.length;
                int i2 = 0;
                while (b2 < length) {
                    eo5 eo5Var = eo5VarArr[b2];
                    eo5Var.getClass();
                    g80.d(do5Var, eo5Var, (tr4) list.get(i2), zr4Var.getLayoutDirection(), ca6Var.X, ca6Var2.X, k80Var.a);
                    i2++;
                    b2++;
                }
                return dn8Var;
            default:
                final sf4 sf4Var = (sf4) obj7;
                final oh2 oh2Var = (oh2) obj5;
                final oh2 oh2Var2 = (oh2) obj4;
                final oh2 oh2Var3 = (oh2) obj3;
                final cm5 cm5Var = (cm5) obj2;
                y64 y64Var = (y64) obj;
                y64Var.getClass();
                final gn2 gn2Var = (gn2) ((pv3) obj6);
                final byte b3 = 1;
                y64.a(y64Var, "LogSettingsBlock", new zy0(-1158813348, true, new o90((Object) sf4Var, gn2Var, (byte) 8)));
                y64.a(y64Var, "LogSettingsBlockSpacer", w51.e);
                y64.a(y64Var, "LogFilesLabel", w51.f);
                final lf4 lf4Var = sf4Var.c;
                j2 j2Var = sf4Var.f;
                if (lf4Var != null) {
                    y64.a(y64Var, "AccessLogFileItem", new zy0(1983673224, true, new sn2() { // from class: rh4
                        @Override // defpackage.sn2
                        public final Object x(Object obj8, Object obj9, Object obj10) {
                            byte b4 = b2;
                            dn8 dn8Var2 = dn8.a;
                            switch (b4) {
                                case 0:
                                    lp2 lp2Var = (lp2) obj9;
                                    int iIntValue = ((Integer) obj10).intValue();
                                    ((k44) obj8).getClass();
                                    if (!lp2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        lp2Var.Q();
                                    } else {
                                        jm4.j(lf4Var, oh2Var, gn2Var, b.a, null, false, false, lp2Var, 1575936, 48);
                                    }
                                    break;
                                case 1:
                                    lp2 lp2Var2 = (lp2) obj9;
                                    int iIntValue2 = ((Integer) obj10).intValue();
                                    ((k44) obj8).getClass();
                                    if (!lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        lp2Var2.Q();
                                    } else {
                                        jm4.j(lf4Var, oh2Var, gn2Var, b.a, null, false, false, lp2Var2, 1575936, 48);
                                    }
                                    break;
                                default:
                                    lp2 lp2Var3 = (lp2) obj9;
                                    int iIntValue3 = ((Integer) obj10).intValue();
                                    ((k44) obj8).getClass();
                                    if (!lp2Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        lp2Var3.Q();
                                    } else {
                                        jm4.j(lf4Var, oh2Var, gn2Var, b.a, null, false, false, lp2Var3, 1575936, 48);
                                    }
                                    break;
                            }
                            return dn8Var2;
                        }
                    }));
                    y64.a(y64Var, "AccessLogFileItemSpacer", w51.g);
                }
                final lf4 lf4Var2 = sf4Var.d;
                if (lf4Var2 != null) {
                    y64.a(y64Var, "SubscriptionLogFileItem", new zy0(1732570495, true, new sn2() { // from class: rh4
                        @Override // defpackage.sn2
                        public final Object x(Object obj8, Object obj9, Object obj10) {
                            byte b4 = b3;
                            dn8 dn8Var2 = dn8.a;
                            switch (b4) {
                                case 0:
                                    lp2 lp2Var = (lp2) obj9;
                                    int iIntValue = ((Integer) obj10).intValue();
                                    ((k44) obj8).getClass();
                                    if (!lp2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        lp2Var.Q();
                                    } else {
                                        jm4.j(lf4Var2, oh2Var2, gn2Var, b.a, null, false, false, lp2Var, 1575936, 48);
                                    }
                                    break;
                                case 1:
                                    lp2 lp2Var2 = (lp2) obj9;
                                    int iIntValue2 = ((Integer) obj10).intValue();
                                    ((k44) obj8).getClass();
                                    if (!lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        lp2Var2.Q();
                                    } else {
                                        jm4.j(lf4Var2, oh2Var2, gn2Var, b.a, null, false, false, lp2Var2, 1575936, 48);
                                    }
                                    break;
                                default:
                                    lp2 lp2Var3 = (lp2) obj9;
                                    int iIntValue3 = ((Integer) obj10).intValue();
                                    ((k44) obj8).getClass();
                                    if (!lp2Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        lp2Var3.Q();
                                    } else {
                                        jm4.j(lf4Var2, oh2Var2, gn2Var, b.a, null, false, false, lp2Var3, 1575936, 48);
                                    }
                                    break;
                            }
                            return dn8Var2;
                        }
                    }));
                    y64.a(y64Var, "SubscriptionLogFileItemSpacer", w51.h);
                }
                final lf4 lf4Var3 = sf4Var.e;
                if (lf4Var3 != null) {
                    final byte b4 = 2;
                    y64.a(y64Var, "PushLogFileItem", new zy0(-1307614784, true, new sn2() { // from class: rh4
                        @Override // defpackage.sn2
                        public final Object x(Object obj8, Object obj9, Object obj10) {
                            byte b5 = b4;
                            dn8 dn8Var2 = dn8.a;
                            switch (b5) {
                                case 0:
                                    lp2 lp2Var = (lp2) obj9;
                                    int iIntValue = ((Integer) obj10).intValue();
                                    ((k44) obj8).getClass();
                                    if (!lp2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        lp2Var.Q();
                                    } else {
                                        jm4.j(lf4Var3, oh2Var3, gn2Var, b.a, null, false, false, lp2Var, 1575936, 48);
                                    }
                                    break;
                                case 1:
                                    lp2 lp2Var2 = (lp2) obj9;
                                    int iIntValue2 = ((Integer) obj10).intValue();
                                    ((k44) obj8).getClass();
                                    if (!lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        lp2Var2.Q();
                                    } else {
                                        jm4.j(lf4Var3, oh2Var3, gn2Var, b.a, null, false, false, lp2Var2, 1575936, 48);
                                    }
                                    break;
                                default:
                                    lp2 lp2Var3 = (lp2) obj9;
                                    int iIntValue3 = ((Integer) obj10).intValue();
                                    ((k44) obj8).getClass();
                                    if (!lp2Var3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        lp2Var3.Q();
                                    } else {
                                        jm4.j(lf4Var3, oh2Var3, gn2Var, b.a, null, false, false, lp2Var3, 1575936, 48);
                                    }
                                    break;
                            }
                            return dn8Var2;
                        }
                    }));
                }
                y64.a(y64Var, "XrayFilesLabel", w51.i);
                ListIterator listIterator = j2Var.listIterator(0);
                while (true) {
                    final int i3 = i;
                    if (!listIterator.hasNext()) {
                        y64.a(y64Var, "LogFilesBlockBottomSpacer", w51.k);
                        return dn8Var;
                    }
                    Object next = listIterator.next();
                    i = i3 + 1;
                    if (i3 < 0) {
                        i21.X();
                        throw null;
                    }
                    final lf4 lf4Var4 = (lf4) next;
                    final oh2 oh2Var4 = oh2Var2;
                    final oh2 oh2Var5 = oh2Var;
                    y64.a(y64Var, lf4Var4.b, new zy0(-555654218, true, new sn2() { // from class: ph4
                        @Override // defpackage.sn2
                        public final Object x(Object obj8, Object obj9, Object obj10) {
                            lf4 lf4Var5 = lf4Var4;
                            String str = lf4Var5.b;
                            lp2 lp2Var = (lp2) obj9;
                            int iIntValue = ((Integer) obj10).intValue();
                            ((k44) obj8).getClass();
                            if (lp2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                                FillElement fillElement = b.a;
                                final sf4 sf4Var2 = sf4Var;
                                boolean zF = dh3.f(sf4Var2.g, str);
                                final cm5 cm5Var2 = cm5Var;
                                Object obj11 = cm5Var2.get(str);
                                if (obj11 == null) {
                                    bt.q("Required value was null.");
                                    return null;
                                }
                                oh2 oh2Var6 = (oh2) obj11;
                                boolean zF2 = lp2Var.f(sf4Var2);
                                final int i4 = i3;
                                boolean zD = zF2 | lp2Var.d(i4) | lp2Var.f(cm5Var2);
                                final oh2 oh2Var7 = oh2Var3;
                                boolean zF3 = zD | lp2Var.f(oh2Var7);
                                final oh2 oh2Var8 = oh2Var4;
                                boolean zF4 = zF3 | lp2Var.f(oh2Var8);
                                final oh2 oh2Var9 = oh2Var5;
                                boolean zF5 = zF4 | lp2Var.f(oh2Var9);
                                Object objK = lp2Var.K();
                                if (zF5 || objK == zz0.a) {
                                    dn2 dn2Var = new dn2() { // from class: qh4
                                        /* JADX WARN: Code duplicated, block: B:19:0x003e  */
                                        /* JADX WARN: Code duplicated, block: B:22:0x004b  */
                                        /* JADX WARN: Code duplicated, block: B:25:0x004f  */
                                        /* JADX WARN: Code duplicated, block: B:27:0x005b  */
                                        /* JADX WARN: Code duplicated, block: B:30:0x005f  */
                                        @Override // defpackage.dn2
                                        public final Object invoke() {
                                            String str2;
                                            boolean zA;
                                            Boolean boolValueOf;
                                            boolean zA2;
                                            oh2 oh2Var10;
                                            j2 j2Var2 = sf4Var2.f;
                                            int i5 = i4;
                                            lf4 lf4Var6 = (lf4) wv0.u0(i5 + 1, j2Var2);
                                            if (lf4Var6 == null || (str2 = lf4Var6.b) == null) {
                                                lf4 lf4Var7 = (lf4) wv0.u0(i5 - 1, j2Var2);
                                                str2 = lf4Var7 != null ? lf4Var7.b : null;
                                            }
                                            if (str2 == null || (oh2Var10 = (oh2) cm5Var2.get(str2)) == null) {
                                                zA = oh2.a(oh2Var7);
                                                boolValueOf = Boolean.valueOf(zA);
                                                if (!zA) {
                                                    boolValueOf = null;
                                                }
                                                if (boolValueOf == null) {
                                                    zA2 = oh2.a(oh2Var8);
                                                    if ((zA2 ? Boolean.valueOf(zA2) : null) == null) {
                                                        oh2.a(oh2Var9);
                                                    }
                                                }
                                            } else {
                                                boolean zA3 = oh2.a(oh2Var10);
                                                Boolean boolValueOf2 = Boolean.valueOf(zA3);
                                                if (!zA3) {
                                                    boolValueOf2 = null;
                                                }
                                                if (boolValueOf2 == null) {
                                                    zA = oh2.a(oh2Var7);
                                                    boolValueOf = Boolean.valueOf(zA);
                                                    if (!zA) {
                                                        boolValueOf = null;
                                                    }
                                                    if (boolValueOf == null) {
                                                        zA2 = oh2.a(oh2Var8);
                                                        if ((zA2 ? Boolean.valueOf(zA2) : null) == null) {
                                                            oh2.a(oh2Var9);
                                                        }
                                                    }
                                                }
                                            }
                                            return dn8.a;
                                        }
                                    };
                                    lp2Var.g0(dn2Var);
                                    objK = dn2Var;
                                }
                                jm4.j(lf4Var5, oh2Var6, gn2Var, fillElement, (dn2) objK, zF, false, lp2Var, 3072, 64);
                            } else {
                                lp2Var.Q();
                            }
                            return dn8.a;
                        }
                    }));
                    if (i3 != j2Var.size() - 1) {
                        y64.a(y64Var, oi0.l("Spacer", lf4Var4.b), w51.j);
                    }
                    oh2Var2 = oh2Var4;
                    oh2Var = oh2Var5;
                }
                break;
        }
    }
}
