package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kx2 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ gn2 i0;
    public final /* synthetic */ y68 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kx2(gn2 gn2Var, y68 y68Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = gn2Var;
        this.j0 = y68Var;
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
        return ((kx2) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        switch (this.g0) {
            case 0:
                return new kx2(this.i0, this.j0, q51Var, (byte) 0);
            default:
                return new kx2(this.i0, this.j0, q51Var, (byte) 1);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        final y68 y68Var = this.j0;
        c71 c71Var = c71.X;
        final byte b2 = 1;
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
                final byte b3 = 0;
                xe2 xe2VarT = w51.t(new o(w51.L(new dn2() { // from class: jx2
                    @Override // defpackage.dn2
                    public final Object invoke() {
                        byte b4 = b3;
                        y68 y68Var2 = y68Var;
                        switch (b4) {
                            case 0:
                                break;
                        }
                        return y68Var2.c().Z.toString();
                    }
                }), (byte) 3));
                yn1 yn1Var = new yn1(2, this.i0, ch3.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 3);
                this.h0 = true;
                return z91.n(xe2VarT, yn1Var, this) == c71Var ? c71Var : dn8Var;
            default:
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
                xe2 xe2VarT2 = w51.t(new o(w51.L(new dn2() { // from class: jx2
                    @Override // defpackage.dn2
                    public final Object invoke() {
                        byte b4 = b2;
                        y68 y68Var2 = y68Var;
                        switch (b4) {
                            case 0:
                                break;
                        }
                        return y68Var2.c().Z.toString();
                    }
                }), (byte) 3));
                yn1 yn1Var2 = new yn1(2, this.i0, ch3.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 4);
                this.h0 = true;
                return z91.n(xe2VarT2, yn1Var2, this) == c71Var ? c71Var : dn8Var;
        }
    }
}
