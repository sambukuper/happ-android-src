package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ea9 extends g89 {
    public u10 h;
    public final int i;

    public ea9(u10 u10Var, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.h = u10Var;
        this.i = i;
    }

    @Override // defpackage.g89
    public final boolean n(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) ba9.a(parcel, Bundle.CREATOR);
            ba9.b(parcel);
            w45.t(this.h, "onPostInitComplete can be called only once per call to getRemoteService");
            u10 u10Var = this.h;
            int i3 = this.i;
            u10Var.getClass();
            ka9 ka9Var = new ka9(u10Var, i2, strongBinder, bundle);
            x99 x99Var = u10Var.e;
            x99Var.sendMessage(x99Var.obtainMessage(1, i3, -1, ka9Var));
            this.h = null;
        } else if (i == 2) {
            parcel.readInt();
            ba9.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            qa9 qa9Var = (qa9) ba9.a(parcel, qa9.CREATOR);
            ba9.b(parcel);
            u10 u10Var2 = this.h;
            w45.t(u10Var2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            w45.s(qa9Var);
            u10Var2.v = qa9Var;
            if (u10Var2 instanceof fa9) {
                c21 c21Var = qa9Var.f0;
                wl6 wl6VarP = wl6.P();
                xl6 xl6Var = c21Var == null ? null : c21Var.X;
                synchronized (wl6VarP) {
                    try {
                        if (xl6Var == null) {
                            xl6Var = wl6.f0;
                        } else {
                            xl6 xl6Var2 = (xl6) wl6VarP.Y;
                            if (xl6Var2 == null || xl6Var2.X < xl6Var.X) {
                            }
                        }
                        wl6VarP.Y = xl6Var;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Bundle bundle2 = qa9Var.X;
            w45.t(this.h, "onPostInitComplete can be called only once per call to getRemoteService");
            u10 u10Var3 = this.h;
            int i5 = this.i;
            u10Var3.getClass();
            ka9 ka9Var2 = new ka9(u10Var3, i4, strongBinder2, bundle2);
            x99 x99Var2 = u10Var3.e;
            x99Var2.sendMessage(x99Var2.obtainMessage(1, i5, -1, ka9Var2));
            this.h = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
