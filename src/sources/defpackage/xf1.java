package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xf1 implements je7 {
    public final InputStream X;
    public final ae7 Y;
    public final /* synthetic */ z47 Z;

    public xf1(z47 z47Var) {
        this.Z = z47Var;
        Socket socket = (Socket) z47Var.Y;
        this.X = socket.getInputStream();
        this.Y = new ae7(socket);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        z47 z47Var = this.Z;
        ae7 ae7Var = this.Y;
        ae7Var.enter();
        try {
            try {
                AtomicInteger atomicInteger = (AtomicInteger) z47Var.Z;
                Socket socket = (Socket) z47Var.Y;
                atomicInteger.getClass();
                while (true) {
                    int i2 = atomicInteger.get();
                    if ((i2 & 2) != 0) {
                        i = 0;
                        break;
                    }
                    int i3 = i2 | 2;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                }
                if (i == 0) {
                    ae7Var.exit();
                    return;
                }
                if (i == 3) {
                    socket.close();
                } else if (socket.isClosed() || socket.isInputShutdown()) {
                    ae7Var.exit();
                    return;
                } else {
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.X.close();
                    }
                }
                if (ae7Var.exit()) {
                    throw ae7Var.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!ae7Var.exit()) {
                    throw e;
                }
                throw ae7Var.access$newTimeoutException(e);
            }
        } catch (Throwable th) {
            ae7Var.exit();
            throw th;
        }
    }

    @Override // defpackage.je7
    public final long read(i90 i90Var, long j) throws IOException {
        i90Var.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            em7.c(ie2.f(j, "byteCount < 0: "));
            return 0L;
        }
        ae7 ae7Var = this.Y;
        ae7Var.throwIfReached();
        mz6 mz6VarU0 = i90Var.u0(1);
        int iMin = (int) Math.min(j, 8192 - mz6VarU0.c);
        try {
            ae7Var.enter();
            try {
                try {
                    int i = this.X.read(mz6VarU0.a, mz6VarU0.c, iMin);
                    if (ae7Var.exit()) {
                        throw ae7Var.access$newTimeoutException(null);
                    }
                    if (i != -1) {
                        mz6VarU0.c += i;
                        long j2 = i;
                        i90Var.Y += j2;
                        return j2;
                    }
                    if (mz6VarU0.b != mz6VarU0.c) {
                        return -1L;
                    }
                    i90Var.X = mz6VarU0.a();
                    pz6.a(mz6VarU0);
                    return -1L;
                } catch (IOException e) {
                    if (ae7Var.exit()) {
                        throw ae7Var.access$newTimeoutException(e);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                ae7Var.exit();
                throw th;
            }
        } catch (AssertionError e2) {
            if (y79.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // defpackage.je7
    public final ta8 timeout() {
        return this.Y;
    }

    public final String toString() {
        return "source(" + ((Socket) this.Z.Y) + ')';
    }
}
