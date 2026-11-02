package defpackage;

import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class on4 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ b71 Y;
    public final /* synthetic */ MainViewModel Z;
    public final /* synthetic */ String f0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ on4(b71 b71Var, MainViewModel mainViewModel, String str, byte b) {
        this.X = b;
        this.Y = b71Var;
        this.Z = mainViewModel;
        this.f0 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        b71 b71Var = this.Y;
        long jLongValue = ((Long) obj).longValue();
        switch (b) {
            case 0:
                nf1 nf1Var = tp1.a;
                jm4.Q(b71Var, dm4.a, new pn4(this.Z, this.f0, jLongValue, null, (byte) 0), 2);
                break;
            default:
                nf1 nf1Var2 = tp1.a;
                jm4.Q(b71Var, dm4.a, new pn4(this.Z, this.f0, jLongValue, null, (byte) 1), 2);
                break;
        }
        return dn8Var;
    }
}
