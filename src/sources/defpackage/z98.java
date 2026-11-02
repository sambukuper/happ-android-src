package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z98 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ aa8 i0;
    public final /* synthetic */ float j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z98(aa8 aa8Var, float f, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = aa8Var;
        this.j0 = f;
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
        return ((z98) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        float f = this.j0;
        aa8 aa8Var = this.i0;
        switch (b) {
            case 0:
                return new z98(aa8Var, f, q51Var, (byte) 0);
            default:
                return new z98(aa8Var, f, q51Var, (byte) 1);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        float f = this.j0;
        c71 c71Var = c71.X;
        aa8 aa8Var = this.i0;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    oi oiVar = aa8Var.v0;
                    if (oiVar == null) {
                        return dn8Var;
                    }
                    Float f2 = new Float(f);
                    pk pkVar = aa8Var.t0 ? oz7.f : aa8Var.s0;
                    this.h0 = true;
                    obj = oi.a(oiVar, f2, pkVar, null, this, 12);
                    if (obj == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            default:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    oi oiVar2 = aa8Var.u0;
                    if (oiVar2 == null) {
                        return dn8Var;
                    }
                    Float f3 = new Float(f);
                    pk pkVar2 = aa8Var.t0 ? oz7.f : aa8Var.s0;
                    this.h0 = true;
                    obj = oi.a(oiVar2, f3, pkVar2, null, this, 12);
                    if (obj == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
        }
    }
}
