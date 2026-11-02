package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ek8 extends yt5 {
    public static final ek8 c = new ek8(fk8.a);

    @Override // defpackage.a1
    public final int h(Object obj) {
        return ((ck8) obj).X.length;
    }

    @Override // defpackage.tv0, defpackage.a1
    public final void j(f01 f01Var, int i, Object obj) {
        dk8 dk8Var = (dk8) obj;
        dk8Var.getClass();
        byte bA = f01Var.b(this.b, i).A();
        dk8Var.b(dk8Var.d() + 1);
        byte[] bArr = dk8Var.a;
        int i2 = dk8Var.b;
        dk8Var.b = i2 + 1;
        bArr[i2] = bA;
    }

    @Override // defpackage.a1
    public final Object k(Object obj) {
        byte[] bArr = ((ck8) obj).X;
        dk8 dk8Var = new dk8();
        dk8Var.a = bArr;
        dk8Var.b = bArr.length;
        dk8Var.b(10);
        return dk8Var;
    }

    @Override // defpackage.yt5
    public final Object n() {
        return new ck8(new byte[0]);
    }

    @Override // defpackage.yt5
    public final void o(ol7 ol7Var, Object obj, int i) {
        byte[] bArr = ((ck8) obj).X;
        ol7Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ol7Var.j(this.b, i2).d(bArr[i2]);
        }
    }
}
