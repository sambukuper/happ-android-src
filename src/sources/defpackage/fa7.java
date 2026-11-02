package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fa7 extends yh1 implements ej8 {
    public final aa7 Y;
    public final t14 Z;

    public fa7(aa7 aa7Var, t14 t14Var) {
        t14Var.getClass();
        this.Y = aa7Var;
        this.Z = t14Var;
    }

    @Override // defpackage.ej8
    public final t14 B() {
        return this.Z;
    }

    @Override // defpackage.ej8
    public final mo8 getOrigin() {
        return this.Y;
    }

    @Override // defpackage.aa7
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.Z + ")] " + this.Y;
    }

    @Override // defpackage.aa7
    /* JADX INFO: renamed from: u0 */
    public final aa7 r0(boolean z) {
        mo8 mo8VarH = c18.h(this.Y.r0(z), this.Z.q0().r0(z));
        mo8VarH.getClass();
        return (aa7) mo8VarH;
    }

    @Override // defpackage.mo8
    /* JADX INFO: renamed from: v0 */
    public final aa7 t0(ch8 ch8Var) {
        ch8Var.getClass();
        mo8 mo8VarH = c18.h(this.Y.t0(ch8Var), this.Z);
        mo8VarH.getClass();
        return (aa7) mo8VarH;
    }

    @Override // defpackage.yh1
    public final aa7 w0() {
        return this.Y;
    }

    @Override // defpackage.yh1
    public final yh1 y0(aa7 aa7Var) {
        return new fa7(aa7Var, this.Z);
    }

    @Override // defpackage.yh1
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final fa7 p0(z14 z14Var) {
        t14 t14Var = this.Z;
        t14Var.getClass();
        return new fa7(this.Y, t14Var);
    }
}
