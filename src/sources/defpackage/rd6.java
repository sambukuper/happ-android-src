package defpackage;

import androidx.work.multiprocess.RemoteWorkManagerClient;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rd6 implements Runnable {
    public final RemoteWorkManagerClient X;

    static {
        lh4.a1("SessionHandler");
    }

    public rd6(RemoteWorkManagerClient remoteWorkManagerClient) {
        this.X = remoteWorkManagerClient;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.X.f;
        synchronized (this.X.e) {
            try {
                long j2 = this.X.f;
                qd6 qd6Var = this.X.a;
                if (qd6Var != null) {
                    if (j == j2) {
                        lh4.P0().getClass();
                        this.X.b.unbindService(qd6Var);
                        lh4.P0().getClass();
                        qd6Var.a.h(new RuntimeException("Binding died"));
                        qd6Var.b.d();
                    } else {
                        lh4.P0().getClass();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
