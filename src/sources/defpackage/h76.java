package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h76 implements mh7, xe2, wo2 {
    public final /* synthetic */ oh7 X;
    private final bm3 job;

    public h76(oh7 oh7Var, og7 og7Var) {
        this.X = oh7Var;
        this.job = og7Var;
    }

    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, q51 q51Var) {
        this.X.a(ze2Var, q51Var);
        return c71.X;
    }

    @Override // defpackage.wo2
    public final xe2 b(s61 s61Var, int i, l90 l90Var) {
        return (((i < 0 || i >= 2) && i != -2) || l90Var != l90.Y) ? v77.c(this, s61Var, i, l90Var) : this;
    }

    @Override // defpackage.mh7
    public final Object getValue() {
        return this.X.getValue();
    }
}
