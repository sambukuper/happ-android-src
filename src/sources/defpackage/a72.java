package defpackage;

import okhttp3.Response;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a72 extends s51 {
    public e72 f0;
    public Response g0;
    public boolean h0;
    public int i0;
    public long j0;
    public /* synthetic */ Object k0;
    public final /* synthetic */ e72 l0;
    public int m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a72(e72 e72Var, s51 s51Var) {
        super(s51Var);
        this.l0 = e72Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        this.k0 = obj;
        this.m0 |= Integer.MIN_VALUE;
        Object objD = e72.d(this.l0, null, null, null, null, false, null, this);
        return objD == c71.X ? objD : new sj6(objD);
    }
}
