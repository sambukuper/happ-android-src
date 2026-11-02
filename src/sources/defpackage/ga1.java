package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ga1 implements Parcelable {
    public final String X;
    public final String Y;
    public final String Z;
    public static final fa1 Companion = new fa1();
    public static final Parcelable.Creator<ga1> CREATOR = new l99((byte) 9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ga1(int i, String str, String str2, String str3) {
        if (2 != (i & 2)) {
            ch3.S(i, 2, ea1.a.d());
            throw null;
        }
        if ((i & 1) == 0) {
            this.X = null;
        } else {
            this.X = str;
        }
        this.Y = str2;
        if ((i & 4) == 0) {
            this.Z = null;
        } else {
            this.Z = str3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga1)) {
            return false;
        }
        ga1 ga1Var = (ga1) obj;
        return dh3.f(this.X, ga1Var.X) && dh3.f(this.Y, ga1Var.Y) && dh3.f(this.Z, ga1Var.Z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.X;
        int iE = pc6.e((str == null ? 0 : str.hashCode()) * 31, 31, this.Y);
        String str2 = this.Z;
        return iE + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return oi0.p(oi0.t("DataLocaleItem(title=", this.X, ", body=", this.Y, ", linkForOpen="), this.Z, ")");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
    }

    public ga1(String str, String str2, String str3) {
        str2.getClass();
        this.X = str;
        this.Y = str2;
        this.Z = str3;
    }
}
