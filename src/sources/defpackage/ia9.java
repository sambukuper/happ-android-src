package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ia9 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ u10 b;

    public ia9(u10 u10Var, int i) {
        this.b = u10Var;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        byte b;
        int i;
        u10 u10Var = this.b;
        if (iBinder == null) {
            synchronized (u10Var.f) {
                b = u10Var.m;
            }
            if (b == 3) {
                u10Var.u = true;
                i = 5;
            } else {
                i = 4;
            }
            x99 x99Var = u10Var.e;
            x99Var.sendMessage(x99Var.obtainMessage(i, u10Var.w.get(), 16));
            return;
        }
        synchronized (u10Var.g) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                u10Var.h = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof n99)) ? new n99(iBinder) : (n99) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        u10 u10Var2 = this.b;
        int i2 = this.a;
        la9 la9Var = new la9(u10Var2, 0, null);
        x99 x99Var2 = u10Var2.e;
        x99Var2.sendMessage(x99Var2.obtainMessage(7, i2, -1, la9Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        u10 u10Var = this.b;
        synchronized (u10Var.g) {
            u10Var.h = null;
        }
        u10 u10Var2 = this.b;
        int i = this.a;
        x99 x99Var = u10Var2.e;
        x99Var.sendMessage(x99Var.obtainMessage(6, i, 1));
    }
}
