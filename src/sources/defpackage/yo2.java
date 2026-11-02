package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class yo2 implements xb4 {
    public final xb4 X;
    public qd0 Y;

    public yo2() {
        this.X = u15.u(new q02((Object) this, (byte) 5));
    }

    public static yo2 b(xb4 xb4Var) {
        return xb4Var instanceof yo2 ? (yo2) xb4Var : new yo2(xb4Var);
    }

    @Override // defpackage.xb4
    public final void a(Runnable runnable, Executor executor) {
        this.X.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.X.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.X.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.X.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.X.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.X.get(j, timeUnit);
    }

    public yo2(xb4 xb4Var) {
        xb4Var.getClass();
        this.X = xb4Var;
    }
}
