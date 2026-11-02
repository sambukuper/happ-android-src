package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jr0 extends gm3 implements ir0 {
    public final rm3 g0;

    public jr0(rm3 rm3Var) {
        this.g0 = rm3Var;
    }

    @Override // defpackage.ir0
    public final boolean b(Throwable th) {
        return j().x(th);
    }

    @Override // defpackage.ir0
    public final bm3 getParent() {
        return j();
    }

    @Override // defpackage.gm3
    public final boolean m() {
        return true;
    }

    @Override // defpackage.gm3
    public final void n(Throwable th) {
        this.g0.i(j());
    }
}
