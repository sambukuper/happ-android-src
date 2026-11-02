package androidx.work.multiprocess;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.ec4;
import defpackage.gd6;
import defpackage.jc4;
import defpackage.m51;
import defpackage.o61;
import defpackage.u61;
import defpackage.x39;
import defpackage.xb4;
import defpackage.xy7;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/multiprocess/RemoteListenableDelegatingWorker;", "Lec4;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-multiprocess"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteListenableDelegatingWorker extends ec4 {
    public final Context e;
    public final WorkerParameters f;
    public final jc4 g;
    public ComponentName h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteListenableDelegatingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = context;
        this.f = workerParameters;
        this.g = new jc4(context, workerParameters.f);
    }

    @Override // defpackage.ec4
    public final xb4 a() {
        x39 x39VarV0 = x39.v0(this.e.getApplicationContext());
        x39VarV0.getClass();
        u61 u61Var = (u61) x39VarV0.l0.Z;
        u61Var.getClass();
        m51 m51Var = xy7.a;
        return xy7.a(u61Var, true, new gd6(this, null, this, (byte) 0));
    }

    @Override // defpackage.ec4
    public final void b() {
        ComponentName componentName = this.h;
        if (componentName != null) {
            this.g.a(componentName, new o61(this, (byte) 21));
        }
    }

    @Override // defpackage.ec4
    public final xb4 c() {
        x39 x39VarV0 = x39.v0(this.e.getApplicationContext());
        x39VarV0.getClass();
        u61 u61Var = (u61) x39VarV0.l0.Z;
        u61Var.getClass();
        m51 m51Var = xy7.a;
        return xy7.a(u61Var, true, new gd6(this, null, this, (byte) 1));
    }
}
