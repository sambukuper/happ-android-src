package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bd0 implements Parcelable {
    public static final Parcelable.Creator<bd0> CREATOR = new l99((byte) 7);
    public final ay4 X;
    public final ay4 Y;
    public final qc1 Z;
    public final ay4 f0;
    public final int g0;
    public final int h0;
    public final int i0;

    public bd0(ay4 ay4Var, ay4 ay4Var2, qc1 qc1Var, ay4 ay4Var3, int i) {
        Objects.requireNonNull(ay4Var, "start cannot be null");
        Objects.requireNonNull(ay4Var2, "end cannot be null");
        Objects.requireNonNull(qc1Var, "validator cannot be null");
        this.X = ay4Var;
        this.Y = ay4Var2;
        this.f0 = ay4Var3;
        this.g0 = i;
        this.Z = qc1Var;
        if (ay4Var3 != null && ay4Var.X.compareTo(ay4Var3.X) > 0) {
            bt.q("start Month cannot be after current Month");
            throw null;
        }
        if (ay4Var3 != null && ay4Var3.X.compareTo(ay4Var2.X) > 0) {
            bt.q("current Month cannot be after end Month");
            throw null;
        }
        if (i < 0 || i > tr8.c(null).getMaximum(7)) {
            bt.q("firstDayOfWeek is not valid");
            throw null;
        }
        this.i0 = ay4Var.g(ay4Var2) + 1;
        this.h0 = (ay4Var2.Z - ay4Var.Z) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd0)) {
            return false;
        }
        bd0 bd0Var = (bd0) obj;
        return this.X.equals(bd0Var.X) && this.Y.equals(bd0Var.Y) && Objects.equals(this.f0, bd0Var.f0) && this.g0 == bd0Var.g0 && this.Z.equals(bd0Var.Z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, this.Y, this.f0, Integer.valueOf(this.g0), this.Z});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.X, 0);
        parcel.writeParcelable(this.Y, 0);
        parcel.writeParcelable(this.f0, 0);
        parcel.writeParcelable(this.Z, 0);
        parcel.writeInt(this.g0);
    }
}
