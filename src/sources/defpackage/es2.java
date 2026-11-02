package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class es2 extends x05 {
    @Override // defpackage.x05
    public final x05 C(gn2 gn2Var, gn2 gn2Var2) {
        return (x05) ((dd7) kd7.b(new pr2(new d3(gn2Var, gn2Var2, (byte) 7), (byte) 1)));
    }

    @Override // defpackage.x05, defpackage.dd7
    public final void c() {
        synchronized (kd7.c) {
            o();
        }
    }

    @Override // defpackage.x05, defpackage.dd7
    public final void k() {
        z91.S();
        throw null;
    }

    @Override // defpackage.x05, defpackage.dd7
    public final void l() {
        z91.S();
        throw null;
    }

    @Override // defpackage.x05, defpackage.dd7
    public final void m() {
        kd7.c();
    }

    @Override // defpackage.x05, defpackage.dd7
    public final dd7 u(gn2 gn2Var) {
        return (g76) ((dd7) kd7.b(new pr2(new ds2(gn2Var, (byte) 0), (byte) 1)));
    }

    @Override // defpackage.x05
    public final ys0 w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
