package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class db0 implements ow3 {
    public static final db0 a = new db0();
    public static final bu5 b = new bu5("kotlin.Byte", zt5.N);

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        ol7Var.d(((Number) obj).byteValue());
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        return Byte.valueOf(rd1Var.A());
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return b;
    }
}
