package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t00 implements Parcelable {
    public static final Parcelable.Creator<t00> CREATOR = new l99((byte) 5);
    public final ArrayList X;
    public final ArrayList Y;

    public t00(Parcel parcel) {
        this.X = parcel.createStringArrayList();
        this.Y = parcel.createTypedArrayList(s00.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.X);
        parcel.writeTypedList(this.Y);
    }
}
