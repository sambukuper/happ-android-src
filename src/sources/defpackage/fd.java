package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fd implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ y05 Y;

    public /* synthetic */ fd(y05 y05Var, byte b) {
        this.X = b;
        this.Y = y05Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    /* JADX WARN: Code duplicated, block: B:6:0x0023  */
    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        float fMin;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        y05 y05Var = this.Y;
        switch (b) {
            case 0:
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    Object objK = lp2Var.K();
                    if (objK == zz0.a) {
                        objK = new y2((byte) 12);
                        lp2Var.g0(objK);
                    }
                    jm4.e(v07.a(hx4.X, false, (gn2) objK), (rn2) y05Var.getValue(), lp2Var, 0);
                }
                break;
            default:
                lf3 lf3Var = (lf3) obj;
                lf3 lf3Var2 = (lf3) obj2;
                int i = lf3Var2.a;
                int i2 = lf3Var2.d;
                int i3 = lf3Var2.c;
                int i4 = lf3Var2.b;
                int i5 = lf3Var.c;
                int i6 = lf3Var.b;
                int i7 = lf3Var.d;
                int i8 = lf3Var.a;
                float fMin2 = 1.0f;
                if (i >= i5) {
                    fMin = 0.0f;
                } else if (i3 <= i8) {
                    fMin = 1.0f;
                } else if (lf3Var2.d() == 0) {
                    fMin = 0.0f;
                } else {
                    fMin = (((Math.min(lf3Var.c, i3) + Math.max(i8, i)) / 2) - i) / lf3Var2.d();
                }
                if (i4 >= i7) {
                    fMin2 = 0.0f;
                } else if (i2 > i6) {
                    if (lf3Var2.b() == 0) {
                        fMin2 = 0.0f;
                    } else {
                        fMin2 = (((Math.min(i7, i2) + Math.max(i6, i4)) / 2) - i4) / lf3Var2.b();
                    }
                }
                y05Var.setValue(new gd8(pn7.h(fMin, fMin2)));
                break;
        }
        return dn8Var;
    }
}
