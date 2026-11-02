package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r55 extends f1 implements bm3 {
    public static final r55 Y = new r55(oy1.E0);

    @Override // defpackage.bm3
    public final ir0 C(rm3 rm3Var) {
        return t55.X;
    }

    @Override // defpackage.bm3
    public final y45 C0() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.bm3
    public final gq1 D(gn2 gn2Var) {
        return t55.X;
    }

    @Override // defpackage.bm3
    public final CancellationException R() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.bm3
    public final Object V0(s51 s51Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.bm3
    public final gq1 Y(boolean z, boolean z2, d0 d0Var) {
        return t55.X;
    }

    @Override // defpackage.bm3
    public final u27 g() {
        return l02.a;
    }

    @Override // defpackage.bm3
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.bm3
    public final boolean k() {
        return true;
    }

    @Override // defpackage.bm3
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.bm3, defpackage.jp0
    public final void m(CancellationException cancellationException) {
    }
}
