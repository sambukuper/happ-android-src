package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u9 extends uy7 implements sn2 {
    public boolean g0;
    public /* synthetic */ ia h0;
    public final /* synthetic */ pi i0;
    public final /* synthetic */ z9 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(pi piVar, z9 z9Var, q51 q51Var) {
        super(3, q51Var);
        this.i0 = piVar;
        this.j0 = z9Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        boolean z = this.g0;
        byte b = 1;
        if (!z) {
            w39.n0(obj);
            p0 p0Var = new p0(this.j0, this.h0, b);
            this.g0 = true;
            Object objK = this.i0.K(p0Var, this);
            c71 c71Var = c71.X;
            if (objK == c71Var) {
                return c71Var;
            }
        } else {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8.a;
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        u9 u9Var = new u9(this.i0, this.j0, (q51) obj3);
        u9Var.h0 = (ia) obj;
        return u9Var.q(dn8.a);
    }
}
