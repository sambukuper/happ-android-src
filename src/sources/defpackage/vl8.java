package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vl8 extends u61 {
    public static final vl8 Z = new vl8();

    @Override // defpackage.u61
    public final void Z0(s61 s61Var, Runnable runnable) {
        g79 g79Var = (g79) s61Var.H0(g79.Z);
        if (g79Var != null) {
            g79Var.Y = true;
        } else {
            u52.k("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.u61
    public final u61 c1(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.u61
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
