package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yp3 implements ow3 {
    public static final yp3 a = new yp3();
    public static final g37 b = km4.n("kotlinx.serialization.json.JsonNull", j37.M, new e37[0]);

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        ((wp3) obj).getClass();
        yn0.q(ol7Var);
        ol7Var.o();
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        yn0.p(rd1Var);
        if (rd1Var.w()) {
            throw new vn3(ys0.t(-1, "Expected 'null' literal", null, null, null));
        }
        return wp3.INSTANCE;
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return b;
    }
}
