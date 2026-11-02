package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b43 implements d43 {
    public IBinder g;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.g;
    }

    @Override // defpackage.d43
    public final void e(r43 r43Var, byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(d43.a);
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeStrongInterface(r43Var);
            if (!this.g.transact(1, parcelObtain, null, 1)) {
                throw new RemoteException("Method startWork is unimplemented.");
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.d43
    public final void h(r43 r43Var, byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(d43.a);
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeStrongInterface(r43Var);
            if (!this.g.transact(3, parcelObtain, null, 1)) {
                throw new RemoteException("Method getForegroundInfoAsync is unimplemented.");
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.d43
    public final void l(r43 r43Var, byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(d43.a);
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeStrongInterface(r43Var);
            if (!this.g.transact(2, parcelObtain, null, 1)) {
                throw new RemoteException("Method interrupt is unimplemented.");
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}
