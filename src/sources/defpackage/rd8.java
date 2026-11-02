package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rd8 implements lh7 {
    public final yd8 X;
    public gn2 Y;
    public gn2 Z;
    public final /* synthetic */ sd8 f0;

    public rd8(sd8 sd8Var, yd8 yd8Var, gn2 gn2Var, gn2 gn2Var2) {
        this.f0 = sd8Var;
        this.X = yd8Var;
        this.Y = gn2Var;
        this.Z = gn2Var2;
    }

    public final void a(wd8 wd8Var, Object obj, wk wkVar) {
        Object objB = this.Z.B(wd8Var.c());
        boolean zG = this.f0.c.g();
        yd8 yd8Var = this.X;
        if (zG) {
            yd8Var.f(this.Z.B(wd8Var.a()), objB, (ta2) this.Y.B(wd8Var));
        } else {
            yd8Var.g(objB, (ta2) this.Y.B(wd8Var), obj, wkVar);
        }
    }

    @Override // defpackage.lh7
    public final Object getValue() {
        a(this.f0.c.f(), null, null);
        return this.X.j0.getValue();
    }
}
