package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ge2 extends ce2 implements ej8 {
    public final ce2 f0;
    public final t14 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge2(ce2 ce2Var, t14 t14Var) {
        super(ce2Var.Y, ce2Var.Z);
        t14Var.getClass();
        this.f0 = ce2Var;
        this.g0 = t14Var;
    }

    @Override // defpackage.ej8
    public final t14 B() {
        return this.g0;
    }

    @Override // defpackage.ej8
    public final mo8 getOrigin() {
        return this.f0;
    }

    @Override // defpackage.t14
    public final t14 p0(z14 z14Var) {
        t14 t14Var = this.g0;
        t14Var.getClass();
        return new ge2(this.f0, t14Var);
    }

    @Override // defpackage.mo8
    public final mo8 r0(boolean z) {
        return c18.h(this.f0.r0(z), this.g0.q0().r0(z));
    }

    @Override // defpackage.mo8
    /* JADX INFO: renamed from: s0 */
    public final mo8 p0(z14 z14Var) {
        t14 t14Var = this.g0;
        t14Var.getClass();
        return new ge2(this.f0, t14Var);
    }

    @Override // defpackage.mo8
    public final mo8 t0(ch8 ch8Var) {
        ch8Var.getClass();
        return c18.h(this.f0.t0(ch8Var), this.g0);
    }

    @Override // defpackage.ce2
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.g0 + ")] " + this.f0;
    }

    @Override // defpackage.ce2
    public final aa7 u0() {
        return this.f0.u0();
    }

    @Override // defpackage.ce2
    public final String v0(wk1 wk1Var, wk1 wk1Var2) {
        return wk1Var2.a.r() ? wk1Var.P(this.g0) : this.f0.v0(wk1Var, wk1Var2);
    }
}
