package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yr8 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ g09 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ g09 f0;

    public /* synthetic */ yr8(g09 g09Var, boolean z, g09 g09Var2, byte b) {
        this.X = b;
        this.Y = g09Var;
        this.Z = z;
        this.f0 = g09Var2;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        g09 g09Var = this.f0;
        boolean z = this.Z;
        g09 g09Var2 = this.Y;
        wr8 wr8Var = (wr8) obj;
        switch (b) {
            case 0:
                wr8Var.getClass();
                wr8.p(wr8Var);
                zr8.a(wr8Var, g09Var2, new zs1(z, g09Var, (byte) 6));
                break;
            default:
                wr8Var.getClass();
                z68.i(wr8Var, new gn2[]{new b58((byte) 20)}, new yr8(g09Var2, z, g09Var, (byte) 0));
                break;
        }
        return dn8Var;
    }
}
