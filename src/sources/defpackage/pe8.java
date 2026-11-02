package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pe8 extends x05 {
    public final x05 o;
    public final boolean p;
    public final boolean q;
    public gn2 r;
    public gn2 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    public pe8(x05 x05Var, gn2 gn2Var, gn2 gn2Var2, boolean z, boolean z2) {
        gn2 gn2VarI;
        gn2 gn2VarY;
        zx6 zx6Var = kd7.a;
        super(0L, id7.g0, kd7.i(gn2Var, (x05Var == null || (gn2VarY = x05Var.e()) == null) ? kd7.j.e : gn2VarY, z), kd7.j(gn2Var2, (x05Var == null || (gn2VarI = x05Var.i()) == null) ? kd7.j.f : gn2VarI));
        this.o = x05Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = ry7.f();
    }

    @Override // defpackage.x05
    public final void B(t05 t05Var) {
        z91.S();
        throw null;
    }

    @Override // defpackage.x05
    public final x05 C(gn2 gn2Var, gn2 gn2Var2) {
        gn2 gn2VarI = kd7.i(gn2Var, this.r, true);
        gn2 gn2VarJ = kd7.j(gn2Var2, this.s);
        return !this.p ? new pe8(D().C(null, gn2VarJ), gn2VarI, gn2VarJ, false, true) : D().C(gn2VarI, gn2VarJ);
    }

    public final x05 D() {
        x05 x05Var = this.o;
        return x05Var == null ? kd7.j : x05Var;
    }

    @Override // defpackage.x05, defpackage.dd7
    public final void c() {
        x05 x05Var;
        this.c = true;
        if (!this.q || (x05Var = this.o) == null) {
            return;
        }
        x05Var.c();
    }

    @Override // defpackage.dd7
    public final id7 d() {
        return D().d();
    }

    @Override // defpackage.x05, defpackage.dd7
    public final gn2 e() {
        return this.r;
    }

    @Override // defpackage.dd7
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.dd7
    public final long g() {
        return D().g();
    }

    @Override // defpackage.x05, defpackage.dd7
    public final int h() {
        return D().h();
    }

    @Override // defpackage.x05, defpackage.dd7
    public final gn2 i() {
        return this.s;
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
        D().m();
    }

    @Override // defpackage.x05, defpackage.dd7
    public final void n(yh7 yh7Var) {
        D().n(yh7Var);
    }

    @Override // defpackage.dd7
    public final void r(id7 id7Var) {
        z91.S();
        throw null;
    }

    @Override // defpackage.dd7
    public final void s(long j) {
        z91.S();
        throw null;
    }

    @Override // defpackage.x05, defpackage.dd7
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.x05, defpackage.dd7
    public final dd7 u(gn2 gn2Var) {
        gn2 gn2VarI = kd7.i(gn2Var, this.r, true);
        return !this.p ? kd7.e(D().u(null), gn2VarI, true) : D().u(gn2VarI);
    }

    @Override // defpackage.x05
    public final ys0 w() {
        return D().w();
    }

    @Override // defpackage.x05
    public final t05 x() {
        return D().x();
    }

    @Override // defpackage.x05
    /* JADX INFO: renamed from: y */
    public final gn2 e() {
        return this.r;
    }
}
