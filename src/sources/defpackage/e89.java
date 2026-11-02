package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e89 extends v2 {
    public static final Parcelable.Creator<e89> CREATOR = new lg7((byte) 12);
    public final int X;
    public final String Y;
    public final long Z;
    public final int f0;
    public final boolean g0;

    public e89(int i, String str, long j, int i2, boolean z) {
        this.X = i;
        this.Y = str;
        this.Z = j;
        this.f0 = i2;
        this.g0 = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iS0 = mb6.s0(parcel, 20293);
        mb6.r0(parcel, 1, 4);
        parcel.writeInt(this.X);
        mb6.n0(parcel, 2, this.Y);
        mb6.r0(parcel, 3, 8);
        parcel.writeLong(this.Z);
        mb6.r0(parcel, 4, 4);
        parcel.writeInt(this.f0);
        mb6.r0(parcel, 5, 4);
        parcel.writeInt(this.g0 ? 1 : 0);
        mb6.t0(parcel, iS0);
    }
}
