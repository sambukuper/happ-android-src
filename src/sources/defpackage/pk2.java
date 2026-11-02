package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pk2 implements Parcelable {
    public static final Parcelable.Creator<pk2> CREATOR = new ud7((byte) 3);
    public final Bundle X;

    public pk2(Parcel parcel, ClassLoader classLoader) {
        Bundle bundle = parcel.readBundle();
        this.X = bundle;
        if (classLoader == null || bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.X);
    }

    public pk2(Bundle bundle) {
        this.X = bundle;
    }
}
