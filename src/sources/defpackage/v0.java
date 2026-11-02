package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ x0 i0;
    public final /* synthetic */ ft5 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(x0 x0Var, ft5 ft5Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = x0Var;
        this.j0 = ft5Var;
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
            case 2:
                break;
        }
        return ((v0) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        ft5 ft5Var = this.j0;
        x0 x0Var = this.i0;
        switch (b) {
            case 0:
                return new v0(x0Var, ft5Var, q51Var, (byte) 0);
            case 1:
                return new v0(x0Var, ft5Var, q51Var, (byte) 1);
            case 2:
                return new v0(x0Var, ft5Var, q51Var, (byte) 2);
            default:
                return new v0(x0Var, ft5Var, q51Var, (byte) 3);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        ft5 ft5Var = this.j0;
        x0 x0Var = this.i0;
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
                xz4 xz4Var = x0Var.s0;
                if (xz4Var == null) {
                    return dn8Var;
                }
                et5 et5Var = new et5(ft5Var);
                this.h0 = true;
                return xz4Var.a(et5Var, this) == c71Var ? c71Var : dn8Var;
            case 1:
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
                xz4 xz4Var2 = x0Var.s0;
                if (xz4Var2 == null) {
                    return dn8Var;
                }
                et5 et5Var2 = new et5(ft5Var);
                this.h0 = true;
                return xz4Var2.a(et5Var2, this) == c71Var ? c71Var : dn8Var;
            case 2:
                boolean z3 = this.h0;
                if (z3) {
                    if (z3) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                xz4 xz4Var3 = x0Var.s0;
                if (xz4Var3 == null) {
                    return dn8Var;
                }
                this.h0 = true;
                return xz4Var3.a(ft5Var, this) == c71Var ? c71Var : dn8Var;
            default:
                boolean z4 = this.h0;
                if (z4) {
                    if (z4) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                xz4 xz4Var4 = x0Var.s0;
                if (xz4Var4 == null) {
                    return dn8Var;
                }
                gt5 gt5Var = new gt5(ft5Var);
                this.h0 = true;
                return xz4Var4.a(gt5Var, this) == c71Var ? c71Var : dn8Var;
        }
    }
}
