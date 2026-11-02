package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m65 implements ow3 {
    public static final m65 a = new m65();
    public static final l65 b = l65.a;

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        ((Void) obj).getClass();
        throw new m37("'kotlin.Nothing' cannot be serialized");
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        throw new m37("'kotlin.Nothing' does not have instances");
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return b;
    }
}
