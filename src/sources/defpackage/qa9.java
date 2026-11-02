package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qa9 extends v2 {
    public static final Parcelable.Creator<qa9> CREATOR = new lg7((byte) 26);
    public Bundle X;
    public k82[] Y;
    public int Z;
    public c21 f0;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iS0 = mb6.s0(parcel, 20293);
        mb6.l0(parcel, 1, this.X);
        mb6.o0(parcel, 2, this.Y, i);
        int i2 = this.Z;
        mb6.r0(parcel, 3, 4);
        parcel.writeInt(i2);
        mb6.m0(parcel, 4, this.f0, i);
        mb6.t0(parcel, iS0);
    }
}
