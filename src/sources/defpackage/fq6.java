package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import su.happ.proxyutility.dto.enums.ERoutingSettingsType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class fq6 implements Parcelable {
    public static final Parcelable.Creator<fq6> CREATOR = new dh5((byte) 28);
    public final String X;
    public final String Y;
    public final ERoutingSettingsType Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fq6(String str, String str2, ERoutingSettingsType eRoutingSettingsType) {
        str.getClass();
        str2.getClass();
        eRoutingSettingsType.getClass();
        this.X = str;
        this.Y = str2;
        this.Z = eRoutingSettingsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static fq6 c(fq6 fq6Var, String str, ERoutingSettingsType eRoutingSettingsType, int i) {
        if ((i & 1) != 0) {
            str = fq6Var.X;
        }
        String str2 = fq6Var.Y;
        if ((i & 4) != 0) {
            eRoutingSettingsType = fq6Var.Z;
        }
        str.getClass();
        str2.getClass();
        eRoutingSettingsType.getClass();
        return new fq6(str, str2, eRoutingSettingsType);
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
        if (!(obj instanceof fq6)) {
            return false;
        }
        fq6 fq6Var = (fq6) obj;
        return dh3.f(this.X, fq6Var.X) && dh3.f(this.Y, fq6Var.Y) && this.Z == fq6Var.Z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.Z.hashCode() + pc6.e(this.X.hashCode() * 31, 31, this.Y);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbT = oi0.t("RoutingSettingsEditState(profileId=", this.X, ", name=", this.Y, ", typeEdits=");
        sbT.append(this.Z);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z.name());
    }
}
