package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class em8 extends uy7 implements tn2 {
    public boolean g0;
    public /* synthetic */ long h0;

    @Override // defpackage.tn2
    public final Object F(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        em8 em8Var = new em8(4, (q51) obj4);
        em8Var.h0 = jLongValue;
        return em8Var.q(dn8.a);
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        boolean z = this.g0;
        if (!z) {
            w39.n0(obj);
            long j = this.h0;
            lh4 lh4VarP0 = lh4.P0();
            int i = fm8.a;
            lh4VarP0.getClass();
            long jMin = Math.min(j * 30000, fm8.a);
            this.g0 = true;
            Object objF = u70.F(jMin, this);
            c71 c71Var = c71.X;
            if (objF == c71Var) {
                return c71Var;
            }
        } else {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return Boolean.TRUE;
    }
}
