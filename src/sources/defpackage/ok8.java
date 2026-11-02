package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ok8 extends yt5 {
    public static final ok8 c = new ok8(pk8.a);

    @Override // defpackage.a1
    public final int h(Object obj) {
        return ((mk8) obj).X.length;
    }

    @Override // defpackage.tv0, defpackage.a1
    public final void j(f01 f01Var, int i, Object obj) {
        nk8 nk8Var = (nk8) obj;
        nk8Var.getClass();
        int iL = f01Var.b(this.b, i).l();
        nk8Var.b(nk8Var.d() + 1);
        int[] iArr = nk8Var.a;
        int i2 = nk8Var.b;
        nk8Var.b = i2 + 1;
        iArr[i2] = iL;
    }

    @Override // defpackage.a1
    public final Object k(Object obj) {
        int[] iArr = ((mk8) obj).X;
        nk8 nk8Var = new nk8();
        nk8Var.a = iArr;
        nk8Var.b = iArr.length;
        nk8Var.b(10);
        return nk8Var;
    }

    @Override // defpackage.yt5
    public final Object n() {
        return new mk8(new int[0]);
    }

    @Override // defpackage.yt5
    public final void o(ol7 ol7Var, Object obj, int i) {
        int[] iArr = ((mk8) obj).X;
        ol7Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ol7Var.j(this.b, i2).k(iArr[i2]);
        }
    }
}
