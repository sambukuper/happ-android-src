package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l18 extends qj6 implements rn2 {
    public boolean Z;
    public /* synthetic */ Object f0;
    public final /* synthetic */ b71 g0;
    public final /* synthetic */ dt5 h0;
    public final /* synthetic */ sn2 i0;
    public final /* synthetic */ gn2 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l18(b71 b71Var, dt5 dt5Var, sn2 sn2Var, gn2 gn2Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = b71Var;
        this.h0 = dt5Var;
        this.i0 = sn2Var;
        this.j0 = gn2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((l18) n((q51) obj2, (bz7) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        l18 l18Var = new l18(this.g0, this.h0, this.i0, this.j0, q51Var);
        l18Var.f0 = obj;
        return l18Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        boolean z = this.Z;
        if (!z) {
            w39.n0(obj);
            bz7 bz7Var = (bz7) this.f0;
            this.Z = true;
            Object objG = q18.g(bz7Var, this.g0, this.h0, this.i0, this.j0, this);
            c71 c71Var = c71.X;
            if (objG == c71Var) {
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
}
