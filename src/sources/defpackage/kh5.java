package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.WorkerParameters;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kh5 implements Parcelable {
    public static final Parcelable.Creator<kh5> CREATOR = new dh5((byte) 7);
    public final String X;
    public final ai5 Y;

    public kh5(Parcel parcel) {
        this.X = parcel.readString();
        this.Y = new ai5(parcel);
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

    public kh5(String str, WorkerParameters workerParameters) {
        this.X = str;
        this.Y = new ai5(workerParameters);
    }
}
