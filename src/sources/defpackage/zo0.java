package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zo0 extends yo2 implements Runnable {
    public vu Z;
    public final LinkedBlockingQueue f0 = new LinkedBlockingQueue(1);
    public final CountDownLatch g0 = new CountDownLatch(1);
    public xb4 h0;
    public volatile xb4 i0;

    public zo0(vu vuVar, xb4 xb4Var) {
        this.Z = vuVar;
        xb4Var.getClass();
        this.h0 = xb4Var;
    }

    public static Object c(LinkedBlockingQueue linkedBlockingQueue) {
        Object objTake;
        boolean z = false;
        while (true) {
            try {
                objTake = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return objTake;
    }

    @Override // defpackage.yo2, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.X.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.f0.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        xb4 xb4Var = this.h0;
        if (xb4Var != null) {
            xb4Var.cancel(z);
        }
        xb4 xb4Var2 = this.i0;
        if (xb4Var2 != null) {
            xb4Var2.cancel(z);
        }
        return true;
    }

    @Override // defpackage.yo2, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.X.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            xb4 xb4Var = this.h0;
            if (xb4Var != null) {
                long jNanoTime = System.nanoTime();
                xb4Var.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (!this.g0.await(j, timeUnit)) {
                throw new TimeoutException();
            }
            j -= Math.max(0L, System.nanoTime() - jNanoTime2);
            xb4 xb4Var2 = this.i0;
            if (xb4Var2 != null) {
                xb4Var2.get(j, timeUnit);
            }
        }
        return this.X.get(j, timeUnit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, yo2, zo0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [zo0] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3, types: [yo2] */
    /* JADX WARN: Type inference failed for: r5v4, types: [zo0] */
    /* JADX WARN: Type inference failed for: r5v6, types: [yo2] */
    /* JADX WARN: Type inference failed for: r5v7, types: [yo2] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.concurrent.CountDownLatch] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            xb4 r2 = r5.h0     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39 java.util.concurrent.ExecutionException -> L49 java.util.concurrent.CancellationException -> L56
            java.lang.Object r2 = defpackage.vr3.E(r2)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39 java.util.concurrent.ExecutionException -> L49 java.util.concurrent.CancellationException -> L56
            vu r3 = r5.Z     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            xb4 r2 = r3.apply(r2)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r5.i0 = r2     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            xb4 r3 = r5.X     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            boolean r3 = r3.isCancelled()     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            if (r3 == 0) goto L3b
            java.util.concurrent.LinkedBlockingQueue r0 = r5.f0     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            java.lang.Object r0 = c(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r2.cancel(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r5.i0 = r1     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
        L29:
            r5.Z = r1
            r5.h0 = r1
            java.util.concurrent.CountDownLatch r5 = r5.g0
            r5.countDown()
            return
        L33:
            r0 = move-exception
            goto L80
        L35:
            r0 = move-exception
            goto L5a
        L37:
            r0 = move-exception
            goto L6b
        L39:
            r0 = move-exception
            goto L73
        L3b:
            zo2 r3 = new zo2     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r4 = 7
            r3.<init>(r4, r5, r2, r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            dp1 r0 = defpackage.dp1.a()     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r2.a(r3, r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            goto L29
        L49:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            qd0 r2 = r5.Y     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            if (r2 == 0) goto L29
            r2.d(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            goto L29
        L56:
            r5.cancel(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            goto L29
        L5a:
            qd0 r2 = r5.Y     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L61
            r2.d(r0)     // Catch: java.lang.Throwable -> L33
        L61:
            r5.Z = r1
            r5.h0 = r1
            java.util.concurrent.CountDownLatch r5 = r5.g0
            r5.countDown()
            goto L7f
        L6b:
            qd0 r2 = r5.Y     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L61
            r2.d(r0)     // Catch: java.lang.Throwable -> L33
            goto L61
        L73:
            java.lang.Throwable r0 = r0.getCause()     // Catch: java.lang.Throwable -> L33
            qd0 r2 = r5.Y     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L61
            r2.d(r0)     // Catch: java.lang.Throwable -> L33
            goto L61
        L7f:
            return
        L80:
            r5.Z = r1
            r5.h0 = r1
            java.util.concurrent.CountDownLatch r5 = r5.g0
            r5.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo0.run():void");
    }

    @Override // defpackage.yo2, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (!this.X.isDone()) {
            xb4 xb4Var = this.h0;
            if (xb4Var != null) {
                xb4Var.get();
            }
            this.g0.await();
            xb4 xb4Var2 = this.i0;
            if (xb4Var2 != null) {
                xb4Var2.get();
            }
        }
        return this.X.get();
    }
}
