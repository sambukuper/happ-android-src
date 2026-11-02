package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wi7 extends au {
    static {
        dj7.a(Boolean.TYPE);
    }

    @Override // defpackage.ar3
    public final boolean c(t37 t37Var, Object obj) {
        return ((boolean[]) obj).length == 0;
    }

    @Override // defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) {
        boolean[] zArr = (boolean[]) obj;
        int i = 0;
        if (zArr.length == 1 && p(t37Var)) {
            int length = zArr.length;
            while (i < length) {
                ro3Var.C(zArr[i]);
                i++;
            }
            return;
        }
        ro3Var.V0(zArr);
        int length2 = zArr.length;
        while (i < length2) {
            ro3Var.C(zArr[i]);
            i++;
        }
        ro3Var.D();
    }
}
