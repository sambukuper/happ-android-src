package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.lg7;
import defpackage.mb6;
import defpackage.v2;
import defpackage.w45;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class Scope extends v2 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new lg7((byte) 24);
    public final int X;
    public final String Y;

    public Scope(int i, String str) {
        w45.r(str, "scopeUri must not be null or empty");
        this.X = i;
        this.Y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.Y.equals(((Scope) obj).Y);
    }

    public final int hashCode() {
        return this.Y.hashCode();
    }

    public final String toString() {
        return this.Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iS0 = mb6.s0(parcel, 20293);
        mb6.r0(parcel, 1, 4);
        parcel.writeInt(this.X);
        mb6.n0(parcel, 2, this.Y);
        mb6.t0(parcel, iS0);
    }
}
