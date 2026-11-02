package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v32 extends s21 {
    public final String b;

    public v32(String str) {
        super(dn8.a);
        this.b = str;
    }

    @Override // defpackage.s21
    public final t14 a(vx4 vx4Var) {
        vx4Var.getClass();
        return u32.c(s32.ERROR_CONSTANT_VALUE, this.b);
    }

    @Override // defpackage.s21
    public final Object b() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.s21
    public final String toString() {
        return this.b;
    }
}
