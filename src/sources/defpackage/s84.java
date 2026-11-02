package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s84 implements c94 {
    public final t84 X;
    public final d94 Y;

    public s84(d94 d94Var, t84 t84Var) {
        this.Y = d94Var;
        this.X = t84Var;
    }

    @qa5(n84.ON_DESTROY)
    public void onDestroy(d94 d94Var) {
        this.X.l(d94Var);
    }

    @qa5(n84.ON_START)
    public void onStart(d94 d94Var) {
        this.X.g(d94Var);
    }

    @qa5(n84.ON_STOP)
    public void onStop(d94 d94Var) {
        this.X.h(d94Var);
    }
}
