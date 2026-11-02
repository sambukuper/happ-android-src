package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qs1 extends yt5 {
    public static final qs1 c = new qs1(us1.a);

    @Override // defpackage.a1
    public final int h(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.tv0, defpackage.a1
    public final void j(f01 f01Var, int i, Object obj) {
        ps1 ps1Var = (ps1) obj;
        ps1Var.getClass();
        double dF = f01Var.f(this.b, i);
        ps1Var.b(ps1Var.d() + 1);
        double[] dArr = ps1Var.a;
        int i2 = ps1Var.b;
        ps1Var.b = i2 + 1;
        dArr[i2] = dF;
    }

    @Override // defpackage.a1
    public final Object k(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        ps1 ps1Var = new ps1();
        ps1Var.a = dArr;
        ps1Var.b = dArr.length;
        ps1Var.b(10);
        return ps1Var;
    }

    @Override // defpackage.yt5
    public final Object n() {
        return new double[0];
    }

    @Override // defpackage.yt5
    public final void o(ol7 ol7Var, Object obj, int i) {
        double[] dArr = (double[]) obj;
        ol7Var.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            double d = dArr[i2];
            ol7Var.g(this.b, i2);
            ol7Var.f(d);
        }
    }
}
