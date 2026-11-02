package defpackage;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vb4 implements Runnable {
    public final wb4 X;

    static {
        lh4.a1("ListenableCallbackRbl");
    }

    public vb4(wb4 wb4Var) {
        this.X = wb4Var;
    }

    public static void a(r43 r43Var, Throwable th) {
        try {
            r43Var.d(th.getMessage());
        } catch (RemoteException unused) {
            lh4.P0().getClass();
        }
    }

    public static void b(r43 r43Var, byte[] bArr) {
        try {
            r43Var.i(bArr);
        } catch (RemoteException unused) {
            lh4.P0().getClass();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        wb4 wb4Var = this.X;
        r43 r43Var = (r43) wb4Var.c;
        try {
            b(r43Var, wb4Var.f(((xb4) wb4Var.d).get()));
        } catch (Throwable th) {
            a(r43Var, th);
        }
    }
}
