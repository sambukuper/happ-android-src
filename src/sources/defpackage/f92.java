package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f92 implements je7 {
    public final g92 X;
    public long Y;
    public boolean Z;

    public f92(g92 g92Var, long j) {
        this.X = g92Var;
        this.Y = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        g92 g92Var = this.X;
        ReentrantLock reentrantLock = g92Var.Z;
        reentrantLock.lock();
        try {
            int i = g92Var.Y - 1;
            g92Var.Y = i;
            if (i == 0 && g92Var.X) {
                reentrantLock.unlock();
                g92Var.g();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.je7
    public final long read(i90 i90Var, long j) {
        long j2;
        long j3;
        i90Var.getClass();
        if (this.Z) {
            bt.i("closed");
            return 0L;
        }
        long j4 = this.Y;
        if (j < 0) {
            em7.c(ie2.f(j, "byteCount < 0: "));
            return 0L;
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 < j5) {
                mz6 mz6VarU0 = i90Var.u0(1);
                byte[] bArr = mz6VarU0.a;
                int i = mz6VarU0.c;
                j2 = -1;
                int iK = this.X.k(j6, bArr, i, (int) Math.min(j5 - j6, 8192 - i));
                if (iK == -1) {
                    if (mz6VarU0.b == mz6VarU0.c) {
                        i90Var.X = mz6VarU0.a();
                        pz6.a(mz6VarU0);
                    }
                    if (j4 == j6) {
                        j3 = -1;
                        break;
                    }
                } else {
                    mz6VarU0.c += iK;
                    long j7 = iK;
                    j6 += j7;
                    i90Var.Y += j7;
                }
            } else {
                j2 = -1;
            }
            j3 = j6 - j4;
            break;
        }
        if (j3 != j2) {
            this.Y += j3;
        }
        return j3;
    }

    @Override // defpackage.je7
    public final ta8 timeout() {
        return ta8.NONE;
    }
}
