package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pe2 extends yt5 {
    public static final pe2 c = new pe2(se2.a);

    @Override // defpackage.a1
    public final int h(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.tv0, defpackage.a1
    public final void j(f01 f01Var, int i, Object obj) {
        oe2 oe2Var = (oe2) obj;
        oe2Var.getClass();
        float fH = f01Var.h(this.b, i);
        oe2Var.b(oe2Var.d() + 1);
        float[] fArr = oe2Var.a;
        int i2 = oe2Var.b;
        oe2Var.b = i2 + 1;
        fArr[i2] = fH;
    }

    @Override // defpackage.a1
    public final Object k(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        oe2 oe2Var = new oe2();
        oe2Var.a = fArr;
        oe2Var.b = fArr.length;
        oe2Var.b(10);
        return oe2Var;
    }

    @Override // defpackage.yt5
    public final Object n() {
        return new float[0];
    }

    @Override // defpackage.yt5
    public final void o(ol7 ol7Var, Object obj, int i) {
        float[] fArr = (float[]) obj;
        ol7Var.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            ol7Var.g(this.b, i2);
            ol7Var.h(f);
        }
    }
}
