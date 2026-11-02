package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mg7 implements Parcelable {
    public static final Parcelable.Creator<mg7> CREATOR = new lg7((byte) 0);
    public int X;
    public int Y;
    public int Z;
    public int[] f0;
    public int g0;
    public int[] h0;
    public ArrayList i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z);
        if (this.Z > 0) {
            parcel.writeIntArray(this.f0);
        }
        parcel.writeInt(this.g0);
        if (this.g0 > 0) {
            parcel.writeIntArray(this.h0);
        }
        parcel.writeInt(this.j0 ? 1 : 0);
        parcel.writeInt(this.k0 ? 1 : 0);
        parcel.writeInt(this.l0 ? 1 : 0);
        parcel.writeList(this.i0);
    }
}
