package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zh1 extends yh1 {
    public final aa7 Y;

    public zh1(aa7 aa7Var) {
        this.Y = aa7Var;
    }

    @Override // defpackage.aa7
    /* JADX INFO: renamed from: u0 */
    public final aa7 r0(boolean z) {
        return z == o0() ? this : this.Y.r0(z).t0(m0());
    }

    @Override // defpackage.mo8
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public final aa7 t0(ch8 ch8Var) {
        ch8Var.getClass();
        return ch8Var != m0() ? new ea7(this, ch8Var) : this;
    }

    @Override // defpackage.yh1
    public final aa7 w0() {
        return this.Y;
    }
}
