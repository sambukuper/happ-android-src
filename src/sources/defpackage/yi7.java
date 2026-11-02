package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yi7 extends cj7 {
    public static final yi7 g0;

    static {
        dj7.a(Float.TYPE);
        g0 = new yi7();
    }

    public yi7() {
        super(float[].class);
    }

    @Override // defpackage.au, defpackage.p51
    public final ar3 a(t37 t37Var, d50 d50Var) {
        no3 no3VarK = lj7.k(t37Var, d50Var, this.X);
        return (no3VarK == null || no3VarK.Y != mo3.X) ? super.a(t37Var, d50Var) : vi7.g0;
    }

    @Override // defpackage.ar3
    public final boolean c(t37 t37Var, Object obj) {
        return ((float[]) obj).length == 0;
    }

    @Override // defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) {
        float[] fArr = (float[]) obj;
        int i = 0;
        if (fArr.length == 1 && p(t37Var)) {
            int length = fArr.length;
            while (i < length) {
                ro3Var.a0(fArr[i]);
                i++;
            }
            return;
        }
        ro3Var.V0(fArr);
        int length2 = fArr.length;
        while (i < length2) {
            ro3Var.a0(fArr[i]);
            i++;
        }
        ro3Var.D();
    }

    @Override // defpackage.au
    public final ar3 q(d50 d50Var, Boolean bool) {
        return new yi7(this, d50Var, bool);
    }

    @Override // defpackage.au
    public final void r(Object obj, ro3 ro3Var, t37 t37Var) {
        for (float f : (float[]) obj) {
            ro3Var.a0(f);
        }
    }
}
