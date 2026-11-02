package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pb8 extends b0 {
    public static final Parcelable.Creator<pb8> CREATOR = new ud7((byte) 6);
    public int Z;
    public boolean f0;

    public pb8(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.Z = parcel.readInt();
        this.f0 = parcel.readInt() != 0;
    }

    @Override // defpackage.b0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.f0 ? 1 : 0);
    }
}
