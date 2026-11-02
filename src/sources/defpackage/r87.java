package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r87 extends yt5 {
    public static final r87 c = new r87(s87.a);

    @Override // defpackage.a1
    public final int h(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.tv0, defpackage.a1
    public final void j(f01 f01Var, int i, Object obj) {
        q87 q87Var = (q87) obj;
        q87Var.getClass();
        short sM = f01Var.m(this.b, i);
        q87Var.b(q87Var.d() + 1);
        short[] sArr = q87Var.a;
        int i2 = q87Var.b;
        q87Var.b = i2 + 1;
        sArr[i2] = sM;
    }

    @Override // defpackage.a1
    public final Object k(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        q87 q87Var = new q87();
        q87Var.a = sArr;
        q87Var.b = sArr.length;
        q87Var.b(10);
        return q87Var;
    }

    @Override // defpackage.yt5
    public final Object n() {
        return new short[0];
    }

    @Override // defpackage.yt5
    public final void o(ol7 ol7Var, Object obj, int i) {
        short[] sArr = (short[]) obj;
        ol7Var.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            short s = sArr[i2];
            ol7Var.g(this.b, i2);
            ol7Var.s(s);
        }
    }
}
