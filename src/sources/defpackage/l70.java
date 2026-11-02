package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l70 extends b0 {
    public static final Parcelable.Creator<l70> CREATOR = new ud7((byte) 1);
    public final int Z;
    public final int f0;
    public final boolean g0;
    public final boolean h0;
    public final boolean i0;

    public l70(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.Z = parcel.readInt();
        this.f0 = parcel.readInt();
        this.g0 = parcel.readInt() == 1;
        this.h0 = parcel.readInt() == 1;
        this.i0 = parcel.readInt() == 1;
    }

    @Override // defpackage.b0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.f0);
        parcel.writeInt(this.g0 ? 1 : 0);
        parcel.writeInt(this.h0 ? 1 : 0);
        parcel.writeInt(this.i0 ? 1 : 0);
    }

    public l70(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.Z = bottomSheetBehavior.P;
        this.f0 = bottomSheetBehavior.f;
        this.g0 = bottomSheetBehavior.b;
        this.h0 = bottomSheetBehavior.J;
        this.i0 = bottomSheetBehavior.K;
    }
}
