package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import defpackage.ie2;
import defpackage.l99;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new l99((byte) 25);
    public final MediaDescriptionCompat X;
    public final long Y;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.X = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.Y = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.X);
        sb.append(", Id=");
        return ie2.g(this.Y, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.X.writeToParcel(parcel, i);
        parcel.writeLong(this.Y);
    }
}
