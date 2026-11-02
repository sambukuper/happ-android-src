package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f68 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ da6 Y;
    public final /* synthetic */ da6 Z;
    public final /* synthetic */ r68 f0;

    public /* synthetic */ f68(da6 da6Var, da6 da6Var2, r68 r68Var, byte b) {
        this.X = b;
        this.Y = da6Var;
        this.Z = da6Var2;
        this.f0 = r68Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        da6 da6Var = this.Z;
        r68 r68Var = this.f0;
        da6 da6Var2 = this.Y;
        switch (b) {
            case 0:
                r68.h(da6Var2, da6Var, r68Var);
                break;
            case 1:
                r68.f(da6Var2, da6Var, r68Var);
                break;
            case 2:
                r68.f(da6Var2, da6Var, r68Var);
                break;
            default:
                r68.h(da6Var2, da6Var, r68Var);
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ f68(da6 da6Var, r68 r68Var, da6 da6Var2, byte b) {
        this.X = b;
        this.Y = da6Var;
        this.f0 = r68Var;
        this.Z = da6Var2;
    }
}
