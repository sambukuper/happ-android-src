package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v64 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ w64 Y;

    public /* synthetic */ v64(w64 w64Var, byte b) {
        this.X = b;
        this.Y = w64Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        w64 w64Var = this.Y;
        switch (b) {
            case 0:
                j74 j74Var = w64Var.r0.b;
                return Float.valueOf((j74Var.c() * 500) + ((oh5) j74Var.g0.c).l());
            case 1:
                j74 j74Var2 = w64Var.r0.b;
                int iC = j74Var2.c();
                int iL = ((oh5) j74Var2.g0.c).l();
                return Float.valueOf(j74Var2.m() ? (iC * 500) + iL + 100.0f : (iC * 500) + iL);
            default:
                j74 j74Var3 = w64Var.r0.b;
                int i = (int) (j74Var3.d().p == sd5.X ? j74Var3.d().i() & 4294967295L : j74Var3.d().i() >> 32);
                j74 j74Var4 = w64Var.r0.b;
                return Float.valueOf(i - ((-j74Var4.d().m) + j74Var4.d().q));
        }
    }
}
