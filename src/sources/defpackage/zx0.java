package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zx0 extends v2 {
    public static final Parcelable.Creator<zx0> CREATOR = new lg7((byte) 23);
    public final int X;
    public final int Y;
    public final int Z;
    public final boolean f0;

    public zx0(int i, int i2, int i3, boolean z) {
        this.X = i;
        this.Y = i2;
        this.Z = i3;
        this.f0 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zx0)) {
            return false;
        }
        zx0 zx0Var = (zx0) obj;
        return this.X == zx0Var.X && this.Y == zx0Var.Y && this.Z == zx0Var.Z && this.f0 == zx0Var.f0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.X), Integer.valueOf(this.Y), Integer.valueOf(this.Z), Boolean.valueOf(this.f0)});
    }

    public final String toString() {
        int i = this.X;
        int length = String.valueOf(i).length();
        int i2 = this.Y;
        int length2 = String.valueOf(i2).length();
        int i3 = this.Z;
        int length3 = String.valueOf(i3).length();
        boolean z = this.f0;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z).length() + 1);
        sb.append("ComplianceOptions{callerProductId=");
        sb.append(i);
        sb.append(", dataOwnerProductId=");
        sb.append(i2);
        sb.append(", processingReason=");
        sb.append(i3);
        sb.append(", isUserData=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
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
        mb6.r0(parcel, 4, 4);
        parcel.writeInt(this.f0 ? 1 : 0);
        mb6.t0(parcel, iS0);
    }
}
