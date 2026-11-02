package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class px6 extends uy7 implements rn2 {
    public /* synthetic */ Object g0;
    public final /* synthetic */ ba6 h0;
    public final /* synthetic */ float i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px6(ba6 ba6Var, float f, q51 q51Var) {
        super(2, q51Var);
        this.h0 = ba6Var;
        this.i0 = f;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        px6 px6Var = (px6) n((q51) obj2, (xx6) obj);
        dn8 dn8Var = dn8.a;
        px6Var.q(dn8Var);
        return dn8Var;
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        px6 px6Var = new px6(this.h0, this.i0, q51Var);
        px6Var.g0 = obj;
        return px6Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        w39.n0(obj);
        this.h0.X = ((xx6) this.g0).a(this.i0);
        return dn8.a;
    }
}
