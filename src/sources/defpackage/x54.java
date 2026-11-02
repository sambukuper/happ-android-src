package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x54 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ xt2 Y;
    public final /* synthetic */ z54 Z;

    public /* synthetic */ x54(xt2 xt2Var, z54 z54Var, byte b) {
        this.X = b;
        this.Y = xt2Var;
        this.Z = z54Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        z54 z54Var = this.Z;
        xt2 xt2Var = this.Y;
        oi oiVar = (oi) obj;
        switch (b) {
            case 0:
                xt2Var.f(((Number) oiVar.d()).floatValue());
                z54Var.c.invoke();
                break;
            default:
                xt2Var.f(((Number) oiVar.d()).floatValue());
                z54Var.c.invoke();
                break;
        }
        return dn8Var;
    }
}
