package defpackage;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class om2 extends v3 implements me5 {
    public final int c;
    public final int d;
    public final qv e;
    public final /* synthetic */ qm2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om2(qm2 qm2Var, int i, int i2, qv qvVar) {
        super((byte) 3);
        this.f = qm2Var;
        this.c = i;
        this.d = i2;
        this.e = qvVar;
    }

    @Override // defpackage.me5
    public final void b(Object obj) {
        int i;
        Object obj2;
        pm2 pm2Var;
        AutoCloseable autoCloseableV0;
        boolean zIsTerminated;
        pm2 pm2Var2 = pm2.f0;
        boolean z = obj instanceof ve5;
        qe5 qe5Var = (qe5) ((z || obj == null) ? null : obj);
        if (qe5Var != null) {
            if (qe5Var instanceof z77) {
                autoCloseableV0 = ((z77) qe5Var).V0();
            } else {
                z77 z77Var = (z77) qe5Var.C0(yb6.a.b(z77.class));
                autoCloseableV0 = z77Var != null ? z77Var.V0() : new z77(qe5Var, new f63(qe5Var));
            }
            if (!((ux0) this.b).V(new te5(autoCloseableV0))) {
                if (autoCloseableV0 instanceof AutoCloseable) {
                    autoCloseableV0.close();
                } else {
                    if (!(autoCloseableV0 instanceof ExecutorService)) {
                        kp5.e();
                        return;
                    }
                    ExecutorService executorService = (ExecutorService) autoCloseableV0;
                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z2 = false;
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z2) {
                                    executorService.shutdownNow();
                                    z2 = true;
                                }
                            }
                        }
                        if (z2) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        } else {
            ux0 ux0Var = (ux0) this.b;
            if (z || obj == null) {
                i = obj == null ? 2 : ((ve5) obj).a;
            } else {
                i = 1;
            }
            ux0Var.V(new te5(new ve5(i)));
        }
        qv qvVar = this.e;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = qv.b;
        if (atomicIntegerFieldUpdater.decrementAndGet(qvVar) == 0) {
            Iterator it = this.f.h.iterator();
            it.getClass();
            if (it.hasNext()) {
                throw p61.k(it);
            }
            qm2 qm2Var = this.f;
            qv qvVar2 = qm2Var.g;
            qvVar2.getClass();
            if (atomicIntegerFieldUpdater.decrementAndGet(qvVar2) != 0) {
                return;
            }
            tv tvVar = qm2Var.f;
            do {
                obj2 = tvVar.a;
                pm2 pm2Var3 = (pm2) obj2;
                int iOrdinal = pm2Var3.ordinal();
                if (iOrdinal == 0) {
                    pm2Var = pm2.Z;
                } else {
                    if (iOrdinal != 1) {
                        throw new IllegalStateException("Unexpected frame state for " + qm2Var + "! State is " + pm2Var3 + ' ');
                    }
                    pm2Var = pm2Var2;
                }
            } while (!tvVar.a(obj2, pm2Var));
            Iterator it2 = qm2Var.h.iterator();
            it2.getClass();
            if (it2.hasNext()) {
                throw p61.k(it2);
            }
            if (pm2Var == pm2Var2) {
                Iterator it3 = qm2Var.h.iterator();
                it3.getClass();
                if (it3.hasNext()) {
                    throw p61.k(it3);
                }
            }
        }
    }
}
