package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wy7 implements xb4, q51 {
    public final yg1 X;
    public final if6 Y = new if6();

    public wy7(yg1 yg1Var) {
        this.X = yg1Var;
    }

    @Override // defpackage.xb4
    public final void a(Runnable runnable, Executor executor) {
        this.Y.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = this.Y.cancel(z);
        if (zCancel) {
            this.X.m(null);
        }
        return zCancel;
    }

    @Override // defpackage.q51
    public final void f(Object obj) {
        Throwable thA = sj6.a(obj);
        if6 if6Var = this.Y;
        if (thA == null) {
            if6Var.j(obj);
        } else if (thA instanceof CancellationException) {
            if6Var.cancel(false);
        } else {
            if6Var.k(thA);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.Y.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.Y.X instanceof n2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.Y.isDone();
    }

    @Override // defpackage.q51
    public final s61 w() {
        return xy7.b;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.Y.get(j, timeUnit);
    }
}
