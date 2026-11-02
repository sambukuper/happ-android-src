package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b37 implements Executor {
    public static final Logger h0 = Logger.getLogger(b37.class.getName());
    public final Executor X;
    public final ArrayDeque Y = new ArrayDeque();
    public int Z = 1;
    public long f0 = 0;
    public final zo2 g0 = new zo2(this);

    public b37(Executor executor) {
        w45.s(executor);
        this.X = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        w45.s(runnable);
        synchronized (this.Y) {
            int i = this.Z;
            if (i != 4 && i != 3) {
                long j = this.f0;
                boolean z = true;
                zu6 zu6Var = new zu6(runnable, (byte) 1);
                this.Y.add(zu6Var);
                this.Z = 2;
                try {
                    this.X.execute(this.g0);
                    if (this.Z != 2) {
                        return;
                    }
                    synchronized (this.Y) {
                        try {
                            if (this.f0 == j && this.Z == 2) {
                                this.Z = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.Y) {
                        try {
                            int i2 = this.Z;
                            if ((i2 != 1 && i2 != 2) || !this.Y.removeLastOccurrence(zu6Var)) {
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
            this.Y.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.X + "}";
    }
}
