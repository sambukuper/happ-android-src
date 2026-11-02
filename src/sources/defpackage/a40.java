package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a40 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ b88 Y;
    public final /* synthetic */ gn2 Z;

    public /* synthetic */ a40(b88 b88Var, gn2 gn2Var, byte b) {
        this.X = b;
        this.Y = b88Var;
        this.Z = gn2Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        gn2 gn2Var = this.Z;
        b88 b88Var = this.Y;
        switch (b) {
            case 0:
                x78 x78Var = (x78) obj;
                if (b88Var != null) {
                    b88Var.a.setValue(x78Var);
                }
                if (gn2Var != null) {
                    gn2Var.B(x78Var);
                }
                return dn8.a;
            default:
                b88Var.c.add(gn2Var);
                return new p00(b88Var, gn2Var, (byte) 4);
        }
    }
}
