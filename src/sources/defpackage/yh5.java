package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yh5 implements Parcelable {
    public static final Parcelable.Creator<yh5> CREATOR = new dh5((byte) 19);
    public final g49 X;

    /* JADX WARN: Code duplicated, block: B:6:0x0089  */
    public yh5(Parcel parcel) {
        u91 u91VarA;
        String string = parcel.readString();
        HashSet hashSet = new HashSet(parcel.createStringArrayList());
        String string2 = parcel.readString();
        string.getClass();
        string2.getClass();
        l49 l49Var = new l49(string, (u39) null, string2, (String) null, (u91) null, (u91) null, 0L, 0L, 0L, (p31) null, 0, (z00) null, 0L, 0L, 0L, 0L, false, (yd5) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        l49Var.d = parcel.readString();
        l49Var.b = a28.m(parcel.readInt());
        byte[] bArrCreateByteArray = parcel.createByteArray();
        if (bArrCreateByteArray != null) {
            u91 u91Var = u91.b;
            u91VarA = wl7.A(bArrCreateByteArray);
            u91VarA = u91VarA == null ? u91.b : u91VarA;
        }
        u91VarA.getClass();
        l49Var.e = u91VarA;
        byte[] bArrCreateByteArray2 = parcel.createByteArray();
        u91 u91VarA2 = (bArrCreateByteArray2 == null || (u91VarA2 = wl7.A(bArrCreateByteArray2)) == null) ? u91.b : u91VarA2;
        u91VarA2.getClass();
        l49Var.f = u91VarA2;
        l49Var.g = parcel.readLong();
        l49Var.h = parcel.readLong();
        l49Var.i = parcel.readLong();
        l49Var.k = parcel.readInt();
        l49Var.j = ((eh5) parcel.readParcelable(yh5.class.getClassLoader())).X;
        l49Var.l = a28.j(parcel.readInt());
        l49Var.m = parcel.readLong();
        l49Var.o = parcel.readLong();
        l49Var.p = parcel.readLong();
        l49Var.q = parcel.readInt() == 1;
        l49Var.r = a28.l(parcel.readInt());
        l49Var.x = parcel.readString();
        this.X = new h49(UUID.fromString(string), l49Var, hashSet);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        g49 g49Var = this.X;
        String string = g49Var.a.toString();
        string.getClass();
        parcel.writeString(string);
        parcel.writeStringList(new ArrayList(g49Var.c));
        l49 l49Var = g49Var.b;
        parcel.writeString(l49Var.c);
        parcel.writeString(l49Var.d);
        parcel.writeInt(a28.u(l49Var.b));
        u91 u91Var = l49Var.e;
        u91Var.getClass();
        u91 u91Var2 = u91.b;
        parcel.writeByteArray(wl7.c0(u91Var));
        u91 u91Var3 = l49Var.f;
        u91Var3.getClass();
        parcel.writeByteArray(wl7.c0(u91Var3));
        parcel.writeLong(l49Var.g);
        parcel.writeLong(l49Var.h);
        parcel.writeLong(l49Var.i);
        parcel.writeInt(l49Var.k);
        parcel.writeParcelable(new eh5(l49Var.j), i);
        parcel.writeInt(a28.a(l49Var.l));
        parcel.writeLong(l49Var.m);
        parcel.writeLong(l49Var.o);
        parcel.writeLong(l49Var.p);
        parcel.writeInt(l49Var.q ? 1 : 0);
        parcel.writeInt(a28.r(l49Var.r));
        parcel.writeString(l49Var.x);
    }

    public yh5(g49 g49Var) {
        this.X = g49Var;
    }
}
