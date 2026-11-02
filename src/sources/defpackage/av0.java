package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class av0 extends v2 {
    public static final Parcelable.Creator<av0> CREATOR = new lg7(19);
    public final Intent X;

    public av0(Intent intent) {
        this.X = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iS0 = mb6.s0(parcel, 20293);
        mb6.m0(parcel, 1, this.X, i);
        mb6.t0(parcel, iS0);
    }
}
