package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cz0 implements tn2 {
    public final /* synthetic */ byte X;

    public /* synthetic */ cz0(byte b) {
        this.X = b;
    }

    @Override // defpackage.tn2
    public final Object F(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                ((Integer) obj).getClass();
                mw2 mw2Var = (mw2) obj2;
                lp2 lp2Var = (lp2) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                mw2Var.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= lp2Var.f(mw2Var) ? 32 : 16;
                }
                if (lp2Var.N(iIntValue & 1, (iIntValue & 145) != 144)) {
                    jm4.a(mw2Var, null, lp2Var, (iIntValue >> 3) & 14);
                } else {
                    lp2Var.Q();
                }
                return dn8Var;
            case 1:
                ((Integer) obj).getClass();
                mw2 mw2Var2 = (mw2) obj2;
                lp2 lp2Var2 = (lp2) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                mw2Var2.getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= lp2Var2.f(mw2Var2) ? 32 : 16;
                }
                if (lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    jm4.a(mw2Var2, null, lp2Var2, (iIntValue2 >> 3) & 14);
                } else {
                    lp2Var2.Q();
                }
                return dn8Var;
            default:
                return new op5((s61) obj, (Context) obj2, (zz6) obj3, (ge4) obj4);
        }
    }
}
