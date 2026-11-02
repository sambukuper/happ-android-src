package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w89 extends v2 {
    public static final Parcelable.Creator<w89> CREATOR = new lg7((byte) 13);
    public final List X;
    public final String Y;

    public w89(String str, ArrayList arrayList) {
        this.X = arrayList;
        this.Y = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iS0 = mb6.s0(parcel, 20293);
        List<String> list = this.X;
        if (list != null) {
            int iS1 = mb6.s0(parcel, 1);
            parcel.writeStringList(list);
            mb6.t0(parcel, iS1);
        }
        mb6.n0(parcel, 2, this.Y);
        mb6.t0(parcel, iS0);
    }
}
