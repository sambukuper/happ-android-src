package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bf3 extends yt5 {
    public static final bf3 c = new bf3(nf3.a);

    @Override // defpackage.a1
    public final int h(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.tv0, defpackage.a1
    public final void j(f01 f01Var, int i, Object obj) {
        af3 af3Var = (af3) obj;
        af3Var.getClass();
        int iR = f01Var.r(this.b, i);
        af3Var.b(af3Var.d() + 1);
        int[] iArr = af3Var.a;
        int i2 = af3Var.b;
        af3Var.b = i2 + 1;
        iArr[i2] = iR;
    }

    @Override // defpackage.a1
    public final Object k(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        af3 af3Var = new af3();
        af3Var.a = iArr;
        af3Var.b = iArr.length;
        af3Var.b(10);
        return af3Var;
    }

    @Override // defpackage.yt5
    public final Object n() {
        return new int[0];
    }

    @Override // defpackage.yt5
    public final void o(ol7 ol7Var, Object obj, int i) {
        int[] iArr = (int[]) obj;
        ol7Var.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ol7Var.l(i2, iArr[i2], this.b);
        }
    }
}
