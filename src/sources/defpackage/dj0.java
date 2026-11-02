package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dj0 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ ej0 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dj0(ej0 ej0Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = ej0Var;
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
        return ((dj0) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        ej0 ej0Var = this.i0;
        switch (b) {
            case 0:
                return new dj0(ej0Var, q51Var, (byte) 0);
            default:
                return new dj0(ej0Var, q51Var, (byte) 1);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        switch (this.g0) {
            case 0:
                c71 c71Var = c71.X;
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    ok0 ok0Var = this.i0.g0;
                    vx vxVar = new vx(8);
                    synchronized (ok0Var.a) {
                        if (!ok0Var.g) {
                            hi5.i0("CXCP");
                            ok0Var.g = true;
                            bj0 bj0Var = bj0.Z;
                            ok0Var.e = bj0Var;
                            ok0Var.f = vxVar;
                            ok0Var.c(bj0Var, vxVar);
                            ok0Var.d = null;
                        }
                        break;
                    }
                    lr8 lr8Var = this.i0.X;
                    this.h0 = true;
                    if (lr8Var.e(this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
            default:
                ej0 ej0Var = this.i0;
                c71 c71Var2 = c71.X;
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    lr8 lr8Var2 = ej0Var.X;
                    this.h0 = true;
                    if (lr8Var2.e(this) == c71Var2) {
                        return c71Var2;
                    }
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                gv3.i(ej0Var.f0.a, null);
                return dn8.a;
        }
    }
}
