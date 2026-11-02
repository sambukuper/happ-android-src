package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q73 implements gn2 {
    public final /* synthetic */ String X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ boolean Z;

    public /* synthetic */ q73(int i, String str, boolean z) {
        this.X = str;
        this.Y = i;
        this.Z = z;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        g48 g48Var = (g48) obj;
        f88 f88Var = g48Var.j0;
        String str = this.X;
        if (f88Var != null) {
            long j = f88Var.a;
            w79.E(g48Var, (int) (j >> 32), (int) (j & 4294967295L), str);
        } else {
            w79.E(g48Var, f88.d(g48Var.i0), f88.c(g48Var.i0), str);
        }
        int iD = f88.d(g48Var.i0);
        int i = this.Y;
        int length = i > 0 ? (iD + i) - 1 : (iD + i) - str.length();
        g48Var.g0 = this.Z;
        int iN = x97.n(length, 0, g48Var.Z.length());
        g48Var.g(ct7.c(iN, iN));
        return dn8.a;
    }
}
