package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s60 extends yt5 {
    public static final s60 c = new s60(u60.a);

    @Override // defpackage.a1
    public final int h(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.tv0, defpackage.a1
    public final void j(f01 f01Var, int i, Object obj) {
        r60 r60Var = (r60) obj;
        r60Var.getClass();
        boolean z = f01Var.z(this.b, i);
        r60Var.b(r60Var.d() + 1);
        boolean[] zArr = r60Var.a;
        int i2 = r60Var.b;
        r60Var.b = i2 + 1;
        zArr[i2] = z;
    }

    @Override // defpackage.a1
    public final Object k(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        r60 r60Var = new r60();
        r60Var.a = zArr;
        r60Var.b = zArr.length;
        r60Var.b(10);
        return r60Var;
    }
}
