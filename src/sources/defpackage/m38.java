package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m38 implements sn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Drawable Y;

    public /* synthetic */ m38(Drawable drawable, byte b) {
        this.X = b;
        this.Y = drawable;
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Drawable drawable = this.Y;
        switch (b) {
            case 0:
                long j = ((dw0) obj).a;
                lp2 lp2Var = (lp2) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    lp2Var.Q();
                } else {
                    ts2.Z.b(drawable, lp2Var, 48);
                }
                break;
            default:
                long j2 = ((dw0) obj).a;
                lp2 lp2Var2 = (lp2) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (!lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    lp2Var2.Q();
                } else {
                    ts2.Z.b(drawable, lp2Var2, 48);
                }
                break;
        }
        return dn8Var;
    }
}
