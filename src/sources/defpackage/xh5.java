package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xh5 implements Parcelable {
    public static final Parcelable.Creator<xh5> CREATOR = new dh5((byte) 18);
    public final yr6 X;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public xh5(Parcel parcel) {
        ?? arrayList = Collections.EMPTY_LIST;
        int i = parcel.readInt();
        if (i > 0) {
            arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(UUID.fromString(parcel.readString()));
            }
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
        ?? arrayList2 = Collections.EMPTY_LIST;
        int i3 = parcel.readInt();
        if (i3 > 0) {
            arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList2.add(a28.m(parcel.readInt()));
            }
        }
        arrayList.getClass();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        bw0.d0(arrayList3, arrayList);
        arrayListCreateStringArrayList.getClass();
        bw0.d0(arrayList4, arrayListCreateStringArrayList);
        arrayListCreateStringArrayList2.getClass();
        bw0.d0(arrayList5, arrayListCreateStringArrayList2);
        arrayList2.getClass();
        bw0.d0(arrayList6, arrayList2);
        if (arrayList3.isEmpty() && arrayList4.isEmpty() && arrayList5.isEmpty() && arrayList6.isEmpty()) {
            bt.q("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            throw null;
        }
        this.X = new yr6(arrayList3, arrayList4, arrayList5, arrayList6, (byte) 16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yr6 yr6Var = this.X;
        ArrayList arrayList = (ArrayList) yr6Var.Y;
        parcel.writeInt(arrayList.size());
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeString(((UUID) it.next()).toString());
            }
        }
        parcel.writeStringList((ArrayList) yr6Var.Z);
        parcel.writeStringList((ArrayList) yr6Var.f0);
        ArrayList arrayList2 = (ArrayList) yr6Var.g0;
        parcel.writeInt(arrayList2.size());
        if (arrayList2.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(a28.u((u39) it2.next()));
        }
    }
}
