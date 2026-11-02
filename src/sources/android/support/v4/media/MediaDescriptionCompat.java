package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.l99;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new l99((byte) 23);
    public final String X;
    public final CharSequence Y;
    public final CharSequence Z;
    public final CharSequence f0;
    public final Bitmap g0;
    public final Uri h0;
    public final Bundle i0;
    public final Uri j0;
    public Object k0;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.X = str;
        this.Y = charSequence;
        this.Z = charSequence2;
        this.f0 = charSequence3;
        this.g0 = bitmap;
        this.h0 = uri;
        this.i0 = bundle;
        this.j0 = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.Y) + ", " + ((Object) this.Z) + ", " + ((Object) this.f0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Object objBuild = this.k0;
        if (objBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.X);
            builder.setTitle(this.Y);
            builder.setSubtitle(this.Z);
            builder.setDescription(this.f0);
            builder.setIconBitmap(this.g0);
            builder.setIconUri(this.h0);
            builder.setExtras(this.i0);
            builder.setMediaUri(this.j0);
            objBuild = builder.build();
            this.k0 = objBuild;
        }
        ((MediaDescription) objBuild).writeToParcel(parcel, i);
    }
}
