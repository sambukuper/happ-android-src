package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t68 extends uy7 implements gn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ r68 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t68(r68 r68Var, q51 q51Var, byte b) {
        super(1, q51Var);
        this.g0 = b;
        this.i0 = r68Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        q51 q51Var = (q51) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((t68) m(q51Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 m(q51 q51Var) {
        byte b = this.g0;
        r68 r68Var = this.i0;
        switch (b) {
            case 0:
                return new t68(r68Var, q51Var, (byte) 0);
            case 1:
                return new t68(r68Var, q51Var, (byte) 1);
            default:
                return new t68(r68Var, q51Var, (byte) 2);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        r68 r68Var = this.i0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    this.h0 = true;
                    r68Var.d(this);
                    return dn8Var == c71Var ? c71Var : dn8Var;
                }
                if (z) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
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
                boolean zBooleanValue = ((Boolean) r68Var.t.getValue()).booleanValue();
                this.h0 = true;
                r68Var.c(zBooleanValue, this);
                return dn8Var == c71Var ? c71Var : dn8Var;
            default:
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    this.h0 = true;
                    return r68Var.t(false, this) == c71Var ? c71Var : dn8Var;
                }
                if (z3) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
