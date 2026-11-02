package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p68 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0 = 0;
    public boolean h0;
    public final /* synthetic */ r68 i0;
    public final /* synthetic */ mq5 j0;
    public final /* synthetic */ boolean k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p68(mq5 mq5Var, r68 r68Var, boolean z, q51 q51Var) {
        super(2, q51Var);
        this.j0 = mq5Var;
        this.i0 = r68Var;
        this.k0 = z;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((p68) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        boolean z = this.k0;
        mq5 mq5Var = this.j0;
        r68 r68Var = this.i0;
        switch (b) {
            case 0:
                return new p68(mq5Var, r68Var, z, q51Var);
            default:
                return new p68(r68Var, mq5Var, z, q51Var);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        boolean z = this.k0;
        mq5 mq5Var = this.j0;
        r68 r68Var = this.i0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z2 = this.h0;
                if (z2) {
                    if (z2) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                h70 h70Var = new h70(r68Var, z, (byte) 7);
                n30 n30Var = new n30(r68Var, (byte) 6);
                this.h0 = true;
                Object objI = mb6.i(mq5Var, new at5(h70Var, n30Var, null), this);
                if (objI != c71Var) {
                    objI = dn8Var;
                }
                return objI == c71Var ? c71Var : dn8Var;
            default:
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    this.h0 = true;
                    return r68Var.g(mq5Var, z, this) == c71Var ? c71Var : dn8Var;
                }
                if (z3) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p68(r68 r68Var, mq5 mq5Var, boolean z, q51 q51Var) {
        super(2, q51Var);
        this.i0 = r68Var;
        this.j0 = mq5Var;
        this.k0 = z;
    }
}
