package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mc3 extends uy7 implements rn2 {
    public /* synthetic */ float g0;

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((mc3) n((q51) obj2, Float.valueOf(((Number) obj).floatValue()))).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        mc3 mc3Var = new mc3(2, q51Var);
        mc3Var.g0 = ((Number) obj).floatValue();
        return mc3Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        w39.n0(obj);
        return Boolean.valueOf(this.g0 > 0.0f);
    }
}
