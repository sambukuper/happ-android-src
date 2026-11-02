package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w54 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ z54 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w54(z54 z54Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = z54Var;
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
            case 3:
                break;
        }
        return ((w54) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        z54 z54Var = this.i0;
        switch (b) {
            case 0:
                return new w54(z54Var, q51Var, (byte) 0);
            case 1:
                return new w54(z54Var, q51Var, (byte) 1);
            case 2:
                return new w54(z54Var, q51Var, (byte) 2);
            case 3:
                return new w54(z54Var, q51Var, (byte) 3);
            default:
                return new w54(z54Var, q51Var, (byte) 4);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        z54 z54Var = this.i0;
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
                oi oiVar = z54Var.q;
                Float f = new Float(1.0f);
                this.h0 = true;
                return oiVar.e(this, f) == c71Var ? c71Var : dn8Var;
            case 1:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    oi oiVar2 = z54Var.p;
                    hf3 hf3Var = new hf3(0L);
                    this.h0 = true;
                    if (oiVar2.e(this, hf3Var) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                z54Var.d(0L);
                z54Var.h.setValue(Boolean.FALSE);
                return dn8Var;
            case 2:
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    oi oiVar3 = z54Var.p;
                    this.h0 = true;
                    return oiVar3.f(this) == c71Var ? c71Var : dn8Var;
                }
                if (z3) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.h0;
                if (!z4) {
                    w39.n0(obj);
                    oi oiVar4 = z54Var.q;
                    this.h0 = true;
                    return oiVar4.f(this) == c71Var ? c71Var : dn8Var;
                }
                if (z4) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z5 = this.h0;
                if (!z5) {
                    w39.n0(obj);
                    oi oiVar5 = z54Var.q;
                    this.h0 = true;
                    return oiVar5.f(this) == c71Var ? c71Var : dn8Var;
                }
                if (z5) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
