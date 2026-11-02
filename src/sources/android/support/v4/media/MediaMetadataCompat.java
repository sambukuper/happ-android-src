package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.l99;
import defpackage.os4;
import defpackage.vt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public final Bundle X;

    static {
        vt vtVar = new vt(0);
        vtVar.put("android.media.metadata.TITLE", 1);
        vtVar.put("android.media.metadata.ARTIST", 1);
        vtVar.put("android.media.metadata.DURATION", 0);
        vtVar.put("android.media.metadata.ALBUM", 1);
        vtVar.put("android.media.metadata.AUTHOR", 1);
        vtVar.put("android.media.metadata.WRITER", 1);
        vtVar.put("android.media.metadata.COMPOSER", 1);
        vtVar.put("android.media.metadata.COMPILATION", 1);
        vtVar.put("android.media.metadata.DATE", 1);
        vtVar.put("android.media.metadata.YEAR", 0);
        vtVar.put("android.media.metadata.GENRE", 1);
        vtVar.put("android.media.metadata.TRACK_NUMBER", 0);
        vtVar.put("android.media.metadata.NUM_TRACKS", 0);
        vtVar.put("android.media.metadata.DISC_NUMBER", 0);
        vtVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        vtVar.put("android.media.metadata.ART", 2);
        vtVar.put("android.media.metadata.ART_URI", 1);
        vtVar.put("android.media.metadata.ALBUM_ART", 2);
        vtVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        vtVar.put("android.media.metadata.USER_RATING", 3);
        vtVar.put("android.media.metadata.RATING", 3);
        vtVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        vtVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        vtVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        vtVar.put("android.media.metadata.DISPLAY_ICON", 2);
        vtVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        vtVar.put("android.media.metadata.MEDIA_ID", 1);
        vtVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        vtVar.put("android.media.metadata.MEDIA_URI", 1);
        vtVar.put("android.media.metadata.ADVERTISEMENT", 0);
        vtVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new l99((byte) 24);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.X = parcel.readBundle(os4.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.X);
    }
}
