package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zn0 extends aa7 implements fo0 {
    public final ni8 Y;
    public final co0 Z;
    public final boolean f0;
    public final ch8 g0;

    public zn0(ni8 ni8Var, co0 co0Var, boolean z, ch8 ch8Var) {
        ni8Var.getClass();
        ch8Var.getClass();
        this.Y = ni8Var;
        this.Z = co0Var;
        this.f0 = z;
        this.g0 = ch8Var;
    }

    @Override // defpackage.t14
    public final ch8 m0() {
        return this.g0;
    }

    @Override // defpackage.t14
    public final lh8 n0() {
        return this.Z;
    }

    @Override // defpackage.t14
    public final boolean o0() {
        return this.f0;
    }

    @Override // defpackage.t14
    /* JADX INFO: renamed from: p0 */
    public final t14 s0(z14 z14Var) {
        return new zn0(this.Y.d(z14Var), this.Z, this.f0, this.g0);
    }

    @Override // defpackage.aa7, defpackage.mo8
    public final mo8 r0(boolean z) {
        if (z == this.f0) {
            return this;
        }
        return new zn0(this.Y, this.Z, z, this.g0);
    }

    @Override // defpackage.mo8
    /* JADX INFO: renamed from: s0 */
    public final mo8 p0(z14 z14Var) {
        return new zn0(this.Y.d(z14Var), this.Z, this.f0, this.g0);
    }

    @Override // defpackage.aa7
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.Y);
        sb.append(')');
        sb.append(this.f0 ? "?" : _UrlKt.FRAGMENT_ENCODE_SET);
        return sb.toString();
    }

    @Override // defpackage.aa7
    /* JADX INFO: renamed from: u0 */
    public final aa7 r0(boolean z) {
        if (z == this.f0) {
            return this;
        }
        return new zn0(this.Y, this.Z, z, this.g0);
    }

    @Override // defpackage.mo8
    /* JADX INFO: renamed from: v0 */
    public final aa7 t0(ch8 ch8Var) {
        ch8Var.getClass();
        return new zn0(this.Y, this.Z, this.f0, ch8Var);
    }
}
