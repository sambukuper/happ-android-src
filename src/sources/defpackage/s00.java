package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s00 implements Parcelable {
    public static final Parcelable.Creator<s00> CREATOR = new l99((byte) 4);
    public final int[] X;
    public final ArrayList Y;
    public final int[] Z;
    public final int[] f0;
    public final int g0;
    public final String h0;
    public final int i0;
    public final int j0;
    public final CharSequence k0;
    public final int l0;
    public final CharSequence m0;
    public final ArrayList n0;
    public final ArrayList o0;
    public final boolean p0;

    public s00(r00 r00Var) {
        int size = r00Var.a.size();
        this.X = new int[size * 6];
        if (!r00Var.g) {
            bt.i("Not on back stack");
            throw null;
        }
        this.Y = new ArrayList(size);
        this.Z = new int[size];
        this.f0 = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            cm2 cm2Var = (cm2) r00Var.a.get(i2);
            int i3 = i + 1;
            this.X[i] = cm2Var.a;
            ArrayList arrayList = this.Y;
            qk2 qk2Var = cm2Var.b;
            arrayList.add(qk2Var != null ? qk2Var.g0 : null);
            int[] iArr = this.X;
            iArr[i3] = cm2Var.c ? 1 : 0;
            iArr[i + 2] = cm2Var.d;
            iArr[i + 3] = cm2Var.e;
            int i4 = i + 5;
            iArr[i + 4] = cm2Var.f;
            i += 6;
            iArr[i4] = cm2Var.g;
            this.Z[i2] = cm2Var.h.ordinal();
            this.f0[i2] = cm2Var.i.ordinal();
        }
        this.g0 = r00Var.f;
        this.h0 = r00Var.h;
        this.i0 = r00Var.s;
        this.j0 = r00Var.i;
        this.k0 = r00Var.j;
        this.l0 = r00Var.k;
        this.m0 = r00Var.l;
        this.n0 = r00Var.m;
        this.o0 = r00Var.n;
        this.p0 = r00Var.o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.X);
        parcel.writeStringList(this.Y);
        parcel.writeIntArray(this.Z);
        parcel.writeIntArray(this.f0);
        parcel.writeInt(this.g0);
        parcel.writeString(this.h0);
        parcel.writeInt(this.i0);
        parcel.writeInt(this.j0);
        TextUtils.writeToParcel(this.k0, parcel, 0);
        parcel.writeInt(this.l0);
        TextUtils.writeToParcel(this.m0, parcel, 0);
        parcel.writeStringList(this.n0);
        parcel.writeStringList(this.o0);
        parcel.writeInt(this.p0 ? 1 : 0);
    }

    public s00(Parcel parcel) {
        this.X = parcel.createIntArray();
        this.Y = parcel.createStringArrayList();
        this.Z = parcel.createIntArray();
        this.f0 = parcel.createIntArray();
        this.g0 = parcel.readInt();
        this.h0 = parcel.readString();
        this.i0 = parcel.readInt();
        this.j0 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.k0 = (CharSequence) creator.createFromParcel(parcel);
        this.l0 = parcel.readInt();
        this.m0 = (CharSequence) creator.createFromParcel(parcel);
        this.n0 = parcel.createStringArrayList();
        this.o0 = parcel.createStringArrayList();
        this.p0 = parcel.readInt() != 0;
    }
}
