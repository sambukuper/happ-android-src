package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u94 extends u61 implements kh1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater j0 = AtomicIntegerFieldUpdater.newUpdater(u94.class, "runningWorkers$volatile");
    public static final /* synthetic */ long k0 = iu.a.objectFieldOffset(u94.class.getDeclaredField("runningWorkers$volatile"));
    public final /* synthetic */ kh1 Z;
    public final u61 f0;
    public final int g0;
    public final xe4 h0;
    public final Object i0;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public u94(u61 u61Var, int i) {
        kh1 kh1Var = u61Var instanceof kh1 ? (kh1) u61Var : null;
        this.Z = kh1Var == null ? ne1.a : kh1Var;
        this.f0 = u61Var;
        this.g0 = i;
        this.h0 = new xe4();
        this.i0 = new Object();
    }

    @Override // defpackage.kh1
    public final gq1 X(long j, Runnable runnable, s61 s61Var) {
        return this.Z.X(j, runnable, s61Var);
    }

    @Override // defpackage.u61
    public final void Z0(s61 s61Var, Runnable runnable) {
        Runnable runnableD1;
        this.h0.a(runnable);
        if (iu.a.getIntVolatile(this, k0) >= this.g0 || !e1() || (runnableD1 = d1()) == null) {
            return;
        }
        try {
            op1.b(this.f0, this, new zo2((byte) 9, this, runnableD1, false));
        } catch (Throwable th) {
            j0.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.u61
    public final void a1(s61 s61Var, Runnable runnable) {
        Runnable runnableD1;
        this.h0.a(runnable);
        if (iu.a.getIntVolatile(this, k0) >= this.g0 || !e1() || (runnableD1 = d1()) == null) {
            return;
        }
        try {
            this.f0.a1(this, new zo2((byte) 9, this, runnableD1, false));
        } catch (Throwable th) {
            j0.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.u61
    public final u61 c1(int i) {
        z51.r(i);
        return i >= this.g0 ? this : super.c1(i);
    }

    public final Runnable d1() {
        while (true) {
            Runnable runnable = (Runnable) this.h0.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.i0) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j0;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.h0.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean e1() {
        synchronized (this.i0) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j0;
            if (iu.a.getIntVolatile(this, k0) >= this.g0) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.u61
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f0);
        sb.append(".limitedParallelism(");
        return pc6.r(sb, this.g0, ')');
    }

    @Override // defpackage.kh1
    public final void u0(long j, mm0 mm0Var) {
        this.Z.u0(j, mm0Var);
    }
}
