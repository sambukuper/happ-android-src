package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ec4 {
    public final Context a;
    public final WorkerParameters b;
    public final AtomicInteger c = new AtomicInteger(-256);
    public boolean d;

    public ec4(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            bt.q("Application Context is null");
            throw null;
        }
        if (workerParameters == null) {
            bt.q("WorkerParameters is null");
            throw null;
        }
        this.a = context;
        this.b = workerParameters;
    }

    public xb4 a() {
        qd0 qd0Var = new qd0();
        qd0Var.c = new if6();
        ud0 ud0Var = new ud0(qd0Var);
        qd0Var.b = ud0Var;
        qd0Var.a = p61.class;
        try {
            qd0Var.d(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
            qd0Var.a = "default failing getForegroundInfoAsync";
            return ud0Var;
        } catch (Exception e) {
            ud0Var.b(e);
            return ud0Var;
        }
    }

    public xb4 c() {
        return u15.u(new jn0(this.b.f, new v38((Object) this, (byte) 12), (byte) 18));
    }

    public final void d(int i) {
        if (this.c.compareAndSet(-256, i)) {
            b();
        }
    }

    public void b() {
    }
}
