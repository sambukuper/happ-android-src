package io.sentry;

import defpackage.x43;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    public static volatile q0 g;
    public static final io.sentry.util.a h = new io.sentry.util.a();
    public final int a;
    public volatile String b;
    public volatile long c;
    public final AtomicBoolean d;
    public final o0 e;
    public final ThreadPoolExecutor f;

    public q0() {
        o0 o0Var = new o0((byte) 0);
        this.d = new AtomicBoolean(false);
        this.a = 18000000;
        this.e = o0Var;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new p0((byte) 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f = threadPoolExecutor;
        a();
    }

    public final void a() {
        try {
            try {
                this.f.submit(new x43(this, (byte) 2)).get(1000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                this.c = System.currentTimeMillis() + 1000;
            } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
                this.c = System.currentTimeMillis() + 1000;
            }
        } catch (RejectedExecutionException unused3) {
            this.d.set(false);
            this.c = System.currentTimeMillis() + 1000;
        }
    }
}
