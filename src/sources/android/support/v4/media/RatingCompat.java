package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dh5;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new dh5((byte) 23);
    public final int X;
    public final float Y;

    public RatingCompat(int i, float f) {
        this.X = i;
        this.Y = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.X;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.X);
        sb.append(" rating=");
        float f = this.Y;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.X);
        parcel.writeFloat(this.Y);
    }
}
