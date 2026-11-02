package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gl8 extends yt5 {
    public static final gl8 c = new gl8(hl8.a);

    @Override // defpackage.a1
    public final int h(Object obj) {
        return ((el8) obj).X.length;
    }

    @Override // defpackage.tv0, defpackage.a1
    public final void j(f01 f01Var, int i, Object obj) {
        fl8 fl8Var = (fl8) obj;
        fl8Var.getClass();
        short sB = f01Var.b(this.b, i).B();
        fl8Var.b(fl8Var.d() + 1);
        short[] sArr = fl8Var.a;
        int i2 = fl8Var.b;
        fl8Var.b = i2 + 1;
        sArr[i2] = sB;
    }

    @Override // defpackage.a1
    public final Object k(Object obj) {
        short[] sArr = ((el8) obj).X;
        fl8 fl8Var = new fl8();
        fl8Var.a = sArr;
        fl8Var.b = sArr.length;
        fl8Var.b(10);
        return fl8Var;
    }

    @Override // defpackage.yt5
    public final Object n() {
        return new el8(new short[0]);
    }

    @Override // defpackage.yt5
    public final void o(ol7 ol7Var, Object obj, int i) {
        short[] sArr = ((el8) obj).X;
        ol7Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            ol7Var.j(this.b, i2).s(sArr[i2]);
        }
    }
}
