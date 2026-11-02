package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class op0 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0 = 0;
    public boolean h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ rp0 j0;
    public final /* synthetic */ ze2 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op0(rp0 rp0Var, ze2 ze2Var, Object obj, q51 q51Var) {
        super(2, q51Var);
        this.j0 = rp0Var;
        this.k0 = ze2Var;
        this.i0 = obj;
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
        return ((op0) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        ze2 ze2Var = this.k0;
        rp0 rp0Var = this.j0;
        switch (b) {
            case 0:
                return new op0(rp0Var, ze2Var, this.i0, q51Var);
            default:
                op0 op0Var = new op0(rp0Var, ze2Var, q51Var);
                op0Var.i0 = obj;
                return op0Var;
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (z) {
                    if (z) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                sn2 sn2Var = this.j0.g0;
                Object obj2 = this.i0;
                this.h0 = true;
                return sn2Var.x(this.k0, obj2, this) == c71Var ? c71Var : dn8Var;
            default:
                b71 b71Var = (b71) this.i0;
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
                ea6 ea6Var = new ea6();
                rp0 rp0Var = this.j0;
                xe2 xe2Var = rp0Var.f0;
                qp0 qp0Var = new qp0(ea6Var, b71Var, rp0Var, this.k0, (byte) 0);
                this.i0 = null;
                this.h0 = true;
                return xe2Var.a(qp0Var, this) == c71Var ? c71Var : dn8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op0(rp0 rp0Var, ze2 ze2Var, q51 q51Var) {
        super(2, q51Var);
        this.j0 = rp0Var;
        this.k0 = ze2Var;
    }
}
