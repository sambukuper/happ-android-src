package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zt0 implements sn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ dn2 Y;

    public /* synthetic */ zt0(dn2 dn2Var, byte b) {
        this.X = b;
        this.Y = dn2Var;
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        xz4 xz4Var;
        switch (this.X) {
            case 0:
                lp2 lp2Var = (lp2) obj2;
                ((Integer) obj3).getClass();
                lp2Var.W(-756081143);
                tb3 tb3Var = (tb3) lp2Var.j(qb3.a);
                if (tb3Var != null) {
                    lp2Var.W(-1604682242);
                    lp2Var.p(false);
                    xz4Var = null;
                } else {
                    lp2Var.W(-1604549624);
                    Object objK = lp2Var.K();
                    if (objK == zz0.a) {
                        objK = new xz4();
                        lp2Var.g0(objK);
                    }
                    xz4Var = (xz4) objK;
                    lp2Var.p(false);
                }
                kx4 kx4VarI = x97.i(hx4.X, xz4Var, tb3Var, true, null, this.Y);
                lp2Var.p(false);
                return kx4VarI;
            default:
                zr4 zr4Var = (zr4) obj;
                tr4 tr4Var = (tr4) obj2;
                q31 q31Var = (q31) obj3;
                float f = ((kt1) this.Y.invoke()).X;
                eo5 eo5VarO = tr4Var.o(q31.a(q31Var.a, 0, 0, s31.f(kt1.b(f, Float.NaN) ? 0 : zr4Var.x0(f), q31Var.a), 0, 11));
                return zr4Var.g0(eo5VarO.X, eo5VarO.Y, e02.X, new d1(eo5VarO, (byte) 14));
        }
    }
}
