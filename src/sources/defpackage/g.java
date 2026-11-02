package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends yh1 {
    public final aa7 Y;
    public final aa7 Z;

    public g(aa7 aa7Var, aa7 aa7Var2) {
        aa7Var.getClass();
        aa7Var2.getClass();
        this.Y = aa7Var;
        this.Z = aa7Var2;
    }

    @Override // defpackage.yh1
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final g p0(z14 z14Var) {
        aa7 aa7Var = this.Y;
        aa7Var.getClass();
        aa7 aa7Var2 = this.Z;
        aa7Var2.getClass();
        return new g(aa7Var, aa7Var2);
    }

    @Override // defpackage.mo8
    /* JADX INFO: renamed from: v0 */
    public final aa7 t0(ch8 ch8Var) {
        ch8Var.getClass();
        return new g(this.Y.t0(ch8Var), this.Z);
    }

    @Override // defpackage.yh1
    public final aa7 w0() {
        return this.Y;
    }

    @Override // defpackage.yh1
    public final yh1 y0(aa7 aa7Var) {
        return new g(aa7Var, this.Z);
    }

    @Override // defpackage.aa7
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public final g r0(boolean z) {
        return new g(this.Y.r0(z), this.Z.r0(z));
    }
}
