package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ox5 extends g33 {
    public final Class f;
    public final Class g;
    public final ar3 h;
    public final ar3 i;

    public ox5(rx5 rx5Var, Class cls, ar3 ar3Var, Class cls2, ar3 ar3Var2) {
        this.f = cls;
        this.h = ar3Var;
        this.g = cls2;
        this.i = ar3Var2;
    }

    @Override // defpackage.g33
    public final g33 J(Class cls, ar3 ar3Var) {
        return new qx5(this, new sx5[]{new sx5(this.f, this.h), new sx5(this.g, this.i), new sx5(cls, ar3Var)});
    }

    @Override // defpackage.g33
    public final ar3 R(Class cls) {
        if (cls == this.f) {
            return this.h;
        }
        if (cls == this.g) {
            return this.i;
        }
        return null;
    }
}
