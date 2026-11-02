package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rx5 extends g33 {
    public final Class f;
    public final ar3 g;

    public rx5(g33 g33Var, Class cls, ar3 ar3Var) {
        this.f = cls;
        this.g = ar3Var;
    }

    @Override // defpackage.g33
    public final g33 J(Class cls, ar3 ar3Var) {
        return new ox5(this, this.f, this.g, cls, ar3Var);
    }

    @Override // defpackage.g33
    public final ar3 R(Class cls) {
        if (cls == this.f) {
            return this.g;
        }
        return null;
    }
}
