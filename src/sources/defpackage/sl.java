package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sl implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;

    public /* synthetic */ sl(tn2 tn2Var, int i, mw2 mw2Var) {
        this.X = (byte) 5;
        this.Z = tn2Var;
        this.Y = i;
        this.f0 = mw2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        int i = this.Y;
        Object obj3 = this.f0;
        Object obj4 = this.Z;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                tl.a((ql) obj4, (List) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((zy0) obj4).f(obj3, (lp2) obj, w79.P(i) | 1);
                break;
            case 2:
                ((Integer) obj2).intValue();
                mb6.a((t06) obj4, (rn2) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                mb6.b((t06[]) obj4, (rn2) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                gr2.b((ir2) obj4, (kx4) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 5:
                tn2 tn2Var = (tn2) obj4;
                mw2 mw2Var = (mw2) obj3;
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    tn2Var.F(Integer.valueOf(i), mw2Var, lp2Var, 0);
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                jm4.a((mw2) obj4, (kx4) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ys0.b((ga3) obj4, (kx4) obj3, (lp2) obj, w79.P(i | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                u70.m((um6) obj4, (kx4) obj3, (lp2) obj, w79.P(i | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((ce8) obj4).a(obj3, (lp2) obj, w79.P(i | 1));
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ sl(byte b, int i, Object obj, Object obj2) {
        this.X = b;
        this.Z = obj;
        this.f0 = obj2;
        this.Y = i;
    }
}
