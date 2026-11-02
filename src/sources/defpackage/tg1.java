package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tg1 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ wg1 Y;

    public /* synthetic */ tg1(wg1 wg1Var, String str) {
        this.X = (byte) 0;
        this.Y = wg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        wg1 wg1Var = this.Y;
        switch (b) {
            case 0:
                try {
                    wg1Var.e.get();
                    wg1.m.decrementAndGet();
                    wg1.l.get();
                    wg1Var.e();
                    return;
                } catch (Exception e) {
                    wg1Var.toString();
                    hi5.z0("DeferrableSurface");
                    synchronized (wg1Var.a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", wg1Var, Boolean.valueOf(wg1Var.c), Integer.valueOf(wg1Var.b)), e);
                    }
                }
            case 1:
                wg1Var.a();
                return;
            default:
                wg1Var.b();
                return;
        }
    }

    public /* synthetic */ tg1(wg1 wg1Var, byte b) {
        this.X = b;
        this.Y = wg1Var;
    }
}
