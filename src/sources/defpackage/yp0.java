package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yp0 extends yt5 {
    public static final yp0 c = new yp0(dq0.a);

    @Override // defpackage.a1
    public final int h(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.tv0, defpackage.a1
    public final void j(f01 f01Var, int i, Object obj) {
        wp0 wp0Var = (wp0) obj;
        wp0Var.getClass();
        char cG = f01Var.g(this.b, i);
        wp0Var.b(wp0Var.d() + 1);
        char[] cArr = wp0Var.a;
        int i2 = wp0Var.b;
        wp0Var.b = i2 + 1;
        cArr[i2] = cG;
    }

    @Override // defpackage.a1
    public final Object k(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        wp0 wp0Var = new wp0();
        wp0Var.a = cArr;
        wp0Var.b = cArr.length;
        wp0Var.b(10);
        return wp0Var;
    }

    @Override // defpackage.yt5
    public final Object n() {
        return new char[0];
    }

    @Override // defpackage.yt5
    public final void o(ol7 ol7Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        ol7Var.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            char c2 = cArr[i2];
            ol7Var.g(this.b, i2);
            ol7Var.e(c2);
        }
    }
}
