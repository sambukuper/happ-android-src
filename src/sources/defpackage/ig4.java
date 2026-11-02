package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class ig4 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ oh2 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ gn2 f0;
    public final /* synthetic */ y05 g0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ig4(oh2 oh2Var, boolean z, gn2 gn2Var, y05 y05Var, byte b) {
        this.X = b;
        this.Y = oh2Var;
        this.Z = z;
        this.f0 = gn2Var;
        this.g0 = y05Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        y05 y05Var = this.g0;
        gn2 gn2Var = this.f0;
        boolean z = this.Z;
        oh2 oh2Var = this.Y;
        switch (b) {
            case 0:
                if (z) {
                    y05Var.setValue(oh2Var);
                }
                gn2Var.B(yg4.a);
                break;
            default:
                if (z) {
                    y05Var.setValue(oh2Var);
                }
                gn2Var.B(zg4.a);
                break;
        }
        return dn8Var;
    }
}
