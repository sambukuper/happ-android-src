package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 implements Parcelable {
    public final Parcelable X;
    public static final a0 Y = new a0();
    public static final Parcelable.Creator<b0> CREATOR = new qh5(1);

    public b0(Parcelable parcelable) {
        if (parcelable != null) {
            this.X = parcelable == Y ? null : parcelable;
        } else {
            bt.q("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.X, i);
    }

    public b0() {
        this.X = null;
    }

    public b0(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.X = parcelable == null ? Y : parcelable;
    }
}
