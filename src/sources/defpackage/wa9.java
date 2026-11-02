package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wa9 implements ServiceConnection {
    public final HashMap a = new HashMap();
    public byte b = 2;
    public boolean c;
    public IBinder d;
    public final ua9 e;
    public ComponentName f;
    public final /* synthetic */ ya9 g;

    public wa9(ya9 ya9Var, ua9 ua9Var) {
        this.g = ya9Var;
        this.e = ua9Var;
    }

    public final x11 a(String str, Executor executor) {
        try {
            Intent intentA = u99.a(this.g.b, this.e);
            this.b = (byte) 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(z99.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                ya9 ya9Var = this.g;
                d21 d21Var = ya9Var.d;
                Context context = ya9Var.b;
                ua9 ua9Var = this.e;
                boolean zC = d21Var.c(context, str, intentA, this, 4225, executor);
                this.c = zC;
                if (zC) {
                    ya9Var.c.sendMessageDelayed(ya9Var.c.obtainMessage(1, ua9Var), ya9Var.f);
                    return x11.h0;
                }
                this.b = (byte) 2;
                try {
                    ya9Var.d.b(ya9Var.b, this);
                } catch (IllegalArgumentException unused) {
                }
                return new x11(16, null, null);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (q99 e) {
            return e.X;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ya9 ya9Var = this.g;
        synchronized (ya9Var.a) {
            try {
                ya9Var.c.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = (byte) 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ya9 ya9Var = this.g;
        synchronized (ya9Var.a) {
            try {
                ya9Var.c.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = (byte) 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
