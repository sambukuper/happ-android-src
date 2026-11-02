package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ya0 extends yt5 {
    public static final ya0 c = new ya0(db0.a);

    @Override // defpackage.a1
    public final int h(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.tv0, defpackage.a1
    public final void j(f01 f01Var, int i, Object obj) {
        wa0 wa0Var = (wa0) obj;
        wa0Var.getClass();
        byte bJ = f01Var.j(this.b, i);
        wa0Var.b(wa0Var.d() + 1);
        byte[] bArr = wa0Var.a;
        int i2 = wa0Var.b;
        wa0Var.b = i2 + 1;
        bArr[i2] = bJ;
    }

    @Override // defpackage.a1
    public final Object k(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        wa0 wa0Var = new wa0();
        wa0Var.a = bArr;
        wa0Var.b = bArr.length;
        wa0Var.b(10);
        return wa0Var;
    }

    @Override // defpackage.yt5
    public final Object n() {
        return new byte[0];
    }

    @Override // defpackage.yt5
    public final void o(ol7 ol7Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        ol7Var.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            ol7Var.g(this.b, i2);
            ol7Var.d(b);
        }
    }
}
