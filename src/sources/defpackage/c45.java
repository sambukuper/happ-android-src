package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c45 extends aa7 implements fo0 {
    public final un0 Y;
    public final d45 Z;
    public final mo8 f0;
    public final ch8 g0;
    public final boolean h0;
    public final boolean i0;

    /* JADX WARN: Illegal instructions before constructor call */
    public c45(un0 un0Var, d45 d45Var, mo8 mo8Var, ch8 ch8Var, boolean z, int i) {
        if ((i & 8) != 0) {
            ch8.Y.getClass();
            ch8Var = ch8.Z;
        }
        this(un0Var, d45Var, mo8Var, ch8Var, (i & 16) != 0 ? false : z, false);
    }

    @Override // defpackage.t14
    public final et4 K() {
        return u32.a(o32.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // defpackage.t14
    public final List l0() {
        return d02.X;
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
        return this.h0;
    }

    @Override // defpackage.aa7, defpackage.mo8
    public final mo8 r0(boolean z) {
        return new c45(this.Y, this.Z, this.f0, this.g0, z, 32);
    }

    @Override // defpackage.aa7
    /* JADX INFO: renamed from: u0 */
    public final aa7 r0(boolean z) {
        return new c45(this.Y, this.Z, this.f0, this.g0, z, 32);
    }

    @Override // defpackage.mo8
    /* JADX INFO: renamed from: v0 */
    public final aa7 t0(ch8 ch8Var) {
        ch8Var.getClass();
        return new c45(this.Y, this.Z, this.f0, ch8Var, this.h0, this.i0);
    }

    @Override // defpackage.mo8
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public final c45 p0(z14 z14Var) {
        d45 d45Var = this.Z;
        ni8 ni8VarD = d45Var.X.d(z14Var);
        c3 c3Var = d45Var.Y != null ? new c3((Object) d45Var, (Object) z14Var, (byte) 27) : null;
        d45 d45Var2 = d45Var.Z;
        if (d45Var2 == null) {
            d45Var2 = d45Var;
        }
        d45 d45Var3 = new d45(ni8VarD, c3Var, d45Var2, d45Var.f0);
        mo8 mo8Var = this.f0;
        return new c45(this.Y, d45Var3, mo8Var != null ? mo8Var : null, this.g0, this.h0, 32);
    }

    public c45(un0 un0Var, d45 d45Var, mo8 mo8Var, ch8 ch8Var, boolean z, boolean z2) {
        un0Var.getClass();
        d45Var.getClass();
        ch8Var.getClass();
        this.Y = un0Var;
        this.Z = d45Var;
        this.f0 = mo8Var;
        this.g0 = ch8Var;
        this.h0 = z;
        this.i0 = z2;
    }
}
