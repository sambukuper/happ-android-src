package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c21 extends v2 {
    public static final Parcelable.Creator<c21> CREATOR = new lg7((byte) 27);
    public final xl6 X;
    public final boolean Y;
    public final boolean Z;
    public final int[] f0;
    public final int g0;
    public final int[] h0;

    public c21(xl6 xl6Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.X = xl6Var;
        this.Y = z;
        this.Z = z2;
        this.f0 = iArr;
        this.g0 = i;
        this.h0 = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iS0 = mb6.s0(parcel, 20293);
        mb6.m0(parcel, 1, this.X, i);
        mb6.r0(parcel, 2, 4);
        parcel.writeInt(this.Y ? 1 : 0);
        mb6.r0(parcel, 3, 4);
        parcel.writeInt(this.Z ? 1 : 0);
        int[] iArr = this.f0;
        if (iArr != null) {
            int iS1 = mb6.s0(parcel, 4);
            parcel.writeIntArray(iArr);
            mb6.t0(parcel, iS1);
        }
        mb6.r0(parcel, 5, 4);
        parcel.writeInt(this.g0);
        int[] iArr2 = this.h0;
        if (iArr2 != null) {
            int iS2 = mb6.s0(parcel, 6);
            parcel.writeIntArray(iArr2);
            mb6.t0(parcel, iS2);
        }
        mb6.t0(parcel, iS0);
    }
}
