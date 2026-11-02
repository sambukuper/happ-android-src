package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zi7 extends au {
    static {
        dj7.a(Integer.TYPE);
    }

    @Override // defpackage.ar3
    public final boolean c(t37 t37Var, Object obj) {
        return ((int[]) obj).length == 0;
    }

    @Override // defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) {
        int[] iArr = (int[]) obj;
        int i = 0;
        if (iArr.length == 1 && p(t37Var)) {
            int length = iArr.length;
            while (i < length) {
                ro3Var.c0(iArr[i]);
                i++;
            }
            return;
        }
        int length2 = iArr.length;
        int length3 = iArr.length;
        ro3Var.getClass();
        ro3.k(length3, length2);
        ro3Var.V0(iArr);
        while (i < length2) {
            ro3Var.c0(iArr[i]);
            i++;
        }
        ro3Var.D();
    }

    @Override // defpackage.au
    public final ar3 q(d50 d50Var, Boolean bool) {
        return new zi7(this, d50Var, bool);
    }

    @Override // defpackage.au
    public final void r(Object obj, ro3 ro3Var, t37 t37Var) {
        for (int i : (int[]) obj) {
            ro3Var.c0(i);
        }
    }

    @Override // defpackage.e41
    public final e41 o(ri8 ri8Var) {
        return this;
    }
}
