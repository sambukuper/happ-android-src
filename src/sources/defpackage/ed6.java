package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ed6 extends Binder implements r43 {
    public final /* synthetic */ q51 g;

    public ed6(q51 q51Var) {
        this.g = q51Var;
        attachInterface(this, r43.f);
    }

    public static r43 b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(r43.f);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof r43)) {
            return (r43) iInterfaceQueryLocalInterface;
        }
        q43 q43Var = new q43();
        q43Var.g = iBinder;
        return q43Var;
    }

    @Override // defpackage.r43
    public final void d(String str) {
        this.g.f(new rj6(new RuntimeException(str)));
    }

    @Override // defpackage.r43
    public final void i(byte[] bArr) {
        bArr.getClass();
        this.g.f(bArr);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = r43.f;
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
            i(parcel.createByteArray());
        } else {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            d(parcel.readString());
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
