package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b59 {
    public static final /* synthetic */ int a = 0;

    static {
        lh4.a1("WorkerWrapper");
    }

    public static final Object a(xb4 xb4Var, ec4 ec4Var, uy7 uy7Var) {
        Object obj;
        try {
            boolean z = false;
            if (!xb4Var.isDone()) {
                mm0 mm0Var = new mm0(1, mb6.H(uy7Var));
                mm0Var.s();
                xb4Var.a(new eb8(xb4Var, mm0Var, (byte) 0), cp1.X);
                mm0Var.u(new d3(ec4Var, xb4Var, (byte) 19));
                return mm0Var.q();
            }
            while (true) {
                try {
                    obj = xb4Var.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
