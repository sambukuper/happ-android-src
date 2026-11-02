package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rh7 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0 = 1;
    public float h0;
    public boolean i0;
    public /* synthetic */ Object j0;
    public final /* synthetic */ Object k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh7(wg wgVar, float f, pk pkVar, q51 q51Var) {
        super(2, q51Var);
        this.j0 = wgVar;
        this.h0 = f;
        this.k0 = pkVar;
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
        return ((rh7) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.k0;
        switch (b) {
            case 0:
                return new rh7((wg) this.j0, this.h0, (pk) obj2, q51Var);
            default:
                rh7 rh7Var = new rh7((ce8) obj2, q51Var);
                rh7Var.j0 = obj;
                return rh7Var;
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        float fH;
        b71 b71Var;
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.k0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z = this.i0;
                if (!z) {
                    w39.n0(obj);
                    this.i0 = true;
                    return oi.a((oi) ((wg) this.j0).c, new Float(this.h0), (pk) obj2, null, this, 12) == c71Var ? c71Var : dn8Var;
                }
                if (z) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.i0;
                if (!z2) {
                    w39.n0(obj);
                    b71 b71Var2 = (b71) this.j0;
                    fH = ry7.h(b71Var2.getCoroutineContext());
                    b71Var = b71Var2;
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fH = this.h0;
                    b71Var = (b71) this.j0;
                    w39.n0(obj);
                }
                while (gv3.E(b71Var)) {
                    ru1 ru1Var = new ru1((ce8) obj2, fH);
                    this.j0 = b71Var;
                    this.h0 = fH;
                    this.i0 = true;
                    s61 s61Var = this.Y;
                    s61Var.getClass();
                    if (z68.H(s61Var).a(ru1Var, this) == c71Var) {
                        return c71Var;
                    }
                }
                return dn8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh7(ce8 ce8Var, q51 q51Var) {
        super(2, q51Var);
        this.k0 = ce8Var;
    }
}
