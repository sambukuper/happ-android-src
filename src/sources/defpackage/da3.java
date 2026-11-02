package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class da3 implements dn2 {
    public final /* synthetic */ byte X = 1;
    public final /* synthetic */ gn2 Y;
    public final /* synthetic */ boolean Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ da3(gn2 gn2Var, boolean z) {
        this.Y = gn2Var;
        this.Z = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        boolean z = this.Z;
        gn2 gn2Var = this.Y;
        switch (b) {
            case 0:
                if (!z) {
                    gn2Var.B(ta3.a);
                } else {
                    gn2Var.B(ua3.a);
                }
                break;
            default:
                gn2Var.B(Boolean.valueOf(!z));
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ da3(boolean z, gn2 gn2Var) {
        this.Z = z;
        this.Y = gn2Var;
    }
}
