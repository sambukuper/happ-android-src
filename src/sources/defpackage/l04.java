package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l04 implements xl1 {
    public final qb6 X;

    public l04(qb6 qb6Var, sr5 sr5Var, wl1 wl1Var) {
        this.X = qb6Var;
    }

    @Override // defpackage.xl1
    public final String m() {
        return oi0.o(new StringBuilder("Class '"), ia6.a(this.X.a).a().a.a, '\'');
    }

    public final String toString() {
        return l04.class.getSimpleName() + ": " + this.X;
    }
}
