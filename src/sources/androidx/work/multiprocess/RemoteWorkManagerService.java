package androidx.work.multiprocess;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.lh4;
import defpackage.td6;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteWorkManagerService extends Service {
    public td6 X;

    static {
        lh4.a1("RemoteWorkManagerService");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        lh4.P0().getClass();
        return this.X;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.X = new td6(this);
    }
}
