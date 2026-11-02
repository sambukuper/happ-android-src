package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lc3 implements lh7 {
    public Float X;
    public Float Y;
    public final rh5 Z;
    public t18 f0;
    public boolean g0;
    public boolean h0;
    public long i0;
    public final /* synthetic */ nc3 j0;

    public lc3(nc3 nc3Var, Float f, Float f2, kc3 kc3Var) {
        this.j0 = nc3Var;
        this.X = f;
        this.Y = f2;
        this.Z = z51.H(f);
        this.f0 = new t18(kc3Var, ys0.j0, this.X, this.Y, null);
    }

    @Override // defpackage.lh7
    public final Object getValue() {
        return this.Z.getValue();
    }
}
