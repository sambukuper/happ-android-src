package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ov4 extends v2 {
    public static final Parcelable.Creator<ov4> CREATOR = new lg7(15);
    public final int X;
    public final int Y;
    public final int Z;
    public final long f0;
    public final long g0;
    public final String h0;
    public final String i0;
    public final int j0;
    public final int k0;

    public ov4(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.X = i;
        this.Y = i2;
        this.Z = i3;
        this.f0 = j;
        this.g0 = j2;
        this.h0 = str;
        this.i0 = str2;
        this.j0 = i4;
        this.k0 = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iS0 = mb6.s0(parcel, 20293);
        mb6.r0(parcel, 1, 4);
        parcel.writeInt(this.X);
        mb6.r0(parcel, 2, 4);
        parcel.writeInt(this.Y);
        mb6.r0(parcel, 3, 4);
        parcel.writeInt(this.Z);
        mb6.r0(parcel, 4, 8);
        parcel.writeLong(this.f0);
        mb6.r0(parcel, 5, 8);
        parcel.writeLong(this.g0);
        mb6.n0(parcel, 6, this.h0);
        mb6.n0(parcel, 7, this.i0);
        mb6.r0(parcel, 8, 4);
        parcel.writeInt(this.j0);
        mb6.r0(parcel, 9, 4);
        parcel.writeInt(this.k0);
        mb6.t0(parcel, iS0);
    }
}
