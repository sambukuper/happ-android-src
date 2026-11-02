package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dh5;
import defpackage.ie2;
import defpackage.os4;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new dh5(22);
    public final int X;
    public final long Y;
    public final long Z;
    public final float f0;
    public final long g0;
    public final int h0;
    public final CharSequence i0;
    public final long j0;
    public final ArrayList k0;
    public final long l0;
    public final Bundle m0;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new b();
        public final String X;
        public final CharSequence Y;
        public final int Z;
        public final Bundle f0;

        public CustomAction(Parcel parcel) {
            this.X = parcel.readString();
            this.Y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.Z = parcel.readInt();
            this.f0 = parcel.readBundle(os4.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.Y) + ", mIcon=" + this.Z + ", mExtras=" + this.f0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.X);
            TextUtils.writeToParcel(this.Y, parcel, i);
            parcel.writeInt(this.Z);
            parcel.writeBundle(this.f0);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.X = parcel.readInt();
        this.Y = parcel.readLong();
        this.f0 = parcel.readFloat();
        this.j0 = parcel.readLong();
        this.Z = parcel.readLong();
        this.g0 = parcel.readLong();
        this.i0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k0 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.l0 = parcel.readLong();
        this.m0 = parcel.readBundle(os4.class.getClassLoader());
        this.h0 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.X);
        sb.append(", position=");
        sb.append(this.Y);
        sb.append(", buffered position=");
        sb.append(this.Z);
        sb.append(", speed=");
        sb.append(this.f0);
        sb.append(", updated=");
        sb.append(this.j0);
        sb.append(", actions=");
        sb.append(this.g0);
        sb.append(", error code=");
        sb.append(this.h0);
        sb.append(", error message=");
        sb.append(this.i0);
        sb.append(", custom actions=");
        sb.append(this.k0);
        sb.append(", active item id=");
        return ie2.g(this.l0, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.X);
        parcel.writeLong(this.Y);
        parcel.writeFloat(this.f0);
        parcel.writeLong(this.j0);
        parcel.writeLong(this.Z);
        parcel.writeLong(this.g0);
        TextUtils.writeToParcel(this.i0, parcel, i);
        parcel.writeTypedList(this.k0);
        parcel.writeLong(this.l0);
        parcel.writeBundle(this.m0);
        parcel.writeInt(this.h0);
    }
}
