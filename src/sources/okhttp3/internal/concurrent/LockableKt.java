package okhttp3.internal.concurrent;

import defpackage.dn2;
import defpackage.em7;
import kotlin.Metadata;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u001c\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\n\u0010\u0003\u001a\u0014\u0010\u000b\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u000b\u0010\u0003\u001a8\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/concurrent/Lockable;", "Ldn8;", "wait", "(Lokhttp3/internal/concurrent/Lockable;)V", "notify", "notifyAll", _UrlKt.FRAGMENT_ENCODE_SET, "nanos", "awaitNanos", "(Lokhttp3/internal/concurrent/Lockable;J)V", "assertLockNotHeld", "assertLockHeld", "T", "Lkotlin/Function0;", "action", "withLock", "(Lokhttp3/internal/concurrent/Lockable;Ldn2;)Ljava/lang/Object;", "okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LockableKt {
    public static final void assertLockHeld(Lockable lockable) {
        lockable.getClass();
        if (!_UtilJvmKt.assertionsEnabled || Thread.holdsLock(lockable)) {
            return;
        }
        em7.e(Thread.currentThread().getName(), " MUST hold lock on ", lockable);
    }

    public static final void assertLockNotHeld(Lockable lockable) {
        lockable.getClass();
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(lockable)) {
            em7.e(Thread.currentThread().getName(), " MUST NOT hold lock on ", lockable);
        }
    }

    public static final void awaitNanos(Lockable lockable, long j) throws InterruptedException {
        lockable.getClass();
        long j2 = j / 1000000;
        long j3 = j - (1000000 * j2);
        if (j2 > 0 || j > 0) {
            lockable.wait(j2, (int) j3);
        }
    }

    public static final void notify(Lockable lockable) {
        lockable.getClass();
        lockable.notify();
    }

    public static final void notifyAll(Lockable lockable) {
        lockable.getClass();
        lockable.notifyAll();
    }

    public static final void wait(Lockable lockable) throws InterruptedException {
        lockable.getClass();
        lockable.wait();
    }

    public static final <T> T withLock(Lockable lockable, dn2 dn2Var) {
        T t;
        lockable.getClass();
        dn2Var.getClass();
        synchronized (lockable) {
            t = (T) dn2Var.invoke();
        }
        return t;
    }
}
