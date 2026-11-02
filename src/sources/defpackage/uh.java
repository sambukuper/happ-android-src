package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uh {
    public static final int[] a = {19, 16, 13, 10, 0, -2, -4, -5, -6, -8};
    public static final ThreadFactory b;

    static {
        ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        threadFactoryDefaultThreadFactory.getClass();
        b = threadFactoryDefaultThreadFactory;
    }

    public static ScheduledExecutorService a(sh shVar, int i) {
        if (i <= 0) {
            em7.c(ie2.h("Threads (", i, ") must be > 0"));
            return null;
        }
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(i, shVar);
        scheduledExecutorServiceNewScheduledThreadPool.getClass();
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static th b(ThreadFactory threadFactory, String str) {
        threadFactory.getClass();
        return new th(threadFactory, str, nr4.f(0));
    }
}
