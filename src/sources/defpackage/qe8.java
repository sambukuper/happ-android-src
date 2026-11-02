package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qe8 extends dd7 {
    public final dd7 e;
    public final boolean f;
    public final boolean g;
    public gn2 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe8(dd7 dd7Var, gn2 gn2Var, boolean z, boolean z2) {
        gn2 gn2VarE;
        super(0L, id7.g0);
        zx6 zx6Var = kd7.a;
        this.e = dd7Var;
        this.f = z;
        this.g = z2;
        this.h = kd7.i(gn2Var, (dd7Var == null || (gn2VarE = dd7Var.e()) == null) ? kd7.j.e : gn2VarE, z);
        this.i = ry7.f();
    }

    @Override // defpackage.dd7
    public final void c() {
        dd7 dd7Var;
        this.c = true;
        if (!this.g || (dd7Var = this.e) == null) {
            return;
        }
        dd7Var.c();
    }

    @Override // defpackage.dd7
    public final id7 d() {
        return v().d();
    }

    @Override // defpackage.dd7
    public final gn2 e() {
        return this.h;
    }

    @Override // defpackage.dd7
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.dd7
    public final long g() {
        return v().g();
    }

    @Override // defpackage.dd7
    public final gn2 i() {
        return null;
    }

    @Override // defpackage.dd7
    public final void k() {
        z91.S();
        throw null;
    }

    @Override // defpackage.dd7
    public final void l() {
        z91.S();
        throw null;
    }

    @Override // defpackage.dd7
    public final void m() {
        v().m();
    }

    @Override // defpackage.dd7
    public final void n(yh7 yh7Var) {
        v().n(yh7Var);
    }

    @Override // defpackage.dd7
    public final dd7 u(gn2 gn2Var) {
        gn2 gn2VarI = kd7.i(gn2Var, this.h, true);
        return !this.f ? kd7.e(v().u(null), gn2VarI, true) : v().u(gn2VarI);
    }

    public final dd7 v() {
        dd7 dd7Var = this.e;
        return dd7Var == null ? kd7.j : dd7Var;
    }
}
