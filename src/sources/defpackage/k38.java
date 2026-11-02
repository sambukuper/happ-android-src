package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k38 implements h38 {
    public final long X;
    public final /* synthetic */ l38 Y;

    public k38(l38 l38Var, long j) {
        this.Y = l38Var;
        this.X = j;
    }

    @Override // defpackage.h38
    public final g38 S() {
        return p38.b(this.Y);
    }

    @Override // defpackage.h38
    public final long j(y24 y24Var) {
        y24 y24Var2 = (y24) this.Y.t0.getValue();
        if (y24Var2 != null) {
            if (y24Var2.g()) {
                return y24Var.E(y24Var2.n(this.X));
            }
            return 0L;
        }
        zc3.d("Tried to open context menu before the anchor was placed.");
        b61.n();
        return 0L;
    }

    @Override // defpackage.h38
    public final s86 m(y24 y24Var) {
        return u70.n(j(y24Var), 0L);
    }
}
