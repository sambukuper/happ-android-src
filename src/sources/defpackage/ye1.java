package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ye1 extends s52 implements Executor {
    public static final ye1 Z = new ye1();
    public static final u61 f0;

    static {
        ln8 ln8Var = ln8.Z;
        int i = r08.a;
        if (64 >= i) {
            i = 64;
        }
        f0 = ln8Var.c1(s08.j(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // defpackage.u61
    public final void Z0(s61 s61Var, Runnable runnable) {
        f0.Z0(s61Var, runnable);
    }

    @Override // defpackage.u61
    public final void a1(s61 s61Var, Runnable runnable) {
        f0.a1(s61Var, runnable);
    }

    @Override // defpackage.u61
    public final u61 c1(int i) {
        return ln8.Z.c1(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Z0(b02.X, runnable);
    }

    @Override // defpackage.u61
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.s52
    public final Executor d1() {
        return this;
    }
}
