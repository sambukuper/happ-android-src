package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o43 implements p43 {
    public IBinder g;

    @Override // defpackage.p43
    public final void a(String str, r43 r43Var) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(p43.e);
            parcelObtain.writeString(str);
            parcelObtain.writeStrongInterface(r43Var);
            if (!this.g.transact(6, parcelObtain, null, 1)) {
                throw new RemoteException("Method cancelUniqueWork is unimplemented.");
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.g;
    }

    @Override // defpackage.p43
    public final void j(r43 r43Var, byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(p43.e);
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeStrongInterface(r43Var);
            if (!this.g.transact(10, parcelObtain, null, 1)) {
                throw new RemoteException("Method setForegroundAsync is unimplemented.");
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.p43
    public final void k(String str, byte[] bArr, r43 r43Var) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(p43.e);
            parcelObtain.writeString(str);
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeStrongInterface(r43Var);
            if (!this.g.transact(2, parcelObtain, null, 1)) {
                throw new RemoteException("Method updateUniquePeriodicWorkRequest is unimplemented.");
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.p43
    public final void m(r43 r43Var, byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(p43.e);
            parcelObtain.writeByteArray(bArr);
            parcelObtain.writeStrongInterface(r43Var);
            if (!this.g.transact(3, parcelObtain, null, 1)) {
                throw new RemoteException("Method enqueueContinuation is unimplemented.");
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}
