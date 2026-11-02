package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tl1 extends gm1 {
    public static final /* synthetic */ int h = 0;
    public final te4 g;

    public tl1(vl1 vl1Var) {
        jl1 jl1Var = vl1Var.n0;
        fy5 fy5Var = vl1Var.g0;
        List list = fy5Var.s0;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (md2.A.e(((vy5) obj).f0).booleanValue()) {
                arrayList.add(obj);
            }
        }
        List list2 = fy5Var.t0;
        list2.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (md2.L.e(((cz5) obj2).f0).booleanValue()) {
                arrayList2.add(obj2);
            }
        }
        super(jl1Var, arrayList, arrayList2, d02.X, tz.k0);
        ve4 ve4Var = ((hl1) jl1Var.X).a;
        f3 f3Var = new f3(this, (byte) 16);
        ve4Var.getClass();
        this.g = new te4(ve4Var, f3Var);
    }

    @Override // defpackage.ft4, defpackage.et4
    public final Collection a(pk1 pk1Var, gn2 gn2Var) {
        pk1Var.getClass();
        return (Collection) this.g.invoke();
    }
}
