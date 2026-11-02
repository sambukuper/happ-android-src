package defpackage;

import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class qn4 extends uy7 implements rn2 {
    public /* synthetic */ Object g0;
    public final /* synthetic */ String h0;
    public final /* synthetic */ MainViewModel i0;
    public final /* synthetic */ String j0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn4(q51 q51Var, String str, String str2, MainViewModel mainViewModel) {
        super(2, q51Var);
        this.h0 = str;
        this.i0 = mainViewModel;
        this.j0 = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        qn4 qn4VarN = n((q51) obj2, (b71) obj);
        dn8 dn8Var = dn8.a;
        qn4VarN.q(dn8Var);
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        MainViewModel mainViewModel = this.i0;
        qn4 qn4Var = new qn4(q51Var, this.h0, this.j0, mainViewModel);
        qn4Var.g0 = obj;
        return qn4Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        b71 b71Var = (b71) this.g0;
        w39.n0(obj);
        of7 of7Var = of7.a;
        of7.b(this.h0, new on4(b71Var, this.i0, this.j0, (byte) 0));
        return dn8.a;
    }
}
