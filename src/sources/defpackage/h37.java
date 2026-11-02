package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h37 implements Executor {
    public final Executor Y;
    public Runnable Z;
    public final ArrayDeque X = new ArrayDeque();
    public final Object f0 = new Object();

    static {
        lh4.a1("SerialExecutorImpl");
    }

    public h37(Executor executor) {
        this.Y = executor;
    }

    public final void a() {
        Runnable runnable = (Runnable) this.X.poll();
        this.Z = runnable;
        if (runnable != null) {
            try {
                this.Y.execute(runnable);
            } catch (Throwable th) {
                lh4.P0().getClass();
                this.Z = null;
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f0) {
            try {
                this.X.add(new zo2(this, runnable, (byte) 14));
                if (this.Z == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
