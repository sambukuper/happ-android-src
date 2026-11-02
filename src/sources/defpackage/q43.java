package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q43 implements r43 {
    public IBinder g;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.g;
    }

    @Override // defpackage.r43
    public final void d(String str) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(r43.f);
            parcelObtain.writeString(str);
            if (!this.g.transact(2, parcelObtain, null, 1)) {
                throw new RemoteException("Method onFailure is unimplemented.");
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.r43
    public final void i(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(r43.f);
            parcelObtain.writeByteArray(bArr);
            if (!this.g.transact(1, parcelObtain, null, 1)) {
                throw new RemoteException("Method onSuccess is unimplemented.");
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}
