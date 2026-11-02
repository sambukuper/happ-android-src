package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ld6 implements Parcelable {
    public final String X;
    public final da1 Y;
    public final long Z;
    public final String f0;
    public final kd6 g0;
    public final boolean h0;
    public static final jd6 Companion = new jd6();
    public static final Parcelable.Creator<ld6> CREATOR = new dh5((byte) 25);
    public static final g44[] i0 = {null, null, null, null, x97.P(w74.X, new w76((byte) 3)), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ld6(int i, String str, da1 da1Var, long j, String str2, kd6 kd6Var, boolean z) {
        if (7 != (i & 7)) {
            ch3.S(i, 7, id6.a.d());
            throw null;
        }
        this.X = str;
        this.Y = da1Var;
        this.Z = j;
        if ((i & 8) == 0) {
            this.f0 = null;
        } else {
            this.f0 = str2;
        }
        if ((i & 16) == 0) {
            this.g0 = kd6.Z;
        } else {
            this.g0 = kd6Var;
        }
        if ((i & 32) == 0) {
            this.h0 = false;
        } else {
            this.h0 = z;
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
        if (!(obj instanceof ld6)) {
            return false;
        }
        ld6 ld6Var = (ld6) obj;
        return dh3.f(this.X, ld6Var.X) && dh3.f(this.Y, ld6Var.Y) && this.Z == ld6Var.Z && dh3.f(this.f0, ld6Var.f0) && this.g0 == ld6Var.g0 && this.h0 == ld6Var.h0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iG = p61.g((this.Y.hashCode() + (this.X.hashCode() * 31)) * 31, this.Z, 31);
        String str = this.f0;
        return Boolean.hashCode(this.h0) + ((this.g0.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RemoteMessageEntity(id=" + this.X + ", dataLocale=" + this.Y + ", expireTimestamp=" + this.Z + ", image=" + this.f0 + ", pushType=" + this.g0 + ", isWatched=" + this.h0 + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.X);
        this.Y.writeToParcel(parcel, i);
        parcel.writeLong(this.Z);
        parcel.writeString(this.f0);
        parcel.writeString(this.g0.name());
        parcel.writeInt(this.h0 ? 1 : 0);
    }

    public ld6(String str, da1 da1Var, long j, String str2, kd6 kd6Var, boolean z) {
        str.getClass();
        da1Var.getClass();
        kd6Var.getClass();
        this.X = str;
        this.Y = da1Var;
        this.Z = j;
        this.f0 = str2;
        this.g0 = kd6Var;
        this.h0 = z;
    }
}
