package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yp8 implements Parcelable {
    public final String X;
    public final String Y;
    public final String Z;
    public final String f0;
    public final String g0;
    public static final xp8 Companion = new xp8();
    public static final Parcelable.Creator<yp8> CREATOR = new lg7((byte) 8);

    public /* synthetic */ yp8(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i & 31)) {
            ch3.S(i, 31, wp8.a.d());
            throw null;
        }
        this.X = str;
        this.Y = str2;
        this.Z = str3;
        this.f0 = str4;
        this.g0 = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp8)) {
            return false;
        }
        yp8 yp8Var = (yp8) obj;
        return dh3.f(this.X, yp8Var.X) && dh3.f(this.Y, yp8Var.Y) && dh3.f(this.Z, yp8Var.Z) && dh3.f(this.f0, yp8Var.f0) && dh3.f(this.g0, yp8Var.g0);
    }

    public final int hashCode() {
        return this.g0.hashCode() + pc6.e(pc6.e(pc6.e(this.X.hashCode() * 31, 31, this.Y), 31, this.Z), 31, this.f0);
    }

    public final String toString() {
        StringBuilder sbT = oi0.t("UpdateVersions(warnOnce=", this.X, ", warnWeek=", this.Y, ", warnAlways=");
        oi0.y(sbT, this.Z, ", noWarn=", this.f0, ", updateOnly=");
        return oi0.p(sbT, this.g0, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.f0);
        parcel.writeString(this.g0);
    }

    public yp8(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.X = str;
        this.Y = str2;
        this.Z = str3;
        this.f0 = str4;
        this.g0 = str5;
    }
}
