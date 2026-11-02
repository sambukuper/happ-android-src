package defpackage;

import android.content.res.TypedArray;
import android.media.Image;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z77 implements qe5 {
    public final qe5 X;
    public final f63 Y;
    public final pv Z = nr4.e(false);

    public z77(qe5 qe5Var, f63 f63Var) {
        this.X = qe5Var;
        this.Y = f63Var;
    }

    @Override // defpackage.bo8
    public final Object C0(zu3 zu3Var) {
        zu3Var.getClass();
        if (this.Z.b()) {
            return null;
        }
        zb6 zb6Var = yb6.a;
        if (zu3Var.equals(zb6Var.b(z77.class)) || zu3Var.equals(zb6Var.b(qe5.class)) || zu3Var.equals(zb6Var.b(k73.class))) {
            return this;
        }
        if (!zu3Var.equals(zb6Var.b(Image.class))) {
            return this.X.C0(zu3Var);
        }
        throw new UnsupportedOperationException("Cannot unwrap " + this + " as android.media.Image. Use setFinalizerinstead and close all outstanding references.");
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    public final z77 V0() {
        int i;
        int i2;
        z77 z77Var;
        if (this.Z.b()) {
            z77Var = null;
        } else {
            f63 f63Var = this.Y;
            qv qvVar = (qv) f63Var.Z;
            do {
                i = qvVar.a;
                i2 = i == 0 ? 0 : i + 1;
            } while (!iu.a.compareAndSwapInt(qvVar, qv.c, i, i2));
            if ((i2 != 0 ? (qe5) f63Var.Y : null) != null) {
                z77Var = new z77(this.X, this.Y);
            } else {
                z77Var = null;
            }
        }
        if (z77Var != null) {
            return z77Var;
        }
        bt.i("Required value was null.");
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean zIsTerminated;
        if (this.Z.a()) {
            f63 f63Var = this.Y;
            if (qv.b.decrementAndGet((qv) f63Var.Z) == 0) {
                ((zu0) ((tv) f63Var.f0).b(null)).getClass();
                AutoCloseable autoCloseable = (qe5) f63Var.Y;
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                    return;
                }
                if (!(autoCloseable instanceof ExecutorService)) {
                    if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                        return;
                    }
                    if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                        return;
                    } else if (autoCloseable instanceof MediaDrm) {
                        ((MediaDrm) autoCloseable).release();
                        return;
                    } else {
                        kp5.e();
                        return;
                    }
                }
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                    return;
                }
                executorService.shutdown();
                boolean z = false;
                while (!zIsTerminated) {
                    try {
                        zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            executorService.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final String toString() {
        return this.X.toString();
    }
}
