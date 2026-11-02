package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.b49;
import defpackage.bd;
import defpackage.cc4;
import defpackage.dc4;
import defpackage.l08;
import defpackage.lh4;
import defpackage.n49;
import defpackage.p49;
import defpackage.ql6;
import defpackage.u15;
import defpackage.ut8;
import defpackage.x39;
import defpackage.ym1;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final cc4 e() throws IOException {
        x39 x39VarV0 = x39.v0(this.a);
        x39VarV0.getClass();
        WorkDatabase workDatabase = x39VarV0.k0;
        workDatabase.getClass();
        n49 n49VarX = workDatabase.x();
        b49 b49VarV = workDatabase.v();
        p49 p49VarY = workDatabase.y();
        l08 l08VarU = workDatabase.u();
        Object obj = x39VarV0.j0.g0;
        List list = (List) u15.G(n49VarX.a, true, false, new bd(System.currentTimeMillis() - 86400000, (byte) 5));
        ql6 ql6Var = n49VarX.a;
        List list2 = (List) u15.G(ql6Var, true, false, new ut8((byte) 25));
        List list3 = (List) u15.G(ql6Var, true, false, new ut8((byte) 22));
        if (!list.isEmpty()) {
            lh4 lh4VarP0 = lh4.P0();
            int i = ym1.a;
            lh4VarP0.getClass();
            lh4 lh4VarP1 = lh4.P0();
            ym1.a(b49VarV, p49VarY, l08VarU, list);
            lh4VarP1.getClass();
        }
        if (!list2.isEmpty()) {
            lh4 lh4VarP2 = lh4.P0();
            int i2 = ym1.a;
            lh4VarP2.getClass();
            lh4 lh4VarP3 = lh4.P0();
            ym1.a(b49VarV, p49VarY, l08VarU, list2);
            lh4VarP3.getClass();
        }
        if (!list3.isEmpty()) {
            lh4 lh4VarP4 = lh4.P0();
            int i3 = ym1.a;
            lh4VarP4.getClass();
            lh4 lh4VarP5 = lh4.P0();
            ym1.a(b49VarV, p49VarY, l08VarU, list3);
            lh4VarP5.getClass();
        }
        return dc4.b();
    }
}
