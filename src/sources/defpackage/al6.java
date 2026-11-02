package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class al6 extends s1 {
    public int Z;
    public int f0;
    public final /* synthetic */ bl6 g0;

    public al6(bl6 bl6Var) {
        this.g0 = bl6Var;
        this.Z = bl6Var.f0;
        this.f0 = bl6Var.Z;
    }

    @Override // defpackage.s1
    public final void a() {
        int i = this.Z;
        if (i == 0) {
            this.X = (byte) 2;
            return;
        }
        bl6 bl6Var = this.g0;
        Object[] objArr = bl6Var.X;
        int i2 = this.f0;
        this.Y = objArr[i2];
        this.X = (byte) 1;
        this.f0 = (i2 + 1) % bl6Var.Y;
        this.Z = i - 1;
    }
}
