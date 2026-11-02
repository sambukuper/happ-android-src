package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j99 extends v2 {
    public static final Parcelable.Creator<j99> CREATOR = new lg7((byte) 16);
    public final int X;
    public final Account Y;
    public final int Z;
    public final GoogleSignInAccount f0;

    public j99(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.X = i;
        this.Y = account;
        this.Z = i2;
        this.f0 = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iS0 = mb6.s0(parcel, 20293);
        mb6.r0(parcel, 1, 4);
        parcel.writeInt(this.X);
        mb6.m0(parcel, 2, this.Y, i);
        mb6.r0(parcel, 3, 4);
        parcel.writeInt(this.Z);
        mb6.m0(parcel, 4, this.f0, i);
        mb6.t0(parcel, iS0);
    }
}
