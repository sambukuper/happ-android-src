package defpackage;

import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class oo4 extends uy7 implements rn2 {
    public boolean g0;
    public final /* synthetic */ MainViewModel h0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo4(MainViewModel mainViewModel, q51 q51Var) {
        super(2, q51Var);
        this.h0 = mainViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new oo4(this.h0, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        boolean z = this.g0;
        if (!z) {
            w39.n0(obj);
            MainViewModel mainViewModel = this.h0;
            va1 va1Var = new va1(new sf2((mh7) ((mn6) mainViewModel.l.getValue()).h.getValue(), new ko4(2, null), (byte) 0), (byte) 1);
            nw2 nw2Var = new nw2((byte) 3);
            zx6 zx6Var = w51.l;
            ci8.i(2, nw2Var);
            xe2 xe2VarH = zc1.H(new qg2(w51.u(va1Var, zx6Var, nw2Var), new j31(new er2(2, null, (byte) 1), (byte) 7), new lo4(3, (q51) null), (byte) 0), tp1.a);
            yn4 yn4Var = new yn4(mainViewModel, null, (byte) 1);
            this.g0 = true;
            Object objN = z91.n(xe2VarH, yn4Var, this);
            c71 c71Var = c71.X;
            if (objN == c71Var) {
                return c71Var;
            }
        } else {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8.a;
    }
}
