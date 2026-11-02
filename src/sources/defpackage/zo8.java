package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zo8 implements Parcelable {
    public final int X;
    public final String Y;
    public final String Z;
    public final yp8 f0;
    public final String g0;
    public final String h0;
    public static final yo8 Companion = new yo8();
    public static final Parcelable.Creator<zo8> CREATOR = new lg7((byte) 7);

    public /* synthetic */ zo8(int i, int i2, String str, String str2, yp8 yp8Var, String str3, String str4) {
        if (63 != (i & 63)) {
            ch3.S(i, 63, xo8.a.d());
            throw null;
        }
        this.X = i2;
        this.Y = str;
        this.Z = str2;
        this.f0 = yp8Var;
        this.g0 = str3;
        this.h0 = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo8)) {
            return false;
        }
        zo8 zo8Var = (zo8) obj;
        return this.X == zo8Var.X && dh3.f(this.Y, zo8Var.Y) && dh3.f(this.Z, zo8Var.Z) && dh3.f(this.f0, zo8Var.f0) && dh3.f(this.g0, zo8Var.g0) && dh3.f(this.h0, zo8Var.h0);
    }

    public final int hashCode() {
        int iE = pc6.e((this.f0.hashCode() + pc6.e(pc6.e(Integer.hashCode(this.X) * 31, 31, this.Y), 31, this.Z)) * 31, 31, this.g0);
        String str = this.h0;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateParams(fileNum=");
        sb.append(this.X);
        sb.append(", version=");
        sb.append(this.Y);
        sb.append(", link=");
        sb.append(this.Z);
        sb.append(", versions=");
        sb.append(this.f0);
        sb.append(", details=");
        return oi0.q(sb, this.g0, ", size=", this.h0, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        this.f0.writeToParcel(parcel, i);
        parcel.writeString(this.g0);
        parcel.writeString(this.h0);
    }

    public zo8(int i, yp8 yp8Var, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        yp8Var.getClass();
        str3.getClass();
        this.X = i;
        this.Y = str;
        this.Z = str2;
        this.f0 = yp8Var;
        this.g0 = str3;
        this.h0 = str4;
    }
}
