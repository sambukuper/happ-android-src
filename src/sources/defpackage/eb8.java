package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eb8 implements Runnable {
    public final /* synthetic */ byte X;
    public final xb4 Y;
    public final mm0 Z;

    public /* synthetic */ eb8(xb4 xb4Var, mm0 mm0Var, byte b) {
        this.X = b;
        this.Y = xb4Var;
        this.Z = mm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        mm0 mm0Var = this.Z;
        xb4 xb4Var = this.Y;
        switch (b) {
            case 0:
                if (xb4Var.isCancelled()) {
                    mm0Var.z(null);
                    return;
                }
                boolean z = false;
                while (true) {
                    try {
                        try {
                            Object obj = xb4Var.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            mm0Var.f(obj);
                            return;
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            cause.getClass();
                            mm0Var.f(new rj6(cause));
                            return;
                        }
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                break;
            default:
                if (xb4Var.isCancelled()) {
                    mm0Var.z(null);
                    return;
                }
                try {
                    mm0Var.f(u2.g(xb4Var));
                    return;
                } catch (ExecutionException e2) {
                    Throwable cause2 = e2.getCause();
                    cause2.getClass();
                    mm0Var.f(new rj6(cause2));
                    return;
                }
        }
    }
}
