package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n23 extends nv {
    public final /* synthetic */ o23 a;

    public n23(o23 o23Var) {
        this.a = o23Var;
    }

    public final void exitAndThrowIfTimedOut() {
        if (exit()) {
            throw newTimeoutException(null);
        }
    }

    @Override // defpackage.nv
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // defpackage.nv
    public final void timedOut() {
        this.a.e(9);
        h23 h23Var = this.a.b;
        synchronized (h23Var) {
            long j = h23Var.p0;
            long j2 = h23Var.o0;
            if (j < j2) {
                return;
            }
            h23Var.o0 = j2 + 1;
            h23Var.q0 = System.nanoTime() + 1000000000;
            h23Var.j0.c(new f23((byte) 0, h23Var, oi0.p(new StringBuilder(), h23Var.Z, " ping")), 0L);
        }
    }
}
