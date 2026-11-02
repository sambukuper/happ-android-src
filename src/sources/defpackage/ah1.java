package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ah1 extends u61 {
    public static final /* synthetic */ long g0 = iu.a.objectFieldOffset(ah1.class.getDeclaredField("f0"));
    public final u61 Z;
    public volatile /* synthetic */ int f0 = 1;

    public ah1(u61 u61Var) {
        this.Z = u61Var;
    }

    @Override // defpackage.u61
    public final void Z0(s61 s61Var, Runnable runnable) {
        d1().Z0(s61Var, runnable);
    }

    @Override // defpackage.u61
    public final void a1(s61 s61Var, Runnable runnable) {
        d1().a1(s61Var, runnable);
    }

    @Override // defpackage.u61
    public final boolean b1(s61 s61Var) {
        return d1().b1(s61Var);
    }

    @Override // defpackage.u61
    public final u61 c1(int i) {
        return d1().c1(i);
    }

    public final u61 d1() {
        return iu.a.getIntVolatile(this, g0) == 1 ? tp1.b : this.Z;
    }

    @Override // defpackage.u61
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.Z + ")";
    }
}
