package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lp implements Executor {
    public final /* synthetic */ byte X;
    public final ArrayDeque Y;
    public Runnable Z;
    public final Object f0;
    public final Executor g0;

    public lp(Executor executor) {
        this.X = (byte) 1;
        executor.getClass();
        this.g0 = executor;
        this.Y = new ArrayDeque();
        this.f0 = new Object();
    }

    public final void a() {
        switch (this.X) {
            case 0:
                synchronized (this.f0) {
                    try {
                        Runnable runnable = (Runnable) this.Y.poll();
                        this.Z = runnable;
                        if (runnable != null) {
                            ((dp1) this.g0).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f0) {
                    Object objPoll = this.Y.poll();
                    Runnable runnable2 = (Runnable) objPoll;
                    this.Z = runnable2;
                    if (objPoll != null) {
                        this.g0.execute(runnable2);
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.X) {
            case 0:
                synchronized (this.f0) {
                    try {
                        this.Y.add(new sc(this, runnable, (byte) 2));
                        if (this.Z == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                runnable.getClass();
                synchronized (this.f0) {
                    this.Y.offer(new sc4(runnable, this, (byte) 18));
                    if (this.Z == null) {
                        a();
                    }
                    break;
                }
                return;
        }
    }

    public lp(dp1 dp1Var) {
        this.X = (byte) 0;
        this.f0 = new Object();
        this.Y = new ArrayDeque();
        this.g0 = dp1Var;
    }
}
