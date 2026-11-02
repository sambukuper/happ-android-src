package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g76 extends dd7 {
    public final gn2 e;
    public int f;

    public g76(long j, id7 id7Var, gn2 gn2Var) {
        super(j, id7Var);
        this.e = gn2Var;
        this.f = 1;
    }

    @Override // defpackage.dd7
    public final void c() {
        if (this.c) {
            return;
        }
        l();
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
    public final gn2 i() {
        return null;
    }

    @Override // defpackage.dd7
    public final void k() {
        this.f++;
    }

    @Override // defpackage.dd7
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.dd7
    public final void n(yh7 yh7Var) {
        zx6 zx6Var = kd7.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.dd7
    public final dd7 u(gn2 gn2Var) {
        kd7.v(this);
        return new s25(this.b, this.a, kd7.i(gn2Var, this.e, true), this);
    }

    @Override // defpackage.dd7
    public final void m() {
    }
}
