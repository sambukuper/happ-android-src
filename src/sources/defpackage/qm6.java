package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qm6 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ gn2 Y;
    public final /* synthetic */ um6 Z;

    public /* synthetic */ qm6(gn2 gn2Var, um6 um6Var, byte b) {
        this.X = b;
        this.Y = gn2Var;
        this.Z = um6Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        um6 um6Var = this.Z;
        gn2 gn2Var = this.Y;
        switch (b) {
            case 0:
                String str = um6Var.c;
                str.getClass();
                gn2Var.B(new ro7(str));
                break;
            case 1:
                String str2 = um6Var.c;
                str2.getClass();
                gn2Var.B(new vo7(str2));
                break;
            default:
                String str3 = um6Var.c;
                str3.getClass();
                gn2Var.B(new uo7(str3));
                break;
        }
        return dn8Var;
    }
}
