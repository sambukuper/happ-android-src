package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class zj6 implements Parcelable {
    public static final Parcelable.Creator<zj6> CREATOR = new dh5(27);
    public m43 X;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                m43 yj6Var = this.X;
                if (yj6Var == null) {
                    yj6Var = new yj6(this);
                    this.X = yj6Var;
                }
                parcel.writeStrongBinder(yj6Var.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(int i, Bundle bundle) {
    }
}
