package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class pm6 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ gn2 Y;
    public final /* synthetic */ String Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ pm6(gn2 gn2Var, String str, byte b) {
        this.X = b;
        this.Y = gn2Var;
        this.Z = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        String str = this.Z;
        gn2 gn2Var = this.Y;
        switch (b) {
            case 0:
                str.getClass();
                gn2Var.B(new uo7(str));
                break;
            default:
                str.getClass();
                gn2Var.B(new so7(str));
                break;
        }
        return dn8Var;
    }
}
