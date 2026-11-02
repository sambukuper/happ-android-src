package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dq3 implements ow3 {
    public static final dq3 a = new dq3();
    public static final cq3 b = cq3.b;

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        aq3 aq3Var = (aq3) obj;
        aq3Var.getClass();
        yn0.q(ol7Var);
        yl7 yl7Var = yl7.a;
        eo3 eo3Var = eo3.a;
        new ua4().a(ol7Var, aq3Var);
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        yn0.p(rd1Var);
        yl7 yl7Var = yl7.a;
        eo3 eo3Var = eo3.a;
        return new aq3((Map) new ua4().b(rd1Var));
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return b;
    }
}
