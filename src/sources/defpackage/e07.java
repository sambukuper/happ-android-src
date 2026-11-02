package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e07 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ i68 Y;

    public /* synthetic */ e07(i68 i68Var, byte b) {
        this.X = b;
        this.Y = i68Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        i68 i68Var = this.Y;
        hq5 hq5Var = (hq5) obj;
        switch (b) {
            case 0:
                i68Var.b(vr3.S(hq5Var, false));
                hq5Var.a();
                break;
            default:
                i68Var.b(vr3.S(hq5Var, false));
                hq5Var.a();
                break;
        }
        return dn8Var;
    }
}
