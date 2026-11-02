package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class sq7 implements Parcelable {
    public static final Parcelable.Creator<sq7> CREATOR = new lg7((byte) 2);
    public final String X;
    public final boolean Y;
    public final boolean Z;
    public final boolean f0;
    public final boolean g0;
    public final boolean h0;
    public final boolean i0;
    public final boolean j0;
    public final String k0;
    public final String l0;
    public final boolean m0;
    public final boolean n0;
    public final boolean o0;
    public final boolean p0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sq7(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str2, String str3, boolean z8, boolean z9, boolean z10) {
        str2.getClass();
        str3.getClass();
        this.X = str;
        this.Y = z;
        this.Z = z2;
        this.f0 = z3;
        this.g0 = z4;
        this.h0 = z5;
        this.i0 = z6;
        this.j0 = z7;
        this.k0 = str2;
        this.l0 = str3;
        this.m0 = z8;
        this.n0 = z9;
        this.o0 = z10;
        this.p0 = !z8 || (str3.length() > 0 && !z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static sq7 c(sq7 sq7Var, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str2, String str3, boolean z8, boolean z9, int i) {
        if ((i & 1) != 0) {
            str = sq7Var.X;
        }
        String str4 = str;
        boolean z10 = (i & 2) != 0 ? sq7Var.Y : z;
        boolean z11 = (i & 4) != 0 ? sq7Var.Z : z2;
        boolean z12 = (i & 8) != 0 ? sq7Var.f0 : z3;
        boolean z13 = (i & 16) != 0 ? sq7Var.g0 : z4;
        boolean z14 = (i & 32) != 0 ? sq7Var.h0 : z5;
        boolean z15 = (i & 64) != 0 ? sq7Var.i0 : z6;
        boolean z16 = (i & 128) != 0 ? sq7Var.j0 : z7;
        String str5 = (i & 256) != 0 ? sq7Var.k0 : str2;
        String str6 = (i & 512) != 0 ? sq7Var.l0 : str3;
        boolean z17 = (i & 1024) != 0 ? sq7Var.m0 : z8;
        boolean z18 = (i & 2048) != 0 ? sq7Var.n0 : true;
        boolean z19 = (i & 4096) != 0 ? sq7Var.o0 : z9;
        sq7Var.getClass();
        str5.getClass();
        str6.getClass();
        return new sq7(str4, z10, z11, z12, z13, z14, z15, z16, str5, str6, z17, z18, z19);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq7)) {
            return false;
        }
        sq7 sq7Var = (sq7) obj;
        String str = sq7Var.X;
        String str2 = this.X;
        if (str2 == null) {
            if (str == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (str == null) {
            zEquals = false;
        } else {
            zEquals = str2.equals(str);
        }
        return zEquals && this.Y == sq7Var.Y && this.Z == sq7Var.Z && this.f0 == sq7Var.f0 && this.g0 == sq7Var.g0 && this.h0 == sq7Var.h0 && this.i0 == sq7Var.i0 && this.j0 == sq7Var.j0 && dh3.f(this.k0, sq7Var.k0) && dh3.f(this.l0, sq7Var.l0) && this.m0 == sq7Var.m0 && this.n0 == sq7Var.n0 && this.o0 == sq7Var.o0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.X;
        return Boolean.hashCode(this.o0) + pc6.f(pc6.f(pc6.e(pc6.e(pc6.f(pc6.f(pc6.f(pc6.f(pc6.f(pc6.f(pc6.f((str == null ? 0 : str.hashCode()) * 31, 31, this.Y), 31, this.Z), 31, this.f0), 31, this.g0), 31, this.h0), 31, this.i0), 31, this.j0), 31, this.k0), 31, this.l0), 31, this.m0), 31, this.n0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.X;
        if (str == null) {
            str = "null";
        }
        StringBuilder sb = new StringBuilder("SubscriptionEditState(editSubId=");
        sb.append(str);
        sb.append(", isUpdate=");
        sb.append(this.Y);
        sb.append(", isHideSettings=");
        sb.append(this.Z);
        sb.append(", isHideSettingsLocked=");
        sb.append(this.f0);
        sb.append(", isSubEncrypted=");
        sb.append(this.g0);
        sb.append(", isAllowInsecure=");
        sb.append(this.h0);
        sb.append(", isHwidInCookieEnabled=");
        sb.append(this.i0);
        sb.append(", isHwidInCookieLocked=");
        sb.append(this.j0);
        sb.append(", titleInput=");
        oi0.y(sb, this.k0, ", urlInput=", this.l0, ", isUrlVisible=");
        sb.append(this.m0);
        sb.append(", isSaving=");
        sb.append(this.n0);
        sb.append(", isUrlError=");
        return p61.o(sb, this.o0, ")");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        String str = this.X;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeInt(this.f0 ? 1 : 0);
        parcel.writeInt(this.g0 ? 1 : 0);
        parcel.writeInt(this.h0 ? 1 : 0);
        parcel.writeInt(this.i0 ? 1 : 0);
        parcel.writeInt(this.j0 ? 1 : 0);
        parcel.writeString(this.k0);
        parcel.writeString(this.l0);
        parcel.writeInt(this.m0 ? 1 : 0);
        parcel.writeInt(this.n0 ? 1 : 0);
        parcel.writeInt(this.o0 ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR (null java.lang.String), false, false, false, false, false, false, false, (""), (""), true, false, false A[MD:(java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean):void (m)] (LINE:53) call: sq7.<init>(java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ sq7() {
        this(null, false, false, false, false, false, false, false, "", "", true, false, false);
    }
}
