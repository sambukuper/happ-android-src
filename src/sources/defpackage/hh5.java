package defpackage;

import android.app.Notification;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hh5 implements Parcelable {
    public static final Parcelable.Creator<hh5> CREATOR = new dh5((byte) 4);
    public final String X;
    public final kj2 Y;

    public hh5(Parcel parcel) {
        this.X = parcel.readString();
        this.Y = new kj2(parcel.readInt(), (Notification) parcel.readParcelable(hh5.class.getClassLoader()), parcel.readInt());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.X);
        kj2 kj2Var = this.Y;
        parcel.writeInt(kj2Var.a);
        parcel.writeInt(kj2Var.b);
        parcel.writeParcelable(kj2Var.c, i);
    }

    public hh5(String str, kj2 kj2Var) {
        this.X = str;
        this.Y = kj2Var;
    }
}
