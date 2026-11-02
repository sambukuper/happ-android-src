package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e99 extends v2 {
    public static final Parcelable.Creator<e99> CREATOR = new lg7((byte) 14);
    public final int X;
    public final x11 Y;
    public final k99 Z;

    public e99(int i, x11 x11Var, k99 k99Var) {
        this.X = i;
        this.Y = x11Var;
        this.Z = k99Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iS0 = mb6.s0(parcel, 20293);
        mb6.r0(parcel, 1, 4);
        parcel.writeInt(this.X);
        mb6.m0(parcel, 2, this.Y, i);
        mb6.m0(parcel, 3, this.Z, i);
        mb6.t0(parcel, iS0);
    }
}
