package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xw7 implements t11 {
    public final lr5 X;

    public xw7(lr5 lr5Var) {
        this.X = lr5Var;
    }

    @Override // defpackage.t11
    public final Object E(boolean z, rn2 rn2Var, s51 s51Var) {
        ax7 ax7Var = (ax7) this.X.Y;
        ax7Var.getClass();
        return rn2Var.K(new cx7(new ww7(ax7Var.g0())), s51Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        ((ax7) this.X.Y).close();
    }
}
