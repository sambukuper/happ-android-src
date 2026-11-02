package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oc6 extends v2 {
    public static final Parcelable.Creator<oc6> CREATOR = new lg7((byte) 29);
    public final String X;
    public final String Y;
    public final String Z;
    public final String f0;
    public final String g0;
    public int h0;
    public final String i0;

    public oc6(String str, String str2, String str3, String str4, String str5) {
        this.X = str;
        this.Y = str2;
        this.Z = str3;
        this.f0 = str4;
        this.g0 = str5;
        this.i0 = "fcm-25.1.3";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iS0 = mb6.s0(parcel, 20293);
        mb6.n0(parcel, 1, this.X);
        mb6.n0(parcel, 2, this.Y);
        mb6.n0(parcel, 3, this.Z);
        mb6.n0(parcel, 4, this.f0);
        mb6.n0(parcel, 5, this.g0);
        int i2 = this.h0;
        mb6.r0(parcel, 6, 4);
        parcel.writeInt(i2);
        mb6.n0(parcel, 7, this.i0);
        mb6.t0(parcel, iS0);
    }

    public oc6(String str, String str2, String str3, String str4, String str5, int i, String str6) {
        this.X = str;
        this.Y = str2;
        this.Z = str3;
        this.f0 = str4;
        this.g0 = str5;
        this.h0 = i;
        this.i0 = str6;
    }
}
