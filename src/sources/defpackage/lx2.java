package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lx2 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ gn2 Y;
    public final /* synthetic */ int Z;

    public /* synthetic */ lx2(gn2 gn2Var, int i, byte b) {
        this.X = b;
        this.Y = gn2Var;
        this.Z = i;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        int i = this.Z;
        gn2 gn2Var = this.Y;
        switch (b) {
            case 0:
                gn2Var.B(Integer.valueOf(i));
                break;
            case 1:
                gn2Var.B(new ro6(i));
                break;
            default:
                gn2Var.B(new it7(i));
                break;
        }
        return dn8Var;
    }
}
