package defpackage;

import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mh5 implements Parcelable {
    public static final Parcelable.Creator<mh5> CREATOR = new dh5((byte) 9);
    public zv7 X;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zv7 zv7Var = this.X;
        Network network = Build.VERSION.SDK_INT >= 28 ? (Network) zv7Var.Z : null;
        int i2 = 0;
        int i3 = network != null ? 1 : 0;
        parcel.writeInt(i3);
        if (i3 != 0) {
            parcel.writeParcelable(network, i);
        }
        List list = (List) zv7Var.Y;
        List<String> list2 = (List) zv7Var.X;
        int i4 = (list == null || list.isEmpty()) ? 0 : 1;
        parcel.writeInt(i4);
        if (i4 != 0) {
            int size = list.size();
            Uri[] uriArr = new Uri[size];
            for (int i5 = 0; i5 < size; i5++) {
                uriArr[i5] = (Uri) list.get(i5);
            }
            parcel.writeParcelableArray(uriArr, i);
        }
        if (list2 != null && !list2.isEmpty()) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        if (i2 != 0) {
            parcel.writeStringList(list2);
        }
    }
}
