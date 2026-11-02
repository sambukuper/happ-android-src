package defpackage;

import su.happ.proxyutility.ui.ScannerActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tw6 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ScannerActivity Y;

    public /* synthetic */ tw6(ScannerActivity scannerActivity, byte b) {
        this.X = b;
        this.Y = scannerActivity;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        ScannerActivity scannerActivity = this.Y;
        switch (b) {
            case 0:
                int i = ScannerActivity.T0;
                scannerActivity.finish();
                break;
            default:
                r6 r6Var = scannerActivity.S0;
                c4.g();
                pz2 pz2Var = pz2.Y;
                c4.g();
                ym5 ym5Var = new ym5();
                ym5Var.a = k6.a;
                c4.g();
                ym5Var.a = l6.a;
                ym5Var.b = pz2Var;
                r6Var.h0(ym5Var);
                break;
        }
        return dn8Var;
    }
}
