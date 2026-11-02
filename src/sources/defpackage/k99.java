package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k99 extends v2 {
    public static final Parcelable.Creator<k99> CREATOR = new lg7((byte) 17);
    public final int X;
    public final IBinder Y;
    public final x11 Z;
    public final boolean f0;
    public final boolean g0;

    public k99(int i, IBinder iBinder, x11 x11Var, boolean z, boolean z2) {
        this.X = i;
        this.Y = iBinder;
        this.Z = x11Var;
        this.f0 = z;
        this.g0 = z2;
    }

    public final boolean equals(Object obj) {
        Object cb9Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k99)) {
            return false;
        }
        k99 k99Var = (k99) obj;
        if (!this.Z.equals(k99Var.Z)) {
            return false;
        }
        Object cb9Var2 = null;
        IBinder iBinder = this.Y;
        if (iBinder == null) {
            cb9Var = null;
        } else {
            int i = v4.h;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            cb9Var = iInterfaceQueryLocalInterface instanceof x23 ? (x23) iInterfaceQueryLocalInterface : new cb9(iBinder);
        }
        IBinder iBinder2 = k99Var.Y;
        if (iBinder2 != null) {
            int i2 = v4.h;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            cb9Var2 = iInterfaceQueryLocalInterface2 instanceof x23 ? (x23) iInterfaceQueryLocalInterface2 : new cb9(iBinder2);
        }
        return zc1.F(cb9Var, cb9Var2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iS0 = mb6.s0(parcel, 20293);
        mb6.r0(parcel, 1, 4);
        parcel.writeInt(this.X);
        IBinder iBinder = this.Y;
        if (iBinder != null) {
            int iS1 = mb6.s0(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            mb6.t0(parcel, iS1);
        }
        mb6.m0(parcel, 3, this.Z, i);
        mb6.r0(parcel, 4, 4);
        parcel.writeInt(this.f0 ? 1 : 0);
        mb6.r0(parcel, 5, 4);
        parcel.writeInt(this.g0 ? 1 : 0);
        mb6.t0(parcel, iS0);
    }
}
