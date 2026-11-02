package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gd implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ oo1 Y;

    public /* synthetic */ gd(oo1 oo1Var, byte b) {
        this.X = b;
        this.Y = oo1Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        oo1 oo1Var = this.Y;
        switch (b) {
            case 0:
                oo1Var.show();
                return new jd(oo1Var, (byte) 0);
            default:
                if (oo1Var.h0.a) {
                    oo1Var.g0.invoke();
                }
                return dn8.a;
        }
    }
}
