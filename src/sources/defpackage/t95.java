package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t95 extends k25 {
    public final u95 d;
    public boolean e;

    public t95(u95 u95Var, v95 v95Var) {
        boolean z = u95Var.b;
        this.a = v95Var;
        this.b = z;
        this.d = u95Var;
        this.e = true;
    }

    @Override // defpackage.k25
    public final void a() {
        this.d.a();
    }

    @Override // defpackage.k25
    public final void b() {
        this.d.b();
    }

    @Override // defpackage.k25
    public final void c(i25 i25Var) {
        this.d.c(new j00(i25Var));
    }

    @Override // defpackage.k25
    public final void d(i25 i25Var) {
        i25Var.getClass();
        this.d.d(new j00(i25Var));
    }

    public final void g(boolean z) {
        this.e = z;
        f(z && this.d.b);
    }
}
