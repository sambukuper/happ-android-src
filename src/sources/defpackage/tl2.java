package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tl2 implements Parcelable {
    public static final Parcelable.Creator<tl2> CREATOR = new l99((byte) 16);
    public final String X;
    public final String Y;
    public final boolean Z;
    public final boolean f0;
    public final int g0;
    public final int h0;
    public final String i0;
    public final boolean j0;
    public final boolean k0;
    public final boolean l0;
    public final boolean m0;
    public final int n0;
    public final String o0;
    public final int p0;
    public final boolean q0;

    public tl2(Parcel parcel) {
        this.X = parcel.readString();
        this.Y = parcel.readString();
        this.Z = parcel.readInt() != 0;
        this.f0 = parcel.readInt() != 0;
        this.g0 = parcel.readInt();
        this.h0 = parcel.readInt();
        this.i0 = parcel.readString();
        this.j0 = parcel.readInt() != 0;
        this.k0 = parcel.readInt() != 0;
        this.l0 = parcel.readInt() != 0;
        this.m0 = parcel.readInt() != 0;
        this.n0 = parcel.readInt();
        this.o0 = parcel.readString();
        this.p0 = parcel.readInt();
        this.q0 = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.X);
        sb.append(" (");
        sb.append(this.Y);
        sb.append(")}:");
        if (this.Z) {
            sb.append(" fromLayout");
        }
        if (this.f0) {
            sb.append(" dynamicContainer");
        }
        int i = this.h0;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.i0;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.j0) {
            sb.append(" retainInstance");
        }
        if (this.k0) {
            sb.append(" removing");
        }
        if (this.l0) {
            sb.append(" detached");
        }
        if (this.m0) {
            sb.append(" hidden");
        }
        String str2 = this.o0;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.p0);
        }
        if (this.q0) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeInt(this.f0 ? 1 : 0);
        parcel.writeInt(this.g0);
        parcel.writeInt(this.h0);
        parcel.writeString(this.i0);
        parcel.writeInt(this.j0 ? 1 : 0);
        parcel.writeInt(this.k0 ? 1 : 0);
        parcel.writeInt(this.l0 ? 1 : 0);
        parcel.writeInt(this.m0 ? 1 : 0);
        parcel.writeInt(this.n0);
        parcel.writeString(this.o0);
        parcel.writeInt(this.p0);
        parcel.writeInt(this.q0 ? 1 : 0);
    }

    public tl2(qk2 qk2Var) {
        this.X = qk2Var.getClass().getName();
        this.Y = qk2Var.g0;
        this.Z = qk2Var.p0;
        this.f0 = qk2Var.r0;
        this.g0 = qk2Var.z0;
        this.h0 = qk2Var.A0;
        this.i0 = qk2Var.B0;
        this.j0 = qk2Var.E0;
        this.k0 = qk2Var.n0;
        this.l0 = qk2Var.D0;
        this.m0 = qk2Var.C0;
        this.n0 = qk2Var.R0.ordinal();
        this.o0 = qk2Var.j0;
        this.p0 = qk2Var.k0;
        this.q0 = qk2Var.L0;
    }
}
