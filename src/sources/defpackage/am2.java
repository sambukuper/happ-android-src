package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class am2 {
    public static final zl2 a = zl2.a;

    public static zl2 a(qk2 qk2Var) {
        while (qk2Var != null) {
            if (qk2Var.s()) {
                qk2Var.n();
            }
            qk2Var = qk2Var.y0;
        }
        return a;
    }

    public static void b(ky8 ky8Var) {
        if (ml2.K(3)) {
            ky8Var.X.getClass();
        }
    }

    public static final void c(qk2 qk2Var, String str) {
        str.getClass();
        b(new sl2(qk2Var, "Attempting to reuse fragment " + qk2Var + " with previous ID " + str));
        a(qk2Var).getClass();
    }
}
