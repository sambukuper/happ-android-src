package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class sm6 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public final /* synthetic */ boolean h0;
    public final /* synthetic */ oh2 i0;
    public final /* synthetic */ gn2 j0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sm6(boolean z, oh2 oh2Var, gn2 gn2Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.h0 = z;
        this.i0 = oh2Var;
        this.j0 = gn2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                n(q51Var, b71Var).q(dn8Var);
                break;
            default:
                n(q51Var, b71Var).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        switch (this.g0) {
            case 0:
                return new sm6(this.h0, this.i0, this.j0, q51Var, (byte) 0);
            default:
                return new sm6(this.h0, this.i0, this.j0, q51Var, (byte) 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        gn2 gn2Var = this.j0;
        oh2 oh2Var = this.i0;
        boolean z = this.h0;
        switch (b) {
            case 0:
                w39.n0(obj);
                if (z) {
                    oh2.a(oh2Var);
                    gn2Var.B(fo7.a);
                }
                break;
            default:
                w39.n0(obj);
                if (z) {
                    oh2.a(oh2Var);
                    gn2Var.B(do6.a);
                }
                break;
        }
        return dn8Var;
    }
}
