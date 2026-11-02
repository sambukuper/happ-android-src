package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x9 extends uy7 implements sn2 {
    public boolean g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ z9 i0;
    public final /* synthetic */ ba6 j0;
    public final /* synthetic */ float k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(z9 z9Var, ba6 ba6Var, float f, q51 q51Var) {
        super(3, q51Var);
        this.i0 = z9Var;
        this.j0 = ba6Var;
        this.k0 = f;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        ba6 ba6Var;
        boolean z = this.g0;
        if (!z) {
            w39.n0(obj);
            z9 z9Var = this.i0;
            w9 w9Var = new w9(z9Var, (ia) this.h0, (byte) 0);
            he2 he2Var = z9Var.O0;
            if (he2Var == null) {
                dh3.T("resolvedFlingBehavior");
                throw null;
            }
            ba6 ba6Var2 = this.j0;
            this.h0 = ba6Var2;
            this.g0 = true;
            obj = he2Var.a(w9Var, this.k0, this);
            c71 c71Var = c71.X;
            if (obj == c71Var) {
                return c71Var;
            }
            ba6Var = ba6Var2;
        } else {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba6Var = (ba6) this.h0;
            w39.n0(obj);
        }
        ba6Var.X = ((Number) obj).floatValue();
        return dn8.a;
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        ba6 ba6Var = this.j0;
        float f = this.k0;
        x9 x9Var = new x9(this.i0, ba6Var, f, (q51) obj3);
        x9Var.h0 = (ia) obj;
        return x9Var.q(dn8.a);
    }
}
