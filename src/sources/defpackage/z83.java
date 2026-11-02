package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z83 extends s51 {
    public String f0;
    public ea6 g0;
    public Object h0;
    public String i0;
    public q23 j0;
    public boolean k0;
    public boolean l0;
    public int m0;
    public int n0;
    public /* synthetic */ Object o0;
    public final /* synthetic */ a93 p0;
    public int q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z83(a93 a93Var, s51 s51Var) {
        super(s51Var);
        this.p0 = a93Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        this.o0 = obj;
        this.q0 |= Integer.MIN_VALUE;
        Object objB = this.p0.b(null, null, false, null, null, null, false, this);
        return objB == c71.X ? objB : new sj6(objB);
    }
}
