package defpackage;

import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements rn2 {
    public static final g0 Y = new g0(0);
    public static final g0 Z = new g0(1);
    public static final g0 f0 = new g0(2);
    public static final g0 g0 = new g0(3);
    public static final g0 h0 = new g0(4);
    public static final g0 i0 = new g0(5);
    public static final g0 j0 = new g0(6);
    public static final g0 k0 = new g0(7);
    public static final g0 l0 = new g0(8);
    public static final g0 m0 = new g0(9);
    public static final g0 n0 = new g0(10);
    public static final g0 o0 = new g0(11);
    public static final g0 p0 = new g0(12);
    public final /* synthetic */ byte X;

    public /* synthetic */ g0(byte b) {
        this.X = b;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        String str;
        on2 on2Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                um umVar = (um) obj;
                gt4 gt4Var = (gt4) obj2;
                umVar.getClass();
                gt4Var.getClass();
                return umVar.c.get(gt4Var);
            case 1:
                um umVar2 = (um) obj;
                gt4 gt4Var2 = (gt4) obj2;
                umVar2.getClass();
                gt4Var2.getClass();
                return umVar2.b.get(gt4Var2);
            case 2:
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                }
                return dn8Var;
            case 3:
                lp2 lp2Var2 = (lp2) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    lp2Var2.Q();
                }
                return dn8Var;
            case 4:
                lp2 lp2Var3 = (lp2) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!lp2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    lp2Var3.Q();
                }
                return dn8Var;
            case 5:
                lp2 lp2Var4 = (lp2) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!lp2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    lp2Var4.Q();
                }
                return dn8Var;
            case 6:
                lp2 lp2Var5 = (lp2) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!lp2Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    lp2Var5.Q();
                }
                return dn8Var;
            case 7:
                return Boolean.FALSE;
            case 8:
                ys4 ys4Var = (ys4) obj;
                cz5 cz5Var = (cz5) obj2;
                HashSet hashSet = ev3.f0;
                ys4Var.getClass();
                cz5Var.getClass();
                return ys4Var.g(cz5Var, true);
            case 9:
                ys4 ys4Var2 = (ys4) obj;
                cz5 cz5Var2 = (cz5) obj2;
                int i = ew3.f0;
                ys4Var2.getClass();
                cz5Var2.getClass();
                return ys4Var2.g(cz5Var2, true);
            case 10:
                lp2 lp2Var6 = (lp2) obj;
                ((Number) obj2).intValue();
                lp2Var6.W(-511854661);
                float f = n70.a;
                WeakHashMap weakHashMap = c29.w;
                s94 s94Var = new s94(hw7.b(lp2Var6).l, 48);
                lp2Var6.p(false);
                return s94Var;
            case 11:
                long j = ((dw0) obj2).a;
                return j == 16 ? Boolean.FALSE : Integer.valueOf(z51.U(j));
            default:
                q3 q3Var = (q3) obj;
                q3 q3Var2 = (q3) obj2;
                if (q3Var == null || (str = q3Var.a) == null) {
                    str = q3Var2.a;
                }
                if (q3Var == null || (on2Var = q3Var.b) == null) {
                    on2Var = q3Var2.b;
                }
                return new q3(str, on2Var);
        }
    }
}
