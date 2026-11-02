package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class so extends v2 {
    public static final Parcelable.Creator<so> CREATOR = l99.b;
    public static final so f0;
    public final zx0 X;
    public final boolean Y;
    public boolean Z;

    static {
        so soVar = new so(null, false);
        soVar.Z = false;
        f0 = soVar;
    }

    public so(zx0 zx0Var, boolean z) {
        this.X = zx0Var;
        this.Y = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof so)) {
            return false;
        }
        so soVar = (so) obj;
        return zc1.F(this.X, soVar.X) && this.Z == soVar.Z && this.Y == soVar.Y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, Boolean.valueOf(this.Z), Boolean.valueOf(this.Y)});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.X);
        return p61.n(new StringBuilder(strValueOf.length() + 31), "ApiMetadata(complianceOptions=", strValueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.Z) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iS0 = mb6.s0(parcel, 20293);
        mb6.m0(parcel, 1, this.X, i);
        mb6.r0(parcel, 2, 4);
        parcel.writeInt(this.Y ? 1 : 0);
        mb6.t0(parcel, iS0);
    }
}
