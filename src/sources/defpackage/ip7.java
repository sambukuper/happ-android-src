package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ip7 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ np7 j0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ip7(np7 np7Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = np7Var;
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
        np7 np7Var = this.j0;
        switch (b) {
            case 0:
                ip7 ip7Var = new ip7(np7Var, q51Var, (byte) 0);
                ip7Var.i0 = obj;
                return ip7Var;
            default:
                ip7 ip7Var2 = new ip7(np7Var, q51Var, (byte) 1);
                ip7Var2.i0 = obj;
                return ip7Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        np7 np7Var = this.j0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                b71 b71Var = (b71) this.i0;
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    this.i0 = null;
                    this.h0 = true;
                    return np7Var.j(b71Var, this) == c71Var ? c71Var : dn8Var;
                }
                if (z) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                b71 b71Var2 = (b71) this.i0;
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    this.i0 = null;
                    this.h0 = true;
                    return np7Var.j(b71Var2, this) == c71Var ? c71Var : dn8Var;
                }
                if (z2) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
