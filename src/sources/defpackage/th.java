package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class th implements ThreadFactory {
    public final /* synthetic */ ThreadFactory a;
    public final /* synthetic */ String b;
    public final /* synthetic */ qv c;

    public /* synthetic */ th(ThreadFactory threadFactory, String str, qv qvVar) {
        this.a = threadFactory;
        this.b = str;
        this.c = qvVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.a.newThread(runnable);
        threadNewThread.getClass();
        threadNewThread.setName(this.b + fm7.u0(2, String.valueOf(qv.b.incrementAndGet(this.c))));
        return threadNewThread;
    }
}
