package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o9 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ rn2 i0;
    public final /* synthetic */ Object j0;
    public final /* synthetic */ b71 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o9(rn2 rn2Var, Object obj, b71 b71Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = rn2Var;
        this.j0 = obj;
        this.k0 = b71Var;
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
        return ((o9) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        switch (this.g0) {
            case 0:
                return new o9(this.i0, this.j0, this.k0, q51Var, (byte) 0);
            default:
                return new o9(this.i0, this.j0, this.k0, q51Var, (byte) 1);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = this.k0;
        Object obj2 = this.j0;
        rn2 rn2Var = this.i0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    this.h0 = true;
                    if (rn2Var.K(obj2, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                gv3.i(b71Var, new e9());
                return dn8Var;
            default:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    this.h0 = true;
                    if (rn2Var.K(obj2, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                gv3.i(b71Var, new f9());
                return dn8Var;
        }
    }
}
