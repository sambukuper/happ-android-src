package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nq7 extends s51 {
    public /* synthetic */ Object f0;
    public final /* synthetic */ oq7 g0;
    public int h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq7(oq7 oq7Var, s51 s51Var) {
        super(s51Var);
        this.g0 = oq7Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        this.f0 = obj;
        this.h0 |= Integer.MIN_VALUE;
        Object objA = this.g0.a(null, null, null, null, null, false, this);
        return objA == c71.X ? objA : new sj6(objA);
    }
}
