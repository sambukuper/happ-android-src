package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class km2 implements AutoCloseable {
    public final qm2 X;
    public final Set Y;
    public final pv Z;

    public km2(qm2 qm2Var) {
        gb4 gb4Var = qm2Var.e;
        ArrayList arrayList = new ArrayList(xv0.Z(gb4Var, 10));
        ListIterator listIterator = gb4Var.listIterator(0);
        while (true) {
            o03 o03Var = (o03) listIterator;
            if (!o03Var.hasNext()) {
                break;
            } else {
                arrayList.add(new dl7(((om2) o03Var.next()).c));
            }
        }
        Set setC1 = wv0.c1(arrayList);
        this.X = qm2Var;
        this.Y = setC1;
        ArrayList arrayList2 = new ArrayList(xv0.Z(gb4Var, 10));
        ListIterator listIterator2 = gb4Var.listIterator(0);
        while (true) {
            o03 o03Var2 = (o03) listIterator2;
            if (!o03Var2.hasNext()) {
                wv0.c1(arrayList2);
                this.Z = nr4.e(false);
                return;
            }
            arrayList2.add(new pe5(((om2) o03Var2.next()).d));
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        g();
    }

    public final void finalize() {
        if (g()) {
            toString();
        }
    }

    public final boolean g() {
        boolean zIsTerminated;
        if (!this.Z.a()) {
            return false;
        }
        qm2 qm2Var = this.X;
        nm2 nm2Var = qm2Var.d;
        gb4 gb4Var = qm2Var.e;
        if (qv.b.decrementAndGet((qv) nm2Var.a) == 0) {
            ((ux0) nm2Var.b).V(new te5(new ve5(2)));
        }
        int iA = gb4Var.a();
        for (int i = 0; i < iA; i++) {
            om2 om2Var = (om2) gb4Var.get(i);
            if (this.Y.contains(new dl7(om2Var.c))) {
                if (qv.b.decrementAndGet((qv) om2Var.a) == 0) {
                    ((ux0) om2Var.b).V(new te5(new ve5(2)));
                    ux0 ux0Var = (ux0) om2Var.b;
                    Object obj = null;
                    if (ux0Var.S() && !ux0Var.isCancelled()) {
                        Object obj2 = ((te5) ux0Var.G()).a;
                        if (!(obj2 instanceof ve5) && obj2 != null) {
                            obj = obj2;
                        }
                    }
                    qe5 qe5Var = (z77) obj;
                    if (qe5Var != null) {
                        if (qe5Var instanceof AutoCloseable) {
                            qe5Var.close();
                        } else if (qe5Var instanceof ExecutorService) {
                            ExecutorService executorService = (ExecutorService) qe5Var;
                            if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
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
                        } else {
                            kp5.e();
                        }
                    }
                }
            }
        }
        return true;
    }

    public final String toString() {
        return this.X.toString();
    }
}
