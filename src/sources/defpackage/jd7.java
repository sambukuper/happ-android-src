package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jd7 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ gn2 Y;
    public final /* synthetic */ gn2 Z;

    public /* synthetic */ jd7(gn2 gn2Var, gn2 gn2Var2, byte b) {
        this.X = b;
        this.Y = gn2Var;
        this.Z = gn2Var2;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        gn2 gn2Var = this.Z;
        gn2 gn2Var2 = this.Y;
        switch (b) {
            case 0:
                gn2Var2.B(obj);
                gn2Var.B(obj);
                break;
            default:
                gn2Var2.B(obj);
                gn2Var.B(obj);
                break;
        }
        return dn8Var;
    }
}
