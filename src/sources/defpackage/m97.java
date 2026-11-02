package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m97 extends e50 {
    public static final /* synthetic */ int h0 = 0;
    public final gl Y;
    public final ix5 Z;
    public final jx5 f0;
    public final ep3 g0;

    public m97(m85 m85Var, gl glVar, jx5 jx5Var, ix5 ix5Var, ep3 ep3Var) {
        this.Y = glVar;
        this.f0 = jx5Var;
        this.Z = ix5Var == null ? ix5.i0 : ix5Var;
        this.g0 = ep3Var;
    }

    @Override // defpackage.e50
    public final ep3 b() {
        return this.g0;
    }

    @Override // defpackage.e50
    public final ll f() {
        gl glVar = this.Y;
        if (glVar instanceof ll) {
            return (ll) glVar;
        }
        return null;
    }

    @Override // defpackage.e50
    public final el g() {
        gl glVar = this.Y;
        if (glVar instanceof el) {
            return (el) glVar;
        }
        return null;
    }

    @Override // defpackage.e50
    public final hl h() {
        gl glVar = this.Y;
        if (!(glVar instanceof hl)) {
            return null;
        }
        hl hlVar = (hl) glVar;
        if (hlVar.G0() == 0) {
            return hlVar;
        }
        return null;
    }

    @Override // defpackage.e50
    public final ix5 i() {
        return this.Z;
    }

    @Override // defpackage.e50
    public final String j() {
        return this.f0.X;
    }

    @Override // defpackage.e50
    public final dh8 k() {
        return this.Y.Q();
    }

    @Override // defpackage.e50
    public final Class l() {
        return this.Y.N();
    }

    @Override // defpackage.e50
    public final hl m() {
        gl glVar = this.Y;
        if (!(glVar instanceof hl)) {
            return null;
        }
        hl hlVar = (hl) glVar;
        if (hlVar.G0() == 1) {
            return hlVar;
        }
        return null;
    }

    @Override // defpackage.e50
    public final void n() {
    }
}
