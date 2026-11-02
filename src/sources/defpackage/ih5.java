package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ih5 implements Parcelable {
    public static final Parcelable.Creator<ih5> CREATOR = new dh5((byte) 5);
    public final String X;
    public final int Y;

    public ih5(String str, int i) {
        this.X = str;
        this.Y = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih5)) {
            return false;
        }
        ih5 ih5Var = (ih5) obj;
        return this.X.equals(ih5Var.X) && this.Y == ih5Var.Y;
    }

    public final int hashCode() {
        return Integer.hashCode(this.Y) + (this.X.hashCode() * 31);
    }

    public final String toString() {
        return "ParcelableInterruptRequest(id=" + this.X + ", stopReason=" + this.Y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.X);
        parcel.writeInt(this.Y);
    }
}
