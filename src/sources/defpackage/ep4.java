package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ep4 implements nu4 {
    public nu4[] a;

    @Override // defpackage.nu4
    public final p66 a(Class cls) {
        for (nu4 nu4Var : this.a) {
            if (nu4Var.b(cls)) {
                return nu4Var.a(cls);
            }
        }
        u52.k("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.nu4
    public final boolean b(Class cls) {
        for (nu4 nu4Var : this.a) {
            if (nu4Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
