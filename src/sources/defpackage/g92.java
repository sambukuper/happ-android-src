package defpackage;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g92 implements Closeable {
    public boolean X;
    public int Y;
    public final ReentrantLock Z = new ReentrantLock();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.Z;
        reentrantLock.lock();
        try {
            if (this.X) {
                reentrantLock.unlock();
                return;
            }
            this.X = true;
            if (this.Y != 0) {
                reentrantLock.unlock();
            } else {
                reentrantLock.unlock();
                g();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public abstract void g();

    public abstract int k(long j, byte[] bArr, int i, int i2);

    public abstract long m();

    public final f92 p(long j) {
        ReentrantLock reentrantLock = this.Z;
        reentrantLock.lock();
        try {
            if (this.X) {
                throw new IllegalStateException("closed");
            }
            this.Y++;
            reentrantLock.unlock();
            return new f92(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        ReentrantLock reentrantLock = this.Z;
        reentrantLock.lock();
        try {
            if (this.X) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            return m();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
