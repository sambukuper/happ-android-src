package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g97 extends w39 {
    public final zk i0;
    public final boolean j0;
    public final z47 k0;
    public final km l0;
    public final boolean m0;

    public g97(zk zkVar, boolean z, z47 z47Var, km kmVar, boolean z2) {
        z47Var.getClass();
        this.i0 = zkVar;
        this.j0 = z;
        this.k0 = z47Var;
        this.l0 = kmVar;
        this.m0 = z2;
    }

    @Override // defpackage.w39
    public final e0 A() {
        return (mm) ((c6) this.k0.Y).p0;
    }

    @Override // defpackage.w39
    public final Iterable B(x14 x14Var) {
        x14Var.getClass();
        return ((t14) x14Var).getAnnotations();
    }

    @Override // defpackage.w39
    public final Iterable E() {
        sm annotations;
        zk zkVar = this.i0;
        return (zkVar == null || (annotations = zkVar.getAnnotations()) == null) ? d02.X : annotations;
    }

    @Override // defpackage.w39
    public final km F() {
        return this.l0;
    }

    @Override // defpackage.w39
    public final rl3 G() {
        return (rl3) ((g44) this.k0.f0).getValue();
    }

    @Override // defpackage.w39
    public final boolean H() {
        zk zkVar = this.i0;
        return (zkVar instanceof ot8) && ((ot8) zkVar).n0 != null;
    }

    @Override // defpackage.w39
    public final g39 I(g39 g39Var, bk3 bk3Var) {
        if (g39Var != null) {
            return g39.a(g39Var, h75.Z, false, 2);
        }
        if (bk3Var != null) {
            return bk3Var.a;
        }
        return null;
    }

    @Override // defpackage.w39
    public final boolean K() {
        Object obj = this.k0.Y;
        return false;
    }

    @Override // defpackage.w39
    public final x14 L(x14 x14Var) {
        x14Var.getClass();
        return c18.e((t14) x14Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w39
    public final gk2 M(zk6 zk6Var) {
        zk6Var.getClass();
        q32 q32Var = cj8.a;
        ot0 ot0VarX = ((t14) zk6Var).n0().x();
        sx4 sx4Var = ot0VarX instanceof sx4 ? (sx4) ot0VarX : null;
        if (sx4Var != null) {
            return bl1.f(sx4Var);
        }
        return null;
    }

    @Override // defpackage.w39
    public final boolean R() {
        return this.m0;
    }

    @Override // defpackage.w39
    public final /* bridge */ /* synthetic */ xi8 T() {
        return lh4.E0;
    }

    @Override // defpackage.w39
    public final boolean V() {
        return this.j0;
    }

    @Override // defpackage.w39
    public final boolean W(x14 x14Var, x14 x14Var2) {
        x14Var.getClass();
        x14Var2.getClass();
        return ((q45) ((p45) ((c6) this.k0.Y).Z)).a((t14) x14Var, (t14) x14Var2);
    }

    @Override // defpackage.w39
    public final boolean Y() {
        return false;
    }

    @Override // defpackage.w39
    public final boolean Z(x14 x14Var) {
        x14Var.getClass();
        return ((t14) x14Var).q0() instanceof j65;
    }

    @Override // defpackage.w39
    public final boolean x(Object obj, x14 x14Var) {
        gm gmVar = (gm) obj;
        if (gmVar instanceof m44) {
            K();
            if (((m44) gmVar).g || this.l0 == km.TYPE_PARAMETER_BOUNDS) {
                return true;
            }
        }
        if (x14Var == null || !zz3.G((t14) x14Var)) {
            return false;
        }
        z47 z47Var = this.k0;
        if (!((mm) ((c6) z47Var.Y).p0).i(gmVar)) {
            return false;
        }
        Object obj2 = z47Var.Y;
        return true;
    }
}
