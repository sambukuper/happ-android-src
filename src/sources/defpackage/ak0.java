package defpackage;

import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ak0 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ek0 Y;

    public /* synthetic */ ak0(ek0 ek0Var, d6 d6Var) {
        this.X = (byte) 1;
        this.Y = ek0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        ek0 ek0Var = this.Y;
        switch (b) {
            case 0:
                synchronized (ek0Var.d) {
                    try {
                        ScheduledFuture scheduledFuture = ek0Var.e;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        hi5.z0("CameraPresencePrvdr");
                        ek0Var.d(3, ek0Var.k);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                wv0.c1(ek0Var.k).isEmpty();
                return;
            default:
                Iterator it = ek0Var.k.iterator();
                while (it.hasNext()) {
                    ek0Var.a(((wi0) it.next()).a());
                }
                return;
        }
    }

    public /* synthetic */ ak0(ek0 ek0Var, byte b) {
        this.X = b;
        this.Y = ek0Var;
    }
}
