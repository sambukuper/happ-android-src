package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nl2 implements Parcelable {
    public static final Parcelable.Creator<nl2> CREATOR = new l99((byte) 15);
    public ArrayList X;
    public ArrayList Y;
    public s00[] Z;
    public int f0;
    public String g0;
    public ArrayList h0;
    public ArrayList i0;
    public ArrayList j0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.X);
        parcel.writeStringList(this.Y);
        parcel.writeTypedArray(this.Z, i);
        parcel.writeInt(this.f0);
        parcel.writeString(this.g0);
        parcel.writeStringList(this.h0);
        parcel.writeTypedList(this.i0);
        parcel.writeTypedList(this.j0);
    }
}
