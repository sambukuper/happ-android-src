package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s25 extends dd7 {
    public final gn2 e;
    public final dd7 f;

    public s25(long j, id7 id7Var, gn2 gn2Var, dd7 dd7Var) {
        super(j, id7Var);
        this.e = gn2Var;
        this.f = dd7Var;
        dd7Var.k();
    }

    @Override // defpackage.dd7
    public final void c() {
        dd7 dd7Var = this.f;
        if (this.c) {
            return;
        }
        if (this.b != dd7Var.g()) {
            a();
        }
        dd7Var.l();
        this.c = true;
        synchronized (kd7.c) {
            o();
        }
    }

    @Override // defpackage.dd7
    public final gn2 e() {
        return this.e;
    }

    @Override // defpackage.dd7
    public final boolean f() {
        return true;
    }

    @Override // defpackage.dd7
    public final dd7 u(gn2 gn2Var) {
        return new s25(this.b, this.a, kd7.i(gn2Var, this.e, true), this.f);
    }
}
