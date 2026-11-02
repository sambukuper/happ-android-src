package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uh5 implements Parcelable {
    public th5 X;
    public static final g62[] Y = g62.values();
    public static final Parcelable.Creator<uh5> CREATOR = new dh5((byte) 15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        th5 th5Var = this.X;
        String str = th5Var.a;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        parcel.writeInt(!zIsEmpty ? 1 : 0);
        if (!zIsEmpty) {
            parcel.writeString(str);
        }
        parcel.writeInt(th5Var.b.ordinal());
        List list = th5Var.c;
        parcel.writeInt(list.size());
        if (!list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                parcel.writeParcelable(new yh5((g49) list.get(i2)), i);
            }
        }
        List list2 = th5Var.d;
        int i3 = (list2 == null || list2.isEmpty()) ? 0 : 1;
        parcel.writeInt(i3);
        if (i3 != 0) {
            parcel.writeInt(list2.size());
            for (int i4 = 0; i4 < list2.size(); i4++) {
                th5 th5Var2 = (th5) list2.get(i4);
                uh5 uh5Var = new uh5();
                uh5Var.X = th5Var2;
                parcel.writeParcelable(uh5Var, i);
            }
        }
    }
}
