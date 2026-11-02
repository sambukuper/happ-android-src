package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c84 extends s51 {
    public f84 f0;
    public zf6 g0;
    public boolean h0;
    public int i0;
    public long j0;
    public /* synthetic */ Object k0;
    public final /* synthetic */ f84 l0;
    public int m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c84(f84 f84Var, s51 s51Var) {
        super(s51Var);
        this.l0 = f84Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        this.k0 = obj;
        this.m0 |= Integer.MIN_VALUE;
        Object objC = f84.c(this.l0, null, null, null, null, false, null, this);
        return objC == c71.X ? objC : new sj6(objC);
    }
}
