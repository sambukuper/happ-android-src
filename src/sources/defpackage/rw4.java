package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rw4 implements dn2 {
    public final /* synthetic */ byte X = 0;
    public final /* synthetic */ o87 Y;
    public final /* synthetic */ dn2 Z;
    public final /* synthetic */ b71 f0;

    public /* synthetic */ rw4(o87 o87Var, b71 b71Var, dn2 dn2Var) {
        this.Y = o87Var;
        this.f0 = b71Var;
        this.Z = dn2Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        q51 q51Var = null;
        b71 b71Var = this.f0;
        dn2 dn2Var = this.Z;
        o87 o87Var = this.Y;
        byte b2 = 3;
        switch (b) {
            case 0:
                if (((Boolean) ((gn2) o87Var.d.f0).B(p87.X)).booleanValue()) {
                    w51.G(b71Var, null, null, new uw4(o87Var, q51Var, b2), 3).D(new tw4(o87Var, dn2Var, (byte) 0));
                }
                break;
            default:
                int iOrdinal = ((p87) ((rh5) o87Var.d.i0).getValue()).ordinal();
                if (iOrdinal == 1) {
                    dn2Var.invoke();
                } else if (iOrdinal == 2) {
                    w51.G(b71Var, null, null, new uw4(o87Var, q51Var, (byte) 4), 3);
                } else {
                    w51.G(b71Var, null, null, new uw4(o87Var, q51Var, (byte) 5), 3);
                }
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ rw4(o87 o87Var, dn2 dn2Var, b71 b71Var) {
        this.Y = o87Var;
        this.Z = dn2Var;
        this.f0 = b71Var;
    }
}
