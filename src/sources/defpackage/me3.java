package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class me3 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ eo5 Z;
    public final /* synthetic */ int f0;

    public /* synthetic */ me3(int i, eo5 eo5Var, int i2) {
        this.X = (byte) 1;
        this.Y = i;
        this.Z = eo5Var;
        this.f0 = i2;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        int i = this.f0;
        int i2 = this.Y;
        eo5 eo5Var = this.Z;
        do5 do5Var = (do5) obj;
        switch (b) {
            case 0:
                do5.f(do5Var, eo5Var, i2, i);
                break;
            case 1:
                do5.f(do5Var, eo5Var, nr4.O((i2 - eo5Var.X) / 2.0f), nr4.O((i - eo5Var.Y) / 2.0f));
                break;
            default:
                do5.f(do5Var, eo5Var, i2, i);
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ me3(eo5 eo5Var, int i, int i2, byte b) {
        this.X = b;
        this.Z = eo5Var;
        this.Y = i;
        this.f0 = i2;
    }
}
