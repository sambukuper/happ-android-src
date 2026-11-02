package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c37 implements Executor {
    public final Executor Y;
    public final ArrayDeque X = new ArrayDeque();
    public final xb Z = new xb(this, (byte) 19);
    public int f0 = 1;
    public long g0 = 0;

    public c37(Executor executor) {
        executor.getClass();
        this.Y = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.X) {
            int i = this.f0;
            if (i != 4 && i != 3) {
                long j = this.g0;
                zu6 zu6Var = new zu6(runnable, (byte) 2);
                this.X.add(zu6Var);
                this.f0 = 2;
                try {
                    this.Y.execute(this.Z);
                    if (this.f0 != 2) {
                        return;
                    }
                    synchronized (this.X) {
                        try {
                            if (this.g0 == j && this.f0 == 2) {
                                this.f0 = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.X) {
                        try {
                            int i2 = this.f0;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.X.removeLastOccurrence(zu6Var)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.X.add(runnable);
        }
    }
}
