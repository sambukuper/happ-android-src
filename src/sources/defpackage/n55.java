package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class n55 {
    public final c15 a = new c15(0, new c55[16]);
    public final j05 b = new j05(10);

    public boolean a(qi4 qi4Var, y24 y24Var, zz2 zz2Var, boolean z) {
        c15 c15Var = this.a;
        Object[] objArr = c15Var.X;
        int i = c15Var.Z;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((c55) objArr[i2]).a(qi4Var, y24Var, zz2Var, z) || z2;
        }
        return z2;
    }

    public void b(zz2 zz2Var) {
        c15 c15Var = this.a;
        int i = c15Var.Z;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((c55) c15Var.X[i]).d.b == 0) {
                c15Var.k(i);
            }
        }
    }
}
