package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ad implements rn2 {
    public final /* synthetic */ byte X = 0;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ad(kx4 kx4Var, int i, int i2) {
        this.Z = kx4Var;
        this.Y = i2;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Object obj3 = this.Z;
        boolean z = this.Y;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                dd.b((kx4) obj3, (lp2) obj, w79.P(1), z ? 1 : 0);
                break;
            default:
                ((Integer) obj2).getClass();
                hi5.F(z, (dn2) obj3, (lp2) obj, w79.P(1));
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ ad(boolean z, dn2 dn2Var, int i) {
        this.Y = z;
        this.Z = dn2Var;
    }
}
