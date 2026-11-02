package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xl6 extends v2 {
    public static final Parcelable.Creator<xl6> CREATOR = new lg7((byte) 20);
    public final int X;
    public final boolean Y;
    public final boolean Z;
    public final int f0;
    public final int g0;

    public xl6(int i, boolean z, boolean z2, int i2, int i3) {
        this.X = i;
        this.Y = z;
        this.Z = z2;
        this.f0 = i2;
        this.g0 = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iS0 = mb6.s0(parcel, 20293);
        mb6.r0(parcel, 1, 4);
        parcel.writeInt(this.X);
        mb6.r0(parcel, 2, 4);
        parcel.writeInt(this.Y ? 1 : 0);
        mb6.r0(parcel, 3, 4);
        parcel.writeInt(this.Z ? 1 : 0);
        mb6.r0(parcel, 4, 4);
        parcel.writeInt(this.f0);
        mb6.r0(parcel, 5, 4);
        parcel.writeInt(this.g0);
        mb6.t0(parcel, iS0);
    }
}
