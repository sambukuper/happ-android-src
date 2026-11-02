package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p73 implements gn2 {
    public final /* synthetic */ String X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ boolean f0;

    public /* synthetic */ p73(String str, List list, int i, boolean z) {
        this.X = str;
        this.Y = list;
        this.Z = i;
        this.f0 = z;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        g48 g48Var = (g48) obj;
        f88 f88Var = g48Var.j0;
        String str = this.X;
        List list = this.Y;
        if (f88Var != null) {
            long j = f88Var.a;
            int i = (int) (j >> 32);
            w79.E(g48Var, i, (int) (j & 4294967295L), str);
            if (str.length() > 0) {
                g48Var.e(i, str.length() + i, list);
            }
        } else {
            int iD = f88.d(g48Var.i0);
            w79.E(g48Var, iD, f88.c(g48Var.i0), str);
            if (str.length() > 0) {
                g48Var.e(iD, str.length() + iD, list);
            }
        }
        int iD2 = f88.d(g48Var.i0);
        int i2 = this.Z;
        int length = i2 > 0 ? (iD2 + i2) - 1 : (iD2 + i2) - str.length();
        g48Var.g0 = this.f0;
        int iN = x97.n(length, 0, g48Var.Z.length());
        g48Var.g(ct7.c(iN, iN));
        return dn8.a;
    }
}
