package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sh5 implements Parcelable {
    public static final Parcelable.Creator<sh5> CREATOR = new dh5((byte) 13);
    public final String X;
    public final fh5 Y;

    public sh5(Parcel parcel) {
        this.X = parcel.readString();
        this.Y = new fh5(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.X);
        this.Y.writeToParcel(parcel, i);
    }
}
