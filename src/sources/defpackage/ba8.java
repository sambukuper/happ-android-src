package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ba8 implements ow3 {
    public static final ba8 a = new ba8();
    public static final g44 b = x97.P(w74.X, new mq7((byte) 28));

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        nc1 nc1Var = (nc1) obj;
        nc1Var.getClass();
        e37 e37VarD = d();
        ol7 ol7VarA = ol7Var.a(e37VarD);
        ol7VarA.n(a.d(), 0, nc1Var.b);
        ol7VarA.v(e37VarD);
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        e37 e37VarD = d();
        f01 f01VarT = rd1Var.t(e37VarD);
        long jD = 0;
        boolean z = false;
        while (true) {
            ba8 ba8Var = a;
            int iE = f01VarT.e(ba8Var.d());
            if (iE == -1) {
                f01VarT.n(e37VarD);
                if (z) {
                    return new nc1(jD);
                }
                throw new cw4("nanoseconds", d().a());
            }
            if (iE != 0) {
                ci8.O(iE);
                throw null;
            }
            jD = f01VarT.D(ba8Var.d(), 0);
            z = true;
        }
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return (e37) b.getValue();
    }
}
