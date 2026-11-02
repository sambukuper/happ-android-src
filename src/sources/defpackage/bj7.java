package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bj7 extends cj7 {
    static {
        dj7.a(Short.TYPE);
    }

    @Override // defpackage.ar3
    public final boolean c(t37 t37Var, Object obj) {
        return ((short[]) obj).length == 0;
    }

    @Override // defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) {
        short[] sArr = (short[]) obj;
        int i = 0;
        if (sArr.length == 1 && p(t37Var)) {
            int length = sArr.length;
            while (i < length) {
                ro3Var.c0(sArr[i]);
                i++;
            }
            return;
        }
        ro3Var.V0(sArr);
        int length2 = sArr.length;
        while (i < length2) {
            ro3Var.c0(sArr[i]);
            i++;
        }
        ro3Var.D();
    }

    @Override // defpackage.au
    public final ar3 q(d50 d50Var, Boolean bool) {
        return new bj7(this, d50Var, bool);
    }

    @Override // defpackage.au
    public final void r(Object obj, ro3 ro3Var, t37 t37Var) {
        for (short s : (short[]) obj) {
            ro3Var.c0(s);
        }
    }
}
