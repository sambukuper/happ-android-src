package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wk8 extends yt5 {
    public static final wk8 c = new wk8(xk8.a);

    @Override // defpackage.a1
    public final int h(Object obj) {
        return ((uk8) obj).X.length;
    }

    @Override // defpackage.tv0, defpackage.a1
    public final void j(f01 f01Var, int i, Object obj) {
        vk8 vk8Var = (vk8) obj;
        vk8Var.getClass();
        long jV = f01Var.b(this.b, i).v();
        vk8Var.b(vk8Var.d() + 1);
        long[] jArr = vk8Var.a;
        int i2 = vk8Var.b;
        vk8Var.b = i2 + 1;
        jArr[i2] = jV;
    }

    @Override // defpackage.a1
    public final Object k(Object obj) {
        long[] jArr = ((uk8) obj).X;
        vk8 vk8Var = new vk8();
        vk8Var.a = jArr;
        vk8Var.b = jArr.length;
        vk8Var.b(10);
        return vk8Var;
    }

    @Override // defpackage.yt5
    public final Object n() {
        return new uk8(new long[0]);
    }

    @Override // defpackage.yt5
    public final void o(ol7 ol7Var, Object obj, int i) {
        long[] jArr = ((uk8) obj).X;
        ol7Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ol7Var.j(this.b, i2).m(jArr[i2]);
        }
    }
}
