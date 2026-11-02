package defpackage;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mg1 implements sn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ mg1(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Object obj4 = this.Y;
        switch (b) {
            case 0:
                long j = ((dw0) obj).a;
                lp2 lp2Var = (lp2) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= lp2Var.e(j) ? 4 : 2;
                }
                if (lp2Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ng1.b(((n38) obj4).c, j, lp2Var, (iIntValue << 3) & 112);
                } else {
                    lp2Var.Q();
                }
                return dn8Var;
            case 1:
                hc8 hc8Var = (hc8) obj;
                lp2 lp2Var2 = (lp2) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? lp2Var2.f(hc8Var) : lp2Var2.h(hc8Var) ? 4 : 2;
                }
                if (lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    ec8.a(hc8Var, null, 0.0f, null, 0L, 0L, jm4.U(-999924215, new sb((String) obj4, (byte) 5), lp2Var2), lp2Var2, (iIntValue2 & 14) | 805306368);
                } else {
                    lp2Var2.Q();
                }
                return dn8Var;
            case 2:
                pb7.a.b((wb7) obj, null, (jb7) obj4, null, null, 0.0f, 0.0f, (lp2) obj2, (((Number) obj3).intValue() & 14) | 100663296);
                return dn8Var;
            default:
                kx4 kx4Var = (kx4) obj;
                lp2 lp2Var3 = (lp2) obj2;
                ((Number) obj3).intValue();
                lp2Var3.W(-1498516085);
                wf7 wf7VarQ0 = w39.q0(ly4.Y, lp2Var3);
                wf7 wf7VarQ1 = w39.q0(ly4.f0, lp2Var3);
                ce8 ce8Var = (ce8) obj4;
                ug8 ug8Var = ys0.j0;
                Object objC = ce8Var.c();
                rh5 rh5Var = ce8Var.d;
                boolean zBooleanValue = ((Boolean) objC).booleanValue();
                lp2Var3.W(-1553362193);
                float f = zBooleanValue ? 1.0f : 0.8f;
                lp2Var3.p(false);
                Float fValueOf = Float.valueOf(f);
                boolean zBooleanValue2 = ((Boolean) rh5Var.getValue()).booleanValue();
                lp2Var3.W(-1553362193);
                float f2 = zBooleanValue2 ? 1.0f : 0.8f;
                lp2Var3.p(false);
                Float fValueOf2 = Float.valueOf(f2);
                ce8Var.f();
                lp2Var3.W(386845748);
                lp2Var3.p(false);
                yd8 yd8VarH = rq7.h(ce8Var, fValueOf, fValueOf2, wf7VarQ0, ug8Var, lp2Var3, 196608);
                boolean zBooleanValue3 = ((Boolean) ce8Var.c()).booleanValue();
                lp2Var3.W(2073045083);
                float f3 = zBooleanValue3 ? 1.0f : 0.0f;
                lp2Var3.p(false);
                Float fValueOf3 = Float.valueOf(f3);
                boolean zBooleanValue4 = ((Boolean) rh5Var.getValue()).booleanValue();
                lp2Var3.W(2073045083);
                float f4 = zBooleanValue4 ? 1.0f : 0.0f;
                lp2Var3.p(false);
                Float fValueOf4 = Float.valueOf(f4);
                ce8Var.f();
                lp2Var3.W(-281714272);
                lp2Var3.p(false);
                kx4 kx4VarK = jm4.K(kx4Var, ((Number) yd8VarH.j0.getValue()).floatValue(), ((Number) yd8VarH.j0.getValue()).floatValue(), ((Number) rq7.h(ce8Var, fValueOf3, fValueOf4, wf7VarQ1, ug8Var, lp2Var3, 196608).j0.getValue()).floatValue(), 0.0f, null, 131064);
                lp2Var3.p(false);
                return kx4VarK;
        }
    }
}
