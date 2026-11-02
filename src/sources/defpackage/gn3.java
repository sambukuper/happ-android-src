package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gn3 implements ow3 {
    public static final gn3 a = new gn3();
    public static final fn3 b = fn3.b;

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        dn3 dn3Var = (dn3) obj;
        dn3Var.getClass();
        yn0.q(ol7Var);
        eo3 eo3Var = eo3.a;
        e37 e37VarD = eo3Var.d();
        e37VarD.getClass();
        nt ntVar = new nt(e37VarD);
        int size = dn3Var.size();
        ol7 ol7VarA = ol7Var.a(ntVar);
        Iterator<ao3> it = dn3Var.iterator();
        for (int i = 0; i < size; i++) {
            ol7VarA.q(ntVar, i, eo3Var, it.next());
        }
        ol7VarA.v(ntVar);
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        yn0.p(rd1Var);
        return new dn3((List) new ot(eo3.a).i(rd1Var));
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return b;
    }
}
