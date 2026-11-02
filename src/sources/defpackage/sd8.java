package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sd8 {
    public final ug8 a;
    public final rh5 b = z51.H(null);
    public final /* synthetic */ ce8 c;

    public sd8(ce8 ce8Var, ug8 ug8Var, String str) {
        this.c = ce8Var;
        this.a = ug8Var;
    }

    public final rd8 a(gn2 gn2Var, Object obj, wk wkVar, gn2 gn2Var2) {
        rh5 rh5Var = this.b;
        rd8 rd8Var = (rd8) rh5Var.getValue();
        ce8 ce8Var = this.c;
        if (rd8Var == null) {
            Object objB = gn2Var2.B(ce8Var.c());
            Object objB2 = gn2Var2.B(ce8Var.c());
            ug8 ug8Var = this.a;
            wk wkVar2 = (wk) ug8Var.a.B(objB2);
            wkVar2.d();
            yd8 yd8Var = new yd8(ce8Var, objB, wkVar2, ug8Var);
            rd8Var = new rd8(this, yd8Var, gn2Var, gn2Var2);
            rh5Var.setValue(rd8Var);
            ce8Var.j.add(yd8Var);
        }
        rd8Var.Z = gn2Var2;
        rd8Var.Y = gn2Var;
        rd8Var.a(ce8Var.f(), obj, wkVar);
        return rd8Var;
    }
}
