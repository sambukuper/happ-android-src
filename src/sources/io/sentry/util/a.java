package io.sentry.util;

import defpackage.iu;
import io.sentry.n1;
import java.util.concurrent.locks.ReentrantLock;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n1 {
    public static final /* synthetic */ long Y = iu.a.objectFieldOffset(a.class.getDeclaredField("X"));
    public volatile ReentrantLock X;

    @Override // java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.X;
        b.s(reentrantLock, "close() called before acquire()");
        reentrantLock.unlock();
    }

    public final void g() {
        ReentrantLock reentrantLock = this.X;
        if (reentrantLock == null) {
            ReentrantLock reentrantLock2 = new ReentrantLock();
            while (true) {
                Unsafe unsafe = iu.a;
                long j = Y;
                a aVar = this;
                if (unsafe.compareAndSwapObject(aVar, j, (Object) null, reentrantLock2)) {
                    reentrantLock = reentrantLock2;
                    break;
                } else {
                    if (unsafe.getObjectVolatile(aVar, j) != null) {
                        reentrantLock = aVar.X;
                        b.s(reentrantLock, "lock must have been set by the winning thread");
                        break;
                    }
                    this = aVar;
                }
            }
        }
        reentrantLock.lock();
    }
}
