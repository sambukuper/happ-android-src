package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hh1 extends yh1 implements p81, ih1 {
    public final aa7 Y;
    public final boolean Z;

    public hh1(aa7 aa7Var, boolean z) {
        this.Y = aa7Var;
        this.Z = z;
    }

    @Override // defpackage.p81
    public final mo8 f0(t14 t14Var) {
        t14Var.getClass();
        return jm4.R(t14Var.q0(), this.Z);
    }

    @Override // defpackage.p81
    public final boolean g0() {
        aa7 aa7Var = this.Y;
        aa7Var.n0();
        return aa7Var.n0().x() instanceof hi8;
    }

    @Override // defpackage.yh1, defpackage.t14
    public final boolean o0() {
        return false;
    }

    @Override // defpackage.aa7
    public final String toString() {
        return this.Y + " & Any";
    }

    @Override // defpackage.aa7
    /* JADX INFO: renamed from: u0 */
    public final aa7 r0(boolean z) {
        return z ? this.Y.r0(z) : this;
    }

    @Override // defpackage.mo8
    /* JADX INFO: renamed from: v0 */
    public final aa7 t0(ch8 ch8Var) {
        ch8Var.getClass();
        return new hh1(this.Y.t0(ch8Var), this.Z);
    }

    @Override // defpackage.yh1
    public final aa7 w0() {
        return this.Y;
    }

    @Override // defpackage.yh1
    public final yh1 y0(aa7 aa7Var) {
        return new hh1(aa7Var, this.Z);
    }
}
