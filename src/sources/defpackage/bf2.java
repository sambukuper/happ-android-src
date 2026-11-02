package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bf2 implements ze2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ hv5 Y;

    public /* synthetic */ bf2(hv5 hv5Var, byte b) {
        this.X = b;
        this.Y = hv5Var;
    }

    @Override // defpackage.ze2
    public final Object l(Object obj, q51 q51Var) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        hv5 hv5Var = this.Y;
        switch (b) {
            case 0:
                hv5Var.setValue(obj);
                break;
            default:
                hv5Var.setValue(obj);
                break;
        }
        return dn8Var;
    }
}
