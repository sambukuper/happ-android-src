package com.github.luben.zstd;

import defpackage.bt;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
abstract class AutoCloseBase implements Closeable {
    private static final int SHARED_LOCK_CLOSED = -1;
    private static final AtomicIntegerFieldUpdater<AutoCloseBase> SHARED_LOCK_UPDATER = AtomicIntegerFieldUpdater.newUpdater(AutoCloseBase.class, "sharedLock");
    private volatile int sharedLock;

    public void acquireSharedLock() {
        int i;
        do {
            i = this.sharedLock;
            if (i < 0) {
                bt.i("Closed");
                return;
            } else if (i == Integer.MAX_VALUE) {
                bt.i("Shared lock overflow");
                return;
            }
        } while (!SHARED_LOCK_UPDATER.compareAndSet(this, i, i + 1));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.sharedLock == SHARED_LOCK_CLOSED) {
                    return;
                }
                if (!SHARED_LOCK_UPDATER.compareAndSet(this, 0, SHARED_LOCK_CLOSED)) {
                    throw new IllegalStateException("Attempt to close while in use");
                }
                doClose();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void doClose();

    public void releaseSharedLock() {
        int i;
        do {
            i = this.sharedLock;
            if (i < 0) {
                bt.i("Closed");
                return;
            } else if (i == 0) {
                bt.i("Shared lock underflow");
                return;
            }
        } while (!SHARED_LOCK_UPDATER.compareAndSet(this, i, i + SHARED_LOCK_CLOSED));
    }

    public void storeFence() {
        this.sharedLock = 0;
    }
}
