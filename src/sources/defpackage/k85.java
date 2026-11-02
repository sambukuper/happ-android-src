package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k85 implements ow3 {
    public final g44 a = x97.P(w74.X, new dw4(this));

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        obj.getClass();
        ol7Var.a(d()).v(d());
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        e37 e37VarD = d();
        f01 f01VarT = rd1Var.t(e37VarD);
        int iE = f01VarT.e(d());
        if (iE != -1) {
            throw new m37(pc6.j(iE, "Unexpected index "));
        }
        f01VarT.n(e37VarD);
        return dn8.a;
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return (e37) this.a.getValue();
    }
}
