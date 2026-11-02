package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x48 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ r68 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x48(r68 r68Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = r68Var;
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
        return ((x48) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        r68 r68Var = this.i0;
        switch (b) {
            case 0:
                return new x48(r68Var, q51Var, (byte) 0);
            case 1:
                return new x48(r68Var, q51Var, (byte) 1);
            default:
                return new x48(r68Var, q51Var, (byte) 2);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        r68 r68Var = this.i0;
        c71 c71Var = c71.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    this.h0 = true;
                    if (r68Var.z(this) == c71Var) {
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
            case 1:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    this.h0 = true;
                    r68Var.getClass();
                    j31 j31VarL = w51.L(new n30(r68Var, (byte) 5));
                    l68 l68Var = l68.X;
                    zx6 zx6Var = w51.l;
                    ci8.i(2, l68Var);
                    Object objA = w51.u(j31VarL, zx6Var, l68Var).a(new te0(new ca6(), new m68(r68Var, (byte) 0), (byte) 3), this);
                    if (objA != c71Var) {
                        objA = dn8Var;
                    }
                    if (objA != c71Var) {
                        objA = dn8Var;
                    }
                    if (objA == c71Var) {
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
            default:
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    this.h0 = true;
                    r68Var.getClass();
                    Object objA2 = w51.u(w51.L(new n30(r68Var, (byte) 4)), new b58((byte) 1), w51.m).a(new m68(r68Var, (byte) 1), this);
                    if (objA2 != c71Var) {
                        objA2 = dn8Var;
                    }
                    if (objA2 == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z3) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
        }
    }
}
