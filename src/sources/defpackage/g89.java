package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g89 extends Binder implements IInterface {
    public final /* synthetic */ byte g = 0;

    public g89(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        byte b = this.g;
        return this;
    }

    public boolean n(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.g) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                q89 q89Var = (q89) this;
                boolean z = false;
                switch (i) {
                    case 3:
                        n89.b(parcel);
                        break;
                    case 4:
                        n89.b(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        n89.b(parcel);
                        break;
                    case 7:
                        n89.b(parcel);
                        break;
                    case 8:
                        e99 e99Var = (e99) n89.a(parcel, e99.CREATOR);
                        n89.b(parcel);
                        q89Var.i.post(new zo2((byte) 17, q89Var, e99Var, z));
                        break;
                    case 9:
                        n89.b(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return n(i, parcel, parcel2);
        }
    }

    public /* synthetic */ g89() {
    }
}
