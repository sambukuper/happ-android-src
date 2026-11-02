package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jv {
    public static nv a() throws InterruptedException {
        nv nvVar = nv.queue.b[1];
        if (nvVar == null) {
            long jNanoTime = System.nanoTime();
            nv.condition.await(nv.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
            if (nv.queue.b[1] != null || System.nanoTime() - jNanoTime < nv.IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return nv.idleSentinel;
        }
        long jRemainingNanos$okio = nvVar.remainingNanos$okio(System.nanoTime());
        if (jRemainingNanos$okio > 0) {
            nv.condition.await(jRemainingNanos$okio, TimeUnit.NANOSECONDS);
            return null;
        }
        nv.queue.b(nvVar);
        nvVar.state = 2;
        return nvVar;
    }

    public static void b(nv nvVar) {
        if (nv.idleSentinel == null) {
            nv.idleSentinel = new nv();
            kv kvVar = new kv("Okio Watchdog");
            kvVar.setDaemon(true);
            kvVar.start();
        }
        nv.setTimeoutAt$okio$default(nvVar, 0L, 1, null);
        iu5 iu5Var = nv.queue;
        iu5Var.getClass();
        int i = iu5Var.a + 1;
        iu5Var.a = i;
        nv[] nvVarArr = iu5Var.b;
        if (i == nvVarArr.length) {
            nv[] nvVarArr2 = new nv[i * 2];
            eu.i0(nvVarArr, nvVarArr2, 0, 0, 14);
            iu5Var.b = nvVarArr2;
        }
        iu5Var.a(nvVar, i);
        if (nvVar.index == 1) {
            nv.condition.signal();
        }
    }
}
