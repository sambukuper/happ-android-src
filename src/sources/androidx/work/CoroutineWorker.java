package androidx.work;

import android.content.Context;
import defpackage.dh3;
import defpackage.dm3;
import defpackage.ec4;
import defpackage.f71;
import defpackage.g33;
import defpackage.g71;
import defpackage.q51;
import defpackage.s61;
import defpackage.u70;
import defpackage.vr3;
import defpackage.xb4;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lec4;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "f71", "work-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CoroutineWorker extends ec4 {
    public final WorkerParameters e;
    public final f71 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
        this.f = f71.Z;
    }

    @Override // defpackage.ec4
    public final xb4 a() {
        dm3 dm3VarG = u70.g();
        f71 f71Var = this.f;
        f71Var.getClass();
        return vr3.N(g33.K(f71Var, dm3VarG), new g71(this, null, (byte) 0));
    }

    @Override // defpackage.ec4
    public final xb4 c() {
        f71 f71Var = f71.Z;
        s61 s61Var = this.f;
        if (dh3.f(s61Var, f71Var)) {
            s61Var = this.e.g;
        }
        s61Var.getClass();
        return vr3.N(s61Var.B0(u70.g()), new g71(this, null, (byte) 1));
    }

    public abstract Object e(q51 q51Var);

    @Override // defpackage.ec4
    public final void b() {
    }
}
