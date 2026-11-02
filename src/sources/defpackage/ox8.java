package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ox8 extends View.BaseSavedState {
    public static final Parcelable.Creator<ox8> CREATOR = new qh5((byte) 7);
    public int X;
    public int Y;
    public Parcelable Z;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeParcelable(this.Z, i);
    }
}
