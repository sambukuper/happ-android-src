package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i28 extends v2 {
    public static final Parcelable.Creator<i28> CREATOR = new lg7((byte) 9);
    public final int X;
    public List Y;

    public i28(int i, List list) {
        this.X = i;
        this.Y = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iS0 = mb6.s0(parcel, 20293);
        mb6.r0(parcel, 1, 4);
        parcel.writeInt(this.X);
        mb6.p0(parcel, 2, this.Y);
        mb6.t0(parcel, iS0);
    }
}
