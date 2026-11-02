package defpackage;

import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y73 implements gz2 {
    public final boolean X;

    public y73() {
        this.X = sm1.a.b(SurfaceOrderQuirk.class) != null;
    }

    @Override // defpackage.gz2
    public boolean e() {
        return this.X;
    }

    @Override // defpackage.gz2
    public boolean f(ta7 ta7Var) {
        return this.X;
    }

    public y73(boolean z) {
        this.X = z;
    }
}
