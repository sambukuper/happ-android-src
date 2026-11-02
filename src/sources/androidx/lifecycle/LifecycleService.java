package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.d94;
import defpackage.f63;
import defpackage.g94;
import defpackage.n84;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/LifecycleService;", "Landroid/app/Service;", "Ld94;", "lifecycle-service"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class LifecycleService extends Service implements d94 {
    public final f63 X = new f63(this);

    @Override // defpackage.d94
    /* JADX INFO: renamed from: h */
    public final g94 getH0() {
        return (g94) this.X.Y;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        f63 f63Var = this.X;
        f63Var.getClass();
        f63Var.x(n84.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        f63 f63Var = this.X;
        f63Var.getClass();
        f63Var.x(n84.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        f63 f63Var = this.X;
        f63Var.getClass();
        f63Var.x(n84.ON_STOP);
        f63Var.x(n84.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        f63 f63Var = this.X;
        f63Var.getClass();
        f63Var.x(n84.ON_START);
        super.onStart(intent, i);
    }
}
