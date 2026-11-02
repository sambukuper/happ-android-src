package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class jg4 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ lg4 Y;
    public final /* synthetic */ oh2 Z;
    public final /* synthetic */ oh2 f0;
    public final /* synthetic */ boolean g0;
    public final /* synthetic */ gn2 h0;
    public final /* synthetic */ y05 i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ jg4(lg4 lg4Var, oh2 oh2Var, oh2 oh2Var2, boolean z, gn2 gn2Var, y05 y05Var, byte b) {
        this.X = b;
        this.Y = lg4Var;
        this.Z = oh2Var;
        this.f0 = oh2Var2;
        this.g0 = z;
        this.h0 = gn2Var;
        this.i0 = y05Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        y05 y05Var = this.i0;
        gn2 gn2Var = this.h0;
        boolean z = this.g0;
        oh2 oh2Var = this.f0;
        oh2 oh2Var2 = this.Z;
        lg4 lg4Var = this.Y;
        switch (b) {
            case 0:
                if (lg4Var.c > 1) {
                    oh2Var = oh2Var2;
                }
                if (z) {
                    y05Var.setValue(oh2Var);
                }
                gn2Var.B(ch4.a);
                break;
            default:
                if (lg4Var.c < lg4Var.f - 2) {
                    oh2Var = oh2Var2;
                }
                if (z) {
                    y05Var.setValue(oh2Var);
                }
                gn2Var.B(bh4.a);
                break;
        }
        return dn8Var;
    }
}
