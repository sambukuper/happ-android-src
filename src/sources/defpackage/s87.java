package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s87 implements ow3 {
    public static final s87 a = new s87();
    public static final bu5 b = new bu5("kotlin.Short", zt5.T);

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        ol7Var.s(((Number) obj).shortValue());
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        return Short.valueOf(rd1Var.B());
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return b;
    }
}
