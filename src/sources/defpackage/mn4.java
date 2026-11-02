package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class mn4 extends uy7 implements rn2 {
    public /* synthetic */ Object g0;
    public final /* synthetic */ String h0;
    public final /* synthetic */ nm4 i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn4(String str, nm4 nm4Var, q51 q51Var) {
        super(2, q51Var);
        this.h0 = str;
        this.i0 = nm4Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        mn4 mn4VarN = n((q51) obj2, (b71) obj);
        dn8 dn8Var = dn8.a;
        mn4VarN.q(dn8Var);
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        mn4 mn4Var = new mn4(this.h0, this.i0, q51Var);
        mn4Var.g0 = obj;
        return mn4Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        b71 b71Var = (b71) this.g0;
        w39.n0(obj);
        of7 of7Var = of7.a;
        nm4 nm4Var = this.i0;
        String str = this.h0;
        of7.b(str, new sn(b71Var, nm4Var, str, (byte) 15));
        return dn8.a;
    }
}
