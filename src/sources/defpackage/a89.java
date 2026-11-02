package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a89 extends v2 {
    public static final Parcelable.Creator<a89> CREATOR = new lg7((byte) 10);
    public final int X;
    public final int Y;
    public final Intent Z;

    public a89(int i, int i2, Intent intent) {
        this.X = i;
        this.Y = i2;
        this.Z = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iS0 = mb6.s0(parcel, 20293);
        mb6.r0(parcel, 1, 4);
        parcel.writeInt(this.X);
        mb6.r0(parcel, 2, 4);
        parcel.writeInt(this.Y);
        mb6.m0(parcel, 3, this.Z, i);
        mb6.t0(parcel, iS0);
    }
}
