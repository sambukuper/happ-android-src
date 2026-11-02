package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k82 extends v2 {
    public static final Parcelable.Creator<k82> CREATOR = new lg7(21);
    public final String X;
    public final int Y;
    public final long Z;
    public final boolean f0;

    public k82(long j, String str, boolean z, int i) {
        this.X = str;
        this.Y = i;
        this.Z = j;
        this.f0 = z;
    }

    public final long c() {
        long j = this.Z;
        return j == -1 ? this.Y : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k82) {
            k82 k82Var = (k82) obj;
            if (zc1.F(this.X, k82Var.X) && c() == k82Var.c() && this.f0 == k82Var.f0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, Long.valueOf(c()), Boolean.valueOf(this.f0)});
    }

    public final String toString() {
        e93 e93Var = new e93(this);
        e93Var.a(this.X, "name");
        e93Var.a(Long.valueOf(c()), "version");
        e93Var.a(Boolean.valueOf(this.f0), "is_fully_rolled_out");
        return e93Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iS0 = mb6.s0(parcel, 20293);
        mb6.n0(parcel, 1, this.X);
        mb6.r0(parcel, 2, 4);
        parcel.writeInt(this.Y);
        long jC = c();
        mb6.r0(parcel, 3, 8);
        parcel.writeLong(jC);
        mb6.r0(parcel, 4, 4);
        parcel.writeInt(this.f0 ? 1 : 0);
        mb6.t0(parcel, iS0);
    }

    public k82(String str) {
        this(1L, str, false, -1);
    }
}
