package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c43 extends Binder implements d43 {
    public static final /* synthetic */ int g = 0;

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = d43.a;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        if (i == 1) {
            hc4 hc4Var = (hc4) this;
            hc4Var.e(ed6.b(parcel.readStrongBinder()), parcel.createByteArray());
        } else if (i == 2) {
            hc4 hc4Var2 = (hc4) this;
            hc4Var2.l(ed6.b(parcel.readStrongBinder()), parcel.createByteArray());
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            hc4 hc4Var3 = (hc4) this;
            hc4Var3.h(ed6.b(parcel.readStrongBinder()), parcel.createByteArray());
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
