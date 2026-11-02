package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z62 extends s51 {
    public /* synthetic */ Object f0;
    public final /* synthetic */ e72 g0;
    public int h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z62(e72 e72Var, s51 s51Var) {
        super(s51Var);
        this.g0 = e72Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        this.f0 = obj;
        this.h0 |= Integer.MIN_VALUE;
        Object objC = this.g0.c(null, this);
        return objC == c71.X ? objC : new sj6(objC);
    }
}
