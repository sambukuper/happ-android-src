package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r40 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ mq5 j0;
    public final /* synthetic */ jc8 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r40(mq5 mq5Var, jc8 jc8Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = mq5Var;
        this.k0 = jc8Var;
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
        return ((r40) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        switch (this.g0) {
            case 0:
                r40 r40Var = new r40(this.j0, this.k0, q51Var, (byte) 0);
                r40Var.i0 = obj;
                return r40Var;
            default:
                r40 r40Var2 = new r40(this.j0, this.k0, q51Var, (byte) 1);
                r40Var2.i0 = obj;
                return r40Var2;
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        jc8 jc8Var = this.k0;
        mq5 mq5Var = this.j0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    q40 q40Var = new q40((b71) this.i0, jc8Var, null);
                    this.h0 = true;
                    return mb6.i(mq5Var, q40Var, this) == c71Var ? c71Var : dn8Var;
                }
                if (z) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    t40 t40Var = new t40((b71) this.i0, jc8Var, null);
                    this.h0 = true;
                    return ((cz7) mq5Var).Y0(t40Var, this) == c71Var ? c71Var : dn8Var;
                }
                if (z2) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
