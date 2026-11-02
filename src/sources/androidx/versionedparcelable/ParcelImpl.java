package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dh5;
import defpackage.gv8;
import defpackage.hv8;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new dh5((byte) 0);
    public final hv8 X;

    public ParcelImpl(Parcel parcel) {
        this.X = new gv8(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new gv8(parcel).k(this.X);
    }
}
