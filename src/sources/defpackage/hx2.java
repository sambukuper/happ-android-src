package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hx2 implements sn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ String Y;

    public /* synthetic */ hx2(String str, byte b) {
        this.X = b;
        this.Y = str;
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.X;
        byte b2 = 2;
        String str = this.Y;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                lp2 lp2Var = (lp2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((m58) obj).getClass();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    lp2Var.Q();
                } else {
                    zc1.g(this.Y, null, null, 0, 0, 0, 0, false, null, lp2Var, 0, 510);
                }
                break;
            case 1:
                lp2 lp2Var2 = (lp2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ek) obj).getClass();
                if (!lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    lp2Var2.Q();
                } else {
                    ay7.a(null, ((tr) lp2Var2.j(ur.a)).a.a, ((dp) lp2Var2.j(ep.z)).o.a, 0L, 0.0f, 4.0f, jm4.U(-1345804493, new rv2(str, b2), lp2Var2), lp2Var2, 12779520, 89);
                }
                break;
            default:
                hc8 hc8Var = (hc8) obj;
                lp2 lp2Var3 = (lp2) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                hc8Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? lp2Var3.f(hc8Var) : lp2Var3.h(hc8Var) ? (byte) 4 : (byte) 2;
                }
                if (!lp2Var3.N(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    lp2Var3.Q();
                } else {
                    float f = zb8.b;
                    long j = ((dp) lp2Var3.j(ep.z)).b.a;
                    long j2 = dw0.g;
                    iw0 iw0Var = (iw0) lp2Var3.j(kw0.a);
                    xk6 xk6Var = iw0Var.d0;
                    if (xk6Var == null) {
                        xk6 xk6Var2 = new xk6(kw0.b(iw0Var, i21.Y), kw0.b(iw0Var, i21.d0), kw0.b(iw0Var, i21.b0), kw0.b(iw0Var, i21.W));
                        iw0Var.d0 = xk6Var2;
                        xk6Var = xk6Var2;
                    }
                    if (j == 16) {
                        j = xk6Var.a;
                    }
                    long j3 = j;
                    long j4 = j2 != 16 ? j2 : xk6Var.b;
                    long j5 = j2 != 16 ? j2 : xk6Var.c;
                    if (j2 == 16) {
                        j2 = xk6Var.d;
                    }
                    ec8.b(hc8Var, null, new pg1(zb8.a), 0.0f, null, new xk6(j3, j4, j5, j2), 0.0f, jm4.U(1380358429, new rv2(str, (byte) 3), lp2Var3), lp2Var3, iIntValue3 & 14);
                }
                break;
        }
        return dn8Var;
    }
}
