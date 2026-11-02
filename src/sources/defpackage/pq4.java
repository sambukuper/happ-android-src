package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pq4 extends b0 {
    public static final Parcelable.Creator<pq4> CREATOR = new qh5((byte) 4);
    public boolean Z;

    public pq4(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            pq4.class.getClassLoader();
        }
        this.Z = parcel.readInt() == 1;
    }

    @Override // defpackage.b0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.Z ? 1 : 0);
    }
}
