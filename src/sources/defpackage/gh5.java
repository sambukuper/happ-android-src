package defpackage;

import android.app.Notification;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gh5 implements Parcelable {
    public static final Parcelable.Creator<gh5> CREATOR = new dh5((byte) 3);
    public final kj2 X;

    public gh5(Parcel parcel) {
        this.X = new kj2(parcel.readInt(), (Notification) c4.z(parcel), parcel.readInt());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gh5) && dh3.f(this.X, ((gh5) obj).X);
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        return "ParcelableForegroundInfo(foregroundInfo=" + this.X + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        kj2 kj2Var = this.X;
        parcel.writeInt(kj2Var.a);
        parcel.writeParcelable(kj2Var.c, i);
        parcel.writeInt(kj2Var.b);
    }

    public gh5(kj2 kj2Var) {
        kj2Var.getClass();
        this.X = kj2Var;
    }
}
