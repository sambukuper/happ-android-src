package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wh5 implements Parcelable {
    public static final Parcelable.Creator<wh5> CREATOR = new dh5((byte) 17);
    public final List X;

    public wh5(Parcel parcel) {
        Parcelable[] parcelableArray = parcel.readParcelableArray(wh5.class.getClassLoader());
        this.X = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            this.X.add(((vh5) parcelable).X);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.X;
        vh5[] vh5VarArr = new vh5[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            vh5VarArr[i2] = new vh5((v39) list.get(i2));
        }
        parcel.writeParcelableArray(vh5VarArr, i);
    }

    public wh5(List list) {
        this.X = list;
    }
}
