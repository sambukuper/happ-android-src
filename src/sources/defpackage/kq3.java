package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kq3 implements ow3 {
    public static final kq3 a = new kq3();
    public static final g37 b = km4.n("kotlinx.serialization.json.JsonPrimitive", zt5.U, new e37[0]);

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        hq3 hq3Var = (hq3) obj;
        hq3Var.getClass();
        yn0.q(ol7Var);
        if (hq3Var instanceof wp3) {
            ol7Var.r(yp3.a, wp3.INSTANCE);
        } else {
            ol7Var.r(lp3.a, (kp3) hq3Var);
        }
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        tn3 tn3VarP = yn0.p(rd1Var);
        ao3 ao3VarI = tn3VarP.i();
        if (ao3VarI instanceof hq3) {
            return (hq3) ao3VarI;
        }
        throw new vn3(ys0.t(-1, oi0.j(yb6.a, ao3VarI.getClass(), new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ")), null, null, tn3VarP.y().a.h ? ys0.J(ao3VarI.toString(), -1).toString() : null));
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return b;
    }
}
