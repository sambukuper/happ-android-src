package androidx.media;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import defpackage.dh3;
import defpackage.hs4;
import defpackage.is4;
import defpackage.js4;
import defpackage.y5;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    public y5 X;

    public abstract dh3 a();

    public abstract void b();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return ((js4) this.X.Z).onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        y5 y5Var;
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            y5Var = new is4(this);
            this.X = y5Var;
        } else if (i >= 26) {
            y5Var = new hs4(this);
            this.X = y5Var;
        } else {
            y5Var = new y5(this);
            this.X = y5Var;
        }
        y5Var.W();
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
