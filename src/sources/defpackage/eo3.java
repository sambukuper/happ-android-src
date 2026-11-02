package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eo3 implements ow3 {
    public static final eo3 a = new eo3();
    public static final g37 b = km4.m("kotlinx.serialization.json.JsonElement", qq5.M, new e37[0], new uh3((byte) 2));

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        ao3 ao3Var = (ao3) obj;
        ao3Var.getClass();
        yn0.q(ol7Var);
        if (ao3Var instanceof hq3) {
            ol7Var.r(kq3.a, ao3Var);
            return;
        }
        if (ao3Var instanceof aq3) {
            ol7Var.r(dq3.a, ao3Var);
        } else if (ao3Var instanceof dn3) {
            ol7Var.r(gn3.a, ao3Var);
        } else {
            b61.c();
        }
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        return yn0.p(rd1Var).i();
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return b;
    }
}
