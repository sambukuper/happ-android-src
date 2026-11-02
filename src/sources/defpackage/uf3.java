package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uf3 implements Parcelable {
    public static final Parcelable.Creator<uf3> CREATOR = new l99((byte) 18);
    public final IntentSender X;
    public final Intent Y;
    public final int Z;
    public final int f0;

    public uf3(IntentSender intentSender, Intent intent, int i, int i2) {
        this.X = intentSender;
        this.Y = intent;
        this.Z = i;
        this.f0 = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.X, i);
        parcel.writeParcelable(this.Y, i);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.f0);
    }
}
