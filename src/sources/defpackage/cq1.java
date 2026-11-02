package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cq1 implements vc6 {
    public final gn2 X;
    public dq1 Y;

    public cq1(gn2 gn2Var) {
        this.X = gn2Var;
    }

    @Override // defpackage.vc6
    public final void b() {
        dq1 dq1Var = this.Y;
        if (dq1Var != null) {
            dq1Var.a();
        }
        this.Y = null;
    }

    @Override // defpackage.vc6
    public final void c() {
        this.Y = (dq1) this.X.B(u70.c);
    }

    @Override // defpackage.vc6
    public final void a() {
    }
}
