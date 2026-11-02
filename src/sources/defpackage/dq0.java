package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dq0 implements ow3 {
    public static final dq0 a = new dq0();
    public static final bu5 b = new bu5("kotlin.Char", zt5.O);

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        ol7Var.e(((Character) obj).charValue());
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        return Character.valueOf(rd1Var.d());
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return b;
    }
}
