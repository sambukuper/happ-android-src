package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ca7 extends aa7 {
    public final lh8 Y;
    public final List Z;
    public final boolean f0;
    public final et4 g0;
    public final gn2 h0;

    public ca7(lh8 lh8Var, List list, boolean z, et4 et4Var, gn2 gn2Var) {
        lh8Var.getClass();
        list.getClass();
        et4Var.getClass();
        this.Y = lh8Var;
        this.Z = list;
        this.f0 = z;
        this.g0 = et4Var;
        this.h0 = gn2Var;
        if (!(et4Var instanceof n32) || (et4Var instanceof x98)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + et4Var + '\n' + lh8Var);
    }

    @Override // defpackage.t14
    public final et4 K() {
        return this.g0;
    }

    @Override // defpackage.t14
    public final List l0() {
        return this.Z;
    }

    @Override // defpackage.t14
    public final ch8 m0() {
        ch8.Y.getClass();
        return ch8.Z;
    }

    @Override // defpackage.t14
    public final lh8 n0() {
        return this.Y;
    }

    @Override // defpackage.t14
    public final boolean o0() {
        return this.f0;
    }

    @Override // defpackage.t14
    public final t14 p0(z14 z14Var) {
        aa7 aa7Var = (aa7) this.h0.B(z14Var);
        return aa7Var == null ? this : aa7Var;
    }

    @Override // defpackage.mo8
    /* JADX INFO: renamed from: s0 */
    public final mo8 p0(z14 z14Var) {
        aa7 aa7Var = (aa7) this.h0.B(z14Var);
        return aa7Var == null ? this : aa7Var;
    }

    @Override // defpackage.aa7, defpackage.mo8
    /* JADX INFO: renamed from: u0 */
    public final aa7 r0(boolean z) {
        if (z == this.f0) {
            return this;
        }
        return z ? new i65(this, (byte) 1) : new i65(this, (byte) 0);
    }

    @Override // defpackage.mo8
    /* JADX INFO: renamed from: v0 */
    public final aa7 t0(ch8 ch8Var) {
        ch8Var.getClass();
        return ch8Var.isEmpty() ? this : new ea7(this, ch8Var);
    }
}
