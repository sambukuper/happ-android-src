package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kg7 implements Parcelable {
    public static final Parcelable.Creator<kg7> CREATOR = new dh5(29);
    public int X;
    public int Y;
    public int[] Z;
    public boolean f0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.X + ", mGapDir=" + this.Y + ", mHasUnwantedGapAfter=" + this.f0 + ", mGapPerSpan=" + Arrays.toString(this.Z) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.f0 ? 1 : 0);
        int[] iArr = this.Z;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.Z);
        }
    }
}
