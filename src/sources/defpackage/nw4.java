package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nw4 extends u95 {
    public final b71 d;
    public final oi e;
    public final tb2 f;

    public nw4(boolean z, b71 b71Var, oi oiVar, tb2 tb2Var) {
        super(z);
        this.d = b71Var;
        this.e = oiVar;
        this.f = tb2Var;
    }

    @Override // defpackage.u95
    public final void a() {
        w51.G(this.d, null, null, new r5(this, (q51) null, (byte) 22), 3);
    }

    @Override // defpackage.u95
    public final void b() {
        this.f.invoke();
    }

    @Override // defpackage.u95
    public final void c(j00 j00Var) {
        w51.G(this.d, null, null, new mw4(this, j00Var, null, (byte) 0), 3);
    }

    @Override // defpackage.u95
    public final void d(j00 j00Var) {
        w51.G(this.d, null, null, new mw4(this, j00Var, null, (byte) 1), 3);
    }
}
