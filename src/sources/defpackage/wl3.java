package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wl3 extends l5 {
    public static final wl3 f0 = new wl3("protected_and_package", true);

    @Override // defpackage.l5
    public final Integer a(l5 l5Var) {
        l5Var.getClass();
        if (this == l5Var) {
            return 0;
        }
        if (l5Var == uy8.f0) {
            return null;
        }
        ip4 ip4Var = cz8.a;
        return (l5Var == xy8.f0 || l5Var == yy8.f0) ? 1 : -1;
    }

    @Override // defpackage.l5
    public final String d() {
        return "protected/*protected and package*/";
    }

    @Override // defpackage.l5
    public final l5 k() {
        return zy8.f0;
    }
}
