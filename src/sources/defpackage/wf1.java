package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wf1 implements sa7 {
    public final OutputStream X;
    public final ae7 Y;
    public final /* synthetic */ z47 Z;

    public wf1(z47 z47Var) {
        this.Z = z47Var;
        Socket socket = (Socket) z47Var.Y;
        this.X = socket.getOutputStream();
        this.Y = new ae7(socket);
    }

    @Override // defpackage.sa7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        OutputStream outputStream = this.X;
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
                    if ((i2 & 1) != 0) {
                        i = 0;
                        break;
                    }
                    int i3 = i2 | 1;
                    if (atomicInteger.compareAndSet(i2, i3)) {
                        i = i3;
                        break;
                    }
                }
                if (i == 0) {
                    ae7Var.exit();
                    return;
                }
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    ae7Var.exit();
                    return;
                }
                socket.close();
                if (ae7Var.exit()) {
                    throw ae7Var.access$newTimeoutException(null);
                }
            } catch (Throwable th) {
                ae7Var.exit();
                throw th;
            }
        } catch (IOException e) {
            if (!ae7Var.exit()) {
                throw e;
            }
            throw ae7Var.access$newTimeoutException(e);
        }
    }

    @Override // defpackage.sa7, java.io.Flushable
    public final void flush() throws IOException {
        ae7 ae7Var = this.Y;
        ae7Var.enter();
        try {
            try {
                this.X.flush();
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

    @Override // defpackage.sa7
    public final ta8 timeout() {
        return this.Y;
    }

    public final String toString() {
        return "sink(" + ((Socket) this.Z.Y) + ')';
    }

    @Override // defpackage.sa7
    public final void write(i90 i90Var, long j) throws IOException {
        i90Var.getClass();
        os4.i(i90Var.Y, 0L, j);
        while (j > 0) {
            ae7 ae7Var = this.Y;
            ae7Var.throwIfReached();
            mz6 mz6Var = i90Var.X;
            mz6Var.getClass();
            int iMin = (int) Math.min(j, mz6Var.c - mz6Var.b);
            ae7Var.enter();
            try {
                try {
                    this.X.write(mz6Var.a, mz6Var.b, iMin);
                    if (ae7Var.exit()) {
                        throw ae7Var.access$newTimeoutException(null);
                    }
                    int i = mz6Var.b + iMin;
                    mz6Var.b = i;
                    long j2 = iMin;
                    j -= j2;
                    i90Var.Y -= j2;
                    if (i == mz6Var.c) {
                        i90Var.X = mz6Var.a();
                        pz6.a(mz6Var);
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
    }
}
