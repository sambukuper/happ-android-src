package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m20 extends View.BaseSavedState {
    public static final Parcelable.Creator<m20> CREATOR = new l99((byte) 6);
    public float X;
    public float Y;
    public ArrayList Z;
    public float f0;
    public boolean g0;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.X);
        parcel.writeFloat(this.Y);
        parcel.writeList(this.Z);
        parcel.writeFloat(this.f0);
        parcel.writeBooleanArray(new boolean[]{this.g0});
    }
}
