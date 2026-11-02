package defpackage;

import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s57 extends yj2 {
    public final Object f0;
    public final d63 g0;
    public final int h0;
    public final int i0;

    public s57(n63 n63Var, Size size, d63 d63Var) {
        super(n63Var);
        this.f0 = new Object();
        if (size == null) {
            this.h0 = this.Y.b();
            this.i0 = this.Y.a();
        } else {
            this.h0 = size.getWidth();
            this.i0 = size.getHeight();
        }
        this.g0 = d63Var;
    }

    @Override // defpackage.yj2, defpackage.n63
    public final int a() {
        return this.i0;
    }

    @Override // defpackage.yj2, defpackage.n63
    public final int b() {
        return this.h0;
    }

    @Override // defpackage.yj2, defpackage.n63
    public final d63 r0() {
        return this.g0;
    }
}
