package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eh1 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ gh1 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eh1(gh1 gh1Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = gh1Var;
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
        return ((eh1) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        gh1 gh1Var = this.i0;
        switch (b) {
            case 0:
                return new eh1(gh1Var, q51Var, (byte) 0);
            case 1:
                return new eh1(gh1Var, q51Var, (byte) 1);
            default:
                return new eh1(gh1Var, q51Var, (byte) 2);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        byte b = this.g0;
        gh1 gh1Var = this.i0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (z) {
                    if (z) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                wq8 wq8VarJ = gh1Var.j();
                this.h0 = true;
                Object objB = wq8VarJ.b(this);
                return objB == c71Var ? c71Var : objB;
            case 1:
                boolean z2 = this.h0;
                if (z2) {
                    if (z2) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                xg1 xg1VarI = gh1Var.j().i();
                this.h0 = true;
                Object objH = ((ux0) xg1VarI).h(this);
                return objH == c71Var ? c71Var : objH;
            default:
                boolean z3 = this.h0;
                if (z3) {
                    if (z3) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                xg1 xg1VarA = gh1Var.j().a();
                this.h0 = true;
                Object objH2 = ((ux0) xg1VarA).h(this);
                return objH2 == c71Var ? c71Var : objH2;
        }
    }
}
