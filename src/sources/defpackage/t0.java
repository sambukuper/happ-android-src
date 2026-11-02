package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ xz4 i0;
    public final /* synthetic */ ft5 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(ft5 ft5Var, xz4 xz4Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 0;
        this.j0 = ft5Var;
        this.i0 = xz4Var;
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
            case 1:
                break;
        }
        return ((t0) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        ft5 ft5Var = this.j0;
        xz4 xz4Var = this.i0;
        switch (b) {
            case 0:
                return new t0(ft5Var, xz4Var, q51Var);
            case 1:
                return new t0(xz4Var, ft5Var, q51Var, (byte) 1);
            default:
                return new t0(xz4Var, ft5Var, q51Var, (byte) 2);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        ft5 ft5Var = this.j0;
        xz4 xz4Var = this.i0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    gt5 gt5Var = new gt5(ft5Var);
                    this.h0 = true;
                    return xz4Var.a(gt5Var, this) == c71Var ? c71Var : dn8Var;
                }
                if (z) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    this.h0 = true;
                    return xz4Var.a(ft5Var, this) == c71Var ? c71Var : dn8Var;
                }
                if (z2) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    this.h0 = true;
                    return xz4Var.a(ft5Var, this) == c71Var ? c71Var : dn8Var;
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
    public /* synthetic */ t0(xz4 xz4Var, ft5 ft5Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = xz4Var;
        this.j0 = ft5Var;
    }
}
