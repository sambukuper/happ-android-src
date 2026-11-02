package androidx.work.multiprocess;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.ec4;
import defpackage.if6;
import defpackage.lh4;
import defpackage.p61;
import defpackage.qd0;
import defpackage.ud0;
import defpackage.xb4;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class RemoteListenableWorker extends ec4 {
    static {
        lh4.a1("RemoteListenableWorker");
    }

    public RemoteListenableWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // defpackage.ec4
    public final xb4 c() {
        qd0 qd0Var = new qd0();
        qd0Var.c = new if6();
        ud0 ud0Var = new ud0(qd0Var);
        qd0Var.b = ud0Var;
        qd0Var.a = p61.class;
        try {
            lh4.P0().getClass();
            qd0Var.d(new IllegalArgumentException("startWork() shouldn't never be called on RemoteListenableWorker"));
            qd0Var.a = "RemoteListenableWorker Failed Future";
            return ud0Var;
        } catch (Exception e) {
            ud0Var.b(e);
            return ud0Var;
        }
    }

    public abstract xb4 e();
}
