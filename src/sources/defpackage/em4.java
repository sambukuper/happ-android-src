package defpackage;

import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class em4 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ MainViewModel Y;

    public /* synthetic */ em4(MainViewModel mainViewModel, byte b) {
        this.X = b;
        this.Y = mainViewModel;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        rs4 rs4Var;
        byte b = this.X;
        MainViewModel mainViewModel = this.Y;
        switch (b) {
            case 0:
                mainViewModel.x(false);
                return dn8.a;
            case 1:
                yz4 yz4VarM = mainViewModel.m();
                uh3 uh3Var = new uh3((byte) 25);
                yz4VarM.getClass();
                if (yz4VarM.e != qc4.k) {
                    rs4Var = new rs4(uh3Var.B(yz4VarM.d()));
                    rs4Var.l = new yu6();
                } else {
                    rs4Var = new rs4();
                    rs4Var.l = new yu6();
                }
                bm4 bm4Var = new bm4(new gq6(rs4Var, uh3Var, (byte) 16), (byte) 3);
                qs4 qs4Var = new qs4(yz4VarM, bm4Var);
                qs4 qs4Var2 = (qs4) rs4Var.l.a(yz4VarM, qs4Var);
                if (qs4Var2 != null && qs4Var2.b != bm4Var) {
                    bt.q("This source was already added with the different observer");
                    return null;
                }
                if (qs4Var2 != null || rs4Var.c <= 0) {
                    return rs4Var;
                }
                yz4VarM.f(qs4Var);
                return rs4Var;
            default:
                return ((ig8) mainViewModel.i.getValue()).c;
        }
    }
}
