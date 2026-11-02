package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v48 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ y48 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v48(y48 y48Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = y48Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                return ((v48) n(q51Var, b71Var)).q(dn8Var);
            case 1:
                return ((v48) n(q51Var, b71Var)).q(dn8Var);
            case 2:
                return ((v48) n(q51Var, b71Var)).q(dn8Var);
            case 3:
                return ((v48) n(q51Var, b71Var)).q(dn8Var);
            case 4:
                return ((v48) n(q51Var, b71Var)).q(dn8Var);
            default:
                ((v48) n(q51Var, b71Var)).q(dn8Var);
                return c71.X;
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        y48 y48Var = this.i0;
        switch (b) {
            case 0:
                return new v48(y48Var, q51Var, (byte) 0);
            case 1:
                return new v48(y48Var, q51Var, (byte) 1);
            case 2:
                return new v48(y48Var, q51Var, (byte) 2);
            case 3:
                return new v48(y48Var, q51Var, (byte) 3);
            case 4:
                return new v48(y48Var, q51Var, (byte) 4);
            default:
                return new v48(y48Var, q51Var, (byte) 5);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        y48 y48Var = this.i0;
        c71 c71Var = c71.X;
        q51 q51Var = null;
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
                r68 r68Var = y48Var.u0;
                this.h0 = true;
                r68Var.c(true, this);
                return dn8Var == c71Var ? c71Var : dn8Var;
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
                r68 r68Var2 = y48Var.u0;
                this.h0 = true;
                r68Var2.d(this);
                return dn8Var == c71Var ? c71Var : dn8Var;
            case 2:
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    r68 r68Var3 = y48Var.u0;
                    this.h0 = true;
                    return r68Var3.t(false, this) == c71Var ? c71Var : dn8Var;
                }
                if (z3) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.h0;
                if (z4) {
                    if (z4) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                this.h0 = true;
                Object objA = new j31(new o(w51.L(new s48(y48Var, (byte) 7)), (byte) 3), (byte) 4).a(new mh(y48Var, (byte) 8), this);
                if (objA != c71Var) {
                    objA = dn8Var;
                }
                return objA == c71Var ? c71Var : dn8Var;
            case 4:
                boolean z5 = this.h0;
                if (!z5) {
                    w39.n0(obj);
                    r68 r68Var4 = y48Var.u0;
                    this.h0 = true;
                    return r68Var4.z(this) == c71Var ? c71Var : dn8Var;
                }
                if (z5) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z6 = this.h0;
                if (z6) {
                    if (!z6) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w39.n0(obj);
                        b61.n();
                    }
                    return null;
                }
                w39.n0(obj);
                t17 t17Var = new t17(y48Var, q51Var, (byte) 13);
                this.h0 = true;
                tp5.a(y48Var, t17Var, this);
                return c71Var;
        }
    }
}
