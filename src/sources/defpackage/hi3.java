package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hi3 extends gm3 {
    public static final /* synthetic */ long h0 = iu.a.objectFieldOffset(hi3.class.getDeclaredField("_invoked$volatile"));
    private volatile /* synthetic */ int _invoked$volatile;
    public final d0 g0;

    public hi3(d0 d0Var) {
        this.g0 = d0Var;
    }

    @Override // defpackage.gm3
    public final boolean m() {
        return true;
    }

    @Override // defpackage.gm3
    public final void n(Throwable th) {
        if (iu.a.compareAndSwapInt(this, h0, 0, 1)) {
            this.g0.B(th);
        }
    }
}
