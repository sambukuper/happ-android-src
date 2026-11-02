package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a92 implements f72 {
    @Override // defpackage.f72
    public final int a() {
        return 3;
    }

    @Override // defpackage.f72
    public final int b(jd0 jd0Var, jd0 jd0Var2, sx4 sx4Var) {
        jd0Var.getClass();
        jd0Var2.getClass();
        if (!(jd0Var2 instanceof fx5) || !(jd0Var instanceof fx5)) {
            return 3;
        }
        fx5 fx5Var = (fx5) jd0Var2;
        fx5 fx5Var2 = (fx5) jd0Var;
        if (!dh3.f(fx5Var.getName(), fx5Var2.getName())) {
            return 3;
        }
        if (vj8.V(fx5Var) && vj8.V(fx5Var2)) {
            return 1;
        }
        return (vj8.V(fx5Var) || vj8.V(fx5Var2)) ? 2 : 3;
    }
}
