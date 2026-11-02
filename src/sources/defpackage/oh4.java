package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oh4 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ oh2 Y;

    public /* synthetic */ oh4(oh2 oh2Var, byte b) {
        this.X = b;
        this.Y = oh2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        be beVar = zz0.a;
        oh2 oh2Var = this.Y;
        lp2 lp2Var = (lp2) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    kx4 kx4VarU = ch3.u(b.a);
                    Object objK = lp2Var.K();
                    if (objK == beVar) {
                        objK = new bz2(oh2Var, (byte) 2);
                        lp2Var.g0(objK);
                    }
                    nr4.b(z91.C(kx4VarU, (gn2) objK), lp2Var, 0);
                }
                break;
            default:
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    kx4 kx4VarU2 = ch3.u(b.a);
                    Object objK2 = lp2Var.K();
                    if (objK2 == beVar) {
                        objK2 = new bz2(oh2Var, (byte) 6);
                        lp2Var.g0(objK2);
                    }
                    du7.a(z91.C(kx4VarU2, (gn2) objK2), lp2Var, 0);
                }
                break;
        }
        return dn8Var;
    }
}
