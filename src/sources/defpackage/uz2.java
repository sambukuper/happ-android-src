package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uz2 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ vz2 Y;

    public /* synthetic */ uz2(vz2 vz2Var, byte b) {
        this.X = b;
        this.Y = vz2Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        vz2 vz2Var = this.Y;
        switch (b) {
            case 0:
                if (vz2Var.x0 != null) {
                    return dn8Var;
                }
                throw ie2.d("Font resolution state is not set.");
            default:
                if (vz2Var.x0 != null) {
                    return dn8Var;
                }
                throw ie2.d("Font resolution state is not set.");
        }
    }
}
