package defpackage;

import android.net.NetworkRequest;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vh5 implements Parcelable {
    public final v39 X;
    public static final String[] Y = new String[0];
    public static final Parcelable.Creator<vh5> CREATOR = new dh5((byte) 16);

    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    public vh5(Parcel parcel) {
        u91 u91VarA;
        u91 u91VarA2;
        UUID uuidFromString = UUID.fromString(parcel.readString());
        u39 u39VarM = a28.m(parcel.readInt());
        byte[] bArrCreateByteArray = parcel.createByteArray();
        if (bArrCreateByteArray != null) {
            u91 u91Var = u91.b;
            u91VarA = wl7.A(bArrCreateByteArray);
            u91VarA = u91VarA == null ? u91.b : u91VarA;
        }
        u91 u91Var2 = u91VarA;
        u91Var2.getClass();
        HashSet hashSet = new HashSet(Arrays.asList(parcel.createStringArray()));
        byte[] bArrCreateByteArray2 = parcel.createByteArray();
        u91 u91Var3 = (bArrCreateByteArray2 == null || (u91VarA2 = wl7.A(bArrCreateByteArray2)) == null) ? u91.b : u91VarA2;
        u91Var3.getClass();
        int i = parcel.readInt();
        int i2 = parcel.readInt();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b45 b45VarK = a28.k(parcel.readInt());
        u35 u35Var = new u35(null);
        boolean z = parcel.readInt() == 1;
        boolean z2 = parcel.readInt() == 1;
        boolean z3 = parcel.readInt() == 1;
        boolean z4 = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            for (o31 o31Var : a28.b(parcel.createByteArray())) {
                linkedHashSet.add(new o31(o31Var.b, o31Var.a));
            }
        }
        long j = parcel.readLong();
        TimeUnit.MILLISECONDS.getClass();
        long j2 = parcel.readLong();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28 && parcel.readInt() == 1) {
            NetworkRequest networkRequestI = en.i(parcel.createIntArray(), parcel.createIntArray());
            if (i3 >= 28) {
                if (i3 >= 31 && b4.h(networkRequestI) != null) {
                    bt.q("NetworkRequests with NetworkSpecifiers set aren't supported.");
                    throw null;
                }
                u35Var = new u35(networkRequestI);
            }
            b45VarK = b45.X;
        }
        this.X = new v39(uuidFromString, u39VarM, hashSet, u91Var2, u91Var3, i, i2, new p31(u35Var, b45VarK, z2, z4, z, z3, j2, j, wv0.c1(linkedHashSet)), parcel.readLong(), parcel.readInt() == 1 ? new t39(parcel.readLong(), parcel.readLong()) : null, parcel.readLong(), i3 >= 31 ? parcel.readInt() : -256, parcel.readString());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        v39 v39Var = this.X;
        parcel.writeString(v39Var.a.toString());
        parcel.writeInt(a28.u(v39Var.b));
        u91 u91Var = v39Var.d;
        u91Var.getClass();
        u91 u91Var2 = u91.b;
        parcel.writeByteArray(wl7.c0(u91Var));
        parcel.writeStringArray((String[]) new ArrayList(v39Var.c).toArray(Y));
        u91 u91Var3 = v39Var.e;
        u91Var3.getClass();
        parcel.writeByteArray(wl7.c0(u91Var3));
        parcel.writeInt(v39Var.f);
        parcel.writeInt(v39Var.g);
        new eh5(v39Var.h).writeToParcel(parcel, i);
        parcel.writeLong(v39Var.i);
        t39 t39Var = v39Var.j;
        int i2 = t39Var != null ? 1 : 0;
        parcel.writeInt(i2);
        if (i2 != 0) {
            parcel.writeLong(t39Var.a);
            parcel.writeLong(t39Var.b);
        }
        parcel.writeLong(v39Var.k);
        if (Build.VERSION.SDK_INT >= 31) {
            parcel.writeInt(v39Var.l);
        }
        parcel.writeString(v39Var.m);
    }

    public vh5(v39 v39Var) {
        this.X = v39Var;
    }
}
