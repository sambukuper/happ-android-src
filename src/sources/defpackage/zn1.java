package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class zn1 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public eo1 h0;
    public boolean i0;
    public final /* synthetic */ eo1 j0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zn1(eo1 eo1Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = eo1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
        }
        return n(q51Var, b71Var).q(dn8Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        eo1 eo1Var = this.j0;
        switch (b) {
            case 0:
                return new zn1(eo1Var, q51Var, (byte) 0);
            default:
                return new zn1(eo1Var, q51Var, (byte) 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        eo1 eo1Var = this.j0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z = this.i0;
                if (!z) {
                    w39.n0(obj);
                    l27 l27VarZ = eo1Var.Z();
                    this.h0 = eo1Var;
                    this.i0 = true;
                    obj = l27VarZ.g(this);
                    if (obj == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eo1Var = this.h0;
                    w39.n0(obj);
                }
                u84 u84VarZ = ys0.z(((qk2) eo1Var).S0);
                nf1 nf1Var = tp1.a;
                jm4.Q(u84VarZ, dm4.a, new k((r27) obj, eo1Var, (q51) null, (byte) 8), 2);
                return dn8Var;
            default:
                boolean z2 = this.i0;
                if (!z2) {
                    w39.n0(obj);
                    l27 l27VarZ2 = eo1Var.Z();
                    this.h0 = eo1Var;
                    this.i0 = true;
                    obj = l27VarZ2.f(this);
                    if (obj == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eo1Var = this.h0;
                    w39.n0(obj);
                }
                u84 u84VarZ2 = ys0.z(((qk2) eo1Var).S0);
                nf1 nf1Var2 = tp1.a;
                jm4.Q(u84VarZ2, dm4.a, new k((r27) obj, eo1Var, (q51) null, (byte) 8), 2);
                return dn8Var;
        }
    }
}
