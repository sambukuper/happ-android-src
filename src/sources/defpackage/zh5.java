package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zh5 implements Parcelable {
    public static final Parcelable.Creator<zh5> CREATOR = new dh5((byte) 20);
    public final ArrayList X;

    public zh5(Parcel parcel) {
        Parcelable[] parcelableArray = parcel.readParcelableArray(zh5.class.getClassLoader());
        this.X = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            this.X.add(((yh5) parcelable).X);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList = this.X;
        yh5[] yh5VarArr = new yh5[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            yh5VarArr[i2] = new yh5((g49) arrayList.get(i2));
        }
        parcel.writeParcelableArray(yh5VarArr, i);
    }
}
