package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zy4 extends Binder implements j43 {
    public final /* synthetic */ MultiInstanceInvalidationService g;

    public zy4(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.g = multiInstanceInvalidationService;
        attachInterface(this, j43.c);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        az4 az4Var;
        String str = j43.c;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        int i3 = 0;
        i43 i43Var = null;
        i43 i43Var2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(i43.b);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof i43)) {
                    h43 h43Var = new h43();
                    h43Var.g = strongBinder;
                    i43Var = h43Var;
                } else {
                    i43Var = (i43) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            i43Var.getClass();
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.g;
                synchronized (multiInstanceInvalidationService.Z) {
                    try {
                        int i4 = multiInstanceInvalidationService.X + 1;
                        multiInstanceInvalidationService.X = i4;
                        if (multiInstanceInvalidationService.Z.register(i43Var, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.Y.put(Integer.valueOf(i4), string);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.X--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(i43.b);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof i43)) {
                    h43 h43Var2 = new h43();
                    h43Var2.g = strongBinder2;
                    i43Var2 = h43Var2;
                } else {
                    i43Var2 = (i43) iInterfaceQueryLocalInterface2;
                }
            }
            int i5 = parcel.readInt();
            i43Var2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.g;
            synchronized (multiInstanceInvalidationService2.Z) {
                multiInstanceInvalidationService2.Z.unregister(i43Var2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i6 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.g;
        synchronized (multiInstanceInvalidationService3.Z) {
            try {
                String str2 = (String) multiInstanceInvalidationService3.Y.get(Integer.valueOf(i6));
                if (str2 != null) {
                    int iBeginBroadcast = multiInstanceInvalidationService3.Z.beginBroadcast();
                    while (true) {
                        az4Var = multiInstanceInvalidationService3.Z;
                        if (i3 >= iBeginBroadcast) {
                            break;
                        }
                        try {
                            Object broadcastCookie = az4Var.getBroadcastCookie(i3);
                            broadcastCookie.getClass();
                            Integer num = (Integer) broadcastCookie;
                            int iIntValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.Y.get(num);
                            if (i6 != iIntValue && str2.equals(str3)) {
                                try {
                                    ((i43) multiInstanceInvalidationService3.Z.getBroadcastItem(i3)).c(strArrCreateStringArray);
                                } catch (RemoteException unused) {
                                }
                            }
                            i3++;
                        } catch (Throwable th2) {
                            multiInstanceInvalidationService3.Z.finishBroadcast();
                            throw th2;
                        }
                    }
                    az4Var.finishBroadcast();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
