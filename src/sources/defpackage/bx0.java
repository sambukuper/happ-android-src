package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bx0 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ cx0 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bx0(cx0 cx0Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = cx0Var;
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
        return ((bx0) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        cx0 cx0Var = this.i0;
        switch (b) {
            case 0:
                return new bx0(cx0Var, q51Var, (byte) 0);
            case 1:
                return new bx0(cx0Var, q51Var, (byte) 1);
            default:
                return new bx0(cx0Var, q51Var, (byte) 2);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        cx0 cx0Var = this.i0;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    long jB = ((fw8) hi5.W(cx0Var, y01.t)).b();
                    this.h0 = true;
                    if (u70.F(jB, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                dn2 dn2Var = cx0Var.M0;
                if (dn2Var != null) {
                    dn2Var.invoke();
                }
                if (cx0Var.N0) {
                    ((so5) ((ez2) hi5.W(cx0Var, y01.l))).a(0);
                }
                cx0Var.U0 = true;
                og7 og7Var = cx0Var.S0;
                if (og7Var != null) {
                    og7Var.m(null);
                }
                cx0Var.S0 = null;
                cx0Var.R0 = null;
                return dn8Var;
            case 1:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    long jB2 = ((fw8) hi5.W(cx0Var, y01.t)).b();
                    this.h0 = true;
                    if (u70.F(jB2, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                dn2 dn2Var2 = cx0Var.M0;
                if (dn2Var2 != null) {
                    dn2Var2.invoke();
                }
                if (cx0Var.N0) {
                    ((so5) ((ez2) hi5.W(cx0Var, y01.l))).a(0);
                }
                cx0Var.b1 = true;
                og7 og7Var2 = cx0Var.Z0;
                if (og7Var2 != null) {
                    og7Var2.m(null);
                }
                cx0Var.Z0 = null;
                cx0Var.Y0 = null;
                return dn8Var;
            default:
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    long jB3 = ((fw8) hi5.W(cx0Var, y01.t)).b();
                    this.h0 = true;
                    if (u70.F(jB3, this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z3) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                dn2 dn2Var3 = cx0Var.M0;
                if (dn2Var3 == null) {
                    return dn8Var;
                }
                dn2Var3.invoke();
                return dn8Var;
        }
    }
}
