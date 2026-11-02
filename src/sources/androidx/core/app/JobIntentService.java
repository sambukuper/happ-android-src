package androidx.core.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import defpackage.bt;
import defpackage.em3;
import defpackage.fm3;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class JobIntentService extends Service {
    public static final HashMap Y = new HashMap();
    public fm3 X;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        fm3 fm3Var = this.X;
        if (fm3Var != null) {
            return fm3Var.a();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.X = new fm3(this);
            return;
        }
        this.X = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap map = Y;
        if (((em3) map.get(componentName)) == null) {
            if (i >= 26) {
                bt.q("Can't be here without a job id");
                return;
            }
            em3 em3Var = new em3();
            getApplicationContext();
            PowerManager powerManager = (PowerManager) getSystemService("power");
            powerManager.newWakeLock(1, componentName.getClassName() + ":launch").setReferenceCounted(false);
            powerManager.newWakeLock(1, componentName.getClassName() + ":run").setReferenceCounted(false);
            map.put(componentName, em3Var);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
