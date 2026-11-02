package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nf1 extends s52 {
    public static final nf1 f0;
    public a71 Z;

    static {
        int i = h28.c;
        int i2 = h28.d;
        long j = h28.e;
        String str = h28.a;
        nf1 nf1Var = new nf1();
        nf1Var.Z = new a71(j, str, i, i2);
        f0 = nf1Var;
    }

    @Override // defpackage.u61
    public final void Z0(s61 s61Var, Runnable runnable) {
        a71.m(this.Z, runnable, 6);
    }

    @Override // defpackage.u61
    public final void a1(s61 s61Var, Runnable runnable) {
        a71.m(this.Z, runnable, 2);
    }

    @Override // defpackage.u61
    public final u61 c1(int i) {
        z51.r(i);
        return i >= h28.c ? this : super.c1(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.s52
    public final Executor d1() {
        return this.Z;
    }

    @Override // defpackage.u61
    public final String toString() {
        return "Dispatchers.Default";
    }
}
