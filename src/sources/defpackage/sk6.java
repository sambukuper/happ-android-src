package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sk6 implements ts1 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ wk6 Y;

    public /* synthetic */ sk6(wk6 wk6Var, byte b) {
        this.X = b;
        this.Y = wk6Var;
    }

    @Override // defpackage.ts1
    public final double a(double d) {
        byte b = this.X;
        wk6 wk6Var = this.Y;
        switch (b) {
            case 0:
                return x97.l(wk6Var.k.a(d), wk6Var.e, wk6Var.f);
            default:
                return wk6Var.n.a(x97.l(d, wk6Var.e, wk6Var.f));
        }
    }
}
