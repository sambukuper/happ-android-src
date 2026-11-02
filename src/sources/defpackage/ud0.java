package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ud0 implements xb4 {
    public final WeakReference X;
    public final td0 Y = new td0(this);

    public ud0(qd0 qd0Var) {
        this.X = new WeakReference(qd0Var);
    }

    @Override // defpackage.xb4
    public final void a(Runnable runnable, Executor executor) {
        this.Y.a(runnable, executor);
    }

    public final boolean b(Throwable th) {
        return this.Y.k(th);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        qd0 qd0Var = (qd0) this.X.get();
        boolean zCancel = this.Y.cancel(z);
        if (zCancel && qd0Var != null) {
            qd0Var.a = null;
            qd0Var.b = null;
            qd0Var.c.j(null);
        }
        return zCancel;
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

    public final String toString() {
        return this.Y.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.Y.get(j, timeUnit);
    }
}
