package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jw1 extends b0 {
    public static final Parcelable.Creator<jw1> CREATOR = new qh5((byte) 3);
    public int Z;
    public int f0;
    public int g0;
    public int h0;
    public int i0;

    public jw1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.Z = 0;
        this.Z = parcel.readInt();
        this.f0 = parcel.readInt();
        this.g0 = parcel.readInt();
        this.h0 = parcel.readInt();
        this.i0 = parcel.readInt();
    }

    @Override // defpackage.b0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.f0);
        parcel.writeInt(this.g0);
        parcel.writeInt(this.h0);
        parcel.writeInt(this.i0);
    }
}
