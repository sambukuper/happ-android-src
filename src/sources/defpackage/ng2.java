package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ng2 extends uy7 implements rn2 {
    public /* synthetic */ int g0;

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((ng2) n((q51) obj2, Integer.valueOf(((Number) obj).intValue()))).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        ng2 ng2Var = new ng2(2, q51Var);
        ng2Var.g0 = ((Number) obj).intValue();
        return ng2Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        int i = this.g0;
        w39.n0(obj);
        return Boolean.valueOf(i > 0);
    }
}
