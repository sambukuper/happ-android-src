package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n18 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ sn2 i0;
    public final /* synthetic */ dt5 j0;
    public final /* synthetic */ hq5 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n18(sn2 sn2Var, dt5 dt5Var, hq5 hq5Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = sn2Var;
        this.j0 = dt5Var;
        this.k0 = hq5Var;
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
        return ((n18) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        switch (this.g0) {
            case 0:
                return new n18(this.i0, this.j0, this.k0, q51Var, (byte) 0);
            default:
                return new n18(this.i0, this.j0, this.k0, q51Var, (byte) 1);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        hq5 hq5Var = this.k0;
        dt5 dt5Var = this.j0;
        sn2 sn2Var = this.i0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    z85 z85Var = new z85(hq5Var.c);
                    this.h0 = true;
                    return sn2Var.x(dt5Var, z85Var, this) == c71Var ? c71Var : dn8Var;
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
                    z85 z85Var2 = new z85(hq5Var.c);
                    this.h0 = true;
                    return sn2Var.x(dt5Var, z85Var2, this) == c71Var ? c71Var : dn8Var;
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
