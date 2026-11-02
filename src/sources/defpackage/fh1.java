package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fh1 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0 = 0;
    public boolean h0;
    public /* synthetic */ int i0;
    public final /* synthetic */ Object j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh1(gh1 gh1Var, q51 q51Var, int i) {
        super(2, q51Var);
        this.j0 = gh1Var;
        this.i0 = i;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((fh1) n((q51) obj2, (b71) obj)).q(dn8Var);
            case 1:
                return ((fh1) n((q51) obj2, (b71) obj)).q(dn8Var);
            default:
                return ((fh1) n((q51) obj2, Integer.valueOf(((Number) obj).intValue()))).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.j0;
        switch (b) {
            case 0:
                return new fh1((gh1) obj2, q51Var, this.i0);
            case 1:
                return new fh1((w64) obj2, this.i0, q51Var);
            default:
                fh1 fh1Var = new fh1((n48) obj2, q51Var);
                fh1Var.i0 = ((Number) obj).intValue();
                return fh1Var;
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        o8 o8Var;
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.j0;
        c71 c71Var = c71.X;
        q51 q51Var = null;
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
                xg1 xg1VarD = ((gh1) obj2).j().d(this.i0);
                this.h0 = true;
                Object objH = ((ux0) xg1VarD).h(this);
                return objH == c71Var ? c71Var : objH;
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
                s64 s64Var = ((w64) obj2).r0;
                int i = this.i0;
                this.h0 = true;
                Object objF = j74.f(s64Var.b, i, this);
                if (objF != c71Var) {
                    objF = dn8Var;
                }
                return objF == c71Var ? c71Var : dn8Var;
            default:
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
                if (Math.abs(this.i0) != 1 || (o8Var = ((n48) obj2).D0) == null) {
                    return dn8Var;
                }
                this.h0 = true;
                Object objN = gv3.n(new k(o8Var, q51Var, (byte) 6), this);
                if (objN != c71Var) {
                    objN = dn8Var;
                }
                return objN == c71Var ? c71Var : dn8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh1(w64 w64Var, int i, q51 q51Var) {
        super(2, q51Var);
        this.j0 = w64Var;
        this.i0 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh1(n48 n48Var, q51 q51Var) {
        super(2, q51Var);
        this.j0 = n48Var;
    }
}
