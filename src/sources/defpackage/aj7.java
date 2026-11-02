package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class aj7 extends cj7 {
    static {
        dj7.a(Long.TYPE);
    }

    @Override // defpackage.ar3
    public final boolean c(t37 t37Var, Object obj) {
        return ((long[]) obj).length == 0;
    }

    @Override // defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) {
        long[] jArr = (long[]) obj;
        int i = 0;
        if (jArr.length == 1 && p(t37Var)) {
            int length = jArr.length;
            while (i < length) {
                ro3Var.u0(jArr[i]);
                i++;
            }
            return;
        }
        int length2 = jArr.length;
        int length3 = jArr.length;
        ro3Var.getClass();
        ro3.k(length3, length2);
        ro3Var.V0(jArr);
        while (i < length2) {
            ro3Var.u0(jArr[i]);
            i++;
        }
        ro3Var.D();
    }

    @Override // defpackage.au
    public final ar3 q(d50 d50Var, Boolean bool) {
        return new aj7(this, d50Var, bool);
    }

    @Override // defpackage.au
    public final void r(Object obj, ro3 ro3Var, t37 t37Var) {
        for (long j : (long[]) obj) {
            ro3Var.u0(j);
        }
    }
}
