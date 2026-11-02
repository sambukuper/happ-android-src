package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ei4 extends yt5 {
    public static final ei4 c = new ei4(oi4.a);

    @Override // defpackage.a1
    public final int h(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.tv0, defpackage.a1
    public final void j(f01 f01Var, int i, Object obj) {
        di4 di4Var = (di4) obj;
        di4Var.getClass();
        long jD = f01Var.D(this.b, i);
        di4Var.b(di4Var.d() + 1);
        long[] jArr = di4Var.a;
        int i2 = di4Var.b;
        di4Var.b = i2 + 1;
        jArr[i2] = jD;
    }

    @Override // defpackage.a1
    public final Object k(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        di4 di4Var = new di4();
        di4Var.a = jArr;
        di4Var.b = jArr.length;
        di4Var.b(10);
        return di4Var;
    }

    @Override // defpackage.yt5
    public final Object n() {
        return new long[0];
    }

    @Override // defpackage.yt5
    public final void o(ol7 ol7Var, Object obj, int i) {
        long[] jArr = (long[]) obj;
        ol7Var.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ol7Var.n(this.b, i2, jArr[i2]);
        }
    }
}
