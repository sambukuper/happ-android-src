package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xi7 extends au {
    public static final xi7 g0;

    static {
        dj7.a(Double.TYPE);
        g0 = new xi7();
    }

    public xi7() {
        super(double[].class);
    }

    @Override // defpackage.au, defpackage.p51
    public final ar3 a(t37 t37Var, d50 d50Var) {
        no3 no3VarK = lj7.k(t37Var, d50Var, this.X);
        return (no3VarK == null || no3VarK.Y != mo3.X) ? super.a(t37Var, d50Var) : vi7.f0;
    }

    @Override // defpackage.ar3
    public final boolean c(t37 t37Var, Object obj) {
        return ((double[]) obj).length == 0;
    }

    @Override // defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) {
        double[] dArr = (double[]) obj;
        int i = 0;
        if (dArr.length == 1 && p(t37Var)) {
            int length = dArr.length;
            while (i < length) {
                ro3Var.Y(dArr[i]);
                i++;
            }
            return;
        }
        int length2 = dArr.length;
        int length3 = dArr.length;
        ro3Var.getClass();
        ro3.k(length3, length2);
        ro3Var.V0(dArr);
        while (i < length2) {
            ro3Var.Y(dArr[i]);
            i++;
        }
        ro3Var.D();
    }

    @Override // defpackage.au
    public final ar3 q(d50 d50Var, Boolean bool) {
        return new xi7(this, d50Var, bool);
    }

    @Override // defpackage.au
    public final void r(Object obj, ro3 ro3Var, t37 t37Var) {
        for (double d : (double[]) obj) {
            ro3Var.Y(d);
        }
    }

    @Override // defpackage.e41
    public final e41 o(ri8 ri8Var) {
        return this;
    }
}
